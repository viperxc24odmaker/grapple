package com.qwertym12.grapple;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GrappleMod implements ModInitializer {
    public static final Item TEST_ITEM = new Item(new Item.Settings());
    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, Identifier.of("grapple", "test_item"), TEST_ITEM);
    }
}