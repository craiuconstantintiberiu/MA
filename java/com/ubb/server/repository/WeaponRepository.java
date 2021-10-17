package com.ubb.server.repository;

import com.ubb.server.model.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, Long> {

    List<Weapon> findAll();

    Optional<Weapon> findById(Long id);

    Weapon save(Weapon weapon);

    void deleteById(Long id);


}
