package org.vx12.pets.gamePets;

import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.vx12.pets.Pet_C;

public class VillagerPet extends Pet_C{


    public VillagerPet() {
        super(2, EntityType.VILLAGER, "§a" + Pet_C.getPet(0).getOwner() + "§a's §7Slave", null);
    }
}
