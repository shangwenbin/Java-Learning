package simplelibrary;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Book {
    private int bookNum = 1;

    boolean flag = false;
    Lock lock = new ReentrantLock();//创建一个锁对象
    Condition bor_con = lock.newCondition();
    Condition ret_con = lock.newCondition();

    public void returnBook(){
        try {
            lock.lock();
            while(flag)
                ret_con.await();
            if(bookNum<=2){
                bookNum++;
                System.out.println(Thread.currentThread().getName()+"归还了一本书，当前还剩下"+bookNum+"本书");
            }
            if (bookNum == 3){
                System.out.println("当前所有书已经归还");
                ret_con.await();
            }

            flag = true;
            ret_con.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }



    }



    public void borrowBook(){
        try {
            lock.lock();
            while(!flag)
                bor_con.await();
            if(bookNum<=0){
                System.out.println("抱歉，当前没有书可借");
                bor_con.await();
            }
            else {
                bookNum--;
                System.out.println(Thread.currentThread().getName()+"借走了一本书，当前还剩下"+bookNum+"本书");
            }
            flag =false;
            ret_con.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }



    }
}


