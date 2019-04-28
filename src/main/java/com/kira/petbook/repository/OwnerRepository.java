package com.kira.petbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kira.petbook.models.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long>{

}
