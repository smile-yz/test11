package com.my.package4;
/*
问题描述：
需要一个公共方法，用来解决两个默认方法之间重复代码的问题
但是这个共有方法不应该让实现类使用，应该私有化

解决方法：
从java 9 开始，接口当中允许定义私有方法。
1.普通私有方法，解决多个默认方法之间重复代码问题
格式：
private 返回值类型 方法名称（参数列表） {
    方法体
}

2.静态私有方法，解决多个静态方法之间重复代码问题
格式：
private static 返回值类型 方法名称（参数列表） {
    方法体
}
 */
public interface Demo179MyInterfacePrivateA {
    public default void methodDefault1() {
        System.out.println("默认方法1");
        methodCommon();
    }
    public default void methodDefault2() {
        System.out.println("默认方法2");
        methodCommon();
    }
    private void methodCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
