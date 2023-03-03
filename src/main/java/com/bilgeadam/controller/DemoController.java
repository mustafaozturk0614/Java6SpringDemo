package com.bilgeadam.controller;
/*
    1-end point yazacaðýz bir metot yazalým bu metot bize string bir deðer donsun
    bizde bunu browserda goruntuleyelim uygulamamýz 9092 de ayaða kalksýn
    2-isim listesi donen bir metot yazlým isim listesini metot içersinde oluþturalým
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/getname")
    public String getName(){
        return "<style> .name{color:red;} </style>"+
        "<div class='name'>Mustafa </div> ";
    }

    @GetMapping("/getname2")
    public String getName2(String name){
        return name;
    }
    @GetMapping("/getlist")
    public List<String> getList(){
        List<String> isimler=List.of("Mustafa","Mert","Hilal");
        return isimler;
    }

    @GetMapping("/getlist2")
    public String [] getList(String [] list){
        return list;
    }

}
