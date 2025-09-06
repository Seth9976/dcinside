package com.dcinside.app.backup.process;

import android.content.Context;
import com.dcinside.app.Application;
import com.dcinside.app.read.P0;
import com.dcinside.app.realm.o.a;
import com.dcinside.app.realm.o;
import com.dcinside.app.realm.r;
import com.dcinside.app.type.J;
import com.dcinside.app.type.P;
import com.dcinside.app.type.g;
import com.dcinside.app.type.j;
import com.dcinside.app.type.k;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.ll;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlin.text.v;
import y4.l;

@s0({"SMAP\nBackupSettingLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackupSettingLink.kt\ncom/dcinside/app/backup/process/BackupSettingLink\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,295:1\n1557#2:296\n1628#2,3:297\n774#2:300\n865#2,2:301\n*S KotlinDebug\n*F\n+ 1 BackupSettingLink.kt\ncom/dcinside/app/backup/process/BackupSettingLink\n*L\n291#1:296\n291#1:297,3\n292#1:300\n292#1:301,2\n*E\n"})
public final class e {
    @l
    public static final e a;

    static {
        e.a = new e();
    }

    @l
    public final List a() {
        String s6;
        String s5;
        String s4;
        String s3;
        String s2;
        HashMap hashMap0 = new HashMap();
        hashMap0.put("push_setting_reply", String.valueOf(ll.d0()));
        hashMap0.put("push_setting_type", String.valueOf(ll.W()));
        dl dl0 = dl.a;
        hashMap0.put("push_setting_touch_mode", String.valueOf(dl0.x1()));
        hashMap0.put("push_setting_contents_mode", String.valueOf(dl0.u1()));
        hashMap0.put("push_setting_menu_new", String.valueOf(dl0.v2()));
        Context context0 = Application.e.c();
        String s = o.h.h(context0);
        r r0 = a.g(o.h, "__DC_GLOBAL_DEF_IMAGE_ID", s, false, 4, null).S5();
        boolean z = false;
        hashMap0.put("write_setting_enable", String.valueOf(r0 != null && r0.S5()));
        String s1 = "";
        if(r0 == null) {
            s2 = "";
        }
        else {
            s2 = r0.T5();
            if(s2 == null) {
                s2 = "";
            }
        }
        hashMap0.put("write_setting_header", s2);
        if(r0 == null) {
            s3 = "";
        }
        else {
            s3 = r0.V5();
            if(s3 == null) {
                s3 = "";
            }
        }
        hashMap0.put("write_setting_footer", s3);
        if(r0 == null) {
            s4 = "";
        }
        else {
            s4 = r0.U5();
            if(s4 == null) {
                s4 = "";
            }
        }
        hashMap0.put("write_setting_header_color", s4);
        if(r0 == null) {
            s5 = "";
        }
        else {
            s5 = r0.W5();
            if(s5 == null) {
                s5 = "";
            }
        }
        hashMap0.put("write_setting_footer_color", s5);
        if(r0 != null && r0.Q5()) {
            z = true;
        }
        hashMap0.put("reply_setting_enable", String.valueOf(z));
        if(r0 == null) {
            s6 = "";
        }
        else {
            s6 = r0.R5();
            if(s6 == null) {
                s6 = "";
            }
        }
        hashMap0.put("reply_setting_suffix", s6);
        hashMap0.put("read_setting_size_reply", String.valueOf(dl0.V1().d()));
        hashMap0.put("read_setting_size_list", String.valueOf(dl0.Q0().d()));
        hashMap0.put("read_setting_size_read", String.valueOf(dl0.M1().c()));
        hashMap0.put("screen_setting_theme", String.valueOf(dl0.q2().ordinal()));
        hashMap0.put("screen_setting_split_ratio", String.valueOf(dl0.i2()));
        hashMap0.put("screen_setting_split", String.valueOf(dl0.S2()));
        hashMap0.put("screen_setting_status", String.valueOf(ll.x()));
        hashMap0.put("screen_setting_slide", String.valueOf(dl0.b2()));
        hashMap0.put("screen_setting_sensitivity", String.valueOf(dl0.n2()));
        hashMap0.put("read_setting_hide_count", String.valueOf(ll.a0()));
        hashMap0.put("read_setting_read_log", String.valueOf(dl0.H1()));
        hashMap0.put("read_setting_hide_mobile", String.valueOf(dl0.v0()));
        hashMap0.put("read_setting_fix_size", String.valueOf(dl0.d0()));
        hashMap0.put("read_setting_best_post", String.valueOf(dl0.D1()));
        hashMap0.put("read_setting_gif_mode", String.valueOf(dl0.k0()));
        hashMap0.put("reply_input_hint_type", String.valueOf(dl0.U1().c()));
        hashMap0.put("is_write_change_login_enable", String.valueOf(dl0.a3()));
        hashMap0.put("reply_nick_color", String.valueOf(dl0.p1()));
        hashMap0.put("favorite_setting_count", String.valueOf(dl0.b0()));
        hashMap0.put("recent_setting_count", String.valueOf(dl0.N1()));
        hashMap0.put("backup_setting_auto_enable", String.valueOf(dl0.G()));
        hashMap0.put("read_setting_list_mode", String.valueOf(dl0.M0()));
        hashMap0.put("read_setting_list_mode2", String.valueOf(dl0.N0()));
        hashMap0.put("recent_save_from_search", String.valueOf(dl0.P1()));
        hashMap0.put("read_setting_spoiler_type", String.valueOf(dl0.k2()));
        hashMap0.put("reply_setting_broom_enable", String.valueOf(dl0.I()));
        hashMap0.put("reply_setting_broom_type", String.valueOf(dl0.Z2()));
        hashMap0.put("reply_setting_broom_type_enable", String.valueOf(dl0.Z()));
        String s7 = dl0.E2();
        if(s7 != null) {
            s1 = s7;
        }
        hashMap0.put("reply_setting_broom_words", s1);
        hashMap0.put("reply_setting_broom_words_enable", String.valueOf(dl0.a0()));
        hashMap0.put("read_setting_img_note_display_option", String.valueOf(dl0.G1()));
        return u.k(new V.r("settings", hashMap0));
    }

