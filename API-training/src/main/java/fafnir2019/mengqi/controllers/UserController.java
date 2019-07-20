package fafnir2019.mengqi.controllers;

import fafnir2019.mengqi.models.User;
import fafnir2019.mengqi.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserRepo ur;

    @RequestMapping("/api/hello/string")
    @ResponseBody
    public String sayHello() {
        return "Hello Mengqi";
    }

    @PostMapping("/api/register")
    public User createUser (@RequestBody User user) {
        return ur.save(user);
    }

}
