package com.greencatsoft.ckeditor4

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@js.native
trait CkEditor extends js.Object {

  val element: Node = js.native

  val container: Node = js.native

  def getData(): String = js.native

  def setData(data: String): Unit = js.native

  def setData(data: String, callback: js.Function0[Unit]): Unit = js.native

  def focus(): Unit = js.native

  def editable(): CkEditable = js.native

  def getCommand(command: String): UndefOr[CkCommand] = js.native

  def execCommand(command: String): Unit = js.native

  def execCommand(command: String, args: js.Any): Unit = js.native

  def destroy(): Unit = js.native

  def destroy(noUpdate: Boolean): Unit = js.native

  def checkDirty(): Boolean = js.native

  def resetDirty(): Unit = js.native

  def resetUndo(): Unit = js.native

  def on(event: String, handler: js.ThisFunction0[CkEditor, Unit]): Unit = js.native

  def on(event: String, handler: js.ThisFunction1[CkEditor, Event, Unit]): Unit = js.native
}

object CkEditor {

  val ClassToolbar = "cke"

  val ClassContainer = "cke_editable"
}
