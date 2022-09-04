package com.example.backkendrrestrready.Service;

import com.example.backkendrrestrready.Entity.User_Info;
import com.example.backkendrrestrready.Repo.MyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsrService {
    @Autowired
    private MyRepo rpo;
//---------------------------------------------  Post

    public User_Info saveUsr(User_Info usr) {
        return rpo.save(usr);
    }

    public List<User_Info> saveUsers(List<User_Info> usrs) {
        return rpo.saveAll(usrs);
    }

    //--------------------------------------------- get

    public List<User_Info> getAllUsers() {  //getAll
        return rpo.findAll();
    }

    public User_Info GetValueById(int id) {
        return rpo.findById(id).orElse(null);
    }

    public User_Info getValuByUserNem(String userNem) {
        return rpo.findByUserNem(userNem);
    }
    public User_Info findByEmail(String email){
        return rpo.findByEmail(email);
    }



    public User_Info getValByIdeea(String ideea) {
        return rpo.findByIdeea(ideea);
    }

    //--------------------------------------------- Delete
    public String deleteById(int id) {
        rpo.deleteById(id);
        return "Deleted User with Id  " + id;
    }

    public String deletdByIdea(String ideea) {
        rpo.deleteByIdeea(ideea);
        return "Idea Deledted" + ideea;
    }
    public String deleteByUserNem(String userNem) {
        rpo.deleteByUserNem(userNem);
        return "Deleted By UserName" + userNem;
    }

    //--------------------------------------------- Put
    public User_Info UpdateUserInfo(User_Info usr) {
        User_Info exitingValues = rpo.findById(Math.toIntExact(usr.getId())).orElse(null);
        exitingValues.setUserNem(usr.getUserNem());
        exitingValues.setIdeea(usr.getIdeea());
        exitingValues.setPassWord(usr.getPassWord());
        return rpo.save(exitingValues);
    }

}
