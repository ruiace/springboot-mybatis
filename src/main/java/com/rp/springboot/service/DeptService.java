package com.rp.springboot.service;/**
 * Created by Administrator on 2018/9/13.
 */


import com.github.pagehelper.PageInfo;
import com.rp.springboot.beans.Dept;

/**
 * 〈一句话功能简述〉<br>
 * 〈dept service〉
 *
 * @author rp
 * @create 2018/9/13
 */
public interface DeptService {

    Dept findByName(String name);


    int insert(int id, String name);

    PageInfo<Dept> getDeptList(int pageNum,int pageSize);

}
