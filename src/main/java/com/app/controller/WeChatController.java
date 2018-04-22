package com.app.controller;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class WeChatController {

    @Autowired
    private WxMpService wxMpService;


    @RequestMapping("/authorize")
    public String authorize(String returnUrl) {
        //配置
        //调用方法
        String url = wxMpService.oauth2buildAuthorizationUrl("/userInfo", WxConsts.OAuth2Scope.SNSAPI_BASE, "");
        return "/userInfo";
    }

    @RequestMapping("/userInfo")
    public void getUserInfo(String code) {

        WxMpOAuth2AccessToken wxMpOAuth2AccessToken = new WxMpOAuth2AccessToken();
        try {
            wxMpOAuth2AccessToken = wxMpService.oauth2getAccessToken(code);
        } catch (WxErrorException e) {
            e.printStackTrace();
            //抛出异常
        }
        String openId = wxMpOAuth2AccessToken.getOpenId();
        String accessToken = wxMpOAuth2AccessToken.getAccessToken();

    }

}
