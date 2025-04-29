package basics;

public class EnumTask {
public enum RainbowColor {
  VIOLET(1), INDIGO(2), BLUE(3), GREEN(4),YELLOW(5), ORANGE(6), RED(7);
private final int colorCode;
RainbowColor(int code) {
  this.colorCode = code;
}
public int getColorCode() {
 return colorCode;
 }
}

}
