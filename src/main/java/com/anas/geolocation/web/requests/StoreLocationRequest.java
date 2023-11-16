package com.anas.geolocation.web.requests;

import lombok.Data;

@Data
public class StoreLocationRequest {
    public Double lat;
    public Double lon;
    public Integer user_id;
    public Integer case_id;
}
