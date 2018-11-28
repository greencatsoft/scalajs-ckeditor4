package com.greencatsoft.ckeditor4

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav

@js.native
trait ToolbarConfig extends js.Object {

  var name: String = js.native

  var items: js.Array[String] = js.native

  var groups: js.Array[String] = js.native
}

object ToolbarConfig {

  def apply(): ToolbarBuilder = new ToolbarBuilder()

  class ToolbarBuilder() extends ConfigurationBuilder[ToolbarConfig] {

    private var items: Seq[String] = Nil

    private var groups: Seq[String] = Nil

    def items(args: String*): this.type = {
      this.items ++= args.toSeq
      this
    }

    def groups(args: String*): this.type = {
      this.groups ++= args.toSeq
      this
    }

    override def build(): ToolbarConfig = {
      val configuration = new js.Object().asInstanceOf[ToolbarConfig]

      if (items.nonEmpty) configuration.items = items.toJSArray
      if (groups.nonEmpty) configuration.groups = groups.toJSArray

      configuration
    }
  }
}
