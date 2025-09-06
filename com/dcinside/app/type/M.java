package com.dcinside.app.type;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.dcinside.app.model.Q;
import com.dcinside.app.response.GalleryInfo;
import kotlin.J;
import kotlin.V;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.text.v;
import y4.l;

public enum m {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final m a(int v) {
            m m0 = m.g;
            if(v != m0.c()) {
                m m1 = m.h;
                if(v != m1.c()) {
                    m1 = m.i;
                    if(v != m1.c()) {
                        return v == m.j.c() ? m.j : m0;
                    }
                }
                return m1;
            }
            return m0;
        }

        @l
        public final m b(@y4.m String s) {
            if(this.c(s)) {
                return m.i;
            }
            return this.d(s) ? m.j : m.g;
        }

        public final boolean c(@y4.m String s) {
            return s == null ? false : v.v2(s, "mi$", false, 2, null);
        }

        public final boolean d(@y4.m String s) {
            return s == null ? false : v.v2(s, "pr$", false, 2, null);
        }

        @l
        public final String e(@l String s) {
            L.p(s, "galleryId");
            return this.c(s) ? s : "mi$" + s;
        }

        @l
        public final String f(@l String s) {
            L.p(s, "galleryId");
            return this.d(s) ? s : "pr$" + s;
        }

        @y4.m
        public final String g(@y4.m String s) {
            return s == null ? null : v.e4(s, "mi$");
        }

        @y4.m
        public final String h(@y4.m String s) {
            return s == null ? null : v.e4(s, "pr$");
        }

        @y4.m
        public final String i(@y4.m String s) {
            if(this.c(s)) {
                return this.g(s);
            }
            return this.d(s) ? this.h(s) : s;
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[m.values().length];
            try {
                arr_v[m.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.j.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    MAJOR("", 0, "G"),
    MINOR("M", 1, "M"),
    MINI("MI", 2, "N"),
    PERSON("PR", 3, "P");

    @l
    private final String a;
    private final int b;
    @l
    private final String c;
    @l
    public static final a d = null;
    @l
    public static final String e = "mi$";
    @l
    public static final String f = "pr$";
    private static final m[] k;
    private static final kotlin.enums.a l;

    static {
        m.k = arr_m;
        L.p(arr_m, "entries");
        m.l = new d(arr_m);
        m.d = new a(null);
    }

    private m(String s1, int v1, String s2) {
        this.a = s1;
        this.b = v1;
        this.c = s2;
    }

    private static final m[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return m.l;
    }

    public final int c() {
        return this.b;
    }

    @DrawableRes
    public final int d(@l Q q0) {
        L.p(q0, "postInfo");
        return this.f(q0.T0());
    }

    @DrawableRes
    public final int e(@l GalleryInfo galleryInfo0) {
        L.p(galleryInfo0, "galleryInfo");
        return this.f(galleryInfo0.B());
    }

    @DrawableRes
    private final int f(String s) {
        switch(this) {
            case 1: {
                return s == null ? 0 : 0x7F08026F;  // drawable:ic_gallery_major
            }
            case 2: {
                return 0x7F080271;  // drawable:ic_gallery_minor
            }
            case 3: {
                return 0x7F080270;  // drawable:ic_gallery_mini
            }
            case 4: {
                return 0x7F080272;  // drawable:ic_gallery_person
            }
            default: {
                throw new J();
            }
        }
    }

    @StringRes
    @l
    public final V g(@l GalleryInfo galleryInfo0) {
        L.p(galleryInfo0, "galleryInfo");
        return this != m.g || galleryInfo0.B() == null ? r0.a(0x7F15002F, 0x7F0802A5) : r0.a(0x7F1503A6, 0x7F08026D);  // string:action_gallery_info "갤러리 정보(즐찾)"
    }

    @l
    public final String h() {
        return this.c;
    }

    @l
    public final String i() {
        return this.a;
    }

    public final boolean j() [...] // 潜在的解密器

    public final boolean k() [...] // 潜在的解密器

    public final boolean l() [...] // 潜在的解密器

    public final boolean m() [...] // 潜在的解密器
}

