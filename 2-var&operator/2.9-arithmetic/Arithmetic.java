public class Arithmetic {
  public static void main (String[] args) {
    int m1 = 12;
    int m2 = 5;
    double m3 = 5.0;
    double m4 = m1 / m2; // 2.0，int 运算还是 int
    double m5 = m1 / m3; // 2.4
    double m6 = m1 / m2 * m2; // 10.0

    int a1 = 1;
    int a2 = 1;
    System.out.println(a1++ + 1); // 2
    System.out.println(++a2 + 1); // 3

    short s1 = 10;
    //s1 = s1 + 1; // 报错，short 与 int 的运算，需要强制类型转换
    s1 += 1;
    s1++; // 不会报错

    byte b1 = 127; 
    System.out.println(++b1); // -128，自增不会改变类型
  }
}
