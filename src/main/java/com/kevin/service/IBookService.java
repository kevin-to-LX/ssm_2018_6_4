package com.kevin.service;

import com.kevin.model.Book;

import java.util.List;

/**
 * Created by jinyugai on 2018/6/1.
 */
public interface IBookService {
    /**获得所有图书*/
    public List<Book> getAllBooks();
    /**获得单个图书对象通过编号*/
    public Book getBookById(int id);
    /**添加*/
    public int add(Book entity);
    /**编辑*/
    public int edit(Book entity);
    /**删除*/
    public int delete(int id);

    //多删除，重载

}
