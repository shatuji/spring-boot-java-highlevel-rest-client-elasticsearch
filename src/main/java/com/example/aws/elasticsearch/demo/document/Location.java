package com.example.aws.elasticsearch.demo.document;

import lombok.Data;

@Data
public class Location {
    private String lat;
    private String lon;

  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public String getLon() {
    return lon;
  }

  public void setLon(String lon) {
    this.lon = lon;
  }
}
