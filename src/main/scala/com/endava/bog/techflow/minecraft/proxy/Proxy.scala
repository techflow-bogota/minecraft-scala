package com.endava.bog.techflow.minecraft.proxy

import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.Item
import net.minecraftforge.client.model.ModelLoader

class CommonProxy {
}

class ClientProxy extends CommonProxy {
  def registerItemRendered(itemBase: Item, meta: Int, id: String): Unit =
    ModelLoader.setCustomModelResourceLocation(itemBase, meta, new ModelResourceLocation(itemBase.getRegistryName, id))

}