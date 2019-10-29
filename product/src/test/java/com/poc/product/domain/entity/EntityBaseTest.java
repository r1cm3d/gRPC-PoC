package com.poc.product.domain.entity;

import java.lang.reflect.Field;

public interface EntityBaseTest {

	default <T> Field getDeclaredField(Class<T> classType, String name) {
		try {
			return classType.getDeclaredField( name );
		} catch (NoSuchFieldException ex) {
			throw new RuntimeException( ex.getMessage() );
		}
	}
}
