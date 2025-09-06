package com.gomfactory.adpie.sdk.common;

import android.graphics.Color;

public class Constants {
    public static final int BANNER_IMAGE_TYPE = 11;
    public static final int BANNER_PIXEL_DELAY = 350;
    public static final int BANNER_WEBVIEW_TIMEOUT = 2000;
    public static final int CONNECTION_TYPE_MOBILE = 3;
    public static final int CONNECTION_TYPE_MOBILE_2G = 4;
    public static final int CONNECTION_TYPE_MOBILE_3G = 5;
    public static final int CONNECTION_TYPE_MOBILE_4G = 6;
    public static final int CONNECTION_TYPE_MOBILE_5G = 7;
    public static final int CONNECTION_TYPE_NO = 0;
    public static final int CONNECTION_TYPE_WIFI = 2;
    public static final int DEFAULT_DIALOG_AD_CONTENTS_PADDING = 2;
    public static final int DEFAULT_DIALOG_AD_HEIGHT_SIZE = 0xFA;
    public static final int DEFAULT_DIALOG_AD_WIDTH_SIZE = 0xFA;
    public static final int DEFAULT_DIALOG_BACKGROUND_COLOR = -1;
    public static final int DEFAULT_DIALOG_BUTTON_COLOR = 0;
    public static final int DEFAULT_DIALOG_BUTTON_COUNT = 2;
    public static final int DEFAULT_DIALOG_BUTTON_TEXT_COLOR = -1;
    public static final String DEFAULT_DIALOG_FIRST_BUTTON_TEXT = "취소";
    public static final String DEFAULT_DIALOG_MESSAGE_TEXT = "서비스를 종료하시겠습니까?";
    public static final int DEFAULT_DIALOG_MESSAGE_TEXT_COLOR = 0xFF000000;
    public static final int DEFAULT_DIALOG_RADIUS = 10;
    public static final String DEFAULT_DIALOG_SECOND_BUTTON_TEXT = "종료";
    public static final int DEFAULT_DIALOG_TEXT_SIZE = 15;
    public static final String DEFAULT_DIALOG_THIRD_BUTTON_TEXT = "확인";
    public static final int DEVICE_TYPE = 2;
    public static final int DIALOG_WEBVIEW_TIMEOUT = 2000;
    public static final int HTTP_CONNECTION_TIMEOUT = 2000;
    public static final int HTTP_ERROR = -1;
    public static final String HTTP_GET = "GET";
    public static final int HTTP_OK = 200;
    public static final String HTTP_POST = "POST";
    public static final int HTTP_READ_TIMEOUT = 4000;
    public static final int IMAGE_RESOURCE_LOADING_TIMEOUT = 3000;
    public static final int INTERSTITIAL_IMAGE_TYPE = 21;
    public static final int INTERSTITIAL_VIDEO_TYPE = 22;
    public static final int INTERSTITIAL_WEBVIEW_TIMEOUT = 0;
    public static final int NATIVE_ASSET_CTA = 6;
    public static final int NATIVE_ASSET_DESC = 4;
    public static final int NATIVE_ASSET_ICON = 2;
    public static final int NATIVE_ASSET_MAIN = 3;
    public static final int NATIVE_ASSET_RATING = 5;
    public static final int NATIVE_ASSET_TITLE = 1;
    public static final int NATIVE_IMAGE_TYPE = 0x1F;
    public static final int NATIVE_VIDEO_TYPE = 0x20;
    public static int[] NETWORK_INTERVAL = null;
    public static final int NETWORK_SERVICE_TIMEOUT = 3000;
    public static final long ONE_MINUTE = 60000L;
    public static final int OS_TYPE = 1;
    public static final String PREF_NAME = "com.gomfactory.adpie.sdk";
    public static final int PREROLL_VIDEO_TYPE = 42;
    public static final long REFRESH_MAXIMUM_INTERVAL = 300000L;
    public static final long REFRESH_MINIMUM_INTERVAL = 10000L;
    public static final long REQUEST_LIMIT_INTERVAL = 3000L;
    public static final int REWARDED_VIDEO_TYPE = 52;
    public static final int SCALE_ORIENTATION_ALL = 0;
    public static final int SCALE_ORIENTATION_LANDSCAPE = 2;
    public static final int SCALE_ORIENTATION_PORTRAIT = 1;
    public static final int VIDEO_MINIMUM_SKIP_TIME_SEC = 3;
    public static final long VIDEO_PLAY_TIMEOUT = 5000L;

    static {
        Constants.DEFAULT_DIALOG_BUTTON_COLOR = Color.parseColor("#2f2e3b");
        Constants.NETWORK_INTERVAL = new int[]{20000, 40000, 90000, 150000};
    }
}

