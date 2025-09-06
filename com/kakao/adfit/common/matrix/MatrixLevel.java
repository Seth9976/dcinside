package com.kakao.adfit.common.matrix;

import com.kakao.adfit.m.f;
import com.kakao.adfit.m.t;
import java.util.Locale;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

@t
public enum MatrixLevel {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final MatrixLevel a(String s) {
            L.p(s, "level");
            try {
                Locale locale0 = Locale.ENGLISH;
                L.o(locale0, "ENGLISH");
                String s1 = s.toUpperCase(locale0);
                L.o(s1, "this as java.lang.String).toUpperCase(locale)");
                return MatrixLevel.valueOf(s1);
            }
            catch(IllegalArgumentException unused_ex) {
                f.e(("Unknown level: " + s));
                return null;
            }
        }
    }

    LOG,
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    @l
    public static final a Companion;

    static {
        MatrixLevel.Companion = new a(null);
    }

    private static final MatrixLevel[] a() [...] // Inlined contents
}

