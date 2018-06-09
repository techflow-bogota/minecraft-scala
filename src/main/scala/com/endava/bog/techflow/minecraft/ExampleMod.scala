package com.endava.bog.techflow.minecraft

import com.endava.bog.techflow.minecraft.elements.blocks.BlockBase
import com.endava.bog.techflow.minecraft.constants.References
import com.endava.bog.techflow.minecraft.elements.GameElements
import com.endava.bog.techflow.minecraft.elements.items.ItemBase
import com.endava.bog.techflow.minecraft.proxy.ClientProxy
import net.minecraft.block.material.Material
import net.minecraft.item.ItemBlock
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import net.minecraftforge.fml.common.{Mod, SidedProxy}
import org.apache.logging.log4j.Logger

@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.MOD_VESION, modLanguage = References.MOD_LANG)
object ExampleMod {

  val instance = this

  var logger: Logger = _

  @SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.COMMON_PROXY_CLASS)
  var proxy: ClientProxy = _

  @EventHandler
  def preInit(event: FMLPreInitializationEvent): Unit = {
    //Item/Block init and registering
    //Config Handling
    logger = event.getModLog()
    logger.info("preInit() event")

    val blockBase = new BlockBase("ruby_block", ExampleMod.proxy, Material.IRON)

    GameElements.addItem(new ItemBase("ruby", ExampleMod.proxy))
    GameElements.addBlock(blockBase)
    GameElements.addItem(new ItemBlock(blockBase).setRegistryName(blockBase.getRegistryName))

  }

  @EventHandler
  def init(event: FMLInitializationEvent): Unit = {
    logger.info("init() event")
  }

  @EventHandler
  def postInit(event: FMLPostInitializationEvent): Unit = {
    //list of register items, blocks etc
    logger.info("postInit() event")
  }

}