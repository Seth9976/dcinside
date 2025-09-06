package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public class zzfu extends zzfz {
    protected zzfw zzrj;

    @Override  // com.google.android.gms.internal.clearcut.zzfz
    public Object clone() throws CloneNotSupportedException {
        return this.zzeo();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfz
    public void zza(zzfs zzfs0) throws IOException {
        if(this.zzrj == null) {
            return;
        }
        for(int v = 0; v < this.zzrj.size(); ++v) {
            this.zzrj.zzaq(v).zza(zzfs0);
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfz
    protected int zzen() {
        if(this.zzrj != null) {
            for(int v = 0; v < this.zzrj.size(); ++v) {
                this.zzrj.zzaq(v).zzen();
            }
        }
        return 0;
    }

    public zzfu zzeo() throws CloneNotSupportedException {
        zzfu zzfu0 = (zzfu)super.zzep();
        zzfy.zza(this, zzfu0);
        return zzfu0;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfz
    public zzfz zzep() throws CloneNotSupportedException {
        return (zzfu)this.clone();
    }
}