    public final void b(@l V.r r0, boolean z) {
        L.p(r0, "data");
        if(L.g(r0.a(), "settings")) {
            this.c(r0.b(), z);
        }
    }

    private final void c(Map map0, boolean z) {
        int v = 0;
        if(z) {
            String s = (String)map0.get("push_setting_reply");
            if(s != null) {
                ll.c0(Boolean.parseBoolean(s));
            }
            String s1 = (String)map0.get("push_setting_type");
            if(s1 != null) {
                ll.X(Integer.parseInt(s1));
            }
            String s2 = (String)map0.get("push_setting_touch_mode");
            if(s2 != null) {
                int v1 = Integer.parseInt(s2);
                dl.a.n5(v1);
            }
            String s3 = (String)map0.get("push_setting_contents_mode");
            if(s3 != null) {
                int v2 = Integer.parseInt(s3);
                dl.a.k5(v2);
            }
            String s4 = (String)map0.get("push_setting_menu_new");
            if(s4 != null) {
                dl.a.j6(Boolean.parseBoolean(s4));
            }
            a o$a0 = o.h;
            String s5 = o$a0.h(Application.e.c());
            r r0 = new r();
            String s6 = (String)map0.get("write_setting_enable");
            r0.Z5((s6 == null ? false : Boolean.parseBoolean(s6)));
            String s7 = (String)map0.get("write_setting_header");
            String s8 = "";
            if(s7 == null) {
                s7 = "";
            }
            r0.a6(s7);
            String s9 = (String)map0.get("write_setting_footer");
            if(s9 == null) {
                s9 = "";
            }
            r0.c6(s9);
            String s10 = (String)map0.get("write_setting_header_color");
            if(s10 == null) {
                s10 = "";
            }
            r0.b6(s10);
            String s11 = (String)map0.get("write_setting_footer_color");
            if(s11 == null) {
                s11 = "";
            }
            r0.d6(s11);
            String s12 = (String)map0.get("reply_setting_enable");
            r0.X5((s12 == null ? false : Boolean.parseBoolean(s12)));
            String s13 = (String)map0.get("reply_setting_suffix");
            if(s13 != null) {
                s8 = s13;
            }
            r0.Y5(s8);
            a.n(o$a0, "__DC_GLOBAL_DEF_IMAGE_ID", s5, r0, false, 8, null);
            String s14 = (String)map0.get("read_setting_size_reply");
            if(s14 != null) {
                int v3 = Integer.parseInt(s14);
                j j0 = j.d.a(v3);
                dl.a.H5(j0);
            }
            String s15 = (String)map0.get("read_setting_size_list");
            if(s15 != null) {
                int v4 = Integer.parseInt(s15);
                j j1 = j.d.a(v4);
                dl.a.I4(j1);
            }
            String s16 = (String)map0.get("read_setting_size_read");
            if(s16 != null) {
                int v5 = Integer.parseInt(s16);
                k k0 = k.c.a(v5);
                dl.a.z5(k0);
            }
            String s17 = (String)map0.get("screen_setting_theme");
            if(s17 != null) {
                int v6 = Integer.parseInt(s17);
                if(g.a.c(v6).m()) {
                    dl.a.h6(P.d);
                    dl.a.f6(v6);
                }
                else {
                    dl.a.h6(P.c);
                    dl.a.g6(v6);
                }
            }
            String s18 = (String)map0.get("screen_setting_split_ratio");
            if(s18 != null) {
                int v7 = Integer.parseInt(s18);
                int v8 = J.b.a(v7).c();
                dl.a.Y5(v8);
            }
            String s19 = (String)map0.get("screen_setting_split");
            if(s19 != null) {
                dl.a.T5(Boolean.parseBoolean(s19));
            }
            String s20 = (String)map0.get("screen_setting_status");
            if(s20 != null) {
                ll.y0(Boolean.parseBoolean(s20));
            }
            String s21 = (String)map0.get("screen_setting_slide");
            if(s21 != null) {
                dl.a.N5(Boolean.parseBoolean(s21));
            }
            String s22 = (String)map0.get("screen_setting_sensitivity");
            if(s22 != null) {
                int v9 = Integer.parseInt(s22);
                dl.a.c6(v9);
            }
            String s23 = (String)map0.get("read_setting_hide_count");
            int v10 = 5;
            if(s23 != null) {
                Long long0 = v.d1(s23);
                int v11 = 0x7FFFFFFF;
                if(long0 != null) {
                    if(((long)long0) <= 0L) {
                        v11 = 0;
                    }
                    else if(s.K0(new kotlin.ranges.l(1, 5), ((long)long0))) {
                        v11 = (int)(((long)long0));
                    }
                }
                ll.b0(v11);
            }
            String s24 = (String)map0.get("read_setting_read_log");
            if(s24 != null) {
                int v12 = Integer.parseInt(s24);
                dl.a.w5(v12);
            }
            String s25 = (String)map0.get("read_setting_hide_mobile");
            if(s25 != null) {
                dl.a.o4(Boolean.parseBoolean(s25));
            }
            String s26 = (String)map0.get("read_setting_fix_size");
            if(s26 != null) {
                dl.a.V3(Boolean.parseBoolean(s26));
            }
            String s27 = (String)map0.get("read_setting_best_post");
            if(s27 != null) {
                int v13 = Integer.parseInt(s27);
                dl.a.t5(v13);
            }
            String s28 = (String)map0.get("read_setting_gif_mode");
            if(s28 != null) {
                long v14 = Long.parseLong(s28);
                dl.a.c4(v14);
            }
            String s29 = (String)map0.get("reply_input_hint_type");
            if(s29 != null) {
                int v15 = Integer.parseInt(s29);
                P0 p00 = P0.b.a(v15);
                dl.a.G5(p00);
            }
            String s30 = (String)map0.get("is_write_change_login_enable");
            if(s30 != null) {
                dl.a.u6(Boolean.parseBoolean(s30));
            }
            String s31 = (String)map0.get("reply_nick_color");
            if(s31 != null) {
                dl.a.g5(Boolean.parseBoolean(s31));
            }
            String s32 = (String)map0.get("favorite_setting_count");
            if(s32 != null) {
                int v16 = Integer.parseInt(s32);
                dl.a.T3(v16);
            }
            String s33 = (String)map0.get("backup_setting_auto_enable");
            if(s33 != null) {
                dl.a.s3(Boolean.parseBoolean(s33));
                long v17 = TimeUnit.DAYS.toMillis(1L);
                dl.a.t3(System.currentTimeMillis() + v17);
            }
            String s34 = (String)map0.get("read_setting_list_mode");
            if(s34 != null) {
                Integer integer0 = v.b1(s34);
                dl.a.E4((integer0 == null ? 0 : ((int)integer0)));
            }
            String s35 = (String)map0.get("read_setting_list_mode2");
            if(s35 != null) {
                Integer integer1 = v.b1(s35);
                dl.a.F4((integer1 == null ? 0 : ((int)integer1)));
            }
            String s36 = (String)map0.get("recent_setting_count");
            if(s36 != null) {
                dl dl0 = dl.a;
                Integer integer2 = v.b1(s36);
                if(integer2 != null) {
                    v10 = (int)integer2;
                }
                dl0.A5(v10);
            }
            String s37 = (String)map0.get("recent_save_from_search");
            if(s37 != null) {
                dl.a.C5(Boolean.parseBoolean(s37));
            }
            String s38 = (String)map0.get("read_setting_spoiler_type");
            if(s38 != null) {
                int v18 = Integer.parseInt(s38);
                dl.a.a6(v18);
            }
            String s39 = (String)map0.get("reply_setting_broom_enable");
            if(s39 != null) {
                dl.a.u3(Boolean.parseBoolean(s39));
            }
            String s40 = (String)map0.get("reply_setting_broom_type");
            if(s40 != null) {
                dl.a.t6(Boolean.parseBoolean(s40));
            }
            String s41 = (String)map0.get("reply_setting_broom_type_enable");
            if(s41 != null) {
                dl.a.R3(Boolean.parseBoolean(s41));
            }
            String s42 = (String)map0.get("reply_setting_broom_words_enable");
            if(s42 != null) {
                dl.a.S3(Boolean.parseBoolean(s42));
            }
        }
        String s43 = (String)map0.get("reply_setting_broom_words");
        if(s43 != null) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if(!z) {
                String s44 = dl.a.E2();
                if(s44 != null && s44.length() != 0) {
                    stringBuilder0.append(s44);
                }
            }
            if(stringBuilder0.length() > 0) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(s43);
            ArrayList arrayList0 = new ArrayList();
            String s45 = stringBuilder0.toString();
            L.o(s45, "toString(...)");
            for(Object object0: e.a.d(s45)) {
                String s46 = (String)object0;
                int v19 = s46.length();
                if(v + v19 <= 300 && !arrayList0.contains(s46)) {
                    arrayList0.add(s46);
                    v += v19 + 1;
                }
            }
            if(arrayList0.isEmpty()) {
                dl.a.r6(null);
            }
            else {
                String s47 = u.m3(arrayList0, ",", null, null, 0, null, null, 62, null);
                dl.a.r6(s47);
            }
        }
        String s48 = (String)map0.get("read_setting_img_note_display_option");
        if(s48 != null) {
            int v20 = Integer.parseInt(s48);
            dl.a.v5(v20);
        }
    }

    private final List d(String s) {
        Iterable iterable0 = v.V4(v.l2(s, "\n", "", false, 4, null), new String[]{","}, false, 0, 6, null);
        ArrayList arrayList0 = new ArrayList(u.b0(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(v.G5(((String)object0)).toString());
        }
        List list0 = new ArrayList();
        for(Object object1: arrayList0) {
            if(((String)object1).length() > 0) {
                list0.add(object1);
            }
        }
        return list0;
    }
}

