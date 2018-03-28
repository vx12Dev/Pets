package org.vx12.pets.gamePets;

import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.vx12.pets.Pet_C;

public class CatPet extends Pet_C{
    public CatPet() {
        super(1, EntityType.OCELOT, "§a" + Pet_C.getPet(0).getOwner() + "§a's §7Cat", null);
    }
}
