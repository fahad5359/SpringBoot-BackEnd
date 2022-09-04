package com.example.backkendrrestrready.Controller;

import com.example.backkendrrestrready.Entity.MakeIdeea;
import com.example.backkendrrestrready.Repo.MyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class IdeeaService {
    @Autowired
    private IdeeaService srvce;



    @PostMapping("/makeIdeea")
    public List<MakeIdeea> makeIdeea(@RequestBody List<MakeIdeea> ida){
        return srvce.makeIdeea(ida);
    }
}
