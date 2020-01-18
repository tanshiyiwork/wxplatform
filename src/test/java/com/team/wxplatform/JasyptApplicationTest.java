package com.team.wxplatform;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author tsy
 * @package com.team.wxplatform
 * @Data Create in:2020/1/18 18:23
 * @modified:
 */
public class JasyptApplicationTest extends WxplatformApplicationTests {

    @Autowired
    private StringEncryptor stringEncryptor;

    @Test
    public void contextLoads() {
        //加密方法
        System.out.println(stringEncryptor.encrypt("jdbc:mysql://49.235.45.174:3306/Tsystemdb?useUnicode=true&characterEncoding=utf-8&useSSL=false"));
        System.out.println(stringEncryptor.encrypt("Tadmin"));
        System.out.println(stringEncryptor.encrypt("T_abc_123"));
        System.out.println(stringEncryptor.encrypt("49.235.45.174"));
        System.out.println(stringEncryptor.encrypt("Tmanage"));
        //解密方法
        /*System.out.println(stringEncryptor.decrypt("RMkvJXb6Spn9exVuSeMtRg=="));
        System.out.println(stringEncryptor.decrypt("YZx4lmwD6imkua3gNkQQ7g=="));*/
    }
}
