package com.vungle.ads.internal.util;

import java.util.regex.Pattern;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.r;
import y4.l;
import z3.n;

public final class p {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @n
        public final int d(@l String s, @l String s1) {
            L.p(s, "tag");
            L.p(s1, "message");
            return -1;
        }

        @n
        public final int e(@l String s, @l String s1) {
            L.p(s, "tag");
            L.p(s1, "message");
            return -1;
        }

        @n
        public final int e(@l String s, @l String s1, @l Throwable throwable0) {
            L.p(s, "tag");
            L.p(s1, "message");
            L.p(throwable0, "throwable");
            return -1;
        }

        public final void enable(boolean z) {
            p.enabled = z;
        }

        @l
        public final String eraseSensitiveData(@l String s) {
            L.p(s, "<this>");
            Pattern pattern0 = Pattern.compile("[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}");
            L.o(pattern0, "compile(\"[\\\\d]{1,3}\\\\.[\\…[\\\\d]{1,3}\\\\.[\\\\d]{1,3}\")");
            return new r(pattern0).m(s, "xxx.xxx.xxx.xxx");
        }

        @n
        public final int i(@l String s, @l String s1) {
            L.p(s, "tag");
            L.p(s1, "message");
            return -1;
        }

        @n
        public final int i(@l String s, @l String s1, @l Throwable throwable0) {
            L.p(s, "tag");
            L.p(s1, "message");
            L.p(throwable0, "throwable");
            return -1;
        }

        @n
        public final int w(@l String s, @l String s1) {
            L.p(s, "tag");
            L.p(s1, "message");
            return -1;
        }

        @n
        public final int w(@l String s, @l String s1, @l Throwable throwable0) {
            L.p(s, "tag");
            L.p(s1, "message");
            L.p(throwable0, "throwable");
            return -1;
        }
    }

    @l
    public static final a Companion;
    private static boolean enabled;

    static {
        p.Companion = new a(null);
    }

    public static final boolean access$getEnabled$cp() [...] // 潜在的解密器

    @n
    public static final int d(@l String s, @l String s1) {
        return p.Companion.d(s, s1);
    }

    @n
    public static final int e(@l String s, @l String s1) {
        return p.Companion.e(s, s1);
    }

    @n
    public static final int e(@l String s, @l String s1, @l Throwable throwable0) {
        return p.Companion.e(s, s1, throwable0);
    }

    @n
    public static final int i(@l String s, @l String s1) {
        return p.Companion.i(s, s1);
    }

    @n
    public static final int i(@l String s, @l String s1, @l Throwable throwable0) {
        return p.Companion.i(s, s1, throwable0);
    }

    @n
    public static final int w(@l String s, @l String s1) {
        return p.Companion.w(s, s1);
    }

    @n
    public static final int w(@l String s, @l String s1, @l Throwable throwable0) {
        return p.Companion.w(s, s1, throwable0);
    }
}

