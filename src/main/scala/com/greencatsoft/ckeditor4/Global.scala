package com.greencatsoft.ckeditor4

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobalScope

import org.scalajs.dom.html.Element

@js.native
trait Global extends js.Object {

  var disableAutoInline: Boolean = js.native

  def inline(elem: Element): CkEditor = js.native

  def inline(elem: Element, config: Configuration): CkEditor = js.native

  def replace(elem: Element): CkEditor = js.native

  def replace(elem: Element, config: Configuration): CkEditor = js.native

  val instances: js.Dictionary[CkEditor] = js.native

  val ENTER_BR: Int = js.native

  val ENTER_DIV: Int = js.native

  val ENTER_P: Int = js.native

  val TRISTATE_DISABLED: Int = js.native

  val TRISTATE_ON: Int = js.native

  val TRISTATE_OFF: Int = js.native
}

@js.native
@JSGlobalScope
object Global extends js.Object {

  val CKEDITOR: Global = js.native
}
