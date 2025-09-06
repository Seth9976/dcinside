package com.igaworks.ssp.part.nativead.binder;

public class MintegralViewBinder {
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

        public final Builder adCallViewId(int v) {
            this.h = v;
            return this;
        }

        public final Builder adChoiceViewId(int v) {
            this.i = v;
            return this;
        }

        public final MintegralViewBinder build() {
            return new MintegralViewBinder(this, null);
        }

        public final Builder descViewId(int v) {
            this.e = v;
            return this;
        }

        public final Builder iconViewId(int v) {
            this.g = v;
            return this;
        }

        public final Builder mainImageViewId(int v) {
            this.j = v;
            return this;
        }

        public final Builder mbMediaViewId(int v) {
            this.c = v;
            return this;
        }

        public final Builder ratingViewId(int v) {
            this.f = v;
            return this;
        }

        public final Builder titleViewId(int v) {
            this.d = v;
            return this;
        }
    }

    static abstract class a {
    }

    public final int adCallViewId;
    public final int adChoiceViewId;
    public final int descViewId;
    public final int iconViewId;
    public final int mainImageViewId;
    public final int mbMediaViewId;
    public final int nativeAdUnitLayoutId;
    public final int nativeAdViewId;
    public final int ratingViewId;
    public final int titleViewId;

    private MintegralViewBinder(Builder mintegralViewBinder$Builder0) {
        this.nativeAdViewId = mintegralViewBinder$Builder0.a;
        this.nativeAdUnitLayoutId = mintegralViewBinder$Builder0.b;
        this.mbMediaViewId = mintegralViewBinder$Builder0.c;
        this.titleViewId = mintegralViewBinder$Builder0.d;
        this.descViewId = mintegralViewBinder$Builder0.e;
        this.ratingViewId = mintegralViewBinder$Builder0.f;
        this.iconViewId = mintegralViewBinder$Builder0.g;
        this.adCallViewId = mintegralViewBinder$Builder0.h;
        this.adChoiceViewId = mintegralViewBinder$Builder0.i;
        this.mainImageViewId = mintegralViewBinder$Builder0.j;
    }

    MintegralViewBinder(Builder mintegralViewBinder$Builder0, a mintegralViewBinder$a0) {
        this(mintegralViewBinder$Builder0);
    }
}

