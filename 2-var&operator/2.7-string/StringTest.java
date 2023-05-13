public class StringTest {
  public static void main(String[] args) {
    String str1 = "123";
    String str2 = "";

    // c1 和 str3 完全不同
    String str3 = "a";
    char c1 = 'a';

    boolean b1 = true;
    long l1 = 1231231L;
    String s1 = "result";
    System.out.println(s1 + l1 + b1);
    // System.out.println(l1 + b1 + s1);
    String s2 = (String) l1;

  }
}
