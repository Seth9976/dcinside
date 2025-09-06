package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.JavaScriptReplyProxy;
import j..util.Objects;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.util.a;

public class JavaScriptReplyProxyImpl extends JavaScriptReplyProxy {
    private JsReplyProxyBoundaryInterface a;

    public JavaScriptReplyProxyImpl(@NonNull JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface0) {
        this.a = jsReplyProxyBoundaryInterface0;
    }

    @Override  // androidx.webkit.JavaScriptReplyProxy
    public void a(@NonNull String s) {
        if(!WebViewFeatureInternal.U.d()) {
            throw WebViewFeatureInternal.a();
        }
        this.a.postMessage(s);
    }

    @Override  // androidx.webkit.JavaScriptReplyProxy
    public void b(@NonNull byte[] arr_b) {
        Objects.requireNonNull(arr_b, "ArrayBuffer must be non-null");
        if(!WebViewFeatureInternal.C.d()) {
            throw WebViewFeatureInternal.a();
        }
        this.a.postMessageWithPayload(a.d(new WebMessagePayloadAdapter(arr_b)));
    }

    @NonNull
    public static JavaScriptReplyProxyImpl c(@NonNull InvocationHandler invocationHandler0) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface0 = (JsReplyProxyBoundaryInterface)a.a(JsReplyProxyBoundaryInterface.class, invocationHandler0);
        return (JavaScriptReplyProxyImpl)jsReplyProxyBoundaryInterface0.getOrCreatePeer(new Callable() {
            @Override
            public Object call() {
                return new JavaScriptReplyProxyImpl(jsReplyProxyBoundaryInterface0);
            }
        });
    }
}

