package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map.Entry;

final class zzip extends zziq {
    @Override  // com.google.android.gms.internal.vision.zziq
    final int zza(Map.Entry map$Entry0) {
        return ((zzf)map$Entry0.getKey()).zzb;
    }

    @Override  // com.google.android.gms.internal.vision.zziq
    final zziu zza(Object object0) {
        return ((zzc)object0).zzc;
    }

    @Override  // com.google.android.gms.internal.vision.zziq
    final Object zza(zzio zzio0, zzkk zzkk0, int v) {
        return zzio0.zza(zzkk0, v);
    }

    @Override  // com.google.android.gms.internal.vision.zziq
    final Object zza(zzld zzld0, Object object0, zzio zzio0, zziu zziu0, Object object1, zzlu zzlu0) throws IOException {
        zzml zzml0 = ((zze)object0).zzd.zzc;
        Object object2 = null;
        if(zzml0 != zzml.zzn) {
            int[] arr_v = zzis.zza;
            switch(arr_v[zzml0.ordinal()]) {
                case 1: {
                    object2 = zzld0.zzd();
                    break;
                }
                case 2: {
                    object2 = zzld0.zze();
                    break;
                }
                case 3: {
                    object2 = zzld0.zzg();
                    break;
                }
                case 4: {
                    object2 = zzld0.zzf();
                    break;
                }
                case 5: {
                    object2 = zzld0.zzh();
                    break;
                }
                case 6: {
                    object2 = zzld0.zzi();
                    break;
                }
                case 7: {
                    object2 = zzld0.zzj();
                    break;
                }
                case 8: {
                    object2 = Boolean.valueOf(zzld0.zzk());
                    break;
                }
                case 9: {
                    object2 = zzld0.zzo();
                    break;
                }
                case 10: {
                    object2 = zzld0.zzq();
                    break;
                }
                case 11: {
                    object2 = zzld0.zzr();
                    break;
                }
                case 12: {
                    object2 = zzld0.zzs();
                    break;
                }
                case 13: {
                    object2 = zzld0.zzt();
                    break;
                }
                case 14: {
                    throw new IllegalStateException("Shouldn\'t reach here.");
                }
                case 15: {
                    object2 = zzld0.zzn();
                    break;
                }
                case 16: {
                    object2 = zzld0.zzl();
                    break;
                }
                case 17: {
                    object2 = zzld0.zzb(((zze)object0).zzc.getClass(), zzio0);
                    break;
                }
                case 18: {
                    object2 = zzld0.zza(((zze)object0).zzc.getClass(), zzio0);
                }
            }
            zzf zzjb$zzf0 = ((zze)object0).zzd;
            if(zzjb$zzf0.zzd) {
                zziu0.zzb(zzjb$zzf0, object2);
                return object1;
            }
            switch(arr_v[zzjb$zzf0.zzc.ordinal()]) {
                case 17: 
                case 18: {
                    Object object3 = zziu0.zza(((zze)object0).zzd);
                    if(object3 != null) {
                        object2 = zzjf.zza(object3, object2);
                    }
                }
            }
            zziu0.zza(((zze)object0).zzd, object2);
            return object1;
        }
        zzld0.zzh();
        throw null;
    }

    @Override  // com.google.android.gms.internal.vision.zziq
    final void zza(zzht zzht0, Object object0, zzio zzio0, zziu zziu0) throws IOException {
        byte[] arr_b;
        zzkk zzkk0 = ((zze)object0).zzc.zzq().zze();
        int v = zzht0.zza();
        if(v == 0) {
            arr_b = zzjf.zzb;
        }
        else {
            byte[] arr_b1 = new byte[v];
            zzht0.zza(arr_b1, 0, 0, v);
            arr_b = arr_b1;
        }
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        if(!byteBuffer0.hasArray()) {
            throw new IllegalArgumentException("Direct buffers not yet supported");
        }
        zzho zzho0 = new zzho(byteBuffer0, true);
        zzky.zza().zza(zzkk0).zza(zzkk0, zzho0, zzio0);
        zziu0.zza(((zze)object0).zzd, zzkk0);
        if(zzho0.zza() != 0x7FFFFFFF) {
            throw zzjk.zze();
        }
    }

