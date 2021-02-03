package com.hellcode.cinfor.controller;

import com.hellcode.cinfor.entity.CollegeInfor;
import com.hellcode.cinfor.repository.CollegeInforRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/college")
public class CollegeInforHandler {
    @Autowired
    private CollegeInforRepository collegeInforRepository;

    @GetMapping("/findAll")
    public List<CollegeInfor> findAll(){
        return collegeInforRepository.findAll();
    }
}
