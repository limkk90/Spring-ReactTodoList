package com.example.springboottodo.controller;

import com.example.springboottodo.dto.ResponseDTO;
import com.example.springboottodo.dto.TestRequestBodyDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping
    public String testController(){
        return "Hello World!";
    }

    @GetMapping("/testGetMapping")
    public String testControllerWithPath(){
        return "Hello World! testGetMapping";
    }

    @GetMapping("/{id}")
    public String testControllerWithPathVariables(@PathVariable(required = false) int id){
        //int id에 /test/123에서 123이 들어감
        return "Hello World! Id" + id;
    }

    @GetMapping("/testRequestParam")
    public String testControllerRequestParam(@RequestParam(required = false) int id){
        return "Hello WOrld! ID" + id;
    }

    @GetMapping("/testReuqestBody")
    public String testControllerRequestBody(@RequestBody TestRequestBodyDTO testRequestBodyDTO){
        return "Hello World! ID" + testRequestBodyDTO.getId() + "Message:" + testRequestBodyDTO.getMessage();
    }

    @GetMapping("/testResponseBody")
    public ResponseDTO<String> testControllerResponseBody(){
        List<String> list = new ArrayList<>();
        list.add("Hello");
        ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
        return response;
    }

    @GetMapping("/testResponsehead")
    public ResponseDTO<String> testControllerResponseHead(){
        List<String> list = new ArrayList<>();
        list.add("Hello Head");
        ResponseDTO<String> responsehead = ResponseDTO.<String>builder().data(list).build();
        return response;
    }
}
