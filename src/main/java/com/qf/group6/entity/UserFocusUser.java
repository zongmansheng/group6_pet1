package com.qf.group6.entity;

import java.io.Serializable;

public class UserFocusUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_focus_user.id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_focus_user.user_id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_focus_user.beuser_id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private Integer beuserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_focus_user
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_focus_user.id
     *
     * @return the value of user_focus_user.id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_focus_user.id
     *
     * @param id the value for user_focus_user.id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_focus_user.user_id
     *
     * @return the value of user_focus_user.user_id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_focus_user.user_id
     *
     * @param userId the value for user_focus_user.user_id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_focus_user.beuser_id
     *
     * @return the value of user_focus_user.beuser_id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public Integer getBeuserId() {
        return beuserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_focus_user.beuser_id
     *
     * @param beuserId the value for user_focus_user.beuser_id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setBeuserId(Integer beuserId) {
        this.beuserId = beuserId;
    }
}