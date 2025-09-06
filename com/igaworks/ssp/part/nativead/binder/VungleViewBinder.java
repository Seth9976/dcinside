package com.igaworks.ssp.part.nativead.binder;

public class VungleViewBinder {
    public static class Builder {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;

        public Builder(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        public final Builder bodyViewId(int v) {
            this.i = v;
            return this;
        }

        public final VungleViewBinder build() {
            return new VungleViewBinder(this, null);
        }

        public final Builder ctaViewId(int v) {
            this.j = v;
            return this;
        }

        public final Builder iconViewId(int v) {
            this.e = v;
            return this;
        }

        public final Builder mediaViewId(int v) {
            this.g = v;
            return this;
        }

        public final Builder privacyIconPosition(int v) {
            this.h = v;
            return this;
        }

        public final Builder ratingViewId(int v) {
            this.f = v;
            return this;
        }

        public final Builder sponsoredByViewId(int v) {
            this.d = v;
            return this;
        }

        public final Builder titleViewId(int v) {
            this.c = v;
            return this;
        }
    }

    static abstract class a {
    }

    public final int bodyViewId;
    public final int ctaViewId;
    public final int iconViewId;
    public final int mediaViewId;
    public final int nativeAdUnitLayoutId;
    public final int nativeAdViewId;
    public final int privacyIconPosition;
    public final int ratingViewId;
    public final int sponsoredByViewId;
    public final int titleViewId;

    private VungleViewBinder(Builder vungleViewBinder$Builder0) {
        this.nativeAdViewId = vungleViewBinder$Builder0.a;
        this.nativeAdUnitLayoutId = vungleViewBinder$Builder0.b;
        this.titleViewId = vungleViewBinder$Builder0.c;
        this.sponsoredByViewId = vungleViewBinder$Builder0.d;
        this.iconViewId = vungleViewBinder$Builder0.e;
        this.ratingViewId = vungleViewBinder$Builder0.f;
        this.mediaViewId = vungleViewBinder$Builder0.g;
        this.bodyViewId = vungleViewBinder$Builder0.i;
        this.ctaViewId = vungleViewBinder$Builder0.j;
        this.privacyIconPosition = vungleViewBinder$Builder0.h;
    }

    VungleViewBinder(Builder vungleViewBinder$Builder0, a vungleViewBinder$a0) {
        this(vungleViewBinder$Builder0);
    }
}

