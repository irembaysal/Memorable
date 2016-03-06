package model;

import java.util.List;

/**
 * Created by irembaysal on 5.03.2016.
 */
public class User {
    private String email;
    private Info info;
    private Photo photo;

    private String userIdentity; //it automatically being defined for only 30 seconds while paying order

    private List <Card> currentCards;
    private List <Card> historyCards;


}
