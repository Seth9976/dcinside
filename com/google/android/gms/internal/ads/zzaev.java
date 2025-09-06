package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class zzaev extends zzaex {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzaev() {
        super(new zzaci());
        this.zzb = 0x8000000000000001L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    @Override  // com.google.android.gms.internal.ads.zzaex
    protected final boolean zza(zzdy zzdy0) {
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzaex
    protected final boolean zzb(zzdy zzdy0, long v) {
        if(zzdy0.zzm() == 2 && "onMetaData".equals(zzaev.zzi(zzdy0)) && zzdy0.zzb() != 0 && zzdy0.zzm() == 8) {
            HashMap hashMap0 = zzaev.zzj(zzdy0);
            Object object0 = hashMap0.get("duration");
            if(object0 instanceof Double) {
                double f = (double)(((Double)object0));
                if(f > 0.0) {
                    this.zzb = (long)(f * 1000000.0);
                }
            }
            Object object1 = hashMap0.get("keyframes");
            if(object1 instanceof Map) {
                Object object2 = ((Map)object1).get("filepositions");
                Object object3 = ((Map)object1).get("times");
                if(object2 instanceof List && object3 instanceof List) {
                    int v1 = ((List)object3).size();
                    this.zzc = new long[v1];
                    this.zzd = new long[v1];
                    int v2 = 0;
                    while(v2 < v1) {
                        Object object4 = ((List)object2).get(v2);
                        Object object5 = ((List)object3).get(v2);
                        if(object5 instanceof Double && object4 instanceof Double) {
                            this.zzc[v2] = (long)(((double)(((Double)object5))) * 1000000.0);
                            this.zzd[v2] = ((Double)object4).longValue();
                            ++v2;
                        }
                        else {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            if(true) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }

    private static Double zzg(zzdy zzdy0) {
        return Double.longBitsToDouble(zzdy0.zzt());
    }

    @Nullable
    private static Object zzh(zzdy zzdy0, int v) {
        int v1 = 0;
        switch(v) {
            case 0: {
                return zzaev.zzg(zzdy0);
            }
            case 1: {
                if(zzdy0.zzm() == 1) {
                    v1 = 1;
                }
                return Boolean.valueOf(((boolean)v1));
            }
            case 2: {
                return zzaev.zzi(zzdy0);
            }
            case 3: {
                HashMap hashMap0 = new HashMap();
                while(true) {
                    String s = zzaev.zzi(zzdy0);
                    int v2 = zzdy0.zzm();
                    if(v2 == 9) {
                        break;
                    }
                    Object object0 = zzaev.zzh(zzdy0, v2);
                    if(object0 != null) {
                        hashMap0.put(s, object0);
                    }
                }
                return hashMap0;
            }
            case 8: {
                return zzaev.zzj(zzdy0);
            }
            case 10: {
                int v3 = zzdy0.zzp();
                ArrayList arrayList0 = new ArrayList(v3);
                while(v1 < v3) {
                    Object object1 = zzaev.zzh(zzdy0, zzdy0.zzm());
                    if(object1 != null) {
                        arrayList0.add(object1);
                    }
                    ++v1;
                }
                return arrayList0;
            }
            case 11: {
                Date date0 = new Date(((long)(((double)zzaev.zzg(zzdy0)))));
                zzdy0.zzM(2);
                return date0;
            }
            default: {
                return null;
            }
        }
    }

    private static String zzi(zzdy zzdy0) {
        int v = zzdy0.zzq();
        zzdy0.zzM(v);
        return new String(zzdy0.zzN(), zzdy0.zzd(), v);
    }

    private static HashMap zzj(zzdy zzdy0) {
        int v = zzdy0.zzp();
        HashMap hashMap0 = new HashMap(v);
        for(int v1 = 0; v1 < v; ++v1) {
            String s = zzaev.zzi(zzdy0);
            Object object0 = zzaev.zzh(zzdy0, zzdy0.zzm());
            if(object0 != null) {
                hashMap0.put(s, object0);
            }
        }
        return hashMap0;
    }
}

