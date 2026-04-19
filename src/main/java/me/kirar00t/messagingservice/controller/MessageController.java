package me.kirar00t.messagingservice.controller;

import me.kirar00t.messagingservice.dto.MessageRequest;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/messages")
public class MessageController {
    @GetMapping
    public String getMessages() {
        return "msgs"; // mock
    }

    @PostMapping
    public String createMessage(@RequestBody MessageRequest request) {
        return "Received " + request.getType();
    }

}
