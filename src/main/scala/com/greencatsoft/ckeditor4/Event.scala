package com.greencatsoft.ckeditor4

import scala.scalajs.js

import org.scalajs.dom

@js.native
trait Event extends js.Object {

  def data: EventData = js.native

  def editor: CkEditor = js.native

  def stop(): Unit = js.native

  def cancel(): Unit = js.native
}

@js.native
trait EventData extends js.Object {

  def domEvent: dom.Event = js.native
}
