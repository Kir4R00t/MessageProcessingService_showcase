package me.kirar00t.messagingservice.service;

import me.kirar00t.messagingservice.dto.MessageRequest;
import me.kirar00t.messagingservice.dto.MessageResponse;
import me.kirar00t.messagingservice.util.TimestampUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
    private long nextID = 1;
    private List<MessageResponse> messages = new ArrayList<>();

    public MessageResponse createMessage(MessageRequest rqst) {
        MessageResponse response = new MessageResponse();

        response.setId(nextID); nextID += 1;
        response.setStatus("Accepted");
        response.setTimestamp(TimestampUtil.createTimestamp());

        response.setType(rqst.getType());
        response.setAmount(rqst.getAmount());
        response.setCurrency(rqst.getCurrency().toUpperCase());
        response.setUserId(rqst.getUserId());

        messages.add(response);
        return response;
    }

    public List<MessageResponse> getAllMessages() {
        return messages;
    }
}