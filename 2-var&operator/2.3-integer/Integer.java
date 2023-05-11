public class Integer {
  public static void main (String[] args) {
    byte b1 = 123;
    byte b2;
    short s1 = 1231;
    short s2 = 1232;
    // 小的向大的可以自动转换
    s1 = b1;
    // 大向小的转换需要强制转换，可能会丢失精度，即丢失二进制高位
    b2 = (byte) s1;
    int i1 = 123123;
    // long 型要以 L 结尾
    long l1 = 1231123123231L;

    System.out.printf("%d,%d,%d,%d,%d", b1, b2, s1, s2, i1, l1);
  }
}
