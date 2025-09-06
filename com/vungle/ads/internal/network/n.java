package com.vungle.ads.internal.network;

import android.os.Build;
import kotlin.jvm.internal.L;
import y4.l;

public final class n {
    @l
    public static final n INSTANCE;
    @l
    private static String headerUa;

    static {
        n n0 = new n();
        n.INSTANCE = n0;
        n.headerUa = n0.defaultHeader();
    }

    // 去混淆评级： 低(20)
    private final String defaultHeader() {
        return (L.g("Amazon", Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/") + "7.4.3";
    }

    @l
    public final String getHeaderUa() {
        return n.headerUa;
    }

    public final void reset() {
        n.headerUa = this.defaultHeader();
    }

    public final void setHeaderUa(@l String s) {
        L.p(s, "<set-?>");
        n.headerUa = s;
    }
}

