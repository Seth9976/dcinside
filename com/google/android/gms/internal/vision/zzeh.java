package com.google.android.gms.internal.vision;

import java.io.Serializable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public class zzeh extends zzdn implements Serializable {
    private final transient zzef zza;
    private final transient int zzb;

    zzeh(zzef zzef0, int v) {
        this.zza = zzef0;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.vision.zzdo
    public boolean equals(@NullableDecl Object object0) {
        return super.equals(object0);
    }

    @Override  // com.google.android.gms.internal.vision.zzdo
    public int hashCode() {
        return super.hashCode();
    }

    @Override  // com.google.android.gms.internal.vision.zzdo
    public String toString() {
        return super.toString();
    }

    @Override  // com.google.android.gms.internal.vision.zzdo
    public final Map zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.vision.zzdo
    public final boolean zza(@NullableDecl Object object0) {
        return object0 != null && super.zza(object0);
    }

    @Override  // com.google.android.gms.internal.vision.zzdo
    final Map zzb() {
        throw new AssertionError("should never be called");
    }
}

