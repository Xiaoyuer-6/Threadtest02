/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-16
 * Time: 19:55
 * 初识线程逐字打印一句话
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        String content ="你是弱者，我是邪恶的人。但我在努力着，努力着要成为守护者。";
        for (char item: content.toCharArray()){
            Thread.sleep(300);
            System.out.print(item);
        }
    }

}
