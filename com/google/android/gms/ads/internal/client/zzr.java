package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.search.SearchAdRequest;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class zzr {
    public static final zzr zza;

    static {
        zzr.zza = new zzr();
    }

    public final zzm zza(Context context0, zzei zzei0) {
        Set set0 = zzei0.zzp();
        List list0 = set0.isEmpty() ? null : DesugarCollections.unmodifiableList(new ArrayList(set0));
        boolean z = zzei0.zzs(context0);
        Bundle bundle0 = zzei0.zzf(AdMobAdapter.class);
        SearchAdRequest searchAdRequest0 = zzei0.zzi();
        zzfx zzfx0 = searchAdRequest0 == null ? null : new zzfx(searchAdRequest0);
        String s = context0.getApplicationContext() == null ? null : zzf.zzq(Thread.currentThread().getStackTrace(), "com.dcinside.app.android");
        RequestConfiguration requestConfiguration0 = zzex.zzf().zzc();
        Object object0 = Collections.max(Arrays.asList(new String[]{0, ""}), new zzp());
        List list1 = zzei0.zzn();
        return new zzm(8, -1L, bundle0, -1, list0, z, Math.max(zzei0.zzb(), requestConfiguration0.getTagForChildDirectedTreatment()), false, zzei0.zzl(), zzfx0, null, zzei0.zzk(), zzei0.zzg(), zzei0.zze(), DesugarCollections.unmodifiableList(new ArrayList(zzei0.zzo())), zzei0.zzm(), s, zzei0.zzr(), null, requestConfiguration0.getTagForUnderAgeOfConsent(), ((String)object0), list1, zzei0.zza(), zzei0.zzj(), requestConfiguration0.getPublisherPrivacyPersonalizationState().getValue(), zzei0.zzc());
    }
}

