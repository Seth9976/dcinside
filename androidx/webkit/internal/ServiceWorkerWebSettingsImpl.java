package androidx.webkit.internal;

import android.webkit.ServiceWorkerWebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Set;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.util.a;

public class ServiceWorkerWebSettingsImpl extends ServiceWorkerWebSettingsCompat {
    private ServiceWorkerWebSettings a;
    private ServiceWorkerWebSettingsBoundaryInterface b;

    public ServiceWorkerWebSettingsImpl(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0) {
        this.a = serviceWorkerWebSettings0;
    }

    public ServiceWorkerWebSettingsImpl(@NonNull InvocationHandler invocationHandler0) {
        this.b = (ServiceWorkerWebSettingsBoundaryInterface)a.a(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler0);
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean a() {
        return ApiHelperForN.a(this.l());
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean b() {
        return ApiHelperForN.b(this.l());
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean c() {
        return ApiHelperForN.c(this.l());
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    public int d() {
        return ApiHelperForN.d(this.l());
    }

    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    @NonNull
    public Set e() {
        if(!WebViewFeatureInternal.a0.d()) {
            throw WebViewFeatureInternal.a();
        }
        return this.k().getRequestedWithHeaderOriginAllowList();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void f(boolean z) {
        ApiHelperForN.k(this.l(), z);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void g(boolean z) {
        ApiHelperForN.l(this.l(), z);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void h(boolean z) {
        ApiHelperForN.m(this.l(), z);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void i(int v) {
        ApiHelperForN.n(this.l(), v);
    }

    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void j(@NonNull Set set0) {
        if(!WebViewFeatureInternal.a0.d()) {
            throw WebViewFeatureInternal.a();
        }
        this.k().setRequestedWithHeaderOriginAllowList(set0);
    }

    private ServiceWorkerWebSettingsBoundaryInterface k() {
        if(this.b == null) {
            InvocationHandler invocationHandler0 = WebViewGlueCommunicator.c().e(this.a);
            this.b = (ServiceWorkerWebSettingsBoundaryInterface)a.a(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler0);
        }
        return this.b;
    }

    @RequiresApi(24)
    private ServiceWorkerWebSettings l() {
        if(this.a == null) {
            this.a = WebViewGlueCommunicator.c().d(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }
}

