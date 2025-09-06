package com.google.android.gms.internal.clearcut;

final class zzec implements zzdm {
    private final String info;
    private final zzdo zzmn;
    private final zzed zzng;

    zzec(zzdo zzdo0, String s, Object[] arr_object) {
        this.zzmn = zzdo0;
        this.info = s;
        this.zzng = new zzed(zzdo0.getClass(), s, arr_object);
    }

    public final int getFieldCount() {
        return this.zzng.zznj;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdm
    public final int zzcf() {
        return (this.zzng.flags & 1) == 1 ? zzg.zzkl : zzg.zzkm;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdm
    public final boolean zzcg() {
        return (this.zzng.flags & 2) == 2;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdm
    public final zzdo zzch() {
        return this.zzmn;
    }

    final zzed zzco() {
        return this.zzng;
    }

    public final int zzcp() {
        return this.zzng.zzmk;
    }

    public final int zzcq() {
        return this.zzng.zzml;
    }

    public final int zzcr() {
        return this.zzng.zznm;
    }

    public final int zzcs() {
        return this.zzng.zzno;
    }

    final int[] zzct() {
        return this.zzng.zzms;
    }

    public final int zzcu() {
        return this.zzng.zznn;
    }

    public final int zzcv() {
        return this.zzng.zzmm;
    }
}

