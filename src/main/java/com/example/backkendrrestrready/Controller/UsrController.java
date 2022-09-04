package com.example.backkendrrestrready.Controller;

import com.example.backkendrrestrready.Entity.User_Info;
import com.example.backkendrrestrready.Service.UsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class UsrController {
    @Autowired
    private UsrService srvce;
//    UsrController(UsrService srvce){this.srvce=srvce;}

    //    ----------------------------------------------------------- post
    @PostMapping("/addOne")
    public User_Info saveUsr(@RequestBody User_Info usr) {
        return srvce.saveUsr(usr);
    }

    @PostMapping("/addMany")
    public List<User_Info> saveUsrs(@RequestBody List<User_Info> usrs) {
        return srvce.saveUsers(usrs);
    }

    //    ----------------------------------------------------------- get
//    @CrossOrigin("http://localhost:4200")
    @GetMapping("/getAll")
    public List<User_Info> getAllUsers() {
        return srvce.getAllUsers();
    }

    @GetMapping("/getById/{id}")
    public User_Info getValueById(@PathVariable int id) {
        return srvce.GetValueById(id);
    }

    @GetMapping("/getByUsrNem/{userNem}")
    public User_Info getValuByUserNem(@PathVariable String userNem) {
        return srvce.getValuByUserNem(userNem);
    }
    @GetMapping("/getByUsrEmail/{email}")
    public User_Info getValuByEmail(@PathVariable String email) {
        return srvce.findByEmail(email);
    }



    @GetMapping("/getByIdeea/{iDeea}")
    public User_Info getValByIdeea(@PathVariable String iDeea) {
        return srvce.getValByIdeea(iDeea);
    }

    //    -----------------------------------------------------------put
    @PutMapping("/Update")
    public User_Info updateUser(User_Info usr) {
        return srvce.UpdateUserInfo(usr);
    }

    //        -----------------------------------------------------------Delete
    @DeleteMapping("/deletById/{id}")
    public String deletUser(@PathVariable int id) {
        return srvce.deleteById(id);
    }

    @DeleteMapping("/deletByIdeea/{iDeea}")
    public String DeletdByIdea(@PathVariable String iDeea) {
        return srvce.deletdByIdea(iDeea);
    }
    @DeleteMapping("/deletByUserName/{userNem}")
    public String DeletdByUserName(@PathVariable String userNem) {
        return srvce.deleteByUserNem(userNem);
    }
}
