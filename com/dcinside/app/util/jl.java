package com.dcinside.app.util;

import A3.o;
import Q.e;
import com.dcinside.app.model.Z;
import com.dcinside.app.model.a0;
import com.dcinside.app.model.b0;
import com.dcinside.app.model.c0;
import com.dcinside.app.model.d;
import com.dcinside.app.model.i0;
import com.dcinside.app.model.m0;
import com.dcinside.app.model.n;
import com.dcinside.app.type.m;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.p;
import com.google.firebase.remoteconfig.v.b;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.V;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.text.v;
import y4.l;

@s0({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/dcinside/app/util/RemoteConfig\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,813:1\n72#2,2:814\n72#2,2:826\n72#2,2:838\n72#2,2:850\n72#2,2:862\n72#2,2:874\n72#2,2:886\n72#2,2:898\n72#2,2:910\n72#2,2:982\n72#2,2:994\n72#2,2:1006\n177#3,9:816\n177#3,9:828\n177#3,9:840\n177#3,9:852\n177#3,9:864\n177#3,9:876\n177#3,9:888\n177#3,9:900\n177#3,6:912\n183#3,3:932\n177#3,6:936\n183#3,3:956\n177#3,9:973\n177#3,9:984\n177#3,9:996\n177#3,9:1008\n1#4:825\n1#4:837\n1#4:849\n1#4:861\n1#4:873\n1#4:885\n1#4:897\n1#4:909\n1#4:928\n1#4:929\n1#4:935\n1#4:969\n1#4:993\n1#4:1005\n1#4:1017\n1611#5,9:918\n1863#5:927\n1864#5:930\n1620#5:931\n1971#5,14:942\n1611#5,9:959\n1863#5:968\n1864#5:970\n1620#5:971\n1053#5:972\n*S KotlinDebug\n*F\n+ 1 RemoteConfig.kt\ncom/dcinside/app/util/RemoteConfig\n*L\n509#1:814,2\n519#1:826,2\n529#1:838,2\n541#1:850,2\n551#1:862,2\n561#1:874,2\n571#1:886,2\n599#1:898,2\n684#1:910,2\n757#1:982,2\n763#1:994,2\n769#1:1006,2\n509#1:816,9\n519#1:828,9\n530#1:840,9\n541#1:852,9\n551#1:864,9\n561#1:876,9\n571#1:888,9\n600#1:900,9\n685#1:912,6\n685#1:932,3\n709#1:936,6\n709#1:956,3\n747#1:973,9\n758#1:984,9\n764#1:996,9\n770#1:1008,9\n509#1:825\n519#1:837\n529#1:849\n541#1:861\n551#1:873\n561#1:885\n571#1:897\n599#1:909\n687#1:929\n684#1:935\n719#1:969\n757#1:993\n763#1:1005\n769#1:1017\n687#1:918,9\n687#1:927\n687#1:930\n687#1:931\n716#1:942,14\n719#1:959,9\n719#1:968\n719#1:970\n719#1:971\n742#1:972\n*E\n"})
public final class jl {
    public final class a {
        public static final int[] a;
        public static final int[] b;

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
            a.a = arr_v;
            int[] arr_v1 = new int[com.dcinside.app.model.m.a.values().length];
            try {
                arr_v1[com.dcinside.app.model.m.a.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.b = arr_v1;
        }
    }

    @l
    public static final jl a;
    @l
    private static final ConcurrentHashMap b;
    @l
    private static final ConcurrentHashMap c;
    @l
    private static final ConcurrentHashMap d;
    @l
    private static final ConcurrentHashMap e;
    @l
    private static final ConcurrentHashMap f;
    @l
    private static final ConcurrentHashMap g;
    @l
    private static final ConcurrentHashMap h;
    @l
    private static final ConcurrentHashMap i;
    @l
    private static final HashMap j;

    static {
        jl.a = new jl();
        jl.b = new ConcurrentHashMap();
        jl.c = new ConcurrentHashMap();
        jl.d = new ConcurrentHashMap();
        jl.e = new ConcurrentHashMap();
        jl.f = new ConcurrentHashMap();
        jl.g = new ConcurrentHashMap();
        jl.h = new ConcurrentHashMap();
        jl.i = new ConcurrentHashMap();
        HashMap hashMap0 = new HashMap();
        hashMap0.put("dc", e.b);
        hashMap0.put("admob", e.c);
        hashMap0.put("admob_native", e.d);
        hashMap0.put("igaw_native", e.e);
        hashMap0.put("adfit", e.g);
        hashMap0.put("adfit_native", e.f);
        hashMap0.put("admob_full", e.h);
        hashMap0.put("cauly_full", e.i);
        hashMap0.put("cauly_floating", e.j);
        hashMap0.put("cauly_banner", e.k);
        hashMap0.put("search_keyword", e.l);
        hashMap0.put("mezzo2", e.m);
        hashMap0.put("igaw_banner", e.n);
        hashMap0.put("igaw_banner_large", e.o);
        hashMap0.put("adpie", e.p);
        hashMap0.put("adpie_large", e.q);
        hashMap0.put("naver", e.r);
        jl.j = hashMap0;
    }

    @y4.m
    public final String A() {
        return this.K0("ad_search_text_active");
    }

    @l
    public final List A0() {
        List list1;
        String s = this.K0("post_read_bottom_message");
        ConcurrentHashMap concurrentHashMap0 = jl.g;
        List list0 = concurrentHashMap0.get("post_read_bottom_message");
        if(list0 == null) {
            try {
                L.o(uk.a, "GSON");
                list1 = null;
                list1 = c0.a.a.b(uk.a, s, d.class);
            }
            catch(Exception unused_ex) {
            }
            if(list1 == null) {
                list1 = new ArrayList();
            }
            Object object0 = concurrentHashMap0.putIfAbsent("post_read_bottom_message", list1);
            list0 = object0 == null ? list1 : object0;
        }
        L.o(list0, "getOrPut(...)");
        return list0;
    }

    @l
    public final List B() {
        List list1;
        String s = this.K0("warning_adult_config");
        ConcurrentHashMap concurrentHashMap0 = jl.i;
        List list0 = concurrentHashMap0.get("warning_adult_config");
        if(list0 == null) {
            try {
                L.o(uk.a, "GSON");
                list1 = null;
                list1 = c0.a.a.b(uk.a, s, com.dcinside.app.model.e.class);
            }
            catch(Exception unused_ex) {
            }
            if(list1 == null) {
                list1 = new ArrayList();
            }
            Object object0 = concurrentHashMap0.putIfAbsent("warning_adult_config", list1);
            list0 = object0 == null ? list1 : object0;
        }
        L.o(list0, "getOrPut(...)");
        return list0;
    }

    @l
    public final V B0() {
        return this.f0();
    }

    public final int C() {
        return (int)this.l0("ai_history_save_max_count");
    }

    private final String C0() [...] // 潜在的解密器

    public final boolean D() {
        return this.T("write_ai_image_grant_guest");
    }

    public final int D0() {
        return (int)this.l0("reply_text_max_length");
    }

    public final long E() {
        return this.l0("ai_resample_max_bytes");
    }

    public final boolean E0() {
        return this.T("report_crash_on_bus");
    }

    public final int F() {
        return (int)this.l0("ai_user_save_max_count");
    }

    public final boolean F0() {
        return this.T("report_crash_on_list");
    }

    public final long G() {
        return this.l0("api_timeout_sec_basic");
    }

    public final boolean G0() {
        return this.T("report_crash_on_read");
    }

    public final long H() {
        return this.l0("api_timeout_sec_connect");
    }

    public final boolean H0() {
        return this.T("report_crash_on_web");
    }

    public final long I() {
        return this.l0("api_timeout_sec_read");
    }

    @l
    public final com.dcinside.app.read.e I0() {
        com.dcinside.app.read.e e2;
        com.dcinside.app.read.e e1;
        String s = this.K0("sensitive_words");
        ConcurrentHashMap concurrentHashMap0 = jl.f;
        com.dcinside.app.read.e e0 = concurrentHashMap0.get("sensitive_words");
        if(e0 == null) {
            try {
                L.o(uk.a, "GSON");
                e1 = null;
                e1 = (com.dcinside.app.read.e)c0.a.a.a(uk.a, s, com.dcinside.app.read.e.class);
            }
            catch(Exception unused_ex) {
            }
            if(e1 == null) {
                e2 = new com.dcinside.app.read.e(u.H(), u.H());
            }
            else {
                List list0 = u.Y5(e1.f());
                list0.addAll(e1.e());
                e2 = new com.dcinside.app.read.e(e1.e(), list0);
            }
            Object object0 = concurrentHashMap0.putIfAbsent("sensitive_words", e2);
            e0 = object0 == null ? e2 : object0;
        }
        L.o(e0, "getOrPut(...)");
        return e0;
    }

    public final long J() {
        return this.l0("api_timeout_sec_write");
    }

    @y4.m
    public final String J0() {
        return this.K0("specific_search_word");
    }

    public final long K() {
        return this.l0("api_video_upload_timeout_sec_connect");
    }

    private final String K0(String s) {
        ConcurrentHashMap concurrentHashMap0 = jl.b;
        String s1 = concurrentHashMap0.get(s);
        if(s1 == null) {
            try {
                s1 = null;
                s1 = p.t().y(s);
            }
            catch(Exception unused_ex) {
            }
            Object object0 = concurrentHashMap0.putIfAbsent(s, s1);
            if(object0 != null) {
                return object0;
            }
        }
        return s1;
    }

    public final int L() {
        return (int)this.l0("auto_image_max_ai_count");
    }

    public final int L0() {
        return (int)this.l0("temp_post_save_max_count");
    }

    public final int M() {
        return (int)this.l0("auto_image_max_pick_count");
    }

    private final i0 M0() {
        String s = p.t().y("and_app_update_link");
        L.o(s, "getString(...)");
        L.o(uk.a, "GSON");
        return (i0)c0.a.a.a(uk.a, s, i0.class);
    }

    public final int N() {
        return (int)this.l0("auto_image_max_upload_count");
    }

    @y4.m
    public final i0 N0() {
        return this.M0();
    }

    public final long O() {
        return this.l0("auto_image_max_upload_size");
    }

    @l
    public final List O0() {
        List list1;
        String s = this.K0("warning_gallery_view");
        ConcurrentHashMap concurrentHashMap0 = jl.h;
        List list0 = concurrentHashMap0.get("warning_gallery_view");
        if(list0 == null) {
            try {
                L.o(uk.a, "GSON");
                list1 = null;
                list1 = c0.a.a.b(uk.a, s, m0.class);
            }
            catch(Exception unused_ex) {
            }
            if(list1 == null) {
                list1 = new ArrayList();
            }
            Object object0 = concurrentHashMap0.putIfAbsent("warning_gallery_view", list1);
            list0 = object0 == null ? list1 : object0;
        }
        L.o(list0, "getOrPut(...)");
        return list0;
    }

    @y4.m
    public final String P() {
        return this.K0("list_auto_refresh_disable_message");
    }

    @l
    public final List P0() {
        List list1;
        String s = this.K0("warning_open_write");
        ConcurrentHashMap concurrentHashMap0 = jl.h;
        List list0 = concurrentHashMap0.get("warning_open_write");
        if(list0 == null) {
            try {
                L.o(uk.a, "GSON");
                list1 = null;
                list1 = c0.a.a.b(uk.a, s, m0.class);
            }
            catch(Exception unused_ex) {
            }
            if(list1 == null) {
                list1 = new ArrayList();
            }
            Object object0 = concurrentHashMap0.putIfAbsent("warning_open_write", list1);
            list0 = object0 == null ? list1 : object0;
        }
        L.o(list0, "getOrPut(...)");
        return list0;
    }

    public final long Q() {
        return this.l0("list_auto_refresh_max_seconds");
    }

    @l
    public final List Q0() {
        List list1;
        String s = this.K0("warning_quick_writer");
        ConcurrentHashMap concurrentHashMap0 = jl.h;
        List list0 = concurrentHashMap0.get("warning_quick_writer");
        if(list0 == null) {
            try {
                L.o(uk.a, "GSON");
                list1 = null;
                list1 = c0.a.a.b(uk.a, s, m0.class);
            }
            catch(Exception unused_ex) {
            }
            if(list1 == null) {
                list1 = new ArrayList();
            }
            Object object0 = concurrentHashMap0.putIfAbsent("warning_quick_writer", list1);
            list0 = object0 == null ? list1 : object0;
        }
        L.o(list0, "getOrPut(...)");
        return list0;
    }

    public final long R() {
        return this.l0("auto_save_interval");
    }

    @l
    public final List R0() {
        List list1;
        String s = this.K0("warning_reply_writer");
        ConcurrentHashMap concurrentHashMap0 = jl.h;
        List list0 = concurrentHashMap0.get("warning_reply_writer");
        if(list0 == null) {
            try {
                L.o(uk.a, "GSON");
                list1 = null;
                list1 = c0.a.a.b(uk.a, s, m0.class);
            }
            catch(Exception unused_ex) {
            }
            if(list1 == null) {
                list1 = new ArrayList();
            }
            Object object0 = concurrentHashMap0.putIfAbsent("warning_reply_writer", list1);
            list0 = object0 == null ? list1 : object0;
        }
        L.o(list0, "getOrPut(...)");
        return list0;
    }

    public final long S() {
        return this.l0("bookmark_cache_time");
    }

    @l
    public final List S0() {
        List list1;
        String s = this.K0("warning_write_center");
        ConcurrentHashMap concurrentHashMap0 = jl.h;
        List list0 = concurrentHashMap0.get("warning_write_center");
        if(list0 == null) {
            try {
                L.o(uk.a, "GSON");
                list1 = null;
                list1 = c0.a.a.b(uk.a, s, m0.class);
            }
            catch(Exception unused_ex) {
            }
            if(list1 == null) {
                list1 = new ArrayList();
            }
            Object object0 = concurrentHashMap0.putIfAbsent("warning_write_center", list1);
            list0 = object0 == null ? list1 : object0;
        }
        L.o(list0, "getOrPut(...)");
        return list0;
    }

    private final boolean T(String s) {
        Boolean boolean1;
        ConcurrentHashMap concurrentHashMap0 = jl.c;
        Boolean boolean0 = concurrentHashMap0.get(s);
        if(boolean0 == null) {
            try {
                boolean1 = null;
                boolean1 = Boolean.valueOf(p.t().q(s));
            }
            catch(Exception unused_ex) {
            }
            boolean0 = Boolean.valueOf((boolean1 == null ? false : boolean1.booleanValue()));
            Object object0 = concurrentHashMap0.putIfAbsent(s, boolean0);
            if(object0 != null) {
                boolean0 = object0;
            }
        }
        return boolean0.booleanValue();
    }

    public final long T0() {
        return this.l0("youtube_search_cache_time");
    }

    @y4.m
    public final com.dcinside.app.model.m U(@l com.dcinside.app.model.m.a m$a0) {
        L.p(m$a0, "type");
        try {
            String s = p.t().y("caution_messages");
            L.o(s, "getString(...)");
            L.o(uk.a, "GSON");
            n n0 = (n)c0.a.a.a(uk.a, s, n.class);
            return n0 == null || a.b[m$a0.ordinal()] != 1 ? null : n0.a();
        }
        catch(Exception unused_ex) {
        }
        return null;
    }

    public final long U0() {
        return this.l0("youtube_search_max_results");
    }

    public final boolean V() {
        return this.T("aos_check_read_lost");
    }

    public final boolean V0() {
        return this.T("quick_write_enable");
    }

    public final long W() {
        return this.l0("clear_cookie_time");
    }

    public final boolean X() {
        return this.T("main_initial_ranking_open");
    }

    public final int Y() {
        return (int)this.l0("main_initial_ranking_type");
    }

    public final long Z() {
        return this.l0("dccon_config_max_count");
    }

    public final long a0() {
        return this.l0("def_img_max_bytes");
    }

    public final void b(@l o o0) {
        long v;
        L.p(o0, "onComplete");
        jl.b.clear();
        jl.c.clear();
        jl.d.clear();
        jl.e.clear();
        jl.g.clear();
        jl.h.clear();
        jl.i.clear();
        jl.f.clear();
        dl dl0 = dl.a;
        if(dl0.e0()) {
            dl0.W3(false);
            v = 60L;
        }
        else {
            v = 3600L;
        }
        p p0 = p.t();
        L.o(p0, "getInstance(...)");
        p0.O(0x7F18000A);
        p0.M(new b().g(v).c());
        p0.o().addOnCompleteListener((Task task0) -> {
            L.p(o0, "$onComplete");
            L.p(task0, "result");
            o0.invoke(Boolean.valueOf(task0.isSuccessful()), task0.getException());
        });
    }

    public final long b0() {
        return this.l0("def_image_max_count");
    }

    // 检测为 Lambda 实现
    private static final void c(o o0, Task task0) [...]

    public final long c0() {
        return this.l0("video_disable_os_version");
    }

    private final List d(String s) {
        Q.a a0;
        ConcurrentHashMap concurrentHashMap0 = jl.e;
        List list0 = concurrentHashMap0.get(s);
        if(list0 == null) {
            try {
                list0 = null;
                String s1 = p.t().y(s);
                L.o(s1, "getString(...)");
                L.o(uk.a, "GSON");
                List list1 = c0.a.a.b(uk.a, s1, Q.b.class);
                if(list1 != null) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: list1) {
                        Q.b b0 = (Q.b)object0;
                        String s2 = b0.b();
                        if(s2 == null) {
                            a0 = null;
                        }
                        else {
                            String s3 = v.G5(s2).toString();
                            if(s3 != null) {
                                String s4 = b0.a();
                                if(s4 != null) {
                                    String s5 = v.G5(s4).toString();
                                    if(s5 != null) {
                                        Integer integer0 = b0.c() > 0 ? b0.c() : null;
                                        if(integer0 != null) {
                                            int v = (int)integer0;
                                            e e0 = (e)jl.j.get(s3);
                                            if(e0 != null) {
                                                L.m(e0);
                                                a0 = new Q.a(e0, s5, v);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if(a0 != null) {
                            arrayList0.add(a0);
                        }
                    }
                    list0 = arrayList0;
                }
            }
            catch(Exception unused_ex) {
            }
            if(list0 == null) {
                list0 = u.H();
            }
            Object object1 = concurrentHashMap0.putIfAbsent(s, list0);
            if(object1 != null) {
                list0 = object1;
            }
        }
        L.o(list0, "getOrPut(...)");
        return list0;
    }

    public final boolean d0() {
        return this.T("dccon_doublecon_enable");
    }

    public final long e() {
        return this.l0("ad_banner_delay_time_per_cycle");
    }

    public final long e0() {
        return this.l0("galler_pick_show_interval");
    }

    // 去混淆评级： 低(40)
    @l
    public final List f() {
        return this.d("and_ad_banner_list_even");
    }

    private final V f0() {
        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 RemoteConfig.kt\ncom/dcinside/app/util/RemoteConfig\n*L\n1#1,102:1\n742#2:103\n*E\n"})
        public static final class com.dcinside.app.util.jl.b implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((Z)object0).d(), ((Z)object1).d());
            }
        }

        Z z0;
        c0 c00;
        Object object1;
        ArrayList arrayList0 = null;
        try {
            String s = p.t().y("main_promotion_gallery");
            L.o(s, "getString(...)");
            L.o(uk.a, "GSON");
            b0 b00 = (b0)c0.a.a.a(uk.a, s, b0.class);
            if(b00 == null) {
            label_28:
                c00 = null;
            }
            else {
                List list0 = b00.a();
                if(list0 != null) {
                    for(Object object0: list0) {
                        ((c0)object0).d(((int)Dl.v(1.0, 150.0)));
                    }
                    Iterator iterator1 = list0.iterator();
                    if(iterator1.hasNext()) {
                        object1 = iterator1.next();
                        if(iterator1.hasNext()) {
                            int v = ((c0)object1).c();
                            while(true) {
                                Object object2 = iterator1.next();
                                int v1 = ((c0)object2).c();
                                if(v < v1) {
                                    object1 = object2;
                                    v = v1;
                                }
                                if(!iterator1.hasNext()) {
                                    break;
                                }
                            }
                        }
                    }
                    else {
                        object1 = null;
                    }
                    c00 = (c0)object1;
                    goto label_29;
                }
                goto label_28;
            }
        }
        catch(Exception unused_ex) {
            goto label_28;
        }
    label_29:
        String s1 = "";
        if(c00 != null) {
            List list1 = c00.a();
            if(list1 != null) {
                ArrayList arrayList1 = new ArrayList();
                for(Object object3: list1) {
                    a0 a00 = (a0)object3;
                    String s2 = a00.c();
                    if(s2 == null) {
                        z0 = null;
                    }
                    else {
                        String s3 = a00.b();
                        if(s3 != null) {
                            int v2 = (int)Dl.v(1.0, 150.0);
                            m m0 = a00.a() == null ? m.g : m.d.a(((int)a00.a()));
                            switch(m0) {
                                case 3: {
                                    s3 = m.d.e(s3);
                                    break;
                                }
                                case 4: {
                                    s3 = m.d.f(s3);
                                }
                            }
                            z0 = new Z(s3, s2, v2, m0.c());
                        }
                    }
                    if(z0 != null) {
                        arrayList1.add(z0);
                    }
                }
                arrayList0 = arrayList1;
            }
            String s4 = c00.b();
            if(s4 != null) {
                s1 = s4;
            }
            if(arrayList0 != null) {
                List list2 = u.u5(arrayList0, new com.dcinside.app.util.jl.b());
                return list2 == null ? r0.a(s1, u.H()) : r0.a(s1, list2);
            }
            return r0.a(s1, u.H());
        }
        return r0.a("", u.H());
    }

    // 去混淆评级： 低(40)
    @l
    public final List g() {
        return this.d("and_ad_banner_list_even_middle");
    }

    public final boolean g0() {
        return this.T("gif_video_enable");
    }

    // 去混淆评级： 低(40)
    @l
    public final List h() {
        return this.d("and_ad_banner_list_odd");
    }

    @y4.m
    public final String h0() {
        return this.K0("invalid_chrome_versions");
    }

    // 去混淆评级： 低(40)
    @l
    public final List i() {
        return this.d("and_ad_banner_list_quick");
    }

    public final long i0() {
        return this.l0("list_filter_auto_fill_max_cnt");
    }

    // 去混淆评级： 低(40)
    @l
    public final List j() {
        return this.d("and_ad_banner_main_center");
    }

    public final long j0() {
        return this.l0("list_load_next_remain_post_cnt");
    }

    // 去混淆评级： 低(40)
    @l
    public final List k() {
        return this.d("and_ad_banner_read_bottom");
    }

    public final long k0() {
        return this.l0("login_validate_time");
    }

    // 去混淆评级： 低(40)
    @l
    public final List l() {
        return this.d("and_ad_banner_read_center");
    }

    private final long l0(String s) {
        Long long1;
        ConcurrentHashMap concurrentHashMap0 = jl.d;
        Long long0 = concurrentHashMap0.get(s);
        if(long0 == null) {
            try {
                long1 = null;
                long1 = p.t().w(s);
            }
            catch(Exception unused_ex) {
            }
            long0 = (long)(long1 == null ? 0L : ((long)long1));
            Object object0 = concurrentHashMap0.putIfAbsent(s, long0);
            if(object0 != null) {
                long0 = object0;
            }
        }
        return (long)long0;
    }

    // 去混淆评级： 低(40)
    @l
    public final List m() {
        return this.d("and_ad_banner_read_img");
    }

    public final long m0() {
        return this.l0("home_contents_refresh_interval");
    }

    // 去混淆评级： 低(40)
    @l
    public final List n() {
        return this.d("and_ad_banner_read_top");
    }

    public final long n0() {
        return this.l0("aos_main_ranking_type_page");
    }

    public final long o() {
        return this.l0("ad_block_detect_expire_ms");
    }

    public final long o0() {
        return this.l0("manager_notify_interval");
    }

    @y4.m
    public final String p() {
        return this.K0("ad_block_detect_file_check_hosts");
    }

    public final long p0() {
        return this.l0("video_upload_max_bytes");
    }

    @y4.m
    public final String q() {
        return this.K0("ad_block_detect_hosts_files");
    }

    public final long q0() {
        return this.l0("video_upload_max_count");
    }

    @y4.m
    public final String r() {
        return this.K0("ad_block_detect_ip_available_hosts");
    }

    public final long r0() {
        return this.l0("otp_manager_guide");
    }

    public final long s() {
        return this.l0("ad_block_detect_ip_check_count");
    }

    public final boolean s0() {
        return this.T("performance_enable");
    }

    @y4.m
    public final String t() {
        return this.K0("ad_block_detect_ip_check_hosts");
    }

    public final long t0() {
        return this.l0("popup_interval_notice");
    }

    @l
    public final String u() {
        String s = this.K0("ad_naver_power_link_source");
        return s == null ? "" : s;
    }

    public final long u0() {
        return this.l0("popup_interval_update");
    }

    @l
    public final List v() {
        return this.d("ad_naver_power_link");
    }

    public final long v0() {
        return this.l0("post_history_expire_days");
    }

    public final int w() {
        return (int)this.l0("ad_naver_small_height");
    }

    public final boolean w0() {
        return this.T("list_like_count_colorful");
    }

    // 去混淆评级： 低(40)
    @l
    public final List x() {
        return this.d("and_ad_reply_native");
    }

    public final long x0() {
        return this.l0("post_search_head_cache_time");
    }

    // 去混淆评级： 低(40)
    @l
    public final List y() {
        return this.d("and_ad_search_keyword");
    }

    public final boolean y0() {
        return this.T("list_quick_menu_ad_enable");
    }

    @y4.m
    public final String z() {
        return this.K0("ad_search_space_active");
    }

    public final int z0() {
        return (int)this.l0("quick_write_text_min_length");
    }
}

