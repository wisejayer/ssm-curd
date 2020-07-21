package com.edu.service;

import com.edu.dao.NewMapper;
import com.edu.pojo.News;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewServiceImpl implements NewService{

    private NewMapper newMapper;

    public void setNewMapper(NewMapper newMapper) {
        this.newMapper = newMapper;
    }

    public int addNew(News news){
        return newMapper.addNew(news);
    }

    public int deleteNew(int newid){
        return newMapper.deleteNew(newid);
    }

    public int updateNew(News news){
        return newMapper.updateNew(news);
    }

    public List<News> queryNew(){
        return newMapper.queryNew();
    }

    public News queryNewId(int newid){
        return newMapper.queryNewId(newid);
    }
}
