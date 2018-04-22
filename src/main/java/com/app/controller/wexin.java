package com.app.controller;

import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class wexin {

    @Bean
    public WxMpService WxMpService(){
        WxMpService wxMpService=new WxMpServiceImpl();

        WxMpConfigStorage wxMpConfigStorage = WxMpConfigStorage();

        wxMpService.setWxMpConfigStorage(wxMpConfigStorage);

        return wxMpService;
    }


    @Bean
    public WxMpConfigStorage WxMpConfigStorage(){
        WxMpInMemoryConfigStorage wxMpConfigStorage = new WxMpInMemoryConfigStorage();
        wxMpConfigStorage.setAppId("");
        wxMpConfigStorage.setSecret("");
        return wxMpConfigStorage;
    }

}
