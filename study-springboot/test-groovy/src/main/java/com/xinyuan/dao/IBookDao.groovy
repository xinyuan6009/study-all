package com.xinyuan.dao

import com.xinyuan.entity.Book
import org.springframework.stereotype.Repository

/**
 * Created by Intellij IDEA.
 * @Package com.xinyuan.dao
 * @Description: ${TODO}
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/28
 * @Version V1.0
 */

@Repository
interface IBookDao {
    List<Book> getBooks()
    Book getBook(int id)
}
