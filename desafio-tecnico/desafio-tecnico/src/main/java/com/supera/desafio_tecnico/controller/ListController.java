package com.supera.desafio_tecnico.controller;

//ListController.java

import com.supera.desafio_tecnico.model.List;
import com.supera.desafio_tecnico.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lists")
public class ListController {

 @Autowired
 private ListService listService;

 @PostMapping
 public List createList(@RequestParam String name) {
     return listService.createList(name);
 }

 @GetMapping("/{id}")
 public List getList(@PathVariable Long id) {
     return listService.getListById(id);
 }
}

