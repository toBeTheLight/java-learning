public class Logical {
  public static void main(String[] args) {
    int a1 = 1;
    int a2 = 1;
    int a3 = 1;
    int a4 = 1;
    System.out.println("推荐使用逻辑且");
    System.out.println(a1++ == 2 & ++a1 == 3);
    System.out.println(a1); // 3 两部分都运行
    System.out.println(a2++ == 2 && ++a2 == 3);
    System.out.println(a2); // 2 第一部分为 false，第二部分不运行

    System.out.println("推荐使用逻辑或");
    System.out.println(a3++ == 1 | ++a3 == 3);
    System.out.println(a3); // 3 两部分都运行
    System.out.println(a4++ == 1 || ++a4 == 3);
    System.out.println(a4); // 2 第一部分为 true，第二部分不运行

    System.out.println("异或");
    System.out.println(true^false);
    System.out.println(false^false);
  }
}
