package com.rabbit.controller;

import com.rabbit.service.MessagingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RabbitTestController {

    private final MessagingService messagingService;

    @GetMapping("/message")
    public void sentMessageToRabbit(@RequestParam("text") String text){
        messagingService.sendToMail(text);
    }
}
