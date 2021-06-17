/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-17
 * Time: 19:42
 * 创建线程的方法2：继承Thread类创建线程
 */
public class ThreadDemo5 {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("线程名称："+Thread.currentThread().getName());
            }
        };
        thread.start();
       // System.out.println("线程名称："+Thread.currentThread().getName());
    }
}
