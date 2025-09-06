package com.unity3d.services.banners;

import android.content.Context;
import com.unity3d.services.core.misc.ViewUtilities;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.math.b;
import y4.l;
import z3.n;

public final class UnityBannerSize {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public final UnityBannerSize getDynamicSize(@l Context context0) {
            L.p(context0, "context");
            int v = b.L0(ViewUtilities.dpFromPx(context0, ((float)context0.getResources().getDisplayMetrics().widthPixels)));
            if(v >= this.getLeaderboard().getWidth()) {
                return this.getLeaderboard();
            }
            return v < this.getIabStandard().getWidth() ? this.getStandard() : this.getIabStandard();
        }

        @l
        public final UnityBannerSize getIabStandard() {
            return UnityBannerSize.iabStandard;
        }

        @l
        public final UnityBannerSize getLeaderboard() {
            return UnityBannerSize.leaderboard;
        }

        @l
        public final UnityBannerSize getStandard() {
            return UnityBannerSize.standard;
        }
    }

    @l
    public static final Companion Companion;
    private final int height;
    @l
    private static final UnityBannerSize iabStandard;
    @l
    private static final UnityBannerSize leaderboard;
    @l
    private static final UnityBannerSize standard;
    private final int width;

    static {
        UnityBannerSize.Companion = new Companion(null);
        UnityBannerSize.leaderboard = new UnityBannerSize(728, 90);
        UnityBannerSize.iabStandard = new UnityBannerSize(468, 60);
        UnityBannerSize.standard = new UnityBannerSize(320, 50);
    }

    public UnityBannerSize(int v, int v1) {
        this.width = v;
        this.height = v1;
    }

    @l
    @n
    public static final UnityBannerSize getDynamicSize(@l Context context0) {
        return UnityBannerSize.Companion.getDynamicSize(context0);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}

