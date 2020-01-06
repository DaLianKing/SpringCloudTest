package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {
    @RequestMapping("query/{id}")
    @ResponseBody
    public Object query(@PathVariable("id")String id){
        User user = new User();
        user.setId(Integer.parseInt(id));
        user.setName("dog");
        return  user;
    }
}
