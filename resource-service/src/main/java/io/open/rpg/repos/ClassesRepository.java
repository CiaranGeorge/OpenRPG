package com.open.rpg.children;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "classes", path = "classes")
public interface ClassesRepository  extends PagingAndSortingRepository<Classes, Long> {
        List<Classes> findByName(@Param("name") String name);
}
