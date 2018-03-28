package org.vx12.pets.utils;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class PetUtils {

    public File file = new File("plugins/Pets", "petConfig.yml");
    public FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

    public void showPet(String uuid){

    }

    public void hidePet(String uuid){

    }

    public boolean hasPet(String uuid){
        if(cfg.contains(uuid)){
            return true;
        }
        return false;
    }

    public void saveCfg(){
        try {
            cfg.save(file);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
