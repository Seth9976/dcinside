package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.mediation.NetworkExtras;

public final class DynamicHeightSearchAdRequest {
    public static final class Builder {
        private final zzb zza;
        private final Bundle zzb;

        public Builder() {
            this.zza = new zzb();
            this.zzb = new Bundle();
        }

        @NonNull
        public Builder addCustomEventExtrasBundle(@NonNull Class class0, @NonNull Bundle bundle0) {
            this.zza.zzb(class0, bundle0);
            return this;
        }

        @NonNull
        public Builder addNetworkExtras(@NonNull NetworkExtras networkExtras0) {
            this.zza.zzc(networkExtras0);
            return this;
        }

        @NonNull
        public Builder addNetworkExtrasBundle(@NonNull Class class0, @NonNull Bundle bundle0) {
            this.zza.zzd(class0, bundle0);
            return this;
        }

        @NonNull
        public DynamicHeightSearchAdRequest build() {
            this.zza.zzd(AdMobAdapter.class, this.zzb);
            return new DynamicHeightSearchAdRequest(this, null);
        }

        @NonNull
        public Builder setAdBorderSelectors(@NonNull String s) {
            this.zzb.putString("csa_adBorderSelectors", s);
            return this;
        }

        @NonNull
        public Builder setAdTest(boolean z) {
            this.zzb.putString("csa_adtest", (z ? "on" : "off"));
            return this;
        }

        @NonNull
        public Builder setAdjustableLineHeight(int v) {
            this.zzb.putString("csa_adjustableLineHeight", Integer.toString(v));
            return this;
        }

        @NonNull
        public Builder setAdvancedOptionValue(@NonNull String s, @NonNull String s1) {
            this.zzb.putString(s, s1);
            return this;
        }

        @NonNull
        public Builder setAttributionSpacingBelow(int v) {
            this.zzb.putString("csa_attributionSpacingBelow", Integer.toString(v));
            return this;
        }

        @NonNull
        public Builder setBorderSelections(@NonNull String s) {
            this.zzb.putString("csa_borderSelections", s);
            return this;
        }

        @NonNull
        public Builder setChannel(@NonNull String s) {
            this.zzb.putString("csa_channel", s);
            return this;
        }

        @NonNull
        public Builder setColorAdBorder(@NonNull String s) {
            this.zzb.putString("csa_colorAdBorder", s);
            return this;
        }

        @NonNull
        public Builder setColorAdSeparator(@NonNull String s) {
            this.zzb.putString("csa_colorAdSeparator", s);
            return this;
        }

        @NonNull
        public Builder setColorAnnotation(@NonNull String s) {
            this.zzb.putString("csa_colorAnnotation", s);
            return this;
        }

        @NonNull
        public Builder setColorAttribution(@NonNull String s) {
            this.zzb.putString("csa_colorAttribution", s);
            return this;
        }

        @NonNull
        public Builder setColorBackground(@NonNull String s) {
            this.zzb.putString("csa_colorBackground", s);
            return this;
        }

        @NonNull
        public Builder setColorBorder(@NonNull String s) {
            this.zzb.putString("csa_colorBorder", s);
            return this;
        }

        @NonNull
        public Builder setColorDomainLink(@NonNull String s) {
            this.zzb.putString("csa_colorDomainLink", s);
            return this;
        }

        @NonNull
        public Builder setColorText(@NonNull String s) {
            this.zzb.putString("csa_colorText", s);
            return this;
        }

        @NonNull
        public Builder setColorTitleLink(@NonNull String s) {
            this.zzb.putString("csa_colorTitleLink", s);
            return this;
        }

        @NonNull
        public Builder setCssWidth(int v) {
            this.zzb.putString("csa_width", Integer.toString(v));
            return this;
        }

        @NonNull
        public Builder setDetailedAttribution(boolean z) {
            this.zzb.putString("csa_detailedAttribution", Boolean.toString(z));
            return this;
        }

        @NonNull
        public Builder setFontFamily(@NonNull String s) {
            this.zzb.putString("csa_fontFamily", s);
            return this;
        }

        @NonNull
        public Builder setFontFamilyAttribution(@NonNull String s) {
            this.zzb.putString("csa_fontFamilyAttribution", s);
            return this;
        }

