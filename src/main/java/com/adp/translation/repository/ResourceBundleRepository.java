package com.adp.translation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adp.translation.entity.ResourceBundleKeyValue;

@Repository
public interface ResourceBundleRepository extends CrudRepository<ResourceBundleKeyValue, Long> {


    
}
