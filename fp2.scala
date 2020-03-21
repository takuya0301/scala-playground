sealed trait Color {
  def isChromatic: Boolean = this match {
    case GrayScale(_) => false
    case RGB(_, _, _) => true
  }

  def basicColorKeyword: Option[String] = this match {
    case GrayScale(  0) => Some("black")
    case GrayScale(192) => Some("silver")
    case GrayScale(128) => Some("gray")
    case GrayScale(255) => Some("white")
    case RGB(  0,   0,   0) => Some("black")
    case RGB(192, 192, 192) => Some("silver")
    case RGB(128, 128, 128) => Some("gray")
    case RGB(255, 255, 255) => Some("white")
    case RGB(128,   0,   0) => Some("maroon")
    case RGB(255,   0,   0) => Some("red")
    case RGB(128,   0, 128) => Some("purple")
    case RGB(255,   0, 255) => Some("fuchsia")
    case RGB(  0, 128,   0) => Some("green")
    case RGB(  0, 255,   0) => Some("lime")
    case RGB(128, 128,   0) => Some("olive")
    case RGB(255, 255,   0) => Some("yellow")
    case RGB(  0,   0, 128) => Some("navy")
    case RGB(  0,   0, 255) => Some("blue")
    case RGB(  0, 128, 128) => Some("teal")
    case RGB(  0, 255, 255) => Some("aqua")
    case _ => None
  }
}
case class GrayScale(v: Int) extends Color
case class RGB(r: Int, g: Int, b: Int) extends Color

object ColorUtil {
  def isChromatic(color: Color): Boolean = color match {
    case GrayScale(_) => false
    case RGB(_, _, _) => true
  }

  def basicColorKeyword(color: Color): Option[String] = color match {
    case GrayScale(  0) => Some("black")
    case GrayScale(192) => Some("silver")
    case GrayScale(128) => Some("gray")
    case GrayScale(255) => Some("white")
    case RGB(  0,   0,   0) => Some("black")
    case RGB(192, 192, 192) => Some("silver")
    case RGB(128, 128, 128) => Some("gray")
    case RGB(255, 255, 255) => Some("white")
    case RGB(128,   0,   0) => Some("maroon")
    case RGB(255,   0,   0) => Some("red")
    case RGB(128,   0, 128) => Some("purple")
    case RGB(255,   0, 255) => Some("fuchsia")
    case RGB(  0, 128,   0) => Some("green")
    case RGB(  0, 255,   0) => Some("lime")
    case RGB(128, 128,   0) => Some("olive")
    case RGB(255, 255,   0) => Some("yellow")
    case RGB(  0,   0, 128) => Some("navy")
    case RGB(  0,   0, 255) => Some("blue")
    case RGB(  0, 128, 128) => Some("teal")
    case RGB(  0, 255, 255) => Some("aqua")
    case _ => None
  }
}

println("ColorUtil.isChromatic(GrayScale(128)) = " + ColorUtil.isChromatic(GrayScale(128))) 
println("RGB(0, 0, 255).isChromatic = " + RGB(0, 0, 255).isChromatic)

println("ColorUtil.basicColorKeyword(GrayScale(128)) = " + ColorUtil.basicColorKeyword(GrayScale(128))) 
println("RGB(0, 0, 255).basicColorKeyword = " + RGB(0, 0, 255).basicColorKeyword)
println("RGB(192, 0, 0).basicColorKeyword = " + RGB(192, 0, 0).basicColorKeyword)
