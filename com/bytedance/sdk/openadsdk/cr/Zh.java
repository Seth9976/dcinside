package com.bytedance.sdk.openadsdk.cr;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Zh {
    public static class PjT {
        public static String PjT = "openDetailPage";
        public static String ReZ = "direct";
        public static String Zh = "openAdLandPageLinks";
        public static String cr = "saLandingPageLinks";

        static {
        }
    }

    public static class com.bytedance.sdk.openadsdk.cr.Zh.Zh {
        public static int PjT = 1;
        public static int ReZ = 100;
        public static int Zh = 2;

        static {
        }
    }

    public static final String JQp;
    public static final String PjT;
    public static final String ReZ;
    public static final Set XX;
    public static final String Zh;
    public static final String cr;
    public static final String cz;

    static {
        Zh.PjT = "arbitrage_load_start";
        Zh.Zh = "arbitrage_load_finish";
        Zh.ReZ = "arbitrage_load_url";
        Zh.cr = "arbitrage_loading";
        Zh.JQp = "arbitrage_loading_show";
        Zh.cz = "arbitrage_loading_progress";
        Zh.XX = new HashSet(Arrays.asList(new String[]{"click", "show", "insight_log"}));
    }

    // 去混淆评级： 低(40)
    public static boolean PjT(String s) {
        return "embeded_ad".equals(s) || "banner_ad".equals(s) || "interaction".equals(s) || "slide_banner_ad".equals(s);
    }
}

