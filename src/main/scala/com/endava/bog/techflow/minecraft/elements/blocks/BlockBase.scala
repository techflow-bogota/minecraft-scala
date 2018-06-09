package com.endava.bog.techflow.minecraft.elements.blocks

import com.endava.bog.techflow.minecraft.elements.ModelEnable
import com.endava.bog.techflow.minecraft.proxy.ClientProxy
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item


class BlockBase(name: String, clientProxy: ClientProxy, material: Material) extends Block(material) with ModelEnable {

  setUnlocalizedName(name)
  setRegistryName(name)
  setCreativeTab(CreativeTabs.BUILDING_BLOCKS)

  override def registerModels(): Unit = clientProxy.registerItemRendered(Item.getItemFromBlock(this), 0, "inventory")
}
