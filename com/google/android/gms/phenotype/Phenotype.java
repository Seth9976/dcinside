package com.google.android.gms.phenotype;

import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.phenotype.zzd;

@KeepForSdk
public final class Phenotype {
    @Deprecated
    private static final Api API;
    private static final AbstractClientBuilder CLIENT_BUILDER;
    private static final ClientKey CLIENT_KEY;
    @Deprecated
    private static final zzm zzaj;

    static {
        ClientKey api$ClientKey0 = new ClientKey();
        Phenotype.CLIENT_KEY = api$ClientKey0;
        zzl zzl0 = new zzl();
        Phenotype.CLIENT_BUILDER = zzl0;
        Phenotype.API = new Api("Phenotype.API", zzl0, api$ClientKey0);
        Phenotype.zzaj = new zzd();
    }

    @KeepForSdk
    public static Uri getContentProviderUri(String s) {
        String s1 = Uri.encode(s);
        return s1.length() == 0 ? Uri.parse(new String("content://com.google.android.gms.phenotype/")) : Uri.parse(("content://com.google.android.gms.phenotype/" + s1));
    }
}

