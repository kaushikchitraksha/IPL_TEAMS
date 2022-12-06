package com.example.ipl_teams;

public class Players {
    private int mImageRecId;
    private String mPlayerName;
    private String mUrl;

    public Players(int ImgId,String PlayerName,String Url){
        mImageRecId = ImgId;
        mPlayerName = PlayerName;
        mUrl = Url;

    }
    public int getmImageRecId(){
        return mImageRecId;
    }
    public String getmPlayerName(){
        return mPlayerName;
    }
    public String getmUrl(){return mUrl;}
}
