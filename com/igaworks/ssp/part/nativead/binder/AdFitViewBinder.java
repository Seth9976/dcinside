package com.igaworks.ssp.part.nativead.binder;

public class AdFitViewBinder {
    public static class Builder {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private boolean i;
        private boolean j;

        public Builder(int v) {
            this.j = false;
            this.a = v;
        }

        public Builder(int v, int v1) {
            this.j = false;
            this.a = v;
            this.b = v1;
        }

        public final Builder bizBoardAd(boolean z) {
            this.j = z;
            return this;
        }

        public final Builder bodyViewId(int v) {
            this.d = v;
            return this;
        }

        public final AdFitViewBinder build() {
            return new AdFitViewBinder(this, null);
        }

        public final Builder callToActionButtonId(int v) {
            this.e = v;
            return this;
        }

        public final Builder mediaViewId(int v) {
            this.h = v;
            return this;
        }

        public final Builder profileIconViewId(int v) {
            this.g = v;
            return this;
        }

        public final Builder profileNameViewId(int v) {
            this.f = v;
            return this;
        }

        public final Builder testMode(boolean z) {
            this.i = z;
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
    public final int callToActionButtonId;
    public final boolean isBizBoard;
    public final boolean isTestMode;
    public final int mediaViewId;
    public final int nativeAdUnitLayoutId;
    public final int nativeAdViewId;
    public final int profileIconViewId;
    public final int profileNameViewId;
    public final int titleViewId;

    private AdFitViewBinder(Builder adFitViewBinder$Builder0) {
        this.nativeAdViewId = adFitViewBinder$Builder0.a;
        this.nativeAdUnitLayoutId = adFitViewBinder$Builder0.b;
        this.titleViewId = adFitViewBinder$Builder0.c;
        this.bodyViewId = adFitViewBinder$Builder0.d;
        this.callToActionButtonId = adFitViewBinder$Builder0.e;
        this.profileNameViewId = adFitViewBinder$Builder0.f;
        this.profileIconViewId = adFitViewBinder$Builder0.g;
        this.mediaViewId = adFitViewBinder$Builder0.h;
        this.isTestMode = adFitViewBinder$Builder0.i;
        this.isBizBoard = adFitViewBinder$Builder0.j;
    }

    AdFitViewBinder(Builder adFitViewBinder$Builder0, a adFitViewBinder$a0) {
        this(adFitViewBinder$Builder0);
    }
}

