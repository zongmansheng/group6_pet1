package com.qf.group6.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class DogGoods implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dog_goods.id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dog_goods.dog_name
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private String dogName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dog_goods.dog_price
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private BigDecimal dogPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dog_goods.dog_photo
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private String dogPhoto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dog_goods.dog_info
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private String dogInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dog_goods
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dog_goods.id
     *
     * @return the value of dog_goods.id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dog_goods.id
     *
     * @param id the value for dog_goods.id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dog_goods.dog_name
     *
     * @return the value of dog_goods.dog_name
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public String getDogName() {
        return dogName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dog_goods.dog_name
     *
     * @param dogName the value for dog_goods.dog_name
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setDogName(String dogName) {
        this.dogName = dogName == null ? null : dogName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dog_goods.dog_price
     *
     * @return the value of dog_goods.dog_price
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public BigDecimal getDogPrice() {
        return dogPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dog_goods.dog_price
     *
     * @param dogPrice the value for dog_goods.dog_price
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setDogPrice(BigDecimal dogPrice) {
        this.dogPrice = dogPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dog_goods.dog_photo
     *
     * @return the value of dog_goods.dog_photo
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public String getDogPhoto() {
        return dogPhoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dog_goods.dog_photo
     *
     * @param dogPhoto the value for dog_goods.dog_photo
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setDogPhoto(String dogPhoto) {
        this.dogPhoto = dogPhoto == null ? null : dogPhoto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dog_goods.dog_info
     *
     * @return the value of dog_goods.dog_info
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public String getDogInfo() {
        return dogInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dog_goods.dog_info
     *
     * @param dogInfo the value for dog_goods.dog_info
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setDogInfo(String dogInfo) {
        this.dogInfo = dogInfo == null ? null : dogInfo.trim();
    }
}