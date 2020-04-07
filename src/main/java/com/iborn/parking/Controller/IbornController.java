package com.iborn.parking.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IbornController {
    @RequestMapping("/")
    public ModelAndView toNav(ModelAndView modelAndView){
        modelAndView.setViewName("nav");
        return modelAndView;
    }

    @RequestMapping("/index")
    public ModelAndView toIndex(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/chooseType")
    public ModelAndView toChooseType(ModelAndView modelAndView){
        modelAndView.setViewName("chooseType");
        return modelAndView;
    }

    @RequestMapping("/feeInfo")
    public ModelAndView toFeeInfo(ModelAndView modelAndView){
        modelAndView.setViewName("feeInfo");
        return modelAndView;
    }

    @RequestMapping("/payResult")
    public ModelAndView toPayResult(ModelAndView modelAndView){
        modelAndView.setViewName("payResult");
        return modelAndView;
    }


}
