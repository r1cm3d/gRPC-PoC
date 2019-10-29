package com.poc.product.domain.entity;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.junit.jupiter.api.Test;

public class ProductTest implements EntityBaseTest {

	@Test
	public void productClassMustBeAnnotatedWithEntityAnnotation() {
		assertThat( Product.class.isAnnotationPresent( Entity.class ), is( true ) );
	}

	@Test
	public void priceInCentsMustBeAnnotatedWithColumnAnnotation() {
		var priceInCentsColumnAnnotation = getDeclaredField( Product.class, "priceInCents" )
				.getAnnotation( Column.class );

		assertAll(
				"priceInCentsColumnAnnotation",
				() -> assertThat( priceInCentsColumnAnnotation, is( notNullValue() ) ),
				() -> assertThat( priceInCentsColumnAnnotation.name(), is( equalTo( "price_in_cents" ) ) )
		);
	}

	@Test
	public void titleMustBeAnnotatedWithColumnAnnotation() {
		assertThat( getDeclaredField( Product.class, "title" ).isAnnotationPresent( Column.class ),
				is( true ) );
	}

	@Test
	public void descriptionMustBeAnnotatedWithColumnAnnotation() {
		assertThat( getDeclaredField( Product.class, "description" ).isAnnotationPresent( Column.class ),
				is( true ) );
	}
}
