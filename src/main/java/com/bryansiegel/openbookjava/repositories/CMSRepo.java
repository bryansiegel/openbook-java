package com.bryansiegel.openbookjava.repositories;

import com.bryansiegel.openbookjava.models.CMS;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CMSRepo extends JpaRepository<CMS, Long> {
}
