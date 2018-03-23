package com.zeroexception.lombok_demo;

import com.zeroexception.lombok_demo.model.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LombokDemoApplicationTests {

	@Test
	public void contextLoads() {
	}


	@Test
	public void testBuilderAnnotation() {
		Person person = Person.builder().id(1L).name("abc").build();
//		person = new Person();
		person.setId(2L);
		Assert.assertEquals(10, person.hashCode());
	}
}
