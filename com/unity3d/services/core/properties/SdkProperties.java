package com.unity3d.services.core.properties;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds.UnityAdsInitializationError;
import com.unity3d.services.core.cache.CacheDirectory;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import j..util.Objects;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

public class SdkProperties {
    public static enum InitializationState {
        NOT_INITIALIZED,
        INITIALIZING,
        INITIALIZED_SUCCESSFULLY,
        INITIALIZED_FAILED;

        private static InitializationState[] $values() [...] // Inlined contents
    }

    private static final String CACHE_DIR_NAME = "UnityAdsCache";
    private static final String CHINA_CONFIG_HOSTNAME = "dW5pdHlhZHMudW5pdHljaGluYS5jbg==";
    private static final String CHINA_ISO_ALPHA_2_CODE = "CN";
    private static final String CHINA_ISO_ALPHA_3_CODE = "CHN";
    private static final String CONFIG_VERSION_METADATA_KEY = "com.unity3d.ads.configversion";
    private static final String DEFAULT_CONFIG_HOSTNAME = "unityads.unity3d.com";
    private static final String DEFAULT_CONFIG_VERSION = "configv2";
    private static final String LOCAL_CACHE_FILE_PREFIX = "UnityAdsCache-";
    private static final String LOCAL_STORAGE_FILE_PREFIX = "UnityAdsStorage-";
    private static final String WEBVIEW_CACHE_DIR_NAME = "UnityAdsWebViewCache";
    private static long _appInitializationTimeEpochMs;
    private static CacheDirectory _cacheDirectory;
    private static String _configUrl;
    private static final AtomicReference _currentInitializationState;
    private static boolean _debugMode;
    private static final LinkedHashSet _initializationListeners;
    private static long _initializationTime;
    private static long _initializationTimeEpochMs;
    private static volatile boolean _initialized;
    private static Configuration _latestConfiguration;
    private static boolean _previousTestMode;
    private static boolean _reinitialized;
    private static boolean _testMode;
    private static CacheDirectory _webviewCacheDirectory;

    static {
        SdkProperties._initializationListeners = new LinkedHashSet();
        SdkProperties._initialized = false;
        SdkProperties._reinitialized = false;
        SdkProperties._testMode = false;
        SdkProperties._previousTestMode = false;
        SdkProperties._debugMode = false;
        SdkProperties._currentInitializationState = new AtomicReference(InitializationState.NOT_INITIALIZED);
    }

    public static void addInitializationListener(IUnityAdsInitializationListener iUnityAdsInitializationListener0) {
        if(iUnityAdsInitializationListener0 == null) {
            return;
        }
        synchronized(SdkProperties._initializationListeners) {
            SdkProperties._initializationListeners.add(iUnityAdsInitializationListener0);
        }
    }

    public static long getAppInitializationTimeSinceEpoch() [...] // 潜在的解密器

    public static File getCacheDirectory() {
        return SdkProperties.getCacheDirectory(ClientProperties.getApplicationContext());
    }

    public static File getCacheDirectory(Context context0) {
        if(SdkProperties._cacheDirectory == null) {
            SdkProperties.setCacheDirectory(new CacheDirectory("UnityAdsCache"));
        }
        return SdkProperties._cacheDirectory.getCacheDirectory(context0);
    }

    public static String getCacheDirectoryName() {
        return "UnityAdsCache";
    }

    public static CacheDirectory getCacheDirectoryObject() {
        return SdkProperties._cacheDirectory;
    }

    public static String getCacheFilePrefix() [...] // Inlined contents

    public static String getConfigUrl() [...] // 潜在的解密器

    public static String getConfigVersion(Context context0) [...] // 潜在的解密器

    public static InitializationState getCurrentInitializationState() {
        return (InitializationState)SdkProperties._currentInitializationState.get();
    }

    public static boolean getDebugMode() [...] // 潜在的解密器

    // 去混淆评级： 高(210)
    public static String getDefaultConfigUrl(String s) {
        return "https://configv2" + '.' + "unityads.unity3d.com" + "/webview/" + "4.14.1" + "/" + s + "/config.json";
    }

    public static IUnityAdsInitializationListener[] getInitializationListeners() {
        synchronized(SdkProperties._initializationListeners) {
            IUnityAdsInitializationListener[] arr_iUnityAdsInitializationListener = new IUnityAdsInitializationListener[SdkProperties._initializationListeners.size()];
            SdkProperties._initializationListeners.toArray(arr_iUnityAdsInitializationListener);
            return arr_iUnityAdsInitializationListener;
        }
    }

    public static long getInitializationTime() [...] // 潜在的解密器

    public static long getInitializationTimeEpoch() [...] // 潜在的解密器

