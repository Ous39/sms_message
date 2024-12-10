package com.example.sms_message.controller;

import com.example.sms_message.model.Message;
import com.example.sms_message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/send")
    public String sendMessageForm(Model model) {
        model.addAttribute("message", new Message());
        return "sendMessage";
    }

    @PostMapping("/send")
    public String sendMessage(@ModelAttribute Message message, Model model) {
        messageService.save(message);
        model.addAttribute("success", "Message sent successfully!");
        return "sendMessage";
    }
}
