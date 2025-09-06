package com.dcinside.app.type;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import kotlin.J;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public enum g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final g[] a() {
            return g.c;
        }

        @l
        public final g[] b() {
            return g.b;
        }

        @l
        public final g c(int v) {
            try {
                return g.values()[v];
            }
            catch(Exception unused_ex) {
                return g.d;
            }
        }

        public final void d(@l g[] arr_g) {
            L.p(arr_g, "<set-?>");
            g.c = arr_g;
        }

        public final void e(@l g[] arr_g) {
            L.p(arr_g, "<set-?>");
            g.b = arr_g;
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[g.values().length];
            try {
                arr_v[g.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.e.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.f.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.g.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.h.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.i.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.j.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.k.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.l.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.m.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.n.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.o.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.p.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.q.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.r.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.s.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.t.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.u.ordinal()] = 18;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.v.ordinal()] = 19;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.w.ordinal()] = 20;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.x.ordinal()] = 21;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.y.ordinal()] = 22;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.z.ordinal()] = 23;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.A.ordinal()] = 24;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.B.ordinal()] = 25;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.C.ordinal()] = 26;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.D.ordinal()] = 27;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    THEME0,
    THEME1,
    THEME2,
    THEME3,
    THEME4,
    THEME5,
    THEME6,
    THEME7,
    THEME8,
    THEME9,
    THEME10,
    THEME11,
    THEME12,
    THEME13,
    THEME14,
    THEME15,
    THEME16,
    THEME17,
    THEME18,
    THEME19,
    THEME20,
    THEME21,
    THEME22,
    THEME23,
    THEME24,
    THEME25,
    THEME26;

    private static final g[] E;
    private static final kotlin.enums.a F;
    @l
    public static final a a;
    @l
    private static g[] b;
    @l
    private static g[] c;

    static {
        g.E = arr_g;
        L.p(arr_g, "entries");
        g.F = new d(arr_g);
        g.a = new a(null);
        g.b = new g[]{g.d, g.C, g.e, g.w, g.f, g.g, g.y, g.z, g.h, g.l, g.A, g.v, g.p, g.m, g.u, g.n, g.B, g.q, g.k, g.r, g.o, g.s, g.i};
        g.c = new g[]{g.j, g.D, g.t, g.x};
    }

    private static final g[] a() [...] // Inlined contents

    @DrawableRes
    public final int f() {
        switch(b.a[this.ordinal()]) {
            case 1: {
                return 0x7F0803C7;  // drawable:layer_theme0
            }
            case 2: {
                return 0x7F0803C8;  // drawable:layer_theme1
            }
            case 3: {
                return 0x7F0803D3;  // drawable:layer_theme2
            }
            case 4: {
                return 0x7F0803DB;  // drawable:layer_theme3
            }
            case 5: {
                return 0x7F0803DC;  // drawable:layer_theme4
            }
            case 6: {
                return 0x7F0803DD;  // drawable:layer_theme5
            }
            case 7: {
                return 0x7F0803DE;  // drawable:layer_theme6
            }
            case 8: {
                return 0x7F0803DF;  // drawable:layer_theme7
            }
            case 9: {
                return 0x7F0803E0;  // drawable:layer_theme8
            }
            case 10: {
                return 0x7F0803E1;  // drawable:layer_theme9
            }
            case 11: {
                return 0x7F0803C9;  // drawable:layer_theme10
            }
            case 12: {
                return 0x7F0803CA;  // drawable:layer_theme11
            }
            case 13: {
                return 0x7F0803CB;  // drawable:layer_theme12
            }
            case 14: {
                return 0x7F0803CC;  // drawable:layer_theme13
            }
            case 15: {
                return 0x7F0803CD;  // drawable:layer_theme14
            }
            case 16: {
                return 0x7F0803CE;  // drawable:layer_theme15
            }
            case 17: {
                return 0x7F0803CF;  // drawable:layer_theme16
            }
            case 18: {
                return 0x7F0803D0;  // drawable:layer_theme17
            }
            case 19: {
                return 0x7F0803D1;  // drawable:layer_theme18
            }
            case 20: {
                return 0x7F0803D2;  // drawable:layer_theme19
            }
            case 21: {
                return 0x7F0803D4;  // drawable:layer_theme20
            }
            case 22: {
                return 0x7F0803D5;  // drawable:layer_theme21
            }
            case 23: {
                return 0x7F0803D6;  // drawable:layer_theme22
            }
            case 24: {
                return 0x7F0803D7;  // drawable:layer_theme23
            }
            case 25: {
                return 0x7F0803D8;  // drawable:layer_theme24
            }
            case 26: {
                return 0x7F0803D9;  // drawable:layer_theme25
            }
            case 27: {
                return 0x7F0803DA;  // drawable:layer_theme26
            }
            default: {
                throw new J();
            }
        }
    }

    @StringRes
    public final int g() {
        switch(b.a[this.ordinal()]) {
            case 1: {
                return 0x7F150A1D;  // string:theme_name0 "기본색"
            }
            case 2: {
                return 0x7F150A1E;  // string:theme_name1 "빨강색"
            }
            case 3: {
                return 0x7F150A29;  // string:theme_name2 "노랑색"
            }
            case 4: {
                return 0x7F150A31;  // string:theme_name3 "초록색"
            }
            case 5: {
                return 0x7F150A32;  // string:theme_name4 "보라색"
            }
            case 6: {
                return 0x7F150A33;  // string:theme_name5 "흑회색"
            }
            case 7: {
                return 0x7F150A34;  // string:theme_name6 "검은 배경"
            }
            case 8: {
                return 0x7F150A35;  // string:theme_name7 "하늘"
            }
            case 9: {
                return 0x7F150A36;  // string:theme_name8 "벚꽃"
            }
            case 10: {
                return 0x7F150A37;  // string:theme_name9 "호박"
            }
            case 11: {
                return 0x7F150A1F;  // string:theme_name10 "민트"
            }
            case 12: {
                return 0x7F150A20;  // string:theme_name11 "라일락"
            }
            case 13: {
                return 0x7F150A21;  // string:theme_name12 "살구"
            }
            case 14: {
                return 0x7F150A22;  // string:theme_name13 "에메랄드"
            }
            case 15: {
                return 0x7F150A23;  // string:theme_name14 "바다"
            }
            case 16: {
                return 0x7F150A24;  // string:theme_name15 "바이올렛"
            }
            case 17: {
                return 0x7F150A25;  // string:theme_name16 "남색 배경"
            }
            case 18: {
                return 0x7F150A26;  // string:theme_name17 "라임"
            }
            case 19: {
                return 0x7F150A27;  // string:theme_name18 "핫핑크"
            }
            case 20: {
                return 0x7F150A28;  // string:theme_name19 "주황색"
            }
            case 21: {
                return 0x7F150A2A;  // string:theme_name20 "회색 배경"
            }
            case 22: {
                return 0x7F150A2B;  // string:theme_name21 "파랑색"
            }
            case 23: {
                return 0x7F150A2C;  // string:theme_name22 "남색"
            }
            case 24: {
                return 0x7F150A2D;  // string:theme_name23 "핑크"
            }
            case 25: {
                return 0x7F150A2E;  // string:theme_name24 "잔디"
            }
            case 26: {
                return 0x7F150A2F;  // string:theme_name25 "흰색"
            }
            case 27: {
                return 0x7F150A30;  // string:theme_name26 "진검정 배경"
            }
            default: {
                throw new J();
            }
        }
    }

    @StyleRes
    public final int h() {
        switch(b.a[this.ordinal()]) {
            case 2: {
                return 0x7F160190;
            }
            case 3: {
                return 0x7F16019B;
            }
            case 4: {
                return 0x7F1601A1;
            }
            case 5: {
                return 0x7F1601A2;
            }
            case 6: {
                return 0x7F1601A3;
            }
            case 8: {
                return 0x7F1601A5;
            }
            case 9: {
                return 0x7F1601A6;
            }
            case 10: {
                return 0x7F1601A7;
            }
            case 11: {
                return 0x7F160191;
            }
            case 12: {
                return 0x7F160192;
            }
            case 13: {
                return 0x7F160193;
            }
            case 14: {
                return 0x7F160194;
            }
            case 15: {
                return 0x7F160195;
            }
            case 16: {
                return 0x7F160196;
            }
            case 17: {
                return 0x7F160197;
            }
            case 18: {
                return 0x7F160198;
            }
            case 19: {
                return 0x7F160199;
            }
            case 20: {
                return 0x7F16019A;
            }
            case 21: {
                return 0x7F16019C;
            }
            case 22: {
                return 0x7F16019D;
            }
            case 23: {
                return 0x7F16019E;
            }
            case 24: {
                return 0x7F16019F;
            }
            case 25: {
                return 0x7F1601A0;
            }
            case 1: 
            case 26: {
                return 0x7F16018F;
            }
            case 7: 
            case 27: {
                return 0x7F1601A4;
            }
            default: {
                throw new J();
            }
        }
    }

    @l
    public static kotlin.enums.a i() {
        return g.F;
    }

    @StyleRes
    public final int j() {
        switch(b.a[this.ordinal()]) {
            case 1: {
                return 0x7F16001A;
            }
            case 2: {
                return 0x7F16001C;
            }
            case 3: {
                return 0x7F160032;
            }
            case 4: {
                return 0x7F160042;
            }
            case 5: {
                return 0x7F160044;
            }
            case 6: {
                return 0x7F160046;
            }
            case 7: {
                return 0x7F160048;
            }
            case 8: {
                return 0x7F16004A;
            }
            case 9: {
                return 0x7F16004C;
            }
            case 10: {
                return 0x7F16004E;
            }
            case 11: {
                return 0x7F16001E;
            }
            case 12: {
                return 0x7F160020;
            }
            case 13: {
                return 0x7F160022;
            }
            case 14: {
                return 0x7F160024;
            }
            case 15: {
                return 0x7F160026;
            }
            case 16: {
                return 0x7F160028;
            }
            case 17: {
                return 0x7F16002A;
            }
            case 18: {
                return 0x7F16002C;
            }
            case 19: {
                return 0x7F16002E;
            }
            case 20: {
                return 0x7F160030;
            }
            case 21: {
                return 0x7F160034;
            }
            case 22: {
                return 0x7F160036;
            }
            case 23: {
                return 0x7F160038;
            }
            case 24: {
                return 0x7F16003A;
            }
            case 25: {
                return 0x7F16003C;
            }
            case 26: {
                return 0x7F16003E;
            }
            case 27: {
                return 0x7F160040;
            }
            default: {
                throw new J();
            }
        }
    }

    @StyleRes
    public final int k() {
        switch(b.a[this.ordinal()]) {
            case 1: {
                return 0x7F16001B;
            }
            case 2: {
                return 0x7F16001D;
            }
            case 3: {
                return 0x7F160033;
            }
            case 4: {
                return 0x7F160043;
            }
            case 5: {
                return 0x7F160045;
            }
            case 6: {
                return 0x7F160047;
            }
            case 7: {
                return 0x7F160049;
            }
            case 8: {
                return 0x7F16004B;
            }
            case 9: {
                return 0x7F16004D;
            }
            case 10: {
                return 0x7F16004F;
            }
            case 11: {
                return 0x7F16001F;
            }
            case 12: {
                return 0x7F160021;
            }
            case 13: {
                return 0x7F160023;
            }
            case 14: {
                return 0x7F160025;
            }
            case 15: {
                return 0x7F160027;
            }
            case 16: {
                return 0x7F160029;
            }
            case 17: {
                return 0x7F16002B;
            }
            case 18: {
                return 0x7F16002D;
            }
            case 19: {
                return 0x7F16002F;
            }
            case 20: {
                return 0x7F160031;
            }
            case 21: {
                return 0x7F160035;
            }
            case 22: {
                return 0x7F160037;
            }
            case 23: {
                return 0x7F160039;
            }
            case 24: {
                return 0x7F16003B;
            }
            case 25: {
                return 0x7F16003D;
            }
            case 26: {
                return 0x7F16003F;
            }
            case 27: {
                return 0x7F160041;
            }
            default: {
                throw new J();
            }
        }
    }

    public final boolean l() {
        return b.a[this.ordinal()] == 26;
    }

    public final boolean m() {
        switch(b.a[this.ordinal()]) {
            case 7: 
            case 17: 
            case 21: 
            case 27: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public final boolean n() {
        switch(b.a[this.ordinal()]) {
            case 26: 
            case 27: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public final boolean p() {
        switch(this) {
            case 8: 
            case 9: 
            case 10: 
            case 12: 
            case 13: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

