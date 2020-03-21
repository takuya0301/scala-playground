sealed trait Color {
  def isChromatic: Boolean = this match {
    case GrayScale => false
    case RGB => true
  }
}
case object GrayScale extends Color
case object RGB extends Color

object ColorUtil {
  def isChromatic(color: Color): Boolean = color match {
    case GrayScale => false
    case RGB => true
  }
}

println("ColorUtil.isChromatic(GrayScale) = " + ColorUtil.isChromatic(GrayScale)) 
println("RGB.isChromatic = " + RGB.isChromatic)
