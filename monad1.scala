// Option monad for mixing from basicColorKeywords
sealed trait Color {
  def isChromatic: Boolean
  def basicColorKeyword: Option[String]
}

case class GrayScale(v: Int) extends Color {
  def isChromatic: Boolean = false

  def basicColorKeyword: Option[String] = v match {
    case   0 => Some("black")
    case 192 => Some("silver")
    case 128 => Some("gray")
    case 255 => Some("white")
    case _ => None
  }
}

case class RGB(r: Int, g: Int, b: Int) extends Color {
  def isChromatic: Boolean = true

  def basicColorKeyword: Option[String] = (r, g, b) match {
    case (  0,   0,   0) => Some("black")
    case (192, 192, 192) => Some("silver")
    case (128, 128, 128) => Some("gray")
    case (255, 255, 255) => Some("white")
    case (128,   0,   0) => Some("maroon")
    case (255,   0,   0) => Some("red")
    case (128,   0, 128) => Some("purple")
    case (255,   0, 255) => Some("fuchsia")
    case (  0, 128,   0) => Some("green")
    case (  0, 255,   0) => Some("lime")
    case (128, 128,   0) => Some("olive")
    case (255, 255,   0) => Some("yellow")
    case (  0,   0, 128) => Some("navy")
    case (  0,   0, 255) => Some("blue")
    case (  0, 128, 128) => Some("teal")
    case (  0, 255, 255) => Some("aqua")
    case _ => None
  }
}

println("RGB(0, 0, 255).isChromatic = " + RGB(0, 0, 255).isChromatic)

println("RGB(0, 0, 255).basicColorKeyword = " + RGB(0, 0, 255).basicColorKeyword)
println("RGB(192, 0, 0).basicColorKeyword = " + RGB(192, 0, 0).basicColorKeyword)
