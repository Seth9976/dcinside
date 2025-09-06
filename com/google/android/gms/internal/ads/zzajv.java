package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import h4.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

final class zzajv extends zzajt {
    @Nullable
    private zzaju zza;
    private int zzb;
    private boolean zzc;
    @Nullable
    private zzady zzd;
    @Nullable
    private zzadw zze;

    @Override  // com.google.android.gms.internal.ads.zzajt
    protected final long zza(zzdy zzdy0) {
        int v = 0;
        if((zzdy0.zzN()[0] & 1) == 1) {
            return -1L;
        }
        int v1 = zzdy0.zzN()[0];
        zzaju zzaju0 = this.zza;
        zzcw.zzb(zzaju0);
        int v2 = zzaju0.zzd[v1 >> 1 & 0xFF >>> 8 - zzaju0.zze].zza ? zzaju0.zza.zzf : zzaju0.zza.zze;
        if(this.zzc) {
            v = (this.zzb + v2) / 4;
        }
        if(zzdy0.zzc() < zzdy0.zze() + 4) {
            byte[] arr_b = Arrays.copyOf(zzdy0.zzN(), zzdy0.zze() + 4);
            zzdy0.zzJ(arr_b, arr_b.length);
        }
        else {
            zzdy0.zzK(zzdy0.zze() + 4);
        }
        byte[] arr_b1 = zzdy0.zzN();
        arr_b1[zzdy0.zze() - 4] = (byte)(((int)(((long)v) & 0xFFL)));
        arr_b1[zzdy0.zze() - 3] = (byte)(((int)(((long)v) >>> 8 & 0xFFL)));
        arr_b1[zzdy0.zze() - 2] = (byte)(((int)(((long)v) >>> 16 & 0xFFL)));
        arr_b1[zzdy0.zze() - 1] = (byte)(((int)(((long)v) >>> 24 & 0xFFL)));
        this.zzc = true;
        this.zzb = v2;
        return (long)v;
    }

