package com.qf.group6.dao;

import com.qf.group6.entity.DogGoods;

public interface DogGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dog_goods
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dog_goods
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int insert(DogGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dog_goods
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int insertSelective(DogGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dog_goods
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    DogGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dog_goods
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int updateByPrimaryKeySelective(DogGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dog_goods
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int updateByPrimaryKey(DogGoods record);
}