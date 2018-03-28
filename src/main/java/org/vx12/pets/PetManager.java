package org.vx12.pets;

import org.vx12.pets.gamePets.*;

import java.util.ArrayList;

public class PetManager {

    public static ArrayList<Pet_C> pets = new ArrayList<Pet_C>();

    public PetManager(){
        pets.add(new DogPet());
        pets.add(new CatPet());
        pets.add(new VillagerPet());
    }

}
