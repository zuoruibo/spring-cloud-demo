package com.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.wf.captcha.ArithmeticCaptcha;
import com.wf.captcha.ChineseGifCaptcha;
import com.wf.captcha.GifCaptcha;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @GetMapping("/captcha")
    public String getCaptcha() {

        //中文类型验证吗
        //ChineseCaptcha captcha = new ChineseCaptcha();

        // 英文与数字验证码
        // SpecCaptcha captcha = new SpecCaptcha();

        //英文与数字动态验证码
        // GifCaptcha captcha = new GifCaptcha();

        //中文动态验证码
        // ChineseGifCaptcha captcha = new ChineseGifCaptcha();


        // 算术类型
        ArithmeticCaptcha captcha = new ArithmeticCaptcha();

        captcha.setLen(2);

        // 获取运输结果
        String result = captcha.text();

        log.info("===============运算结果为=========:{}", result);


        return captcha.toBase64();
    }

}
