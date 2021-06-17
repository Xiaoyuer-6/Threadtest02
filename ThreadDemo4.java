/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-17
 * Time: 19:26
 *创建线程的a方法1：继承Thread类创建线程
 */
public class ThreadDemo4 {
    static  class MyThread extends Thread{
        @Override
        public void run() {
            //线程执行任务
            System.out.println("线程名称："+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();
        System.out.println("当前线程的名称（主线程）:"+Thread.currentThread().getName());
    }
}
