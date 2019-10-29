package com.poc.product.domain.entity;

import javax.persistence.Column;

import lombok.Getter;
import lombok.NoArgsConstructor;

@javax.persistence.Entity
@NoArgsConstructor(force = true)
@Getter
public class Product extends Entity {

	@Column(name = "price_in_cents")
	private final Integer priceInCents;

	@Column
	private final String title;

	@Column
	private final String description;
}
