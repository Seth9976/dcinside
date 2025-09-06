package com.bytedance.sdk.openadsdk.Owx;

public enum cr {
    TYPE_2G("2g"),
    TYPE_3G("3g"),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI("wifi"),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN("unknown");

    private String Au;

    private cr(String s1) {
        this.Au = s1;
    }

    @Override
    public String toString() {
        return this.Au;
    }
}

