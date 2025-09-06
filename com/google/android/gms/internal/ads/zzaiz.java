package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

final class zzaiz {
    private static final zzfvc zza;
    private static final zzfvc zzb;
    private final List zzc;
    private int zzd;
    private int zze;

    static {
        zzaiz.zza = zzfvc.zzb(zzfty.zzc(':'));
        zzaiz.zzb = zzfvc.zzb(zzfty.zzc('*'));
    }

    public zzaiz() {
        this.zzc = new ArrayList();
        this.zzd = 0;
    }

    // This method was un-flattened
    public final int zza(zzaco zzaco0, zzadj zzadj0, List list0) throws IOException {
        int v10;
        switch(this.zzd) {
            case 0: {
                long v5 = zzaco0.zzd();
                zzadj0.zza = v5 != -1L && v5 >= 8L ? v5 - 8L : 0L;
                this.zzd = 1;
                return 1;
            }
            case 1: {
                zzdy zzdy1 = new zzdy(8);
                zzaco0.zzi(zzdy1.zzN(), 0, 8);
                this.zze = zzdy1.zzi() + 8;
                if(zzdy1.zzg() != 1397048916) {
                    zzadj0.zza = 0L;
                    return 1;
                }
                zzadj0.zza = zzaco0.zzf() - ((long)(this.zze - 12));
                this.zzd = 2;
                return 1;
            }
            case 2: {
                long v6 = zzaco0.zzd();
                int v7 = this.zze - 20;
                zzdy zzdy2 = new zzdy(v7);
                zzaco0.zzi(zzdy2.zzN(), 0, v7);
                int v8 = 0;
                while(v8 < v7 / 12) {
                    zzdy2.zzM(2);
                    int v9 = zzdy2.zzD();
                    if(v9 == 0x890 || v9 == 0xB00 || v9 == 0xB01 || v9 == 0xB03 || v9 == 0xB04) {
                        v10 = v7;
                        zzaiy zzaiy1 = new zzaiy(v9, v6 - ((long)this.zze) - ((long)zzdy2.zzi()), zzdy2.zzi());
                        this.zzc.add(zzaiy1);
                    }
                    else {
                        zzdy2.zzM(8);
                        v10 = v7;
                    }
                    ++v8;
                    v7 = v10;
                }
                if(this.zzc.isEmpty()) {
                    zzadj0.zza = 0L;
                    return 1;
                }
                this.zzd = 3;
                zzadj0.zza = ((zzaiy)this.zzc.get(0)).zza;
                return 1;
            }
            default: {
                long v = zzaco0.zzf();
                int v1 = (int)(zzaco0.zzd() - zzaco0.zzf() - ((long)this.zze));
                zzdy zzdy0 = new zzdy(v1);
                zzaco0.zzi(zzdy0.zzN(), 0, v1);
                for(int v2 = 0; v2 < this.zzc.size(); ++v2) {
                    zzaiy zzaiy0 = (zzaiy)this.zzc.get(v2);
                    zzdy0.zzL(((int)(zzaiy0.zza - v)));
                    zzdy0.zzM(4);
                    int v3 = zzdy0.zzi();
                    Charset charset0 = StandardCharsets.UTF_8;
                    switch(zzdy0.zzB(v3, charset0)) {
                        case "SlowMotion_Data": {
                            ArrayList arrayList0 = new ArrayList();
                            String s = zzdy0.zzB(zzaiy0.zzb - (v3 + 8), charset0);
                            List list1 = zzaiz.zzb.zzf(s);
                            for(int v4 = 0; v4 < list1.size(); ++v4) {
                                CharSequence charSequence0 = (CharSequence)list1.get(v4);
                                List list2 = zzaiz.zza.zzf(charSequence0);
                                if(list2.size() != 3) {
                                    throw zzbc.zza(null, null);
                                }
                                try {
                                    arrayList0.add(new zzagy(Long.parseLong(((String)list2.get(0))), Long.parseLong(((String)list2.get(1))), 1 << Integer.parseInt(((String)list2.get(2))) - 1));
                                }
                                catch(NumberFormatException numberFormatException0) {
                                    throw zzbc.zza(null, numberFormatException0);
                                }
                            }
                            list0.add(new zzagz(arrayList0));
                            break;
                        }
                        case "Super_SlowMotion_BGM": 
                        case "Super_SlowMotion_Data": 
                        case "Super_SlowMotion_Deflickering_On": 
                        case "Super_SlowMotion_Edit_Data": {
                            break;
                        }
                        default: {
                            throw zzbc.zza("Invalid SEF name", null);
                        }
                    }
                }
                zzadj0.zza = 0L;
                return 1;
            }
        }
    }

    public final void zzb() {
        this.zzc.clear();
        this.zzd = 0;
    }
}

