package com.endava.bog.techflow.minecraft.handlers

import com.endava.bog.techflow.minecraft.elements.{GameElements, ModelEnable}
import net.minecraft.item.Item
import net.minecraftforge.client.event.ModelRegistryEvent
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.Mod.EventBusSubscriber
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent

@EventBusSubscriber
object RegistryHandler {

  @SubscribeEvent
  def onItemRegister(event: RegistryEvent.Register[Item]): Unit = GameElements.items.foreach(event.getRegistry.registerAll(_))

  @SubscribeEvent
  def onModeRegister(event: ModelRegistryEvent): Unit = GameElements.items.collect { case item: ModelEnable => item.registerModels() }

}
