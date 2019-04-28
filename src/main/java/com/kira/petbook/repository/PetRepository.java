package com.kira.petbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kira.petbook.models.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{

}
