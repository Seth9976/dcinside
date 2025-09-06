package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import j..util.Objects;
import java.util.EnumMap;
import java.util.Map.Entry;

public final class zzax {
    private static final zzax zza;
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap zzf;

    static {
        zzax.zza = new zzax(null, 100);
    }

    zzax(Boolean boolean0, int v) {
        this(null, v, null, null);
    }

    zzax(Boolean boolean0, int v, Boolean boolean1, String s) {
        EnumMap enumMap0 = new EnumMap(zza.class);
        this.zzf = enumMap0;
        zzjh zzjh0 = zzje.zza(boolean0);
        enumMap0.put(zza.zzc, zzjh0);
        this.zzb = v;
        this.zzc = this.zzh();
        this.zzd = boolean1;
        this.zze = s;
    }

    private zzax(EnumMap enumMap0, int v, Boolean boolean0, String s) {
        EnumMap enumMap1 = new EnumMap(zza.class);
        this.zzf = enumMap1;
        enumMap1.putAll(enumMap0);
        this.zzb = v;
        this.zzc = this.zzh();
        this.zzd = boolean0;
        this.zze = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof zzax)) {
            return false;
        }
        if(!this.zzc.equalsIgnoreCase(((zzax)object0).zzc)) {
            return false;
        }
        return Objects.equals(this.zzd, ((zzax)object0).zzd) ? Objects.equals(this.zze, ((zzax)object0).zze) : false;
    }

    @Override
    public final int hashCode() {
        Boolean boolean0 = this.zzd;
        if(boolean0 == null) {
            return this.zze == null ? this.zzc.hashCode() + 0x970 : this.zzc.hashCode() + 87 + this.zze.hashCode() * 0x89;
        }
        int v = boolean0 == Boolean.TRUE ? 7 : 13;
        return this.zze == null ? this.zzc.hashCode() + v * 29 + 0x919 : this.zzc.hashCode() + v * 29 + this.zze.hashCode() * 0x89;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("source=");
        stringBuilder0.append(zzje.zza(this.zzb));
        zza[] arr_zzje$zza = zzjg.zzb.zza();
        for(int v = 0; v < arr_zzje$zza.length; ++v) {
            zza zzje$zza0 = arr_zzje$zza[v];
            stringBuilder0.append(",");
            stringBuilder0.append(zzje$zza0.zze);
            stringBuilder0.append("=");
            zzjh zzjh0 = (zzjh)this.zzf.get(zzje$zza0);
            if(zzjh0 == null) {
                stringBuilder0.append("uninitialized");
            }
            else {
                switch(zzjh0) {
                    case 1: {
                        stringBuilder0.append("uninitialized");
                        break;
                    }
                    case 2: {
                        stringBuilder0.append("eu_consent_policy");
                        break;
                    }
                    case 3: {
                        stringBuilder0.append("denied");
                        break;
                    }
                    case 4: {
                        stringBuilder0.append("granted");
                    }
                }
            }
        }
        if(this.zzd != null) {
            stringBuilder0.append(",isDmaRegion=");
            stringBuilder0.append(this.zzd);
        }
        if(this.zze != null) {
            stringBuilder0.append(",cpsDisplayStr=");
            stringBuilder0.append(this.zze);
        }
        return stringBuilder0.toString();
    }

    public static zzax zza(Bundle bundle0, int v) {
        Boolean boolean0 = null;
        if(bundle0 == null) {
            return new zzax(null, v);
        }
        EnumMap enumMap0 = new EnumMap(zza.class);
        zza[] arr_zzje$zza = zzjg.zzb.zza();
        for(int v1 = 0; v1 < arr_zzje$zza.length; ++v1) {
            zza zzje$zza0 = arr_zzje$zza[v1];
            enumMap0.put(zzje$zza0, zzje.zza(bundle0.getString(zzje$zza0.zze)));
        }
        if(bundle0.containsKey("is_dma_region")) {
            boolean0 = Boolean.valueOf(bundle0.getString("is_dma_region"));
        }
        return new zzax(enumMap0, v, boolean0, bundle0.getString("cps_display_str"));
    }

    static zzax zza(zzjh zzjh0, int v) {
        EnumMap enumMap0 = new EnumMap(zza.class);
        enumMap0.put(zza.zzc, zzjh0);
        return new zzax(enumMap0, -10, null, null);
    }

    public static zzax zza(String s) {
        if(s != null && s.length() > 0) {
            String[] arr_s = s.split(":");
            int v = Integer.parseInt(arr_s[0]);
            EnumMap enumMap0 = new EnumMap(zza.class);
            zza[] arr_zzje$zza = zzjg.zzb.zza();
            int v2 = 0;
            for(int v1 = 1; v2 < arr_zzje$zza.length; ++v1) {
                enumMap0.put(arr_zzje$zza[v2], zzje.zza(arr_s[v1].charAt(0)));
                ++v2;
            }
            return new zzax(enumMap0, v, null, null);
        }
        return zzax.zza;
    }

    public static Boolean zza(Bundle bundle0) {
        if(bundle0 == null) {
            return null;
        }
        zzjh zzjh0 = zzje.zza(bundle0.getString("ad_personalization"));
        if(zzjh0 == null) {
            return null;
        }
        switch(zzba.zza[zzjh0.ordinal()]) {
            case 3: {
                return false;
            }
            case 4: {
                return true;
            }
            default: {
                return null;
            }
        }
    }

    public final int zza() {
        return this.zzb;
    }

    public final Bundle zzb() {
        Bundle bundle0 = new Bundle();
        for(Object object0: this.zzf.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s = zzje.zzb(((zzjh)map$Entry0.getValue()));
            if(s != null) {
                bundle0.putString(((zza)map$Entry0.getKey()).zze, s);
            }
        }
        Boolean boolean0 = this.zzd;
        if(boolean0 != null) {
            bundle0.putString("is_dma_region", boolean0.toString());
        }
        String s1 = this.zze;
        if(s1 != null) {
            bundle0.putString("cps_display_str", s1);
        }
        return bundle0;
    }

    public final zzjh zzc() {
        zzjh zzjh0 = (zzjh)this.zzf.get(zza.zzc);
        return zzjh0 == null ? zzjh.zza : zzjh0;
    }

    public final Boolean zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        for(Object object0: this.zzf.values()) {
            if(((zzjh)object0) != zzjh.zza) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    private final String zzh() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.zzb);
        zza[] arr_zzje$zza = zzjg.zzb.zza();
        for(int v = 0; v < arr_zzje$zza.length; ++v) {
            zza zzje$zza0 = arr_zzje$zza[v];
            stringBuilder0.append(":");
            stringBuilder0.append(zzje.zza(((zzjh)this.zzf.get(zzje$zza0))));
        }
        return stringBuilder0.toString();
    }
}

