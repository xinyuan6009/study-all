package com.xinyuan.controller

import com.xinyuan.entity.Book
import com.xinyuan.service.BookService
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import javax.annotation.Resource

/**
 * Created by Intellij IDEA.
 * @Package com.xinyuan.controller
 * @Description: ${TODO}
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/28
 * @Version V1.0
 */
@RestController
class BookController {


    @Resource
    BookService service;

    @RequestMapping('/books')
    List<Book> getBooks() {
        service.getBooks()
    }

    @RequestMapping('/book/{id}')
    Book getBook(@PathVariable('id')int id) {
        service.getBook(id)
    }
}
