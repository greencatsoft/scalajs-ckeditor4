package com.greencatsoft.ckeditor4

import scala.scalajs.js
import scala.scalajs.js.JSConverters.JSRichGenMap

@js.native
trait CoreStyleConfig extends js.Object {

  var element: String = js.native

  var attributes: js.Dictionary[String] = js.native

  var overrides: String = js.native
}

object CoreStyleConfig {

  def apply(element: String): CoreStyleBuilder = new CoreStyleBuilder(element)

  class CoreStyleBuilder(private val element: String) extends ConfigurationBuilder[CoreStyleConfig] {

    private var attributes: Map[String, String] = Map.empty

    private var overrides: Option[String] = None

    def attributes(values: Map[String, String]): this.type = {
      this.attributes ++= values
      this
    }

    def overrides(value: String) {
      require(value != null)

      this.overrides = Some(value)
    }

    override def build(): CoreStyleConfig = {
      val configuration = new js.Object().asInstanceOf[CoreStyleConfig]

      configuration.element = element
      if (attributes.nonEmpty) configuration.attributes = attributes.toJSDictionary
      overrides.foreach(configuration.overrides = _)

      configuration
    }
  }

}
