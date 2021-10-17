package com.ubb.server.service;

import com.ubb.server.model.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeaponService {

    private JpaRepository<Weapon, Long> weaponRepository;

    @Autowired
    public WeaponService(JpaRepository<Weapon, Long> weaponRepository) {
        this.weaponRepository = weaponRepository;
    }

    public List<Weapon> getAllWeapons(){
        return weaponRepository.findAll();
    }

    public Optional<Weapon> getWeaponById(long id){
        return weaponRepository.findById(id);
    }

    public Weapon addWeapon(Weapon weapon){
        return weaponRepository.save(weapon);
    }
}
