package com.example.backkendrrestrready.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User_Infoo")
public class User_Info {
    @Id
//    @Column(name = "id", nullable = false)
    @GeneratedValue
    private int id;

    private String userNem;
    private String email;
    //    هنا لازم تزبط الرمز بالايبريري...
    private String passWord;
    private String ideea;
    private String subject;
    //نجيب الرقم من قاعدة البيانات
//    private int likes;
//    private int diLikes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
