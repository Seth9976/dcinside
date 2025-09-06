package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdRequest;
import java.util.List;

public final class AdManagerAdRequest extends AdRequest {
    public static final class Builder extends AbstractAdRequestBuilder {
        @NonNull
        public Builder addCategoryExclusion(@NonNull String s) {
            this.zza.zzn(s);
            return this;
        }

        @Override  // com.google.android.gms.ads.AbstractAdRequestBuilder
        @NonNull
        public final AbstractAdRequestBuilder addCustomTargeting(@NonNull String s, @NonNull String s1) {
            this.addCustomTargeting(s, s1);
            return this;
        }

        @Override  // com.google.android.gms.ads.AbstractAdRequestBuilder
        @NonNull
        public final AbstractAdRequestBuilder addCustomTargeting(@NonNull String s, @NonNull List list0) {
            this.addCustomTargeting(s, list0);
            return this;
        }

        @NonNull
        public Builder addCustomTargeting(@NonNull String s, @NonNull String s1) {
            this.zza.zzp(s, s1);
            return this;
        }

        @NonNull
        public Builder addCustomTargeting(@NonNull String s, @NonNull List list0) {
            if(list0 != null) {
                String s1 = TextUtils.join(",", list0);
                this.zza.zzp(s, s1);
            }
            return this;
        }

        @NonNull
        public AdManagerAdRequest build() {
            return new AdManagerAdRequest(this, null);
        }

        @Override  // com.google.android.gms.ads.AbstractAdRequestBuilder
        @NonNull
        public final AbstractAdRequestBuilder self() {
            return this;
        }

        @NonNull
        public Builder self() {
            return this;
        }

        @NonNull
        public Builder setPublisherProvidedId(@NonNull String s) {
            this.zza.zzB(s);
            return this;
        }
    }

    AdManagerAdRequest(Builder adManagerAdRequest$Builder0, zza zza0) {
        super(adManagerAdRequest$Builder0);
    }

    @Override  // com.google.android.gms.ads.AdRequest
    @NonNull
    public Bundle getCustomTargeting() {
        return this.zza.zze();
    }

    @NonNull
    public String getPublisherProvidedId() {
        return this.zza.zzl();
    }
}

