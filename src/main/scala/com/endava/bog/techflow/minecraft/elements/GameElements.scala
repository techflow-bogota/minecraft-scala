package com.endava.bog.techflow.minecraft.elements

import com.endava.bog.techflow.minecraft.elements.items.ItemBase
import net.minecraft.item.Item

import scala.collection.mutable.ArrayBuffer

object GameElements {

  val items: ArrayBuffer[ItemBase] = ArrayBuffer.empty

  def addItem(item: ItemBase): ArrayBuffer[ItemBase] = items += item

}
