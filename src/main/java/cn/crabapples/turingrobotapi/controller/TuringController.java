package cn.crabapples.turingrobotapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/truing")
public class TuringController {
    @GetMapping("/get/text")
    public String getText() {
        return "demo";
    }
}
