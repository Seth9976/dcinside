package com.google.android.gms.internal.clearcut;

import android.net.Uri;

public final class zzao {
    private final String zzef;
    private final Uri zzeg;
    private final String zzeh;
    private final String zzei;
    private final boolean zzej;
    private final boolean zzek;

    public zzao(Uri uri0) {
        this(null, uri0, "", "", false, false);
    }

    private zzao(String s, Uri uri0, String s1, String s2, boolean z, boolean z1) {
        this.zzef = s;
        this.zzeg = uri0;
        this.zzeh = s1;
        this.zzei = s2;
        this.zzej = z;
        this.zzek = z1;
    }

    public final zzae zza(String s, Object object0, zzan zzan0) {
        return zzae.zza(this, s, object0, zzan0);
    }

    public final zzae zza(String s, String s1) {
        return zzae.zzb(this, s, null);
    }

    public final zzae zzc(String s, boolean z) {
        return zzae.zzb(this, s, false);
    }

    public final zzao zzc(String s) {
        if(this.zzej) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new zzao(this.zzef, this.zzeg, s, this.zzei, false, this.zzek);
    }

    public final zzao zzd(String s) {
        return new zzao(this.zzef, this.zzeg, this.zzeh, s, this.zzej, this.zzek);
    }
}

