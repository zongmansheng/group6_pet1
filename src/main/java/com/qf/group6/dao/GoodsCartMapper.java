package com.qf.group6.dao;

import com.qf.group6.entity.GoodsCart;

public interface GoodsCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_cart
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_cart
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int insert(GoodsCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_cart
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int insertSelective(GoodsCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_cart
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    GoodsCart selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_cart
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int updateByPrimaryKeySelective(GoodsCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_cart
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    int updateByPrimaryKey(GoodsCart record);
}