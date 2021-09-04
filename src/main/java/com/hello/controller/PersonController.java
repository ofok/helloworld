package com.hello.controller;

import com.hello.entity.PersonEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {


    @GetMapping("/getPersonInfo")
    public PersonEntity getPersonInfo() {

        PersonEntity personEntity = new PersonEntity();
        personEntity.setUserName("九歌笑而不语");
        personEntity.setIdcard("182821222222229129841");
        personEntity.setAddress("江西省南昌市翻阳湖畔");
        personEntity.setMobilePhone("18329494812");

        return personEntity;
    }
}
