package com.greencatsoft.ckeditor4

import scala.scalajs.js

import org.scalajs.dom.Element

@js.native
trait CkEditable extends js.Any {

  def $: Element = js.native

  def attachListener(obj: AnyRef, eventName: String, listenerFunction: js.Function): Unit = js.native
}
