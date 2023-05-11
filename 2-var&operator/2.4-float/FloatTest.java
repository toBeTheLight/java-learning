public class FloatTest {
  public static void main (String[] args) {
    // float 精度不够，需要加 F 后缀，否则会被认为是 double 类型，精度丢失
    float f1 = 123.123F;
    double d1 = 123.123;
    // double 类型精度更高
    System.out.println(f1);
    System.out.println(d1);

    // 精度丢失
    System.out.println(0.1 + 0.2);

    // 计算
    double p = 3.14;
    double r1 = 1.2;
    double r2 = 2.5;
    int r3 = 6;
    double area1 = p * r1 * r1;
    double area2 = p * r2 * r2;
    double area3 = p * r3 * r3;

    System.out.println(area1);
    System.out.println(area2);
    System.out.println(area3);
  }
}
