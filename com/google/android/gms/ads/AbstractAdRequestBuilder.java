package com.google.android.gms.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

public abstract class AbstractAdRequestBuilder {
    protected final zzeh zza;

    protected AbstractAdRequestBuilder() {
        zzeh zzeh0 = new zzeh();
        this.zza = zzeh0;
        zzeh0.zzt("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    @NonNull
    @Deprecated
    public AbstractAdRequestBuilder addCustomEventExtrasBundle(@NonNull Class class0, @NonNull Bundle bundle0) {
        this.zza.zzo(class0, bundle0);
        return this.self();
    }

    @NonNull
    public AbstractAdRequestBuilder addCustomTargeting(@NonNull String s, @NonNull String s1) {
        if(!TextUtils.isEmpty(s1) && s1.contains(",")) {
            zzo.zzj(("Value " + s1 + " contains invalid character \',\' (comma). The server will parse it as a list of comma-separated values."));
        }
        this.zza.zzp(s, s1);
        return this.self();
    }

    @NonNull
    public AbstractAdRequestBuilder addCustomTargeting(@NonNull String s, @NonNull List list0) {
        if(list0 != null) {
            for(Object object0: list0) {
                String s1 = (String)object0;
                if(!TextUtils.isEmpty(s1) && s1.contains(",")) {
                    zzo.zzj(("Value " + s1 + " contains invalid character \',\' (comma). The server will parse it as a list of comma-separated values."));
                }
            }
            String s2 = TextUtils.join(",", list0);
            this.zza.zzp(s, s2);
        }
        return this.self();
    }

    @NonNull
    public AbstractAdRequestBuilder addKeyword(@NonNull String s) {
        this.zza.zzq(s);
        return this.self();
    }

    @NonNull
    public AbstractAdRequestBuilder addNetworkExtrasBundle(@NonNull Class class0, @NonNull Bundle bundle0) {
        this.zza.zzr(class0, bundle0);
        if(class0.equals(AdMobAdapter.class) && bundle0.getBoolean("_emulatorLiveAds")) {
            this.zza.zzu("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return this.self();
    }

    @NonNull
    protected abstract AbstractAdRequestBuilder self();

    @NonNull
    public AbstractAdRequestBuilder setAdString(@NonNull String s) {
        this.zza.zzv(s);
        return this.self();
    }

    @NonNull
    public AbstractAdRequestBuilder setContentUrl(@NonNull String s) {
        Preconditions.checkNotNull(s, "Content URL must be non-null.");
        Preconditions.checkNotEmpty(s, "Content URL must be non-empty.");
        Object[] arr_object = new Object[2];
        boolean z = false;
        arr_object[0] = 0x200;
        arr_object[1] = s.length();
        if(s.length() <= 0x200) {
            z = true;
        }
        Preconditions.checkArgument(z, "Content URL must not exceed %d in length.  Provided length was %d.", arr_object);
        this.zza.zzw(s);
        return this.self();
    }

    @NonNull
    public AbstractAdRequestBuilder setHttpTimeoutMillis(int v) {
        this.zza.zzx(v);
        return this.self();
    }

    @NonNull
    public AbstractAdRequestBuilder setNeighboringContentUrls(@NonNull List list0) {
        if(list0 == null) {
            zzo.zzj("neighboring content URLs list should not be null");
            return this.self();
        }
        this.zza.zzz(list0);
        return this.self();
    }

    @NonNull
    public AbstractAdRequestBuilder setRequestAgent(@NonNull String s) {
        this.zza.zzC(s);
        return this.self();
    }

    @NonNull
    @Deprecated
    public final AbstractAdRequestBuilder zza(@NonNull String s) {
        this.zza.zzt(s);
        return this.self();
    }

    @NonNull
    @Deprecated
    public final AbstractAdRequestBuilder zzb(boolean z) {
        this.zza.zzy(z);
        return this.self();
    }

    @NonNull
    public final AbstractAdRequestBuilder zzc(@NonNull Bundle bundle0) {
        this.zza.zzA(bundle0);
        return this.self();
    }

    @NonNull
    @Deprecated
    public final AbstractAdRequestBuilder zzd(boolean z) {
        this.zza.zzD(z);
        return this.self();
    }
}

