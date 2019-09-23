package com.rabbit.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MessagingServiceImpl implements MessagingService {

    private final AmqpTemplate template;

    @Value("${rabbit.queue.name}")
    private String queueName;

    @Override
    public void sendToMail(String text) {
        template.convertAndSend(queueName, text);
        log.info("Emit to queue");
    }
}
