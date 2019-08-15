package me.msc.skyblock.crate;


import org.bukkit.enchantments.Enchantment;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Keys {

    private static ItemStack itemStack;
    private static ItemMeta itemMeta;
    private static List<String> lore;
    private static String keyTitle;



    public static ItemStack getKey(KeyType keyType, Integer amount){

        lore = new ArrayList<String>();

        switch (keyType){
            case VoteKey:
                voteKey();
                break;
            case LegendaryKey:
                legendaryKey();
                break;
            case RareKey:
                rareKey();
                break;
        }

        //returns itemstack with item meta of specific key
        itemStack = new ItemStack(Material.BLAZE_ROD, amount);
        itemStack.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        itemMeta = itemStack.getItemMeta();
        itemMeta.setLore(lore);
        itemMeta.setDisplayName(keyTitle);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    private static void voteKey(){
        lore.add("Click on Vote Crate to use this key.");
        keyTitle = "Vote Key";
    }

    private static void legendaryKey(){
        lore.add("Click on Legendary Crate to use this key.");
        keyTitle = "Legendary Key";
    }

    private static void rareKey(){
        lore.add("Click on Rare Crate to use this key.");
        keyTitle = "Rare Key";
    }



}