    @Override  // com.google.android.gms.internal.vision.zziq
    final void zza(zzld zzld0, Object object0, zzio zzio0, zziu zziu0) throws IOException {
        Object object1 = zzld0.zza(((zze)object0).zzc.getClass(), zzio0);
        zziu0.zza(((zze)object0).zzd, object1);
    }

    @Override  // com.google.android.gms.internal.vision.zziq
    final void zza(zzmr zzmr0, Map.Entry map$Entry0) throws IOException {
        zzf zzjb$zzf0 = (zzf)map$Entry0.getKey();
        if(zzjb$zzf0.zzd) {
            switch(zzjb$zzf0.zzc) {
                case 1: {
                    List list0 = (List)map$Entry0.getValue();
                    zzle.zza(zzjb$zzf0.zzb, list0, zzmr0, false);
                    return;
                }
                case 2: {
                    List list1 = (List)map$Entry0.getValue();
                    zzle.zzb(zzjb$zzf0.zzb, list1, zzmr0, false);
                    return;
                }
                case 3: {
                    List list2 = (List)map$Entry0.getValue();
                    zzle.zzc(zzjb$zzf0.zzb, list2, zzmr0, false);
                    return;
                }
                case 4: {
                    List list3 = (List)map$Entry0.getValue();
                    zzle.zzd(zzjb$zzf0.zzb, list3, zzmr0, false);
                    return;
                }
                case 5: {
                    List list4 = (List)map$Entry0.getValue();
                    zzle.zzh(zzjb$zzf0.zzb, list4, zzmr0, false);
                    return;
                }
                case 6: {
                    List list5 = (List)map$Entry0.getValue();
                    zzle.zzf(zzjb$zzf0.zzb, list5, zzmr0, false);
                    return;
                }
                case 7: {
                    List list6 = (List)map$Entry0.getValue();
                    zzle.zzk(zzjb$zzf0.zzb, list6, zzmr0, false);
                    return;
                }
                case 8: {
                    List list7 = (List)map$Entry0.getValue();
                    zzle.zzn(zzjb$zzf0.zzb, list7, zzmr0, false);
                    return;
                }
                case 9: {
                    List list8 = (List)map$Entry0.getValue();
                    zzle.zzi(zzjb$zzf0.zzb, list8, zzmr0, false);
                    return;
                }
                case 10: {
                    List list9 = (List)map$Entry0.getValue();
                    zzle.zzl(zzjb$zzf0.zzb, list9, zzmr0, false);
                    return;
                }
                case 11: {
                    List list10 = (List)map$Entry0.getValue();
                    zzle.zzg(zzjb$zzf0.zzb, list10, zzmr0, false);
                    return;
                }
                case 12: {
                    List list11 = (List)map$Entry0.getValue();
                    zzle.zzj(zzjb$zzf0.zzb, list11, zzmr0, false);
                    return;
                }
                case 13: {
                    List list12 = (List)map$Entry0.getValue();
                    zzle.zze(zzjb$zzf0.zzb, list12, zzmr0, false);
                    return;
                }
                case 14: {
                    List list13 = (List)map$Entry0.getValue();
                    zzle.zzh(zzjb$zzf0.zzb, list13, zzmr0, false);
                    return;
                }
                case 15: {
                    List list14 = (List)map$Entry0.getValue();
                    zzle.zzb(zzjb$zzf0.zzb, list14, zzmr0);
                    return;
                }
                case 16: {
                    List list15 = (List)map$Entry0.getValue();
                    zzle.zza(zzjb$zzf0.zzb, list15, zzmr0);
                    return;
                }
                case 17: {
                    List list16 = (List)map$Entry0.getValue();
                    if(list16 != null && !list16.isEmpty()) {
                        List list17 = (List)map$Entry0.getValue();
                        zzlc zzlc0 = zzky.zza().zza(list16.get(0).getClass());
                        zzle.zzb(zzjb$zzf0.zzb, list17, zzmr0, zzlc0);
                    }
                    return;
                }
                case 18: {
                    List list18 = (List)map$Entry0.getValue();
                    if(list18 != null && !list18.isEmpty()) {
                        List list19 = (List)map$Entry0.getValue();
                        zzlc zzlc1 = zzky.zza().zza(list18.get(0).getClass());
                        zzle.zza(zzjb$zzf0.zzb, list19, zzmr0, zzlc1);
                    }
                    return;
                }
                default: {
                    return;
                }
            }
        }
        switch(zzjb$zzf0.zzc) {
            case 1: {
                double f = (double)(((Double)map$Entry0.getValue()));
                zzmr0.zza(zzjb$zzf0.zzb, f);
                return;
            }
            case 2: {
                float f1 = (float)(((Float)map$Entry0.getValue()));
                zzmr0.zza(zzjb$zzf0.zzb, f1);
                return;
            }
            case 3: {
                long v = (long)(((Long)map$Entry0.getValue()));
                zzmr0.zza(zzjb$zzf0.zzb, v);
                return;
            }
            case 4: {
                long v1 = (long)(((Long)map$Entry0.getValue()));
                zzmr0.zzc(zzjb$zzf0.zzb, v1);
                return;
            }
            case 5: {
                int v2 = (int)(((Integer)map$Entry0.getValue()));
                zzmr0.zzc(zzjb$zzf0.zzb, v2);
                return;
            }
            case 6: {
                long v3 = (long)(((Long)map$Entry0.getValue()));
                zzmr0.zzd(zzjb$zzf0.zzb, v3);
                return;
            }
            case 7: {
                int v4 = (int)(((Integer)map$Entry0.getValue()));
                zzmr0.zzd(zzjb$zzf0.zzb, v4);
                return;
            }
            case 8: {
                boolean z = ((Boolean)map$Entry0.getValue()).booleanValue();
                zzmr0.zza(zzjb$zzf0.zzb, z);
                return;
            }
            case 9: {
                int v5 = (int)(((Integer)map$Entry0.getValue()));
                zzmr0.zze(zzjb$zzf0.zzb, v5);
                return;
            }
            case 10: {
                int v6 = (int)(((Integer)map$Entry0.getValue()));
                zzmr0.zza(zzjb$zzf0.zzb, v6);
                return;
            }
            case 11: {
                long v7 = (long)(((Long)map$Entry0.getValue()));
                zzmr0.zzb(zzjb$zzf0.zzb, v7);
                return;
            }
            case 12: {
                int v8 = (int)(((Integer)map$Entry0.getValue()));
                zzmr0.zzf(zzjb$zzf0.zzb, v8);
                return;
            }
            case 13: {
                long v9 = (long)(((Long)map$Entry0.getValue()));
                zzmr0.zze(zzjb$zzf0.zzb, v9);
                return;
            }
            case 14: {
                int v10 = (int)(((Integer)map$Entry0.getValue()));
                zzmr0.zzc(zzjb$zzf0.zzb, v10);
                return;
            }
            case 15: {
                zzht zzht0 = (zzht)map$Entry0.getValue();
                zzmr0.zza(zzjb$zzf0.zzb, zzht0);
                return;
            }
            case 16: {
                String s = (String)map$Entry0.getValue();
                zzmr0.zza(zzjb$zzf0.zzb, s);
                return;
            }
            case 17: {
                Object object0 = map$Entry0.getValue();
                zzlc zzlc2 = zzky.zza().zza(map$Entry0.getValue().getClass());
                zzmr0.zzb(zzjb$zzf0.zzb, object0, zzlc2);
                return;
            }
            case 18: {
                Object object1 = map$Entry0.getValue();
                zzlc zzlc3 = zzky.zza().zza(map$Entry0.getValue().getClass());
                zzmr0.zza(zzjb$zzf0.zzb, object1, zzlc3);
            }
        }
    }

    @Override  // com.google.android.gms.internal.vision.zziq
    final boolean zza(zzkk zzkk0) {
        return zzkk0 instanceof zzc;
    }

    @Override  // com.google.android.gms.internal.vision.zziq
    final zziu zzb(Object object0) {
        return ((zzc)object0).zza();
    }

    @Override  // com.google.android.gms.internal.vision.zziq
    final void zzc(Object object0) {
        this.zza(object0).zzb();
    }
}

