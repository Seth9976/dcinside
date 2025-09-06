package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;

final class zzgxd extends zzgxc {
    @Override  // com.google.android.gms.internal.ads.zzgxc
    final void zza(Object object0) {
        ((zzgxn)object0).zza.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxc
    final void zzb(zzhaw zzhaw0, Map.Entry map$Entry0) throws IOException {
        zzgxo zzgxo0 = (zzgxo)map$Entry0.getKey();
        if(zzgxo0.zzc) {
            switch(zzgxo0.zzb.ordinal()) {
                case 0: {
                    List list0 = (List)map$Entry0.getValue();
                    zzgzx.zzt(zzgxo0.zza, list0, zzhaw0, zzgxo0.zzd);
                    return;
                }
                case 1: {
                    List list1 = (List)map$Entry0.getValue();
                    zzgzx.zzx(zzgxo0.zza, list1, zzhaw0, zzgxo0.zzd);
                    return;
                }
                case 2: {
                    List list2 = (List)map$Entry0.getValue();
                    zzgzx.zzA(zzgxo0.zza, list2, zzhaw0, zzgxo0.zzd);
                    return;
                }
                case 3: {
                    List list3 = (List)map$Entry0.getValue();
                    zzgzx.zzI(zzgxo0.zza, list3, zzhaw0, zzgxo0.zzd);
                    return;
                }
                case 4: {
                    List list4 = (List)map$Entry0.getValue();
                    zzgzx.zzz(zzgxo0.zza, list4, zzhaw0, zzgxo0.zzd);
                    return;
                }
                case 5: {
                    List list5 = (List)map$Entry0.getValue();
                    zzgzx.zzw(zzgxo0.zza, list5, zzhaw0, zzgxo0.zzd);
                    return;
                }
                case 6: {
                    List list6 = (List)map$Entry0.getValue();
                    zzgzx.zzv(zzgxo0.zza, list6, zzhaw0, zzgxo0.zzd);
                    return;
                }
                case 7: {
                    List list7 = (List)map$Entry0.getValue();
                    zzgzx.zzr(zzgxo0.zza, list7, zzhaw0, zzgxo0.zzd);
                    return;
                }
                case 8: {
                    List list8 = (List)map$Entry0.getValue();
                    zzgzx.zzG(zzgxo0.zza, list8, zzhaw0);
                    return;
                }
                case 9: {
                    List list16 = (List)map$Entry0.getValue();
                    if(list16 == null || list16.isEmpty()) {
                        return;
                    }
                    List list17 = (List)map$Entry0.getValue();
                    zzgzv zzgzv0 = zzgzm.zza().zzb(list16.get(0).getClass());
                    zzgzx.zzy(zzgxo0.zza, list17, zzhaw0, zzgzv0);
                    return;
                }
                case 10: {
                    List list18 = (List)map$Entry0.getValue();
                    if(list18 == null || list18.isEmpty()) {
                        return;
                    }
                    List list19 = (List)map$Entry0.getValue();
                    zzgzv zzgzv1 = zzgzm.zza().zzb(list18.get(0).getClass());
                    zzgzx.zzB(zzgxo0.zza, list19, zzhaw0, zzgzv1);
                    return;
                }
                case 11: {
                    List list9 = (List)map$Entry0.getValue();
                    zzgzx.zzs(zzgxo0.zza, list9, zzhaw0);
                    return;
                }
                case 12: {
                    List list10 = (List)map$Entry0.getValue();
                    zzgzx.zzH(zzgxo0.zza, list10, zzhaw0, zzgxo0.zzd);
                    return;
                }
                case 13: {
                    List list11 = (List)map$Entry0.getValue();
                    zzgzx.zzz(zzgxo0.zza, list11, zzhaw0, zzgxo0.zzd);
                    return;
                }
                case 14: {
                    List list12 = (List)map$Entry0.getValue();
                    zzgzx.zzC(zzgxo0.zza, list12, zzhaw0, zzgxo0.zzd);
                    return;
                }
                case 15: {
                    List list13 = (List)map$Entry0.getValue();
                    zzgzx.zzD(zzgxo0.zza, list13, zzhaw0, zzgxo0.zzd);
                    return;
                }
                case 16: {
                    List list14 = (List)map$Entry0.getValue();
                    zzgzx.zzE(zzgxo0.zza, list14, zzhaw0, zzgxo0.zzd);
                    return;
                }
                case 17: {
                    List list15 = (List)map$Entry0.getValue();
                    zzgzx.zzF(zzgxo0.zza, list15, zzhaw0, zzgxo0.zzd);
                    return;
                }
                default: {
                    return;
                }
            }
        }
        switch(zzgxo0.zzb.ordinal()) {
            case 0: {
                double f = (double)(((Double)map$Entry0.getValue()));
                zzhaw0.zzf(zzgxo0.zza, f);
                return;
            }
            case 1: {
                float f1 = (float)(((Float)map$Entry0.getValue()));
                zzhaw0.zzo(zzgxo0.zza, f1);
                return;
            }
            case 2: {
                long v = (long)(((Long)map$Entry0.getValue()));
                zzhaw0.zzt(zzgxo0.zza, v);
                return;
            }
            case 3: {
                long v1 = (long)(((Long)map$Entry0.getValue()));
                zzhaw0.zzK(zzgxo0.zza, v1);
                return;
            }
            case 4: {
                int v2 = (int)(((Integer)map$Entry0.getValue()));
                zzhaw0.zzr(zzgxo0.zza, v2);
                return;
            }
            case 5: {
                long v3 = (long)(((Long)map$Entry0.getValue()));
                zzhaw0.zzm(zzgxo0.zza, v3);
                return;
            }
            case 6: {
                int v4 = (int)(((Integer)map$Entry0.getValue()));
                zzhaw0.zzk(zzgxo0.zza, v4);
                return;
            }
            case 7: {
                boolean z = ((Boolean)map$Entry0.getValue()).booleanValue();
                zzhaw0.zzb(zzgxo0.zza, z);
                return;
            }
            case 8: {
                String s = (String)map$Entry0.getValue();
                zzhaw0.zzG(zzgxo0.zza, s);
                return;
            }
            case 9: {
                Object object0 = map$Entry0.getValue();
                zzgzv zzgzv2 = zzgzm.zza().zzb(map$Entry0.getValue().getClass());
                zzhaw0.zzq(zzgxo0.zza, object0, zzgzv2);
                return;
            }
            case 10: {
                Object object1 = map$Entry0.getValue();
                zzgzv zzgzv3 = zzgzm.zza().zzb(map$Entry0.getValue().getClass());
                zzhaw0.zzv(zzgxo0.zza, object1, zzgzv3);
                return;
            }
            case 11: {
                zzgwj zzgwj0 = (zzgwj)map$Entry0.getValue();
                zzhaw0.zzd(zzgxo0.zza, zzgwj0);
                return;
            }
            case 12: {
                int v5 = (int)(((Integer)map$Entry0.getValue()));
                zzhaw0.zzI(zzgxo0.zza, v5);
                return;
            }
            case 13: {
                int v6 = (int)(((Integer)map$Entry0.getValue()));
                zzhaw0.zzr(zzgxo0.zza, v6);
                return;
            }
            case 14: {
                int v7 = (int)(((Integer)map$Entry0.getValue()));
                zzhaw0.zzx(zzgxo0.zza, v7);
                return;
            }
            case 15: {
                long v8 = (long)(((Long)map$Entry0.getValue()));
                zzhaw0.zzz(zzgxo0.zza, v8);
                return;
            }
            case 16: {
                int v9 = (int)(((Integer)map$Entry0.getValue()));
                zzhaw0.zzB(zzgxo0.zza, v9);
                return;
            }
            case 17: {
                long v10 = (long)(((Long)map$Entry0.getValue()));
                zzhaw0.zzD(zzgxo0.zza, v10);
            }
        }
    }
}

