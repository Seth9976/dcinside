package com.dcinside.app.wv;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.graphics.ColorUtils;
import com.dcinside.app.internal.c;
import com.dcinside.app.model.PostImageInfo;
import com.dcinside.app.realm.U.b;
import com.dcinside.app.realm.U;
import com.dcinside.app.realm.h;
import com.dcinside.app.util.Yk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.vk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.V;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.sequences.p;
import kotlin.text.f;
import kotlin.text.v;
import org.jsoup.nodes.o;
import org.jsoup.nodes.t;
import org.jsoup.select.e;
import y4.m;

@s0({"SMAP\nWebViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViews.kt\ncom/dcinside/app/wv/WebViewsKt\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1245:1\n177#2,9:1246\n1#3:1255\n1#3:1319\n739#4,9:1256\n739#4,9:1265\n1557#4:1274\n1628#4,3:1275\n1863#4,2:1278\n1755#4,3:1280\n739#4,9:1283\n1557#4:1292\n1628#4,3:1293\n1863#4,2:1296\n1863#4,2:1298\n739#4,9:1300\n1611#4,9:1309\n1863#4:1318\n1864#4:1320\n1620#4:1321\n*S KotlinDebug\n*F\n+ 1 WebViews.kt\ncom/dcinside/app/wv/WebViewsKt\n*L\n350#1:1246,9\n1115#1:1319\n368#1:1256,9\n510#1:1265,9\n513#1:1274\n513#1:1275,3\n514#1:1278,2\n1010#1:1280,3\n1059#1:1283,9\n1060#1:1292\n1060#1:1293,3\n1061#1:1296,2\n1067#1:1298,2\n1113#1:1300,9\n1115#1:1309,9\n1115#1:1318\n1115#1:1320\n1115#1:1321\n*E\n"})
public final class y {
    public final class a {
        public static final int[] a;
        public static final int[] b;

