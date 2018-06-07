package com.endava.bog.techflow.minecraft

import net.minecraft.init.Blocks
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent, FMLStateEvent}
import org.apache.logging.log4j.Logger

@Mod(modid = "scalamod", name = "Example Scala Mod", version = "1.0")
class ExampleMod {

  var logger : Logger = null

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

