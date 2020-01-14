package com.team.wxplatform.controller;

import com.team.wxplatform.common.WechatConst;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.util.Arrays;

/**
 * @author tsy
 * @time 2020-1-14 17:22
 */
public class WxCheckController {

    private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

    @RequestMapping(value = "/getConn")
    public void getConn(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("====================COMMING===================");
        if(request.getMethod().toLowerCase().equals("post")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/message/getmessage");
            dispatcher .forward(request, response);
            return ;
        }
        PrintWriter out = response.getWriter();
        // 微信加密签名
        String signature = request.getParameter("signature");
        // 时间戳
        String timestamp = request.getParameter("timestamp");
        // 随机数
        String nonce = request.getParameter("nonce");
        // 随机字符串
        String echostr = request.getParameter("echostr");
        String[] str = {WechatConst.SERVER_TOKEN, timestamp, nonce };
        Arrays.sort(str);
        String bigStr = str[0] + str[1] + str[2];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bigStr.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuffer restr = new StringBuffer(digest.length);
            for (int j = 0; j < digest.length; j++) {
                restr.append(HEX_DIGITS[(digest[j] >> 4) & 0x0f]);
                restr.append(HEX_DIGITS[digest[j] & 0x0f]);
            }
            if (signature.equals(restr.toString())){
                out.write(echostr);
                System.out.println("===================="+echostr+"===================");
            }else {
                out.write(" fail to conn!");
                System.out.println("====================fail to conn!===================");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
