package com.example.backkendrrestrready.Repo;

import com.example.backkendrrestrready.Entity.User_Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Repository
public interface MyRepo extends JpaRepository<User_Info, Integer> {
//    User_Info findByuserNem(String userNem);
    User_Info findByUserNem(String userNem);
//    List<User_Info> findByUserNem(String userNem);
//    User_Info findAllByUserNem
    User_Info findByIdeea(String ideea);

    void deleteByIdeea(String ideea);
}
