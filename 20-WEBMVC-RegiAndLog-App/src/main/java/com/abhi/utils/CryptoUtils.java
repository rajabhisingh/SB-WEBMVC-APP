package com.abhi.utils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class CryptoUtils {

    private static final String ALGO = "AES"; // Default uses ECB PKCS5Padding
    private static SecretKeySpec keySpec;

    static {
        try {
            // This part should be replaced with a more secure key management approach
            KeyGenerator keyGen = KeyGenerator.getInstance(ALGO);
            keyGen.init(128);
            SecretKey secretKey = keyGen.generateKey();
            byte[] key = secretKey.getEncoded();
            keySpec = new SecretKeySpec(key, ALGO);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGO);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        byte[] encVal = cipher.doFinal(data.getBytes());
        return java.util.Base64.getEncoder().encodeToString(encVal);
    }

    public static String decrypt(String encryptedData) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGO);
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        byte[] decodedValue = java.util.Base64.getDecoder().decode(encryptedData);
        byte[] decValue = cipher.doFinal(decodedValue);
        return new String(decValue);
    }
}
