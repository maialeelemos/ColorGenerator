package model;

/**
 * This class represents a color characterized by its red, green, and blue components.
 */
public interface Color {

  /**
   * Returns the red component of a color.
   * @return the red component as an integer
   */
  int getRed();

  /**
   * Returns the green component of a color.
   * @return the green component as an integer
   */
  int getGreen();

  /**
   * Returns the blue component of a color.
   * @return the blue component as an integer
   */
  int getBlue();

  /**
   * Calculates the hexadecimal representation of a colors. (As an example the color white is
   * #FFFFFF and the color black is #000000.)
   * @return a hexadecimal and string representation of a color
   */
  String calcHexadecimal();
}
