package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class Jdk8WithJettyBootPlatform extends Platform {
    static final class AlpnProvider implements InvocationHandler {
        @l
        private final List protocols;
        @m
        private String selected;
        private boolean unsupported;

        public AlpnProvider(@l List list0) {
            L.p(list0, "protocols");
            super();
            this.protocols = list0;
        }

        @m
        public final String getSelected() {
            return this.selected;
        }

        public final boolean getUnsupported() {
            return this.unsupported;
        }

        @Override
        @m
        public Object invoke(@l Object object0, @l Method method0, @m Object[] arr_object) throws Throwable {
            L.p(object0, "proxy");
            L.p(method0, "method");
            if(arr_object == null) {
                arr_object = new Object[0];
            }
            String s = method0.getName();
            Class class0 = method0.getReturnType();
            if(L.g(s, "supports") && L.g(Boolean.TYPE, class0)) {
                return true;
            }
            if(L.g(s, "unsupported") && L.g(Void.TYPE, class0)) {
                this.unsupported = true;
                return null;
            }
            if(L.g(s, "protocols") && arr_object.length == 0) {
                return this.protocols;
            }
            if((L.g(s, "selectProtocol") || L.g(s, "select")) && L.g(String.class, class0) && arr_object.length == 1) {
                Object object1 = arr_object[0];
                if(object1 instanceof List) {
                    L.n(object1, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    int v = ((List)object1).size();
                    if(v >= 0) {
                        for(int v1 = 0; true; ++v1) {
                            Object object2 = ((List)object1).get(v1);
                            L.n(object2, "null cannot be cast to non-null type kotlin.String");
                            String s1 = (String)object2;
                            if(this.protocols.contains(s1)) {
                                this.selected = s1;
                                return s1;
                            }
                            if(v1 == v) {
                                break;
                            }
                        }
                    }
                    String s2 = (String)this.protocols.get(0);
                    this.selected = s2;
                    return s2;
                }
            }
            if((L.g(s, "protocolSelected") || L.g(s, "selected")) && arr_object.length == 1) {
                Object object3 = arr_object[0];
                L.n(object3, "null cannot be cast to non-null type kotlin.String");
                this.selected = (String)object3;
                return null;
            }
            return method0.invoke(this, Arrays.copyOf(arr_object, arr_object.length));
        }

        public final void setSelected(@m String s) {
            this.selected = s;
        }

        public final void setUnsupported(boolean z) {
            this.unsupported = z;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @m
        public final Platform buildIfSupported() {
            Class class0;
            try {
                class0 = SSLSocket.class;
                L.o("0.9", "jvmVersion");
                if(Integer.parseInt("0.9") >= 9) {
                    return null;
                }
            }
            catch(NumberFormatException unused_ex) {
            }
            try {
                Class class1 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class class2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class class3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class class4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method0 = class1.getMethod("put", class0, class2);
                Method method1 = class1.getMethod("get", class0);
                Method method2 = class1.getMethod("remove", class0);
                L.o(method0, "putMethod");
                L.o(method1, "getMethod");
                L.o(method2, "removeMethod");
                L.o(class3, "clientProviderClass");
                L.o(class4, "serverProviderClass");
                return new Jdk8WithJettyBootPlatform(method0, method1, method2, class3, class4);
            }
            catch(ClassNotFoundException | NoSuchMethodException unused_ex) {
                return null;
            }
        }
    }

    @l
    public static final Companion Companion;
    @l
    private final Class clientProviderClass;
    @l
    private final Method getMethod;
    @l
    private final Method putMethod;
    @l
    private final Method removeMethod;
    @l
    private final Class serverProviderClass;

    static {
        Jdk8WithJettyBootPlatform.Companion = new Companion(null);
    }

    public Jdk8WithJettyBootPlatform(@l Method method0, @l Method method1, @l Method method2, @l Class class0, @l Class class1) {
        L.p(method0, "putMethod");
        L.p(method1, "getMethod");
        L.p(method2, "removeMethod");
        L.p(class0, "clientProviderClass");
        L.p(class1, "serverProviderClass");
        super();
        this.putMethod = method0;
        this.getMethod = method1;
        this.removeMethod = method2;
        this.clientProviderClass = class0;
        this.serverProviderClass = class1;
    }

    @Override  // okhttp3.internal.platform.Platform
    public void afterHandshake(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        try {
            this.removeMethod.invoke(null, sSLSocket0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new AssertionError("failed to remove ALPN", illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new AssertionError("failed to remove ALPN", invocationTargetException0);
        }
    }

    @Override  // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@l SSLSocket sSLSocket0, @m String s, @l List list0) {
        L.p(sSLSocket0, "sslSocket");
        L.p(list0, "protocols");
        List list1 = Platform.Companion.alpnProtocolNames(list0);
        try {
            AlpnProvider jdk8WithJettyBootPlatform$AlpnProvider0 = new AlpnProvider(list1);
            Object[] arr_object = {sSLSocket0, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, jdk8WithJettyBootPlatform$AlpnProvider0)};
            this.putMethod.invoke(null, arr_object);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new AssertionError("failed to set ALPN", invocationTargetException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new AssertionError("failed to set ALPN", illegalAccessException0);
        }
    }

    @Override  // okhttp3.internal.platform.Platform
    @m
    public String getSelectedProtocol(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        try {
            InvocationHandler invocationHandler0 = Proxy.getInvocationHandler(this.getMethod.invoke(null, sSLSocket0));
            L.n(invocationHandler0, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            if(!((AlpnProvider)invocationHandler0).getUnsupported() && ((AlpnProvider)invocationHandler0).getSelected() == null) {
                Platform.log$default(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            return ((AlpnProvider)invocationHandler0).getUnsupported() ? null : ((AlpnProvider)invocationHandler0).getSelected();
        }
        catch(InvocationTargetException invocationTargetException0) {
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new AssertionError("failed to get ALPN selected protocol", illegalAccessException0);
        }
        throw new AssertionError("failed to get ALPN selected protocol", invocationTargetException0);
    }
}

