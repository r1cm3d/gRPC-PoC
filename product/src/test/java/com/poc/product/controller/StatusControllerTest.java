package com.poc.product.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@ExtendWith(MockitoExtension.class)
public class StatusControllerTest {

	@InjectMocks
	private StatusController statusController;

	@Test
	public void statusControllerMustBeAnnotatedWithRestControllerAnnotation() {
		assertThat( StatusController.class.isAnnotationPresent( RestController.class ), is( true ) );
	}

	@Test
	public void statusControllerMustBeAnnotatedWithRequestMappingAnnotation() {
		var requestMappingAnnotation = StatusController.class.getAnnotation( RequestMapping.class );

		assertThat( requestMappingAnnotation, is( notNullValue() ) );
		assertThat( requestMappingAnnotation.value()[0], is( equalTo( "/status" ) ) );
	}

	@Test
	public void statusMethodMustBeAnnotatedWithGetMappingAnnotation() throws Exception {
		assertThat( StatusController.class.getMethod( "status" ).isAnnotationPresent( GetMapping.class ),
				is( true ) );
	}

	@Test
	public void statusMethodMustReturnOK() {
		assertThat( statusController.status(), is( equalTo( "OK" ) ) );
	}
}
