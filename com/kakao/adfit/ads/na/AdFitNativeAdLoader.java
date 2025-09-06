package com.kakao.adfit.ads.na;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.UiThread;
import com.kakao.adfit.m.A;
import com.kakao.adfit.m.s;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import z3.n;

@s
public abstract class AdFitNativeAdLoader {
    @s
    public interface AdLoadListener {
        @UiThread
        void onAdLoadError(int arg1);

        @UiThread
        void onAdLoaded(@l AdFitNativeAdBinder arg1);
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @s
        @l
        @n
        public final AdFitNativeAdLoader create(@l Context context0, @l String s) {
            L.p(context0, "context");
            L.p(s, "adUnitId");
            if(!L.g(Looper.myLooper(), Looper.getMainLooper())) {
                throw new RuntimeException("Must be called from the main thread.");
            }
            Context context1 = context0.getApplicationContext();
            if(context1 == null) {
                throw new IllegalStateException("Can\'t create AdFitNativeAdLoader before onCreate call.");
            }
            if(v.x3(s)) {
                throw new IllegalArgumentException("Can\'t create AdFitNativeAdLoader with blank adUnitId.");
            }
            A.a.b(context1);
            return c.h.a(context0, s);
        }
    }

    @l
    public static final Companion Companion;

    static {
        AdFitNativeAdLoader.Companion = new Companion(null);
    }

    @s
    @l
    @n
    public static final AdFitNativeAdLoader create(@l Context context0, @l String s) {
        return AdFitNativeAdLoader.Companion.create(context0, s);
    }

    public abstract boolean isLoading();

    @UiThread
    public abstract boolean loadAd(@l AdFitNativeAdRequest arg1, @l AdLoadListener arg2);
}

