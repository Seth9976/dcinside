package com.fsn.cauly.Y;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;

public class i0 {
    public static enum a {
        Banner,
        Interstitial,
        Native,
        Close,
        Icon,
        Custom,
        Multi,
        Video;

    }

    public static enum b {
        all,
        age10,
        age20,
        age30,
        age40,
        age50;

    }

    public static enum c {
        Fixed,
        Proportional,
        @Deprecated
        Fixed_50,
        Square,
        Adaptive;

    }

    public static enum d {
        None,
        LeftSlide,
        RightSlide,
        TopSlide,
        BottomSlide,
        FadeIn,
        Circle;

    }

    public static enum e {
        all,
        male,
        female;

    }

    public String A;
    public String B;
    public HashMap C;
    public boolean D;
    public boolean E;
    public boolean F;
    public String G;
    public String H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;
    public boolean M;
    public String N;
    public String O;
    public int P;
    public boolean Q;
    public long R;
    public String S;
    public String T;
    public int U;
    public int V;
    public String W;
    public long X;
    public a a;
    public Context b;
    public Object c;
    Object d;
    Method e;
    public String f;
    public e g;
    public b h;
    public boolean i;
    public String j;
    public boolean k;
    public d l;
    public String m;
    public boolean n;
    public int o;
    public int p;
    public c q;
    public l0 r;
    public boolean s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public String y;
    public String z;

    public i0() {
        this.i = false;
        this.j = null;
        this.k = false;
        this.w = true;
        this.x = false;
        this.D = false;
        this.E = true;
        this.F = false;
        this.M = false;
        this.Q = true;
        this.R = 0L;
        this.U = 0;
        this.V = 0;
    }

    // 去混淆评级： 低(20)
    b a(String s) {
        return s.equals("all") ? b.a : b.valueOf(s);
    }

    public Object a() {
        return this.c == null ? null : this.c;
    }

    public void a(int v, Object object0, Object object1) {
        Object object2 = this.d;
        if(object2 == null) {
            return;
        }
        try {
            this.e.invoke(object2, v, object0, object1);
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
    }

    public void a(HashMap hashMap0) {
        this.C = hashMap0;
        this.f = (String)hashMap0.get("appcode");
        this.g = this.c(((String)hashMap0.get("gender")));
        this.h = this.a(((String)hashMap0.get("age")));
        this.i = ((Boolean)hashMap0.get("coppa")).booleanValue();
        this.j = (String)hashMap0.get("userTargetBrowser");
        this.k = ((Boolean)hashMap0.get("gdpr_consent")).booleanValue();
        this.l = this.b(((String)hashMap0.get("effect")));
        this.m = (String)hashMap0.get("provider");
        if(TextUtils.isEmpty(((String)hashMap0.get("bannerViewClass")))) {
            this.n = ((Boolean)hashMap0.get("dynamicReloadInterval")).booleanValue();
        }
        else if(((String)hashMap0.get("bannerViewClass")).equalsIgnoreCase("CaulyAdBannerView")) {
            this.n = false;
        }
        this.o = (int)(((Integer)hashMap0.get("reloadInterval")));
        a[] arr_i0$a = a.values();
        this.a = arr_i0$a[((int)(((Integer)hashMap0.get("adType"))))];
        this.p = hashMap0.containsKey("priority") ? ((int)(((Integer)hashMap0.get("priority")))) : Thread.currentThread().getPriority();
        this.q = hashMap0.containsKey("bannerHeight") ? c.valueOf(((String)hashMap0.get("bannerHeight"))) : c.a;
        if(hashMap0.containsKey("keyword")) {
            this.y = (String)hashMap0.get("keyword");
        }
        if(hashMap0.containsKey("leftText")) {
            this.z = (String)hashMap0.get("leftText");
        }
        if(hashMap0.containsKey("rightText")) {
            this.A = (String)hashMap0.get("rightText");
        }
        if(hashMap0.containsKey("descriptionText")) {
            this.B = (String)hashMap0.get("descriptionText");
        }
        if(hashMap0.containsKey("main_image_orientation")) {
            this.E = ((int)(((Integer)hashMap0.get("main_image_orientation")))) == 0;
        }
        if(hashMap0.containsKey("enable_default_ad")) {
            this.F = ((Boolean)hashMap0.get("enable_default_ad")).booleanValue();
        }
        if(hashMap0.containsKey("ad_ratio")) {
            this.G = (String)hashMap0.get("ad_ratio");
        }
        if(hashMap0.containsKey("is_test")) {
            this.J = ((Boolean)hashMap0.get("is_test")).booleanValue();
        }
        if(hashMap0.containsKey("ad_count")) {
            this.I = (int)(((Integer)hashMap0.get("ad_count")));
        }
        if(hashMap0.containsKey("spread_on")) {
            this.K = ((Boolean)hashMap0.get("spread_on")).booleanValue();
        }
        if(hashMap0.containsKey("timeout_sec")) {
            this.L = (int)(((Integer)hashMap0.get("timeout_sec")));
        }
        if(hashMap0.containsKey("enable_lock")) {
            this.M = ((Boolean)hashMap0.get("enable_lock")).booleanValue();
        }
        com.fsn.cauly.blackdragoncore.e.a().a(this);
        if(hashMap0.containsKey("sdk_viewtype")) {
            this.N = (String)hashMap0.get("sdk_viewtype");
        }
        if(hashMap0.containsKey("custom_instl")) {
            this.O = (String)hashMap0.get("custom_instl");
        }
        if(!(this.b instanceof Activity)) {
            m0.c = "native-nona";
        }
        if(hashMap0.containsKey("banner_corner_round")) {
            this.P = (int)(((Integer)hashMap0.get("banner_corner_round")));
        }
        if(hashMap0.containsKey("banner_interval")) {
            if(TextUtils.isEmpty(((String)hashMap0.get("bannerViewClass")))) {
                this.Q = ((Boolean)hashMap0.get("banner_interval")).booleanValue();
            }
            else if(((String)hashMap0.get("bannerViewClass")).equalsIgnoreCase("CaulyAdBannerView")) {
                this.Q = false;
            }
        }
        if(hashMap0.containsKey("banner_customSize_x")) {
            this.U = Integer.parseInt(((String)hashMap0.get("banner_customSize_x")));
        }
        if(hashMap0.containsKey("banner_customSize_y")) {
            this.V = Integer.parseInt(((String)hashMap0.get("banner_customSize_y")));
        }
        if(hashMap0.containsKey("ad_dim")) {
            if(this.U > 0 && this.V > 0) {
                this.H = this.U + "x" + this.V;
                return;
            }
            this.H = (String)hashMap0.get("ad_dim");
        }
    }

    public boolean a(Object object0, Object object1) {
        this.d = object0;
        this.c = object1 instanceof WeakReference ? ((WeakReference)object1).get() : object1;
        try {
            this.e = this.d.getClass().getMethod("receiveMessage", Integer.TYPE, Object.class, Object.class);
            return true;
        }
        catch(NoSuchMethodException unused_ex) {
            this.e();
            return false;
        }
    }

    d b(String s) {
        return d.valueOf(s);
    }

    public void b() {
        if(this.t >= 0x7FFFFFFE || this.u >= 0x7FFFFFFE) {
            this.t = 0;
            this.u = 0;
        }
        ++this.t;
        ++this.u;
    }

    e c(String s) {
        return e.valueOf(s);
    }

    public void c() {
        this.s = true;
    }

    public void d() {
        this.s = false;
    }

    public void e() {
        this.s = true;
    }
}

