//List.java
package com.supera.desafio_tecnico.model;

public class List {
 private Long id;
 private String name;
 private List items;
 
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List getItems() {
	return items;
}
public void setItems(List items) {
	this.items = items;
}

}