package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

final class zzuu implements zzud, zzue {
    private final zzue[] zza;
    private final IdentityHashMap zzb;
    private final ArrayList zzc;
    private final HashMap zzd;
    @Nullable
    private zzud zze;
    @Nullable
    private zzwj zzf;
    private zzue[] zzg;
    private zzwa zzh;

    public zzuu(zztr zztr0, long[] arr_v, zzue[] arr_zzue) {
        this.zza = arr_zzue;
        this.zzc = new ArrayList();
        this.zzd = new HashMap();
        this.zzh = new zztq(zzfxn.zzn(), zzfxn.zzn());
        this.zzb = new IdentityHashMap();
        this.zzg = new zzue[0];
        for(int v = 0; v < arr_zzue.length; ++v) {
            long v1 = arr_v[v];
            if(v1 != 0L) {
                this.zza[v] = new zzwg(arr_zzue[v], v1);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zza(long v, zzlp zzlp0) {
        zzue[] arr_zzue = this.zzg;
        return arr_zzue.length <= 0 ? this.zza[0].zza(v, zzlp0) : arr_zzue[0].zza(v, zzlp0);
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzd() {
        zzue[] arr_zzue = this.zzg;
        long v = 0x8000000000000001L;
        for(int v1 = 0; v1 < arr_zzue.length; ++v1) {
            zzue zzue0 = arr_zzue[v1];
            long v2 = zzue0.zzd();
            if(v2 != 0x8000000000000001L) {
                if(v == 0x8000000000000001L) {
                    zzue[] arr_zzue1 = this.zzg;
                    for(int v3 = 0; v3 < arr_zzue1.length; ++v3) {
                        zzue zzue1 = arr_zzue1[v3];
                        if(zzue1 == zzue0) {
                            break;
                        }
                        if(zzue1.zze(v2) != v2) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    v = v2;
                }
                else if(v2 != v) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            }
            else if(v != 0x8000000000000001L && zzue0.zze(v) != v) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zze(long v) {
        long v1 = this.zzg[0].zze(v);
        for(int v2 = 1; true; ++v2) {
            zzue[] arr_zzue = this.zzg;
            if(v2 >= arr_zzue.length) {
                break;
            }
            if(arr_zzue[v2].zze(v1) != v1) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzf(zzxv[] arr_zzxv, boolean[] arr_z, zzvy[] arr_zzvy, boolean[] arr_z1, long v) {
        int[] arr_v = new int[arr_zzxv.length];
        int[] arr_v1 = new int[arr_zzxv.length];
        for(int v1 = 0; true; ++v1) {
            Integer integer0 = null;
            if(v1 >= arr_zzxv.length) {
                break;
            }
            zzvy zzvy0 = arr_zzvy[v1];
            if(zzvy0 != null) {
                integer0 = (Integer)this.zzb.get(zzvy0);
            }
            arr_v[v1] = integer0 == null ? -1 : ((int)integer0);
            zzxv zzxv0 = arr_zzxv[v1];
            if(zzxv0 == null) {
                arr_v1[v1] = -1;
            }
            else {
                zzbr zzbr0 = zzxv0.zzg();
                arr_v1[v1] = Integer.parseInt(zzbr0.zzb.substring(0, zzbr0.zzb.indexOf(":")));
            }
        }
        this.zzb.clear();
        zzvy[] arr_zzvy1 = new zzvy[arr_zzxv.length];
        zzvy[] arr_zzvy2 = new zzvy[arr_zzxv.length];
        zzxv[] arr_zzxv1 = new zzxv[arr_zzxv.length];
        ArrayList arrayList0 = new ArrayList(this.zza.length);
        long v2 = v;
        for(int v3 = 0; v3 < this.zza.length; ++v3) {
            for(int v4 = 0; v4 < arr_zzxv.length; ++v4) {
                arr_zzvy2[v4] = arr_v[v4] == v3 ? arr_zzvy[v4] : null;
                if(arr_v1[v4] == v3) {
                    zzxv zzxv1 = arr_zzxv[v4];
                    zzxv1.getClass();
                    zzbr zzbr1 = zzxv1.zzg();
                    zzbr zzbr2 = (zzbr)this.zzd.get(zzbr1);
                    zzbr2.getClass();
                    arr_zzxv1[v4] = new zzut(zzxv1, zzbr2);
                }
                else {
                    arr_zzxv1[v4] = null;
                }
            }
            long v5 = this.zza[v3].zzf(arr_zzxv1, arr_z, arr_zzvy2, arr_z1, v2);
            if(v3 == 0) {
                v2 = v5;
            }
            else if(v5 != v2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for(int v6 = 0; true; ++v6) {
                boolean z1 = true;
                if(v6 >= arr_zzxv.length) {
                    break;
                }
                if(arr_v1[v6] == v3) {
                    zzvy zzvy1 = arr_zzvy2[v6];
                    zzvy1.getClass();
                    arr_zzvy1[v6] = zzvy1;
                    this.zzb.put(zzvy1, v3);
                    z = true;
                }
                else if(arr_v[v6] == v3) {
                    if(arr_zzvy2[v6] != null) {
                        z1 = false;
                    }
                    zzcw.zzf(z1);
                }
            }
            if(z) {
                arrayList0.add(this.zza[v3]);
            }
        }
        System.arraycopy(arr_zzvy1, 0, arr_zzvy, 0, arr_zzxv.length);
        this.zzg = (zzue[])arrayList0.toArray(new zzue[0]);
        this.zzh = new zztq(arrayList0, zzfyd.zzb(arrayList0, new zzus()));
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzvz
    public final void zzg(zzwa zzwa0) {
        zzue zzue0 = (zzue)zzwa0;
        zzud zzud0 = this.zze;
        zzud0.getClass();
        zzud0.zzg(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final zzwj zzh() {
        zzwj zzwj0 = this.zzf;
        zzwj0.getClass();
        return zzwj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzud
    public final void zzi(zzue zzue0) {
        this.zzc.remove(zzue0);
        if(!this.zzc.isEmpty()) {
            return;
        }
        zzue[] arr_zzue = this.zza;
        int v1 = 0;
        for(int v = 0; v < arr_zzue.length; ++v) {
            v1 += arr_zzue[v].zzh().zzb;
        }
        zzbr[] arr_zzbr = new zzbr[v1];
        for(int v2 = 0; true; ++v2) {
            zzue[] arr_zzue1 = this.zza;
            if(v2 >= arr_zzue1.length) {
                break;
            }
            zzwj zzwj0 = arr_zzue1[v2].zzh();
            int v4 = zzwj0.zzb;
            int v5 = 0;
            for(int v3 = 0; v5 < v4; ++v3) {
                zzbr zzbr0 = zzwj0.zzb(v5);
                zzab[] arr_zzab = new zzab[zzbr0.zza];
                for(int v6 = 0; v6 < zzbr0.zza; ++v6) {
                    zzab zzab0 = zzbr0.zzb(v6);
                    zzz zzz0 = zzab0.zzb();
                    zzz0.zzM(v2 + ":" + (zzab0.zza == null ? "" : zzab0.zza));
                    arr_zzab[v6] = zzz0.zzag();
                }
                zzbr zzbr1 = new zzbr(v2 + ":" + zzbr0.zzb, arr_zzab);
                this.zzd.put(zzbr1, zzbr0);
                arr_zzbr[v3] = zzbr1;
                ++v5;
            }
        }
        this.zzf = new zzwj(arr_zzbr);
        zzud zzud0 = this.zze;
        zzud0.getClass();
        zzud0.zzi(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzj(long v, boolean z) {
        zzue[] arr_zzue = this.zzg;
        for(int v1 = 0; v1 < arr_zzue.length; ++v1) {
            arr_zzue[v1].zzj(v, false);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzk() throws IOException {
        for(int v = 0; true; ++v) {
            zzue[] arr_zzue = this.zza;
            if(v >= arr_zzue.length) {
                break;
            }
            arr_zzue[v].zzk();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzl(zzud zzud0, long v) {
        this.zze = zzud0;
        Collections.addAll(this.zzc, this.zza);
        for(int v1 = 0; true; ++v1) {
            zzue[] arr_zzue = this.zza;
            if(v1 >= arr_zzue.length) {
                break;
            }
            arr_zzue[v1].zzl(this, v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzm(long v) {
        this.zzh.zzm(v);
    }

    public final zzue zzn(int v) {
        zzue zzue0 = this.zza[v];
        return zzue0 instanceof zzwg ? ((zzwg)zzue0).zzn() : zzue0;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final boolean zzo(zzkj zzkj0) {
        if(!this.zzc.isEmpty()) {
            int v = this.zzc.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((zzue)this.zzc.get(v1)).zzo(zzkj0);
            }
            return false;
        }
        return this.zzh.zzo(zzkj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}

