package kz.dar.academy.helloworld.comtroller;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping(value = "/hello")
    public String main(){
        System.out.println("salam salam");
        return "main/hello";
    }
}
