package com.poc.product.domain.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@MappedSuperclass
@NoArgsConstructor(force = true, access = AccessLevel.PROTECTED)
@Getter
public abstract class Entity {

	@Id
	@Column(columnDefinition = "uuid")
	private final UUID id;
}