        static {
            int[] arr_v = new int[r.values().length];
            try {
                arr_v[r.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[r.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[r.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
            int[] arr_v1 = new int[b.values().length];
            try {
                arr_v1[b.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[b.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[b.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.b = arr_v1;
        }
    }

    private static final o a(o o0, V[] arr_v) {
        List list1;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        String s = o0.g("style");
        if(s != null) {
            List list0 = new kotlin.text.r(";").p(s, 0);
            if(list0 != null) {
                if(!list0.isEmpty()) {
                    ListIterator listIterator0 = list0.listIterator(list0.size());
                    while(listIterator0.hasPrevious()) {
                        if(((String)listIterator0.previous()).length() == 0) {
                            continue;
                        }
                        list1 = u.J5(list0, listIterator0.nextIndex() + 1);
                        goto label_13;
                    }
                }
                list1 = u.H();
            label_13:
                if(list1 != null) {
                    ArrayList arrayList0 = new ArrayList(u.b0(list1, 10));
                    for(Object object0: list1) {
                        arrayList0.add(v.V4(((String)object0), new String[]{":"}, false, 0, 6, null));
                    }
                    for(Object object1: arrayList0) {
                        List list2 = (List)object1;
                        String s1 = (String)u.W2(list2, 0);
                        if(s1 != null) {
                            String s2 = (String)u.W2(list2, 1);
                            if(s2 == null) {
                                s2 = "";
                            }
                            linkedHashMap0.put(s1, s2);
                        }
                    }
                }
            }
        }
        for(int v = 0; v < arr_v.length; ++v) {
            V v1 = arr_v[v];
            linkedHashMap0.put(((String)v1.a()), ((String)v1.b()));
        }
        if(!linkedHashMap0.isEmpty()) {
            StringBuilder stringBuilder0 = new StringBuilder();
            for(Object object2: linkedHashMap0.keySet()) {
                stringBuilder0.append(((String)object2));
                String s3 = (String)linkedHashMap0.get(((String)object2));
                if(s3 == null || s3.length() <= 0) {
                    s3 = null;
                }
                if(s3 != null) {
                    stringBuilder0.append(':');
                    stringBuilder0.append(s3);
                }
                stringBuilder0.append(';');
            }
            o0.L0("style", stringBuilder0.toString());
        }
        return o0;
    }

    private static final void b(o o0, String[] arr_s) {
        if(arr_s.length == 0) {
            return;
        }
        StringBuilder stringBuilder0 = new StringBuilder(o0.g("style"));
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(!v.c3(stringBuilder0, ";", false, 2, null)) {
                stringBuilder0.append(";");
            }
            stringBuilder0.append(s);
        }
        o0.L0("style", stringBuilder0.toString());
    }

    private static final void c(l l0, o o0) {
        o o5;
        o o4;
        o o1 = o0.p2();
        if(o1 == null) {
            return;
        }
        o1.z0("dc_ai_root");
        e e0 = o1.E2(".ai_cont");
        L.o(e0, "select(...)");
        o o2 = (o)u.G2(e0);
        if(o2 != null) {
            if(o2.E2(".ai_imgbox").isEmpty()) {
                o2.z0("dc_ai_cont_text");
            }
            else {
                o2.z0("dc_ai_cont_image");
            }
        }
        e e1 = o0.S0();
        o o3 = e1.u();
        if(o3 == null) {
            o5 = null;
            o3 = null;
            o4 = null;
        }
        else {
            o4 = o3.E2("[data-count]").u();
            if(o4 == null) {
                o5 = o3;
                o3 = null;
                o4 = null;
            }
            else if(e1.size() >= 2) {
                o5 = (o)e1.get(1);
            }
            else {
                o5 = null;
            }
        }
        if(o3 != null) {
            if(o5 == null) {
                o3.z0("dc_time_left dc_prompt_border_type0");
            }
            else {
                o3.z0("dc_time_left dc_prompt_border_type1");
            }
            o o6 = o3.S0().u();
            if(o6 != null) {
                o6.z0("dc_time_left_texts");
            }
            if(o4 != null) {
                String s = (String)o4.f1().get("count");
                if(s != null) {
                    Integer integer0 = v.b1(s);
                    if(integer0 != null) {
                        if(integer0.intValue() <= 0) {
                            integer0 = null;
                        }
                        if(integer0 != null) {
                            o o7 = o4.p2();
                            if(o7 != null) {
                                L.m(o7);
                                o7.z0("dc_time_left_content");
                                o4.d0();
                                for(Object object0: o7.S0()) {
                                    ((o)object0).Q2("span").z0("dc_time_left_remain").L0("style", "display:block");
                                }
                                o7.D0(l0.g().j3("span").z0("dc_time_left_times dc_time_left_remain").L0("style", "display:block"));
                                o7.D0(l0.g().j3("span").z0("dc_time_left_complete").L0("style", "display:none").T2("AI 이미지가 생성되었습니다."));
                                o7.D0(l0.g().j3("span").z0("dc_time_left_complete").L0("style", "display:none").T2("(새로고침 시 확인 가능)"));
                                l0.K(l0.b() + 1);
                                String s1 = String.format("<script>\n    var parent_%1$d = document.currentScript.parentElement;\n    var dcTimeLeftCounting_%1$d = 0;\n    var dcTimeLeftIntervalId_%1$d = setInterval(function () {\n        const diff = (%2$d - (++dcTimeLeftCounting_%1$d)).toString().replace(/\\\\B(?=(\\\\d{3})+(?!\\\\d))/g, \",\");\n        if (diff < 0) {\n            let remains = parent_%1$d.querySelectorAll(\'div.dc_time_left .dc_time_left_remain\');\n            for (var i = 0; i < remains.length; i++) {\n                remains[i].style = \'display:none\';\n            }\n            let completes = parent_%1$d.querySelectorAll(\'div.dc_time_left .dc_time_left_complete\');\n            for (var i = 0; i < completes.length; i++) {\n                completes[i].style = \'display:block\';\n            }\n            clearInterval(dcTimeLeftIntervalId_%1$d);\n        } else {\n            let times = parent_%1$d.querySelectorAll(\'div.dc_time_left .dc_time_left_times\');\n            for (var i = 0; i < times.length; i++) {\n                times[i].innerText = \'\uB0A8\uC740 \uB300\uAE30: \' + diff + \'\uCD08\';\n            }\n        }\n    }, 1000);\n</script>", Arrays.copyOf(new Object[]{l0.b(), integer0}, 2));
                                L.o(s1, "format(...)");
                                o7.C0(s1);
                            }
                        }
                    }
                }
            }
        }
        if(o5 != null) {
            o5.z0("dc_prompts dc_prompt_border_type0");
            L.o("프롬프트", "getString(...)");
            L.o("네거티브 프롬프트", "getString(...)");
            L.o("샘플링", "getString(...)");
            for(Object object1: o5.S0()) {
                o o8 = (o)object1;
                e e2 = o8.S0();
                if(e2.size() < 2) {
                    e2 = null;
                }
                if(e2 != null) {
                    String s2 = ((o)e2.get(0)).z0("dc_prompt_title").S2();
                    L.m(s2);
                    if(v.v2(s2, "프롬프트", false, 2, null)) {
                        o8.z0("dc_prompts_positive");
                    }
                    else if(v.v2(s2, "네거티브 프롬프트", false, 2, null)) {
                        o8.z0("dc_prompts_negative");
                    }
                    else if(v.v2(s2, "샘플링", false, 2, null)) {
                        o8.z0("dc_prompts_sampling");
                    }
                    e e3 = ((o)e2.get(1)).z0("dc_prompt_content").S0();
                    L.o(e3, "children(...)");
                    o o9 = (o)u.W2(e3, 0);
                    if(o9 != null) {
                        o9.z0("dc_prompt_texts");
                    }
                }
            }
        }
    }

    private static final void d(l l0, o o0) {
        List list1;
        if(o0.R1("ai_image_wrap")) {
            y.c(l0, o0);
        }
        String s = o0.g("style");
        if(s != null && v.W2(s, "width:", false, 2, null)) {
            List list0 = new kotlin.text.r(";").p(s, 0);
            if(!list0.isEmpty()) {
                ListIterator listIterator0 = list0.listIterator(list0.size());
                while(listIterator0.hasPrevious()) {
                    if(((String)listIterator0.previous()).length() == 0) {
                        continue;
                    }
                    list1 = u.J5(list0, listIterator0.nextIndex() + 1);
                    goto label_12;
                }
            }
            list1 = u.H();
        label_12:
            if(!list1.isEmpty()) {
                StringBuilder stringBuilder0 = new StringBuilder();
                ArrayList arrayList0 = new ArrayList(u.b0(list1, 10));
                for(Object object0: list1) {
                    String s1 = (String)object0;
                    if(v.v2(s1, "width:", false, 2, null)) {
                        s1 = "max-width:100%;" + s1;
                    }
                    arrayList0.add(s1);
                }
                for(Object object1: arrayList0) {
                    stringBuilder0.append(((String)object1));
                    stringBuilder0.append(';');
                }
                o0.L0("style", stringBuilder0.toString());
            }
        }
    }

    private static final void e(l l0, o o0) {
        String s = Yk.p(o0.g("src"));
        if(s == null) {
            o0.L0("width", "100%").L0("height", String.valueOf(l0.h()));
            return;
        }
        Yk.a(o0, s, l0.h());
    }

    private static final void f(l l0, o o0) {
        String s = o0.g("color");
        if(s == null) {
            return;
        }
        if(s.length() > 0) {
            try {
                Integer integer0 = null;
                integer0 = Color.parseColor(s);
            }
            catch(Exception unused_ex) {
            }
            if(integer0 != null && ((int)integer0) == 0xFF000000) {
                o0.L0("color", l0.A());
            }
        }
    }

    private static final com.dcinside.app.wv.e g(com.dcinside.app.wv.e e0) {
        com.dcinside.app.realm.y y0 = com.dcinside.app.realm.y.h.i("");
        if(y0.R5()) {
            String s = e0.i().S2();
            L.o(s, "text(...)");
            if(y0.U5(s)) {
                switch(y0.S5()) {
                    case 0: {
                        e0.m(true);
                        break;
                    }
                    case 1: {
                        e0.n(true);
                        return e0;
                    }
                    default: {
                        return e0;
                    }
                }
            }
        }
        return e0;
    }

    private static final void h(l l0, o o0) {
        String s = o0.g("src");
        if(s == null) {
            o0.L0("allowfullscreen", "true");
            return;
        }
        if(l0.n() && Yk.a.v().matcher(s).find()) {
            o o1 = l0.g().j3("div");
            String s1 = o0.g("name");
            if(s1 == null || s1.length() <= 0) {
                o0.L0("name", "dc_voice_iframe_app");
            }
            o0.i0(o1);
            o1.D0(o0);
            o1.D0(l0.g().j3("br"));
            String s2 = o0.toString();
            L.o(s2, "toString(...)");
            byte[] arr_b = s2.getBytes(f.b);
            L.o(arr_b, "getBytes(...)");
            String s3 = Base64.encodeToString(arr_b, 2);
            o o2 = l0.g().j3("div").L0("style", "margin-top: 10px;");
            o o3 = l0.g().j3("div").z0("dc_voice_folder_img_wrap").L0("style", "display:inline-block; vertical-align:middle;").D0(l0.g().j3("img").z0("dc_img_folder_btn").L0("src", "file:///android_asset/ico_insert_folder_web.png")).L0("onclick", "DcJsCallback.onArchiveReply(\'" + s3 + "\')");
            String s4 = String.format(Locale.ENGLISH, "display:inline-block; vertical-align:middle; font-size:12px; color:%s;", Arrays.copyOf(new Object[]{c.i(vk.b(l0.e(), 0x1010038))}, 1));
            L.o(s4, "format(...)");
            if(!l0.l()) {
                o o4 = l0.g().j3("div").z0("dc_voice_folder_text").L0("style", s4).L0("onclick", "DcJsCallback.onArchiveReply(\'" + s3 + "\')").T2("보관");
                o2.D0(o3);
                o2.D0(o4);
            }
            String s5 = Uri.parse(s).getQueryParameter("vr");
            o o5 = l0.g().j3("div").z0("dc_voice_folder_img_wrap").L0("style", (l0.l() ? "display:inline-block; vertical-align:middle;" : "margin-left: 10px; display:inline-block; vertical-align:middle;")).D0(l0.g().j3("img").z0("dc_img_down_btn").L0("src", "file:///android_asset/ico_dccon_down.png")).L0("onclick", "DcJsCallback.onDownloadVoice(\'" + s5 + "\')");
            o o6 = l0.g().j3("div").z0("dc_voice_folder_text").L0("style", s4).L0("onclick", "DcJsCallback.onDownloadVoice(\'" + s5 + "\')").T2("다운");
            o2.D0(o5);
            o2.D0(o6);
            o1.D0(o2).L0("onclick", "DcJsCallback.onVoiceBodyClicked()");
            o1.C0("<script>document.querySelector(\'.dc_voice_folder_img_wrap\').addEventListener(\'click\', function(e) {e.stopPropagation();});document.querySelector(\'.dc_voice_folder_text\').addEventListener(\'click\', function(e) {e.stopPropagation();});</script>");
            return;
        }
        if(Yk.a.y().matcher(s).find()) {
            String s6 = Uri.parse(o0.g("src")).buildUpon().appendQueryParameter("enablejsapi", "1").appendQueryParameter("version", "3").appendQueryParameter("playerapiid", "ytplayer").build().toString();
            L.o(s6, "toString(...)");
            o0.L0("allowfullscreen", "true").L0("src", s6);
            o o7 = l0.g().j3("div").z0("dc_youtube_wrap dc_youtube_wrap" + l0.B());
            o o8 = l0.g().j3("a").z0("dc_youtube_click").L0("href", "#youtube" + l0.B()).L0("onclick", "onDcYoutubeClicked(" + l0.B() + ")");
            o0.i0(o7);
            o7.D0(o0);
            o7.D0(o8);
            l0.R(l0.B() + 1);
            return;
        }
        o0.L0("allowfullscreen", "true");
    }

    private static final void i(l l0, o o0) {
        int v4;
        int v3;
        String s15;
        int v2;
        Map map3;
        String s12;
        String s11;
        String s9;
        boolean z6;
        int v1;
        boolean z5;
        b u$b1;
        String s;
        l0.O(l0.q() + 1);
        o o1 = o0.p2();
        if(o1 == null || !L.g(o1.P2(), "div")) {
            o1 = l0.g().j3("div");
            o1.L0("style", "display: inline-block;");
            o0.i0(o1);
            o1.D0(o0);
            L.m(o1);
        }
        o1.z0("dc_img_root");
        Map map0 = o0.f1();
        jl jl0 = jl.a;
        if(jl0.g0()) {
            s = (String)map0.get("mp4");
        }
        else {
            s = ((long)Build.VERSION.SDK_INT) < jl0.c0() ? ((String)map0.get("mp4")) : "";
        }
        boolean z = s != null && s.length() > 0;
        String s1 = (String)map0.get("original");
        if(s1 == null) {
            s1 = "";
        }
        String s2 = o0.U0();
        if(L.g(s2, "webp")) {
            o0.z0("gif");
        }
        boolean z1 = o0.R1("gif") && s1.length() > 0;
        String s3 = o0.g("src");
        String s4 = (String)map0.get("src");
        if(s4 == null) {
            s4 = "";
        }
        String s5 = (String)map0.get("original");
        if(s5 == null) {
            s5 = "";
        }
        boolean z2 = y.q(s4) || y.q(s5);
        boolean z3 = z2 && L.g(o0.g("width"), "150px");
        String s6 = s4.length() == 0 ? s5 : s4;
        String s7 = (String)map0.get("rel1");
        if(s7 == null) {
            s7 = "";
        }
        String s8 = (String)map0.get("rel2");
        if(s8 == null) {
            s8 = "";
        }
        boolean z4 = L.g(map0.get("banned"), "1");
        b u$b0 = U.g.d(s7, s8, z4);
        int v = z4 || U.g.e(u$b0) ? 1 : 0;
        if(z2 || !l0.F()) {
            u$b1 = u$b0;
            z5 = false;
        }
        else {
            u$b1 = u$b0;
            z5 = h.h.b(s7, s8);
        }
        if(!z2 || !l0.D()) {
            v1 = v;
            z6 = false;
        }
        else {
            v1 = v;
            z6 = com.dcinside.app.realm.f.i.f(s6);
        }
        if(z2) {
            s9 = s1;
        }
        else {
            L.m(s3);
            s9 = s1;
            if(v.v2(s3, "http", false, 2, null)) {
                l0.p().add(new PostImageInfo(s3, s7, s8, z5, z4, !z5 && !z4));
                l0.P(l0.s() + 1);
            }
        }
        if(z2) {
            l0.p().add(new PostImageInfo(s3, null, null, z6, false, false, 22, null));
        }
        if(z5 && l0.G()) {
            o0.d0();
            return;
        }
        if(z6 && l0.E()) {
            o0.d0();
            return;
        }
        L.m(map0);
        map0.put("src", s3);
        o0.z0("dc_img_base dc_img_base" + l0.q()).L0("onload", "onDcLoadImage(" + l0.q() + ")").L0("onerror", "onDcImageError(" + l0.q() + ")").L0("onclick", "onDcImageClicked(" + l0.q() + ")");
        o o2 = o0.p2();
        if(L.g("a", o2.P2())) {
            String s10 = o2.g("href");
            if(s10 == null || s10.length() <= 0) {
                s11 = s7;
                s12 = s8;
            }
            else {
                s11 = s7;
                o2.z0("dc_origin_parent");
                Map map1 = o2.f1();
                s12 = s8;
                L.o(map1, "dataset(...)");
                map1.put("href", s10);
                o2.A2("href");
            }
        }
        else {
            s11 = s7;
            s12 = s8;
        }
        if(z2) {
            if(L.g("p", o2.P2())) {
                o2.Q2("div");
            }
            o0.M0("dccon", true);
            o0.L0("groupIndex", ((String)map0.get("dccondetail")));
        }
        o o3 = l0.g().j3("div").z0("dc_img_wrap dc_img_wrap" + l0.q());
        Map map2 = o3.f1();
        L.m(map2);
        map2.put("rid", String.valueOf(l0.y()));
        map2.put("idx", String.valueOf(l0.q()));
        o0.i0(o3);
        o3.D0(o0);
        o o4 = l0.g().j3("span").z0("dc_img_loading dc_img_loading" + l0.q() + " dc_img_gone").J0(o3);
        l0.g().j3("div").z0("loading_stat").C0("<span></span><span></span><span></span><span></span><span></span><span></span><span></span><span></span><span></span><span></span><span></span><span></span>").J0(o4);
        if(!z2) {
            o0.L0("alt", " ");
        }
        if(z1) {
            map0.remove("original");
            L.m(s3);
            l0.k().put(s9, s3);
            if(l0.w().c()) {
                if(l0.c() == r.a) {
                    if(z) {
                        L.m(s);
                        o3.D0(y.p(l0.g(), s, s3, l0.q()));
                    }
                    else {
                        map0.put("gif", s3);
                    }
                    map0.put("src", s9);
                }
                else {
                    map0.put("gif", s3);
                    o0.L0("src", s9);
                }
                String s13 = L.g(s2, "webp") ? "dc_img_webp_btn_wrap" : "dc_img_btn_wrap";
                o o5 = l0.g().j3("span").z0(s13 + " dc_img_gone").J0(o3);
                l0.g().j3("span").z0("dc_img_btn_bg").J0(o5);
            }
            else if(z) {
                o0.L0("src", s9);
                map0.put("src", "");
                L.m(s);
                o3.D0(y.p(l0.g(), s, s3, l0.q()));
            }
            else {
                o0.B2("gif");
            }
        }
        r r0 = r.a;
        if(l0.c() != r0) {
            map3 = map0;
            v2 = 0;
        }
        else if(!l0.o()) {
            map3 = map0;
            if(l0.q() > l0.w().d()) {
                l0.N(l0.m() + 1);
                if(l0.f() == null) {
                    l0.L(o3);
                }
                if(!z2) {
                    o3.z0("dc_img_wrap_full");
                }
                o o6 = l0.g().j3("div").z0("dc_img_hide_wrap").L0("onclick", "onDcHideImgDisplay(" + l0.q() + ")").J0(o3);
                o o7 = l0.g().j3("div").z0("dc_img_hide_base").J0(o6);
                l0.g().j3("img").L0("src", "file:///android_asset/" + l0.w().f()).L0("id", "dc_img_hide_ic").J0(o7);
                l0.g().j3("div").L0("style", l0.w().i()).T2(l0.e().getString(0x7F150287, new Object[]{l0.m()})).J0(o6);  // string:display_hidden_image "숨긴 이미지 펼치기 (%1$d)"
                o0.z0("dc_img_gone").A2("src");
                v2 = 1;
            }
            else {
                o0.z0("dc_img_gone").A2("src");
                o3.z0("dc_lazy_load");
                v2 = 0;
            }
        }
        else {
            map3 = map0;
            o0.z0("dc_img_gone").A2("src");
            o3.z0("dc_lazy_load");
            v2 = 0;
        }
        if(l0.c() != r0 || v1 == 0 && !z5 && !z6) {
            v4 = v2;
        }
        else {
            for(Object object0: o3.S0()) {
                L.m(((o)object0));
                y.a(((o)object0), new V[]{r0.a("display", "none")});
            }
            o o8 = v1 != 0 || z5 ? l0.g().j3("div") : l0.g().j3("img");
            o8.z0("dc_image_block");
            if(v1 != 0 || z5) {
                int[] arr_v = a.b;
                switch(arr_v[u$b1.ordinal()]) {
                    case 1: 
                    case 2: {
                        s15 = l0.w().g();
                        break;
                    }
                    default: {
                        s15 = l0.w().b();
                    }
                }
                o8.L0("style", s15);
                if(z5) {
                    v3 = 0x7F1504CC;  // string:image_is_blocked "차단 이미지"
                }
                else if(l0.J()) {
                    switch(arr_v[u$b1.ordinal()]) {
                        case 1: {
                            v3 = 0x7F150476;  // string:image_blocked_manager_process "이미지 차단에 반영 중⋯"
                            break;
                        }
                        case 2: {
                            v3 = 0x7F1504EF;  // string:image_unblocked_manager_process "이미지 차단 해제 중⋯"
                            break;
                        }
                        default: {
                            v3 = 0x7F1504CD;  // string:image_is_blocked_by_manager "매니저 차단 이미지"
                        }
                    }
                }
                else {
                    v3 = 0x7F1504CD;  // string:image_is_blocked_by_manager "매니저 차단 이미지"
                }
                o8.T2(l0.e().getString(v3));
            }
            else {
                String s14 = l0.C() ? "block_dccon_n.webp" : "block_dccon.webp";
                if(z3) {
                    o8.L0("style", "width:150px; height:150px;");
                }
                else {
                    o8.L0("style", "width:100px; height:100px;");
                }
                o8.L0("src", "file:///android_asset/" + s14);
                o0.z0("dc_dccon_blocked");
            }
            o8.L0("onclick", "onDcUnblockImage(this, " + l0.y() + ")");
            o8.L0("dc_block_check_size", s12);
            o8.L0("dc_block_check_name", s11);
            o8.J0(o3);
            if(!z2) {
                o3.z0("dc_img_wrap_full");
            }
            v4 = v1 == 0 && !z5 ? v2 : 1;
        }
        if(l0.c() != r.c && !z2 && dl.a.l1()) {
            o o9 = l0.g().j3("span").z0("dc_img_number");
            L.o(o9, "addClass(...)");
            o o10 = y.a(o9, new V[]{r0.a("visibility", (v4 == 0 ? "" : "hidden"))}).J0(o3);
            l0.g().j3("div").z0("dc_img_number_text").T2(String.valueOf(l0.s())).J0(o10);
        }
        if(v4 != 0) {
            o1.z0("dc_img_root_hidden_children");
        }
        String s16 = (String)map3.get("fileno");
        String s17 = s16 == null ? "" : s16;
        if(s17.length() > 0) {
            if(l0.H()) {
                o o11 = l0.g().j3("img").z0("dc_img_note_icon").L0("src", "file:///android_asset/ico_img_note.png");
                if(v4 != 0) {
                    o11.z0("dc_img_note_hidden");
                }
                o3.D0(l0.g().j3("div").z0("dc_img_note_wrap").L0("onclick", "onDcImgNoteWriteClicked(this)").D0(o11));
            }
            if(l0.I()) {
                o0.z0("dc_img_note_target").z0("dc_img_note_target_" + s17);
            }
        }
        if(l0.i() == null && !z2) {
            l0.M(o3);
        }
    }

    private static final void j(l l0) {
        o o0 = l0.f();
        if(o0 != null) {
            if(l0.m() < 2) {
                o0 = null;
            }
            if(o0 != null) {
                o o1 = l0.g().j3("div").z0("dc_display_all_hide_img");
                Map map0 = o1.f1();
                L.m(map0);
                map0.put("hideCount", String.valueOf(l0.m()));
                o o2 = o1.L0("onclick", "onDcHideImgDisplayAll()");
                l0.g().j3("div").z0("dc_img_hide_base").D0(l0.g().j3("img").z0("dc_display_all_hide_img_ic").L0("src", "file:///android_asset/" + l0.w().e())).J0(o2);
                l0.g().j3("div").L0("style", l0.w().i()).T2("숨긴 이미지 모두 펼치기").J0(o2);
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(o2);
                o o3 = o0.p2();
                if(L.g("a", o3.N())) {
                    o3.p2().Y1(0, arrayList0);
                    return;
                }
                o3.Y1(0, arrayList0);
            }
        }
    }

    private static final void k(l l0) {
        ArrayList arrayList0 = l0.p();
        if(!(arrayList0 instanceof Collection) || !arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                if(((PostImageInfo)object0).g()) {
                    if(l0.p().size() < 3) {
                        l0.g().E2(".dc_img_number").T();
                        return;
                    }
                    dl dl0 = dl.a;
                    int v = dl0.m1();
                    if(v >= 3) {
                        return;
                    }
                    o o0 = l0.g().j3("div").z0("dc_img_number_guide_background").L0("onclick", "onHideImgNumberGuide()");
                    o o1 = l0.g().j3("div").z0("dc_img_number_guide_box");
                    o o2 = l0.g().j3("div").z0("dc_img_number_guide_left");
                    o o3 = l0.g().j3("div").z0("dc_img_number_guide_text").U1("이미지 순서 표시를 ON/OFF 할 수 있습니다.");
                    o o4 = l0.g().j3("div").z0("dc_img_number_guide_text").U1("(설정 > 글읽기 설정에서 가능)");
                    o o5 = l0.g().j3("img").z0("dc_img_number_guide_icon").L0("src", "file:///android_asset/ico_close.png");
                    o1.J0(o0);
                    o2.J0(o1);
                    o3.J0(o2);
                    o4.J0(o2);
                    o5.J0(o1);
                    o o6 = l0.i();
                    if(o6 != null) {
                        o6.P0(o0);
                    }
                    dl0.e5(v + 1);
                    return;
                }
                if(false) {
                    break;
                }
            }
        }
    }

    private static final void l(o o0) {
        for(Object object0: o0.E2("div.og-img img")) {
            L.o(object0, "next(...)");
            o o1 = (o)object0;
            String s = o1.g("src");
            L.m(s);
            if(s.length() <= 0) {
                s = null;
            }
            if(s != null) {
                o1.A2("src");
                y.b(o1, new String[]{"background-image: url(\'" + s + "\');"});
            }
        }
    }

    private static final void m(l l0, o o0) {
        o o1 = null;
        t t0 = null;
        for(Object object0: o0.S0()) {
            o o2 = (o)object0;
            String s = o2.P2();
            if(L.g("param", s)) {
                if(!L.g("movie", o2.g("name"))) {
                    continue;
                }
                String s1 = o2.g("value");
                if(s1 == null || !v.v2(s1, "https://www.youtube.com/", false, 2, null)) {
                    continue;
                }
                o1 = o2;
                if(t0 == null) {
                    continue;
                }
                break;
            }
            if(L.g("embed", s)) {
                String s2 = o2.g("src");
                if(s2 != null && v.v2(s2, "https://www.youtube.com/", false, 2, null)) {
                    t0 = o2;
                    if(o1 != null) {
                        break;
                    }
                }
            }
        }
        if(o1 != null && t0 != null) {
            String s3 = Yk.p(t0.g("src"));
            if(s3 != null) {
                Yk.a(o0, s3, 0);
            }
        }
    }

    private static final void n(l l0, o o0) {
        @s0({"SMAP\nWebViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViews.kt\ncom/dcinside/app/wv/WebViewsKt$applySpan$attributeValue$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1245:1\n1#2:1246\n*E\n"})
        static final class com.dcinside.app.wv.y.b extends N implements Function1 {
            final l e;
            final kotlin.jvm.internal.l0.a f;

            com.dcinside.app.wv.y.b(l l0, kotlin.jvm.internal.l0.a l0$a0) {
                this.e = l0;
                this.f = l0$a0;
                super(1);
            }

            @y4.l
            public final String b(@y4.l String s) {
                L.p(s, "it");
                Integer integer0 = Yk.a.B(s);
                Float float0 = integer0 == null ? null : ((float)ColorUtils.n(integer0.intValue()));
                if(float0 != null) {
                    if(this.e.C()) {
                        if(((double)(((float)float0))) < 0.05) {
                            this.f.a = true;
                            return "color:" + this.e.A();
                        }
                    }
                    else if(((double)(((float)float0))) > 0.95) {
                        this.f.a = true;
                        return "color:" + this.e.A();
                    }
                }
                return s;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((String)object0));
            }
        }

        List list1;
        String s = o0.g("style");
        if(s == null) {
            return;
        }
        List list0 = new kotlin.text.r(";").p(s, 0);
        if(!list0.isEmpty()) {
            ListIterator listIterator0 = list0.listIterator(list0.size());
            while(listIterator0.hasPrevious()) {
                if(((String)listIterator0.previous()).length() == 0) {
                    continue;
                }
                list1 = u.J5(list0, listIterator0.nextIndex() + 1);
                goto label_11;
            }
        }
        list1 = u.H();
    label_11:
        if(list1.isEmpty()) {
            list1 = null;
        }
        if(list1 == null) {
            return;
        }
        kotlin.jvm.internal.l0.a l0$a0 = new kotlin.jvm.internal.l0.a();
        String s1 = p.e1(p.k1(u.A1(list1), new com.dcinside.app.wv.y.b(l0, l0$a0)), ";", null, ";", 0, null, null, 58, null);
        if(l0$a0.a) {
            o0.z0("dc_ignore_background");
        }
        o0.L0("style", s1);
    }

    private static final void o(l l0, o o0) {
        o0.L0("onerror", "this.style.maxHeight=\'50px\';").L0("onloadeddata", "wvContentHeight(" + l0.y() + ")").L0("onloadedmetadata", "wvContentHeight(" + l0.y() + ")").L0("allowfullscreen", "true").A2("height").L0("width", "100%");
    }

    private static final o p(org.jsoup.nodes.f f0, String s, String s1, int v) {
        o o0 = f0.j3("video").z0("dc_video_player").L0("preload", "auto").L0("loop", "").L0("muted", "").L0("onloadeddata", "onDcLoadVideo(" + v + ")");
        Map map0 = o0.f1();
        L.m(map0);
        map0.put("source", s);
        map0.put("gif", s1);
        o o1 = f0.j3("a").z0("dc_video_click").L0("href", "#" + s1).L0("onclick", "onDcVideoClicked(" + v + ")");
        o o2 = f0.j3("div").z0("dc_video_wrap dc_img_gone").D0(o0).D0(o1);
        L.o(o2, "appendChild(...)");
        return o2;
    }

    public static final boolean q(@y4.l String s) {
        L.p(s, "<this>");
        return v.W2(s, "dccon.php", false, 2, null);
    }

    private static final void r(o o0, Function1 function10, Function1 function11) {
        List list1;
        String s = o0.g("style");
        L.o(s, "attr(...)");
        List list0 = new kotlin.text.r(";").p(s, 0);
        if(!list0.isEmpty()) {
            ListIterator listIterator0 = list0.listIterator(list0.size());
            while(listIterator0.hasPrevious()) {
                if(((String)listIterator0.previous()).length() == 0) {
                    continue;
                }
                list1 = u.J5(list0, listIterator0.nextIndex() + 1);
                goto label_10;
            }
        }
        list1 = u.H();
    label_10:
        if(list1.isEmpty()) {
            list1 = null;
        }
        if(list1 == null) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list1) {
            String s1 = (String)function10.invoke(((String)object0));
            if(s1 != null) {
                arrayList0.add(s1);
            }
        }
        String s2 = TextUtils.join(";", arrayList0);
        if(v.N1(s, ";", false, 2, null)) {
            s2 = s2 + ";";
        }
        if(!L.g(s2, s)) {
            o0.L0("style", s2);
            if(function11 != null) {
                Void void1 = (Void)function11.invoke(Boolean.TRUE);
            }
        }
        else if(function11 != null) {
            Void void0 = (Void)function11.invoke(Boolean.FALSE);
        }
    }

    static void s(o o0, Function1 function10, Function1 function11, int v, Object object0) {
        if((v & 2) != 0) {
            function11 = null;
        }
        y.r(o0, function10, function11);
    }

    @y4.l
    public static final com.dcinside.app.wv.e t(@y4.l Context context0, @y4.l org.jsoup.nodes.f f0, boolean z, boolean z1, boolean z2, int v, @y4.l r r0, boolean z3, @m Float float0, boolean z4, boolean z5, boolean z6) {
        L.p(context0, "ctx");
        L.p(f0, "doc");
        L.p(r0, "captureForm");
        l l0 = new l(context0, f0, z, z1, z2, v, r0, z3, float0, z4, z5, z6);
        switch(l0.c()) {
            case 1: 
            case 2: {
                for(Object object0: f0.E2((l0.C() ? "font,span,iframe,object,embed,img,div,p,a,strong,video" : "iframe,object,embed,img,div,a,video"))) {
                    o o0 = (o)object0;
                    String s = o0.P2();
                    if(s != null) {
                        switch(s.hashCode()) {
                            case 0xB8FF82A4: {
                                if(!s.equals("iframe")) {
                                    continue;
                                }
                                L.m(o0);
                                y.h(l0, o0);
                                continue;
                            }
                            case 0xC300A33F: {
                                if(!s.equals("object")) {
                                    continue;
                                }
                                L.m(o0);
                                y.m(l0, o0);
                                continue;
                            }
                            case -891980137: {
                                if(!s.equals("strong")) {
                                    continue;
                                }
                                L.m(o0);
                                y.n(l0, o0);
                                continue;
                            }
                            case 97: {
                                if(!s.equals("a")) {
                                    continue;
                                }
                                if(o0.R1("og-wrap")) {
                                    L.m(o0);
                                    y.l(o0);
                                }
                                else {
                                    L.m(o0);
                                    y.n(l0, o0);
                                }
                                continue;
                            }
                            case 0x70: {
                                if(!s.equals("p")) {
                                    continue;
                                }
                                L.m(o0);
                                y.n(l0, o0);
                                continue;
                            }
                            case 99473: {
                                if(!s.equals("div") || o0.R1("og-img") || o0.R1("og-inr") || o0.R1("og-info")) {
                                    continue;
                                }
                                L.m(o0);
                                y.d(l0, o0);
                                y.n(l0, o0);
                                continue;
                            }
                            case 104387: {
                                if(!s.equals("img")) {
                                    continue;
                                }
                                o o1 = o0.p2();
                                if(o1 != null && o1.R1("og-img")) {
                                    continue;
                                }
                                L.m(o0);
                                y.i(l0, o0);
                                continue;
                            }
                            case 0x300C4F: {
                                if(!s.equals("font")) {
                                    continue;
                                }
                                L.m(o0);
                                y.f(l0, o0);
                                continue;
                            }
                            case 0x35F74A: {
                                if(!s.equals("span")) {
                                    continue;
                                }
                                L.m(o0);
                                y.n(l0, o0);
                                continue;
                            }
                            case 96620249: {
                                if(!s.equals("embed")) {
                                    continue;
                                }
                                L.m(o0);
                                y.e(l0, o0);
                                continue;
                            }
                            case 0x6B0147B: {
                                if(s.equals("video")) {
                                    break;
                                }
                                continue;
                            }
                            default: {
                                continue;
                            }
                        }
                        L.m(o0);
                        y.o(l0, o0);
                    }
                }
                break;
            }
            case 3: {
                for(Object object1: f0.E2((l0.C() ? "font,span,iframe,div,a" : "iframe,div,a"))) {
                    o o2 = (o)object1;
                    String s1 = o2.P2();
                    if(s1 != null) {
                        switch(s1) {
                            case "a": {
                                if(o2.R1("og-wrap")) {
                                    L.m(o2);
                                    y.l(o2);
                                    continue;
                                }
                                else {
                                    L.m(o2);
                                    y.n(l0, o2);
                                    break;
                                }
                                L.m(o2);
                                y.d(l0, o2);
                                break;
                            }
                            case "div": {
                                L.m(o2);
                                y.d(l0, o2);
                                break;
                            }
                            case "font": {
                                L.m(o2);
                                y.f(l0, o2);
                                break;
                            }
                            case "iframe": {
                                L.m(o2);
                                y.h(l0, o2);
                                break;
                            }
                            case "span": {
                                L.m(o2);
                                y.n(l0, o2);
                            }
                        }
                    }
                }
            }
        }
        y.j(l0);
        y.k(l0);
        com.dcinside.app.wv.e e0 = l0.d();
        return v == 0 ? e0 : y.g(e0);
    }

    public static com.dcinside.app.wv.e u(Context context0, org.jsoup.nodes.f f0, boolean z, boolean z1, boolean z2, int v, r r0, boolean z3, Float float0, boolean z4, boolean z5, boolean z6, int v1, Object object0) {
        boolean z7 = false;
        r r1 = (v1 & 0x40) == 0 ? r0 : r.a;
        if((v1 & 0x800) == 0) {
            z7 = z6;
        }
        return y.t(context0, f0, ((v1 & 4) == 0 ? z : false), ((v1 & 8) == 0 ? z1 : false), ((v1 & 16) == 0 ? z2 : false), ((v1 & 0x20) == 0 ? v : 0), r1, ((v1 & 0x80) == 0 ? z3 : false), ((v1 & 0x100) == 0 ? float0 : null), ((v1 & 0x200) == 0 ? z4 : false), ((v1 & 0x400) == 0 ? z5 : false), z7);
    }
}

