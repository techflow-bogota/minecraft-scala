package com.endava.bog.techflow.minecraft.proxy

import com.endava.bog.techflow.minecraft.elements.items.ItemBase
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraftforge.client.model.ModelLoader

class CommonProxy {
}

class ClientProxy extends CommonProxy {
  def registerItemRendered(itemBase: ItemBase, meta: Int, id: String): Unit =
    ModelLoader.setCustomModelResourceLocation(itemBase, meta, new ModelResourceLocation(itemBase.getRegistryName, id))

}