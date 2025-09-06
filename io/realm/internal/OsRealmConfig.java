package io.realm.internal;

import io.realm.CompactOnLaunchCallback;
import io.realm.Q0;
import io.realm.log.RealmLog;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy.Type;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import o3.h;

public class OsRealmConfig implements l {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[Proxy.Type.values().length];
            a.a = arr_v;
            try {
                arr_v[Proxy.Type.HTTP.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static class b {
        private Q0 a;
        private OsSchemaInfo b;
        private MigrationCallback c;
        private InitializationCallback d;
        private boolean e;
        private String f;

        public b(Q0 q00) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = false;
            this.f = "";
            this.a = q00;
        }

        public b a(boolean z) {
            this.e = z;
            return this;
        }

        public OsRealmConfig b() {
            return new OsRealmConfig(this.a, this.f, this.e, this.b, this.c, this.d, null);
        }

        public b c(File file0) {
            this.f = file0.getAbsolutePath();
            return this;
        }

        public b d(@h InitializationCallback osSharedRealm$InitializationCallback0) {
            this.d = osSharedRealm$InitializationCallback0;
            return this;
        }

        public b e(@h MigrationCallback osSharedRealm$MigrationCallback0) {
            this.c = osSharedRealm$MigrationCallback0;
            return this;
        }

        public b f(@h OsSchemaInfo osSchemaInfo0) {
            this.b = osSchemaInfo0;
            return this;
        }
    }

    public static enum c {
        FULL(0),
        MEM_ONLY(1);

        final int a;

        private c(int v1) {
            this.a = v1;
        }
    }

    public static enum d {
        SCHEMA_MODE_AUTOMATIC(0),
        SCHEMA_MODE_IMMUTABLE(1),
        SCHEMA_MODE_READONLY(2),
        SCHEMA_MODE_SOFT_RESET_FILE(3),
        SCHEMA_MODE_ADDITIVE_DISCOVERED(5),
        SCHEMA_MODE_MANUAL(7);

        final byte a;

        private d(byte b) {
            this.a = b;
        }

        public byte a() {
            return this.a;
        }
    }

    public static enum e {
        IMMEDIATELY(0),
        LIVE_INDEFINITELY(1),
        AFTER_CHANGES_UPLOADED(2);

        final byte a;

        private e(byte b) {
            this.a = b;
        }

        public byte a() {
            return this.a;
        }
    }

    private final Object a;
    private final Object b;
    private final Q0 c;
    private final URI d;
    private final long e;
    private final k f;
    private final CompactOnLaunchCallback g;
    private final MigrationCallback h;
    private final InitializationCallback i;
    private static final byte j = 0;
    private static final byte k = 1;
    private static final byte l = 2;
    private static final byte m = 3;
    private static final byte n = 5;
    private static final byte o = 6;
    private static final byte p = 7;
    private static final byte q = 0;
    private static final byte r = 1;
    private static final byte s = 2;
    private static final byte t = 0;
    public static final byte u = 0;
    public static final byte v = 1;
    public static final byte w = 2;
    public static final byte x = 3;
    private static final long y;

    static {
        OsRealmConfig.y = OsRealmConfig.nativeGetFinalizerPtr();
    }

    private OsRealmConfig(Q0 q00, String s, boolean z, @h OsSchemaInfo osSchemaInfo0, @h MigrationCallback osSharedRealm$MigrationCallback0, @h InitializationCallback osSharedRealm$InitializationCallback0) {
        URI uRI1;
        String s13;
        URI uRI0;
        this.f = new k();
        this.c = q00;
        this.e = OsRealmConfig.nativeCreate(q00.n(), s, true, q00.k());
        k.c.a(this);
        Object[] arr_object = m.g().f(q00);
        String s1 = (String)arr_object[0];
        String s2 = (String)arr_object[1];
        String s3 = (String)arr_object[2];
        String s4 = (String)arr_object[3];
        String s5 = (String)arr_object[4];
        String s6 = (String)arr_object[5];
        String s7 = (String)arr_object[6];
        Byte byte0 = (Byte)arr_object[7];
        String s8 = (String)arr_object[8];
        String s9 = (String)arr_object[9];
        Map map0 = (Map)arr_object[10];
        Byte byte1 = (Byte)arr_object[11];
        this.a = arr_object[12];
        this.b = arr_object[13];
        String s10 = (String)arr_object[14];
        Object object0 = arr_object[15];
        Long long0 = (Long)arr_object[16];
        boolean z1 = Boolean.TRUE.equals(arr_object[17]);
        String s11 = (String)arr_object[18];
        String[] arr_s = new String[(map0 == null ? 0 : map0.size() * 2)];
        if(map0 != null) {
            int v = 0;
            for(Object object1: map0.entrySet()) {
                arr_s[v] = (String)((Map.Entry)object1).getKey();
                arr_s[v + 1] = (String)((Map.Entry)object1).getValue();
                v += 2;
            }
        }
        byte[] arr_b = q00.g();
        if(arr_b != null) {
            OsRealmConfig.nativeSetEncryptionKey(this.e, arr_b);
        }
        OsRealmConfig.nativeSetInMemory(this.e, q00.f() == c.c);
        OsRealmConfig.nativeEnableChangeNotification(this.e, z);
        d osRealmConfig$d0 = d.g;
        if(q00.y()) {
            osRealmConfig$d0 = d.c;
        }
        else if(q00.x()) {
            osRealmConfig$d0 = d.d;
        }
        else if(s3 != null) {
            osRealmConfig$d0 = d.f;
        }
        else if(q00.B()) {
            osRealmConfig$d0 = d.e;
        }
        this.h = osSharedRealm$MigrationCallback0;
        this.nativeSetSchemaConfig(this.e, osRealmConfig$d0.a(), q00.t(), (osSchemaInfo0 == null ? 0L : osSchemaInfo0.getNativePtr()), osSharedRealm$MigrationCallback0);
        CompactOnLaunchCallback compactOnLaunchCallback0 = q00.e();
        this.g = compactOnLaunchCallback0;
        if(compactOnLaunchCallback0 != null) {
            OsRealmConfig.nativeSetCompactOnLaunchCallback(this.e, compactOnLaunchCallback0);
        }
        this.i = osSharedRealm$InitializationCallback0;
        if(osSharedRealm$InitializationCallback0 != null) {
            this.nativeSetInitializationCallback(this.e, osSharedRealm$InitializationCallback0);
        }
        if(s3 == null) {
            uRI0 = null;
        }
        else {
            String s12 = this.nativeCreateAndSetSyncConfig(((long)long0), this.e, s3, s1, s2, s5, s6, s7, ((byte)byte0), s8, s9, arr_s, ((byte)byte1), this.a, this.b, s10, object0);
            try {
                s12 = s4 + s8.substring(1);
                uRI0 = new URI(s12);
                s13 = s12;
            }
            catch(URISyntaxException uRISyntaxException0) {
                RealmLog.h(uRISyntaxException0, "Cannot create a URI from the Realm URL address", new Object[0]);
                s13 = s12;
                uRI0 = null;
            }
            OsRealmConfig.nativeSetSyncConfigSslSettings(this.e, z1, s11);
            ProxySelector proxySelector0 = ProxySelector.getDefault();
            if(uRI0 != null && proxySelector0 != null) {
                try {
                    uRI1 = new URI(s13.replaceFirst("ws", "http"));
                }
                catch(URISyntaxException uRISyntaxException1) {
                    RealmLog.h(uRISyntaxException1, "Cannot create a URI from the Realm URL address", new Object[0]);
                    uRI1 = null;
                }
                List list0 = proxySelector0.select(uRI1);
                if(list0 != null && !list0.isEmpty()) {
                    Proxy proxy0 = (Proxy)list0.get(0);
                    if(proxy0.type() != Proxy.Type.DIRECT) {
                        int v1 = a.a[proxy0.type().ordinal()] == 1 ? 0 : -1;
                        if(proxy0.type() == Proxy.Type.HTTP) {
                            SocketAddress socketAddress0 = proxy0.address();
                            if(socketAddress0 instanceof InetSocketAddress) {
                                String s14 = this.b(((InetSocketAddress)socketAddress0));
                                if(s14 == null) {
                                    RealmLog.f("Could not retrieve proxy\'s hostname.", new Object[0]);
                                }
                                else {
                                    int v2 = ((InetSocketAddress)socketAddress0).getPort();
                                    OsRealmConfig.nativeSetSyncConfigProxySettings(this.e, ((byte)v1), s14, v2);
                                }
                            }
                            else {
                                RealmLog.f(("Unsupported proxy socket address type: " + socketAddress0.getClass().getName()), new Object[0]);
                            }
                        }
                        else {
                            RealmLog.f("SOCKS proxies are not supported.", new Object[0]);
                        }
                    }
                }
            }
        }
        this.d = uRI0;
    }

    OsRealmConfig(Q0 q00, String s, boolean z, OsSchemaInfo osSchemaInfo0, MigrationCallback osSharedRealm$MigrationCallback0, InitializationCallback osSharedRealm$InitializationCallback0, a osRealmConfig$a0) {
        this(q00, s, z, osSchemaInfo0, osSharedRealm$MigrationCallback0, osSharedRealm$InitializationCallback0);
    }

    k a() {
        return this.f;
    }

    private String b(InetSocketAddress inetSocketAddress0) {
        if(inetSocketAddress0.getHostName() != null) {
            return inetSocketAddress0.getHostName();
        }
        if(inetSocketAddress0.getAddress() != null) {
            InetAddress inetAddress0 = inetSocketAddress0.getAddress();
            return inetAddress0.getHostName() == null ? inetAddress0.getHostAddress() : inetAddress0.getHostName();
        }
        return null;
    }

    public Q0 c() {
        return this.c;
    }

    public URI d() {
        return this.d;
    }

    @Override  // io.realm.internal.l
    public long getNativeFinalizerPtr() {
        return OsRealmConfig.y;
    }

    @Override  // io.realm.internal.l
    public long getNativePtr() {
        return this.e;
    }

    private static native long nativeCreate(String arg0, String arg1, boolean arg2, long arg3) {
    }

    private native String nativeCreateAndSetSyncConfig(long arg1, long arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, byte arg9, String arg10, String arg11, String[] arg12, byte arg13, Object arg14, Object arg15, String arg16, Object arg17) {
    }

    private static native void nativeEnableChangeNotification(long arg0, boolean arg1) {
    }

    private static native long nativeGetFinalizerPtr() {
    }

    private static native void nativeSetCompactOnLaunchCallback(long arg0, CompactOnLaunchCallback arg1) {
    }

    private static native void nativeSetEncryptionKey(long arg0, byte[] arg1) {
    }

    private static native void nativeSetInMemory(long arg0, boolean arg1) {
    }

    private native void nativeSetInitializationCallback(long arg1, InitializationCallback arg2) {
    }

    private native void nativeSetSchemaConfig(long arg1, byte arg2, long arg3, long arg4, @h MigrationCallback arg5) {
    }

    private static native void nativeSetSyncConfigProxySettings(long arg0, byte arg1, String arg2, int arg3) {
    }

    private static native void nativeSetSyncConfigSslSettings(long arg0, boolean arg1, String arg2) {
    }
}

