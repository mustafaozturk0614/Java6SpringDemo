package com.bilgeadam.controller;
/*
    1-end point yazaca��z bir metot yazal�m bu metot bize string bir de�er donsun
    bizde bunu browserda goruntuleyelim uygulamam�z 9092 de aya�a kalks�n
    2-isim listesi donen bir metot yazl�m isim listesini metot i�ersinde olu�tural�m
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
