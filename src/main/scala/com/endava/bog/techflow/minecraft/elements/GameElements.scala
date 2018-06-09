package com.endava.bog.techflow.minecraft.elements


import com.endava.bog.techflow.minecraft.elements.items.ItemBase
import net.minecraft.block.Block
import net.minecraft.item.Item

import scala.collection.mutable.ArrayBuffer

object GameElements {

  val items: ArrayBuffer[Item] = ArrayBuffer.empty

  val blocks: ArrayBuffer[Block] = ArrayBuffer.empty

  def addItem(item: Item): ArrayBuffer[Item] = items += item

  def addBlock(block: Block): ArrayBuffer[Block] = blocks += block

}
