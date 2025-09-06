package androidx.datastore.preferences.protobuf;

final class Android {
    private static final Class a;
    private static final boolean b;

    static {
        Android.a = Android.a("libcore.io.Memory");
        Android.b = Android.a("org.robolectric.Robolectric") != null;
    }

    private static Class a(String s) {
        try {
            return Class.forName(s);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static Class b() {
        return Android.a;
    }

    static boolean c() [...] // 潜在的解密器
}

