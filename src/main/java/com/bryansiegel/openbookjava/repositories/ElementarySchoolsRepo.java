package com.bryansiegel.openbookjava.repositories;

import com.bryansiegel.openbookjava.models.ElementarySchools;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementarySchoolsRepo extends JpaRepository<ElementarySchools, Long> {

}
