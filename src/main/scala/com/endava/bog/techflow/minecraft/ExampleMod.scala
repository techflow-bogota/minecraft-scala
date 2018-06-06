package com.endava.bog.techflow.minecraft

import net.minecraft.init.Blocks
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent, FMLStateEvent}
import org.apache.logging.log4j.Logger

@Mod(modid = "sm", name = "First Scala Mod", version = "1.0")
class ExampleMod {

  var logger : Logger = null

  @EventHandler
  def preInit(event: FMLPreInitializationEvent): Unit = {
    //Block/Item initialization and registration
    //Config handling
     logger = event.getModLog()
  }

  @EventHandler
  def init(event: FMLInitializationEvent): Unit = {
    //Proxy, TileEntity, entity, GUI Registration

    logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName())
  }

  @EventHandler
  def postInit(event: FMLPostInitializationEvent): Unit = {

  }
}

