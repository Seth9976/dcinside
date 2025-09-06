package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

final class zzfue extends zzfua implements Serializable {
    private final Pattern zza;

    zzfue(Pattern pattern0) {
        pattern0.getClass();
        this.zza = pattern0;
    }

    @Override
    public final String toString() {
        return this.zza.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzfua
    public final zzftz zza(CharSequence charSequence0) {
        return new zzfud(this.zza.matcher(charSequence0));
    }
}

