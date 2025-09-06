package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

final class zzah {
    private final EnumMap zza;

    zzah() {
        this.zza = new EnumMap(zza.class);
    }

    private zzah(EnumMap enumMap0) {
        EnumMap enumMap1 = new EnumMap(zza.class);
        this.zza = enumMap1;
        enumMap1.putAll(enumMap0);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("1");
        zza[] arr_zzje$zza = zza.values();
        for(int v = 0; v < arr_zzje$zza.length; ++v) {
            zzak zzak0 = (zzak)this.zza.get(arr_zzje$zza[v]);
            if(zzak0 == null) {
                zzak0 = zzak.zza;
            }
            stringBuilder0.append(zzak0.zzl);
        }
        return stringBuilder0.toString();
    }

    public static zzah zza(String s) {
        int v = 0;
        EnumMap enumMap0 = new EnumMap(zza.class);
        if(s.length() >= zza.values().length && s.charAt(0) == 49) {
            zza[] arr_zzje$zza = zza.values();
            for(int v1 = 1; v < arr_zzje$zza.length; ++v1) {
                enumMap0.put(arr_zzje$zza[v], zzak.zza(s.charAt(v1)));
                ++v;
            }
            return new zzah(enumMap0);
        }
        return new zzah();
    }

    public final zzak zza(zza zzje$zza0) {
        zzak zzak0 = (zzak)this.zza.get(zzje$zza0);
        return zzak0 == null ? zzak.zza : zzak0;
    }

    public final void zza(zza zzje$zza0, int v) {
        zzak zzak0 = zzak.zza;
        switch(v) {
            case -30: {
                zzak0 = zzak.zzg;
                break;
            }
            case -10: {
                zzak0 = zzak.zzd;
                break;
            }
            case -20: 
            case 0: {
                zzak0 = zzak.zzf;
                break;
            }
            default: {
                if(v == 30) {
                    zzak0 = zzak.zze;
                }
            }
        }
        this.zza.put(zzje$zza0, zzak0);
    }

    public final void zza(zza zzje$zza0, zzak zzak0) {
        this.zza.put(zzje$zza0, zzak0);
    }
}

