package com.hoserdude.samples.boot.config;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogeService {

   //@Autowired
    //private DogeSettings dogeSettings;

    @Autowired
    private DogeRepository dogeRepository;

    @Autowired
    private Tools tools;

    public boolean requiresDogeness() {
       // dogeSettings = dogSettinglist.getDogs().get(0);
        //if (dogeSettings.getWow() > 5 && dogeSettings.isVery() == true) {
           // return true;
      //  }
        return false;
    }


    /* excluded non-related code */

    @PostConstruct
    private void init(){
        List<Tool>  toolList = tools.getToolList();
        System.out.println(toolList.size());
        if(toolList.size() > 0){
            for(Tool t: toolList){
                System.out.println("kkkk"+t.getName()+"   :    "+t.getMatchUrl());
              //  logger.info(t.toString());
            }
        }else{
          //  logger.info("*****-----     tool size is zero     -----*****");
        }
    }

    public String leDoge() {
        return dogeRepository.getDogeData();
    }
}
