package com.maimai.myspringboot;

import org.apache.tomcat.util.codec.binary.Base64;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyspringbootApplicationTests {

    @Test
    public void contextLoads() {
        // KeyGenerator keyGen = KeyGenerator.getInstance("DES");//密钥生成器
        // keyGen.init(56);//初始化密钥生成器
        // SecretKey secretKey = keyGen.generateKey();//生成密钥
        // byte[] key = secretKey.getEncoded();//密钥字节数组
        //
        // SecretKey secretKey = new SecretKeySpec(key, "DES");//恢复密钥
        // Cipher cipher = Cipher.getInstance("DES");//Cipher完成加密或解密工作类
        // cipher.init(Cipher.ENCRYPT_MODE, secretKey);//对Cipher初始化，加密模式
        // byte[] cipherByte = cipher.doFinal(data);//加密data
        //
        // SecretKey secretKey = new SecretKeySpec(key, "DES");//恢复密钥
        // Cipher cipher = Cipher.getInstance("DES");//Cipher完成加密或解密工作类
        // cipher.init(Cipher.DECRYPT_MODE, secretKey);//对Cipher初始化，解密模式
        // byte[] cipherByte = cipher.doFinal(data);//解密data

    }

    // private String ens(String data) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
    //     KeyGenerator keyGen = KeyGenerator.getInstance("DES");//密钥生成器
    //     keyGen.init(56);//初始化密钥生成器
    //     SecretKey secretKey = keyGen.generateKey();//生成密钥
    //     byte[] key = secretKey.getEncoded();//密钥字节数组
    //
    //
    //     SecretKey secretKey1 = new SecretKeySpec(key, "DES");//恢复密钥
    //     Cipher cipher = Cipher.getInstance("DES");//Cipher完成加密或解密工作类
    //     cipher.init(Cipher.ENCRYPT_MODE, secretKey1);//对Cipher初始化，加密模式
    //     byte[] cipherByte = cipher.doFinal(data);//加密data
    //     return Base64.encodeBase64String(cipherByte);
    // }


    private String miyao() throws NoSuchAlgorithmException {
        KeyGenerator keyGen = KeyGenerator.getInstance("DES");//密钥生成器
        keyGen.init(56);//初始化密钥生成器
        SecretKey secretKey = keyGen.generateKey();//生成密钥
        byte[] key = secretKey.getEncoded();//密钥字节数组
        return Base64.encodeBase64String(key);
    }

    @Test
    public void getMiyao() throws NoSuchAlgorithmException {
        System.out.println(miyao());
    }

}
