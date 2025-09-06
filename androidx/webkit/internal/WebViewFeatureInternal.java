package androidx.webkit.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.Collection;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebViewFeatureInternal {
    public static final M A;
    public static final M B;
    public static final NoFramework C;
    public static final M D;
    public static final M E;
    public static final M F;
    public static final M G;
    public static final O H;
    public static final O I;
    public static final Q J;
    public static final Q K;
    public static final P L;
    public static final androidx.webkit.internal.StartupApiFeature.P M;
    public static final androidx.webkit.internal.StartupApiFeature.NoFramework N;
    public static final Q O;
    public static final T P;
    public static final NoFramework Q;
    public static final NoFramework R;
    public static final Q S;
    public static final NoFramework T;
    public static final NoFramework U;
    public static final NoFramework V;
    public static final NoFramework W;
    public static final NoFramework X;
    public static final NoFramework Y;
    public static final NoFramework Z;
    public static final M a;
    @RestrictTo({Scope.b})
    public static final NoFramework a0;
    public static final M b;
    public static final NoFramework b0;
    public static final O c;
    public static final NoFramework c0;
    public static final N d;
    public static final NoFramework d0;
    public static final O_MR1 e;
    public static final NoFramework e0;
    @Deprecated
    public static final O_MR1 f;
    @RestrictTo({Scope.b})
    public static final NoFramework f0;
    @Deprecated
    public static final O_MR1 g;
    public static final O_MR1 h;
    public static final O_MR1 i;
    public static final O_MR1 j;
    public static final N k;
    public static final N l;
    public static final N m;
    public static final N n;
    public static final N o;
    public static final N p;
    public static final M q;
    public static final M r;
    public static final N s;
    public static final O_MR1 t;
    public static final N u;
    public static final M v;
    public static final M w;
    public static final O_MR1 x;
    public static final O_MR1 y;
    public static final O_MR1 z;

    static {
        WebViewFeatureInternal.a = new M("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
        WebViewFeatureInternal.b = new M("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
        WebViewFeatureInternal.c = new O("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
        WebViewFeatureInternal.d = new N("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
        WebViewFeatureInternal.e = new O_MR1("START_SAFE_BROWSING", "START_SAFE_BROWSING");
        WebViewFeatureInternal.f = new O_MR1("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
        WebViewFeatureInternal.g = new O_MR1("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
        WebViewFeatureInternal.h = new O_MR1("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
        WebViewFeatureInternal.i = new O_MR1("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
        WebViewFeatureInternal.j = new O_MR1("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
        WebViewFeatureInternal.k = new N("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
        WebViewFeatureInternal.l = new N("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
        WebViewFeatureInternal.m = new N("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
        WebViewFeatureInternal.n = new N("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
        WebViewFeatureInternal.o = new N("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
        WebViewFeatureInternal.p = new N("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
        WebViewFeatureInternal.q = new M("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
        WebViewFeatureInternal.r = new M("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
        WebViewFeatureInternal.s = new N("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
        WebViewFeatureInternal.t = new O_MR1("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
        WebViewFeatureInternal.u = new N("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
        WebViewFeatureInternal.v = new M("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        WebViewFeatureInternal.w = new M("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
        WebViewFeatureInternal.x = new O_MR1("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
        WebViewFeatureInternal.y = new O_MR1("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
        WebViewFeatureInternal.z = new O_MR1("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        WebViewFeatureInternal.A = new M("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
        WebViewFeatureInternal.B = new M("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
        WebViewFeatureInternal.C = new NoFramework("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
        WebViewFeatureInternal.D = new M("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
        WebViewFeatureInternal.E = new M("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
        WebViewFeatureInternal.F = new M("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
        WebViewFeatureInternal.G = new M("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
        WebViewFeatureInternal.H = new O("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
        WebViewFeatureInternal.I = new O("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
        WebViewFeatureInternal.J = new Q("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
        WebViewFeatureInternal.K = new Q("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
        WebViewFeatureInternal.L = new P("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
        WebViewFeatureInternal.M = new androidx.webkit.internal.StartupApiFeature.P("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
        WebViewFeatureInternal.N = new androidx.webkit.internal.StartupApiFeature.NoFramework("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");
        WebViewFeatureInternal.O = new Q("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        WebViewFeatureInternal.P = new T("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING") {
            private final Pattern d;

            {
                String s = "ALGORITHMIC_DARKENING";  // 捕获的参数
                String s1 = "ALGORITHMIC_DARKENING";  // 捕获的参数
                this.d = Pattern.compile("\\A\\d+");
            }

            @Override  // androidx.webkit.internal.ApiFeature
            public boolean d() {
                boolean z = super.d();
                if(z && Build.VERSION.SDK_INT < 29) {
                    PackageInfo packageInfo0 = WebViewCompat.f();
                    if(packageInfo0 == null) {
                        return false;
                    }
                    Matcher matcher0 = this.d.matcher(packageInfo0.versionName);
                    return matcher0.find() && Integer.parseInt(packageInfo0.versionName.substring(matcher0.start(), matcher0.end())) >= 105;
                }
                return z;
            }
        };
        WebViewFeatureInternal.Q = new NoFramework("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
        WebViewFeatureInternal.R = new NoFramework("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
        WebViewFeatureInternal.S = new Q("FORCE_DARK", "FORCE_DARK");
        WebViewFeatureInternal.T = new NoFramework("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
        WebViewFeatureInternal.U = new NoFramework("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
        WebViewFeatureInternal.V = new NoFramework("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
        WebViewFeatureInternal.W = new NoFramework("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
        WebViewFeatureInternal.X = new NoFramework("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
        WebViewFeatureInternal.Y = new NoFramework("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
        WebViewFeatureInternal.Z = new NoFramework("GET_COOKIE_INFO", "GET_COOKIE_INFO");
        WebViewFeatureInternal.a0 = new NoFramework("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
        WebViewFeatureInternal.b0 = new NoFramework("USER_AGENT_METADATA", "USER_AGENT_METADATA");
        WebViewFeatureInternal.c0 = new NoFramework("MULTI_PROFILE", "MULTI_PROFILE") {
            @Override  // androidx.webkit.internal.ApiFeature
            public boolean d() {
                if(!super.d()) {
                    return false;
                }
                return WebViewFeature.a("MULTI_PROCESS") ? WebViewCompat.t() : false;
            }
        };
        WebViewFeatureInternal.d0 = new NoFramework("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
        WebViewFeatureInternal.e0 = new NoFramework("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
        WebViewFeatureInternal.f0 = new NoFramework("MUTE_AUDIO", "MUTE_AUDIO");
    }

    @NonNull
    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(@NonNull String s, @NonNull Context context0) {
        return WebViewFeatureInternal.c(s, StartupApiFeature.g(), context0);
    }

    @VisibleForTesting
    public static boolean c(@NonNull String s, @NonNull Collection collection0, @NonNull Context context0) {
        HashSet hashSet0 = new HashSet();
        for(Object object0: collection0) {
            StartupApiFeature startupApiFeature0 = (StartupApiFeature)object0;
            if(startupApiFeature0.b().equals(s)) {
                hashSet0.add(startupApiFeature0);
            }
        }
        if(hashSet0.isEmpty()) {
            throw new RuntimeException("Unknown feature " + s);
        }
        for(Object object1: hashSet0) {
            if(((StartupApiFeature)object1).d(context0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public static boolean d(@NonNull String s) {
        return WebViewFeatureInternal.e(s, ApiFeature.e());
    }

    @VisibleForTesting
    public static boolean e(@NonNull String s, @NonNull Collection collection0) {
        HashSet hashSet0 = new HashSet();
        for(Object object0: collection0) {
            ConditionallySupportedFeature conditionallySupportedFeature0 = (ConditionallySupportedFeature)object0;
            if(conditionallySupportedFeature0.a().equals(s)) {
                hashSet0.add(conditionallySupportedFeature0);
            }
        }
        if(hashSet0.isEmpty()) {
            throw new RuntimeException("Unknown feature " + s);
        }
        for(Object object1: hashSet0) {
            if(((ConditionallySupportedFeature)object1).isSupported()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

