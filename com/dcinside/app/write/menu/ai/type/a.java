package com.dcinside.app.write.menu.ai.type;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;

public enum a {
    public static final class com.dcinside.app.write.menu.ai.type.a.a {
        public final class com.dcinside.app.write.menu.ai.type.a.a.a {
            public static final int[] a;

            static {
                int[] arr_v = new int[a.values().length];
                try {
                    arr_v[a.i.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[a.j.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[a.k.ordinal()] = 3;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[a.l.ordinal()] = 4;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[a.m.ordinal()] = 5;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[a.n.ordinal()] = 6;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                com.dcinside.app.write.menu.ai.type.a.a.a.a = arr_v;
            }
        }

        private com.dcinside.app.write.menu.ai.type.a.a() {
        }

        public com.dcinside.app.write.menu.ai.type.a.a(w w0) {
        }

        @m
        public final a a(@m String s) {
            String s1 = s == null ? null : v.G5(s).toString();
            a a0 = a.e;
            if(!L.g(s1, "ani1")) {
                a0 = a.f;
                if(!L.g(s1, "ani2")) {
                    a0 = a.g;
                    if(!L.g(s1, "ani3")) {
                        a0 = a.h;
                        if(!L.g(s1, "ani4")) {
                            a0 = a.i;
                            if(!L.g(s1, "real1")) {
                                a0 = a.j;
                                if(!L.g(s1, "real2")) {
                                    a0 = a.k;
                                    if(!L.g(s1, "real3")) {
                                        a0 = a.l;
                                        if(!L.g(s1, "real4")) {
                                            a0 = a.m;
                                            if(!L.g(s1, "real5")) {
                                                a0 = a.n;
                                                if(!L.g(s1, "real6")) {
                                                    a0 = a.o;
                                                    if(!L.g(s1, "Toon3d")) {
                                                        return L.g(s1, "figure") ? a.p : null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return a0;
        }

        public final boolean b(@l a a0) {
            L.p(a0, "modelType");
            switch(a0) {
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
    }

    ANI1("ani1", 0x7F1505EA, 0x7F080393),  // string:make_ai_model_ani1 "애니1"
    ANI2("ani2", 0x7F1505EB, 0x7F080394),  // string:make_ai_model_ani2 "애니2"
    ANI3("ani3", 0x7F1505EC, 0x7F080395),  // string:make_ai_model_ani3 "애니3"
    ANI4("ani4", 0x7F1505ED, 0x7F080396),  // string:make_ai_model_ani4 "애니4"
    REAL1("real1", 0x7F1505F2, 0x7F080399),  // string:make_ai_model_real1 "실사1(동양)"
    REAL2("real2", 0x7F1505F3, 0x7F08039A),  // string:make_ai_model_real2 "실사2(동양)"
    REAL3("real3", 0x7F1505F4, 0x7F08039B),  // string:make_ai_model_real3 "실사3(서양)"
    REAL4("real4", 0x7F1505F5, 0x7F08039C),  // string:make_ai_model_real4 "실사4(서양)"
    HALF_REAL1("real5", 0x7F1505F0, 0x7F08039D),  // string:make_ai_model_half_real1 "반실사1"
    HALF_REAL2("real6", 0x7F1505F1, 0x7F08039E),  // string:make_ai_model_half_real2 "반실사2"
    CARTOON("Toon3d", 0x7F1505EE, 0x7F080397),  // string:make_ai_model_cartoon "3D 카툰"
    FiGURE("figure", 0x7F1505EF, 0x7F080398);  // string:make_ai_model_figure "피규어"

    @l
    private final String a;
    private final int b;
    private final int c;
    @l
    public static final com.dcinside.app.write.menu.ai.type.a.a d;
    private static final a[] q;
    private static final kotlin.enums.a r;

    static {
        a.q = arr_a;
        L.p(arr_a, "entries");
        a.r = new d(arr_a);
        a.d = new com.dcinside.app.write.menu.ai.type.a.a(null);
    }

    private a(String s1, @StringRes int v1, @DrawableRes int v2) {
        this.a = s1;
        this.b = v1;
        this.c = v2;
    }

    private static final a[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return a.r;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.b;
    }

    @l
    public final String e() {
        return this.a;
    }
}

