package com.dcinside.app.write.menu;

import kotlin.J;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public enum b {
    public static final class a {
        public final class com.dcinside.app.write.menu.b.a.a {
            public static final int[] a;

            static {
                int[] arr_v = new int[b.values().length];
                try {
                    arr_v[b.f.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[b.i.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[b.k.ordinal()] = 3;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[b.l.ordinal()] = 4;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[b.m.ordinal()] = 5;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[b.p.ordinal()] = 6;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[b.n.ordinal()] = 7;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[b.h.ordinal()] = 8;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[b.o.ordinal()] = 9;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[b.j.ordinal()] = 10;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[b.q.ordinal()] = 11;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[b.r.ordinal()] = 12;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[b.s.ordinal()] = 13;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[b.t.ordinal()] = 14;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[b.g.ordinal()] = 15;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                com.dcinside.app.write.menu.b.a.a.a = arr_v;
            }
        }

        private a() {
        }

        public a(w w0) {
        }

        public final boolean a(@l b b0, @l MenuVisible menuVisible0) {
            L.p(b0, "menu");
            L.p(menuVisible0, "menuVisible");
            switch(b0) {
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: {
                    return true;
                }
                case 10: {
                    return menuVisible0.g();
                }
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 15: {
                    return false;
                }
                default: {
                    throw new J();
                }
            }
        }

        @l
        public final b b(int v) {
            b b0 = b.g;
            if(v != b0.f()) {
                b b1 = b.f;
                if(v != b1.f()) {
                    b1 = b.i;
                    if(v != b1.f()) {
                        b1 = b.k;
                        if(v != b1.f()) {
                            b1 = b.l;
                            if(v != b1.f()) {
                                b1 = b.m;
                                if(v != b1.f()) {
                                    b1 = b.o;
                                    if(v != b1.f()) {
                                        b1 = b.p;
                                        if(v != b1.f()) {
                                            b1 = b.q;
                                            if(v != b1.f()) {
                                                b1 = b.r;
                                                if(v != b1.f()) {
                                                    b1 = b.s;
                                                    if(v != b1.f()) {
                                                        b1 = b.h;
                                                        if(v != b1.f()) {
                                                            b1 = b.n;
                                                            if(v != b1.f()) {
                                                                return v == b.j.f() ? b.j : b0;
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
                }
                return b1;
            }
            return b0;
        }
    }

    FISHBUN(0, 0x7F150BB3, 0x7F0800DE, 7),  // string:write_menu_fishbun "사진 앨범"
    ALBUM(1, 0x7F150BB7, 0x7F080138, 7),  // string:write_menu_picture "외부 사진 앱"
    VIDEO(12, 0x7F150BBD, 0x7F080363, 7),  // string:write_menu_youtube "유튜브"
    GIF(2, 0x7F150BB5, 0x7F080330, 7),  // string:write_menu_gif "GIF 만들기"
    MAKE_AI(14, 0x7F1505C9, 0x7F08029B, 7),  // string:make_ai_image_title "AI 이미지 생성"
    DCCON(3, 0x7F150BB2, 0x7F080301, 7),  // string:write_menu_dccon "디시콘"
    YOUTUBE(4, 0x7F150BBD, 0x7F08077D, 6),  // string:write_menu_youtube "유튜브"
    VOICE(5, 0x7F150BBC, 0x7F0804D7, 7),  // string:write_menu_voice "보이스"
    SERIES(13, 0x7F150BBB, 0x7F0802C6, 6),  // string:write_menu_series "시리즈"
    POLL(6, 0x7F150BB8, 0x7F08030C, 6),  // string:write_menu_poll "투표"
    RICH_TEXT(7, 0x7F150BB9, 0x7F0802F2, 6),  // string:write_menu_rich_text "텍스트 편집"
    SECRET(8, 0x7F150BBA, 0x7F08030F, 4),  // string:write_menu_secret "비밀글"
    AUTO_DEL(9, 0x7F150BB1, 0x7F080304, 7),  // string:write_menu_auto_del "자동 삭제"
    FIX_POST(10, 0x7F150BB4, 0x7F080308, 4),  // string:write_menu_fix_post "고정글"
    MORE(11, 0, 0x7F080309, 0);  // drawable:ic_write_more

    private final int a;
    private final int b;
    private final int c;
    private final int d;
    @l
    public static final a e;
    private static final b[] u;
    private static final kotlin.enums.a v;

    static {
        b.u = arr_b;
        L.p(arr_b, "entries");
        b.v = new d(arr_b);
        b.e = new a(null);
    }

    private b(int v1, int v2, int v3, int v4) {
        this.a = v1;
        this.b = v2;
        this.c = v3;
        this.d = v4;
    }

    private static final b[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return b.v;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.b;
    }

    public final int e() {
        return this.d;
    }

    public final int f() {
        return this.a;
    }
}

