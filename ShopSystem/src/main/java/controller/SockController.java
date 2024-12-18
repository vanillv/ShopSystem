package controller;

import model.SockDto;
import model.enums.Operators;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;
import service.SockService;

@Controller
public class SockController {
    @Autowired
    private SockService sockService;
    private Logger log = LoggerFactory.getLogger(SockController.class);

    public ResponseEntity<?> sockIncrement(SockDto sockDto) {
        return ResponseEntity.ok("");
    }
    public ResponseEntity<?> sockDecrement(SockDto sockDto) {
        return ResponseEntity.ok("");
    }
    public ResponseEntity<?> sockQuantity(String color, Long cottonPercentage, Operators operator) {
        return ResponseEntity.ok("");
    }
    public ResponseEntity<?> changeSockParameter(SockDto sockDto){
        return ResponseEntity.ok("");
    }
    public ResponseEntity<?> uploadSockBatch(MultipartFile file) {
        return ResponseEntity.ok("");
    }
}
