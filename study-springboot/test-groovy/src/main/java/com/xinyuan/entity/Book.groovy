package com.xinyuan.entity

/**
 * Created by Intellij IDEA.
 * @Package com.xinyuan.entity
 * @Description: ${TODO}
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/28
 * @Version V1.0
 */
class Book {


    int id
    String title
    String description
    String pub_time
    String author

    Book() {
    }

    Book(int id, String title, String description, String pub_time, String author) {
        this.id = id
        this.title = title
        this.description = description
        this.pub_time = pub_time
        this.author = author
    }
}
