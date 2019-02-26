package cn.itcase.demo01;

public class Demo01 {
    public static void main(String[] args) {
        //使用匿名内部类当做参数
        method(new Sumable() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        });
        //使用Lambda表达式；
        //method((a,b)->a+b);
    }
    public static void method (Sumable sumable){
        int sum = sumable.sum(10,20);
        System.out.println(sum);
		System.out.println("段世豪");
    }
}
