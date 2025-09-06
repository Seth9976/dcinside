package com.igaworks.ssp.part.nativead.binder;

public class AdForusViewBinder {
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
        private int k;

        public Builder(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        public final Builder advertiserViewId(int v) {
            this.k = v;
            return this;
        }

        public final Builder bodyViewId(int v) {
            this.e = v;
            return this;
        }

        public final AdForusViewBinder build() {
            return new AdForusViewBinder(this, null);
        }

        public final Builder callToActionId(int v) {
            this.f = v;
            return this;
        }

        public final Builder headlineViewId(int v) {
            this.d = v;
            return this;
        }

        public final Builder iconViewId(int v) {
            this.g = v;
            return this;
        }

        public final Builder mediaViewId(int v) {
            this.c = v;
            return this;
        }

        public final Builder priceViewId(int v) {
            this.h = v;
            return this;
        }

        public final Builder starRatingViewId(int v) {
            this.i = v;
            return this;
        }

        public final Builder storeViewId(int v) {
            this.j = v;
            return this;
        }
    }

    static abstract class a {
    }

    public final int advertiserViewId;
    public final int bodyViewId;
    public final int callToActionId;
    public final int headlineViewId;
    public final int iconViewId;
    public final int mediaViewId;
    public final int nativeAdUnitLayoutId;
    public final int nativeAdViewId;
    public final int priceViewId;
    public final int starRatingViewId;
    public final int storeViewId;

    private AdForusViewBinder(Builder adForusViewBinder$Builder0) {
        this.nativeAdViewId = adForusViewBinder$Builder0.a;
        this.nativeAdUnitLayoutId = adForusViewBinder$Builder0.b;
        this.mediaViewId = adForusViewBinder$Builder0.c;
        this.headlineViewId = adForusViewBinder$Builder0.d;
        this.bodyViewId = adForusViewBinder$Builder0.e;
        this.callToActionId = adForusViewBinder$Builder0.f;
        this.iconViewId = adForusViewBinder$Builder0.g;
        this.priceViewId = adForusViewBinder$Builder0.h;
        this.starRatingViewId = adForusViewBinder$Builder0.i;
        this.storeViewId = adForusViewBinder$Builder0.j;
        this.advertiserViewId = adForusViewBinder$Builder0.k;
    }

    AdForusViewBinder(Builder adForusViewBinder$Builder0, a adForusViewBinder$a0) {
        this(adForusViewBinder$Builder0);
    }
}

