package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public abstract class zzas implements zzdo {
    protected int zzex;
    private static boolean zzey = false;

    static {
    }

    public zzas() {
        this.zzex = 0;
    }

    void zzf(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdo
    public final zzbb zzr() {
        try {
            zzbg zzbg0 = zzbb.zzk(this.zzas());
            this.zzb(zzbg0.zzae());
            return zzbg0.zzad();
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Serializing " + this.getClass().getName() + " to a " + "ByteString" + " threw an IOException (should never happen).", iOException0);
        }
    }

    int zzs() {
        throw new UnsupportedOperationException();
    }
}

