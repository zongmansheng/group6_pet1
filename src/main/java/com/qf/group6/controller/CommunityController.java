package com.qf.group6.controller;

import com.qf.group6.entity.*;
import com.qf.group6.service.CommunityService;
import com.qf.group6.utils.R;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.sql.Date;
import java.util.List;

/**
 * @Author: ZongMan
 * @Date: 2019/2/11 0011
 * @Time: 14:36
 * @Vsersion: 1.0
 **/
@Controller
public class CommunityController {

    @Resource
    private CommunityService communityService;


    @RequestMapping("/dynamic/fallow/getAll")
    @ResponseBody
    public List<TopicUser> fallow(UserInfo userInfo) {
        userInfo.setUserId(2);
        if (userInfo != null) {
            return communityService.findByUserId(userInfo.getUserId());
        }
        return null;
    }

    @RequestMapping("/dynamic/detail/getList")
    @ResponseBody
    public List<TopicInfo> detail(TopicUser topicUser) {
        topicUser.setUserId(2);
        List<TopicInfo> infoList = communityService.findTopicInfoByUserId(topicUser.getUserId());
        return infoList;
    }


    /**
     * 分享
     *
     * @param topicUser
     * @param model
     * @return
     */
    @RequestMapping("/dynamic/detail/share")
    public String share(TopicUser topicUser, Model model) {
        topicUser.setUserId(2);
        TopicInfo topicInfo = communityService.findTopicByUserId(topicUser.getUserId());
        model.addAttribute("topicInfo", topicInfo);
        if (topicInfo == null) {
            return "动态详情.html";
        }
        return "分享页面.html";
    }

    /**
     * 通过话题id查询评论列表
     *
     * @param topicId
     * @return
     */
    @RequestMapping("/dynamic/getOne")
    @ResponseBody
    public List<TopicInfo> comment(Integer topicId) {
        System.out.println(topicId);

        return communityService.findCommentByUserId(topicId);
    }

    @RequestMapping("/dynamic/detail/send")
    public R send(UserInfo userInfo, TopicUser topicUser) {
        topicUser.setTopicId(topicUser.getTopicId());
        topicUser.setUserId(userInfo.getUserId());
        topicUser.setTopicComContent(topicUser.getTopicComContent());
        topicUser.setTopicComDate(new Date(System.currentTimeMillis()));
        int i = communityService.addComment(topicUser);
        if (i > 0) {
            return R.ok();
        }
        return R.ok("发送失败");
    }

    /**
     * 点击关注或取消关注功能
     *
     * @return
     */
    @RequestMapping("/focus/change")
    public R change(UserInfo userInfo, UserInfo beUserInfo) {
        //当前用户id
        Integer userId = userInfo.getUserId();

        //被关注用户id
        Integer beUserId = beUserInfo.getUserId();
        UserFocusUser userFocusUser = new UserFocusUser();
        userFocusUser.setUserId(userId);
        userFocusUser.setBeuserId(beUserId);
        int num = communityService.focus(userFocusUser);

        return num > 0 ? R.ok() : R.error("关注失败");
    }


    @RequestMapping("/show/images")
    public R showPhoto(UserInfo userInfo, HttpSession session, HttpServletResponse response) {
        userInfo.setUserId(1);
        UserInfo userInfo1 = communityService.findUserInfoByUserId(userInfo.getUserId());
        if (userInfo1 == null) {
            return R.error("没有用户登录");
        }
        String realPath = userInfo1.getUserPhoto();
        System.out.println(realPath + File.separator);
        File file = new File(realPath);
        try (FileInputStream fin = new FileInputStream(file);
             OutputStream out = response.getOutputStream();
        ) {
            byte[] buffer = new byte[1024];
            int count = 0;
            while ((count = fin.read(buffer)) != -1) {
                out.write(buffer, 0, count);
                out.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return R.ok();
    }


    /**
     * 发布动态信息
     * @param dynInfo 动态信息
     * @return
     */
    @RequestMapping("/dynMvArtPublish")
    public int myArtPublish(@RequestBody DynInfo dynInfo) {

        System.out.println(dynInfo.getDynBody());
        System.out.println(dynInfo.getDynContent());
        System.out.println(dynInfo.getDynTitle());
        dynInfo.setId(dynInfo.getId());
        dynInfo.setDynDate(new Date(System.currentTimeMillis()));
        dynInfo.setDynPhoto("http://www.zongmansheng.xyz/timg2.jpg");
        dynInfo.setDynCover("http://www.zongmansheng.xyz/001.jpg");
        dynInfo.setDynVideo("http://www.zongmansheng.xyz/001.jpg");
        dynInfo.setDynTitle(dynInfo.getDynTitle());
        dynInfo.setDynAbstract(dynInfo.getDynAbstract());
        dynInfo.setDynContent(dynInfo.getDynContent());
        dynInfo.setDynBody(dynInfo.getDynBody());
        dynInfo.setUserId(dynInfo.getUserId());
        return communityService.myArtPublish(dynInfo);

    }

    /**
     * 精选查询
     */
    @RequestMapping("/dynamic/getAll")
    @ResponseBody
    public List<TopicInfo> getAll() {
        List<TopicInfo> topicInfoList = communityService.findAll();
        return topicInfoList;
    }
    /**
     * 个人动态列表查询  查询当前用户动态信息
      * @param userId 用户id
     * @return
     */
    @RequestMapping("dynamic/mine/getAll")
    @ResponseBody
    public List<TopicInfo> get(Integer userId){

        List<TopicInfo> topicInfo1 = communityService.findByTopicInfo(userId);

        return  topicInfo1;

    }




}