    @Override  // com.google.android.gms.internal.ads.zzajt
    protected final void zzb(boolean z) {
        super.zzb(z);
        if(z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzajt
    @e(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzdy zzdy0, long v, zzajq zzajq0) throws IOException {
        int v24;
        long v18;
        zzady zzady1;
        int v16;
        zzaju zzaju0;
        if(this.zza != null) {
            zzajq0.zza.getClass();
            return false;
        }
        zzady zzady0 = this.zzd;
        if(zzady0 == null) {
            zzadz.zzd(1, zzdy0, false);
            int v1 = zzdy0.zzj();
            int v2 = zzdy0.zzm();
            int v3 = zzdy0.zzj();
            int v4 = zzdy0.zzi();
            int v5 = zzdy0.zzi();
            int v6 = zzdy0.zzi();
            int v7 = zzdy0.zzm();
            this.zzd = new zzady(v1, v2, v3, (v4 > 0 ? v4 : -1), (v5 > 0 ? v5 : -1), (v6 > 0 ? v6 : -1), ((int)Math.pow(2.0, v7 & 15)), ((int)Math.pow(2.0, (v7 & 0xF0) >> 4)), 1 == (zzdy0.zzm() & 1), Arrays.copyOf(zzdy0.zzN(), zzdy0.zze()));
            goto label_18;
        }
        zzadw zzadw0 = this.zze;
        if(zzadw0 == null) {
            this.zze = zzadz.zzc(zzdy0, true, true);
        label_18:
            zzaju0 = null;
        }
        else {
            byte[] arr_b = new byte[zzdy0.zze()];
            System.arraycopy(zzdy0.zzN(), 0, arr_b, 0, zzdy0.zze());
            int v8 = zzady0.zza;
            zzadz.zzd(5, zzdy0, false);
            int v9 = zzdy0.zzm();
            zzadv zzadv0 = new zzadv(zzdy0.zzN());
            zzadv0.zzc(zzdy0.zzd() * 8);
            int v10 = 0;
            while(true) {
                int v11 = 2;
                if(v10 >= v9 + 1) {
                    goto label_77;
                }
                if(zzadv0.zzb(24) != 0x564342) {
                    throw zzbc.zza(("expected code book to start with [0x56, 0x43, 0x42] at " + zzadv0.zza()), null);
                }
                int v12 = zzadv0.zzb(16);
                int v13 = zzadv0.zzb(24);
                if(zzadv0.zzd()) {
                    zzadv0.zzc(5);
                    for(int v15 = 0; v15 < v13; v15 += zzadv0.zzb(zzadz.zza(v13 - v15))) {
                    }
                }
                else {
                    boolean z = zzadv0.zzd();
                    for(int v14 = 0; v14 < v13; ++v14) {
                        if(!z) {
                            zzadv0.zzc(5);
                        }
                        else if(zzadv0.zzd()) {
                            zzadv0.zzc(5);
                        }
                    }
                }
                v16 = zzadv0.zzb(4);
                if(v16 > 2) {
                    break;
                }
                if(v16 == 1) {
                    v11 = 1;
                }
                else if(v16 != 2) {
                    zzady1 = zzady0;
                    goto label_72;
                }
                zzadv0.zzc(0x20);
                zzadv0.zzc(0x20);
                int v17 = zzadv0.zzb(4);
                zzadv0.zzc(1);
                if(v11 != 1) {
                    zzady1 = zzady0;
                    v18 = ((long)v12) * ((long)v13);
                }
                else if(v12 == 0) {
                    zzady1 = zzady0;
                    v18 = 0L;
                }
                else {
                    zzady1 = zzady0;
                    v18 = (long)Math.floor(Math.pow(((long)v13), 1.0 / ((double)(((long)v12)))));
                }
                zzadv0.zzc(((int)(v18 * ((long)(v17 + 1)))));
            label_72:
                ++v10;
                zzady0 = zzady1;
            }
            throw zzbc.zza(("lookup type greater than 2 not decodable: " + v16), null);
        label_77:
            int v19 = zzadv0.zzb(6);
            for(int v20 = 0; v20 < v19 + 1; ++v20) {
                if(zzadv0.zzb(16) != 0) {
                    throw zzbc.zza("placeholder of time domain transforms not zeroed out", null);
                }
            }
            int v21 = zzadv0.zzb(6) + 1;
            int v22 = 0;
            while(v22 < v21) {
                int v23 = zzadv0.zzb(16);
            alab1:
                switch(v23) {
                    case 0: {
                        v24 = v21;
                        zzadv0.zzc(8);
                        zzadv0.zzc(16);
                        zzadv0.zzc(16);
                        zzadv0.zzc(6);
                        zzadv0.zzc(8);
                        int v25 = zzadv0.zzb(4);
                        for(int v26 = 0; v26 < v25 + 1; ++v26) {
                            zzadv0.zzc(8);
                        }
                        break;
                    }
                    case 1: {
                        int v27 = zzadv0.zzb(5);
                        int[] arr_v = new int[v27];
                        int v29 = -1;
                        for(int v28 = 0; v28 < v27; ++v28) {
                            int v30 = zzadv0.zzb(4);
                            arr_v[v28] = v30;
                            if(v30 > v29) {
                                v29 = v30;
                            }
                        }
                        int v31 = v29 + 1;
                        int[] arr_v1 = new int[v31];
                        for(int v32 = 0; v32 < v31; ++v32) {
                            arr_v1[v32] = zzadv0.zzb(3) + 1;
                            int v33 = zzadv0.zzb(2);
                            if(v33 > 0) {
                                zzadv0.zzc(8);
                            }
                            for(int v34 = 0; v34 < 1 << v33; ++v34) {
                                zzadv0.zzc(8);
                            }
                        }
                        v24 = v21;
                        zzadv0.zzc(2);
                        int v35 = zzadv0.zzb(4);
                        int v37 = 0;
                        for(int v36 = 0; true; ++v36) {
                            if(v36 >= v27) {
                                break alab1;
                            }
                            v37 += arr_v1[arr_v[v36]];
                            for(int v38 = 0; v38 < v37; ++v38) {
                                zzadv0.zzc(v35);
                            }
                        }
                    }
                    default: {
                        throw zzbc.zza(("floor type greater than 1 not decodable: " + v23), null);
                    }
                }
                ++v22;
                v21 = v24;
            }
            int v39 = zzadv0.zzb(6);
            for(int v40 = 0; v40 < v39 + 1; ++v40) {
                if(zzadv0.zzb(16) > 2) {
                    throw zzbc.zza("residueType greater than 2 is not decodable", null);
                }
                zzadv0.zzc(24);
                zzadv0.zzc(24);
                zzadv0.zzc(24);
                int v41 = zzadv0.zzb(6);
                zzadv0.zzc(8);
                int[] arr_v2 = new int[v41 + 1];
                for(int v42 = 0; v42 < v41 + 1; ++v42) {
                    int v43 = zzadv0.zzb(3);
                    arr_v2[v42] = (zzadv0.zzd() ? zzadv0.zzb(5) : 0) * 8 + v43;
                }
                for(int v44 = 0; v44 < v41 + 1; ++v44) {
                    for(int v45 = 0; v45 < 8; ++v45) {
                        if((arr_v2[v44] & 1 << v45) != 0) {
                            zzadv0.zzc(8);
                        }
                    }
                }
            }
            int v46 = zzadv0.zzb(6);
            for(int v47 = 0; v47 < v46 + 1; ++v47) {
                int v48 = zzadv0.zzb(16);
                if(v48 == 0) {
                    int v49 = zzadv0.zzd() ? zzadv0.zzb(4) + 1 : 1;
                    if(zzadv0.zzd()) {
                        int v50 = zzadv0.zzb(8);
                        for(int v51 = 0; v51 < v50 + 1; ++v51) {
                            zzadv0.zzc(zzadz.zza(v8 - 1));
                            zzadv0.zzc(zzadz.zza(v8 - 1));
                        }
                    }
                    if(zzadv0.zzb(2) != 0) {
                        throw zzbc.zza("to reserved bits must be zero after mapping coupling steps", null);
                    }
                    if(v49 > 1) {
                        for(int v52 = 0; v52 < v8; ++v52) {
                            zzadv0.zzc(4);
                        }
                    }
                    for(int v53 = 0; v53 < v49; ++v53) {
                        zzadv0.zzc(8);
                        zzadv0.zzc(8);
                        zzadv0.zzc(8);
                    }
                }
                else {
                    zzdo.zzc("VorbisUtil", "mapping type other than 0 not supported: " + v48);
                }
            }
            int v54 = zzadv0.zzb(6);
            zzadx[] arr_zzadx = new zzadx[v54 + 1];
            for(int v55 = 0; v55 < v54 + 1; ++v55) {
                arr_zzadx[v55] = new zzadx(zzadv0.zzd(), zzadv0.zzb(16), zzadv0.zzb(16), zzadv0.zzb(8));
            }
            if(!zzadv0.zzd()) {
                throw zzbc.zza("framing bit after modes not set as expected", null);
            }
            zzaju0 = new zzaju(zzady0, zzadw0, arr_b, arr_zzadx, zzadz.zza(v54));
        }
        this.zza = zzaju0;
        if(zzaju0 == null) {
            return true;
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(zzaju0.zza.zzg);
        arrayList0.add(zzaju0.zzc);
        zzay zzay0 = zzadz.zzb(zzfxn.zzm(zzaju0.zzb.zza));
        zzz zzz0 = new zzz();
        zzz0.zzaa("audio/vorbis");
        zzz0.zzy(zzaju0.zza.zzd);
        zzz0.zzV(zzaju0.zza.zzc);
        zzz0.zzz(zzaju0.zza.zza);
        zzz0.zzab(zzaju0.zza.zzb);
        zzz0.zzN(arrayList0);
        zzz0.zzT(zzay0);
        zzajq0.zza = zzz0.zzag();
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzajt
    protected final void zzi(long v) {
        super.zzi(v);
        int v1 = 0;
        this.zzc = v != 0L;
        zzady zzady0 = this.zzd;
        if(zzady0 != null) {
            v1 = zzady0.zze;
        }
        this.zzb = v1;
    }
}

