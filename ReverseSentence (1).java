import java.util.*;

public class ReverseSentence {

	public static void main(String[] args) {

		String s = "I love Java programming";
		String result = "", word = "";
		boolean spacefound=false;

		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);

			if (ch != ' ')
			{
				word = ch + word;
				spacefound=false;
			}
			else if(!spacefound && !word.isEmpty())
			{
				result += word + " ";
				word = "";
				spacefound=true;
			}

		}

		result+=word;
		System.out.println(result);
	}
}
