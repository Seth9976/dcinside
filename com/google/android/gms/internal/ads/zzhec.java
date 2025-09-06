package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class zzhec implements zzara, Closeable, Iterator {
    private static final zzaqz zza;
    protected zzaqw zzb;
    protected zzhed zzc;
    zzaqz zzd;
    long zze;
    long zzf;
    private final List zzg;

    static {
        zzhec.zza = new zzheb("eof ");
        zzhej.zzb(zzhec.class);
    }

    public zzhec() {
        this.zzd = null;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = new ArrayList();
    }

    @Override
    public void close() throws IOException {
    }

    @Override
    public final boolean hasNext() {
        zzaqz zzaqz0 = this.zzd;
        if(zzaqz0 == zzhec.zza) {
            return false;
        }
        if(zzaqz0 != null) {
            return true;
        }
        try {
            this.zzd = this.zzc();
            return true;
        }
        catch(NoSuchElementException unused_ex) {
            this.zzd = zzhec.zza;
            return false;
        }
    }

    @Override
    public final Object next() {
        return this.zzc();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.getClass().getSimpleName());
        stringBuilder0.append("[");
        for(int v = 0; v < this.zzg.size(); ++v) {
            if(v > 0) {
                stringBuilder0.append(";");
            }
            stringBuilder0.append(((zzaqz)this.zzg.get(v)).toString());
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public final zzaqz zzc() {
        zzaqz zzaqz0 = this.zzd;
        if(zzaqz0 != null && zzaqz0 != zzhec.zza) {
            this.zzd = null;
            return zzaqz0;
        }
        zzhed zzhed0 = this.zzc;
        if(zzhed0 != null && this.zze < this.zzf) {
            try {
                synchronized(zzhed0) {
                    this.zzc.zze(this.zze);
                    zzaqz zzaqz1 = this.zzb.zzb(this.zzc, this);
                    this.zze = this.zzc.zzb();
                    return zzaqz1;
                }
            }
            catch(EOFException unused_ex) {
                throw new NoSuchElementException();
            }
            catch(IOException unused_ex) {
                throw new NoSuchElementException();
            }
        }
        this.zzd = zzhec.zza;
        throw new NoSuchElementException();
    }

    public final List zzd() {
        return this.zzc != null && this.zzd != zzhec.zza ? new zzhei(this.zzg, this) : this.zzg;
    }

    public final void zze(zzhed zzhed0, long v, zzaqw zzaqw0) throws IOException {
        this.zzc = zzhed0;
        this.zze = zzhed0.zzb();
        zzhed0.zze(zzhed0.zzb() + v);
        this.zzf = zzhed0.zzb();
        this.zzb = zzaqw0;
    }
}

