package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class zzfvc {
    private final zzfvb zza;

    private zzfvc(zzfvb zzfvb0) {
        this.zza = zzfvb0;
    }

    public static zzfvc zza(int v) {
        return new zzfvc(new zzfuy(4000));
    }

    public static zzfvc zzb(zzfty zzfty0) {
        return new zzfvc(new zzfuu(zzfty0));
    }

    public static zzfvc zzc(Pattern pattern0) {
        zzfue zzfue0 = new zzfue(pattern0);
        zzfun.zzi(!((zzfud)zzfue0.zza("")).zza.matches(), "The pattern may not match the empty string: %s", zzfue0);
        return new zzfvc(new zzfuw(zzfue0));
    }

    public final Iterable zzd(CharSequence charSequence0) {
        charSequence0.getClass();
        return new zzfuz(this, charSequence0);
    }

    public final List zzf(CharSequence charSequence0) {
        charSequence0.getClass();
        Iterator iterator0 = this.zzg(charSequence0);
        ArrayList arrayList0 = new ArrayList();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            arrayList0.add(((String)object0));
        }
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    private final Iterator zzg(CharSequence charSequence0) {
        return this.zza.zza(this, charSequence0);
    }
}

