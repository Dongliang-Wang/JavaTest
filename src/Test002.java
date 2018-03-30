public class Test002 {
    int m_nAge = 0;
    String m_strName = "";
    public Test002(int age,String name){
        m_nAge = age;
        m_strName = name;
    }

    public static void main(String[] args){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.SMALL;
        System.out.println("输出对象的size：" + juice.size);
        Test002 oneDog = new Test002(3,"黑子");
        System.out.println("小狗的名字是：" + oneDog.m_strName + "   " + "小狗的年龄是："+ oneDog.m_nAge);
    }
}
class FreshJuice {
    enum FreshJuiceSize{SMALL,MEDIUM,LARGE}
    FreshJuiceSize size;
}
