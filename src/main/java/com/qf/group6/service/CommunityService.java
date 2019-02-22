package com.qf.group6.service;

import com.qf.group6.entity.*;

import java.util.List;

/**
 * @Author: ZongMan
 * @Date: 2019/2/11 0011
 * @Time: 15:01
 * @Vsersion: 1.0
 **/

public interface CommunityService {

    /**
     * 通过当前用户的id查看关注的所有人的id
     * @param userId 当前用户的id
     * @return List集合
     */
    List<TopicUser> findByUserId(Integer userId);

    /**
     * 通过被关注人的id查看被关注的动态
     * @param userId 被关注人id
     * @return TopicUser对象
     */
    TopicUser findByBeUserId(Integer userId);


    /**
     * 通过用户id来查看话题详情页面
     * @param userId 用户id
     * @return TopicInfo对象
     */
    List<TopicInfo> findTopicInfoByUserId(Integer userId);

    /**
     *
     * @param userId
     * @return
     */
    TopicInfo findTopicByUserId(Integer userId);

    /**
     * 通过话题id查询评论列表
     * @param topicId 话题id
     * @return list列表
     */
    List<TopicInfo> findCommentByUserId(int topicId);


    /**
     * 添加评论
     * @param topicUser
     * @return
     */
    int addComment(TopicUser topicUser);

    /**
     * 关注或者取消关注功能
     * @param userFocusUser
     * @return
     */
    int focus(UserFocusUser userFocusUser);

    /**
     * 通过用户id查看用户信息
     * @param userId 用户id
     * @return UserInfo对象
     */
    UserInfo findUserInfoByUserId(Integer userId);


    /**
     * 发布动态
     * @param dynInfo 动态信息
     * @return 1成功
     */
    int myArtPublish(DynInfo dynInfo);

    /**
     * 精选查询
     * @return
     */
    List<TopicInfo> findAll();


    /**
     * 个人模块
     * @param userId 用户id
     * @return
     */
    List<TopicInfo> findByTopicInfo(Integer userId);



}
