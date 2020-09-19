package com.wildchap.enumtest;

/**
 * 枚举类
 * 例如：男女，星期几，季节，订单状态
 *
 * 使用enum关键字定义枚举类(JDK5.0后)
 *
 * @author wildchap
 * @create 2020-09-19-13:04
 */
enum Season1{
    //默认public static final
    //对象之间用逗号
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "冰天雪地");

    private final String seasonName;
    private final String seasonDesc;

    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}

public class EnumTest {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        System.out.println(summer);
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
