package thatbirdnerd.whoniverse.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;
import thatbirdnerd.whoniverse.Whoniverse;
import thatbirdnerd.whoniverse.block.BlockNonOpaque;
import thatbirdnerd.whoniverse.util.Reference;

import javax.annotation.Nullable;
import java.util.HashSet;

@EventBusSubscriber(modid = Reference.MOD_ID)
@ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    private static final HashSet<ItemBlock> ITEM_BLOCKS = new HashSet<>();

    @ObjectHolder("backwallhella")
    public static final Block WALL_HELL_A = null;

    @ObjectHolder("backwallhellb")
    public static final Block WALL_HELL_B = null;

    @ObjectHolder("blowup1963a")
    public static final Block BLOWUP_1963_A = null;

    @ObjectHolder("blowup1963b")
    public static final Block BLOWUP_1963_B = null;

    @ObjectHolder("blowup1963greya")
    public static final Block BLOWUP_1963_GREY_A = null;

    @ObjectHolder("blowup1963greyb")
    public static final Block BLOWUP_1963_GREY_B = null;

    @ObjectHolder("blowup1966a")
    public static final Block BLOWUP_1966_A = null;

    @ObjectHolder("blowup1966b")
    public static final Block BLOWUP_1966_B = null;

    @ObjectHolder("blowupasta")
    public static final Block BLOWUP_AST_A = null;

    @ObjectHolder("blowupastb")
    public static final Block BLOWUP_AST_B = null;

    @ObjectHolder("floor1963a")
    public static final Block FLOOR_1963_A = null;

    @ObjectHolder("floor1963b")
    public static final Block FLOOR_1963_B = null;

    @ObjectHolder("floor1963c")
    public static final Block FLOOR_1963_C = null;

    @ObjectHolder("floor1963d")
    public static final Block FLOOR_1963_D = null;

    @ObjectHolder("glass1963")
    public static final Block GLASS_1963 = null;

    @ObjectHolder("roundel1963a")
    public static final Block ROUNDEL_1963_A = null;

    @ObjectHolder("roundel1963b")
    public static final Block ROUNDEL_1963_B = null;

    @ObjectHolder("roundel1963c")
    public static final Block ROUNDEL_1963_C = null;

    @ObjectHolder("roundel1965a")
    public static final Block ROUNDEL_1965_A = null;

    @ObjectHolder("roundel1965b")
    public static final Block ROUNDEL_1965_B = null;

    @ObjectHolder("roundel1965c")
    public static final Block ROUNDEL_1965_C = null;

    @ObjectHolder("roundel1966a")
    public static final Block ROUNDEL_1966_A = null;

    @ObjectHolder("roundel1966b")
    public static final Block ROUNDEL_1966_B = null;

    @ObjectHolder("roundel1966c")
    public static final Block ROUNDEL_1966_C = null;

    @ObjectHolder("roundelasta")
    public static final Block ROUNDEL_AST_A = null;

    @ObjectHolder("roundelastb")
    public static final Block ROUNDEL_AST_B = null;

    @ObjectHolder("roundelastc")
    public static final Block ROUNDEL_AST_C = null;

    @ObjectHolder("roundelhella")
    public static final Block ROUNDEL_HELL_A = null;

    @ObjectHolder("roundelhellb")
    public static final Block ROUNDEL_HELL_B = null;

    @ObjectHolder("roundelhellc")
    public static final Block ROUNDEL_HELL_C = null;

    @ObjectHolder("totroundela")
    public static final Block TOT_ROUNDEL_A = null;

    @ObjectHolder("totroundelb")
    public static final Block TOT_ROUNDEL_B = null;

    @ObjectHolder("totroundelc")
    public static final Block TOT_ROUNDEL_C = null;

    @ObjectHolder("wall1963")
    public static final Block WALL_1963 = null;

    @ObjectHolder("wall1966")
    public static final Block WALL_1966 = null;

    @ObjectHolder("wallast")
    public static final Block WALL_AST = null;

    @ObjectHolder("wallroundela")
    public static final Block WALL_ROUNDEL_A = null;

    @ObjectHolder("wallroundelb")
    public static final Block WALL_ROUNDEL_B = null;

    @ObjectHolder("wallroundelc")
    public static final Block WALL_ROUNDEL_C = null;

    @ObjectHolder("wallroundeld")
    public static final Block WALL_ROUNDEL_D = null;

    @ObjectHolder("wardrobe1966bottom")
    public static final Block WARDROBE_1966_BOTTOM = null;

    @ObjectHolder("wardrobe1966top")
    public static final Block WARDROBE_1966_TOP = null;

    @ObjectHolder("ceiling1977")
    public static final Block CEILING_1977 = null;

    @ObjectHolder("overhead1976")
    public static final Block OVERHEAD_1976 = null;

    @ObjectHolder("pillar1977")
    public static final Block PILLAR_1977 = null;

    @ObjectHolder("platform1977")
    public static final Block PLATFORM_1977 = null;

    @ObjectHolder("roundel1972a")
    public static final Block ROUNDEL_1972_A = null;

    @ObjectHolder("roundel1972b")
    public static final Block ROUNDEL_1972_B = null;

    @ObjectHolder("roundel1972c")
    public static final Block ROUNDEL_1972_C = null;

    @ObjectHolder("roundel1976a")
    public static final Block ROUNDEL_1976_A = null;

    @ObjectHolder("roundel1976b")
    public static final Block ROUNDEL_1976_B = null;

    @ObjectHolder("roundel1976c")
    public static final Block ROUNDEL_1976_C = null;

    @ObjectHolder("roundel1976alta")
    public static final Block ROUNDEL_1976_ALT_A = null;

    @ObjectHolder("roundel1976altb")
    public static final Block ROUNDEL_1976_ALT_B = null;

    @ObjectHolder("roundel1976altc")
    public static final Block ROUNDEL_1976_ALT_C = null;

    @ObjectHolder("roundel1977")
    public static final Block ROUNDEL_1977 = null;

    @ObjectHolder("roundeldoor1976")
    public static final Block ROUNDEL_DOOR_1976 = null;

    @ObjectHolder("roundeldoortm")
    public static final Block ROUNDEL_DOOR_TM = null;

    @ObjectHolder("roundeltma")
    public static final Block ROUNDEL_TM_A = null;

    @ObjectHolder("roundeltmb")
    public static final Block ROUNDEL_TM_B = null;

    @ObjectHolder("roundeltmc")
    public static final Block ROUNDEL_TM_C = null;

    @ObjectHolder("roundeltmd")
    public static final Block ROUNDEL_TM_D = null;

    @ObjectHolder("slab1977")
    public static final Block SLAB_1977 = null;

    @ObjectHolder("wall1976")
    public static final Block WALL_1976 = null;

    @ObjectHolder("wall1977")
    public static final Block WALL_1977 = null;

    @ObjectHolder("walltop1977")
    public static final Block WALL_TOP_1977 = null;

    @ObjectHolder("window1977a")
    public static final Block WINDOW_1977_A = null;

    @ObjectHolder("window1977b")
    public static final Block WINDOW_1977_B = null;

    @ObjectHolder("window1977c")
    public static final Block WINDOW_1977_C = null;

    @ObjectHolder("door1980bottom")
    public static final Block DOOR_1980_BOTTOM = null;

    @ObjectHolder("door1980top")
    public static final Block DOOR_1980_TOP = null;

    @ObjectHolder("pillar1980")
    public static final Block PILLAR_1980 = null;

    @ObjectHolder("pillar1983")
    public static final Block PILLAR_1983 = null;

    @ObjectHolder("roundel1980a")
    public static final Block ROUNDEL_1980_A = null;

    @ObjectHolder("roundel1980b")
    public static final Block ROUNDEL_1980_B = null;

    @ObjectHolder("roundel1980c")
    public static final Block ROUNDEL_1980_C = null;

    @ObjectHolder("roundel1983a")
    public static final Block ROUNDEL_1983_A = null;

    @ObjectHolder("roundel1983b")
    public static final Block ROUNDEL_1983_B = null;

    @ObjectHolder("roundel1983c")
    public static final Block ROUNDEL_1983_C = null;

    @ObjectHolder("roundel1983alta")
    public static final Block ROUNDEL_1983_ALT_A = null;

    @ObjectHolder("roundel1983altb")
    public static final Block ROUNDEL_1983_ALT_B = null;

    @ObjectHolder("roundel1983greya")
    public static final Block ROUNDEL_1983_GREY_A = null;

    @ObjectHolder("roundel1983greyb")
    public static final Block ROUNDEL_1983_GREY_B = null;

    @ObjectHolder("roundelbattlefielda")
    public static final Block ROUNDEL_BATTLEFIELD_A = null;

    @ObjectHolder("roundelbattlefieldb")
    public static final Block ROUNDEL_BATTLEFIELD_B = null;

    @ObjectHolder("roundeldoor1980")
    public static final Block ROUNDEL_DOOR_1980 = null;

    @ObjectHolder("roundeldoor1983")
    public static final Block ROUNDEL_DOOR_1983 = null;

    @ObjectHolder("wall1980")
    public static final Block WALL_1980 = null;

    @ObjectHolder("wall1983")
    public static final Block WALL_1983 = null;

    @ObjectHolder("faultlocatora")
    public static final Block FAULT_LOCATOR_A = null;

    @ObjectHolder("black")
    public static final Block VOID = null;

    @ObjectHolder("table1963")
    public static final Block TABLE_1963 = null;

    @ObjectHolder("pillar2013")
    public static final Block PILLAR_2013 = null;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        IForgeRegistry<Block> forgeRegistry = event.getRegistry();

        registerBlock(new Block(Material.ROCK), "backwallhella", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "backwallhellb", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "blowup1963a", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "blowup1963b", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "blowup1963greya", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "blowup1963greyb", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "blowup1966a", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "blowup1966b", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "blowupasta", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "blowupastb", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "floor1963a", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "floor1963b", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "floor1963c", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "floor1963d", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "glass1963", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1963a", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1963b", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1963c", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1965a", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1965b", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1965c", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1966a", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1966b", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1966c", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundelasta", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundelastb", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundelastc", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundelhella", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundelhellb", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundelhellc", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "totroundela", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "totroundelb", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "totroundelc", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "wall1963", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "wall1966", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "wallast", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "wallroundela", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "wallroundelb", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "wallroundelc", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "wallroundeld", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "wardrobe1966bottom", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "wardrobe1966top", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "ceiling1977", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "overhead1976", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "pillar1977", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "platform1977", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1972a", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1972b", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1972c", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1976a", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1976b", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1976c", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1976alta", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1976altb", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1976altc", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1977", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundeldoor1976", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundeldoortm", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundeltma", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundeltmb", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundeltmc", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundeltmd", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "slab1977", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "wall1976", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "wall1977", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "walltop1977", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "window1977a", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "window1977b", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "window1977c", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "door1980bottom", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "door1980top", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "pillar1980", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "pillar1983", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1980a", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1980b", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1980c", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1983a", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1983b", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1983c", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1983alta", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1983altb", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1983greya", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundel1983greyb", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundelbattlefielda", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundelbattlefieldb", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundeldoor1980", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "roundeldoor1983", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "wall1980", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "wall1983", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "faultlocatora", forgeRegistry);
        registerBlock(new Block(Material.ROCK), "black",forgeRegistry);
        registerBlock(new BlockNonOpaque(Material.ROCK), "table1963",forgeRegistry);
        registerBlock(new Block(Material.ROCK), "pillar2013", forgeRegistry);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event)
    {
        IForgeRegistry<Item> forgeRegistry = event.getRegistry();

        for(ItemBlock itemBlock : ITEM_BLOCKS)
        {
            forgeRegistry.register(itemBlock);
        }
    }

    private static void registerBlock(Block block, String name, IForgeRegistry<Block> forgeRegistry)
    {
        registerBlock(block, name, null, forgeRegistry);
    }

    private static void registerBlock(Block block, String name, @Nullable TileEntity tileEntity, IForgeRegistry<Block> forgeRegistry)
    {
        registerBlock(block, name, Whoniverse.TAB_WHO, tileEntity, forgeRegistry, false);
    }

    private static void registerBlock(Block block, String name, @Nullable CreativeTabs creativeTab, @Nullable TileEntity tileEntity, IForgeRegistry<Block> forgeRegistry, boolean hasItemBlock)
    {
        block.setRegistryName(name).setUnlocalizedName(block.getRegistryName().toString()).setCreativeTab(creativeTab);
        if(tileEntity != null)
            GameRegistry.registerTileEntity(tileEntity.getClass(), name);
        forgeRegistry.register(block);
        if(!hasItemBlock)
            ITEM_BLOCKS.add((ItemBlock) new ItemBlock(block).setRegistryName(block.getRegistryName()).setUnlocalizedName(block.getRegistryName().toString()));
    }
}
