package androidx.webkit;

import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.webkit.internal.ApiHelperForM;
import androidx.webkit.internal.ApiHelperForN;
import androidx.webkit.internal.ApiHelperForO;
import androidx.webkit.internal.ApiHelperForQ;
import androidx.webkit.internal.WebSettingsAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;

public class WebSettingsCompat {
    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    public @interface ForceDark {
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    public @interface ForceDarkStrategy {
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    public @interface MenuItemFlags {
    }

    @Deprecated
    public static final int a = 0;
    @Deprecated
    public static final int b = 1;
    @Deprecated
    public static final int c = 2;
    @Deprecated
    public static final int d = 0;
    @Deprecated
    public static final int e = 1;
    @Deprecated
    public static final int f = 2;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;

    private static WebSettingsAdapter a(WebSettings webSettings0) {
        return WebViewGlueCommunicator.c().f(webSettings0);
    }

    public static int b(@NonNull WebSettings webSettings0) {
        if(!WebViewFeatureInternal.d0.d()) {
            throw WebViewFeatureInternal.a();
        }
        return WebSettingsCompat.a(webSettings0).a();
    }

    // 去混淆评级： 低(40)
    public static int c(@NonNull WebSettings webSettings0) {
        return ApiHelperForN.f(webSettings0);
    }

    public static boolean d(@NonNull WebSettings webSettings0) {
        if(!WebViewFeatureInternal.Y.d()) {
            throw WebViewFeatureInternal.a();
        }
        return WebSettingsCompat.a(webSettings0).c();
    }

    // 去混淆评级： 低(40)
    @Deprecated
    public static int e(@NonNull WebSettings webSettings0) {
        return ApiHelperForQ.a(webSettings0);
    }

    @Deprecated
    public static int f(@NonNull WebSettings webSettings0) {
        if(!WebViewFeatureInternal.T.d()) {
            throw WebViewFeatureInternal.a();
        }
        return WebSettingsCompat.a(webSettings0).d();
    }

    // 去混淆评级： 低(40)
    public static boolean g(@NonNull WebSettings webSettings0) {
        return ApiHelperForM.g(webSettings0);
    }

    @NonNull
    public static Set h(@NonNull WebSettings webSettings0) {
        if(!WebViewFeatureInternal.a0.d()) {
            throw WebViewFeatureInternal.a();
        }
        return WebSettingsCompat.a(webSettings0).g();
    }

    // 去混淆评级： 低(40)
    public static boolean i(@NonNull WebSettings webSettings0) {
        return ApiHelperForO.b(webSettings0);
    }

    @NonNull
    public static UserAgentMetadata j(@NonNull WebSettings webSettings0) {
        if(!WebViewFeatureInternal.b0.d()) {
            throw WebViewFeatureInternal.a();
        }
        return WebSettingsCompat.a(webSettings0).i();
    }

    @NonNull
    public static WebViewMediaIntegrityApiStatusConfig k(@NonNull WebSettings webSettings0) {
        if(!WebViewFeatureInternal.e0.d()) {
            throw WebViewFeatureInternal.a();
        }
        return WebSettingsCompat.a(webSettings0).j();
    }

    public static boolean l(@NonNull WebSettings webSettings0) {
        if(!WebViewFeatureInternal.P.d()) {
            throw WebViewFeatureInternal.a();
        }
        return WebSettingsCompat.a(webSettings0).k();
    }

    public static void m(@NonNull WebSettings webSettings0, boolean z) {
        if(!WebViewFeatureInternal.P.d()) {
            throw WebViewFeatureInternal.a();
        }
        WebSettingsCompat.a(webSettings0).l(z);
    }

    public static void n(@NonNull WebSettings webSettings0, int v) {
        if(!WebViewFeatureInternal.d0.d()) {
            throw WebViewFeatureInternal.a();
        }
        WebSettingsCompat.a(webSettings0).m(v);
    }

    // 去混淆评级： 低(20)
    public static void o(@NonNull WebSettings webSettings0, int v) {
        ApiHelperForN.o(webSettings0, v);
    }

    public static void p(@NonNull WebSettings webSettings0, boolean z) {
        if(!WebViewFeatureInternal.Y.d()) {
            throw WebViewFeatureInternal.a();
        }
        WebSettingsCompat.a(webSettings0).o(z);
    }

    // 去混淆评级： 低(20)
    @Deprecated
    public static void q(@NonNull WebSettings webSettings0, int v) {
        ApiHelperForQ.d(webSettings0, v);
    }

    @Deprecated
    public static void r(@NonNull WebSettings webSettings0, int v) {
        if(!WebViewFeatureInternal.T.d()) {
            throw WebViewFeatureInternal.a();
        }
        WebSettingsCompat.a(webSettings0).q(v);
    }

    // 去混淆评级： 低(20)
    public static void s(@NonNull WebSettings webSettings0, boolean z) {
        ApiHelperForM.k(webSettings0, z);
    }

    public static void t(@NonNull WebSettings webSettings0, @NonNull Set set0) {
        if(!WebViewFeatureInternal.a0.d()) {
            throw WebViewFeatureInternal.a();
        }
        WebSettingsCompat.a(webSettings0).s(set0);
    }

    // 去混淆评级： 低(20)
    public static void u(@NonNull WebSettings webSettings0, boolean z) {
        ApiHelperForO.e(webSettings0, z);
    }

    public static void v(@NonNull WebSettings webSettings0, @NonNull UserAgentMetadata userAgentMetadata0) {
        if(!WebViewFeatureInternal.b0.d()) {
            throw WebViewFeatureInternal.a();
        }
        WebSettingsCompat.a(webSettings0).u(userAgentMetadata0);
    }

    public static void w(@NonNull WebSettings webSettings0, @NonNull WebViewMediaIntegrityApiStatusConfig webViewMediaIntegrityApiStatusConfig0) {
        if(!WebViewFeatureInternal.e0.d()) {
            throw WebViewFeatureInternal.a();
        }
        WebSettingsCompat.a(webSettings0).v(webViewMediaIntegrityApiStatusConfig0);
    }
}

