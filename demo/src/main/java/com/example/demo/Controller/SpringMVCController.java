package com.example.demo.Controller;

import com.example.demo.Dto.SpringMVCDTO;
import com.example.demo.Service.SpringMVCService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@Controller
@RequestMapping("/springmvc")
public class SpringMVCController {
    @Autowired
    private SpringMVCService springMVCService;

    @GetMapping("sayhello")
    public String sayHello(){
        return "Chào ccc";
    }
    @GetMapping("welcome-page")
    public String Welcome(){
        return "index.html";
    }

    @GetMapping("/showlist")
    public String userlist(Model model){
        List<SpringMVCDTO> springmvcenties = springMVCService.showAllUser();
        model.addAttribute("springmvcentities",springmvcenties);
        return springmvcenties.toString();
    }

    @GetMapping("/getall")
    public List<SpringMVCDTO> getUser() {
        return springMVCService.showAllUser();
    }
}
