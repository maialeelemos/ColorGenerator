package view;

import java.io.IOException;

public class TextViewImpl implements GeneratorView {
  Appendable ap;
  // take in a read-only model?

  public TextViewImpl() {
    this.ap = System.out;
  }

  public TextViewImpl(Appendable ap) {
    if (ap == null) {
      throw new IllegalArgumentException("The appendable cannot be null");
    } else {
      this.ap = ap;
    }
  }

  @Override
  public void renderMessage(String message) throws IOException {
    this.ap.append(message);
  }
}
