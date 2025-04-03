package com.javaweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaweb.repository.custom.buildingRepositoryCustom;
import com.javaweb.repository.entity.BuildingEntity;

public interface BuildingRepository extends JpaRepository<BuildingEntity, Long>, buildingRepositoryCustom {
	void deleteByIdIn(Long[] Ids);
	List<BuildingEntity> findByNameContainingAndStreet(String name, String Street);
	List<BuildingEntity> findByNameContaining(String name);
}
