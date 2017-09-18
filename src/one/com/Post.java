package one.com;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.OutputUtil;

/**
 * Created by 杨知锜
 * on 2017/9/19.
 */
public class Post {
    String title;
    String content;
    int    id;

    void print ( ) {
        System.out.println(title);
        System.out.println(content);
    }
}
