// 强制类型转换
public class ForceTransform {
  public static void main (String[] args) {
    double d1 = 12.3;
    short s1 = 1;
    // int i1 = d1;
    int i1 = 128;
    int i2 = (int) d1;
    double d2 = s1;
    double d3 = (double) s1;
    double d4 = (float) s1;
    // 0000 0000 0000 0000 0000 0000 1000 000 -> 128
    // ---- ---- ---- ---- ---- ---- 1000 000 -> -128
    byte s2 = (byte) i1;

    System.out.println(i2);
    System.out.println(s2);
    System.out.println(d2);
    System.out.println(d3);
    System.out.println(d4);
  }
}
