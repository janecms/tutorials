package com.hellojd.tutorial.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hellojd.tutorial.spring.model.User;

@Controller
@SessionAttributes("user")
public class LoginController {
   /*
    * Add user in model attribute
    */
   /*
   @ModelAttribute("user")
   public User setUpUserForm() {
      return new User();
   }
*/
   @GetMapping("/")
   public String index() {
      return "index";
   }

   @PostMapping("/dologin")
   public String doLogin(User user, Model model) {

      // Implement your business logic
      if (user.getEmail().equals("sunil@example.com") && user.getPassword().equals("abc@123")) {
         user.setFname("Sunil");
         user.setMname("Singh");
         user.setLname("Bora");
         user.setAge(28);
         // FIXME: 2018/8/3  model 已经有'user'了
        // model.addAttribute("user",user);
      } else {
         model.addAttribute("message", "Login failed. Try again.");
         return "index";
      }
      return "success";
   }
}
