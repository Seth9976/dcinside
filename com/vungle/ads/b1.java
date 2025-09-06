package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.k;
import com.vungle.ads.internal.model.m;
import com.vungle.ads.internal.util.y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.f;
import z3.n;

public final class b1 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @n
        public final b1 getAdSizeWithWidth(@l Context context0, int v) {
            L.p(context0, "context");
            int v1 = ((Number)y.INSTANCE.getDeviceWidthAndHeightWithOrientation(context0, 0).b()).intValue();
            if(v < 0) {
                v = 0;
            }
            b1 b10 = new b1(v, v1);
            if(b10.getWidth() == 0) {
                b10.setAdaptiveWidth$vungle_ads_release(true);
            }
            b10.setAdaptiveHeight$vungle_ads_release(true);
            return b10;
        }

        @l
        @n
        public final b1 getAdSizeWithWidthAndHeight(int v, int v1) {
            if(v < 0) {
                v = 0;
            }
            if(v1 < 0) {
                v1 = 0;
            }
            b1 b10 = new b1(v, v1);
            if(b10.getWidth() == 0) {
                b10.setAdaptiveWidth$vungle_ads_release(true);
            }
            if(b10.getHeight() == 0) {
                b10.setAdaptiveHeight$vungle_ads_release(true);
            }
            return b10;
        }

        @l
        @n
        public final b1 getAdSizeWithWidthAndMaxHeight(int v, int v1) {
            if(v < 0) {
                v = 0;
            }
            if(v1 < 0) {
                v1 = 0;
            }
            b1 b10 = new b1(v, v1);
            if(b10.getWidth() == 0) {
                b10.setAdaptiveWidth$vungle_ads_release(true);
            }
            b10.setAdaptiveHeight$vungle_ads_release(true);
            return b10;
        }

        @l
        @n
        public final b1 getValidAdSizeFromSize(int v, int v1, @l String s) {
            L.p(s, "placementId");
            m m0 = k.INSTANCE.getPlacement(s);
            if(m0 != null) {
                if(!m0.isInline()) {
                    m0 = null;
                }
                if(m0 != null) {
                    return b1.Companion.getAdSizeWithWidthAndHeight(v, v1);
                }
            }
            b1 b10 = b1.MREC;
            if(v >= b10.getWidth() && v1 >= b10.getHeight()) {
                return b10;
            }
            b1 b11 = b1.BANNER_LEADERBOARD;
            if(v >= b11.getWidth() && v1 >= b11.getHeight()) {
                return b11;
            }
            b1 b12 = b1.BANNER;
            if(v >= b12.getWidth() && v1 >= b12.getHeight()) {
                return b12;
            }
            return v < b1.BANNER_SHORT.getWidth() || v1 < b1.BANNER_SHORT.getHeight() ? this.getAdSizeWithWidthAndHeight(v, v1) : b1.BANNER_SHORT;
        }
    }

    @l
    @f
    public static final b1 BANNER;
    @l
    @f
    public static final b1 BANNER_LEADERBOARD;
    @l
    @f
    public static final b1 BANNER_SHORT;
    @l
    public static final a Companion;
    @l
    @f
    public static final b1 MREC;
    private final int height;
    private boolean isAdaptiveHeight;
    private boolean isAdaptiveWidth;
    private final int width;

    static {
        b1.Companion = new a(null);
        b1.BANNER = new b1(320, 50);
        b1.BANNER_SHORT = new b1(300, 50);
        b1.BANNER_LEADERBOARD = new b1(728, 90);
        b1.MREC = new b1(300, 0xFA);
    }

    public b1(int v, int v1) {
        this.width = v;
        this.height = v1;
    }

    @l
    @n
    public static final b1 getAdSizeWithWidth(@l Context context0, int v) {
        return b1.Companion.getAdSizeWithWidth(context0, v);
    }

    @l
    @n
    public static final b1 getAdSizeWithWidthAndHeight(int v, int v1) {
        return b1.Companion.getAdSizeWithWidthAndHeight(v, v1);
    }

    @l
    @n
    public static final b1 getAdSizeWithWidthAndMaxHeight(int v, int v1) {
        return b1.Companion.getAdSizeWithWidthAndMaxHeight(v, v1);
    }

    public final int getHeight() {
        return this.height;
    }

    @l
    @n
    public static final b1 getValidAdSizeFromSize(int v, int v1, @l String s) {
        return b1.Companion.getValidAdSizeFromSize(v, v1, s);
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isAdaptiveHeight$vungle_ads_release() {
        return this.isAdaptiveHeight;
    }

    public final boolean isAdaptiveWidth$vungle_ads_release() {
        return this.isAdaptiveWidth;
    }

    public final boolean isValidSize$vungle_ads_release() {
        return this.width >= 0 && this.height >= 0;
    }

    public final void setAdaptiveHeight$vungle_ads_release(boolean z) {
        this.isAdaptiveHeight = z;
    }

    public final void setAdaptiveWidth$vungle_ads_release(boolean z) {
        this.isAdaptiveWidth = z;
    }

    @Override
    @l
    public String toString() {
        return "VungleAdSize(width=" + this.width + ", height=" + this.height + ')';
    }
}

