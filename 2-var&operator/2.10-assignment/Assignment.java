public class Assignment {
  public static void main(String[] args) {
    int a1, a2 = 10;

    int i1 = 3;
    i1 *= 1.4; // 编译器会自动加上强制类型转换 i1 = (int) (i1 * 1.4);
    System.out.println(i1); //4
  }
}
