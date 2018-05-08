package com.endava.bog.techflow.minecraft

import net.minecraft.init.Blocks
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPreInitializationEvent, FMLStateEvent}
import org.apache.logging.log4j.Logger

@Mod(modid = "scalamod", name = "Example Scala Mod", version = "1.0")
class ExampleMod {

  var logger : Logger = null

  def preInit(event: FMLPreInitializationEvent): Unit = {
     logger = event.getModLog()
  }

  def init(event: FMLInitializationEvent): Unit = {

    logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName())
  }
}

