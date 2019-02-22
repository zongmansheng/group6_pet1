package com.qf.group6.service.impl;

import com.qf.group6.dao.*;
import com.qf.group6.entity.*;
import com.qf.group6.service.CommunityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ZongMan
 * @Date: 2019/2/11 0011
 * @Time: 15:03
 * @Vsersion: 1.0
 **/
@Service
public class CommunityServiceImpl implements CommunityService {
    @Resource
    private UserFocusUserMapper focusUserMapper;
    @Resource
    private TopicUserMapper topicUserMapper;
    @Resource
    private TopicInfoMapper topicInfoMapper;
    @Resource
    private UserInfoMapper userInfoMapper;
    @Resource
    private DynInfoMapper dynInfoMapper;


    @Override
    public List<TopicUser> findByUserId(Integer userId) {
        System.out.println(userId);
        List<UserFocusUser> byUserId = focusUserMapper.findByUserId(userId);
        List<Integer> list = new ArrayList();
        List<TopicUser> topicUsers = new ArrayList<>();
        for (int i = 0; i < byUserId.size(); i++) {
            list.add(byUserId.get(i).getBeuserId());
        }

        for (Integer id : list) {
         TopicUser topicUser = topicUserMapper.findByUserId(id);
            topicUsers.add(topicUser);
       }
        return topicUsers;
    }


    @Override
    public TopicUser findByBeUserId(Integer userId) {
         return topicUserMapper.findByUserId(userId);
    }

    @Override
    public List<TopicInfo> findTopicInfoByUserId(Integer userId) {
        return topicInfoMapper.findTopicInfoByUserId(userId);
    }

    @Override
    public TopicInfo findTopicByUserId(Integer userId) {
        return topicInfoMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<TopicInfo> findCommentByUserId(int topicId) {
        return topicInfoMapper.findComment(topicId);
    }

    @Override
    public int addComment(TopicUser topicUser) {
        return topicUserMapper.insert(topicUser);


    }

    @Override
    public int focus(UserFocusUser userFocusUser) {
        return focusUserMapper.insert(userFocusUser);
    }



    @Override
    public UserInfo findUserInfoByUserId(Integer userId) {
        return userInfoMapper.findUserInfoByUserId(userId);
    }

    @Override
    public int myArtPublish(DynInfo dynInfo) {
        return dynInfoMapper.insert(dynInfo);
    }

    @Override
    public List<TopicInfo> findAll() {

        return topicInfoMapper.findAll();
    }

    @Override
    public List<TopicInfo> findByTopicInfo(Integer userId) {
        return topicInfoMapper.findByUserId(userId);

    }


}
