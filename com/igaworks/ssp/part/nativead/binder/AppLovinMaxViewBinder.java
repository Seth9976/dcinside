package com.igaworks.ssp.part.nativead.binder;

public class AppLovinMaxViewBinder {
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

        public Builder(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        public final Builder advertiserViewId(int v) {
            this.e = v;
            return this;
        }

        public final Builder bodyViewId(int v) {
            this.d = v;
            return this;
        }

        public final AppLovinMaxViewBinder build() {
            return new AppLovinMaxViewBinder(this, null);
        }

        public final Builder ctaViewId(int v) {
            this.i = v;
            return this;
        }

        public final Builder iconViewId(int v) {
            this.f = v;
            return this;
        }

        public final Builder mediaViewId(int v) {
            this.g = v;
            return this;
        }

        public final Builder optionViewId(int v) {
            this.h = v;
            return this;
        }

        public final Builder titleViewId(int v) {
            this.c = v;
            return this;
        }
    }

    static abstract class a {
    }

    public final int advertiserViewId;
    public final int bodyViewId;
    public final int ctaViewId;
    public final int iconViewId;
    public final int mediaViewId;
    public final int nativeAdUnitLayoutId;
    public final int nativeAdViewId;
    public final int optionViewId;
    public final int titleViewId;

    private AppLovinMaxViewBinder(Builder appLovinMaxViewBinder$Builder0) {
        this.nativeAdViewId = appLovinMaxViewBinder$Builder0.a;
        this.nativeAdUnitLayoutId = appLovinMaxViewBinder$Builder0.b;
        this.titleViewId = appLovinMaxViewBinder$Builder0.c;
        this.bodyViewId = appLovinMaxViewBinder$Builder0.d;
        this.advertiserViewId = appLovinMaxViewBinder$Builder0.e;
        this.iconViewId = appLovinMaxViewBinder$Builder0.f;
        this.mediaViewId = appLovinMaxViewBinder$Builder0.g;
        this.optionViewId = appLovinMaxViewBinder$Builder0.h;
        this.ctaViewId = appLovinMaxViewBinder$Builder0.i;
    }

    AppLovinMaxViewBinder(Builder appLovinMaxViewBinder$Builder0, a appLovinMaxViewBinder$a0) {
        this(appLovinMaxViewBinder$Builder0);
    }
}

