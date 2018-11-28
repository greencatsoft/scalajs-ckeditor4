package com.greencatsoft.ckeditor4

import scala.scalajs.js
import scala.scalajs.js.UndefOr

import org.scalajs.dom.html.Element

@js.native
trait Node extends js.Object {

  val $: UndefOr[Element] = js.native

  def remove(): Node = js.native

  def remove(preserveChildren: Boolean): Node = js.native
}
