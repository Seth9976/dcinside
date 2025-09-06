package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.f;
import kotlin.text.v;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import y4.l;
import y4.m;

public class AndroidSocketAdapter implements SocketAdapter {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        private final AndroidSocketAdapter build(Class class0) {
            Class class1 = class0;
            while(class1 != null && !L.g(class1.getSimpleName(), "OpenSSLSocketImpl")) {
                class1 = class1.getSuperclass();
                if(class1 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + class0);
                }
                if(false) {
                    break;
                }
            }
            L.m(class1);
            return new AndroidSocketAdapter(class1);
        }

        @l
        public final Factory factory(@l String s) {
            L.p(s, "packageName");
            return new Factory() {
                @Override  // okhttp3.internal.platform.android.DeferredSocketAdapter$Factory
                @l
                public SocketAdapter create(@l SSLSocket sSLSocket0) {
                    L.p(sSLSocket0, "sslSocket");
                    Class class0 = sSLSocket0.getClass();
                    return AndroidSocketAdapter.Companion.build(class0);
                }

                @Override  // okhttp3.internal.platform.android.DeferredSocketAdapter$Factory
                public boolean matchesSocket(@l SSLSocket sSLSocket0) {
                    L.p(sSLSocket0, "sslSocket");
                    String s = sSLSocket0.getClass().getName();
                    L.o(s, "sslSocket.javaClass.name");
                    return v.v2(s, this.$packageName + '.', false, 2, null);
                }
            };
        }

        @l
        public final Factory getPlayProviderFactory() {
            return AndroidSocketAdapter.playProviderFactory;
        }
    }

    @l
    public static final Companion Companion;
    private final Method getAlpnSelectedProtocol;
    @l
    private static final Factory playProviderFactory;
    private final Method setAlpnProtocols;
    private final Method setHostname;
    @l
    private final Method setUseSessionTickets;
    @l
    private final Class sslSocketClass;

    static {
        Companion androidSocketAdapter$Companion0 = new Companion(null);
        AndroidSocketAdapter.Companion = androidSocketAdapter$Companion0;
        AndroidSocketAdapter.playProviderFactory = androidSocketAdapter$Companion0.factory("com.google.android.gms.org.conscrypt");
    }

    public AndroidSocketAdapter(@l Class class0) {
        L.p(class0, "sslSocketClass");
        super();
        this.sslSocketClass = class0;
        Method method0 = class0.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        L.o(method0, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.setUseSessionTickets = method0;
        this.setHostname = class0.getMethod("setHostname", String.class);
        this.getAlpnSelectedProtocol = class0.getMethod("getAlpnSelectedProtocol", null);
        this.setAlpnProtocols = class0.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(@l SSLSocket sSLSocket0, @m String s, @l List list0) {
        L.p(sSLSocket0, "sslSocket");
        L.p(list0, "protocols");
        if(this.matchesSocket(sSLSocket0)) {
            try {
                this.setUseSessionTickets.invoke(sSLSocket0, Boolean.TRUE);
                if(s != null) {
                    this.setHostname.invoke(sSLSocket0, s);
                }
                Object[] arr_object = {Platform.Companion.concatLengthPrefixed(list0)};
                this.setAlpnProtocols.invoke(sSLSocket0, arr_object);
                return;
            }
            catch(IllegalAccessException illegalAccessException0) {
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new AssertionError(invocationTargetException0);
            }
            throw new AssertionError(illegalAccessException0);
        }
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    @m
    public String getSelectedProtocol(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        if(!this.matchesSocket(sSLSocket0)) {
            return null;
        }
        try {
            byte[] arr_b = (byte[])this.getAlpnSelectedProtocol.invoke(sSLSocket0, null);
            return arr_b == null ? null : new String(arr_b, f.b);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new AssertionError(illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Throwable throwable0 = invocationTargetException0.getCause();
            if(!(throwable0 instanceof NullPointerException) || !L.g(((NullPointerException)throwable0).getMessage(), "ssl == null")) {
                throw new AssertionError(invocationTargetException0);
            }
            return null;
        }
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return AndroidPlatform.Companion.isSupported();
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        return this.sslSocketClass.isInstance(sSLSocket0);
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(@l SSLSocketFactory sSLSocketFactory0) {
        return DefaultImpls.matchesSocketFactory(this, sSLSocketFactory0);
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    @m
    public X509TrustManager trustManager(@l SSLSocketFactory sSLSocketFactory0) {
        return DefaultImpls.trustManager(this, sSLSocketFactory0);
    }
}

