// Item.java
package com.supera.desafio_tecnico.model;


public class Item {
    private Long id;
    private String title;
    private boolean completed;
    private boolean prioritized;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public boolean isPrioritized() {
		return prioritized;
	}
	public void setPrioritized(boolean prioritized) {
		this.prioritized = prioritized;
	}

}
