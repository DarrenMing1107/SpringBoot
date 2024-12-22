package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // 賦予DemoController 處理來自客戶端URL，依照這裡設定的Path去處理對應URL的運算
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Darren!";
    }

    @GetMapping("/model")
    public ResponseEntity<DemoModel> getModel(
            @RequestParam int id,
            @RequestParam(required = false, defaultValue = "Test") String name) {
        DemoModel model = new DemoModel(id, name);
        return new ResponseEntity<>(model, HttpStatus.OK);
    }
}
