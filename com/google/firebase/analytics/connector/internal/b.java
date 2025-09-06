package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import com.google.common.collect.a3;
import com.google.firebase.analytics.connector.a.c;

public final class b {
    private static final a3 a;
    private static final O2 b;
    private static final O2 c;
    private static final O2 d;
    private static final O2 e;
    private static final O2 f;

    static {
        b.a = a3.H("_in", "_xa", "_xu", "_aq", "_aa", "_ai", new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"});
        b.b = O2.H("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
        b.c = O2.D("auto", "app", "am");
        b.d = O2.C("_r", "_dbg");
        b.e = new a().k(zzjj.zza).k(zzjj.zzb).n();
        b.f = O2.C("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static Bundle a(c a$c0) {
        Bundle bundle0 = new Bundle();
        String s = a$c0.a;
        if(s != null) {
            bundle0.putString("origin", s);
        }
        String s1 = a$c0.b;
        if(s1 != null) {
            bundle0.putString("name", s1);
        }
        Object object0 = a$c0.c;
        if(object0 != null) {
            zzjf.zza(bundle0, object0);
        }
        String s2 = a$c0.d;
        if(s2 != null) {
            bundle0.putString("trigger_event_name", s2);
        }
        bundle0.putLong("trigger_timeout", a$c0.e);
        String s3 = a$c0.f;
        if(s3 != null) {
            bundle0.putString("timed_out_event_name", s3);
        }
        Bundle bundle1 = a$c0.g;
        if(bundle1 != null) {
            bundle0.putBundle("timed_out_event_params", bundle1);
        }
        String s4 = a$c0.h;
        if(s4 != null) {
            bundle0.putString("triggered_event_name", s4);
        }
        Bundle bundle2 = a$c0.i;
        if(bundle2 != null) {
            bundle0.putBundle("triggered_event_params", bundle2);
        }
        bundle0.putLong("time_to_live", a$c0.j);
        String s5 = a$c0.k;
        if(s5 != null) {
            bundle0.putString("expired_event_name", s5);
        }
        Bundle bundle3 = a$c0.l;
        if(bundle3 != null) {
            bundle0.putBundle("expired_event_params", bundle3);
        }
        bundle0.putLong("creation_timestamp", a$c0.m);
        bundle0.putBoolean("active", a$c0.n);
        bundle0.putLong("triggered_timestamp", a$c0.o);
        return bundle0;
    }

    public static c b(Bundle bundle0) {
        Preconditions.checkNotNull(bundle0);
        c a$c0 = new c();
        a$c0.a = (String)Preconditions.checkNotNull(((String)zzjf.zza(bundle0, "origin", String.class, null)));
        a$c0.b = (String)Preconditions.checkNotNull(((String)zzjf.zza(bundle0, "name", String.class, null)));
        a$c0.c = zzjf.zza(bundle0, "value", Object.class, null);
        a$c0.d = (String)zzjf.zza(bundle0, "trigger_event_name", String.class, null);
        a$c0.e = (long)(((Long)zzjf.zza(bundle0, "trigger_timeout", Long.class, 0L)));
        a$c0.f = (String)zzjf.zza(bundle0, "timed_out_event_name", String.class, null);
        a$c0.g = (Bundle)zzjf.zza(bundle0, "timed_out_event_params", Bundle.class, null);
        a$c0.h = (String)zzjf.zza(bundle0, "triggered_event_name", String.class, null);
        a$c0.i = (Bundle)zzjf.zza(bundle0, "triggered_event_params", Bundle.class, null);
        a$c0.j = (long)(((Long)zzjf.zza(bundle0, "time_to_live", Long.class, 0L)));
        a$c0.k = (String)zzjf.zza(bundle0, "expired_event_name", String.class, null);
        a$c0.l = (Bundle)zzjf.zza(bundle0, "expired_event_params", Bundle.class, null);
        a$c0.n = ((Boolean)zzjf.zza(bundle0, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        a$c0.m = (long)(((Long)zzjf.zza(bundle0, "creation_timestamp", Long.class, 0L)));
        a$c0.o = (long)(((Long)zzjf.zza(bundle0, "triggered_timestamp", Long.class, 0L)));
        return a$c0;
    }

    public static String c(String s) {
        String s1 = zzji.zza(s);
        return s1 == null ? s : s1;
    }

    public static void d(String s, String s1, Bundle bundle0) {
        if("clx".equals(s) && "_ae".equals(s1)) {
            bundle0.putLong("_r", 1L);
        }
    }

    public static boolean e(String s, Bundle bundle0) {
        if(b.b.contains(s)) {
            return false;
        }
        if(bundle0 != null) {
            O2 o20 = b.d;
            int v = o20.size();
            int v1 = 0;
            while(v1 < v) {
                Object object0 = o20.get(v1);
                ++v1;
                if(bundle0.containsKey(((String)object0))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    public static boolean f(String s, String s1) {
        if(!"_ce1".equals(s1) && !"_ce2".equals(s1)) {
            if("_ln".equals(s1)) {
                return s.equals("fcm") || s.equals("fiam");
            }
            if(b.e.contains(s1)) {
                return false;
            }
            O2 o20 = b.f;
            int v = o20.size();
            int v1 = 0;
            while(v1 < v) {
                Object object0 = o20.get(v1);
                ++v1;
                if(s1.matches(((String)object0))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }
        return s.equals("fcm") || s.equals("frc");
    }

    public static String g(String s) {
        String s1 = zzji.zzb(s);
        return s1 == null ? s : s1;
    }

    public static boolean h(c a$c0) {
        if(a$c0 == null) {
            return false;
        }
        String s = a$c0.a;
        if(s == null || s.isEmpty() || a$c0.c != null && zzlh.zza(a$c0.c) == null) {
            return false;
        }
        if(!b.m(s)) {
            return false;
        }
        if(!b.f(s, a$c0.b)) {
            return false;
        }
        String s1 = a$c0.k;
        if(s1 != null) {
            if(!b.e(s1, a$c0.l)) {
                return false;
            }
            if(!b.i(s, a$c0.k, a$c0.l)) {
                return false;
            }
        }
        String s2 = a$c0.h;
        if(s2 != null) {
            if(!b.e(s2, a$c0.i)) {
                return false;
            }
            if(!b.i(s, a$c0.h, a$c0.i)) {
                return false;
            }
        }
        String s3 = a$c0.f;
        if(s3 != null) {
            return b.e(s3, a$c0.g) ? b.i(s, a$c0.f, a$c0.g) : false;
        }
        return true;
    }

    public static boolean i(String s, String s1, Bundle bundle0) {
        if(!"_cmp".equals(s1)) {
            return true;
        }
        if(!b.m(s)) {
            return false;
        }
        if(bundle0 == null) {
            return false;
        }
        O2 o20 = b.d;
        int v = o20.size();
        int v1 = 0;
        while(v1 < v) {
            Object object0 = o20.get(v1);
            ++v1;
            if(bundle0.containsKey(((String)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        s.hashCode();
        switch(s) {
            case "fcm": {
                bundle0.putString("_cis", "fcm_integration");
                return true;
            }
            case "fdl": {
                bundle0.putString("_cis", "fdl_integration");
                return true;
            }
            case "fiam": {
                bundle0.putString("_cis", "fiam_integration");
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static boolean j(String s) {
        if(s == null) {
            return false;
        }
        if(s.length() == 0) {
            return false;
        }
        int v = s.codePointAt(0);
        if(!Character.isLetter(v) && v != 0x5F) {
            return false;
        }
        int v1 = s.length();
        for(int v2 = Character.charCount(v); v2 < v1; v2 += Character.charCount(v3)) {
            int v3 = s.codePointAt(v2);
            if(v3 != 0x5F && !Character.isLetterOrDigit(v3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(String s) {
        if(s == null) {
            return false;
        }
        if(s.length() == 0) {
            return false;
        }
        int v = s.codePointAt(0);
        if(!Character.isLetter(v)) {
            return false;
        }
        int v1 = s.length();
        for(int v2 = Character.charCount(v); v2 < v1; v2 += Character.charCount(v3)) {
            int v3 = s.codePointAt(v2);
            if(v3 != 0x5F && !Character.isLetterOrDigit(v3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean l(String s) {
        return !b.a.contains(s);
    }

    public static boolean m(String s) {
        return !b.c.contains(s);
    }
}

