package org.example.jenkins;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class TestController {

    @GetMapping("/v1")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("v1");
    }
}
