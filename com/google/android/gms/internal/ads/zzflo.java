package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class zzflo {
    private static final Pattern zza;
    private final List zzb;

    static {
        zzflo.zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    public zzflo() {
        this.zzb = new ArrayList();
    }

    public final List zza() {
        return this.zzb;
    }

    public final void zzb(View view0, zzfkw zzfkw0, @Nullable String s) {
        if(view0 == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if(!zzflo.zza.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        zzfln zzfln0 = null;
        for(Object object0: this.zzb) {
            zzfln zzfln1 = (zzfln)object0;
            if(zzfln1.zzb().get() == view0) {
                zzfln0 = zzfln1;
                break;
            }
        }
        if(zzfln0 == null) {
            zzfln zzfln2 = new zzfln(view0, zzfkw0, "Ad overlay");
            this.zzb.add(zzfln2);
        }
    }

    public final void zzc() {
        this.zzb.clear();
    }
}

