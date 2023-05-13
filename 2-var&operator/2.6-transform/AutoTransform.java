// 自动类型提升
public class AutoTransform {
  public static void main (String[] args) {
    // 1. 自动转换
    byte b1 = 123;
    short s1 = 1231;
    char c1 = 'a';
    // 特殊情况
    // short s2 = b1 + s1;
    int i1 = b1 + s1;
    // char c2 = b1 + c1;
    int i2 = b1 + c1;
    // 整型常量为 int 类型
    // byte b2 = b1 + 1;
    int i3 = b1 + 1;

    // 练习1
    long l1 = 123L;
    long l2 = 123; // int -> long

    // 练习2
    float f1 = 12.3F;
    // double 无法转为 float
    // float f2 = 12.3;
    // 浮点常量为 double 类型
    double d1 = f1 + 1.1;
  }
}
