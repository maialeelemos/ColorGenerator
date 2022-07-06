# ColorGenerator
COMMANDS:


MODEL:
Color (interface) :
- calcHexadecimal() : calculates the hexadecimal value for a color
- getRed :
- getGreen :
- getBLue :

ColorImpl (class) :
- made up of three values (red, green, blue)

GeneratorActions (interface) :
- saveAsText() :
- saveAsImage() :
- applyCommand() : what should its return type be? The model interface type?

GeneratorActionsImpl (class) :
- how to represent this with data? Does it even need fields?

CONTROLLER:
Controller (class) :
- generateColors() : synchronous controller that takes input from the user and delegates tasks
  to the model and controller to generate random colors as the user describes

VIEW:
text view :
- renderMessage(String) : prints the given message to the console or destination area
