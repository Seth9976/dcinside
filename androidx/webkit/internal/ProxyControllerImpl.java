package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.ProxyConfig.ProxyRule;
import androidx.webkit.ProxyConfig;
import androidx.webkit.ProxyController;
import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;

public class ProxyControllerImpl extends ProxyController {
    private ProxyControllerBoundaryInterface a;

    @Override  // androidx.webkit.ProxyController
    public void a(@NonNull Executor executor0, @NonNull Runnable runnable0) {
        if(!WebViewFeatureInternal.Q.d()) {
            throw WebViewFeatureInternal.a();
        }
        this.d().clearProxyOverride(runnable0, executor0);
    }

    @Override  // androidx.webkit.ProxyController
    public void c(@NonNull ProxyConfig proxyConfig0, @NonNull Executor executor0, @NonNull Runnable runnable0) {
        NoFramework apiFeature$NoFramework0 = WebViewFeatureInternal.Q;
        NoFramework apiFeature$NoFramework1 = WebViewFeatureInternal.W;
        String[][] arr2_s = ProxyControllerImpl.e(proxyConfig0.b());
        Object[] arr_object = proxyConfig0.a().toArray(new String[0]);
        if(apiFeature$NoFramework0.d() && !proxyConfig0.c()) {
            this.d().setProxyOverride(arr2_s, ((String[])arr_object), runnable0, executor0);
            return;
        }
        if(!apiFeature$NoFramework0.d() || !apiFeature$NoFramework1.d()) {
            throw WebViewFeatureInternal.a();
        }
        this.d().setProxyOverride(arr2_s, ((String[])arr_object), runnable0, executor0, proxyConfig0.c());
    }

    private ProxyControllerBoundaryInterface d() {
        if(this.a == null) {
            this.a = WebViewGlueCommunicator.d().getProxyController();
        }
        return this.a;
    }

    @NonNull
    @VisibleForTesting
    public static String[][] e(@NonNull List list0) {
        int[] arr_v = new int[2];
        arr_v[1] = 2;
        arr_v[0] = list0.size();
        String[][] arr2_s = (String[][])Array.newInstance(String.class, arr_v);
        for(int v = 0; v < list0.size(); ++v) {
            String[] arr_s = arr2_s[v];
            arr_s[0] = ((ProxyRule)list0.get(v)).a();
            String[] arr_s1 = arr2_s[v];
            arr_s1[1] = ((ProxyRule)list0.get(v)).b();
        }
        return arr2_s;
    }
}

