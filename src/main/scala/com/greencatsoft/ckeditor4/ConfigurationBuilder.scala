package com.greencatsoft.ckeditor4

import scala.scalajs.js

trait ConfigurationBuilder[A <: js.Object] {

  def build(): A
}
