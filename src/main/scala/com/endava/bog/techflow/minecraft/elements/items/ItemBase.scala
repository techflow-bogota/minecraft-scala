package com.endava.bog.techflow.minecraft.elements.items

import com.endava.bog.techflow.minecraft.ExampleMod
import com.endava.bog.techflow.minecraft.elements.ModelEnable
import com.endava.bog.techflow.minecraft.proxy.ClientProxy
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

class ItemBase(name: String, clientProxy: ClientProxy) extends Item with ModelEnable {

  setUnlocalizedName(name)
  setRegistryName(name)
  setCreativeTab(CreativeTabs.MATERIALS)

  override def registerModels(): Unit = clientProxy.registerItemRendered(this, 0, "inventory")

}
