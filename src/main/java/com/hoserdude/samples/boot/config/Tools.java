package com.hoserdude.samples.boot.config;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(locations={"test.yml"},prefix = "tools.config")
public class Tools{
    private List<Tool> toolList = new ArrayList<>();
    public Tools(){
      //empty ctor
    }

    public List<Tool> getToolList(){
        return toolList;
    }


    @PostConstruct
    public void init() {
          for(Tool current : this.getToolList()) {
              System.out.println(current.getName()+"name" +current.getMatchUrl());
            }

        }



    public void setToolList(List<Tool> tools){
       this.toolList = tools;
    }
}