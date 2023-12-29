package com.drink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class EntryController {

	// Entryにリクエストが来たときに呼び出される
    @RequestMapping("/")
    public String index() {
        return "inedx";
    }
}