package com.demodb.demondatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("path=/demodb")
public class MainController {

@Autowired
private UserRepository userRepository;

@PostMapping("path=/add")
public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
    User m = new User();
    m.setName(name);
    m.setEmail(email);

    userRepository.save(m);
    
    return "saved";
}
@GetMapping("path=/all")
public @ResponseBody Iterable<User> getUsers() {

    return userRepository.findAll();
}


}
