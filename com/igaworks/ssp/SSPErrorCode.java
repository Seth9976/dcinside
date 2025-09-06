package com.igaworks.ssp;

public class SSPErrorCode {
    public static final int BANNER_VIEW_IS_EMPTY = 10000;
    public static final int EXCEPTION = 200;
    public static final int GDPR_CONSENT_UNAVAILABLE = 5008;
    public static final int INVALID_APP_KEY = 2000;
    public static final int INVALID_NATIVE_ASSETS_CONFIG = 3300;
    public static final int INVALID_ONESTORE_KEY = 5007;
    public static final int INVALID_PARAMETER = 1000;
    public static final int INVALID_PLACEMENT_ID = 2030;
    public static final int LOAD_AD_FAILED = 5001;
    public static final int MODAL_AD_DOES_NOT_SHOW_TODAY = 5012;
    public static final int NETWORK_IS_NOT_ONLINE = 100001;
    public static final int NO_AD = 5002;
    public static final int NO_INTERSTITIAL_LOADED = 5003;
    public static final int NO_INTERSTITIAL_VIDEO_AD_LOADED = 5009;
    public static final int NO_MODAL_AD_LOADED = 5011;
    public static final int NO_REWARD_VIDEO_AD_LOADED = 5005;
    public static final int NO_SPLASH_AD_LOADED = 5010;
    public static final int NO_VIDEO_MIX_AD_LOADED = 5013;
    public static final int PROCESSING_PREVIOUS_REQUEST = 5006;
    public static final int SERVER_TIMEOUT = 5000;
    public static final int SUCCESS = 1;
    public static final int UNKNOWN_SERVER_ERROR = 0x270F;
    private int a;
    private String b;

    public SSPErrorCode(int v) {
        this.b = "";
        this.a = v;
        switch(v) {
            case 1000: {
                this.b = "Invalid Parameter";
                return;
            }
            case 2000: {
                this.b = "Invalid App Key";
                return;
            }
            case 2030: {
                this.b = "Invalid Placement ID";
                return;
            }
            case 3300: {
                this.b = "Invalid native assets config";
                return;
            }
            case 5000: {
                this.b = "Server Timeout";
                return;
            }
            case 5001: {
                this.b = "Load Ad Failed";
                return;
            }
            case 5002: {
                this.b = "No Ad";
                return;
            }
            case 5003: {
                this.b = "No Interstitial Loaded";
                return;
            }
            case 5005: {
                this.b = "No Reward video ad Loaded";
                return;
            }
            case 5006: {
                this.b = "Processing previous request";
                return;
            }
            case 5007: {
                this.b = "onestore key is Empty";
                return;
            }
            case 5008: {
                this.b = "gdpr_consent_unavailable";
                return;
            }
            case 5009: {
                this.b = "No Interstitial video ad Loaded";
                return;
            }
            case 5010: {
                this.b = "No Splash ad Loaded";
                return;
            }
            case 5011: {
                this.b = "No Modal ad Loaded";
                return;
            }
            case 5012: {
                this.b = "Modal ad does not show today";
                return;
            }
            case 5013: {
                this.b = "No Video mix ad Loaded";
                return;
            }
            case 0x270F: {
                this.b = "Unknown Server Error";
                return;
            }
            case 10000: {
                this.b = "Banner View Is Empty";
                return;
            }
            case 100001: {
                this.b = "Network Is Not Online";
                return;
            }
            default: {
                this.b = "Exception";
            }
        }
    }

    public int getErrorCode() {
        return this.a;
    }

    public String getErrorMessage() {
        return this.b;
    }

    public void setErrorCode(int v) {
        this.a = v;
    }

    public void setErrorMessage(String s) {
        this.b = s;
    }
}

