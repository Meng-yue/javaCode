import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        // 创建一个输入的类
        Scanner input=new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            welcome();
            System.out.println("请选择菜单：");
            int menu = input.nextInt();
            if( menu == 1 ) {
                System.out.println("[奖客富翁系统 > 注册]");
            } else if (menu == 2) {
                System.out.println("[奖客富翁系统 > 登录]");
            } else if (menu == 3) {
                System.out.println("[奖客富翁系统 > 抽奖]");
            } else {
                System.out.println("输入有误");
            }
            flag = false;

        }


    }
    // 定义一个系统标题函数，方便调用
    public static void welcome() {
        System.out.println("*****欢迎进入讲课富翁系统*****");
        System.out.println("     *****1.注册*****");
        System.out.println("     *****2.登录*****");
        System.out.println("     *****3.抽奖*****");
        System.out.println("***************************");
    }
}
