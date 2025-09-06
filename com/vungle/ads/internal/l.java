package com.vungle.ads.internal;

import z3.f;

public final class l {
    @y4.l
    public static final String AD_CLOSE = "ad.close";
    @y4.l
    public static final String AD_DURATION_KEY = "{{{dur}}}";
    @y4.l
    public static final String AD_INDEX_FILE_NAME = "index.html";
    @y4.l
    public static final String AD_LOAD_DURATION = "ad.loadDuration";
    @y4.l
    public static final String AD_LOAD_DURATION_KEY = "{{{time_dl}}}";
    @y4.l
    public static final String AD_MRAID_JS_FILE_NAME = "mraid.js";
    @y4.l
    public static final String CHECKPOINT_0 = "checkpoint.0";
    @y4.l
    public static final String CLICK_URL = "clickUrl";
    @y4.l
    public static final String DEEPLINK_CLICK = "deeplink.click";
    @y4.l
    public static final String DEEPLINK_SUCCESS_KEY = "{{{is_success}}}";
    @y4.l
    @f
    public static final String DEFAULT_ADS_ENDPOINT = null;
    @y4.l
    @f
    public static final String DEFAULT_ERROR_LOGS_ENDPOINT = null;
    @y4.l
    @f
    public static final String DEFAULT_METRICS_ENDPOINT = null;
    @y4.l
    public static final String DEVICE_VOLUME_KEY = "{{{vol}}}";
    @y4.l
    public static final l INSTANCE = null;
    @y4.l
    public static final String KEY_MAIN_VIDEO = "MAIN_VIDEO";
    @y4.l
    public static final String MRAID_JS_FILE_NAME = "mraid.min.js";
    @y4.l
    public static final String NETWORK_OPERATOR_KEY = "{{{carrier}}}";
    @y4.l
    public static final String PLACEMENT_TYPE_APP_OPEN = "appopen";
    @y4.l
    public static final String PLACEMENT_TYPE_BANNER = "banner";
    @y4.l
    public static final String PLACEMENT_TYPE_INTERSTITIAL = "interstitial";
    @y4.l
    public static final String PLACEMENT_TYPE_IN_LINE = "in_line";
    @y4.l
    public static final String PLACEMENT_TYPE_MREC = "mrec";
    @y4.l
    public static final String PLACEMENT_TYPE_NATIVE = "native";
    @y4.l
    public static final String PLACEMENT_TYPE_REWARDED = "rewarded";
    @y4.l
    public static final String REMOTE_PLAY_KEY = "{{{remote_play}}}";
    @y4.l
    public static final String SESSION_ID = "{{{session_id}}}";
    @y4.l
    public static final String TEMPLATE_TYPE_BANNER = "banner";
    @y4.l
    public static final String TEMPLATE_TYPE_FULLSCREEN = "fullscreen";
    @y4.l
    public static final String TEMPLATE_TYPE_IN_LINE = "in_line";
    @y4.l
    public static final String TEMPLATE_TYPE_MREC = "mrec";
    @y4.l
    public static final String TEMPLATE_TYPE_NATIVE = "native";
    public static final int TIMEOUT = 60;
    @y4.l
    public static final String VIDEO_LENGTH = "video.length";
    @y4.l
    public static final String VIDEO_LENGTH_KEY = "{{{vlen}}}";

    static {
        l.INSTANCE = new l();
        l.DEFAULT_ADS_ENDPOINT = "https://adx.ads.vungle.com/api/ads";
        l.DEFAULT_ERROR_LOGS_ENDPOINT = "https://logs.ads.vungle.com/sdk/error_logs";
        l.DEFAULT_METRICS_ENDPOINT = "https://logs.ads.vungle.com/sdk/metrics";
    }
}

