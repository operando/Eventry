package com.operando.os.eventry.models;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Event {

    private String title;

    private String url;

    private String address;

    private String event_site;

}