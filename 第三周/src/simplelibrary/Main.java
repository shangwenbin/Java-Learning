package simplelibrary;

/**
 * 使用多线程完成一个简易的图书馆借还书系统
 * @author Wenbin Shang
 * @version 1.0 2020/5/31
 */

public class Main {
    public static void main(String[] args) {
        Book b = new Book();

        Borrow bor = new Borrow(b);
        Return ret = new Return(b);

        Thread t1 = new Thread(bor);
        Thread t2 = new Thread(bor);
        Thread t3 = new Thread(ret);
        Thread t4 = new Thread(ret);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
