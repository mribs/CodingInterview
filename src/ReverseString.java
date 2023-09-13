import java.util.ArrayList;

public class ReverseString {
  String string;
  String reversedString;
  ArrayList<Character> characters;

  public ReverseString(String toReverse) {
    this.string = toReverse;
    this.characters = new ArrayList<>();
  }
  public String ReverseTheString() {
    //create reversed list of characters in string
    for (int i = 0; i < string.length(); i++) {
      characters.add(0, string.charAt(i));
      //System.out.println(characters);
    }
    //Build a new string
    StringBuilder reversedBuilder = new StringBuilder();
    for (char character : characters) {
      reversedBuilder.append(character);
    }
    reversedString = reversedBuilder.toString();

    return reversedString;
  }
}
