package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

public final class zzadc {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final float zzi;
    public final int zzj;
    @Nullable
    public final String zzk;
    @Nullable
    public final zzfh zzl;

    private zzadc(List list0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, float f, int v9, @Nullable String s, @Nullable zzfh zzfh0) {
        this.zza = list0;
        this.zzb = v;
        this.zzc = v3;
        this.zzd = v4;
        this.zze = v5;
        this.zzf = v6;
        this.zzg = v7;
        this.zzh = v8;
        this.zzi = f;
        this.zzj = v9;
        this.zzk = s;
        this.zzl = zzfh0;
    }

    public static zzadc zza(zzdy zzdy0) throws zzbc {
        return zzadc.zzc(zzdy0, false, null);
    }

    public static zzadc zzb(zzdy zzdy0, zzfh zzfh0) throws zzbc {
        return zzadc.zzc(zzdy0, true, zzfh0);
    }

    private static zzadc zzc(zzdy zzdy0, boolean z, @Nullable zzfh zzfh0) throws zzbc {
        zzfd zzfd0;
        int v60;
        boolean z2;
        int v58;
        int v57;
        int v40;
        int v37;
        int v36;
        int v35;
        int v34;
        int v25;
        int v24;
        try {
            if(z) {
                zzdy0.zzM(4);
            }
            else {
                zzdy0.zzM(21);
            }
            int v = zzdy0.zzm();
            int v1 = zzdy0.zzm();
            int v2 = zzdy0.zzd();
            int v4 = 0;
            for(int v3 = 0; v3 < v1; ++v3) {
                zzdy0.zzM(1);
                int v5 = zzdy0.zzq();
                for(int v6 = 0; v6 < v5; ++v6) {
                    int v7 = zzdy0.zzq();
                    v4 += v7 + 4;
                    zzdy0.zzM(v7);
                }
            }
            zzdy0.zzL(v2);
            byte[] arr_b = new byte[v4];
            zzfh zzfh1 = zzfh0;
            int v8 = 0;
            int v9 = 0;
            int v10 = -1;
            int v11 = -1;
            int v12 = -1;
            int v13 = -1;
            int v14 = -1;
            int v15 = -1;
            int v16 = -1;
            int v17 = -1;
            float f = 1.0f;
            int v18 = -1;
            String s = null;
            while(v8 < v1) {
                int v19 = zzdy0.zzm() & 0x3F;
                int v20 = zzdy0.zzq();
                zzfh zzfh2 = zzfh1;
                int v21 = 0;
                while(v21 < v20) {
                    int v22 = zzdy0.zzq();
                    System.arraycopy(zzfk.zza, 0, arr_b, v9, 4);
                    System.arraycopy(zzdy0.zzN(), zzdy0.zzd(), arr_b, v9 + 4, v22);
                    int v23 = 0x20;
                    if(v19 != 0x20) {
                        v23 = v19;
                    }
                    else if(v21 == 0) {
                        zzfh2 = zzfk.zzd(arr_b, v9 + 4, v9 + 4 + v22);
                        v24 = v20;
                        v25 = 0x20;
                        v21 = 0;
                        goto label_184;
                    }
                    v24 = v20;
                    if(v23 == 33) {
                        if(v21 == 0) {
                            zzfe zzfe0 = zzfk.zzc(arr_b, v9 + 4, v9 + 4 + v22, zzfh2);
                            int v26 = zzfe0.zze;
                            int v27 = zzfe0.zzb + 8;
                            int v28 = zzfe0.zzd;
                            int v29 = zzfe0.zzh;
                            int v30 = zzfe0.zzc + 8;
                            int v31 = zzfe0.zzi;
                            int v32 = zzfe0.zzj;
                            float f1 = zzfe0.zzf;
                            int v33 = zzfe0.zzg;
                            zzez zzez0 = zzfe0.zza;
                            if(zzez0 == null) {
                                v34 = v33;
                                v35 = v29;
                                v36 = v26;
                                v25 = v19;
                                v37 = v27;
                            }
                            else {
                                v34 = v33;
                                v35 = v29;
                                v36 = v26;
                                v25 = v19;
                                v37 = v27;
                                s = zzcy.zzd(zzez0.zza, zzez0.zzb, zzez0.zzc, zzez0.zzd, zzez0.zze, zzez0.zzf);
                            }
                            v10 = v28;
                            v11 = v36;
                            v18 = v34;
                            v16 = v32;
                            v14 = v35;
                            f = f1;
                            v15 = v31;
                            v13 = v30;
                            v12 = v37;
                            goto label_184;
                        }
                        else {
                            v25 = v19;
                            goto label_180;
                        }
                        goto label_94;
                    }
                    else {
                    label_94:
                        v25 = v19;
                        if(v23 != 39 || v21 != 0) {
                        label_180:
                            v40 = v21;
                            v57 = v10;
                        }
                        else {
                            int v38 = v9 + 6;
                            int v39 = v9 + v22 + 3;
                            while(true) {
                                v40 = 0;
                                int v41 = arr_b[v39];
                                if(v41 != 0) {
                                    break;
                                }
                                if(v39 <= v38) {
                                    goto label_167;
                                }
                                --v39;
                            }
                            if(v41 != 0 && v39 > v38) {
                                zzfl zzfl0 = new zzfl(arr_b, v38, v39 + 1);
                            label_106:
                                while(zzfl0.zzg(16)) {
                                    int v42 = zzfl0.zza(8);
                                    int v43 = 0;
                                    while(v42 == 0xFF) {
                                        v43 += 0xFF;
                                        v42 = zzfl0.zza(8);
                                    }
                                    int v44 = zzfl0.zza(8);
                                    int v45 = 0;
                                    while(v44 == 0xFF) {
                                        v45 += 0xFF;
                                        v44 = zzfl0.zza(8);
                                    }
                                    if(v45 + v44 == 0 || !zzfl0.zzg(v45 + v44)) {
                                        break;
                                    }
                                    if(v43 + v42 != 0xB0) {
                                        continue;
                                    }
                                    int v46 = zzfl0.zzc();
                                    boolean z1 = zzfl0.zzh();
                                    int v47 = z1 ? zzfl0.zzc() : 0;
                                    int v48 = zzfl0.zzc();
                                    int v49 = 0;
                                    int v50 = -1;
                                    int v51 = -1;
                                    int v52 = -1;
                                    int v53 = -1;
                                    int v54 = -1;
                                    int v55 = -1;
                                    while(v49 <= v48) {
                                        v50 = zzfl0.zzc();
                                        v51 = zzfl0.zzc();
                                        int v56 = zzfl0.zza(6);
                                        if(v56 == 0x3F) {
                                            break label_106;
                                        }
                                        if(v56 == 0) {
                                            v57 = v10;
                                            v58 = Math.max(0, v46 - 30);
                                        }
                                        else {
                                            v57 = v10;
                                            v58 = Math.max(0, v56 + v46 - 0x1F);
                                        }
                                        v53 = zzfl0.zza(v58);
                                        if(z1) {
                                            int v59 = zzfl0.zza(6);
                                            if(v59 == 0x3F) {
                                                goto label_168;
                                            }
                                            else {
                                                if(v59 == 0) {
                                                    z2 = true;
                                                    v60 = Math.max(0, v47 - 30);
                                                }
                                                else {
                                                    z2 = true;
                                                    v60 = Math.max(0, v59 + v47 - 0x1F);
                                                }
                                                v55 = zzfl0.zza(v60);
                                                v54 = v59;
                                                goto label_157;
                                            }
                                            goto label_156;
                                        }
                                        else {
                                        label_156:
                                            z2 = false;
                                        }
                                    label_157:
                                        if(zzfl0.zzh()) {
                                            zzfl0.zzf(10);
                                        }
                                        ++v49;
                                        v52 = v56;
                                        z1 = z2;
                                        v10 = v57;
                                    }
                                    v57 = v10;
                                    zzfd0 = new zzfd(v46, v47, v48 + 1, v50, v51, v52, v53, v54, v55);
                                    goto label_169;
                                }
                            }
                        label_167:
                            v57 = v10;
                        label_168:
                            zzfd0 = null;
                        label_169:
                            if(zzfd0 != null && zzfh2 != null) {
                                int v61 = ((zzex)zzfh2.zza.get(0)).zzb;
                                if(zzfd0.zza == v61) {
                                    v21 = 0;
                                    v10 = v57;
                                    v17 = 4;
                                }
                                else {
                                    v21 = 0;
                                    v10 = v57;
                                    v17 = 5;
                                }
                                goto label_184;
                            }
                        }
                    }
                    v21 = v40;
                    v10 = v57;
                label_184:
                    v9 = v9 + 4 + v22;
                    zzdy0.zzM(v22);
                    ++v21;
                    v20 = v24;
                    v19 = v25;
                }
                ++v8;
                zzfh1 = zzfh2;
            }
            return new zzadc((v4 == 0 ? Collections.emptyList() : Collections.singletonList(arr_b)), (v & 3) + 1, v10, v11, v12, v13, v14, v15, v16, v17, f, v18, s, zzfh1);
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
        }
        throw zzbc.zza(("Error parsing" + (z ? "L-HEVC config" : "HEVC config")), arrayIndexOutOfBoundsException0);
    }
}

