package com.igaworks.ssp.part.nativead.binder;

import android.view.View;

public class NAMViewBinder {
    public static class Builder {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private boolean f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private boolean n;
        private boolean o;
        private boolean p;

        public Builder(int v) {
            this.a = v;
            this.f = false;
            this.n = true;
            this.o = false;
            this.p = false;
        }

        public Builder(int v, int v1, int v2, boolean z) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.f = z;
            this.n = true;
            this.o = true;
            this.p = false;
        }

        public Builder(int v, int v1, boolean z) {
            this.b = v;
            this.c = v1;
            this.f = z;
            this.n = false;
            this.o = true;
            this.p = false;
        }

        public final Builder activateObservingOnBackground(boolean z) {
            this.p = z;
            return this;
        }

        public final Builder adChoicesViewId(int v) {
            this.g = v;
            return this;
        }

        public final Builder advertiserViewId(int v) {
            this.k = v;
            return this;
        }

        public final Builder assetContainerViewId(int v) {
            this.d = v;
            return this;
        }

        public final Builder bodyViewId(int v) {
            this.j = v;
            return this;
        }

        public final NAMViewBinder build() {
            return new NAMViewBinder(this, null);
        }

        public final Builder callToActionButtonViewId(int v) {
            this.m = v;
            return this;
        }

        public final Builder iconViewId(int v) {
            this.h = v;
            return this;
        }

        public final Builder mediaViewId(int v) {
            this.e = v;
            this.f = true;
            return this;
        }

        public final Builder socialContextViewId(int v) {
            this.l = v;
            return this;
        }

        public final Builder titleViewId(int v) {
            this.i = v;
            return this;
        }
    }

    static abstract class a {
    }

    public final boolean activateObservingOnBackground;
    public final int adChoicesViewId;
    public final int advertiserViewId;
    public final int assetContainerViewId;
    public final int bodyViewId;
    public final int callToActionButtonViewId;
    public final int gfpNativeAdViewId;
    public View gfpNativeBannerView;
    public final int gfpNativeSimpleAdViewId;
    public final boolean hasMediaView;
    public final int iconViewId;
    public final int mediaViewId;
    public final int nativeAdUnitLayoutId;
    public final int socialContextViewId;
    public final int titleViewId;
    public final boolean useGfpNativeSimpleView;
    public final boolean useGfpNativeView;

    private NAMViewBinder(Builder nAMViewBinder$Builder0) {
        this.gfpNativeSimpleAdViewId = nAMViewBinder$Builder0.a;
        this.gfpNativeAdViewId = nAMViewBinder$Builder0.b;
        this.nativeAdUnitLayoutId = nAMViewBinder$Builder0.c;
        this.assetContainerViewId = nAMViewBinder$Builder0.d;
        this.adChoicesViewId = nAMViewBinder$Builder0.g;
        this.mediaViewId = nAMViewBinder$Builder0.e;
        this.iconViewId = nAMViewBinder$Builder0.h;
        this.titleViewId = nAMViewBinder$Builder0.i;
        this.bodyViewId = nAMViewBinder$Builder0.j;
        this.advertiserViewId = nAMViewBinder$Builder0.k;
        this.socialContextViewId = nAMViewBinder$Builder0.l;
        this.callToActionButtonViewId = nAMViewBinder$Builder0.m;
        this.hasMediaView = nAMViewBinder$Builder0.f;
        this.gfpNativeBannerView = null;
        this.activateObservingOnBackground = nAMViewBinder$Builder0.p;
        this.useGfpNativeSimpleView = nAMViewBinder$Builder0.n;
        this.useGfpNativeView = nAMViewBinder$Builder0.o;
    }

    NAMViewBinder(Builder nAMViewBinder$Builder0, a nAMViewBinder$a0) {
        this(nAMViewBinder$Builder0);
    }
}

