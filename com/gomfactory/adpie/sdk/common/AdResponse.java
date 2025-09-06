package com.gomfactory.adpie.sdk.common;

public class AdResponse {
    private AdData adData;
    private int count;
    private long interval;
    private String message;
    private int result;

    public AdData getAdData() {
        return this.adData;
    }

    public int getCount() {
        return this.count;
    }

    public long getInterval() {
        return this.interval;
    }

    public String getMessage() {
        return this.message;
    }

    public int getResult() {
        return this.result;
    }

    public void setAdData(AdData adData0) {
        this.adData = adData0;
    }

    public void setCount(int v) {
        this.count = v;
    }

    public void setInterval(long v) {
        this.interval = v;
    }

    public void setMessage(String s) {
        this.message = s;
    }

    public void setResult(int v) {
        this.result = v;
    }
}

