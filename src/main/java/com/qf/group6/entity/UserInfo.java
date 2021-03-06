package com.qf.group6.entity;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class UserInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_name
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_sex
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private String userSex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_pass
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private String userPass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_phone
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private String userPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_photo
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private String userPhoto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.pet_id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private Integer petId;



    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_info
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_id
     *
     * @return the value of user_info.user_id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_id
     *
     * @param userId the value for user_info.user_id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_name
     *
     * @return the value of user_info.user_name
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_name
     *
     * @param userName the value for user_info.user_name
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_sex
     *
     * @return the value of user_info.user_sex
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_sex
     *
     * @param userSex the value for user_info.user_sex
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_pass
     *
     * @return the value of user_info.user_pass
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_pass
     *
     * @param userPass the value for user_info.user_pass
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_phone
     *
     * @return the value of user_info.user_phone
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_phone
     *
     * @param userPhone the value for user_info.user_phone
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_photo
     *
     * @return the value of user_info.user_photo
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public String getUserPhoto() {
        return userPhoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_photo
     *
     * @param userPhoto the value for user_info.user_photo
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto == null ? null : userPhoto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.pet_id
     *
     * @return the value of user_info.pet_id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public Integer getPetId() {
        return petId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.pet_id
     *
     * @param petId the value for user_info.pet_id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setPetId(Integer petId) {
        this.petId = petId;
    }

}