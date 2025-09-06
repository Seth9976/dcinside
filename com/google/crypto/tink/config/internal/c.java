package com.google.crypto.tink.config.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

public final class c {
    static class a {
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static abstract class b extends Enum {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.crypto.tink.config.internal.c.b.a extends b {
            com.google.crypto.tink.config.internal.c.b.a(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.google.crypto.tink.config.internal.c$b
            public boolean a() {
                return !c.e();
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.crypto.tink.config.internal.c.b.b extends b {
            com.google.crypto.tink.config.internal.c.b.b(String s, int v) {
                super(s, v, null);
            }

            // 去混淆评级： 低(20)
            @Override  // com.google.crypto.tink.config.internal.c$b
            public boolean a() {
                return !c.e() || c.b();
            }
        }

        public static final enum b a;
        public static final enum b b;
        private static final b[] c;

        static {
            com.google.crypto.tink.config.internal.c.b.a c$b$a0 = new com.google.crypto.tink.config.internal.c.b.a("ALGORITHM_NOT_FIPS", 0);
            b.a = c$b$a0;
            com.google.crypto.tink.config.internal.c.b.b c$b$b0 = new com.google.crypto.tink.config.internal.c.b.b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            b.b = c$b$b0;
            b.c = new b[]{c$b$a0, c$b$b0};
        }

        private b(String s, int v) {
            super(s, v);
        }

        b(String s, int v, a c$a0) {
            this(s, v);
        }

        public abstract boolean a();

        public static b valueOf(String s) {
            return (b)Enum.valueOf(b.class, s);
        }

        public static b[] values() {
            return (b[])b.c.clone();
        }
    }

    private static final Logger a;
    private static final AtomicBoolean b;

    static {
        c.a = Logger.getLogger("com.google.crypto.tink.config.internal.c");
        c.b = new AtomicBoolean(false);
    }

    static Boolean a() {
        try {
            return (Boolean)Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        }
        catch(Exception unused_ex) {
            c.a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return false;
        }
    }

    public static boolean b() {
        return c.a().booleanValue();
    }

    public static void c() {
        c.b.set(true);
    }

    public static void d() {
        c.b.set(false);
    }

    public static boolean e() {
        return c.b.get();
    }
}

