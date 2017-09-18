package one.com;

import sun.security.action.PutAllAction;

import java.lang.reflect.Constructor;

/**
 * Created by 杨知锜
 * on 2017/9/19.
 */
public class HiWorld {
    public static void main (String[] args)throws Exception {
        Post post = new Post();
        post.title = "杨知锜第二次Github博客";
        post.content = "这是我的第二篇博客";
        post.print();
        Car myCar = new Car();
        myCar.startup();


    }
}