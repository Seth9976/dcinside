package com.google.android.gms.internal.common;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z4.b;

@b
public final class zzaa {
    private final zzr zza;
    private final boolean zzb;
    private final zzx zzc;

    private zzaa(zzx zzx0, boolean z, zzr zzr0, int v) {
        this.zzc = zzx0;
        this.zzb = z;
        this.zza = zzr0;
    }

    public final zzaa zzb() {
        return new zzaa(this.zzc, true, this.zza, 0x7FFFFFFF);
    }

    public static zzaa zzc(zzr zzr0) {
        return new zzaa(new zzx(zzr0), false, zzq.zza, 0x7FFFFFFF);
    }

    public final Iterable zzd(CharSequence charSequence0) {
        return new zzy(this, charSequence0);
    }

    public final List zzf(CharSequence charSequence0) {
        charSequence0.getClass();
        Iterator iterator0 = this.zzh(charSequence0);
        ArrayList arrayList0 = new ArrayList();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            arrayList0.add(((String)object0));
        }
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    private final Iterator zzh(CharSequence charSequence0) {
        return new zzw(this.zzc, this, charSequence0, this.zzc.zza);
    }
}

