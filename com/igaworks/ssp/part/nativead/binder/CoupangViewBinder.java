package com.igaworks.ssp.part.nativead.binder;

public class CoupangViewBinder {
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

        public final CoupangViewBinder build() {
            return new CoupangViewBinder(this, null);
        }

        public final Builder callToActionViewId(int v) {
            this.i = v;
            return this;
        }

        public final Builder deliverViewId(int v) {
            this.g = v;
            return this;
        }

        public final Builder logoViewId(int v) {
            this.c = v;
            return this;
        }

        public final Builder mainImageViewId(int v) {
            this.e = v;
            return this;
        }

        public final Builder optOutViewId(int v) {
            this.d = v;
            return this;
        }

        public final Builder priceViewId(int v) {
            this.j = v;
            return this;
        }

        public final Builder ratingViewId(int v) {
            this.h = v;
            return this;
        }

        public final Builder titleViewId(int v) {
            this.f = v;
            return this;
        }
    }

    static abstract class a {
    }

    public final int callToActionViewId;
    public final int deliverViewId;
    public final int logoViewId;
    public final int mainImageViewId;
    public final int nativeAdUnitLayoutId;
    public final int nativeAdViewId;
    public final int optOutViewId;
    public final int priceViewId;
    public final int ratingViewId;
    public final int titleViewId;

    private CoupangViewBinder(Builder coupangViewBinder$Builder0) {
        this.nativeAdViewId = coupangViewBinder$Builder0.a;
        this.nativeAdUnitLayoutId = coupangViewBinder$Builder0.b;
        this.logoViewId = coupangViewBinder$Builder0.c;
        this.optOutViewId = coupangViewBinder$Builder0.d;
        this.mainImageViewId = coupangViewBinder$Builder0.e;
        this.titleViewId = coupangViewBinder$Builder0.f;
        this.deliverViewId = coupangViewBinder$Builder0.g;
        this.ratingViewId = coupangViewBinder$Builder0.h;
        this.callToActionViewId = coupangViewBinder$Builder0.i;
        this.priceViewId = coupangViewBinder$Builder0.j;
    }

    CoupangViewBinder(Builder coupangViewBinder$Builder0, a coupangViewBinder$a0) {
        this(coupangViewBinder$Builder0);
    }
}

