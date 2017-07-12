package org.syphr.springtest.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.syphr.springtest.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>
{}
