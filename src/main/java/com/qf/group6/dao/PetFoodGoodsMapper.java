package com.qf.group6.dao;

import com.qf.group6.entity.PetFoodGoods;

public interface PetFoodGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_food_goods
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_food_goods
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int insert(PetFoodGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_food_goods
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int insertSelective(PetFoodGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_food_goods
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    PetFoodGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_food_goods
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int updateByPrimaryKeySelective(PetFoodGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_food_goods
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int updateByPrimaryKey(PetFoodGoods record);
}