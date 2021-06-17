/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-16
 * Time: 20:13
 * 认识多线程
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        concorrency();
    }
//调用多线程的方法
    private static void concorrency() {
        Long stime = System.currentTimeMillis();
        //todo:执行30亿次循环



        Long etime = System.currentTimeMillis();
        System.out.println(etime-stime);
    }
}
