import java.util.Stack;

public class ReverseString {

public static String reverse(String str) {

  Stack<Character> stack = new Stack();

  // push characters of the string into the stack

  char[] chars = str.toCharArray();

  for (char c : chars) {

    stack.push(c);

  }


  // pop all characters from the stack and

  // put them back to the input string

  for (int i = 0; i < str.length(); i++) {

    chars[i] = stack.pop();

  }

  // return the string

  return new String(chars);

}
public static void main(String[] args) {
  String reversed = reverse("Hello World!");
  System.out.println(reversed);
}
}