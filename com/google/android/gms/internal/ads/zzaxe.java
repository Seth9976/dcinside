package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzaxe extends zzaxr {
    private static volatile String zzh;
    private static final Object zzi;

    static {
        zzaxe.zzi = new Object();
    }

    public zzaxe(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1) {
        super(zzawd0, "IDxTpItZJ7MAk3i5HMuj4prUf4vKa3D9/OjYTr4UdlN9pm9gEn8oAVH4br8ui6F4", "/bkPoQedf8H6er/z22s5Ugb2zQK/aJlVqqMiarhu0YY=", zzasc0, v, 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzB("E");
        if(zzaxe.zzh == null) {
            synchronized(zzaxe.zzi) {
                if(zzaxe.zzh == null) {
                    zzaxe.zzh = (String)this.zze.invoke(null, null);
                }
            }
        }
        synchronized(this.zzd) {
            this.zzd.zzB(zzaxe.zzh);
        }
    }
}

