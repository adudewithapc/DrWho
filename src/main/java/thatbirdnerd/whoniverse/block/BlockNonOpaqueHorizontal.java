package thatbirdnerd.whoniverse.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockNonOpaqueHorizontal extends WhoniverseHorizontalBlock
{
    public BlockNonOpaqueHorizontal(Material materialIn)
    {
        super(materialIn);
    }

    @Override
    public boolean isFullBlock(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
}
