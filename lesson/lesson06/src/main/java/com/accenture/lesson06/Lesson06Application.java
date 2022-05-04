package com.accenture.lesson06;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@SpringBootApplication
public class Lesson06Application {

   @Autowired
   private UserMapper userMapper;
   public static void main(String[] args) {
      System.out.println("list");
      SpringApplication.run(Lesson06Application.class, args);
   }

   @GetMapping("/list")
   public String showList() {
      System.out.println("list");
      return "list";
      
   }
   
   @ResponseBody
   @GetMapping("/search")
/* public List<Map<Object,Object>> search(){
      List<Map<Object,Object>> mapper = userMapper.get();
      return mapper;
   }*/
   public List<String> search(){
      List<String> l = new ArrayList<>();
      l.add("xiaoming");
      l.add("xiaohong");
      l.add("xiaogang");
      return l;
   }
}