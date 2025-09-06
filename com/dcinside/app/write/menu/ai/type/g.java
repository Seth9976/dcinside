package com.dcinside.app.write.menu.ai.type;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;

public enum g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @m
        public final g a(@m String s) {
            String s1 = s == null ? null : v.G5(s).toString();
            g g0 = g.e;
            if(!L.g(s1, "None")) {
                g0 = g.f;
                if(!L.g(s1, "Anime")) {
                    g0 = g.g;
                    if(!L.g(s1, "Cyberpunk")) {
                        g0 = g.h;
                        if(!L.g(s1, "Ink&Watercolor")) {
                            g0 = g.i;
                            if(!L.g(s1, "Oil(Impressionist)")) {
                                g0 = g.j;
                                if(!L.g(s1, "Oil(Naturalist)")) {
                                    return L.g(s1, "Pen&Pencil") ? g.k : null;
                                }
                            }
                        }
                    }
                }
            }
            return g0;
        }
    }

    DEFAULT("None", 0x7F1505C1, 0),  // string:make_ai_image_style_default "None (기본)"
    ANIME("Anime", 0x7F1505BF, 0x7F0800D8),  // string:make_ai_image_style_anime "Anime"
    CYBERPUNK("Cyberpunk", 0x7F1505C0, 0x7F0800D9),  // string:make_ai_image_style_cyberpunk "Cyberpunk"
    INK("Ink&Watercolor", 0x7F1505C2, 0x7F0800DA),  // string:make_ai_image_style_ink "Ink&Watercolor"
    OIL_I("Oil(Impressionist)", 0x7F1505C4, 0x7F0800DB),  // string:make_ai_image_style_oil_i "Oil (Impressionist)"
    OIL_N("Oil(Naturalist)", 0x7F1505C5, 0x7F0800DC),  // string:make_ai_image_style_oil_n "Oil (Naturalist)"
    PEN("Pen&Pencil", 0x7F1505C6, 0x7F0800DD);  // string:make_ai_image_style_pen "Pen&Pencil"

    @l
    private final String a;
    private final int b;
    private final int c;
    @l
    public static final a d;
    private static final g[] l;
    private static final kotlin.enums.a m;

    static {
        g.l = arr_g;
        L.p(arr_g, "entries");
        g.m = new d(arr_g);
        g.d = new a(null);
    }

    private g(String s1, int v1, int v2) {
        this.a = s1;
        this.b = v1;
        this.c = v2;
    }

    private static final g[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return g.m;
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

