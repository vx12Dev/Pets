package org.vx12.pets.gamePets;

import org.bukkit.entity.EntityType;
import org.vx12.pets.Pet_C;

public class DogPet extends Pet_C{

    public DogPet() {
        super(0, EntityType.WOLF, "§a" + Pet_C.getPet(0).getOwner() + "§a's §7Dog", null);
    }
}
