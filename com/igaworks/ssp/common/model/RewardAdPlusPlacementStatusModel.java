package com.igaworks.ssp.common.model;

public class RewardAdPlusPlacementStatusModel {
    private String a;
    private int b;
    private int c;

    public RewardAdPlusPlacementStatusModel(String s, int v, int v1) {
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    public int getDailyUserCount() {
        return this.c;
    }

    public int getDailyUserLimit() {
        return this.b;
    }

    public String getPlacementId() {
        return this.a;
    }

    public void setDailyUserCount(int v) {
        this.c = v;
    }

    public void setDailyUserLimit(int v) {
        this.b = v;
    }

    public void setPlacementId(String s) {
        this.a = s;
    }
}

