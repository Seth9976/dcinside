package com.dcinside.app.type;

import androidx.annotation.DrawableRes;
import com.dcinside.app.realm.B.b;
import com.dcinside.app.realm.B;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import z3.n;

public enum l {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @y4.l
        @n
        public final l a(@y4.l B b0) {
            L.p(b0, "login");
            String s = b0.a6();
            int v = b0.i6();
            b b$b0 = B.E;
            if(b$b0.S(s)) {
                return b$b0.a0(v) ? l.d : l.c;
            }
            return b$b0.a0(v) ? l.f : l.e;
        }
    }

    public final class com.dcinside.app.type.l.b {
        public static final int[] a;

        static {
            int[] arr_v = new int[l.values().length];
            try {
                arr_v[l.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[l.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            com.dcinside.app.type.l.b.a = arr_v;
        }
    }

    BEST_DEFAULT(0x7F08036C),  // drawable:icon_nick_best0
    BEST_FIXED(0x7F08036D),  // drawable:icon_nick_best1
    DEFAULT(0x7F080366),  // drawable:icon_nick0
    FIXED(0x7F080367);  // drawable:icon_nick1

    private final int a;
    @y4.l
    public static final a b;
    private static final l[] g;
    private static final kotlin.enums.a h;

    static {
        l.g = arr_l;
        L.p(arr_l, "entries");
        l.h = new d(arr_l);
        l.b = new a(null);
    }

    private l(@DrawableRes int v1) {
        this.a = v1;
    }

    private static final l[] a() [...] // Inlined contents

    @y4.l
    public static kotlin.enums.a b() {
        return l.h;
    }

    public final int c() {
        return this.a;
    }

    @y4.l
    @n
    public static final l d(@y4.l B b0) {
        return l.b.a(b0);
    }

    public final boolean e() {
        switch(this) {
            case 1: 
            case 2: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

