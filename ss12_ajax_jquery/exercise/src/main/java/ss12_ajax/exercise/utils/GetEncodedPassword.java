package ss12_ajax.exercise.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GetEncodedPassword {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("123"));
    }
}
