package com.igaworks.ssp.part.nativead.binder;

public class GAMViewBinder {
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

        public final GAMViewBinder build() {
            return new GAMViewBinder(this, null);
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

    private GAMViewBinder(Builder gAMViewBinder$Builder0) {
        this.nativeAdViewId = gAMViewBinder$Builder0.a;
        this.nativeAdUnitLayoutId = gAMViewBinder$Builder0.b;
        this.mediaViewId = gAMViewBinder$Builder0.c;
        this.headlineViewId = gAMViewBinder$Builder0.d;
        this.bodyViewId = gAMViewBinder$Builder0.e;
        this.callToActionId = gAMViewBinder$Builder0.f;
        this.iconViewId = gAMViewBinder$Builder0.g;
        this.priceViewId = gAMViewBinder$Builder0.h;
        this.starRatingViewId = gAMViewBinder$Builder0.i;
        this.storeViewId = gAMViewBinder$Builder0.j;
        this.advertiserViewId = gAMViewBinder$Builder0.k;
    }

    GAMViewBinder(Builder gAMViewBinder$Builder0, a gAMViewBinder$a0) {
        this(gAMViewBinder$Builder0);
    }
}

