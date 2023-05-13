public class CharTest {
  public static void main (String[] args) {
    // 表现1
    char c11 = '1';
    char c12 = 'a';
    // 表现2
    char c21 = '\u0036';
    // 表现3
    char c31 = '\n';
    char c32 = '\t';
    // 表现4
    char c41 = 97;
    char c42 = 1;

    System.out.printf("%c,%c,%c,%c", c11,c31,c12,c32,c21);
  }
}
