package com.bytedance.adsdk.ugeno.core;

public enum qj {
    UNKNOWN_EVENT("UNKNOWN_EVENT", 0),
    TAP_EVENT("onTap", 1),
    LONG_TAP_EVENT("onLongTap", 2),
    SHAKE_EVENT("onShake", 3),
    TWIST_EVENT("onTwist", 18),
    SLIDE_EVENT("onSlide", 4),
    EXPOSURE_EVENT("onExposure", 5),
    SCROLL_EVENT("onScroll", 6),
    PULL_TO_REFRESH_EVENT("onPullToRefresh", 7),
    LOAD_MORE_EVENT("onLoadMore", 8),
    TIMER("onTimer", 9),
    DELAY("onDelay", 10),
    ANIMATION("onAnimation", 11),
    VIDEO_PROGRESS("onVideoProgress", 12),
    VIDEO_PAUSE("onVideoPause", 13),
    VIDEO_RESUME("onVideoResume", 14),
    VIDEO_FINISH("onVideoFinish", 15),
    VIDEO_PLAY("onVideoPlay", 16),
    DOWN_EVENT("onDown", 17),
    RENDER_SUCCESS("onRenderSuccess", 22);

    private String RD;
    private int Sks;

    private qj(String s1, int v1) {
        this.RD = s1;
        this.Sks = v1;
    }

    public static qj PjT(String s) {
        qj[] arr_qj = qj.values();
        for(int v = 0; v < arr_qj.length; ++v) {
            qj qj0 = arr_qj[v];
            if(qj0.RD.equals(s)) {
                return qj0;
            }
        }
        return qj.PjT;
    }

    public int PjT() {
        return this.Sks;
    }
}

