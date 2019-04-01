package com.ssm.teamgys.controller;

import com.ssm.teamgys.domain.Team;
import com.ssm.teamgys.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * desc:
 * author:czf
 * time:2019\3\27 0027
 * version:
 */
@Controller
@RequestMapping("/team")
public class TeamController {

    @Autowired
    TeamService teamService;

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public String  delete(@RequestParam  String  teamId){



        teamService.deleteById(teamId);

        return"redirect:list.do";


    }


    /**
     * 用户添加
     * @param team
     * @return
     */
    @RequestMapping("/save")
    public String  save(Team team){
        teamService.save(team);


        return "redirect:list.do";

    }
/**
 * 用户查找
 */
    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView m = new ModelAndView("jsp/team");
        List<Team> teamList = teamService.findAll();
        m.addObject("teamList",teamList);
        return m;
    }




}