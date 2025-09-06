package androidx.webkit;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.compose.animation.core.d;
import androidx.webkit.internal.ApiHelperForP;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public class ProcessGlobalConfig {
    String a;
    String b;
    String c;
    private static final Object d;
    @GuardedBy("sLock")
    private static boolean e;
    private static final AtomicReference sProcessGlobalConfig;

    static {
        ProcessGlobalConfig.sProcessGlobalConfig = new AtomicReference();
        ProcessGlobalConfig.d = new Object();
        ProcessGlobalConfig.e = false;
    }

    public static void a(@NonNull ProcessGlobalConfig processGlobalConfig0) {
        synchronized(ProcessGlobalConfig.d) {
            if(!ProcessGlobalConfig.e) {
                ProcessGlobalConfig.e = true;
                HashMap hashMap0 = new HashMap();
                if(ProcessGlobalConfig.d()) {
                    throw new IllegalStateException("WebView has already been loaded in the current process, so any attempt to apply the settings in ProcessGlobalConfig will have no effect. ProcessGlobalConfig#apply needs to be called before any calls to android.webkit APIs, such as during early app startup.");
                }
                if(processGlobalConfig0.a != null) {
                    ApiHelperForP.e(processGlobalConfig0.a);
                }
                String s = processGlobalConfig0.b;
                if(s != null) {
                    hashMap0.put("DATA_DIRECTORY_BASE_PATH", s);
                }
                String s1 = processGlobalConfig0.c;
                if(s1 != null) {
                    hashMap0.put("CACHE_DIRECTORY_BASE_PATH", s1);
                }
                if(!d.a(ProcessGlobalConfig.sProcessGlobalConfig, null, hashMap0)) {
                    throw new RuntimeException("Attempting to set ProcessGlobalConfig#sProcessGlobalConfig when it was already set");
                }
                return;
            }
        }
        throw new IllegalStateException("ProcessGlobalConfig#apply was called more than once, which is an illegal operation. The configuration settings provided by ProcessGlobalConfig take effect only once, when WebView is first loaded into the current process. Every process should only ever create a single instance of ProcessGlobalConfig and apply it once, before any calls to android.webkit APIs, such as during early app startup.");
    }

    @NonNull
    public ProcessGlobalConfig b(@NonNull Context context0, @NonNull String s) {
        if(!WebViewFeatureInternal.M.d(context0)) {
            throw WebViewFeatureInternal.a();
        }
        if(s.equals("")) {
            throw new IllegalArgumentException("Suffix cannot be an empty string");
        }
        if(s.indexOf(((int)File.separatorChar)) >= 0) {
            throw new IllegalArgumentException("Suffix " + s + " contains a path separator");
        }
        this.a = s;
        return this;
    }

    @NonNull
    public ProcessGlobalConfig c(@NonNull Context context0, @NonNull File file0, @NonNull File file1) {
        if(!WebViewFeatureInternal.N.d(context0)) {
            throw WebViewFeatureInternal.a();
        }
        if(!file0.isAbsolute()) {
            throw new IllegalArgumentException("dataDirectoryBasePath must be a non-empty absolute path");
        }
        if(!file1.isAbsolute()) {
            throw new IllegalArgumentException("cacheDirectoryBasePath must be a non-empty absolute path");
        }
        this.b = file0.getAbsolutePath();
        this.c = file1.getAbsolutePath();
        return this;
    }

    private static boolean d() {
        try {
            Field field0 = Class.forName("android.webkit.WebViewFactory").getDeclaredField("sProviderInstance");
            field0.setAccessible(true);
            if(field0.get(null) != null) {
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }
}

