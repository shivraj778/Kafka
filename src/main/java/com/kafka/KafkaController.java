package com.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/{msg}")
    public void post(@PathVariable String msg) {
        kafkaTemplate.send("shivraj", msg);
    }

}
