package com.joel.mycocraft.init;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;

import java.util.HashMap;

public class MycoBlocks {
    public static final HashMap<Block, Item> ITEMS = new HashMap<Block, Item>();

    public static void register(){

    }

    public static void registerBlock(Block block, ResourceLocation name, RegistryEvent.Register<Block> event) {
        event.getRegistry().register(block);
        MycoBlocks.ITEMS.put(block, new BlockItem(block, new Item.Properties()).setRegistryName(name));
    }
}
