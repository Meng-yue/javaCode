import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        // 创建一个输入的类
        Scanner input=new Scanner(System.in);
        boolean flag = true;
        //菜单变量
        int menu;

        // 定义变量是否继续
        String always;

        // 用户名
        String userName = "";

        // 密码
        String passWord = "";

        // 注册标识
        boolean resisterFlag = false;

        // 会员卡号
        String number = "";
        while (flag) {
            welcome();
            System.out.println("请选择菜单：");
            menu = input.nextInt();
            if( menu == 1 ) {
                System.out.println("[奖客富翁系统 > 注册]");
                System.out.println("继续吗？（y/n）");
                always = input.next();
                flag = isExit(always);
                if(flag) {
                    System.out.println("请输入个人注册信息");
                    System.out.println("用户名：");
                    userName = input.next();
                    System.out.println("密码：");
                    passWord = input.next();
                    number = number();
                    resisterFlag = true;
                    if(resisterFlag) {
                        System.out.println("注册成功");
                        System.out.println("用户名     密码     会员卡号");
                        System.out.println(userName + "  " +passWord + "   " + number);
                        System.out.println("继续吗？（y/n）");
                        always = input.next();
                        flag = isExit(always);
                    }


                }
            } else if (menu == 2) {
                System.out.println("[奖客富翁系统 > 登录]");
                System.out.println("继续吗？（y/n）");
                always = input.next();
                flag = isExit(always);
            } else if (menu == 3) {
                System.out.println("[奖客富翁系统 > 抽奖]");
                System.out.println("继续吗？（y/n）");
                always = input.next();
                flag = isExit(always);
            } else {
                System.out.println("输入有误");
            }


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
    //
    public static boolean isExit(String always) {
        boolean flag = false;
        if(always.equals("y")) { // 继续
            flag = true;
        } else if(always.equals("n")) { // 不继续
            System.out.println("退出系统，谢谢使用！");
            flag = false;
        } else {
            System.out.println("输入有误");
            flag = false;
        }
        return flag;
    }
    public static String number () {
        String number = (int)((Math.random()*9+1)*1000)+ "";
        return number;
    }
}
