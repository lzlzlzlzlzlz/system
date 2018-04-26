package com.iotek.biz;

import com.iotek.dao.EmpMapper;
import com.iotek.model.Emp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/4/26.
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpMapper empMapper;
    public boolean addEmp(Emp emp) {
        return empMapper.addEmp(emp);
    }
}
