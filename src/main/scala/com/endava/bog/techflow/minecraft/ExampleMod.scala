package com.endava.bog.techflow.minecraft

import com.endava.bog.techflow.minecraft.constants.References
import com.endava.bog.techflow.minecraft.proxy.CommonProxy
import net.minecraft.init.Blocks
import net.minecraft.item.Item
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.{Mod, SidedProxy}
import net.minecraftforge.fml.common.Mod.{EventHandler, Instance}
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent, FMLStateEvent}
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.common.registry.GameRegistry
import org.apache.logging.log4j.Logger

@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.MOD_VESION)
class ExampleMod {

  var logger: Logger = null

  @EventHandler
  def preInit(event: FMLPreInitializationEvent): Unit = {
    //Item/Block init and registering
    //Config Handling
    logger = event.getModLog()
    logger.info("preInit() event")
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

object ExampleMod {

  @SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.COMMON_PROXY_CLASS)
  var proxy: CommonProxy = null

}