package com.dcinside.app.album;

import androidx.annotation.StringRes;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public enum m {
    public static final class a {
        public final class com.dcinside.app.album.m.a.a {
            public static final int[] a;

            static {
                int[] arr_v = new int[m.values().length];
                try {
                    arr_v[m.e.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[m.f.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[m.g.ordinal()] = 3;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[m.h.ordinal()] = 4;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                com.dcinside.app.album.m.a.a.a = arr_v;
            }
        }

        private a() {
        }

        public a(w w0) {
        }

        @l
        public final String a(@l m m0) {
            L.p(m0, "type");
            switch(m0) {
                case 1: 
                case 2: {
                    return "date_modified";
                }
                default: {
                    return "datetaken";
                }
            }
        }

        @l
        public final m b(int v) {
            m m0 = m.e;
            if(v != m0.e()) {
                m m1 = m.f;
                if(v != m1.e()) {
                    m1 = m.g;
                    if(v != m1.e()) {
                        m1 = m.h;
                        if(v != m1.e()) {
                            m1 = m.j;
                            if(v != m1.e()) {
                                m1 = m.i;
                                if(v != m1.e()) {
                                    m1 = m.k;
                                    if(v != m1.e()) {
                                        return v == m.l.e() ? m.l : m0;
                                    }
                                }
                            }
                        }
                    }
                }
                return m1;
            }
            return m0;
        }
    }

    MODIFIED_DESC(0, 0x7F150093, "date_modified DESC"),  // string:album_sort_modified_desc "수정일 최신순"
    MODIFIED_ASC(1, 0x7F150092, "date_modified ASC"),  // string:album_sort_modified_asc "수정일 오래된순"
    TAKEN_DESC(2, 0x7F150099, "datetaken DESC"),  // string:album_sort_taken_desc "촬영일 최신순"
    TAKEN_ASC(3, 0x7F150098, "datetaken ASC"),  // string:album_sort_taken_asc "촬영일 오래된순"
    NAME_ASC(4, 0x7F150094, "_display_name ASC"),  // string:album_sort_name_asc "이름 가나다순"
    NAME_DESC(5, 0x7F150095, "_display_name DESC"),  // string:album_sort_name_desc "이름 가나다 역순"
    SIZE_DESC(6, 0x7F150097, "_size DESC"),  // string:album_sort_size_desc "크기 큰순"
    SIZE_ASC(7, 0x7F150096, "_size ASC");  // string:album_sort_size_asc "크기 작은순"

    private final int a;
    private final int b;
    @l
    private final String c;
    @l
    public static final a d;
    private static final m[] m;
    private static final kotlin.enums.a n;

    static {
        m.m = arr_m;
        L.p(arr_m, "entries");
        m.n = new d(arr_m);
        m.d = new a(null);
    }

    private m(int v1, @StringRes int v2, String s1) {
        this.a = v1;
        this.b = v2;
        this.c = s1;
    }

    private static final m[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return m.n;
    }

    @l
    public final String c() {
        return this.c;
    }

    public final int d() {
        return this.b;
    }

    public final int e() {
        return this.a;
    }
}

