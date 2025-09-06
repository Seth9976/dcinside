package com.igaworks.ssp.part.nativead.binder;

public class PangleViewBinder {
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

        public final PangleViewBinder build() {
            return new PangleViewBinder(this, null);
        }

        public final Builder creativeButtonViewId(int v) {
            this.g = v;
            return this;
        }

        public final Builder descriptionViewId(int v) {
            this.d = v;
            return this;
        }

        public final Builder dislikeViewId(int v) {
            this.f = v;
            return this;
        }

        public final Builder iconViewId(int v) {
            this.e = v;
            return this;
        }

        public final Builder logoViewId(int v) {
            this.h = v;
            return this;
        }

        public final Builder mediaViewId(int v) {
            this.i = v;
            return this;
        }

        public final Builder titleViewId(int v) {
            this.c = v;
            return this;
        }
    }

    static abstract class a {
    }

    public final int creativeButtonViewId;
    public final int descriptionViewId;
    public final int dislikeViewId;
    public final int iconViewId;
    public final int logoViewId;
    public final int mediaViewId;
    public final int nativeAdUnitLayoutId;
    public final int nativeAdViewId;
    public final int titleViewId;

    private PangleViewBinder(Builder pangleViewBinder$Builder0) {
        this.nativeAdViewId = pangleViewBinder$Builder0.a;
        this.nativeAdUnitLayoutId = pangleViewBinder$Builder0.b;
        this.titleViewId = pangleViewBinder$Builder0.c;
        this.descriptionViewId = pangleViewBinder$Builder0.d;
        this.iconViewId = pangleViewBinder$Builder0.e;
        this.dislikeViewId = pangleViewBinder$Builder0.f;
        this.creativeButtonViewId = pangleViewBinder$Builder0.g;
        this.logoViewId = pangleViewBinder$Builder0.h;
        this.mediaViewId = pangleViewBinder$Builder0.i;
    }

    PangleViewBinder(Builder pangleViewBinder$Builder0, a pangleViewBinder$a0) {
        this(pangleViewBinder$Builder0);
    }
}

