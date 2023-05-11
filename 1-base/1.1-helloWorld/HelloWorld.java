// 1. 基本结构
// 类名与文件名同名

// 2. 运行
// javac 编译文件为字节码 class 文件
// java 运行 class 文件，不带后缀
// 此时类必须有 main 方法作为执行起点
class HelloWorld {
  // 3. 关键词
  // public 关键词为模块管理关键词，表明此方法对外开放
  // static 关键词表示为静态方法，即类不需要被实例化
  // void 表示方法无返回值
  public static void main (String[] args) {
    // java 中字符串必须为双引号
    System.out.println(args);
    System.out.println("hello world");
    Hello hello = new Hello();
    hello.print();
  }
}

/*
 * 4. 多个类
 * 当有多个类时，会生成多个字节码文件
 * 但是最多只能有一个 public 类
 */

// 5. 文档注释，双*开头
// 使用 javadoc 命令可生成文档注释文件

/**
 @author toBeTheLight
 @version 0.1
 @date 2023-05-11
 */
class Hello {
  void print () {
    System.out.println("hello");
  }
}