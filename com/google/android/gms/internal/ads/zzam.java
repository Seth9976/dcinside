package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.List;

public final class zzam {
    public final Uri zza;
    @Nullable
    public final String zzb;
    @Nullable
    public final zzaj zzc;
    @Nullable
    public final zzae zzd;
    public final List zze;
    @Nullable
    public final String zzf;
    public final zzfxn zzg;
    @Nullable
    public final Object zzh;
    public final long zzi;

    static {
    }

    zzam(Uri uri0, String s, zzaj zzaj0, zzae zzae0, List list0, String s1, zzfxn zzfxn0, Object object0, long v, zzaq zzaq0) {
        this.zza = uri0;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = list0;
        this.zzf = null;
        this.zzg = zzfxn0;
        zzfxk zzfxk0 = new zzfxk();
        if(zzfxn0.size() <= 0) {
            zzfxk0.zzi();
            this.zzh = null;
            this.zzi = 0x8000000000000001L;
            return;
        }
        zzap zzap0 = (zzap)zzfxn0.get(0);
        throw null;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzam ? this.zza.equals(((zzam)object0).zza) && this.zze.equals(((zzam)object0).zze) && this.zzg.equals(((zzam)object0).zzg) && 0x8000000000000001L.equals(0x8000000000000001L) : false;
    }

    @Override
    public final int hashCode() {
        return (int)(((long)(((this.zza.hashCode() * 0xE1781 + this.zze.hashCode()) * 961 + this.zzg.hashCode()) * 0x1F)) * 0x1FL - 0x7FFFFFFFFFFFFFFFL);
    }
}

