package me.kirar00t.messagingservice.controller;

import me.kirar00t.messagingservice.dto.MessageRequest;
import me.kirar00t.messagingservice.dto.MessageResponse;
import me.kirar00t.messagingservice.service.MessageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final MessageService messageService;
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public List<MessageResponse> getMessages() {
        return messageService.getAllMessages();
    }

    @PostMapping
    public MessageResponse createMessage(@RequestBody MessageRequest request) {
        MessageResponse response = messageService.createMessage(request);
        return response;
    }

}
