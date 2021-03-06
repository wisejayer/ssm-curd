package com.edu.dao;


import com.edu.pojo.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewMapper {


    int addNew(News news);

    int deleteNew(@Param("newid") int newid);

    int updateNew(News news);

    List<News> queryNew();

    News queryNewId(@Param("newid") int newid);
}
