package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import j..util.Objects;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.util.a;

public class WebMessageAdapter implements WebMessageBoundaryInterface {
    private WebMessageCompat a;
    private static final String[] b;

    static {
        WebMessageAdapter.b = new String[]{"WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public WebMessageAdapter(@NonNull WebMessageCompat webMessageCompat0) {
        this.a = webMessageCompat0;
    }

    // 去混淆评级： 低(20)
    public static boolean a(int v) {
        return v == 0 || v == 1 && WebViewFeatureInternal.C.d();
    }

    @NonNull
    private static WebMessagePortCompat[] b(InvocationHandler[] arr_invocationHandler) {
        WebMessagePortCompat[] arr_webMessagePortCompat = new WebMessagePortCompat[arr_invocationHandler.length];
        for(int v = 0; v < arr_invocationHandler.length; ++v) {
            arr_webMessagePortCompat[v] = new WebMessagePortImpl(arr_invocationHandler[v]);
        }
        return arr_webMessagePortCompat;
    }

    @Nullable
    public static WebMessageCompat c(@NonNull WebMessageBoundaryInterface webMessageBoundaryInterface0) {
        WebMessagePortCompat[] arr_webMessagePortCompat = WebMessageAdapter.b(webMessageBoundaryInterface0.getPorts());
        if(WebViewFeatureInternal.C.d()) {
            InvocationHandler invocationHandler0 = webMessageBoundaryInterface0.getMessagePayload();
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface0 = (WebMessagePayloadBoundaryInterface)a.a(WebMessagePayloadBoundaryInterface.class, invocationHandler0);
            switch(webMessagePayloadBoundaryInterface0.getType()) {
                case 0: {
                    return new WebMessageCompat(webMessagePayloadBoundaryInterface0.getAsString(), arr_webMessagePortCompat);
                }
                case 1: {
                    return new WebMessageCompat(webMessagePayloadBoundaryInterface0.getAsArrayBuffer(), arr_webMessagePortCompat);
                }
                default: {
                    return null;
                }
            }
        }
        return new WebMessageCompat(webMessageBoundaryInterface0.getData(), arr_webMessagePortCompat);
    }

    @Override  // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Nullable
    @Deprecated
    public String getData() {
        return this.a.c();
    }

    @Override  // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Nullable
    public InvocationHandler getMessagePayload() {
        switch(this.a.e()) {
            case 0: {
                return a.d(new WebMessagePayloadAdapter(this.a.c()));
            }
            case 1: {
                byte[] arr_b = this.a.b();
                Objects.requireNonNull(arr_b);
                return a.d(new WebMessagePayloadAdapter(arr_b));
            }
            default: {
                throw new IllegalStateException("Unknown web message payload type: " + this.a.e());
            }
        }
    }

    @Override  // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Nullable
    public InvocationHandler[] getPorts() {
        WebMessagePortCompat[] arr_webMessagePortCompat = this.a.d();
        if(arr_webMessagePortCompat == null) {
            return null;
        }
        InvocationHandler[] arr_invocationHandler = new InvocationHandler[arr_webMessagePortCompat.length];
        for(int v = 0; v < arr_webMessagePortCompat.length; ++v) {
            arr_invocationHandler[v] = arr_webMessagePortCompat[v].c();
        }
        return arr_invocationHandler;
    }

    @Override  // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public String[] getSupportedFeatures() {
        return WebMessageAdapter.b;
    }
}

