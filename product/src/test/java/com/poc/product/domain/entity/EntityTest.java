package com.poc.product.domain.entity;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import javax.persistence.MappedSuperclass;


public class EntityTest implements EntityBaseTest {

	@Test
	public void entityClassMustBeAnnotatedWithMappedSuperclass() {
		assertThat( Entity.class.isAnnotationPresent( MappedSuperclass.class ), is( true ) );
	}
}
