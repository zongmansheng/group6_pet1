package com.qf.group6.dao;

import com.qf.group6.entity.DynInfo;

public interface DynInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dyn_info
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dyn_info
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int insert(DynInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dyn_info
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int insertSelective(DynInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dyn_info
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    DynInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dyn_info
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int updateByPrimaryKeySelective(DynInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dyn_info
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int updateByPrimaryKey(DynInfo record);
}