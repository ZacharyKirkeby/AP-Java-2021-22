
// tests are created assuming you name the method palindrama, and it returns a String

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    palindrama("abcdedcba");
  }
//this was definitely not the most efficient way to do this
  public static String palindrama(String s) {
		String max = "";
		for (int i = 0; i < s.length(); i++) {
			char firstLetter = s.charAt(i);
			for (int j = s.length() - 1; j > i; j--) {
				char otherLetter = s.charAt(j);
				if (otherLetter == firstLetter) {
					String full = s.substring(i, j + 1);
					Palindrome(full);
					if (Palindrome(full) == true) {
						if (full.length() > max.length()) {
							max = full;
						}
					}
				}
			}
		}
		return max;
	}


public static String rest(String s) {
		return s.substring(1);
	}

	public static char first(String s) {
		return s.charAt(0);
	}

	public static String endToStart(String s) {
		if (s.length() == 1) {
			return s;
		} else {
			String end = endToStart(rest(s)) + first(s);
			return end;
		}
	}

	public static boolean Palindrome(String full) {
		String end = endToStart(rest(full)) + first(full);
		if (end.equals(full)) {
			return true;
		} else {
			return false;
		}
	}

}


