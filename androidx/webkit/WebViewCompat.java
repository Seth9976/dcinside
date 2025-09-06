package androidx.webkit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.webkit.internal.ApiFeature.M;
import androidx.webkit.internal.ApiHelperForM;
import androidx.webkit.internal.ApiHelperForO;
import androidx.webkit.internal.ApiHelperForOMR1;
import androidx.webkit.internal.ApiHelperForP;
import androidx.webkit.internal.ApiHelperForQ;
import androidx.webkit.internal.WebMessageAdapter;
import androidx.webkit.internal.WebMessagePortImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import androidx.webkit.internal.WebViewProviderAdapter;
import androidx.webkit.internal.WebViewProviderFactory;
import androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter;
import androidx.webkit.internal.WebViewRenderProcessImpl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

public class WebViewCompat {
    public interface VisualStateCallback {
        @UiThread
        void onComplete(long arg1);
    }

    public interface WebMessageListener {
        @UiThread
        void onPostMessage(@NonNull WebView arg1, @NonNull WebMessageCompat arg2, @NonNull Uri arg3, boolean arg4, @NonNull JavaScriptReplyProxy arg5);
    }

    private static final Uri a;
    private static final Uri b;

    static {
        WebViewCompat.a = Uri.parse("*");
        WebViewCompat.b = Uri.parse("");
    }

    @Deprecated
    public static void A(@NonNull List list0, @Nullable ValueCallback valueCallback0) {
        WebViewCompat.z(new HashSet(list0), valueCallback0);
    }

    // 去混淆评级： 低(20)
    public static void B(@NonNull WebView webView0, @Nullable WebViewRenderProcessClient webViewRenderProcessClient0) {
        ApiHelperForQ.e(webView0, webViewRenderProcessClient0);
    }

    // 去混淆评级： 低(20)
    @SuppressLint({"LambdaLast"})
    public static void C(@NonNull WebView webView0, @NonNull Executor executor0, @NonNull WebViewRenderProcessClient webViewRenderProcessClient0) {
        ApiHelperForQ.f(webView0, executor0, webViewRenderProcessClient0);
    }

    // 去混淆评级： 低(20)
    public static void D(@NonNull Context context0, @Nullable ValueCallback valueCallback0) {
        ApiHelperForOMR1.f(context0, valueCallback0);
    }

    @NonNull
    public static ScriptHandler a(@NonNull WebView webView0, @NonNull String s, @NonNull Set set0) {
        if(!WebViewFeatureInternal.V.d()) {
            throw WebViewFeatureInternal.a();
        }
        return WebViewCompat.l(webView0).a(s, ((String[])set0.toArray(new String[0])));
    }

    public static void b(@NonNull WebView webView0, @NonNull String s, @NonNull Set set0, @NonNull WebMessageListener webViewCompat$WebMessageListener0) {
        if(!WebViewFeatureInternal.U.d()) {
            throw WebViewFeatureInternal.a();
        }
        WebViewCompat.l(webView0).b(s, ((String[])set0.toArray(new String[0])), webViewCompat$WebMessageListener0);
    }

