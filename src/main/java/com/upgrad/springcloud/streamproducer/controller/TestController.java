package com.upgrad.springcloud.streamproducer.controller;

import com.upgrad.springcloud.streamproducer.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

  @Autowired
  private MessageProducer _messageProducer;

  @PostMapping(value = "/sendMessage/string")
  public String publishMessageString(@RequestBody String payload) {


    _messageProducer.getSource()
        .output()
        .send(MessageBuilder.withPayload(payload)
            .setHeader("type", "string")
            .build());

    return "success";
  }
}
