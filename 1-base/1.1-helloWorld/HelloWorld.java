// 1. �����ṹ
// �������ļ���ͬ��

// 2. ����
// javac �����ļ�Ϊ�ֽ��� class �ļ�
// java ���� class �ļ���������׺
// ��ʱ������� main ������Ϊִ�����
class HelloWorld {
  // 3. �ؼ���
  // public �ؼ���Ϊģ�����ؼ��ʣ������˷������⿪��
  // static �ؼ��ʱ�ʾΪ��̬���������಻��Ҫ��ʵ����
  // void ��ʾ�����޷���ֵ
  public static void main (String[] args) {
    // java ���ַ�������Ϊ˫����
    System.out.println(args);
    System.out.println("hello world");
    Hello hello = new Hello();
    hello.print();
  }
}

/*
 * 4. �����
 * ���ж����ʱ�������ɶ���ֽ����ļ�
 * �������ֻ����һ�� public ��
 */

// 5. �ĵ�ע�ͣ�˫*��ͷ
// ʹ�� javadoc ����������ĵ�ע���ļ�

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