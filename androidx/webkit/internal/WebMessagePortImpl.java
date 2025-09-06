package androidx.webkit.internal;

import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat;
import androidx.webkit.WebMessagePortCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.util.a;

public class WebMessagePortImpl extends WebMessagePortCompat {
    private WebMessagePort a;
    private WebMessagePortBoundaryInterface b;

    public WebMessagePortImpl(@NonNull WebMessagePort webMessagePort0) {
        this.a = webMessagePort0;
    }

    public WebMessagePortImpl(@NonNull InvocationHandler invocationHandler0) {
        this.b = (WebMessagePortBoundaryInterface)a.a(WebMessagePortBoundaryInterface.class, invocationHandler0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.webkit.WebMessagePortCompat
    public void a() {
        ApiHelperForM.a(this.k());
    }

    @Override  // androidx.webkit.WebMessagePortCompat
    @NonNull
    @RequiresApi(23)
    public WebMessagePort b() {
        return this.k();
    }

    @Override  // androidx.webkit.WebMessagePortCompat
    @NonNull
    public InvocationHandler c() {
        return Proxy.getInvocationHandler(this.j());
    }

    @Override  // androidx.webkit.WebMessagePortCompat
    public void d(@NonNull WebMessageCompat webMessageCompat0) {
        M apiFeature$M0 = WebViewFeatureInternal.A;
        if(webMessageCompat0.e() == 0) {
            ApiHelperForM.h(this.k(), WebMessagePortImpl.g(webMessageCompat0));
            return;
        }
        if(!apiFeature$M0.d() || !WebMessageAdapter.a(webMessageCompat0.e())) {
            throw WebViewFeatureInternal.a();
        }
        this.j().postMessage(a.d(new WebMessageAdapter(webMessageCompat0)));
    }

    @Override  // androidx.webkit.WebMessagePortCompat
    public void e(@Nullable Handler handler0, @NonNull WebMessageCallbackCompat webMessagePortCompat$WebMessageCallbackCompat0) {
        if(WebViewFeatureInternal.E.d()) {
            this.j().setWebMessageCallback(a.d(new WebMessageCallbackAdapter(webMessagePortCompat$WebMessageCallbackCompat0)), handler0);
            return;
        }
        ApiHelperForM.m(this.k(), webMessagePortCompat$WebMessageCallbackCompat0, handler0);
    }

    @Override  // androidx.webkit.WebMessagePortCompat
    public void f(@NonNull WebMessageCallbackCompat webMessagePortCompat$WebMessageCallbackCompat0) {
        if(WebViewFeatureInternal.D.d()) {
            this.j().setWebMessageCallback(a.d(new WebMessageCallbackAdapter(webMessagePortCompat$WebMessageCallbackCompat0)));
            return;
        }
        ApiHelperForM.l(this.k(), webMessagePortCompat$WebMessageCallbackCompat0);
    }

    @NonNull
    @RequiresApi(23)
    public static WebMessage g(@NonNull WebMessageCompat webMessageCompat0) {
        return ApiHelperForM.b(webMessageCompat0);
    }

    @Nullable
    @RequiresApi(23)
    public static WebMessagePort[] h(@Nullable WebMessagePortCompat[] arr_webMessagePortCompat) {
        if(arr_webMessagePortCompat == null) {
            return null;
        }
        WebMessagePort[] arr_webMessagePort = new WebMessagePort[arr_webMessagePortCompat.length];
        for(int v = 0; v < arr_webMessagePortCompat.length; ++v) {
            arr_webMessagePort[v] = arr_webMessagePortCompat[v].b();
        }
        return arr_webMessagePort;
    }

    @NonNull
    @RequiresApi(23)
    public static WebMessageCompat i(@NonNull WebMessage webMessage0) {
        return ApiHelperForM.d(webMessage0);
    }

    private WebMessagePortBoundaryInterface j() {
        if(this.b == null) {
            InvocationHandler invocationHandler0 = WebViewGlueCommunicator.c().h(this.a);
            this.b = (WebMessagePortBoundaryInterface)a.a(WebMessagePortBoundaryInterface.class, invocationHandler0);
        }
        return this.b;
    }

    @RequiresApi(23)
    private WebMessagePort k() {
        if(this.a == null) {
            this.a = WebViewGlueCommunicator.c().g(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }

    @Nullable
    public static WebMessagePortCompat[] l(@Nullable WebMessagePort[] arr_webMessagePort) {
        if(arr_webMessagePort == null) {
            return null;
        }
        WebMessagePortCompat[] arr_webMessagePortCompat = new WebMessagePortCompat[arr_webMessagePort.length];
        for(int v = 0; v < arr_webMessagePort.length; ++v) {
            arr_webMessagePortCompat[v] = new WebMessagePortImpl(arr_webMessagePort[v]);
        }
        return arr_webMessagePortCompat;
    }
}