    private static void c(WebView webView0) {
        if(Build.VERSION.SDK_INT >= 28) {
            Looper looper0 = ApiHelperForP.c(webView0);
            if(looper0 != Looper.myLooper()) {
                throw new RuntimeException("A WebView method was called on thread \'jeb-dexdec-sb-st-3335\'. All WebView methods must be called on the same thread. (Expected Looper " + looper0 + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
            }
            return;
        }
        try {
            Method method0 = WebView.class.getDeclaredMethod("checkThread", null);
            method0.setAccessible(true);
            method0.invoke(webView0, null);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException(noSuchMethodException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException(invocationTargetException0);
        }
    }

    private static WebViewProviderBoundaryInterface d(WebView webView0) {
        return WebViewCompat.h().createWebView(webView0);
    }

    // 去混淆评级： 低(40)
    @NonNull
    public static WebMessagePortCompat[] e(@NonNull WebView webView0) {
        return WebMessagePortImpl.l(ApiHelperForM.c(webView0));
    }

    @Nullable
    @RestrictTo({Scope.a})
    public static PackageInfo f() {
        if(Build.VERSION.SDK_INT >= 26) {
            return ApiHelperForO.a();
        }
        try {
            return WebViewCompat.i();
        }
        catch(ClassNotFoundException | IllegalAccessException | InvocationTargetException | NoSuchMethodException unused_ex) {
            return null;
        }
    }

    @Nullable
    public static PackageInfo g(@NonNull Context context0) {
        PackageInfo packageInfo0 = WebViewCompat.f();
        return packageInfo0 == null ? WebViewCompat.j(context0) : packageInfo0;
    }

    private static WebViewProviderFactory h() {
        return WebViewGlueCommunicator.d();
    }

    @SuppressLint({"PrivateApi"})
    private static PackageInfo i() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (PackageInfo)Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    @SuppressLint({"PrivateApi"})
    private static PackageInfo j(Context context0) {
        String s;
        try {
            s = Build.VERSION.SDK_INT > 23 ? ((String)Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null)) : ((String)Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", null).invoke(null, null));
            if(s == null) {
                return null;
            }
        }
        catch(ClassNotFoundException | IllegalAccessException | InvocationTargetException | NoSuchMethodException unused_ex) {
            return null;
        }
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            return packageManager0.getPackageInfo(s, 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
    }

    @NonNull
    @UiThread
    public static Profile k(@NonNull WebView webView0) {
        if(!WebViewFeatureInternal.c0.d()) {
            throw WebViewFeatureInternal.a();
        }
        return WebViewCompat.l(webView0).d();
    }

    private static WebViewProviderAdapter l(WebView webView0) {
        return new WebViewProviderAdapter(WebViewCompat.d(webView0));
    }

    // 去混淆评级： 低(40)
    @NonNull
    public static Uri m() {
        return ApiHelperForOMR1.b();
    }

    @NonNull
    public static String n() {
        if(!WebViewFeatureInternal.X.d()) {
            throw WebViewFeatureInternal.a();
        }
        return WebViewCompat.h().getStatics().getVariationsHeader();
    }

    // 去混淆评级： 低(40)
    @Nullable
    public static WebChromeClient o(@NonNull WebView webView0) {
        return ApiHelperForO.c(webView0);
    }

    // 去混淆评级： 低(40)
    @NonNull
    public static WebViewClient p(@NonNull WebView webView0) {
        return ApiHelperForO.d(webView0);
    }

    @Nullable
    public static WebViewRenderProcess q(@NonNull WebView webView0) {
        android.webkit.WebViewRenderProcess webViewRenderProcess0 = ApiHelperForQ.b(webView0);
        return webViewRenderProcess0 != null ? WebViewRenderProcessImpl.b(webViewRenderProcess0) : null;
    }

    // 去混淆评级： 低(25)
    @Nullable
    public static WebViewRenderProcessClient r(@NonNull WebView webView0) {
        android.webkit.WebViewRenderProcessClient webViewRenderProcessClient0 = ApiHelperForQ.c(webView0);
        return webViewRenderProcessClient0 == null || !(webViewRenderProcessClient0 instanceof WebViewRenderProcessClientFrameworkAdapter) ? null : ((WebViewRenderProcessClientFrameworkAdapter)webViewRenderProcessClient0).a();
    }

    public static boolean s(@NonNull WebView webView0) {
        if(!WebViewFeatureInternal.f0.d()) {
            throw WebViewFeatureInternal.a();
        }
        return WebViewCompat.l(webView0).j();
    }

    public static boolean t() {
        if(!WebViewFeatureInternal.R.d()) {
            throw WebViewFeatureInternal.a();
        }
        return WebViewCompat.h().getStatics().isMultiProcessEnabled();
    }

    // 去混淆评级： 低(20)
    public static void u(@NonNull WebView webView0, long v, @NonNull VisualStateCallback webViewCompat$VisualStateCallback0) {
        ApiHelperForM.i(webView0, v, webViewCompat$VisualStateCallback0);
    }

    public static void v(@NonNull WebView webView0, @NonNull WebMessageCompat webMessageCompat0, @NonNull Uri uri0) {
        if(WebViewCompat.a.equals(uri0)) {
            uri0 = WebViewCompat.b;
        }
        M apiFeature$M0 = WebViewFeatureInternal.F;
        if(webMessageCompat0.e() == 0) {
            ApiHelperForM.j(webView0, WebMessagePortImpl.g(webMessageCompat0), uri0);
            return;
        }
        if(!apiFeature$M0.d() || !WebMessageAdapter.a(webMessageCompat0.e())) {
            throw WebViewFeatureInternal.a();
        }
        WebViewCompat.l(webView0).k(webMessageCompat0, uri0);
    }

    public static void w(@NonNull WebView webView0, @NonNull String s) {
        if(!WebViewFeatureInternal.U.d()) {
            throw WebViewFeatureInternal.a();
        }
        WebViewCompat.l(webView0).l(s);
    }

    public static void x(@NonNull WebView webView0, boolean z) {
        if(!WebViewFeatureInternal.f0.d()) {
            throw WebViewFeatureInternal.a();
        }
        WebViewCompat.l(webView0).m(z);
    }

    @UiThread
    public static void y(@NonNull WebView webView0, @NonNull String s) {
        if(!WebViewFeatureInternal.c0.d()) {
            throw WebViewFeatureInternal.a();
        }
        WebViewCompat.l(webView0).n(s);
    }

    public static void z(@NonNull Set set0, @Nullable ValueCallback valueCallback0) {
        if(WebViewFeatureInternal.i.d()) {
            WebViewCompat.h().getStatics().setSafeBrowsingAllowlist(set0, valueCallback0);
            return;
        }
        ApiHelperForOMR1.d(new ArrayList(set0), valueCallback0);
    }
}

