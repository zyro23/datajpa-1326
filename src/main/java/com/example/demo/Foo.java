package com.example.demo;

import javax.persistence.*;
import java.util.Iterator;

@Entity
public class Foo implements Iterable<Bar> {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	private String name;

	@Override
	public Iterator<Bar> iterator() {
		return null;
	}

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

}
