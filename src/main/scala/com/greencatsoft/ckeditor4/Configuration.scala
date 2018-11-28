package com.greencatsoft.ckeditor4

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.UndefOr.any2undefOrA
import scala.scalajs.js.{ Dictionary, UndefOr, | }

import scalacss.internal.Attrs.color

@js.native
trait Configuration extends js.Object {

  var coreStyles_bold: UndefOr[CoreStyleConfig] = js.native

  var coreStyles_italic: UndefOr[CoreStyleConfig] = js.native

  var font_blockWhileLoadingFont: UndefOr[Boolean] = js.native

  var contentsCss: UndefOr[String | js.Array[String]] = js.native

  var fillEmptyBlocks: UndefOr[Boolean] = js.native

  var enterMode: UndefOr[Int] = js.native

  var toolbar: UndefOr[js.Array[ToolbarConfig]] = js.native

  var extraAllowedContent: UndefOr[String] = js.native

  var extraPlugins: UndefOr[String] = js.native

  var removePlugins: UndefOr[String] = js.native

  var autoParagraph: UndefOr[Boolean] = js.native

  var ignoreEmptyParagraph: UndefOr[Boolean] = js.native

  var forceMergeBlocks: UndefOr[Boolean] = js.native

  var keystrokes: UndefOr[js.Array[js.Array[Any]]] = js.native

  var font_names: UndefOr[String] = js.native

  var removeButtons: UndefOr[String] = js.native

  var stylesSet: UndefOr[String | js.Array[StyleDefinition] | Boolean] = js.native

  var sharedSpaces: UndefOr[js.Dictionary[String]] = js.native

  var colorButton_colors: UndefOr[String] = js.native

  var colorButton_colorsPerRow: UndefOr[Int] = js.native
}

object Configuration {

  def apply(): GlobalConfigBuilder = new GlobalConfigBuilder

  case class KeyStroke(code: Int, function: String)

  class GlobalConfigBuilder extends ConfigurationBuilder[Configuration] {

    private var coreStylesBold: Option[CoreStyleConfig] = None

    private var coreStylesItalic: Option[CoreStyleConfig] = None

    private var fontBlockWhileLoadingFont: Option[Boolean] = None

    private var contentsCss: Seq[String] = Nil

    private var fillEmptyBlocks: Option[Boolean] = None

    private var enterMode: Option[Int] = None

    private var toolbar: Seq[ToolbarConfig] = Nil

    private var extraAllowedContent: Option[String] = None

    private var extraPlugins: Set[String] = Set.empty

    private var removedPlugins: Set[String] = Set.empty

    private var keyStrokes: Set[KeyStroke] = Set.empty

    private var autoParagraph: Option[Boolean] = None

    private var ignoreEmptyParagraph: Option[Boolean] = None

    private var forceMergeBlocks: Option[Boolean] = None

    private var fontNames: Seq[String] = Nil

    private var removeButtons: Option[String] = None

    private var sharedSpaces: Map[String, String] = Map.empty

    private var colorButtonColors: Seq[String] = Nil

    private var colorButtonColorsPerRow: Option[Int] = None

    def coreStyles_bold(config: CoreStyleConfig): this.type = {
      this.coreStylesBold = Some(config)
      this
    }

    def coreStyles_italic(config: CoreStyleConfig): this.type = {
      this.coreStylesItalic = Some(config)
      this
    }

    def font_blockWhileLoadingFont(value: Boolean): this.type = {
      this.fontBlockWhileLoadingFont = Some(value)
      this
    }

    def contentsCss(css: String*): this.type = {
      this.contentsCss ++= css.toSeq
      this
    }

    def fillEmptyBlocks(mode: Boolean): this.type = {
      this.fillEmptyBlocks = Some(mode)
      this
    }

    def enterMode(mode: Int): this.type = {
      this.enterMode = Some(mode)
      this
    }

    def toolbar(config: ToolbarConfig*): this.type = {
      this.toolbar ++= config.toSeq
      this
    }

    def extraAllowedContent(allowedContent: String): this.type = {
      this.extraAllowedContent = Some(allowedContent)
      this
    }

    def extraPlugins(plugins: String*): this.type = {
      this.extraPlugins = plugins.toSet
      this
    }

    def removePlugins(plugins: String*): this.type = {
      this.removedPlugins = plugins.toSet
      this
    }

    def keyStrokes(strokes: KeyStroke*): this.type = {
      this.keyStrokes = strokes.toSet
      this
    }

    def autoParagraph(mode: Boolean): this.type = {
      this.autoParagraph = Some(mode)
      this
    }

    def ignoreEmptyParagraph(mode: Boolean): this.type = {
      this.ignoreEmptyParagraph = Some(mode)
      this
    }

    def forceMergeBlocks(force: Boolean): this.type = {
      this.forceMergeBlocks = Some(force)
      this
    }

    def fontNames(names: Seq[String]): this.type = {
      this.fontNames = names
      this
    }

    def removeButtons(buttons: String): this.type = {
      this.removeButtons = Some(buttons)
      this
    }

    def shareToolbarSpace(position: String, id: String): this.type = {
      this.sharedSpaces += (position -> id)
      this
    }

    def colorButtonColors(color: String*): this.type = {
      this.colorButtonColors ++= color.toSeq
      this
    }

    def colorButtonColorsPerRow(colors: Int): this.type = {
      this.colorButtonColorsPerRow = Some(colors)
      this
    }

    override def build(): Configuration = {
      val configuration = new js.Object().asInstanceOf[Configuration]

      coreStylesBold.foreach(configuration.coreStyles_bold = _)
      coreStylesItalic.foreach(configuration.coreStyles_italic = _)
      fontBlockWhileLoadingFont.foreach(configuration.font_blockWhileLoadingFont = _)

      if (contentsCss.nonEmpty)
        configuration.contentsCss = contentsCss.toJSArray

      autoParagraph.foreach(configuration.autoParagraph = _)
      ignoreEmptyParagraph.foreach(configuration.ignoreEmptyParagraph = _)
      forceMergeBlocks.foreach(configuration.forceMergeBlocks = _)

      removeButtons.foreach(configuration.removeButtons = _)

      if (toolbar.nonEmpty)
        configuration.toolbar = toolbar.toJSArray

      enterMode.foreach(configuration.enterMode = _)

      extraAllowedContent.foreach(configuration.extraAllowedContent = _)

      if (extraPlugins.nonEmpty)
        configuration.extraPlugins = extraPlugins.mkString(",")

      if (removedPlugins.nonEmpty)
        configuration.removePlugins = removedPlugins.mkString(",")

      if (keyStrokes.nonEmpty) {
        configuration.keystrokes = keyStrokes.map(_.productIterator.toJSArray).toJSArray
      }

      if (fontNames.nonEmpty) {
        configuration.font_names = fontNames.mkString(";")
      }

      if (sharedSpaces.nonEmpty) {
        configuration.sharedSpaces = Dictionary(sharedSpaces.toSeq: _*)
      }

      if (colorButtonColors.nonEmpty) {
        configuration.colorButton_colors = colorButtonColors.mkString(",")
      }

      colorButtonColorsPerRow.foreach(configuration.colorButton_colorsPerRow = _)

      configuration
    }
  }
}
