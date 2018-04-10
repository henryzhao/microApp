package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;
import com.imooc.demo.entity.AreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaDao {
    /**
     *
     * @param example
     * @return
     */
    long countByExample(AreaExample example);

    /**
     *
     * @param example
     * @return
     */
    int deleteByExample(AreaExample example);

    /**
     *
     * @param areaId
     * @return
     */
    int deleteByPrimaryKey(Integer areaId);

    /**
     *
     * @param record
     * @return
     */
    int insert(Area record);

    /**
     *
     * @param record
     * @return
     */
    int insertSelective(Area record);

    /**
     *
     * @param example
     * @return
     */
    List<Area> selectByExample(AreaExample example);

    /**
     *
     * @param areaId
     * @return
     */
    Area selectByPrimaryKey(Integer areaId);

    /**
     *
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example);

    /**
     *
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Area record);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Area record);
}