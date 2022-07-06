package model;

public interface GeneratorActions {
  void saveAsText();
  void saveAsImage();
  GeneratorActions applyCommand();
}
