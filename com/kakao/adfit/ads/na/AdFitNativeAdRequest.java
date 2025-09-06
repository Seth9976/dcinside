package com.kakao.adfit.ads.na;

import com.kakao.adfit.AdFitSdk;
import com.kakao.adfit.m.s;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

@s
public final class AdFitNativeAdRequest {
    @s
    @s0({"SMAP\nAdFitNativeAdRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdFitNativeAdRequest.kt\ncom/kakao/adfit/ads/na/AdFitNativeAdRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
    public static final class Builder {
        private AdFitAdInfoIconPosition a;
        private AdFitVideoAutoPlayPolicy b;
        private boolean c;
        private Map d;

        public Builder() {
            this.a = AdFitAdInfoIconPosition.Companion.default();
            this.b = AdFitSdk.getVideoAdAutoPlayPolicy();
        }

        @l
        public final AdFitNativeAdRequest build() {
            return new AdFitNativeAdRequest(this.a, this.b, this.c, this.d, null);
        }

        @l
        public final Builder setAdInfoIconPosition(@l AdFitAdInfoIconPosition adFitAdInfoIconPosition0) {
            L.p(adFitAdInfoIconPosition0, "position");
            this.a = adFitAdInfoIconPosition0;
            return this;
        }

        @l
        public final Builder setTestModeEnabled(boolean z) {
            this.c = z;
            return this;
        }

        @l
        public final Builder setTestOptions(@m Map map0) {
            this.c = true;
            this.d = map0;
            return this;
        }

        @l
        public final Builder setVideoAutoPlayPolicy(@l AdFitVideoAutoPlayPolicy adFitVideoAutoPlayPolicy0) {
            L.p(adFitVideoAutoPlayPolicy0, "policy");
            this.b = adFitVideoAutoPlayPolicy0;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @s
        @l
        @n
        public final AdFitNativeAdRequest default() {
            return new Builder().build();
        }
    }

    @l
    public static final Companion Companion;
    private final AdFitAdInfoIconPosition a;
    private final AdFitVideoAutoPlayPolicy b;
    private final boolean c;
    private final Map d;

    static {
        AdFitNativeAdRequest.Companion = new Companion(null);
    }

    private AdFitNativeAdRequest(AdFitAdInfoIconPosition adFitAdInfoIconPosition0, AdFitVideoAutoPlayPolicy adFitVideoAutoPlayPolicy0, boolean z, Map map0) {
        this.a = adFitAdInfoIconPosition0;
        this.b = adFitVideoAutoPlayPolicy0;
        this.c = z;
        this.d = map0;
    }

    public AdFitNativeAdRequest(AdFitAdInfoIconPosition adFitAdInfoIconPosition0, AdFitVideoAutoPlayPolicy adFitVideoAutoPlayPolicy0, boolean z, Map map0, w w0) {
        this(adFitAdInfoIconPosition0, adFitVideoAutoPlayPolicy0, z, map0);
    }

    @s
    @l
    @n
    public static final AdFitNativeAdRequest default() {
        return AdFitNativeAdRequest.Companion.default();
    }

    @l
    public final AdFitAdInfoIconPosition getAdInfoIconPosition() {
        return this.a;
    }

    public final boolean getTestModeEnabled() {
        return this.c;
    }

    @m
    public final Map getTestOptions() {
        return this.d;
    }

    @l
    public final AdFitVideoAutoPlayPolicy getVideoAutoPlayPolicy() {
        return this.b;
    }
}

