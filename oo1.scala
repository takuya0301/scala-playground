sealed trait Color {
  def isChromatic: Boolean
}

case object GrayScale extends Color {
  def isChromatic: Boolean = false
}

case object RGB extends Color {
  def isChromatic: Boolean = true
}

println("RGB.isChromatic = " + RGB.isChromatic)
