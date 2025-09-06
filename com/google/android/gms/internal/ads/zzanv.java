package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j..util.DesugarCollections;
import java.util.Collections;
import java.util.List;

public final class zzanv {
    public final int zza;
    @Nullable
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzanv(int v, @Nullable String s, int v1, @Nullable List list0, byte[] arr_b) {
        this.zza = v;
        this.zzb = s;
        this.zzc = v1;
        this.zzd = list0 == null ? Collections.emptyList() : DesugarCollections.unmodifiableList(list0);
        this.zze = arr_b;
    }

    public final int zza() {
        switch(this.zzc) {
            case 2: {
                return 0x800;
            }
            case 3: {
                return 0x200;
            }
            default: {
                return 0;
            }
        }
    }
}

