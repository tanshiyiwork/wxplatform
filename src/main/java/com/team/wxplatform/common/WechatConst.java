package com.team.wxplatform.common;

/**
 * @author tsy
 * @time 2020-1-14 16:50
 */
public class WechatConst {
    /**
     * 公众号的唯一标识[必需]
     */
    public static final String APPID = "wx6e01e7800e27af55";

    public static final String APPSECRET = "9c8a3013132e5185a0657a8ee46ad448";

    /**
     * 授权后重定向的回调链接地址， 请使用 urlEncode 对链接进行处理[必需],微信网页授权方法
     */
    public static final String REDIRECT_URI = "http://tanshiyi.imwork.net/userInfo";

    /**
     * 微信网页授权成功跳转页面
     */
    public static final String RETURN_URL = "main";

    /**
     * 返回类型，请填写code[必需]
     */
    public static final String RESPONSE_TYPE = "code";

    public static final String SERVER_TOKEN = "tanshiyi";

    /**
     * 应用授权作用域[必需]
     * snsapi_base （不弹出授权页面，直接跳转，只能获取用户openid）
     * snsapi_userinfo （弹出授权页面，可通过openid拿到昵称、性别、所在地。并且， 即使在未关注的情况下，只要用户授权，也能获取其信息 ）
     */
    public static final String SCOPE = "snsapi_userinfo";

    /**
     * 重定向后会带上state参数，开发者可以填写a-zA-Z0-9的参数值，最多128字节[非必需]
     */
    public static final String STATE = "123";

}
