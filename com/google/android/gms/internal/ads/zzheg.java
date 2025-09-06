package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzheg extends zzhej {
    final Logger zza;

    public zzheg(String s) {
        this.zza = Logger.getLogger(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzhej
    public final void zza(String s) {
        this.zza.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", s);
    }
}

