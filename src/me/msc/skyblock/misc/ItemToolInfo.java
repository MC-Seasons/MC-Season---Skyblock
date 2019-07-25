package me.msc.skyblock.misc;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemToolInfo {

    public static String convertToInvisibleString(String s) {
        String hidden = "";
        for (char c : s.toCharArray()) hidden += ChatColor.COLOR_CHAR + "" + c;
        return hidden;
    }

    public static void ItemTool(Item i, Player player) {
        Item item = i;
        ItemStack items = item.getItemStack();
        ItemMeta meta = items.getItemMeta();

        if (items.getType() == Material.LOG) {
            int itemid = items.getData().getData() % 4;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Oak";
            } else if (itemid == 1) {
                itemtype = "Spruce";
            } else if (itemid == 2) {
                itemtype = "Birch";
            } else if (itemid == 3) {
                itemtype = "Jungle";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "" + itemtype + " log");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.LOG_2) {
            int itemid = items.getData().getData() % 2;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Acacia";
            } else if (itemid == 1) {
                itemtype = "Dark Oak";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "" + itemtype + " log");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.GRASS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Grass");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.DIRT) {
            int itemid = items.getData().getData() % 3;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Dirt";
            } else if (itemid == 1) {
                itemtype = "Coarse Dirt";
            } else if (itemid == 2) {
                itemtype = "Podzol";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.COBBLESTONE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Cobblestone");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.STONE) {
            int itemid = items.getData().getData() % 7;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Stone";
            } else if (itemid == 1) {
                itemtype = "Granite";
            } else if (itemid == 2) {
                itemtype = "Polished Granite";
            } else if (itemid == 3) {
                itemtype = "Diorite";
            } else if (itemid == 4) {
                itemtype = "Polished Diorite";
            } else if (itemid == 5) {
                itemtype = "Andesite";
            } else if (itemid == 6) {
                itemtype = "Polished Andesite";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.STONE_AXE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Stone Axe");
            meta.spigot().setUnbreakable(true);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.STONE_BUTTON) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Stone Button");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.STONE_HOE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Stone Hoe");
            meta.spigot().setUnbreakable(true);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.STONE_PICKAXE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Stone Pickaxe");
            meta.spigot().setUnbreakable(true);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.STONE_PLATE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Stone Pressure Plate");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.STONE_SLAB2) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.DARK_GREEN + "》 UNCOMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Red Sandstone Slab");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.STONE_SPADE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Stone Shovel");
            meta.spigot().setUnbreakable(true);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.STONE_SWORD) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Stone Sword");
            meta.spigot().setUnbreakable(true);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WOOD_AXE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Wooden Axe");
            meta.spigot().setUnbreakable(true);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WOOD_BUTTON) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Wooden Button");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WOOD_DOOR) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Wooden Door");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WOOD_HOE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Wooden Hoe");
            meta.spigot().setUnbreakable(true);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WOOD_SWORD) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Wooden Sword");
            meta.spigot().setUnbreakable(true);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WOOD_PICKAXE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Wooden Pickaxe");
            meta.spigot().setUnbreakable(true);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WOOD_PLATE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Wooden Pressure Plate");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WOOD_SPADE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Wooden Shovel");
            meta.spigot().setUnbreakable(true);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WOOD_STAIRS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Wooden Stairs");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WOODEN_DOOR) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Wooden Door");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BIRCH_WOOD_STAIRS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Birch Wood Stairs");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.JUNGLE_WOOD_STAIRS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Jungle Wood Stairs");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SPRUCE_WOOD_STAIRS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Spruce Wood Stairs");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BEDROCK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.DARK_PURPLE + "》 MYTHICAL 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Bedrock");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.GRAVEL) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Gravel");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.GOLD_ORE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Gold Ore");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.IRON_ORE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Iron Ore");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.COAL_ORE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Coal Ore");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.LAPIS_ORE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Lapis Lazuli Ore");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.LAPIS_BLOCK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Lapis Lazuli Block");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.GLASS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Glass");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BRICK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Bricks");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BOOKSHELF) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Bookshelf");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.OBSIDIAN) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Obsidian");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WOOD_STAIRS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Oak Wood Stairs");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.COBBLESTONE_STAIRS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Cobblestone Stairs");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.DIAMOND_ORE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Diamond Ore");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.REDSTONE_ORE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Redstone Ore");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.ICE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Ice");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.DIAMOND_BLOCK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Block of Diamond");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.MOSSY_COBBLESTONE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.DARK_GREEN + "》 UNCOMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Mossy Stone");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.GOLD_BLOCK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Block of Gold");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SNOW_BLOCK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Snow");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.CLAY) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Clay");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.PUMPKIN) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Pumpkin");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.NETHERRACK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Netherrack");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SOUL_SAND) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Soul Sand");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.GLOWSTONE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Glowstone");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.IRON_BLOCK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Block of Iron");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.JACK_O_LANTERN) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Jack \'oLantern");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.MELON_BLOCK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Melon");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BRICK_STAIRS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Brick Stairs");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SMOOTH_STAIRS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Stone Brick Stairs");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.MYCEL) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Mycelium");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.NETHER_BRICK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Nether Brick");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.NETHER_BRICK_STAIRS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Nether Brick Stairs");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.ENDER_STONE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "End Stone");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SANDSTONE_STAIRS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Sandstone Stairs");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.EMERALD_ORE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Emerald Ore");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.EMERALD_BLOCK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Emerald Block");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SPRUCE_WOOD_STAIRS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Spruce Wood Stairs");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BIRCH_WOOD_STAIRS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Birch Wood Stairs");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.JUNGLE_WOOD_STAIRS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Jungle Wood Stairs");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.QUARTZ_ORE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Nether Quartz Ore");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.QUARTZ_STAIRS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Quartz Stairs");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.ACACIA_STAIRS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Acacia Wood Stairs");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.DARK_OAK_STAIRS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Dark Oak Wood Stairs");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SEA_LANTERN) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Sea Lantern");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.HARD_CLAY) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Terracotta");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.COAL_BLOCK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Coal Block");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.PACKED_ICE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Packed Ice");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.HAY_BLOCK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Hay Bale");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.PURPUR_BLOCK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Purpur Block");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.PURPUR_PILLAR) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Purpur Pillar");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.PURPUR_STAIRS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Purpur Stairs");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.PURPUR_SLAB) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Purpur Slab");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.END_BRICKS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "End Stone Bricks");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.NETHER_WART_BLOCK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Nether Wart Block");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.RED_NETHER_BRICK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Red Nether Brick");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BONE_BLOCK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Bone Block");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.MAGMA) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.BLUE + "》 RARE 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Magma Block");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.RED_SANDSTONE_STAIRS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Red Sandstone Stairs");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WEB) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Spiderweb");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.DEAD_BUSH) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Dead Bush");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.YELLOW_FLOWER) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Dandelion");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.RED_MUSHROOM) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Mushroom");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BROWN_MUSHROOM) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Mushroom");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.TORCH) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Torch");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.CHEST) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Chest");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WORKBENCH) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Crafting Table");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.FURNACE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Furnace");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.LADDER) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Ladder");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SNOW) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Snow");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.CACTUS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Cactus");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.JUKEBOX) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Jukebox");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.FENCE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Oak Fence");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.IRON_FENCE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Iron Bars");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.NETHER_FENCE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Nether Brick Fence");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.ENDER_CHEST) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Ender Chest");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.TRAPPED_CHEST) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Trapped Chest");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.ANVIL) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Anvil");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.ENCHANTMENT_TABLE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.BLUE + "》 RARE 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Enchantment Table");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.ENDER_PORTAL_FRAME) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.BLUE + "》 RARE 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "End Portal");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.THIN_GLASS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Glass Pane");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.VINE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Vines");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WATER_LILY) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Lily Pad");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SLIME_BLOCK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Slime Block");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SPRUCE_FENCE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Spruce Fence");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BIRCH_FENCE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Birch Fence");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.JUNGLE_FENCE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Jungle Fence");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.DARK_OAK_FENCE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Dark Oak Fence");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.ACACIA_FENCE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Acacia Fence");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.PAINTING) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Painting");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SIGN) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Sign");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BED) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Bed");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.ITEM_FRAME) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Item Frame");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.FLOWER_POT_ITEM) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Flower Pot");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.ARMOR_STAND) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Armor Stand");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.DISPENSER) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Dispenser");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.NOTE_BLOCK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Noteblock");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.PISTON_STICKY_BASE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Sticky Piston");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.PISTON_BASE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Piston");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.TNT) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "TNT");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.LEVER) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Lever");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.STONE_PLATE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Stone Pressure Plate");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WOOD_PLATE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Wooden Pressure Plate");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.REDSTONE_TORCH_ON) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Redstone Torch");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.REDSTONE_TORCH_OFF) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Redstone Torch");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.STONE_BUTTON) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Stone Button");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.TRAP_DOOR) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Trapdoor");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.FENCE_GATE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Fence Gate");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.REDSTONE_LAMP_OFF) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Redstone Lamp");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.REDSTONE_LAMP_ON) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Redstone Lamp");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.TRIPWIRE_HOOK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Tripwire Hook");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WOOD_BUTTON) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Wooden Button");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.GOLD_PLATE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Weighted Pressure Plate (Light)");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.IRON_PLATE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Weighted Pressure Plate (Heavy)");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.DAYLIGHT_DETECTOR) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Daylight Sensor");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.REDSTONE_BLOCK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Block of Redstone");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.HOPPER) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Hopper");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.DROPPER) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Dropper");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.IRON_TRAPDOOR) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Iron Trapdoor");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SPRUCE_FENCE_GATE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Spruce Fence Gate");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BIRCH_FENCE_GATE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Birch Fence Gate");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.JUNGLE_FENCE_GATE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Jungle Fence Gate");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.DARK_OAK_FENCE_GATE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Dark Oak Fence Gate");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.ACACIA_FENCE_GATE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Acacia Fence Gate");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WOODEN_DOOR) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Oak Door");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.IRON_DOOR) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Iron Door");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.REDSTONE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Redstone");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.REDSTONE_COMPARATOR) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Redstone Comparator");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.DIODE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Redstone Repeater");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SPRUCE_DOOR_ITEM) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Spruce Door");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BIRCH_DOOR_ITEM) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Birch Door");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.POWERED_RAIL) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Powered Rail");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.DETECTOR_RAIL) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Detector Rail");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.RAILS) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Rail");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.ACTIVATOR_RAIL) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Activator Rail");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.MINECART) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Minecart");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SADDLE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.BLUE + "》 RARE 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Saddle");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BOAT) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Boat");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BEACON) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Beacon");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BUCKET) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Bucket");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.LAVA_BUCKET) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Lava Bucket");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WATER_BUCKET) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Water Bucket");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SNOW_BALL) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Snowball");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.MILK_BUCKET) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Milk Bucket");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.PAPER) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Paper");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BOOK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Book");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SLIME_BALL) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Slimeball");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BONE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Bone");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.APPLE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Apple");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.MUSHROOM_SOUP) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Mushroom Stew");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BREAD) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Bread");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.PORK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Raw Porkchop");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.GRILLED_PORK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Cooked Porkchop");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.ENDER_PEARL) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Ender Pearl");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.EYE_OF_ENDER) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Eye of Ender");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.EXP_BOTTLE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Bottle o' Enchanting");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.FIREBALL) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Fire Charge");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BOOK_AND_QUILL) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Book and Quill");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.EMPTY_MAP) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Empty Map");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.FIREWORK_CHARGE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Firework Charge");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.IRON_BARDING) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.DARK_GREEN + "》 UNCOMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Iron Horse Armor");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.GOLD_BARDING) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.DARK_GREEN + "》 UNCOMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Gold Horse Armor");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.DIAMOND_BARDING) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.DARK_GREEN + "》 UNCOMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Diamond Horse Armor");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.STORAGE_MINECART) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Minecart with Chest");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.POWERED_MINECART) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Minecart with Furnace");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.EXPLOSIVE_MINECART) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Minecart with TNT");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.HOPPER_MINECART) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Minecart with Hopper");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.CARROT_STICK) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Carrot on a Stick");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.JUNGLE_DOOR_ITEM) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Jungle Door");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.ACACIA_DOOR_ITEM) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Acacia Door");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.DARK_OAK_DOOR_ITEM) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Dark Oak Door");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.CAKE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Cake");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.COOKIE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Cookie");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.MELON) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Melon");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.RAW_BEEF) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Raw Beef");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.COOKED_BEEF) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Steak");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.RAW_CHICKEN) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Chicken");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.COOKED_CHICKEN) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Cooked Chicken");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.ROTTEN_FLESH) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Rotten Flesh");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SPIDER_EYE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Spider Eye");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.CARROT) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Carrot");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.POTATO_ITEM) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Potato");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BAKED_POTATO) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Baked Potato");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.POISONOUS_POTATO) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Poisonous Potato");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.PUMPKIN_PIE) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Pumpkin Pie");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.RABBIT) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Raw Rabbit");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.COOKED_RABBIT) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Cooked Rabbit");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.RABBIT_STEW) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Rabbit Stew");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.MUTTON) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Raw Mutton");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.COOKED_MUTTON) {
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + "Cooked Mutton");
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.COOKED_FISH) {
            int itemid = items.getData().getData() % 2;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Cooked Fish";
            } else if (itemid == 1) {
                itemtype = "Cooked Salamon";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.RAW_FISH) {
            int itemid = items.getData().getData() % 4;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Raw Fish";
            } else if (itemid == 1) {
                itemtype = "Raw Salamon";
            } else if (itemid == 2) {
                itemtype = "Clownfish";
            } else if (itemid == 3) {
                itemtype = "Pufferfish";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.GOLDEN_APPLE) {
            int itemid = items.getData().getData() % 2;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Golden Apple";
            } else if (itemid == 1) {
                itemtype = "Enchanted Golden Apple";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.DOUBLE_PLANT) {
            int itemid = items.getData().getData() % 6;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Sunflower";
            } else if (itemid == 1) {
                itemtype = "Lilac";
            } else if (itemid == 2) {
                itemtype = "Double Tallgrass";
            } else if (itemid == 3) {
                itemtype = "Large Fern";
            } else if (itemid == 4) {
                itemtype = "Rose Bush";
            } else if (itemid == 5) {
                itemtype = "Peony";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SKULL_ITEM) {
            int itemid = items.getData().getData() % 6;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Skeleton Skull";
            } else if (itemid == 1) {
                itemtype = "Wither Skeleton Skull";
            } else if (itemid == 2) {
                itemtype = "Zombie Skull";
            } else if (itemid == 3) {
                itemtype = "Player Skull";
            } else if (itemid == 4) {
                itemtype = "Creeper Skull";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.LEAVES_2) {
            int itemid = items.getData().getData() % 2;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Acacia Leaves";
            } else if (itemid == 1) {
                itemtype = "Dark Oak Leaves";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.MONSTER_EGGS) {
            int itemid = items.getData().getData() % 6;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Stone Monster Egg";
            } else if (itemid == 1) {
                itemtype = "Cobblestone Monster Egg";
            } else if (itemid == 2) {
                itemtype = "Stone Brick Monster Egg";
            } else if (itemid == 3) {
                itemtype = "Mossy Stone Brick Monster Egg";
            } else if (itemid == 4) {
                itemtype = "Cracked Stone Brick Monster Egg";
            } else if (itemid == 5) {
                itemtype = "Chiseled Stone Brick Monster Egg";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SAPLING) {
            int itemid = items.getData().getData() % 6;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Oak Sapling";
            } else if (itemid == 1) {
                itemtype = "Spruce Sapling";
            } else if (itemid == 2) {
                itemtype = "Birch Sapling";
            } else if (itemid == 3) {
                itemtype = "Jungle Sapling";
            } else if (itemid == 4) {
                itemtype = "Acacia Sapling";
            } else if (itemid == 5) {
                itemtype = "Dark Oak Sapling";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.RED_ROSE) {
            int itemid = items.getData().getData() % 9;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Poppy";
            } else if (itemid == 1) {
                itemtype = "Blue Orchid";
            } else if (itemid == 2) {
                itemtype = "Allium";
            } else if (itemid == 3) {
                itemtype = "Azure Bluet";
            } else if (itemid == 4) {
                itemtype = "Red Tulip";
            } else if (itemid == 5) {
                itemtype = "Orange Tulip";
            } else if (itemid == 6) {
                itemtype = "White Tulip";
            } else if (itemid == 7) {
                itemtype = "Pink Tulip";
            } else if (itemid == 8) {
                itemtype = "Oxeye Daisy";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.LEAVES) {
            int itemid = items.getData().getData() % 4;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Oak Leaves";
            } else if (itemid == 1) {
                itemtype = "Spruce Leaves";
            } else if (itemid == 2) {
                itemtype = "Birch Leaves";
            } else if (itemid == 3) {
                itemtype = "Jungle Leaves";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.LONG_GRASS) {
            int itemid = items.getData().getData() % 3;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Grass";
            } else if (itemid == 1) {
                itemtype = "Grass";
            } else if (itemid == 2) {
                itemtype = "Fern";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.PRISMARINE) {
            int itemid = items.getData().getData() % 3;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Prismarine";
            } else if (itemid == 1) {
                itemtype = "Prismarine Bricks";
            } else if (itemid == 2) {
                itemtype = "Dark Prismarine";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.RED_SANDSTONE) {
            int itemid = items.getData().getData() % 3;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Red Sandstone";
            } else if (itemid == 1) {
                itemtype = "Chiseled Red Sandstone";
            } else if (itemid == 2) {
                itemtype = "Smooth Red Sandstone";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.QUARTZ_BLOCK) {
            int itemid = items.getData().getData() % 3;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Quartz Block";
            } else if (itemid == 1) {
                itemtype = "Chiseled Quartz Block";
            } else if (itemid == 2) {
                itemtype = "Pillar Quartz Block";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SMOOTH_BRICK) {
            int itemid = items.getData().getData() % 4;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Stone Bricks";
            } else if (itemid == 1) {
                itemtype = "Mossy Stone Bricks";
            } else if (itemid == 2) {
                itemtype = "Cracked Stone Bricks";
            } else if (itemid == 3) {
                itemtype = "Chiseled Stone Bricks";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.STAINED_CLAY) {
            int itemid = items.getData().getData() % 16;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "White Terracota";
            } else if (itemid == 1) {
                itemtype = "Orange Terracota";
            } else if (itemid == 2) {
                itemtype = "Magenta Terracota";
            } else if (itemid == 3) {
                itemtype = "Light Blue Terracota";
            } else if (itemid == 4) {
                itemtype = "Yellow Terracota";
            } else if (itemid == 5) {
                itemtype = "Lime Terracota";
            } else if (itemid == 6) {
                itemtype = "Pink Terracota";
            } else if (itemid == 7) {
                itemtype = "Gray Terracota";
            } else if (itemid == 8) {
                itemtype = "Light Gray Terracota";
            } else if (itemid == 9) {
                itemtype = "Cyan Terracota";
            } else if (itemid == 10) {
                itemtype = "Purple Terracota";
            } else if (itemid == 11) {
                itemtype = "Blue Terracota";
            } else if (itemid == 12) {
                itemtype = "Brown Terracota";
            } else if (itemid == 13) {
                itemtype = "Green Terracota";
            } else if (itemid == 14) {
                itemtype = "Red Terracota";
            } else if (itemid == 15) {
                itemtype = "Black Terracota";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.BANNER) {
            int itemid = items.getData().getData() % 16;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Black Banner";
            } else if (itemid == 1) {
                itemtype = "Red Banner";
            } else if (itemid == 2) {
                itemtype = "Green Banner";
            } else if (itemid == 3) {
                itemtype = "Brown Banner";
            } else if (itemid == 4) {
                itemtype = "Blue Banner";
            } else if (itemid == 5) {
                itemtype = "Purple Banner";
            } else if (itemid == 6) {
                itemtype = "Cyan Banner";
            } else if (itemid == 7) {
                itemtype = "Light Gray Banner";
            } else if (itemid == 8) {
                itemtype = "Gray Banner";
            } else if (itemid == 9) {
                itemtype = "Pink Banner";
            } else if (itemid == 10) {
                itemtype = "Lime Banner";
            } else if (itemid == 11) {
                itemtype = "Yellow Banner";
            } else if (itemid == 12) {
                itemtype = "Light Blue Banner";
            } else if (itemid == 13) {
                itemtype = "Magenta Banner";
            } else if (itemid == 14) {
                itemtype = "Orange Banner";
            } else if (itemid == 15) {
                itemtype = "White Banner";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.CONCRETE) {
            int itemid = items.getData().getData() % 16;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "White Concrete";
            } else if (itemid == 1) {
                itemtype = "Orange Concrete";
            } else if (itemid == 2) {
                itemtype = "Magenta Concrete";
            } else if (itemid == 3) {
                itemtype = "Light Blue Concrete";
            } else if (itemid == 4) {
                itemtype = "Yellow Concrete";
            } else if (itemid == 5) {
                itemtype = "Lime Concrete";
            } else if (itemid == 6) {
                itemtype = "Pink Concrete";
            } else if (itemid == 7) {
                itemtype = "Gray Concrete";
            } else if (itemid == 8) {
                itemtype = "Light Gray Concrete";
            } else if (itemid == 9) {
                itemtype = "Cyan Concrete";
            } else if (itemid == 10) {
                itemtype = "Purple Concrete";
            } else if (itemid == 11) {
                itemtype = "Blue Concrete";
            } else if (itemid == 12) {
                itemtype = "Brown Concrete";
            } else if (itemid == 13) {
                itemtype = "Green Concrete";
            } else if (itemid == 14) {
                itemtype = "Red Concrete";
            } else if (itemid == 15) {
                itemtype = "Black Concrete";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.CONCRETE_POWDER) {
            int itemid = items.getData().getData() % 16;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "White Concrete Powder";
            } else if (itemid == 1) {
                itemtype = "Orange Concrete Powder";
            } else if (itemid == 2) {
                itemtype = "Magenta Concrete Powder";
            } else if (itemid == 3) {
                itemtype = "Light Blue Concrete Powder";
            } else if (itemid == 4) {
                itemtype = "Yellow Concrete Powder";
            } else if (itemid == 5) {
                itemtype = "Lime Concrete Powder";
            } else if (itemid == 6) {
                itemtype = "Pink Concrete Powder";
            } else if (itemid == 7) {
                itemtype = "Gray Concrete Powder";
            } else if (itemid == 8) {
                itemtype = "Light Gray Concrete Powder";
            } else if (itemid == 9) {
                itemtype = "Cyan Concrete Powder";
            } else if (itemid == 10) {
                itemtype = "Purple Concrete Powder";
            } else if (itemid == 11) {
                itemtype = "Blue Concrete Powder";
            } else if (itemid == 12) {
                itemtype = "Brown Concrete Powder";
            } else if (itemid == 13) {
                itemtype = "Green Concrete Powder";
            } else if (itemid == 14) {
                itemtype = "Red Concrete Powder";
            } else if (itemid == 15) {
                itemtype = "Black Concrete Powder";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WOOD_STEP) {
            int itemid = items.getData().getData() % 6;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Oak Wood Slab";
            } else if (itemid == 1) {
                itemtype = "Spruce Wood Slab";
            } else if (itemid == 2) {
                itemtype = "Birch Wood Slab";
            } else if (itemid == 3) {
                itemtype = "Jungle Wood Slab";
            } else if (itemid == 4) {
                itemtype = "Acacia Wood Slab";
            } else if (itemid == 5) {
                itemtype = "Dark Oak Wood Slab";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SPONGE) {
            int itemid = items.getData().getData() % 2;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Sponge";
            } else if (itemid == 1) {
                itemtype = "Wet Sponge";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.STAINED_GLASS) {
            int itemid = items.getData().getData() % 16;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "White Stained Glass";
            } else if (itemid == 1) {
                itemtype = "Orange Stained Glass";
            } else if (itemid == 2) {
                itemtype = "Magenta Stained Glass";
            } else if (itemid == 3) {
                itemtype = "Light Blue Stained Glass";
            } else if (itemid == 4) {
                itemtype = "Yellow Stained Glass";
            } else if (itemid == 5) {
                itemtype = "Lime Stained Glass";
            } else if (itemid == 6) {
                itemtype = "Pink Stained Glass";
            } else if (itemid == 7) {
                itemtype = "Gray Stained Glass";
            } else if (itemid == 8) {
                itemtype = "Light Gray Stained Glass";
            } else if (itemid == 9) {
                itemtype = "Cyan Stained Glass";
            } else if (itemid == 10) {
                itemtype = "Purple Stained Glass";
            } else if (itemid == 11) {
                itemtype = "Blue Stained Glass";
            } else if (itemid == 12) {
                itemtype = "Brown Stained Glass";
            } else if (itemid == 13) {
                itemtype = "Green Stained Glass";
            } else if (itemid == 14) {
                itemtype = "Red Stained Glass";
            } else if (itemid == 15) {
                itemtype = "Black Stained Glass";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.STAINED_GLASS_PANE) {
            int itemid = items.getData().getData() % 16;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "White Stained Glass Pane";
            } else if (itemid == 1) {
                itemtype = "Orange Stained Glass Pane";
            } else if (itemid == 2) {
                itemtype = "Magenta Stained Glass Pane";
            } else if (itemid == 3) {
                itemtype = "Light Blue Stained Glass Pane";
            } else if (itemid == 4) {
                itemtype = "Yellow Stained Glass Pane";
            } else if (itemid == 5) {
                itemtype = "Lime Stained Glass Pane";
            } else if (itemid == 6) {
                itemtype = "Pink Stained Glass Pane";
            } else if (itemid == 7) {
                itemtype = "Gray Stained Glass Pane";
            } else if (itemid == 8) {
                itemtype = "Light Gray Stained Glass Pane";
            } else if (itemid == 9) {
                itemtype = "Cyan Stained Glass Pane";
            } else if (itemid == 10) {
                itemtype = "Purple Stained Glass Pane";
            } else if (itemid == 11) {
                itemtype = "Blue Stained Glass Pane";
            } else if (itemid == 12) {
                itemtype = "Brown Stained Glass Pane";
            } else if (itemid == 13) {
                itemtype = "Green Stained Glass Pane";
            } else if (itemid == 14) {
                itemtype = "Red Stained Glass Pane";
            } else if (itemid == 15) {
                itemtype = "Black Stained Glass Pane";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SANDSTONE) {
            int itemid = items.getData().getData() % 3;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Sandstone";
            } else if (itemid == 1) {
                itemtype = "Chiseled Sandstone";
            } else if (itemid == 2) {
                itemtype = "Smooth Sandstone";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.SAND) {
            int itemid = items.getData().getData() % 2;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Sand";
            } else if (itemid == 1) {
                itemtype = "Red Sand";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WOOD) {
            int itemid = items.getData().getData() % 6;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Planks";
            } else if (itemid == 1) {
                itemtype = "Spruce Planks";
            } else if (itemid == 2) {
                itemtype = "Birch Planks";
            } else if (itemid == 3) {
                itemtype = "Jungle Planks";
            } else if (itemid == 4) {
                itemtype = "Acacia Planks";
            } else if (itemid == 5) {
                itemtype = "Dark Oak Planks";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.STEP) {
            int itemid = items.getData().getData() % 9;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "Stone Slab";
            } else if (itemid == 1) {
                itemtype = "Sandstone Slab";
            } else if (itemid == 2) {
                itemtype = "Wooden Slab";
            } else if (itemid == 3) {
                itemtype = "Cobblestone Slab";
            } else if (itemid == 4) {
                itemtype = "Bricks Slab";
            } else if (itemid == 5) {
                itemtype = "Stone Bricks Slab";
            } else if (itemid == 6) {
                itemtype = "Nether Brick Slab";
            } else if (itemid == 7) {
                itemtype = "Quartz Slab";
            } else if (itemid == 8) {
                itemtype = "Stone Bricks Slab";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.WOOL) {
            int itemid = items.getData().getData() % 16;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "White Wool";
            } else if (itemid == 1) {
                itemtype = "Orange Wool";
            } else if (itemid == 2) {
                itemtype = "Magenta Wool";
            } else if (itemid == 3) {
                itemtype = "Light Blue Wool";
            } else if (itemid == 4) {
                itemtype = "Yellow Wool";
            } else if (itemid == 5) {
                itemtype = "Lime Wool";
            } else if (itemid == 6) {
                itemtype = "Pink Wool";
            } else if (itemid == 7) {
                itemtype = "Gray Wool";
            } else if (itemid == 8) {
                itemtype = "Light Gray Wool";
            } else if (itemid == 9) {
                itemtype = "Cyan Wool";
            } else if (itemid == 10) {
                itemtype = "Purple Wool";
            } else if (itemid == 11) {
                itemtype = "Blue Wool";
            } else if (itemid == 12) {
                itemtype = "Brown Wool";
            } else if (itemid == 13) {
                itemtype = "Green Wool";
            } else if (itemid == 14) {
                itemtype = "Red Wool";
            } else if (itemid == 15) {
                itemtype = "Black Wool";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }

        if (items.getType() == Material.CARPET) {
            int itemid = items.getData().getData() % 16;
            String itemtype = "";
            if (itemid == 0) {
                itemtype = "White Carpet";
            } else if (itemid == 1) {
                itemtype = "Orange Carpet";
            } else if (itemid == 2) {
                itemtype = "Magenta Carpet";
            } else if (itemid == 3) {
                itemtype = "Light Blue Carpet";
            } else if (itemid == 4) {
                itemtype = "Yellow Carpet";
            } else if (itemid == 5) {
                itemtype = "Lime Carpet";
            } else if (itemid == 6) {
                itemtype = "Pink Carpet";
            } else if (itemid == 7) {
                itemtype = "Gray Carpet";
            } else if (itemid == 8) {
                itemtype = "Light Gray Carpet";
            } else if (itemid == 9) {
                itemtype = "Cyan Carpet";
            } else if (itemid == 10) {
                itemtype = "Purple Carpet";
            } else if (itemid == 11) {
                itemtype = "Blue Carpet";
            } else if (itemid == 12) {
                itemtype = "Brown Carpet";
            } else if (itemid == 13) {
                itemtype = "Green Carpet";
            } else if (itemid == 14) {
                itemtype = "Red Carpet";
            } else if (itemid == 15) {
                itemtype = "Black Carpet";
            }
            List<String> lore = new ArrayList<String>();
            lore.add(ChatColor.WHITE + "》 COMMON 《");
            meta.setLore(lore);
            meta.setDisplayName(ChatColor.GRAY + itemtype);
            items.setItemMeta(meta);
            return;
        }


        //Item not found, giving it basic data
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "》 UNKNOWN 《");
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.RED + "Item not found, report this to an admin!");
        items.setItemMeta(meta);
    }
}