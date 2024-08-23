package org.example.jenkins;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class TestController {

    @GetMapping("/version")
    public ResponseEntity<String> test(){
        System.out.println("hi");
        return ResponseEntity.ok("v3");
    }
}
