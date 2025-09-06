package com.igaworks.ssp.part.nativead.binder;

public class MobonViewBinder {
    public static class Builder {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;

        public Builder(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        public final MobonViewBinder build() {
            return new MobonViewBinder(this, null);
        }

        public final Builder descViewId(int v) {
            this.f = v;
            return this;
        }

        public final Builder logoImageViewId(int v) {
            this.d = v;
            return this;
        }

        public final Builder mainImageViewId(int v) {
            this.c = v;
            return this;
        }

        public final Builder priceViewId(int v) {
            this.g = v;
            return this;
        }

        public final Builder titleViewId(int v) {
            this.e = v;
            return this;
        }
    }

    static abstract class a {
    }

    public final int descViewId;
    public final int logoImageViewId;
    public final int mainImageViewId;
    public final int nativeAdUnitLayoutId;
    public final int nativeAdViewId;
    public final int priceViewId;
    public final int titleViewId;

    private MobonViewBinder(Builder mobonViewBinder$Builder0) {
        this.nativeAdViewId = mobonViewBinder$Builder0.a;
        this.nativeAdUnitLayoutId = mobonViewBinder$Builder0.b;
        this.mainImageViewId = mobonViewBinder$Builder0.c;
        this.logoImageViewId = mobonViewBinder$Builder0.d;
        this.titleViewId = mobonViewBinder$Builder0.e;
        this.descViewId = mobonViewBinder$Builder0.f;
        this.priceViewId = mobonViewBinder$Builder0.g;
    }

    MobonViewBinder(Builder mobonViewBinder$Builder0, a mobonViewBinder$a0) {
        this(mobonViewBinder$Builder0);
    }
}

