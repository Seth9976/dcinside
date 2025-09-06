package com.kakao.adfit.ads.na;

import com.kakao.adfit.m.s;
import kotlin.jvm.internal.w;
import y4.l;

@s
public enum AdFitVideoAutoPlayPolicy {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @s
        @l
        public final AdFitVideoAutoPlayPolicy default() {
            return AdFitVideoAutoPlayPolicy.WIFI_ONLY;
        }
    }

    NONE,
    WIFI_ONLY,
    ALWAYS;

    @l
    public static final Companion Companion;

    static {
        AdFitVideoAutoPlayPolicy.Companion = new Companion(null);
    }

    private static final AdFitVideoAutoPlayPolicy[] a() [...] // Inlined contents
}

