package androidx.webkit.internal;

import android.webkit.WebResourceError;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebResourceErrorCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.util.a;

public class WebResourceErrorImpl extends WebResourceErrorCompat {
    private WebResourceError a;
    private WebResourceErrorBoundaryInterface b;

    public WebResourceErrorImpl(@NonNull WebResourceError webResourceError0) {
        this.a = webResourceError0;
    }

    public WebResourceErrorImpl(@NonNull InvocationHandler invocationHandler0) {
        this.b = (WebResourceErrorBoundaryInterface)a.a(WebResourceErrorBoundaryInterface.class, invocationHandler0);
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.webkit.WebResourceErrorCompat
    @NonNull
    public CharSequence a() {
        return ApiHelperForM.e(this.d());
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.webkit.WebResourceErrorCompat
    public int b() {
        return ApiHelperForM.f(this.d());
    }

    private WebResourceErrorBoundaryInterface c() {
        if(this.b == null) {
            InvocationHandler invocationHandler0 = WebViewGlueCommunicator.c().j(this.a);
            this.b = (WebResourceErrorBoundaryInterface)a.a(WebResourceErrorBoundaryInterface.class, invocationHandler0);
        }
        return this.b;
    }

    @RequiresApi(23)
    private WebResourceError d() {
        if(this.a == null) {
            this.a = WebViewGlueCommunicator.c().i(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }
}

