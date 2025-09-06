package com.tiktok.util;

public class d {
    public static enum a {
        PARTIAL_SUCCESS(20001),
        API_ERROR(40000);

        public Integer a;

        private a(Integer integer0) {
            this.a = integer0;
        }
    }

    public static enum b {
        InstallApp("InstallApp"),
        SecondDayRetention("2Dretention"),
        LaunchAPP("LaunchAPP");

        public String a;

        private b(String s1) {
            this.a = s1;
        }
    }

    public static final String a = "com.tiktok.sdk.keystore";
    public static final String b = "com.tiktok.sdk.anonymousId";
    public static final String c = "com.tiktok.sdk.firstInstall";
    public static final String d = "com.tiktok.sdk.lastLaunch";
    public static final String e = "com.tiktok.sdk.2drTime";
    public static final String f = "com.tiktok.user.agent";
    public static final String g = "com.tiktok";
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final String k = "type";
    public static final String l = "auto";
    public static final String m = "Invalid appId or tiktokAppId";

}

