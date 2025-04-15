package com.example.ciudapp.repositories;

import com.example.ciudapp.models.EntityPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEntityPlaceRepository extends JpaRepository<EntityPlace, Long> {}
