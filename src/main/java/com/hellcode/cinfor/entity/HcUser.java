package com.hellcode.cinfor.entity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class HcUser {
    @Id
    private Integer userId;
    private String username;
    private String password;
}
