package model;

import java.util.Random;

public class ColorImpl implements Color {
  private final int red;
  // INVARIANT(1): red >= 0
  private final int green;
  // INVARIANT(1): green >= 0
  private final int blue;
  // INVARIANT(1): blue >= 0

  public ColorImpl(int red, int green, int blue) throws IllegalArgumentException {
    if (red < 0 || green < 0 || blue < 0) {
      throw new IllegalArgumentException("Components cannot be less than 0");
    } else {
      this.red = red;
      this.green = green;
      this.blue = blue;
    }
  }

  // this might not be needed since a command will do this
  public ColorImpl(Random rand) {
    this.red = rand.nextInt();
    this.green = rand.nextInt();
    this.blue = rand.nextInt();
  }

  @Override
  public int getRed() {
    return this.red;
  }

  @Override
  public int getGreen() {
    return this.green;
  }

  @Override
  public int getBlue() {
    return this.blue;
  }

  @Override
  public String calcHexadecimal() {
    String hexRed = Integer.toHexString(this.red);
    String hexGreen = Integer.toHexString(this.green);
    String hexBlue = Integer.toHexString(this.blue);
    return "#" + hexRed + hexGreen + hexBlue;
    // can remove creating new instances to reduce memory space
  }
}
