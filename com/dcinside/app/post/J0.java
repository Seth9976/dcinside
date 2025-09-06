package com.dcinside.app.post;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.dcinside.app.realm.f0;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import java.util.ArrayList;
import java.util.List;
import kotlin.D;
import kotlin.E;
import kotlin.V;
import kotlin.collections.u;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import y4.l;
import z3.f;

@s0({"SMAP\nPostFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostFilter.kt\ncom/dcinside/app/post/PostFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,154:1\n1557#2:155\n1628#2,3:156\n*S KotlinDebug\n*F\n+ 1 PostFilter.kt\ncom/dcinside/app/post/PostFilter\n*L\n49#1:155\n49#1:156,3\n*E\n"})
public final class j0 {
    public static enum a {
        FILTER_LIKE("PostFilterLike", 3),
        FILTER_REPLY("PostFilterReply", 3),
        FILTER_HIT("PostFilterHit", 30);

        @l
        private final String a;
        private final int b;
        private static final a[] f;
        private static final kotlin.enums.a g;

        static {
            a.f = arr_j0$a;
            L.p(arr_j0$a, "entries");
            a.g = new d(arr_j0$a);
        }

        private a(String s1, int v1) {
            this.a = s1;
            this.b = v1;
        }

        private static final a[] a() [...] // Inlined contents

        public final int b() {
            return this.b;
        }

        @l
        public static kotlin.enums.a c() {
            return a.g;
        }

        @l
        public final String d() {
            return this.a;
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[k0.values().length];
            try {
                arr_v[k0.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[k0.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[k0.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    @l
    @f
    public k0 a;
    @f
    public boolean b;
    @f
    public int c;
    @l
    private final D d;
    @l
    private List e;

    public j0() {
        static final class c extends N implements A3.a {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(0);
            }

            @l
            public final Long invoke() {
                return jl.a.i0();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }

        this.a = k0.c;
        this.d = E.a(c.e);
        this.e = u.H();
    }

    public final boolean a(@l String s) {
        L.p(s, "galleryId");
        return this.a != k0.c || (!this.c(a.c, s) || !this.c(a.d, s) || !this.c(a.e, s));
    }

    @l
    public final SpannableStringBuilder b(@l Context context0, @l String s) {
        L.p(context0, "context");
        L.p(s, "galleryId");
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
        int v = b.a[this.a.ordinal()];
        switch(v) {
            case 1: {
                spannableStringBuilder0.append("전체글");
                break;
            }
            case 2: {
                spannableStringBuilder0.append("읽은글");
                break;
            }
            default: {
                if(v == 3) {
                    spannableStringBuilder0.append("안 읽은글");
                }
            }
        }
        spannableStringBuilder0.append("  ");
        com.dcinside.app.internal.l.a(spannableStringBuilder0, "**", new com.dcinside.app.span.b(context0, 0x7F08019D, null, 0, 0, false, null, 0x7C, null));  // drawable:divider_text
        dl dl0 = dl.a;
        a j0$a0 = a.c;
        boolean z = dl0.d1(j0$a0, s);
        a j0$a1 = a.d;
        boolean z1 = dl0.d1(j0$a1, s);
        a j0$a2 = a.e;
        boolean z2 = dl0.d1(j0$a2, s);
        if(z || z1 || z2) {
            spannableStringBuilder0.append("  ");
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(z) {
            int v1 = dl0.c1(j0$a0, s);
            if(v1 > 0) {
                L.o("추천 수", "getString(...)");
                stringBuilder0.append(context0.getString(0x7F15034D, new Object[]{"추천 수", v1}));  // string:filter_current "%1$s %2$d"
            }
        }
        if(z1) {
            int v2 = dl0.c1(j0$a1, s);
            if(v2 > 0) {
                if(stringBuilder0.length() > 0) {
                    stringBuilder0.append(", ");
                }
                L.o("댓글 수", "getString(...)");
                stringBuilder0.append(context0.getString(0x7F15034D, new Object[]{"댓글 수", v2}));  // string:filter_current "%1$s %2$d"
            }
        }
        if(z2) {
            int v3 = dl0.c1(j0$a2, s);
            if(v3 > 0) {
                if(stringBuilder0.length() > 0) {
                    stringBuilder0.append(", ");
                }
                L.o("조회 수", "getString(...)");
                stringBuilder0.append(context0.getString(0x7F15034D, new Object[]{"조회 수", v3}));  // string:filter_current "%1$s %2$d"
            }
        }
        if(stringBuilder0.length() > 0) {
            stringBuilder0.append('↑');
        }
        SpannableStringBuilder spannableStringBuilder1 = spannableStringBuilder0.append(stringBuilder0);
        L.o(spannableStringBuilder1, "append(...)");
        return spannableStringBuilder1;
    }

    private final boolean c(a j0$a0, String s) {
        return !dl.a.d1(j0$a0, s) || dl.a.c1(j0$a0, s) < 1;
    }

    public final long d() {
        return ((Number)this.d.getValue()).longValue();
    }

    @l
    public final String e(int v) {
        int v1 = this.e.size();
        V v2 = r0.a(((int)((v - 1) * 30)), Math.min(v * 30, v1));
        int v3 = ((Number)v2.a()).intValue();
        return v3 < v1 ? u.m3(this.e.subList(v3, ((Number)v2.b()).intValue()), ",", null, null, 0, null, null, 62, null) : "";
    }

    public final void f(@l String s) {
        List list1;
        L.p(s, "galleryId");
        if(this.b && this.a == k0.d) {
            List list0 = f0.t.b(s);
            if(list0 == null) {
                list1 = u.H();
            }
            else {
                list1 = new ArrayList(u.b0(list0, 10));
                for(Object object0: list0) {
                    list1.add(((f0)object0).d6());
                }
            }
            this.e = list1;
        }
    }
}

