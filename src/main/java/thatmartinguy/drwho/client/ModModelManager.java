package thatmartinguy.drwho.client;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thatmartinguy.drwho.init.ModBlocks;
import thatmartinguy.drwho.util.Reference;

@SideOnly(Side.CLIENT)
@EventBusSubscriber(modid = Reference.MOD_ID)
public class ModModelManager
{
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {
        registerBlockModels();
    }

    private static void registerBlockModels()
    {
        registerBlockModel(ModBlocks.WALL_HELL_A);
        registerBlockModel(ModBlocks.WALL_HELL_B);
        registerBlockModel(ModBlocks.BLOWUP_1963_A);
        registerBlockModel(ModBlocks.BLOWUP_1963_B);
        registerBlockModel(ModBlocks.BLOWUP_1963_GREY_A);
        registerBlockModel(ModBlocks.BLOWUP_1963_GREY_B);
        registerBlockModel(ModBlocks.BLOWUP_1966_A);
        registerBlockModel(ModBlocks.BLOWUP_1966_B);
        registerBlockModel(ModBlocks.BLOWUP_AST_A);
        registerBlockModel(ModBlocks.BLOWUP_AST_B);
        registerBlockModel(ModBlocks.FLOOR_1963_A);
        registerBlockModel(ModBlocks.FLOOR_1963_B);
        registerBlockModel(ModBlocks.FLOOR_1963_C);
        registerBlockModel(ModBlocks.FLOOR_1963_D);
        registerBlockModel(ModBlocks.GLASS_1963);
        registerBlockModel(ModBlocks.ROUNDEL_1963_A);
        registerBlockModel(ModBlocks.ROUNDEL_1963_B);
        registerBlockModel(ModBlocks.ROUNDEL_1963_C);
        registerBlockModel(ModBlocks.ROUNDEL_1965_A);
        registerBlockModel(ModBlocks.ROUNDEL_1965_B);
        registerBlockModel(ModBlocks.ROUNDEL_1965_C);
        registerBlockModel(ModBlocks.ROUNDEL_1966_A);
        registerBlockModel(ModBlocks.ROUNDEL_1966_B);
        registerBlockModel(ModBlocks.ROUNDEL_1966_C);
        registerBlockModel(ModBlocks.ROUNDEL_AST_A);
        registerBlockModel(ModBlocks.ROUNDEL_AST_B);
        registerBlockModel(ModBlocks.ROUNDEL_AST_C);
        registerBlockModel(ModBlocks.ROUNDEL_HELL_A);
        registerBlockModel(ModBlocks.ROUNDEL_HELL_B);
        registerBlockModel(ModBlocks.ROUNDEL_HELL_C);
        registerBlockModel(ModBlocks.TOT_ROUNDEL_A);
        registerBlockModel(ModBlocks.TOT_ROUNDEL_B);
        registerBlockModel(ModBlocks.TOT_ROUNDEL_C);
        registerBlockModel(ModBlocks.WALL_1963);
        registerBlockModel(ModBlocks.WALL_1966);
        registerBlockModel(ModBlocks.WALL_AST);
        registerBlockModel(ModBlocks.WALL_ROUNDEL_A);
        registerBlockModel(ModBlocks.WALL_ROUNDEL_B);
        registerBlockModel(ModBlocks.WALL_ROUNDEL_C);
        registerBlockModel(ModBlocks.WALL_ROUNDEL_D);
        registerBlockModel(ModBlocks.WARDROBE_1966_BOTTOM);
        registerBlockModel(ModBlocks.WARDROBE_1966_TOP);
        registerBlockModel(ModBlocks.CEILING_1977);
        registerBlockModel(ModBlocks.OVERHEAD_1976);
        registerBlockModel(ModBlocks.PILLAR_1977);
        registerBlockModel(ModBlocks.PLATFORM_1977);
        registerBlockModel(ModBlocks.ROUNDEL_1972_A);
        registerBlockModel(ModBlocks.ROUNDEL_1972_B);
        registerBlockModel(ModBlocks.ROUNDEL_1972_C);
        registerBlockModel(ModBlocks.ROUNDEL_1976_A);
        registerBlockModel(ModBlocks.ROUNDEL_1976_B);
        registerBlockModel(ModBlocks.ROUNDEL_1976_C);
        registerBlockModel(ModBlocks.ROUNDEL_1976_ALT_A);
        registerBlockModel(ModBlocks.ROUNDEL_1976_ALT_B);
        registerBlockModel(ModBlocks.ROUNDEL_1976_ALT_C);
        registerBlockModel(ModBlocks.ROUNDEL_1977);
        registerBlockModel(ModBlocks.ROUNDEL_DOOR_1976);
        registerBlockModel(ModBlocks.ROUNDEL_DOOR_TM);
        registerBlockModel(ModBlocks.ROUNDEL_TM_A);
        registerBlockModel(ModBlocks.ROUNDEL_TM_B);
        registerBlockModel(ModBlocks.ROUNDEL_TM_C);
        registerBlockModel(ModBlocks.ROUNDEL_TM_D);
        registerBlockModel(ModBlocks.SLAB_1977);
        registerBlockModel(ModBlocks.WALL_1976);
        registerBlockModel(ModBlocks.WALL_1977);
        registerBlockModel(ModBlocks.WALL_TOP_1977);
        registerBlockModel(ModBlocks.WINDOW_1977_A);
        registerBlockModel(ModBlocks.WINDOW_1977_B);
        registerBlockModel(ModBlocks.WINDOW_1977_C);
        registerBlockModel(ModBlocks.DOOR_1980_BOTTOM);
        registerBlockModel(ModBlocks.DOOR_1980_TOP);
        registerBlockModel(ModBlocks.PILLAR_1980);
        registerBlockModel(ModBlocks.PILLAR_1983);
        registerBlockModel(ModBlocks.ROUNDEL_1980_A);
        registerBlockModel(ModBlocks.ROUNDEL_1980_B);
        registerBlockModel(ModBlocks.ROUNDEL_1980_C);
        registerBlockModel(ModBlocks.ROUNDEL_1983_A);
        registerBlockModel(ModBlocks.ROUNDEL_1983_B);
        registerBlockModel(ModBlocks.ROUNDEL_1983_C);
        registerBlockModel(ModBlocks.ROUNDEL_1983_ALT_A);
        registerBlockModel(ModBlocks.ROUNDEL_1983_ALT_B);
        registerBlockModel(ModBlocks.ROUNDEL_1983_GREY_A);
        registerBlockModel(ModBlocks.ROUNDEL_1983_GREY_B);
        registerBlockModel(ModBlocks.ROUNDEL_BATTLEFIELD_A);
        registerBlockModel(ModBlocks.ROUNDEL_BATTLEFIELD_B);
        registerBlockModel(ModBlocks.ROUNDEL_DOOR_1980);
        registerBlockModel(ModBlocks.ROUNDEL_DOOR_1983);
        registerBlockModel(ModBlocks.WALL_1980);
        registerBlockModel(ModBlocks.WALL_1983);
        registerBlockModel(ModBlocks.FAULT_LOCATOR_A);
    }

    private static void registerBlockModel(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
