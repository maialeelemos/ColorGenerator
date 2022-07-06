package view;

import java.io.IOException;

/**
 * Represents operations for the view that should be able to be displayed.
 */
public interface GeneratorView {
  /**
   * Displays a message to the user.
   *
   * @param message String representation of message to display.
   * @throws IOException if the string message cannot be sent to the destination
   */
  void renderMessage(String message) throws IOException;
}
