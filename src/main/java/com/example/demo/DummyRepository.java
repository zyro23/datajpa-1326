package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DummyRepository extends JpaRepository<Foo, Long> {

	Foo findByName(String name);

}
