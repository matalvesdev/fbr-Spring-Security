package tech.buildrun.springsecuritydemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @CrossOrigin(
            origins = "http://localhost:5500",
            methods = RequestMethod.GET
    )
    @GetMapping("/api/message")
    public ResponseEntity<String> apiMessage(){
        return ResponseEntity.ok("It works");
    }

    @GetMapping("/api/admin")
    public ResponseEntity<String> admin() {
        return ResponseEntity.ok("Top secret system!");
    }

    @GetMapping("/api/secure")
    public ResponseEntity<String> secure() {
        return ResponseEntity.ok("Secure endpoint!");
    }
}
