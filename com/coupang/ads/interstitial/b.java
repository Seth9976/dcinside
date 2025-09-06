package com.coupang.ads.interstitial;

import J.f;
import kotlin.jvm.internal.L;
import y4.l;

public interface b {
    public static final class a {
        public static void a(@l b b0) {
            L.p(b0, "this");
        }

        public static void b(@l b b0, @l com.coupang.ads.b b1) {
            L.p(b0, "this");
            L.p(b1, "e");
        }

        public static void c(@l b b0) {
            L.p(b0, "this");
        }

        public static boolean d(@l b b0, @l f f0) {
            L.p(b0, "this");
            L.p(f0, "typeAds");
            return false;
        }
    }

    void onAdDismissed();

    void onAdFailedToShow(@l com.coupang.ads.b arg1);

    void onAdShowed();

    boolean onClick(@l f arg1);
}

