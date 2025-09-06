package com.igaworks.ssp.part.nativead.binder;

public class MobWithViewBinder {
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

        public final MobWithViewBinder build() {
            return new MobWithViewBinder(this, null);
        }

        public final Builder buttonGoId(int v) {
            this.h = v;
            return this;
        }

        public final Builder imageViewADId(int v) {
            this.d = v;
            return this;
        }

        public final Builder imageViewInfoId(int v) {
            this.j = v;
            return this;
        }

        public final Builder imageViewLogoId(int v) {
            this.e = v;
            return this;
        }

        public final Builder layoutInfoViewId(int v) {
            this.i = v;
            return this;
        }

        public final Builder mediaContainerViewId(int v) {
            this.c = v;
            return this;
        }

        public final Builder mediaViewId(int v) {
            this.k = v;
            return this;
        }

        public final Builder textViewDescId(int v) {
            this.g = v;
            return this;
        }

        public final Builder textViewTitleId(int v) {
            this.f = v;
            return this;
        }
    }

    static abstract class a {
    }

    public final int buttonGoId;
    public final int imageViewADId;
    public final int imageViewInfoId;
    public final int imageViewLogoId;
    public final int layoutInfoViewId;
    public final int mediaContainerViewId;
    public final int mediaViewId;
    public final int nativeAdUnitLayoutId;
    public final int nativeAdViewId;
    public final int textViewDescId;
    public final int textViewTitleId;

    private MobWithViewBinder(Builder mobWithViewBinder$Builder0) {
        this.nativeAdViewId = mobWithViewBinder$Builder0.a;
        this.nativeAdUnitLayoutId = mobWithViewBinder$Builder0.b;
        this.mediaContainerViewId = mobWithViewBinder$Builder0.c;
        this.imageViewADId = mobWithViewBinder$Builder0.d;
        this.imageViewLogoId = mobWithViewBinder$Builder0.e;
        this.textViewTitleId = mobWithViewBinder$Builder0.f;
        this.textViewDescId = mobWithViewBinder$Builder0.g;
        this.buttonGoId = mobWithViewBinder$Builder0.h;
        this.layoutInfoViewId = mobWithViewBinder$Builder0.i;
        this.imageViewInfoId = mobWithViewBinder$Builder0.j;
        this.mediaViewId = mobWithViewBinder$Builder0.k;
    }

    MobWithViewBinder(Builder mobWithViewBinder$Builder0, a mobWithViewBinder$a0) {
        this(mobWithViewBinder$Builder0);
    }
}

