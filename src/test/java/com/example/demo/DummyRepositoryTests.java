package com.example.demo;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest
@RunWith(SpringRunner.class)
public class DummyRepositoryTests {

	@Autowired
	TestEntityManager entityManager;

	@Autowired
	private DummyRepository dummyRepository;

	@Test
	public void testFind() {
		Foo foo = new Foo();
		foo.setName("foo");
		entityManager.persistAndFlush(foo);
		assertThat(dummyRepository.findByName("foo")).isNotNull();
	}

}
