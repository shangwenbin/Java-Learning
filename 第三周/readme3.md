# 图书馆借书与还书模拟

### 功能要求：

1. 需要通过多线程的手段模拟图书馆的借书与还书过程，为此需要设计两个线程：借书线程与还书线程；在日常生活中，借书与还书存在因果逻辑关系，但是在此题目中，借书线程与还书线程是否产生是相互独立的，互不影响的

2. 借书线程功能：每执行一个借书线程，图书馆内书本库存数目减1，并且借书完成后在控制台打印图书馆剩余书本库存；如果发现图书馆书本库存为0，则会在控制台提示暂时无书本可以借出，并且**等待**一个还书线程正常执行完成后再**继续执行**借书过程

3. 还书线程功能：每执行一个还书线程，图书馆内书本库存数目加1，并且还书完成后在控制台打印图书馆剩余书本库存；如果发现图书馆书本库存已满，则会在控制台提示无需还书，并且提前**终止**线程

4. 假定程序初始化时图书馆书本库存为1，库存上限为3（即有2本处于已经借出的状态）

### Borrow类

相当于生产者消费者模型的生产者，在这个类中调用了Book对象的borrowBook方法

### Return类

相当于生产者消费者模型的消费者，在这个类中调用了Book对象的returnBook方法

### Book类

定义了图书馆书籍的数目，以及还书和借书两个方法

### Main类

主函数创建线程任务对象和线程对象，进行测试