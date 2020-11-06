package com.dao;

import com.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    int addBook(Blog blog);
    List<Blog> queryBlogIf(Map map);
    List<Blog> queryBlogchoose(Map map);
}
