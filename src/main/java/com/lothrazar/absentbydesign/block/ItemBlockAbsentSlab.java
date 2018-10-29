package com.lothrazar.absentbydesign.block;

import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

public class ItemBlockAbsentSlab extends ItemSlab {

  public ItemBlockAbsentSlab(BlockAbsentSlab block, BlockSlab singleSlab, BlockSlab doubleSlab) {
    super(block, singleSlab, doubleSlab);
  }

  public boolean isDouble() {
    return ((BlockAbsentSlab) this.getBlock()).isDouble();
  }
}
