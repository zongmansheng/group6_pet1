package com.qf.group6.dao;

import com.qf.group6.entity.HisSearch;

public interface HisSearchMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table his_search
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table his_search
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int insert(HisSearch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table his_search
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int insertSelective(HisSearch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table his_search
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    HisSearch selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table his_search
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int updateByPrimaryKeySelective(HisSearch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table his_search
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int updateByPrimaryKey(HisSearch record);
}