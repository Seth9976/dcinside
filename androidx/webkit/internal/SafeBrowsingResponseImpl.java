package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.webkit.SafeBrowsingResponseCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.util.a;

public class SafeBrowsingResponseImpl extends SafeBrowsingResponseCompat {
    private SafeBrowsingResponse a;
    private SafeBrowsingResponseBoundaryInterface b;

    public SafeBrowsingResponseImpl(@NonNull SafeBrowsingResponse safeBrowsingResponse0) {
        this.a = safeBrowsingResponse0;
    }

    public SafeBrowsingResponseImpl(@NonNull InvocationHandler invocationHandler0) {
        this.b = (SafeBrowsingResponseBoundaryInterface)a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.webkit.SafeBrowsingResponseCompat
    public void a(boolean z) {
        ApiHelperForOMR1.a(this.e(), z);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.webkit.SafeBrowsingResponseCompat
    public void b(boolean z) {
        ApiHelperForOMR1.c(this.e(), z);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.webkit.SafeBrowsingResponseCompat
    public void c(boolean z) {
        ApiHelperForOMR1.e(this.e(), z);
    }

    private SafeBrowsingResponseBoundaryInterface d() {
        if(this.b == null) {
            InvocationHandler invocationHandler0 = WebViewGlueCommunicator.c().c(this.a);
            this.b = (SafeBrowsingResponseBoundaryInterface)a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler0);
        }
        return this.b;
    }

    @RequiresApi(27)
    private SafeBrowsingResponse e() {
        if(this.a == null) {
            this.a = WebViewGlueCommunicator.c().b(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }
}

