package com.supera.desafio_tecnico.service;

//ListService.java

import com.supera.desafio_tecnico.model.List;
import com.supera.desafio_tecnico.repository.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListService {

 @Autowired
 private ListRepository listRepository;

 public List createList(String name) {
     if (name == null || name.length() < 3) {
         throw new IllegalArgumentException("Nome da lista inválido.");
     }
     List list = new List();
     list.setName(name);
     return listRepository.save(list);
 }

public List getListById(Long id) {
	// TODO Auto-generated method stub
	return null;
}
}

