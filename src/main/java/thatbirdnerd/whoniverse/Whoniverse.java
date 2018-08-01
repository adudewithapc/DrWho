package thatbirdnerd.whoniverse;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import thatbirdnerd.whoniverse.init.ModBlocks;
import thatbirdnerd.whoniverse.proxy.IProxy;

import static thatbirdnerd.whoniverse.util.Reference.*;

@Mod(modid = MOD_ID, name = MOD_NAME, version = MOD_VERSION)
public class Whoniverse
{
    public static final CreativeTabs TAB_WHO = new CreativeTabs("whoniverse")
    {
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModBlocks.ROUNDEL_1963_A);
        }
    };

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY)
    public static IProxy proxy;
}
