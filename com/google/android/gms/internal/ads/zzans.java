package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class zzans implements zzank {
    final zzant zza;
    private final zzdx zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzans(zzant zzant0, int v) {
        this.zza = zzant0;
        super();
        this.zzb = new zzdx(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzank
    public final void zza(zzdy zzdy0) {
        zzef zzef3;
        zzef zzef1;
        if(zzdy0.zzm() == 2) {
            zzef zzef0 = (zzef)this.zza.zzb.get(0);
            if((zzdy0.zzm() & 0x80) != 0) {
                zzdy0.zzM(1);
                int v = zzdy0.zzq();
                zzdy0.zzM(3);
                zzdy0.zzG(this.zzb, 2);
                this.zzb.zzn(3);
                int v1 = this.zzb.zzd(13);
                this.zza.zzr = v1;
                zzdy0.zzG(this.zzb, 2);
                this.zzb.zzn(4);
                zzdy0.zzM(this.zzb.zzd(12));
                this.zzc.clear();
                this.zzd.clear();
                int v2 = zzdy0.zzb();
                while(v2 > 0) {
                    zzdy0.zzG(this.zzb, 5);
                    int v3 = this.zzb.zzd(8);
                    this.zzb.zzn(3);
                    int v4 = this.zzb.zzd(13);
                    this.zzb.zzn(4);
                    int v5 = this.zzb.zzd(12);
                    int v6 = zzdy0.zzd();
                    int v7 = v6 + v5;
                    String s = null;
                    List list0 = null;
                    int v8 = -1;
                    int v9 = 0;
                    while(zzdy0.zzd() < v7) {
                        int v10 = zzdy0.zzm();
                        int v11 = zzdy0.zzd() + zzdy0.zzm();
                        if(v11 > v7) {
                            break;
                        }
                        switch(v10) {
                            case 5: {
                                long v12 = zzdy0.zzu();
                                if(v12 == 1094921523L) {
                                    zzef1 = zzef0;
                                    v8 = 0x81;
                                }
                                else if(v12 == 1161904947L) {
                                    zzef1 = zzef0;
                                    v8 = 0x87;
                                }
                                else if(v12 == 1094921524L) {
                                label_48:
                                    zzef1 = zzef0;
                                    v8 = 0xAC;
                                }
                                else {
                                    if(v12 == 1212503619L) {
                                        zzef1 = zzef0;
                                        v8 = 36;
                                        break;
                                    }
                                    else {
                                        zzef1 = zzef0;
                                        goto label_51;
                                    }
                                    goto label_48;
                                }
                            label_51:
                                break;
                            }
                            case 10: {
                                String s1 = zzdy0.zzB(3, StandardCharsets.UTF_8).trim();
                                v9 = zzdy0.zzm();
                                zzef1 = zzef0;
                                s = s1;
                                break;
                            }
                            case 89: {
                                ArrayList arrayList0 = new ArrayList();
                                while(zzdy0.zzd() < v11) {
                                    String s2 = zzdy0.zzB(3, StandardCharsets.UTF_8).trim();
                                    int v13 = zzdy0.zzm();
                                    byte[] arr_b = new byte[4];
                                    zzdy0.zzH(arr_b, 0, 4);
                                    arrayList0.add(new zzanu(s2, v13, arr_b));
                                }
                                zzef1 = zzef0;
                                list0 = arrayList0;
                                v8 = 89;
                                break;
                            }
                            case 106: {
                                zzef1 = zzef0;
                                v8 = 0x81;
                                break;
                            }
                            case 0x7A: {
                                zzef1 = zzef0;
                                v8 = 0x87;
                                break;
                            }
                            case 0x7B: {
                                zzef1 = zzef0;
                                v8 = 0x8A;
                                break;
                            }
                            case 0x7F: {
                                switch(zzdy0.zzm()) {
                                    case 14: {
                                        zzef1 = zzef0;
                                        v8 = 0x88;
                                        break;
                                    }
                                    case 21: {
                                        zzef1 = zzef0;
                                        v8 = 0xAC;
                                        break;
                                    }
                                    case 33: {
                                        zzef1 = zzef0;
                                        v8 = 0x8B;
                                        break;
                                    }
                                    default: {
                                        zzef1 = zzef0;
                                    }
                                }
                                break;
                            }
                            default: {
                                zzef1 = zzef0;
                                if(v10 == 0x6F) {
                                    v8 = 0x101;
                                }
                            }
                        }
                        zzdy0.zzM(v11 - zzdy0.zzd());
                        zzef0 = zzef1;
                    }
                    zzdy0.zzL(v7);
                    zzanv zzanv0 = new zzanv(v8, s, v9, list0, Arrays.copyOfRange(zzdy0.zzN(), v6, v7));
                    if(v3 == 5 || v3 == 6) {
                        v3 = zzanv0.zza;
                    }
                    v2 -= v5 + 5;
                    if(!this.zza.zzh.get(v4)) {
                        zzany zzany0 = this.zza.zze.zzb(v3, zzanv0);
                        this.zzd.put(v4, v4);
                        this.zzc.put(v4, zzany0);
                    }
                }
                zzef zzef2 = zzef0;
                int v14 = this.zzd.size();
                int v15 = 0;
                while(v15 < v14) {
                    int v16 = this.zzd.keyAt(v15);
                    int v17 = this.zzd.valueAt(v15);
                    this.zza.zzh.put(v16, true);
                    this.zza.zzi.put(v17, true);
                    zzany zzany1 = (zzany)this.zzc.valueAt(v15);
                    if(zzany1 == null) {
                        zzef3 = zzef2;
                    }
                    else {
                        zzef3 = zzef2;
                        zzany1.zzb(zzef3, this.zza.zzl, new zzanx(v, v16, 0x2000));
                        this.zza.zzg.put(v17, zzany1);
                    }
                    ++v15;
                    zzef2 = zzef3;
                }
                this.zza.zzg.remove(this.zze);
                this.zza.zzm = 0;
                zzant zzant0 = this.zza;
                if(zzant0.zzm == 0) {
                    zzant0.zzl.zzD();
                    zzant.zzp(this.zza, true);
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzank
    public final void zzb(zzef zzef0, zzacq zzacq0, zzanx zzanx0) {
    }
}

