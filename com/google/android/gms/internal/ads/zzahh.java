package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

final class zzahh {
    private final byte[] zza;
    private final ArrayDeque zzb;
    private final zzaho zzc;
    private zzahi zzd;
    private int zze;
    private int zzf;
    private long zzg;

    public zzahh() {
        this.zza = new byte[8];
        this.zzb = new ArrayDeque();
        this.zzc = new zzaho();
    }

    public final void zza(zzahi zzahi0) {
        this.zzd = zzahi0;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    public final boolean zzc(zzaco zzaco0) throws IOException {
        String s;
        int v4;
        int v3;
        zzcw.zzb(this.zzd);
        while(true) {
            zzahf zzahf0 = (zzahf)this.zzb.peek();
            if(zzahf0 != null && zzaco0.zzf() >= zzahf0.zzb) {
                zzahi zzahi0 = this.zzd;
                int v = ((zzahf)this.zzb.pop()).zza;
                ((zzahj)zzahi0).zza.zzj(v);
                return true;
            }
            int v1 = this.zze;
            if(v1 == 0) {
                long v2 = this.zzc.zzd(zzaco0, true, false, 4);
                if(v2 == -2L) {
                    zzaco0.zzj();
                    while(true) {
                        zzaco0.zzh(this.zza, 0, 4);
                        v3 = zzaho.zzb(this.zza[0]);
                        if(v3 == -1 || v3 > 4) {
                            zzaco0.zzk(1);
                            continue;
                        }
                        else {
                            v4 = (int)zzaho.zzc(this.zza, v3, false);
                            zzahj zzahj0 = (zzahj)this.zzd;
                            switch(v4) {
                                case 0x1654AE6B: {
                                    break;
                                }
                                case 357149030: 
                                case 0x1C53BB6B: 
                                case 0x1F43B675: {
                                }
                            }
                        }
                        break;
                    }
                    zzaco0.zzk(v3);
                    v2 = (long)v4;
                }
                if(v2 == -1L) {
                    return false;
                }
                this.zzf = (int)v2;
                this.zze = 1;
                this.zzg = this.zzc.zzd(zzaco0, false, true, 8);
                this.zze = 2;
            }
            else if(v1 == 1) {
                this.zzg = this.zzc.zzd(zzaco0, false, true, 8);
                this.zze = 2;
            }
            int v5 = this.zzf;
            zzahj zzahj1 = (zzahj)this.zzd;
            zzahm zzahm0 = zzahj1.zza;
            switch(v5) {
                case 0xA1: 
                case 0xA3: 
                case 0xA5: 
                case 0x41ED: 
                case 0x4255: 
                case 18402: 
                case 0x53AB: 
                case 25506: 
                case 30322: {
                    zzahm0.zzh(v5, ((int)this.zzg), zzaco0);
                    this.zze = 0;
                    return true;
                }
                case 0xB5: 
                case 0x4489: 
                case 0x55D1: 
                case 21970: 
                case 0x55D3: 
                case 0x55D4: 
                case 0x55D5: 
                case 0x55D6: 
                case 0x55D7: 
                case 0x55D8: 
                case 0x55D9: 
                case 0x55DA: 
                case 30323: 
                case 30324: 
                case 30325: {
                    long v11 = this.zzg;
                    if(v11 != 4L && v11 != 8L) {
                        throw zzbc.zza(("Invalid float size: " + v11), null);
                    }
                    long v12 = this.zzd(zzaco0, ((int)v11));
                    zzahj1.zza.zzk(v5, (((int)v11) == 4 ? ((double)Float.intBitsToFloat(((int)v12))) : Double.longBitsToDouble(v12)));
                    this.zze = 0;
                    return true;
                }
                case 0x86: 
                case 17026: 
                case 0x536E: 
                case 0x22B59C: {
                    long v8 = this.zzg;
                    if(v8 > 0x7FFFFFFFL) {
                        throw zzbc.zza(("String element size: " + v8), null);
                    }
                    int v9 = (int)v8;
                    if(v9 == 0) {
                        s = "";
                    }
                    else {
                        byte[] arr_b = new byte[v9];
                        zzaco0.zzi(arr_b, 0, v9);
                        while(v9 > 0 && arr_b[v9 - 1] == 0) {
                            --v9;
                        }
                        s = new String(arr_b, 0, v9);
                    }
                    zzahj1.zza.zzn(v5, s);
                    this.zze = 0;
                    return true;
                }
                case 0x83: 
                case 0x88: 
                case 0x9B: 
                case 0x9F: 
                case 0xB0: 
                case 0xB3: 
                case 0xBA: 
                case 0xD7: 
                case 0xE7: 
                case 0xEE: 
                case 0xF1: 
                case 0xFB: 
                case 0x41E7: 
                case 16980: 
                case 17029: 
                case 0x42F7: 
                case 18401: 
                case 18408: 
                case 0x5031: 
                case 20530: 
                case 21420: 
                case 0x53B8: 
                case 0x54B0: 
                case 0x54B2: 
                case 21690: 
                case 21930: 
                case 0x55B2: 
                case 0x55B9: 
                case 0x55BA: 
                case 0x55BB: 
                case 0x55BC: 
                case 0x55BD: 
                case 0x55EE: 
                case 0x56AA: 
                case 22203: 
                case 0x6264: 
                case 30114: 
                case 30321: 
                case 2352003: 
                case 2807729: {
                    long v6 = this.zzg;
                    if(v6 > 8L) {
                        throw zzbc.zza(("Invalid integer size: " + v6), null);
                    }
                    long v7 = this.zzd(zzaco0, ((int)v6));
                    zzahj1.zza.zzl(v5, v7);
                    this.zze = 0;
                    return true;
                }
                case 0xA0: 
                case 0xA6: 
                case 0xAE: 
                case 0xB7: 
                case 0xBB: 
                case 0xE0: 
                case 0xE1: 
                case 0x41E4: 
                case 18407: 
                case 0x4DBB: 
                case 0x5034: 
                case 0x5035: 
                case 0x55B0: 
                case 0x55D0: 
                case 0x6240: 
                case 0x6D80: 
                case 30113: 
                case 30320: 
                case 290298740: 
                case 357149030: 
                case 0x1654AE6B: 
                case 0x18538067: 
                case 0x1A45DFA3: 
                case 0x1C53BB6B: 
                case 0x1F43B675: {
                    long v10 = zzaco0.zzf();
                    zzahf zzahf1 = new zzahf(v5, this.zzg + v10, null);
                    this.zzb.push(zzahf1);
                    ((zzahj)this.zzd).zza.zzm(this.zzf, v10, this.zzg);
                    this.zze = 0;
                    return true;
                }
                default: {
                    zzaco0.zzk(((int)this.zzg));
                    this.zze = 0;
                    break;
                }
            }
        }
    }

    private final long zzd(zzaco zzaco0, int v) throws IOException {
        zzaco0.zzi(this.zza, 0, v);
        long v2 = 0L;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 = v2 << 8 | ((long)(this.zza[v1] & 0xFF));
        }
        return v2;
    }
}

