package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class controller {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("index")
    @ResponseBody
    public Object index(){
        Object object = restTemplate.getForObject("http://localhost:7900/query/100",Object.class);
        return  object;
    }
}
