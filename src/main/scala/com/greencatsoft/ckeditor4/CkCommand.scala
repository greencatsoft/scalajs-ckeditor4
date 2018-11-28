package com.greencatsoft.ckeditor4

import scala.scalajs.js

@js.native
trait CkCommand extends js.Object {

  def state: Int = js.native

  def enable(): Unit = js.native

  def disable(): Unit = js.native

  def exec(args: Any*): Unit = js.native
}
