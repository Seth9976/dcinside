package com.unity3d.scar.adapter.common.signals;

import android.content.Context;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class e implements c {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[P2.e.values().length];
            a.a = arr_v;
            try {
                arr_v[P2.e.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[P2.e.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[P2.e.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    class b implements Runnable {
        private com.unity3d.scar.adapter.common.signals.b a;
        private f b;
        final e c;

        public b(com.unity3d.scar.adapter.common.signals.b b0, f f0) {
            this.a = b0;
            this.b = f0;
        }

        @Override
        public void run() {
            Map map0 = this.b.c();
            if(map0.size() > 0) {
                JSONObject jSONObject0 = new JSONObject(map0);
                this.a.onSignalsCollected(jSONObject0.toString());
                return;
            }
            if(this.b.b() == null) {
                this.a.onSignalsCollected("");
                return;
            }
            this.a.onSignalsCollectionFailed(this.b.b());
        }
    }

    public static final String a = "gmaScarBiddingRewardedSignal";
    public static final String b = "gmaScarBiddingInterstitialSignal";
    public static final String c = "gmaScarBiddingBannerSignal";

    @Override  // com.unity3d.scar.adapter.common.signals.c
    public void a(Context context0, String s, P2.e e0, com.unity3d.scar.adapter.common.signals.b b0) {
        com.unity3d.scar.adapter.common.a a0 = new com.unity3d.scar.adapter.common.a();
        f f0 = new f();
        a0.a();
        this.d(context0, s, e0, a0, f0);
        a0.c(new b(this, b0, f0));
    }

    @Override  // com.unity3d.scar.adapter.common.signals.c
    public void b(Context context0, boolean z, com.unity3d.scar.adapter.common.signals.b b0) {
        com.unity3d.scar.adapter.common.a a0 = new com.unity3d.scar.adapter.common.a();
        f f0 = new f();
        a0.a();
        this.e(context0, P2.e.a, a0, f0);
        a0.a();
        this.e(context0, P2.e.b, a0, f0);
        if(z) {
            a0.a();
            this.e(context0, P2.e.c, a0, f0);
        }
        a0.c(new b(this, b0, f0));
    }

    @Override  // com.unity3d.scar.adapter.common.signals.c
    public void c(Context context0, List list0, com.unity3d.scar.adapter.common.signals.b b0) {
        com.unity3d.scar.adapter.common.a a0 = new com.unity3d.scar.adapter.common.a();
        f f0 = new f();
        for(Object object0: list0) {
            a0.a();
            this.e(context0, ((P2.e)object0), a0, f0);
        }
        a0.c(new b(this, b0, f0));
    }

    public String f(P2.e e0) {
        switch(e0) {
            case 1: {
                return "gmaScarBiddingBannerSignal";
            }
            case 2: {
                return "gmaScarBiddingInterstitialSignal";
            }
            case 3: {
                return "gmaScarBiddingRewardedSignal";
            }
            default: {
                return "";
            }
        }
    }

    public void g(String s, com.unity3d.scar.adapter.common.a a0, f f0) {
        f0.d(String.format("Operation Not supported: %s.", s));
        a0.b();
    }
}

