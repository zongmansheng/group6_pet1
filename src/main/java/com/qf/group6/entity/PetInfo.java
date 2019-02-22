package com.qf.group6.entity;

import java.io.Serializable;
import java.util.Date;

public class PetInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pet_info.pet_id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private Integer petId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pet_info.pet_name
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private String petName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pet_info.pet_kind
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private String petKind;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pet_info.pet_birthday
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private Date petBirthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pet_info.pet_photo
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private String petPhoto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pet_info.user_id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pet_info
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet_info.pet_id
     *
     * @return the value of pet_info.pet_id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public Integer getPetId() {
        return petId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet_info.pet_id
     *
     * @param petId the value for pet_info.pet_id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet_info.pet_name
     *
     * @return the value of pet_info.pet_name
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public String getPetName() {
        return petName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet_info.pet_name
     *
     * @param petName the value for pet_info.pet_name
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setPetName(String petName) {
        this.petName = petName == null ? null : petName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet_info.pet_kind
     *
     * @return the value of pet_info.pet_kind
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public String getPetKind() {
        return petKind;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet_info.pet_kind
     *
     * @param petKind the value for pet_info.pet_kind
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setPetKind(String petKind) {
        this.petKind = petKind == null ? null : petKind.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet_info.pet_birthday
     *
     * @return the value of pet_info.pet_birthday
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public Date getPetBirthday() {
        return petBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet_info.pet_birthday
     *
     * @param petBirthday the value for pet_info.pet_birthday
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setPetBirthday(Date petBirthday) {
        this.petBirthday = petBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet_info.pet_photo
     *
     * @return the value of pet_info.pet_photo
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public String getPetPhoto() {
        return petPhoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet_info.pet_photo
     *
     * @param petPhoto the value for pet_info.pet_photo
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setPetPhoto(String petPhoto) {
        this.petPhoto = petPhoto == null ? null : petPhoto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet_info.user_id
     *
     * @return the value of pet_info.user_id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet_info.user_id
     *
     * @param userId the value for pet_info.user_id
     *
     * @mbggenerated Thu Jan 24 11:51:34 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}