package com.gpc.templateservice;

import org.springframework.stereotype.Service;
import com.gpc.templateservice.Response;


import java.util.regex.Pattern;

@Service
public class HelloService {
    public Response reverse(String message) {
        return Pattern.compile("\\s").splitAsStream(message).reduce((w1, w2) -> w2 + " " + w1).
                map(data -> new Response(data)).get();
    }
}
