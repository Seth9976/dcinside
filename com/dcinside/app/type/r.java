package com.dcinside.app.type;

import androidx.annotation.StringRes;
import java.util.HashMap;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public enum r {
    @s0({"SMAP\nManagerSituation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagerSituation.kt\ncom/dcinside/app/type/ManagerSituation$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,105:1\n381#2,3:106\n384#2,4:112\n1#3:109\n12511#4,2:110\n*S KotlinDebug\n*F\n+ 1 ManagerSituation.kt\ncom/dcinside/app/type/ManagerSituation$Companion\n*L\n73#1:106,3\n73#1:112,4\n74#1:110,2\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final r a(@m String s) {
            r r1;
            HashMap hashMap0 = r.e;
            r r0 = hashMap0.get(s);
            if(r0 == null) {
                r[] arr_r = r.values();
            alab1:
                for(int v = 0; true; ++v) {
                    r1 = null;
                    if(v >= arr_r.length) {
                        break;
                    }
                    r1 = arr_r[v];
                    String[] arr_s = r1.f();
                    for(int v1 = 0; v1 < arr_s.length; ++v1) {
                        if(L.g(arr_s[v1], s)) {
                            break alab1;
                        }
                    }
                }
                r0 = r1 == null ? r.f : r1;
                hashMap0.put(s, r0);
            }
            return r0;
        }
    }

    BASIC(0x7F1503B5, 0, new String[]{0, "", "basic"}),  // string:gallery_info_situation_first "매니저 운영 갤러리입니다."
    ABSENCE(0x7F1503B6, 0x7F1503B4, new String[]{"absence", "res"}),  // string:gallery_info_situation_list_absence "매니저가 부재중입니다."
    RESIGN(0x7F1503B8, 0x7F1503BB, new String[]{"resign", "no"}),  // string:gallery_info_situation_list_resign "매니저 사임 진행 중입니다."
    WAITING(0x7F1503B9, 0x7F1503BC, new String[]{"waiting"}),  // string:gallery_info_situation_list_waiting "매니저 수락 대기 중입니다."
    OUT(0x7F1503B7, 0x7F1503BA, new String[]{"out"});  // string:gallery_info_situation_list_out "매니저가 없습니다."

    private final int a;
    private final int b;
    @l
    private final String[] c;
    @l
    public static final a d;
    @l
    private static final HashMap e;
    private static final r[] k;
    private static final kotlin.enums.a l;

    static {
        r.k = arr_r;
        L.p(arr_r, "entries");
        r.l = new d(arr_r);
        r.d = new a(null);
        r.e = new HashMap();
    }

    private r(@StringRes int v1, @StringRes int v2, String[] arr_s) {
        this.a = v1;
        this.b = v2;
        this.c = arr_s;
    }

    private static final r[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a c() {
        return r.l;
    }

    public final int d() {
        return this.b;
    }

    public final int e() {
        return this.a;
    }

    @l
    public final String[] f() {
        return this.c;
    }
}

