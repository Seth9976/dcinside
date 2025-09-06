package com.fsn.cauly;

import java.util.HashMap;

public class CaulyAdInfo {
    public static enum Age {
        all,
        age10,
        age20,
        age30,
        age40,
        age50;

    }

    public static enum BannerHeight {
        Fixed,
        Proportional,
        @Deprecated
        Fixed_50,
        Square,
        Adaptive;

    }

    public static enum Direction {
        LEFT,
        RIGHT,
        CENTER;

    }

    public static enum Effect {
        None,
        LeftSlide,
        RightSlide,
        TopSlide,
        BottomSlide,
        FadeIn,
        Circle;

    }

    public static enum Gender {
        all,
        male,
        female;

    }

    public static enum Orientation {
        LANDSCAPE,
        PORTRAIT;

    }

    public static final int BDERR_FILE_ERROR = 6;
    public static final int BDERR_INTERNAL_ERROR = 3;
    public static final int BDERR_INTERSTIAIL_DELAY_ERROR = 8;
    public static final int BDERR_MEDIA_ERROR = 7;
    public static final int BDERR_NETWORK_ERROR = 1;
    public static final int BDERR_NO_FILL = 4;
    public static final int BDERR_PROTOCOL_ERROR = 5;
    public static final int BDERR_SERVER_ERROR = 2;
    public static final int BDERR_SUCCESS = 0;
    public static final Age DEFAULT_AGE = null;
    public static final boolean DEFAULT_BANNERAD = false;
    public static final BannerHeight DEFAULT_BANNER_HEIGHT = null;
    public static final boolean DEFAULT_CHILD_TARGET = false;
    public static final boolean DEFAULT_DYNAMIC_RELOAD_INTERVAL = true;
    public static final Effect DEFAULT_EFFECT = null;
    public static final Gender DEFAULT_GENDER = null;
    public static final boolean GDPR_TARGET = false;
    protected HashMap a;

    static {
        CaulyAdInfo.DEFAULT_GENDER = Gender.all;
        CaulyAdInfo.DEFAULT_AGE = Age.all;
        CaulyAdInfo.DEFAULT_EFFECT = Effect.LeftSlide;
        CaulyAdInfo.DEFAULT_BANNER_HEIGHT = BannerHeight.Proportional;
    }

    public CaulyAdInfo(CaulyAdInfoBuilder caulyAdInfoBuilder0) {
        HashMap hashMap0 = new HashMap();
        this.a = hashMap0;
        hashMap0.putAll(caulyAdInfoBuilder0.a);
    }

    public CaulyAdInfo(CaulyNativeAdInfoBuilder caulyNativeAdInfoBuilder0) {
        HashMap hashMap0 = new HashMap();
        this.a = hashMap0;
        hashMap0.putAll(caulyNativeAdInfoBuilder0.a);
    }

    static Age a(String s) {
        if(s == null) {
            return CaulyAdInfo.DEFAULT_AGE;
        }
        return s.equals("all") ? Age.all : Age.valueOf(s);
    }

    HashMap b() {
        return this.a;
    }

    static BannerHeight c(String s) {
        return s == null ? CaulyAdInfo.DEFAULT_BANNER_HEIGHT : BannerHeight.valueOf(s);
    }

    static Effect d(String s) {
        return s == null ? CaulyAdInfo.DEFAULT_EFFECT : Effect.valueOf(s);
    }

    static Gender e(String s) {
        return s == null ? CaulyAdInfo.DEFAULT_GENDER : Gender.valueOf(s);
    }
}

