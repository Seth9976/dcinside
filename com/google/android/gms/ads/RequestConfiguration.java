package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o3.h;

public class RequestConfiguration {
    public static class Builder {
        private int zza;
        private int zzb;
        @h
        private String zzc;
        private final List zzd;
        private PublisherPrivacyPersonalizationState zze;

        public Builder() {
            this.zza = -1;
            this.zzb = -1;
            this.zzc = null;
            this.zzd = new ArrayList();
            this.zze = PublisherPrivacyPersonalizationState.DEFAULT;
        }

        @NonNull
        public RequestConfiguration build() {
            return new RequestConfiguration(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
        }

        @NonNull
        public Builder setMaxAdContentRating(@h String s) {
            if(s != null && !"".equals(s)) {
                if(!"G".equals(s) && !"PG".equals(s) && !"T".equals(s) && !"MA".equals(s)) {
                    zzo.zzj(("Invalid value passed to setMaxAdContentRating: " + s));
                    return this;
                }
                this.zzc = s;
                return this;
            }
            this.zzc = null;
            return this;
        }

        @NonNull
        public Builder setPublisherPrivacyPersonalizationState(@NonNull PublisherPrivacyPersonalizationState requestConfiguration$PublisherPrivacyPersonalizationState0) {
            this.zze = requestConfiguration$PublisherPrivacyPersonalizationState0;
            return this;
        }

        @NonNull
        public Builder setTagForChildDirectedTreatment(int v) {
            if(v != -1 && v != 0 && v != 1) {
                zzo.zzj(("Invalid value passed to setTagForChildDirectedTreatment: " + v));
                return this;
            }
            this.zza = v;
            return this;
        }

        @NonNull
        public Builder setTagForUnderAgeOfConsent(int v) {
            if(v != -1 && v != 0 && v != 1) {
                zzo.zzj(("Invalid value passed to setTagForUnderAgeOfConsent: " + v));
                return this;
            }
            this.zzb = v;
            return this;
        }

        @NonNull
        public Builder setTestDeviceIds(@h List list0) {
            this.zzd.clear();
            if(list0 != null) {
                this.zzd.addAll(list0);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MaxAdContentRating {
    }

    public static enum PublisherPrivacyPersonalizationState {
        @NonNull
        DEFAULT(0),
        @NonNull
        ENABLED(1),
        @NonNull
        DISABLED(2);

        private final int zzb;

        private PublisherPrivacyPersonalizationState(int v1) {
            this.zzb = v1;
        }

        public int getValue() {
            return this.zzb;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForChildDirectedTreatment {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForUnderAgeOfConsent {
    }

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    @NonNull
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    @NonNull
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    @NonNull
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    @NonNull
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    @NonNull
    public static final List zza;
    private final int zzb;
    private final int zzc;
    @h
    private final String zzd;
    private final List zze;
    private final PublisherPrivacyPersonalizationState zzf;

    static {
        RequestConfiguration.zza = Arrays.asList(new String[]{"MA", "T", "PG", "G"});
    }

    RequestConfiguration(int v, int v1, String s, List list0, PublisherPrivacyPersonalizationState requestConfiguration$PublisherPrivacyPersonalizationState0, zzi zzi0) {
        this.zzb = v;
        this.zzc = v1;
        this.zzd = s;
        this.zze = list0;
        this.zzf = requestConfiguration$PublisherPrivacyPersonalizationState0;
    }

    @NonNull
    public String getMaxAdContentRating() {
        return this.zzd == null ? "" : this.zzd;
    }

    @NonNull
    public PublisherPrivacyPersonalizationState getPublisherPrivacyPersonalizationState() {
        return this.zzf;
    }

    public int getTagForChildDirectedTreatment() {
        return this.zzb;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.zzc;
    }

    @NonNull
    public List getTestDeviceIds() {
        return new ArrayList(this.zze);
    }

    @NonNull
    public Builder toBuilder() {
        Builder requestConfiguration$Builder0 = new Builder();
        requestConfiguration$Builder0.setTagForChildDirectedTreatment(this.zzb);
        requestConfiguration$Builder0.setTagForUnderAgeOfConsent(this.zzc);
        requestConfiguration$Builder0.setMaxAdContentRating(this.zzd);
        requestConfiguration$Builder0.setTestDeviceIds(this.zze);
        return requestConfiguration$Builder0;
    }
}

