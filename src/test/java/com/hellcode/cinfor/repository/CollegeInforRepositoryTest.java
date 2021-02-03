package com.hellcode.cinfor.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CollegeInforRepositoryTest {
    @Autowired
    private CollegeInforRepository collegeInforRepository;

    @Test
    void findAll() {
        System.out.println(collegeInforRepository.findAll());
    }

}