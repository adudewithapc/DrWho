package thatmartinguy.drwho;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import thatmartinguy.drwho.proxy.IProxy;

import static thatmartinguy.drwho.util.Reference.*;

@Mod(modid = MOD_ID, name = MOD_NAME, version = MOD_VERSION)
public class DrWho
{
    public static final CreativeTabs TAB_WHO = new CreativeTabs("drWho")
    {
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(Items.CLOCK);
        }
    };

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY)
    public static IProxy proxy;
}
