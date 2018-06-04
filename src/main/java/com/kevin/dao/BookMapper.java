package com.kevin.dao;

import com.kevin.model.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookMapper {
    /*int countByExample(BookExample example);

    int deleteByExample(BookExample example);*/

   // int deleteByPrimaryKey(Integer id);

   // int insert(Book record);

    //int insertSelective(Book record);

   /* List<Book> selectByExample(BookExample example);*/

    //Book selectByPrimaryKey(Integer id);

/*
    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);
*/

    /*int updateByExample(@Param("record") Book record, @Param("example") BookExample example);
*/
    //int updateByPrimaryKeySelective(Book record);

    //int updateByPrimaryKey(Book record);

    @Select("select * from book ")
    public List<Book> getAllBooks();
    @Select("select * from book where where id =#{id}")
    public Book getBookById(int id);
    @Insert("insert into book(id,title,typename,price,state) values(seq_book_nextval,#{title},#{typename}, #{price}, #{state})")
    public int add(Book book);
    @Update("update book set title=#{title},typename=#{typename}, price=#{price}, state=#{state} where id=#{id}")
    public int edit(Book book);
    @Delete("detele from book where id =#{id}")
    public int delete(int id);
}