    public static Configuration getLatestConfiguration() {
        return SdkProperties._latestConfiguration;
    }

    public static String getLocalConfigurationFilepath() [...] // 潜在的解密器

    public static String getLocalStorageFilePrefix() [...] // Inlined contents

    public static String getLocalWebViewFile() [...] // 潜在的解密器

    public static boolean getPreviousTestMode() [...] // 潜在的解密器

    public static int getVersionCode() [...] // Inlined contents

    public static String getVersionName() [...] // Inlined contents

    private static String getWebViewBranch() [...] // 潜在的解密器

    public static File getWebViewCacheDirectory() {
        return SdkProperties.getWebViewCacheDirectory(ClientProperties.getApplicationContext());
    }

    public static File getWebViewCacheDirectory(Context context0) {
        if(SdkProperties._webviewCacheDirectory == null) {
            SdkProperties.setWebViewCacheDirectory(new CacheDirectory("UnityAdsWebViewCache", false));
        }
        return SdkProperties._webviewCacheDirectory.getCacheDirectory(context0);
    }

    // 去混淆评级： 低(20)
    public static boolean isChinaLocale(String s) [...] // 潜在的解密器

    public static boolean isInitialized() [...] // 潜在的解密器

    public static boolean isReinitialized() [...] // 潜在的解密器

    public static boolean isTestMode() [...] // 潜在的解密器

    public static void notifyInitializationComplete() {
        LinkedHashSet linkedHashSet0 = SdkProperties._initializationListeners;
        synchronized(linkedHashSet0) {
            SdkProperties.setInitializeState(InitializationState.INITIALIZED_SUCCESSFULLY);
            LinkedHashSet linkedHashSet1 = new LinkedHashSet(linkedHashSet0);
            linkedHashSet0.clear();
            for(Object object0: linkedHashSet1) {
                Objects.requireNonNull(((IUnityAdsInitializationListener)object0));
                Utilities.wrapCustomerListener(new b(((IUnityAdsInitializationListener)object0)));
            }
        }
    }

    public static void notifyInitializationFailed(UnityAdsInitializationError unityAds$UnityAdsInitializationError0, String s) {
        LinkedHashSet linkedHashSet0 = SdkProperties._initializationListeners;
        synchronized(linkedHashSet0) {
            SdkProperties.setInitializeState(InitializationState.INITIALIZED_FAILED);
            LinkedHashSet linkedHashSet1 = new LinkedHashSet(linkedHashSet0);
            linkedHashSet0.clear();
            for(Object object0: linkedHashSet1) {
                Utilities.wrapCustomerListener(new a(((IUnityAdsInitializationListener)object0), unityAds$UnityAdsInitializationError0, s));
            }
        }
    }

    public static void resetInitializationListeners() {
        synchronized(SdkProperties._initializationListeners) {
            SdkProperties._initializationListeners.clear();
        }
    }

    public static void setAppInitializationTimeSinceEpoch(long v) {
        SdkProperties._appInitializationTimeEpochMs = v;
    }

    public static void setCacheDirectory(CacheDirectory cacheDirectory0) {
        SdkProperties._cacheDirectory = cacheDirectory0;
    }

    public static void setConfigUrl(String s) throws URISyntaxException, MalformedURLException {
        if(s == null || !s.startsWith("http://") && !s.startsWith("https://")) {
            throw new MalformedURLException();
        }
        new URL(s).toURI();
        SdkProperties._configUrl = s;
    }

    public static void setDebugMode(boolean z) {
        SdkProperties._debugMode = z;
        if(z) {
            DeviceLog.setLogLevel(8);
            return;
        }
        DeviceLog.setLogLevel(4);
    }

    public static void setInitializationTime(long v) {
        SdkProperties._initializationTime = v;
    }

    public static void setInitializationTimeSinceEpoch(long v) {
        SdkProperties._initializationTimeEpochMs = v;
    }

    public static void setInitializeState(InitializationState sdkProperties$InitializationState0) {
        SdkProperties._currentInitializationState.set(sdkProperties$InitializationState0);
    }

    public static void setInitialized(boolean z) {
        SdkProperties._initialized = z;
    }

    public static void setLatestConfiguration(Configuration configuration0) {
        SdkProperties._latestConfiguration = configuration0;
    }

    public static void setReinitialized(boolean z) {
        SdkProperties._reinitialized = z;
    }

    public static void setTestMode(boolean z) {
        SdkProperties._previousTestMode = false;
        SdkProperties._testMode = z;
    }

    public static void setWebViewCacheDirectory(CacheDirectory cacheDirectory0) {
        SdkProperties._webviewCacheDirectory = cacheDirectory0;
    }
}

