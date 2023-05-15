package com.frandev.dslist.dtos;

import com.frandev.dslist.entities.Game;

public class GameMinDTO {
  
  private Long id;
  private Integer year;
  private String title;
  private String imgUrl;
  private String shortDescription;
  
  
  public GameMinDTO() {
  }

  public GameMinDTO(Game entity) {
       id = entity.getId();
       title = entity.getTitle();
       year = entity.getYear();
       imgUrl = entity.getImgUrl();
       shortDescription = entity.getShortDescription();
  }


    public Long getId() {
        return id;
    }


    public Integer getYear() {
        return year;
    }


    public String getTitle() {
        return title;
    }


    public String getImgUrl() {
        return imgUrl;
    }


    public String getShortDescription() {
        return shortDescription;
    }

}
