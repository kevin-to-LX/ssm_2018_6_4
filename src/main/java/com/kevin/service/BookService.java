package com.kevin.service;

import com.kevin.dao.BookMapper;
import com.kevin.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jinyugai on 2018/6/1.
 */
@Service
public class BookService implements IBookService {
    @Autowired
    BookMapper bookDao;

    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    public Book getBookById(int id) {
        return bookDao.getBookById(id);
    }

    public int add(Book entity) {
        return bookDao.add(entity);
    }

    public int edit(Book entity) {
        return bookDao.edit(entity);
    }

    public int delete(int id) {
        return bookDao.delete(id);
    }
    public int delete(int[] ids){
        int rows =0;
        for(Integer id:ids){
            rows +=delete(id);
        }
        return rows;
    }
}
