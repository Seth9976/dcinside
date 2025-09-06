package com.kakao.adfit.ads;

public enum AdError {
    PERMISSION_DENIED(101, "Please check these permissions. android.permission.INTERNET, android.permission.ACCESS_NETWORK_STATE."),
    UNKNOWN_CLIENT_ID(201, "There\'s no client id in your app. Please provide a valid \'clientId\' attribute in the \'com.kakao.adfit.ads.ba.BannerAdView\' tag of layout XML. For example, clientId=\"yourClientId\". Or you can use setClientId() method."),
    HTTP_FAILED(202, "Http failed"),
    INVALID_AD(301, "invalid ad"),
    NO_AD(302, "no received ad"),
    FAIL_TO_DRAW(501, "fail to draw ad"),
    SDK_EXCEPTION(601, "SDK exception");

    private final String a;
    private final int b;

    private AdError(int v1, String s1) {
        this.a = s1;
        this.b = v1;
    }

    private static AdError[] a() [...] // Inlined contents

    public int getErrorCode() {
        return this.b;
    }

    @Override
    public String toString() {
        return this.name() + "(" + this.a + ")";
    }
}

