package com.poc.product.domain.entity;

import java.util.UUID;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;

@MappedSuperclass
@NoArgsConstructor(force = true)
@Getter
public abstract class Entity {

	private final UUID id;
}
