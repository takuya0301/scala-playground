enum Color {
    GrayScale {
        boolean isChromatic() {
            return false;
        }
    },
    RGB {
        boolean isChromatic() {
            return true;
        }
    };

    abstract boolean isChromatic();
}

class ColorUtil {
    static boolean isChromatic(Color color) {
        switch (color) {
            case GrayScale: return false;
            case RGB: return true;
        }
        return false;
    }
}

System.out.println("ColorUtil.isChromatic(Color.GrayScale) = " + ColorUtil.isChromatic(Color.GrayScale));
System.out.println("Color.RGB.isChromatic() = " + Color.RGB.isChromatic());

/exit
