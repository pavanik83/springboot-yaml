package com.hoserdude.samples.boot.config;

public class Tool {

    private String name;
    private String matchUrl;

    public Tool(){
      //empty ctor
    }

    public Tool(String name,String matchUrl){
        this.name = name;
        this.matchUrl = matchUrl;
        //empty ctor
      }

    public String getName(){
        return name;
    }

    public void setName(String name){
       this.name= name;
    }
    public String getMatchUrl(){
        return matchUrl;
    }

    public void setMatchUrl(String matchUrl){
       this.matchUrl= matchUrl;
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        String ls = System.lineSeparator();
        sb.append(ls);
        sb.append("name:  " + name);
        sb.append(ls);
        sb.append("matchUrl:  " + matchUrl);
        sb.append(ls);
        return ls;
    }
}
