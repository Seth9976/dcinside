package com.unity3d.scar.adapter.v2100.signals;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.signals.c;
import com.unity3d.scar.adapter.common.signals.d;
import com.unity3d.scar.adapter.common.signals.e;
import com.unity3d.scar.adapter.common.signals.f;

public class b extends e implements c {
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

    private Q2.a d;

    public b(Q2.a a0) {
        this.d = a0;
    }

    @Override  // com.unity3d.scar.adapter.common.signals.c
    public void d(Context context0, String s, P2.e e0, com.unity3d.scar.adapter.common.a a0, f f0) {
        QueryInfo.generate(context0, this.h(e0), this.d.a(), new com.unity3d.scar.adapter.v2100.signals.a(s, new d(a0, f0)));
    }

    @Override  // com.unity3d.scar.adapter.common.signals.c
    public void e(Context context0, P2.e e0, com.unity3d.scar.adapter.common.a a0, f f0) {
        this.d(context0, this.f(e0), e0, a0, f0);
    }

    public AdFormat h(P2.e e0) {
        switch(e0) {
            case 1: {
                return AdFormat.BANNER;
            }
            case 2: {
                return AdFormat.INTERSTITIAL;
            }
            case 3: {
                return AdFormat.REWARDED;
            }
            default: {
                return AdFormat.UNKNOWN;
            }
        }
    }
}

