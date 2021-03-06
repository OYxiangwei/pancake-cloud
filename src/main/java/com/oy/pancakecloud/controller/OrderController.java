package com.oy.pancakecloud.controller;

import com.oy.pancakecloud.entity.Orders;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("orders")
public class OrderController {
    @GetMapping("current")
    public String showOrders(Model model){
        model.addAttribute("orders",new Orders());
        return "orderForm";
    }
    @PostMapping
    public String processOrder(@Valid Orders order,Errors errors){
        if(errors.hasErrors()){
            return "orderForm";
        }
        //log.info("order"+order);
        return "redirect:/";
    }
}
