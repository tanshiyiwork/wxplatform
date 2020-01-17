package com.team.wxplatform;

import com.team.wxplatform.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;
import java.util.Set;

/**
 * 测试RedisUtil
 * @author tsy
 * @time 2020-1-16 15:41
 */
@Slf4j
public class RedisUtilTest extends WxplatformApplicationTests{
    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private RedisTemplate redisTemplate;

    //（1）存入值
    @Test
    public void boundHashOpsSet() {
        redisTemplate.boundHashOps("namehash").put("country1","中国");
        redisTemplate.boundHashOps("namehash").put("country2","日本");
        redisTemplate.boundHashOps("namehash").put("country3","韩国");
    }

    //（2）提取所有的KEY
    @Test
    public void  boundHashOpsKeys(){
        Set keys = redisTemplate.boundHashOps("namehash").keys();
        System.out.println(keys);
    }
    //（3）提取所有的值
    @Test
    public void boundHashOpsValues(){
        List values = redisTemplate.boundHashOps("namehash").values();
        System.out.println(values);
    }
    //(4) 根据KEY提取值
    @Test
    public void boundHashOpsByKey(){
        Object name = redisTemplate.boundHashOps("namehash").get("country1");
        System.out.println(name);
    }
    //根据KEY移除值
    @Test
    public void boundHashOpsDelByKey(){
        redisTemplate.boundHashOps("namehash").delete("country2");
    }
}
