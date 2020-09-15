package com.oy.pancakecloud.controller;

import com.oy.pancakecloud.pancake.Orders;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("orders")
public class OrderController {
    @GetMapping("current")
    public String showOrders(Model model){
        model.addAttribute("order",new Orders());
        return "orderForm";
    }
    @PostMapping
    public String processOrder(Order order){
        //log.info("order"+order);
        return "redirect:/";
    }
}
