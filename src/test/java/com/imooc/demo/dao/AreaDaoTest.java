package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;
import com.imooc.demo.entity.AreaExample;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void countByExample() throws Exception {
    }

    @Test
    public void deleteByExample() throws Exception {
    }

    @Test
    @Ignore
    public void deleteByPrimaryKey() throws Exception {
        int effectedNum = areaDao.deleteByPrimaryKey(1);
        assertEquals(1,effectedNum);
    }

    @Test
    public void insert() throws Exception {
        Area area = new Area();
        area.setAreaName("南苑");
        area.setPriority(1);
        int effectedNum = areaDao.insert(area);
        assertEquals(1,effectedNum);
    }

    @Test
    public void insertSelective() throws Exception {
    }

    @Test
    @Ignore
    public void selectByExample() throws Exception {
        AreaExample example = new AreaExample();

        List<Area> areaList = areaDao.selectByExample(example);
        assertEquals(2,areaList.size());

    }

    @Test
    @Ignore
    public void selectByPrimaryKey() throws Exception {
        Area area = areaDao.selectByPrimaryKey(1);
        assertEquals("东苑", area.getAreaName());
    }

    @Test
    public void updateByExampleSelective() throws Exception {
    }

    @Test
    @Ignore
    public void updateByExample() throws Exception {
        AreaExample example = new AreaExample();
        example.or().andAreaIdEqualTo(3);
        Area area = new Area();
        area.setAreaName("西苑");
        area.setAreaId(3);
        area.setLastEditTime(new Date());
        int effectedNum = areaDao.updateByExample(area,example);
        assertEquals(1,effectedNum);


    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {
    }

    @Test
    public void updateByPrimaryKey() throws Exception {
    }

}