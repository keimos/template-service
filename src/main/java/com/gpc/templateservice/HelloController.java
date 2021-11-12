package com.gpc.templateservice;

import org.springframework.beans.factory.annotation.Autowired;
import com.gpc.templateservice.Response;
import com.gpc.templateservice.HelloService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/api/{message}")
    @ResponseBody
    public ResponseEntity<Response> reverse(@PathVariable("message") String message) {
        Assert.notNull(message, "The message should not be null!");
        Response response = helloService.reverse(message);
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }
}
