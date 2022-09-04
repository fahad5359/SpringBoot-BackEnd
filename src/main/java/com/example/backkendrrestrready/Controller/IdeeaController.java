//package com.example.backkendrrestrready.Controller;
//
//import com.example.backkendrrestrready.Entity.MakeIdeea;
//import com.example.backkendrrestrready.Service.IdeeaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//
//import java.util.List;
//
//@RestController
//@CrossOrigin("http://localhost:4200")
//public class IdeeaController {
//    @Autowired
//    private IdeeaService srvse;
//
//
//
//    @PostMapping("/makeIdeea")
//    public List<MakeIdeea> makeIdeea(@RequestBody List<MakeIdeea> ida){
//        return srvse.makeIdeea(ida);
//    }
//}
