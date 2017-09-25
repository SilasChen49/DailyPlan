package com.cm.service;

import com.cm.entity.Book;
import java.util.List;

/**
 * Created by hisen on 17-4-24.
 */
public interface BookService {
    Book getById(long bookId);
    List<Book> getList(int start, int pageNum);
    int addBook(Book book);
    int updateBook(Book book);
    int deleteBookById(long id);
}
