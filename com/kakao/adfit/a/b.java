package com.kakao.adfit.a;

import android.content.Context;
import android.os.Bundle;
import com.kakao.adfit.ads.AdListener;
import com.kakao.adfit.common.matrix.c;
import java.util.Map.Entry;
import java.util.Map;

public interface b {
    public static abstract class a {
        public static Bundle a(b b0) {
            if(b0.c().isEmpty()) {
                return null;
            }
            Bundle bundle0 = new Bundle();
            for(Object object0: b0.c().entrySet()) {
                bundle0.putString(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            return bundle0;
        }

        public static void a(b b0, int v) {
            c c0;
            try {
                c0 = c.a;
                AdListener adListener0 = b0.h();
                if(adListener0 != null) {
                    adListener0.onAdFailed(v);
                }
            }
            catch(Throwable throwable0) {
                throw c0.b(throwable0);
            }
        }

        public static void a(b b0, String s, String s1) {
            if(s == null) {
                return;
            }
            if(s1 != null) {
                b0.c().put(s, s1);
                return;
            }
            b0.c().remove(s);
        }

        public static void b(b b0) {
            c c0;
            try {
                c0 = c.a;
                AdListener adListener0 = b0.h();
                if(adListener0 != null) {
                    adListener0.onAdClicked();
                }
            }
            catch(Throwable throwable0) {
                throw c0.b(throwable0);
            }
        }

        public static void c(b b0) {
            c c0;
            try {
                c0 = c.a;
                AdListener adListener0 = b0.h();
                if(adListener0 != null) {
                    adListener0.onAdLoaded();
                }
            }
            catch(Throwable throwable0) {
                throw c0.b(throwable0);
            }
        }
    }

    int a();

    String b();

    Map c();

    long d();

    A3.a e();

    String f();

    String g();

    Context getContext();

    AdListener h();

    boolean i();
}

