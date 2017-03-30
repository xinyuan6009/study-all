package com.xinyuan.service

import com.xinyuan.dao.IBookDao
import com.xinyuan.entity.Book
import org.springframework.stereotype.Service

import javax.annotation.Resource

/**
 * Created by Intellij IDEA.
 * @Package com.xinyuan.service
 * @Description: ${TODO}
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/28
 * @Version V1.0
 */
@Service
class BookService {

    @Resource
    IBookDao bookDao;

    List<Book> getBooks() {
        bookDao.getBooks()
    }

    Book getBook(int id){
        bookDao.getBook(id)
    }
}
