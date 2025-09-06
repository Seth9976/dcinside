package com.kakao.adfit.ads.na;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.kakao.adfit.m.s;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s
public final class AdFitNativeAdLayout {
    @s
    @s0({"SMAP\nAdFitNativeAdLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdFitNativeAdLayout.kt\ncom/kakao/adfit/ads/na/AdFitNativeAdLayout$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
    public static final class Builder {
        private final AdFitNativeAdView a;
        private TextView b;
        private TextView c;
        private Button d;
        private ImageView e;
        private TextView f;
        private AdFitMediaView g;

        public Builder(@l AdFitNativeAdView adFitNativeAdView0) {
            L.p(adFitNativeAdView0, "containerView");
            super();
            this.a = adFitNativeAdView0;
        }

        @l
        public final AdFitNativeAdLayout build() {
            return new AdFitNativeAdLayout(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
        }

        @l
        public final Builder setBodyView(@l TextView textView0) {
            L.p(textView0, "view");
            this.c = textView0;
            return this;
        }

        @l
        public final Builder setCallToActionButton(@l Button button0) {
            L.p(button0, "view");
            this.d = button0;
            return this;
        }

        @l
        public final Builder setMediaView(@m AdFitMediaView adFitMediaView0) {
            this.g = adFitMediaView0;
            return this;
        }

        @l
        public final Builder setProfileIconView(@l ImageView imageView0) {
            L.p(imageView0, "view");
            this.e = imageView0;
            return this;
        }

        @l
        public final Builder setProfileNameView(@l TextView textView0) {
            L.p(textView0, "view");
            this.f = textView0;
            return this;
        }

        @l
        public final Builder setTitleView(@l TextView textView0) {
            L.p(textView0, "view");
            this.b = textView0;
            return this;
        }
    }

    private final AdFitNativeAdView a;
    private final View b;
    private final View c;
    private final View d;
    private final View e;
    private final View f;
    private final View g;
    private String h;
    private String i;

    private AdFitNativeAdLayout(AdFitNativeAdView adFitNativeAdView0, View view0, View view1, View view2, View view3, View view4, View view5) {
        this.a = adFitNativeAdView0;
        this.b = view0;
        this.c = view1;
        this.d = view2;
        this.e = view3;
        this.f = view4;
        this.g = view5;
        this.h = "AdFitNativeAdLayout@" + adFitNativeAdView0.hashCode();
        if(view0 == null && view1 == null && view2 == null && view3 == null && view4 == null && view5 == null) {
            throw new IllegalArgumentException("AdFitNativeAdLayout is empty");
        }
    }

    public AdFitNativeAdLayout(AdFitNativeAdView adFitNativeAdView0, View view0, View view1, View view2, View view3, View view4, View view5, w w0) {
        this(adFitNativeAdView0, view0, view1, view2, view3, view4, view5);
    }

    @m
    public final String getAdUnitId$library_networkRelease() {
        return this.i;
    }

    @m
    public final View getBodyView() {
        return this.c;
    }

    @m
    public final View getCallToActionButton() {
        return this.d;
    }

    @l
    public final AdFitNativeAdView getContainerView() {
        return this.a;
    }

    @m
    public final View getMediaView() {
        return this.g;
    }

    @l
    public final String getName$library_networkRelease() {
        return this.h;
    }

    @m
    public final View getProfileIconView() {
        return this.e;
    }

    @m
    public final View getProfileNameView() {
        return this.f;
    }

    @m
    public final View getTitleView() {
        return this.b;
    }

    public final void setAdUnitId$library_networkRelease(@m String s) {
        if(!L.g(this.i, s)) {
            this.i = s;
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("AdFitNativeAdLayout(\"");
            if(s == null) {
                s = "unknown";
            }
            stringBuilder0.append(s);
            stringBuilder0.append("\")@");
            stringBuilder0.append(this.a.hashCode());
            this.h = stringBuilder0.toString();
        }
    }
}

