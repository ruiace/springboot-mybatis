package com.rp.springboot.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rp.springboot.beans.Dept;
import com.rp.springboot.dao.DeptMapper;
import com.rp.springboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author rp
 * @create 2018/9/13
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept findByName(String name) {
        return deptMapper.findByName(name);
    }

    @Override
    public int insert(int id, String name) {
        return deptMapper.insert(id,name);
    }

    @Override
    public PageInfo<Dept> getDeptList(int pageNum,int pageSize) {

        // 开启分页插件,放在查询语句上面
        PageHelper.startPage(pageNum,pageSize);
        List<Dept> all = deptMapper.findAll();
        // 封装分页之后的数据
        PageInfo<Dept> info = new PageInfo(all);
        return info;
    }
}