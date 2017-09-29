package com.hisen.test;

import com.cm.entity.Book;
import com.cm.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hisenyuan on 2017/5/3 at 20:16.
 */
public class BookServiceImplTest extends BaseTest {
  @Autowired
  private BookService bookService;

  @Test
  public void getById() {
    //在service里面改了一下名字，其实就是dao里面的queryById
    Book book = bookService.getById(1);
    System.out.println(book);
  }
}
