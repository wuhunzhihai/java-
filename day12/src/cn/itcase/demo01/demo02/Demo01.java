package cn.itcase.demo01.demo02;

public class Demo01 {
    public static void main(String[] args) {
        String s1= "hello";
        String s2="world";
        String s3= "Java";
        printLog();
    }
    //定义一个方法，用来打印日志信息
    //第一个参数为日志等级
    //第二个参数为要打印的日志信息；
    public static void printLog(int level,String msg){
        //判断，如果日志等级是1，那么就打印日志信息；
        if(level==1){
            System.out.println(msg);
        }
    }
}
