package co.edu.uniquindio.apollosafeproyectbackend.Security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtUtil {
    public static final String SECRET = System.getProperty("apollosafe.api.secret");
    private final int ExpirationTime = 1000 * 60 * 60 * 24;
public String generateToken(String username){
    return Jwts.builder()
            .setSubject(username)
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + ExpirationTime))
            .signWith(SignatureAlgorithm.HS512, SECRET)
            .compact();
    }
    public static boolean validateToken(String token){
        try{
            Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
