package com.dao;

import com.pojo.Blog;
import com.pojo.IDUtils;
import com.sun.xml.internal.bind.v2.model.core.ID;
import com.utils.MybatisUtils;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.util.*;

public class BlogTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("何俊");
        blog.setCreateTime(new Date());
        blog.setViews(999);

        mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("java如此简单");
        mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring如此简单");
        mapper.addBook(blog);

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void QueryBlogIf(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        map.put("title", "java如此简单");
        map.put("author","何俊");

        List<Blog> blogs = mapper.queryBlogIf(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void QueryBlogchoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();

        map.put("title","spring如此简单");
        List<Blog> blogs = mapper.queryBlogchoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
 