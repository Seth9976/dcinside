package com.igaworks.ssp.part.nativead.binder;

import android.graphics.Color;

public class AdPopcornSSPViewBinder {
    public static class Builder {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private boolean h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private int n;
        private boolean o;
        private int p;
        private int q;
        private int r;
        private int s;
        private int t;
        private int u;
        private int v;

        public Builder(int v) {
            this.h = true;
            this.i = 15;
            this.j = 15;
            this.k = 1;
            this.l = 2;
            this.m = 2;
            this.n = 0;
            this.o = false;
            this.p = 2;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            this.v = Color.parseColor("#F8F8F8");
            this.a = v;
        }

        public Builder(int v, int v1) {
            this.h = true;
            this.i = 15;
            this.j = 15;
            this.k = 1;
            this.l = 2;
            this.m = 2;
            this.n = 0;
            this.o = false;
            this.p = 2;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            this.v = Color.parseColor("#F8F8F8");
            this.a = v;
            this.b = v1;
        }

        public final AdPopcornSSPViewBinder build() {
            return new AdPopcornSSPViewBinder(this, null);
        }

        public final Builder callToActionId(int v) {
            this.g = v;
            return this;
        }

        public final Builder descViewId(int v) {
            this.f = v;
            return this;
        }

        public final Builder iconImageViewId(int v) {
            this.c = v;
            return this;
        }

        public final Builder mainImageViewId(int v) {
            this.d = v;
            return this;
        }

        public final Builder privacyIconCornerRound(int v) {
            this.n = v;
            return this;
        }

        public final Builder privacyIconHeight(int v) {
            this.j = v;
            return this;
        }

        public final Builder privacyIconLeftRightMargin(int v) {
            this.l = v;
            return this;
        }

        public final Builder privacyIconPosition(int v) {
            this.k = v;
            return this;
        }

        public final Builder privacyIconTopBottomMargin(int v) {
            this.m = v;
            return this;
        }

        public final Builder privacyIconVisibility(boolean z) {
            this.h = z;
            return this;
        }

        public final Builder privacyIconWidth(int v) {
            this.i = v;
            return this;
        }

        public final Builder templateBackgroundColor(int v) {
            this.v = v;
            return this;
        }

        public final Builder templateIconImageCornerRadius(int v) {
            this.s = v;
            return this;
        }

        public final Builder templateMainImageCornerRadius(int v) {
            this.r = v;
            return this;
        }

        public final Builder templatePrivacyIconCornerRadius(int v) {
            this.q = v;
            return this;
        }

        public final Builder templatePrivacyIconLeftRightMargin(int v) {
            this.t = v;
            return this;
        }

        public final Builder templatePrivacyIconPosition(int v) {
            this.p = v;
            return this;
        }

        public final Builder templatePrivacyIconTopBottomMargin(int v) {
            this.u = v;
            return this;
        }

        public final Builder titleViewId(int v) {
            this.e = v;
            return this;
        }

        public final Builder useTemplate(boolean z) {
            this.o = z;
            return this;
        }
    }

    static abstract class a {
    }

    public int callToActionId;
    public int descId;
    public int iconImageId;
    public int mainImageId;
    public int nativeAdUnitLayoutId;
    public final int nativeAdViewId;
    public int privacyIconCornerRadius;
    public int privacyIconHeight;
    public int privacyIconLRMargin;
    public int privacyIconPosition;
    public int privacyIconTBMargin;
    public boolean privacyIconVisibility;
    public int privacyIconWidth;
    public int templateBackgroundColor;
    public int templateIconImageCornerRadius;
    public int templateMainImageCornerRadius;
    public int templatePrivacyIconCornerRadius;
    public int templatePrivacyIconLRMargin;
    public int templatePrivacyIconPosition;
    public int templatePrivacyIconTBMargin;
    public int titleId;
    public boolean useTemplate;

    private AdPopcornSSPViewBinder(Builder adPopcornSSPViewBinder$Builder0) {
        this.nativeAdViewId = adPopcornSSPViewBinder$Builder0.a;
        this.nativeAdUnitLayoutId = adPopcornSSPViewBinder$Builder0.b;
        this.titleId = adPopcornSSPViewBinder$Builder0.e;
        this.descId = adPopcornSSPViewBinder$Builder0.f;
        this.callToActionId = adPopcornSSPViewBinder$Builder0.g;
        this.mainImageId = adPopcornSSPViewBinder$Builder0.d;
        this.iconImageId = adPopcornSSPViewBinder$Builder0.c;
        this.privacyIconVisibility = adPopcornSSPViewBinder$Builder0.h;
        this.privacyIconWidth = adPopcornSSPViewBinder$Builder0.i;
        this.privacyIconHeight = adPopcornSSPViewBinder$Builder0.j;
        this.privacyIconPosition = adPopcornSSPViewBinder$Builder0.k;
        this.privacyIconLRMargin = adPopcornSSPViewBinder$Builder0.l;
        this.privacyIconTBMargin = adPopcornSSPViewBinder$Builder0.m;
        this.privacyIconCornerRadius = adPopcornSSPViewBinder$Builder0.n;
        this.useTemplate = adPopcornSSPViewBinder$Builder0.o;
        this.templateBackgroundColor = adPopcornSSPViewBinder$Builder0.v;
        this.templatePrivacyIconPosition = adPopcornSSPViewBinder$Builder0.p;
        this.templatePrivacyIconCornerRadius = adPopcornSSPViewBinder$Builder0.q;
        this.templateMainImageCornerRadius = adPopcornSSPViewBinder$Builder0.r;
        this.templateIconImageCornerRadius = adPopcornSSPViewBinder$Builder0.s;
        this.templatePrivacyIconLRMargin = adPopcornSSPViewBinder$Builder0.t;
        this.templatePrivacyIconTBMargin = adPopcornSSPViewBinder$Builder0.u;
    }

    AdPopcornSSPViewBinder(Builder adPopcornSSPViewBinder$Builder0, a adPopcornSSPViewBinder$a0) {
        this(adPopcornSSPViewBinder$Builder0);
    }
}

