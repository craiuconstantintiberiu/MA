package com.ubb.server.controller;

import com.ubb.server.model.Weapon;
import com.ubb.server.service.WeaponService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("weapons")
public class WeaponController {

    private WeaponService weaponService;

    public WeaponController(WeaponService weaponService) {
        this.weaponService = weaponService;
    }

    @GetMapping
    public List<Weapon> getAllWeapons(){
        return weaponService.getAllWeapons();
    }

    @PostMapping
    public Weapon saveWeapon(Weapon weapon){
        return weaponService.addWeapon(weapon);
    }

    @GetMapping(value = "/{id}")
    public Optional<Weapon> getWeaponByID(@PathVariable long id){
        return weaponService.getWeaponById(id);
    }
}
