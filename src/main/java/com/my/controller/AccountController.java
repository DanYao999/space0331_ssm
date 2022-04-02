package com.my.controller;

import com.my.domain.Account;
import com.my.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author daniel
 * @create 2022-03-31 11:09
 */

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    //保存
    @RequestMapping(value = "/save", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String save(Account account){
        System.out.println("hello");
        System.out.println("hot fix");
        System.out.println("hot fix 11 commit");
        accountService.save(account);
        return "保存成功";
    }
    //查询
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Account> accountList = accountService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("taccountLis",accountList);
        modelAndView.setViewName("accountList");
        return modelAndView;
    }
}
