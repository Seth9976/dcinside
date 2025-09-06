package com.google.android.gms.internal.vision;

import java.util.Iterator;

final class zzli extends zzlo {
    private final zzlh zza;

    private zzli(zzlh zzlh0) {
        this.zza = zzlh0;
        super(zzlh0, null);
    }

    zzli(zzlh zzlh0, zzlg zzlg0) {
        this(zzlh0);
    }

    @Override  // com.google.android.gms.internal.vision.zzlo
    public final Iterator iterator() {
        return new zzlj(this.zza, null);
    }
}

