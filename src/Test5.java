import java.util.Scanner;

public class Test5 {
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

        // 会员卡号
        String number = "";

        // 注册标识
        boolean resisterFlag = false;

        // 登录标识
        boolean loginFlag = false;

        //登录次数
        int loginTimes = 0;

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
                loginTimes = 0;
                if(flag) {
                    if(userName != "" && passWord != "") {
                        while (loginTimes < 3) {
                            System.out.println("用户名：");
                            String user = input.next();
                            System.out.println("密码：");
                            String pw = input.next();
                            if( user.equals(userName) && pw.equals(passWord)) {
                                System.out.println("登录成功！");
                                loginFlag = true;
                                break;
                            } else {
                                loginTimes ++;
                                System.out.println("用户名或密码有误，请重新输入！");
                                System.out.println("最多有三次机会，现在还剩下" + (3 - loginTimes) + "次！");
                                if(loginTimes == 3) {
                                    System.out.println("本日登录次数已用完，请明日再进行登录！");
                                    flag = false;
                                }
                            }
                        }

                    } else {
                        System.out.println("请先注册用户，再进行登录！");
                    }
                }
            } else if (menu == 3) {
                System.out.println("[奖客富翁系统 > 抽奖]");
                if (loginFlag) { // 登录标识
                    System.out.println("请输入卡号！");
                    String cardNum = input.next();
                    if (cardNum.equals(number)) {
                        int count= 0;
                        String str = "";
                        for(int i = 1;i <=5;i ++) {
                            String nums = number();
                            if(nums.equals(number)) count++;
                            str += nums + "    ";
                        }
                        System.out.println("本日的幸运数字为：" + str);

                        if(count>0) {
                            System.out.println("恭喜您！");
                        } else {
                            System.out.println("抱歉！");
                        }

                    } else {
                        System.out.println("输入的会员卡号有误！");
                        System.out.println("继续吗？（y/n）");
                        always = input.next();
                        flag = isExit(always);
                        always = input.next();
                        flag = isExit(always);
                    }
                } else {
                    System.out.println("请先登录！");
                }
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
