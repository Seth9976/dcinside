package com.igaworks.ssp.part.nativead.binder;

public class FacebookViewBinder {
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

        public final Builder adBodyViewId(int v) {
            this.f = v;
            return this;
        }

        public final Builder adChoicesLayoutId(int v) {
            this.h = v;
            return this;
        }

        public final Builder adIconViewId(int v) {
            this.c = v;
            return this;
        }

        public final FacebookViewBinder build() {
            return new FacebookViewBinder(this, null);
        }

        public final Builder callToActionId(int v) {
            this.g = v;
            return this;
        }

        public final Builder mediaViewId(int v) {
            this.d = v;
            return this;
        }

        public final Builder socialContextId(int v) {
            this.j = v;
            return this;
        }

        public final Builder sponsoredViewId(int v) {
            this.i = v;
            return this;
        }

        public final Builder titleViewId(int v) {
            this.e = v;
            return this;
        }
    }

    static abstract class a {
    }

    public final int adChoiceViewId;
    public final int adIconViewId;
    public final int bodyId;
    public final int callToActionId;
    public final int mediaViewId;
    public final int nativeAdUnitLayoutId;
    public final int nativeAdViewId;
    public final int socialContextViewId;
    public final int sponsoredViewId;
    public final int titleId;

    private FacebookViewBinder(Builder facebookViewBinder$Builder0) {
        this.nativeAdViewId = facebookViewBinder$Builder0.a;
        this.nativeAdUnitLayoutId = facebookViewBinder$Builder0.b;
        this.titleId = facebookViewBinder$Builder0.e;
        this.bodyId = facebookViewBinder$Builder0.f;
        this.mediaViewId = facebookViewBinder$Builder0.d;
        this.adIconViewId = facebookViewBinder$Builder0.c;
        this.callToActionId = facebookViewBinder$Builder0.g;
        this.adChoiceViewId = facebookViewBinder$Builder0.h;
        this.sponsoredViewId = facebookViewBinder$Builder0.i;
        this.socialContextViewId = facebookViewBinder$Builder0.j;
    }

    FacebookViewBinder(Builder facebookViewBinder$Builder0, a facebookViewBinder$a0) {
        this(facebookViewBinder$Builder0);
    }
}

