package io.pivotal.helloui.controller;

import io.pivotal.helloui.domain.HelloResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloUiController {

    @Autowired
    SayHelloCommand sayHelloCommand;

    @RequestMapping("/hello")
    public HelloResponse sayHello(@RequestParam(value="id", defaultValue="0") Long id,
    								@RequestParam(value="name", defaultValue="World") String toWho) {

        String result = sayHelloCommand.sayHello(toWho);
    	return new HelloResponse(id, result);
    }
}
