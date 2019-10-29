package com.poc.product.domain.entity;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

public class EntityTest implements EntityBaseTest {

	@Test
	public void entityClassMustBeAnnotatedWithMappedSuperclass() {
		assertThat( Entity.class.isAnnotationPresent( MappedSuperclass.class ), is( true ) );
	}

	@Test
	public void idMustBeAnnotatedWithIdAnnotation() {
		assertThat( getDeclaredField( Entity.class, "id" ).isAnnotationPresent( Id.class ),
				is( true ) );
	}

	@Test
	public void idMustBeAnnotatedWithColumnAnnotation() {
		var idColumnAnnotation = getDeclaredField( Entity.class, "id" )
				.getAnnotation( Column.class );

		assertAll(
				"idColumnAnnotation",
				() -> assertThat( idColumnAnnotation, is( notNullValue() ) ),
				() -> assertThat( idColumnAnnotation.columnDefinition(), is( equalTo( "uuid" ) ) )
		);
	}
}