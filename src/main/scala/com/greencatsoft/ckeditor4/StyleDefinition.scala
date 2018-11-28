package com.greencatsoft.ckeditor4

import scala.scalajs.js
import scala.scalajs.js.{ Dictionary, UndefOr }

@js.native
trait StyleDefinition extends js.Object {

  var name: String = js.native

  var element: String = js.native

  var attributes: UndefOr[Dictionary[String]] = js.native

  var styles: UndefOr[Dictionary[String]] = js.native
}

object StyleDefinition {

  def apply(name: String, element: String): StyleDefinition = {
    require(name != null, "Missing argument 'name'.")
    require(element != null, "Missing argument 'element'.")

    val definition = (new js.Object).asInstanceOf[StyleDefinition]

    definition.name = name
    definition.element = element

    definition
  }
}
