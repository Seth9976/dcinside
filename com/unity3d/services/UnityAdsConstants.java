package com.unity3d.services;

import y4.l;

public final class UnityAdsConstants {
    public static final class AdOperations {
        public static final int GET_TOKEN_TIMEOUT_MS = 750;
        @l
        public static final AdOperations INSTANCE = null;
        public static final int LOAD_TIMEOUT_MS = 30000;
        public static final int SHOW_TIMEOUT_MS = 10000;

        static {
            AdOperations.INSTANCE = new AdOperations();
        }
    }

    public static final class Cache {
        @l
        public static final String CACHE_SCHEME = "unity-ads-cache";
        @l
        public static final String DATASTORE_PATH = "unityAdsDatastore/";
        @l
        public static final Cache INSTANCE;

        static {
            Cache.INSTANCE = new Cache();
        }
    }

    public static final class ClientInfo {
        @l
        public static final ClientInfo INSTANCE = null;
        public static final int SDK_VERSION = 41401;
        @l
        public static final String SDK_VERSION_NAME = "4.14.1";

        static {
            ClientInfo.INSTANCE = new ClientInfo();
        }
    }

    public static final class DefaultUrls {
        @l
        public static final String AD_ASSET_DOMAIN = "unity.ads.asset";
        @l
        public static final String AD_CACHE_DOMAIN = "unity.ads.cache";
        @l
        public static final String AD_PLAYER_QUERY_PARAMS = "?platform=android&";
        @l
        public static final String CACHE_DIR_NAME = "UnityAdsCache";
        @l
        public static final String GATEWAY_URL = "https://gateway.unityads.unity3d.com/v1";
        @l
        public static final String HTTP_CACHE_DIR_NAME = "UnityAdsHttpCache";
        @l
        public static final String HTTP_CACHE_OK_HTTP_DIR_NAME = "UnityAdsOkHttpCache";
        @l
        public static final DefaultUrls INSTANCE = null;
        @l
        public static final String WEBVIEW_ASSET_PATH = "/unity-ads-sdk-webview/";
        @l
        public static final String WEBVIEW_ASSET_PATH_LOCAL = "ad-viewer/";
        @l
        public static final String WEBVIEW_DOMAIN = "webview.unityads.unity3d.com";

        static {
            DefaultUrls.INSTANCE = new DefaultUrls();
        }
    }

    public static final class ErrorHandler {
        public static final int ERROR_HANDLER_STACK_TRACE_LINES_MAX = 15;
        @l
        public static final ErrorHandler INSTANCE;

        static {
            ErrorHandler.INSTANCE = new ErrorHandler();
        }
    }

    public static final class Messages {
        @l
        public static final Messages INSTANCE = null;
        @l
        public static final String MSG_INTERNAL_ERROR = "Internal error";
        @l
        public static final String MSG_UNITY_BASE = "[Unity Ads] ";

        static {
            Messages.INSTANCE = new Messages();
        }
    }

    public static final class OpenMeasurement {
        @l
        public static final OpenMeasurement INSTANCE = null;
        @l
        public static final String OM_JS_SERVICE_FILENAME = "ad-viewer/omsdk-v1.js";
        @l
        public static final String OM_JS_SESSION_FILENAME = "ad-viewer/omid-session-client-v1.js";
        @l
        public static final String OM_JS_URL_SERVICE = "unity-ads-cache://unity.ads.asset/ad-viewer/omsdk-v1.js";
        @l
        public static final String OM_JS_URL_SESSION = "unity-ads-cache://unity.ads.asset/ad-viewer/omid-session-client-v1.js";
        @l
        public static final String OM_PARTNER_NAME = "Unity3d";
        @l
        public static final String OM_PARTNER_VERSION = "1";
        public static final long OM_SESSION_FINISH_DELAY_MS = 1000L;

        static {
            OpenMeasurement.INSTANCE = new OpenMeasurement();
        }
    }

    public static final class Preferences {
        @l
        public static final Preferences INSTANCE = null;
        @l
        public static final String PREF_KEY_AUID = "auid";
        @l
        public static final String PREF_KEY_IDFI = "unityads-idfi";
        @l
        public static final String PREF_NAME_AUID = "supersonic_shared_preferen";
        @l
        public static final String PREF_NAME_IDFI = "unityads-installinfo";

        static {
            Preferences.INSTANCE = new Preferences();
        }
    }

    public static final class RequestPolicy {
        public static final int CONNECT_TIMEOUT_MS = 30000;
        @l
        public static final RequestPolicy INSTANCE = null;
        public static final int OVERALL_TIMEOUT_MS = 30000;
        public static final int READ_TIMEOUT_MS = 30000;
        public static final float RETRY_JITTER_PCT = 0.1f;
        public static final int RETRY_MAX_DURATION = 120000;
        public static final int RETRY_MAX_INTERVAL = 2500;
        public static final float RETRY_SCALING_FACTOR = 2.0f;
        public static final int RETRY_WAIT_BASE = 500;
        public static final boolean SHOULD_STORE_LOCALLY = false;
        public static final int WRITE_TIMEOUT_MS = 30000;

        static {
            RequestPolicy.INSTANCE = new RequestPolicy();
        }
    }

    public static final class SharedFlow {
        public static final int EXTRA_CAPACITY = 10;
        @l
        public static final SharedFlow INSTANCE = null;
        public static final int REPLAY = 10;

        static {
            SharedFlow.INSTANCE = new SharedFlow();
        }
    }

    public static final class Timeout {
        public static final long INIT_TIMEOUT_MS = 120000L;
        @l
        public static final Timeout INSTANCE;

        static {
            Timeout.INSTANCE = new Timeout();
        }
    }

    @l
    public static final UnityAdsConstants INSTANCE;

    static {
        UnityAdsConstants.INSTANCE = new UnityAdsConstants();
    }
}

