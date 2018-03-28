package org.vx12.pets;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Pet_C {

    private int id;
    private EntityType type;
    private String name;
    private Player owner;
    private ItemStack armor;

    public Pet_C(int id, EntityType type, String name, ItemStack armor){
        this.id = id;
        this.type = type;
        this.name = name;
        this.armor = armor;
    }

    public int getId(){
        return id;
    }

    public EntityType getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    public ItemStack getArmor() {
        return armor;
    }

    public String getOwner() {
        return owner.getName();
    }

    public static Pet_C getPet(int id){
        for(Pet_C pet : PetManager.pets) {
            if(pet.getId() == id){
                return pet;
            }

            }
            return null;
        }
    }


