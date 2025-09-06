package g0;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public enum c {
    public static final class a {
        public final class g0.c.a.a {
            public static final int[] a;

            static {
                int[] arr_v = new int[c.values().length];
                try {
                    arr_v[c.h.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[c.i.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[c.j.ordinal()] = 3;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[c.k.ordinal()] = 4;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[c.e.ordinal()] = 5;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[c.g.ordinal()] = 6;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[c.f.ordinal()] = 7;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                g0.c.a.a.a = arr_v;
            }
        }

        private a() {
        }

        public a(w w0) {
        }

        @l
        public final c a(@m String s) {
            c c0 = c.e;
            if(!L.g(s, "I")) {
                c0 = c.f;
                if(!L.g(s, "S")) {
                    c0 = c.g;
                    if(!L.g(s, "A")) {
                        c0 = c.h;
                        if(!L.g(s, "R")) {
                            c0 = c.i;
                            if(!L.g(s, "K")) {
                                c0 = c.j;
                                if(!L.g(s, "N")) {
                                    return L.g(s, "U") ? c.k : c.l;
                                }
                            }
                        }
                    }
                }
            }
            return c0;
        }

        public final boolean b(@l c c0) {
            L.p(c0, "type");
            switch(c0) {
                case 5: 
                case 6: 
                case 7: {
                    return false;
                }
                default: {
                    return true;
                }
            }
        }
    }

    MY_POST("I", 0x7F1506D1, 0),  // string:my_active_post_title "내 활동"
    MY_POST_LIKE("S", 0x7F1506CF, 0),  // string:my_active_post_like "추천 수"
    ARTICLE("A", 0x7F150B11, 1),  // string:type_new_post_article "관심글"
    RECOMMEND("R", 0x7F150B13, 1),  // string:type_new_post_recommend "개념글"
    KEYWORD("K", 0x7F150B12, 1),  // string:type_new_post_keyword "키워드"
    NOTICE("N", 0x7F150B10, 1),  // string:type_new_notice "공지"
    USER("U", 0x7F150B15, 1),  // string:type_new_user "이용자"
    UNKNOWN("", 0x7F150B14, 1);  // string:type_new_unknown "알림"

    @l
    private final String a;
    private final int b;
    private final int c;
    @l
    public static final a d;
    private static final c[] m;
    private static final kotlin.enums.a n;

    static {
        c.m = arr_c;
        L.p(arr_c, "entries");
        c.n = new d(arr_c);
        c.d = new a(null);
    }

    private c(String s1, int v1, int v2) {
        this.a = s1;
        this.b = v1;
        this.c = v2;
    }

    private static final c[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return c.n;
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