        @NonNull
        public Builder setFontSizeAnnotation(int v) {
            this.zzb.putString("csa_fontSizeAnnotation", Integer.toString(v));
            return this;
        }

        @NonNull
        public Builder setFontSizeAttribution(int v) {
            this.zzb.putString("csa_fontSizeAttribution", Integer.toString(v));
            return this;
        }

        @NonNull
        public Builder setFontSizeDescription(int v) {
            this.zzb.putString("csa_fontSizeDescription", Integer.toString(v));
            return this;
        }

        @NonNull
        public Builder setFontSizeDomainLink(int v) {
            this.zzb.putString("csa_fontSizeDomainLink", Integer.toString(v));
            return this;
        }

        @NonNull
        public Builder setFontSizeTitle(int v) {
            this.zzb.putString("csa_fontSizeTitle", Integer.toString(v));
            return this;
        }

        @NonNull
        public Builder setHostLanguage(@NonNull String s) {
            this.zzb.putString("csa_hl", s);
            return this;
        }

        @NonNull
        public Builder setIsClickToCallEnabled(boolean z) {
            this.zzb.putString("csa_clickToCall", Boolean.toString(z));
            return this;
        }

        @NonNull
        public Builder setIsLocationEnabled(boolean z) {
            this.zzb.putString("csa_location", Boolean.toString(z));
            return this;
        }

        @NonNull
        public Builder setIsPlusOnesEnabled(boolean z) {
            this.zzb.putString("csa_plusOnes", Boolean.toString(z));
            return this;
        }

        @NonNull
        public Builder setIsSellerRatingsEnabled(boolean z) {
            this.zzb.putString("csa_sellerRatings", Boolean.toString(z));
            return this;
        }

        @NonNull
        public Builder setIsSiteLinksEnabled(boolean z) {
            this.zzb.putString("csa_siteLinks", Boolean.toString(z));
            return this;
        }

        @NonNull
        public Builder setIsTitleBold(boolean z) {
            this.zzb.putString("csa_titleBold", Boolean.toString(z));
            return this;
        }

        @NonNull
        public Builder setIsTitleUnderlined(boolean z) {
            this.zzb.putString("csa_noTitleUnderline", Boolean.toString(!z));
            return this;
        }

        @NonNull
        public Builder setLocationColor(@NonNull String s) {
            this.zzb.putString("csa_colorLocation", s);
            return this;
        }

        @NonNull
        public Builder setLocationFontSize(int v) {
            this.zzb.putString("csa_fontSizeLocation", Integer.toString(v));
            return this;
        }

        @NonNull
        public Builder setLongerHeadlines(boolean z) {
            this.zzb.putString("csa_longerHeadlines", Boolean.toString(z));
            return this;
        }

        @NonNull
        public Builder setNumber(int v) {
            this.zzb.putString("csa_number", Integer.toString(v));
            return this;
        }

        @NonNull
        public Builder setPage(int v) {
            this.zzb.putString("csa_adPage", Integer.toString(v));
            return this;
        }

        @NonNull
        public Builder setQuery(@NonNull String s) {
            this.zza.zze(s);
            return this;
        }

        @NonNull
        public Builder setStyleId(@NonNull String s) {
            this.zzb.putString("csa_styleId", s);
            return this;
        }

        @NonNull
        public Builder setVerticalSpacing(int v) {
            this.zzb.putString("csa_verticalSpacing", Integer.toString(v));
            return this;
        }
    }

    private final SearchAdRequest zza;

    DynamicHeightSearchAdRequest(Builder dynamicHeightSearchAdRequest$Builder0, zza zza0) {
        this.zza = new SearchAdRequest(dynamicHeightSearchAdRequest$Builder0.zza, null);
    }

    @Nullable
    public Bundle getCustomEventExtrasBundle(@NonNull Class class0) {
        return this.zza.getCustomEventExtrasBundle(class0);
    }

    @Nullable
    public Bundle getNetworkExtrasBundle(@NonNull Class class0) {
        return this.zza.getNetworkExtrasBundle(class0);
    }

    @NonNull
    public String getQuery() {
        return this.zza.getQuery();
    }

    public boolean isTestDevice(@NonNull Context context0) {
        return this.zza.isTestDevice(context0);
    }

    final zzei zza() {
        return this.zza.zza();
    }
}

