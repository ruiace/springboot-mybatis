package com.rp.springboot.controller;

import com.github.pagehelper.PageInfo;
import com.rp.springboot.beans.Dept;
import com.rp.springboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author rp
 * @create 2018/9/13
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/getdept/{name}")
    public  Dept getDeptByName(@PathVariable("name")String name){
        Dept byName = deptService.findByName(name);
        return byName;
    }

    @GetMapping("/insert/{id}/{name}")
    public boolean insert(@PathVariable("id") int id,@PathVariable("name")String name){
        int insert = deptService.insert(id, name);
        return insert>=1;
    }

    @GetMapping("/getall/{pageNum}/{pageSize}")
    public PageInfo<Dept> getAll(@PathVariable("pageNum") int pageNum,@PathVariable("pageSize") int pageSize){
        return deptService.getDeptList(pageNum,pageSize);
    }


}