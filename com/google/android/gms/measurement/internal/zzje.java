package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Map.Entry;

public final class zzje {
    public static enum zza {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");

        public final String zze;

        private zza(String s1) {
            this.zze = s1;
        }
    }

    public static final zzje zza;
    private final EnumMap zzb;
    private final int zzc;

    static {
        zzje.zza = new zzje(null, null, 100);
    }

    public zzje(Boolean boolean0, Boolean boolean1, int v) {
        EnumMap enumMap0 = new EnumMap(zza.class);
        this.zzb = enumMap0;
        zzjh zzjh0 = zzje.zza(null);
        enumMap0.put(zza.zza, zzjh0);
        zzjh zzjh1 = zzje.zza(null);
        enumMap0.put(zza.zzb, zzjh1);
        this.zzc = v;
    }

    private zzje(EnumMap enumMap0, int v) {
        EnumMap enumMap1 = new EnumMap(zza.class);
        this.zzb = enumMap1;
        enumMap1.putAll(enumMap0);
        this.zzc = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof zzje)) {
            return false;
        }
        zza[] arr_zzje$zza = zzjg.zza.zzd;
        for(int v = 0; v < arr_zzje$zza.length; ++v) {
            zza zzje$zza0 = arr_zzje$zza[v];
            if(this.zzb.get(zzje$zza0) != ((zzje)object0).zzb.get(zzje$zza0)) {
                return false;
            }
        }
        return this.zzc == ((zzje)object0).zzc;
    }

    @Override
    public final int hashCode() {
        int v = this.zzc * 17;
        for(Object object0: this.zzb.values()) {
            v = v * 0x1F + ((zzjh)object0).hashCode();
        }
        return v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("source=");
        stringBuilder0.append(zzje.zza(this.zzc));
        zza[] arr_zzje$zza = zzjg.zza.zzd;
        for(int v = 0; v < arr_zzje$zza.length; ++v) {
            zza zzje$zza0 = arr_zzje$zza[v];
            stringBuilder0.append(",");
            stringBuilder0.append(zzje$zza0.zze);
            stringBuilder0.append("=");
            zzjh zzjh0 = (zzjh)this.zzb.get(zzje$zza0);
            if(zzjh0 == null) {
                zzjh0 = zzjh.zza;
            }
            stringBuilder0.append(zzjh0);
        }
        return stringBuilder0.toString();
    }

    static char zza(zzjh zzjh0) {
        if(zzjh0 != null) {
            switch(zzjh0.ordinal()) {
                case 1: {
                    return '+';
                }
                case 2: {
                    return '0';
                }
                case 3: {
                    return '1';
                }
                default: {
                    return '-';
                }
            }
        }
        return '-';
    }

    public static zzje zza(Bundle bundle0, int v) {
        if(bundle0 == null) {
            return new zzje(null, null, v);
        }
        EnumMap enumMap0 = new EnumMap(zza.class);
        zza[] arr_zzje$zza = zzjg.zza.zzd;
        for(int v1 = 0; v1 < arr_zzje$zza.length; ++v1) {
            zza zzje$zza0 = arr_zzje$zza[v1];
            enumMap0.put(zzje$zza0, zzje.zza(bundle0.getString(zzje$zza0.zze)));
        }
        return new zzje(enumMap0, v);
    }

    public static zzje zza(zzjh zzjh0, zzjh zzjh1, int v) {
        EnumMap enumMap0 = new EnumMap(zza.class);
        enumMap0.put(zza.zza, zzjh0);
        enumMap0.put(zza.zzb, zzjh1);
        return new zzje(enumMap0, -10);
    }

    public static zzje zza(String s, int v) {
        EnumMap enumMap0 = new EnumMap(zza.class);
        if(s == null) {
            s = "";
        }
        zza[] arr_zzje$zza = zzjg.zza.zza();
        for(int v1 = 0; v1 < arr_zzje$zza.length; ++v1) {
            zza zzje$zza0 = arr_zzje$zza[v1];
            if(v1 + 2 < s.length()) {
                enumMap0.put(zzje$zza0, zzje.zza(s.charAt(v1 + 2)));
            }
            else {
                enumMap0.put(zzje$zza0, zzjh.zza);
            }
        }
        return new zzje(enumMap0, v);
    }

    static zzjh zza(char c) {
        switch(c) {
            case 43: {
                return zzjh.zzb;
            }
            case 0x30: {
                return zzjh.zzc;
            }
            case 49: {
                return zzjh.zzd;
            }
            default: {
                return zzjh.zza;
            }
        }
    }

    static zzjh zza(Boolean boolean0) {
        if(boolean0 == null) {
            return zzjh.zza;
        }
        return boolean0.booleanValue() ? zzjh.zzd : zzjh.zzc;
    }

    static zzjh zza(String s) {
        if(s == null) {
            return zzjh.zza;
        }
        if(s.equals("granted")) {
            return zzjh.zzd;
        }
        return s.equals("denied") ? zzjh.zzc : zzjh.zza;
    }

    static String zza(int v) {
        switch(v) {
            case -30: {
                return "TCF";
            }
            case -20: {
                return "API";
            }
            case -10: {
                return "MANIFEST";
            }
            case 0: {
                return "1P_API";
            }
            case 30: {
                return "1P_INIT";
            }
            case 90: {
                return "REMOTE_CONFIG";
            }
            case 100: {
                return "UNKNOWN";
            }
            default: {
                return "OTHER";
            }
        }
    }

    public static String zza(Bundle bundle0) {
        zza[] arr_zzje$zza = zzjg.zza.zzd;
        for(int v = 0; true; ++v) {
            Boolean boolean0 = null;
            if(v >= arr_zzje$zza.length) {
                break;
            }
            zza zzje$zza0 = arr_zzje$zza[v];
            if(bundle0.containsKey(zzje$zza0.zze)) {
                String s = bundle0.getString(zzje$zza0.zze);
                if(s != null && !s.equals("granted")) {
                    if(s.equals("denied")) {
                        boolean0 = Boolean.FALSE;
                    }
                    if(boolean0 == null) {
                        return s;
                    }
                }
            }
        }
        return null;
    }

    // 去混淆评级： 低(30)
    public static boolean zza(int v, int v1) {
        return v == -20 && v1 == -30 || v == -30 && v1 == -20 || v == v1 || v < v1;
    }

    public final int zza() {
        return this.zzc;
    }

    public final zzje zza(zzje zzje0) {
        EnumMap enumMap0 = new EnumMap(zza.class);
        zza[] arr_zzje$zza = zzjg.zza.zzd;
        for(int v = 0; v < arr_zzje$zza.length; ++v) {
            zza zzje$zza0 = arr_zzje$zza[v];
            zzjh zzjh0 = (zzjh)this.zzb.get(zzje$zza0);
            zzjh zzjh1 = (zzjh)zzje0.zzb.get(zzje$zza0);
            if(zzjh0 == null) {
                zzjh0 = zzjh1;
            }
            else if(zzjh1 != null) {
                zzjh zzjh2 = zzjh.zza;
                if(zzjh0 == zzjh2) {
                    zzjh0 = zzjh1;
                }
                else if(zzjh1 != zzjh2) {
                    zzjh zzjh3 = zzjh.zzb;
                    if(zzjh0 == zzjh3) {
                        zzjh0 = zzjh1;
                    }
                    else if(zzjh1 != zzjh3) {
                        zzjh0 = zzjh0 == zzjh.zzc || zzjh1 == zzjh.zzc ? zzjh.zzc : zzjh.zzd;
                    }
                }
            }
            if(zzjh0 != null) {
                enumMap0.put(zzje$zza0, zzjh0);
            }
        }
        return new zzje(enumMap0, 100);
    }

    public final boolean zza(zza zzje$zza0) {
        return ((zzjh)this.zzb.get(zzje$zza0)) != zzjh.zzc;
    }

    public final boolean zza(zzje zzje0, zza[] arr_zzje$zza) {
        for(int v = 0; v < arr_zzje$zza.length; ++v) {
            zza zzje$zza0 = arr_zzje$zza[v];
            if(!zzje0.zza(zzje$zza0) && this.zza(zzje$zza0)) {
                return true;
            }
        }
        return false;
    }

    public static zzje zzb(String s) {
        return zzje.zza(s, 100);
    }

    static String zzb(zzjh zzjh0) {
        switch(zzjh0.ordinal()) {
            case 2: {
                return "denied";
            }
            case 3: {
                return "granted";
            }
            default: {
                return null;
            }
        }
    }

    public final Bundle zzb() {
        Bundle bundle0 = new Bundle();
        for(Object object0: this.zzb.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s = zzje.zzb(((zzjh)map$Entry0.getValue()));
            if(s != null) {
                bundle0.putString(((zza)map$Entry0.getKey()).zze, s);
            }
        }
        return bundle0;
    }

    public final zzje zzb(zzje zzje0) {
        EnumMap enumMap0 = new EnumMap(zza.class);
        zza[] arr_zzje$zza = zzjg.zza.zzd;
        for(int v = 0; v < arr_zzje$zza.length; ++v) {
            zza zzje$zza0 = arr_zzje$zza[v];
            zzjh zzjh0 = (zzjh)this.zzb.get(zzje$zza0);
            if(zzjh0 == zzjh.zza) {
                zzjh0 = (zzjh)zzje0.zzb.get(zzje$zza0);
            }
            if(zzjh0 != null) {
                enumMap0.put(zzje$zza0, zzjh0);
            }
        }
        return new zzje(enumMap0, this.zzc);
    }

    public final boolean zzb(zzje zzje0, zza[] arr_zzje$zza) {
        for(int v = 0; v < arr_zzje$zza.length; ++v) {
            zza zzje$zza0 = arr_zzje$zza[v];
            zzjh zzjh0 = (zzjh)this.zzb.get(zzje$zza0);
            zzjh zzjh1 = (zzjh)zzje0.zzb.get(zzje$zza0);
            if(zzjh0 == zzjh.zzc && zzjh1 != zzjh.zzc) {
                return true;
            }
        }
        return false;
    }

    public final zzjh zzc() {
        zzjh zzjh0 = (zzjh)this.zzb.get(zza.zza);
        return zzjh0 == null ? zzjh.zza : zzjh0;
    }

    public final boolean zzc(zzje zzje0) {
        return this.zzb(zzje0, ((zza[])this.zzb.keySet().toArray(new zza[0])));
    }

    public final zzjh zzd() {
        zzjh zzjh0 = (zzjh)this.zzb.get(zza.zzb);
        return zzjh0 == null ? zzjh.zza : zzjh0;
    }

    public final String zze() {
        StringBuilder stringBuilder0 = new StringBuilder("G1");
        zza[] arr_zzje$zza = zzjg.zza.zza();
        for(int v = 0; v < arr_zzje$zza.length; ++v) {
            zzjh zzjh0 = (zzjh)this.zzb.get(arr_zzje$zza[v]);
            int v1 = 45;
            if(zzjh0 != null) {
                switch(zzjh0.ordinal()) {
                    case 2: {
                        v1 = 0x30;
                        break;
                    }
                    case 1: 
                    case 3: {
                        v1 = 49;
                    }
                }
            }
            stringBuilder0.append(((char)v1));
        }
        return stringBuilder0.toString();
    }

    public final String zzf() {
        StringBuilder stringBuilder0 = new StringBuilder("G1");
        zza[] arr_zzje$zza = zzjg.zza.zza();
        for(int v = 0; v < arr_zzje$zza.length; ++v) {
            stringBuilder0.append(zzje.zza(((zzjh)this.zzb.get(arr_zzje$zza[v]))));
        }
        return stringBuilder0.toString();
    }

    public final boolean zzg() {
        return this.zza(zza.zza);
    }

    public final boolean zzh() {
        return this.zza(zza.zzb);
    }

    public final boolean zzi() {
        for(Object object0: this.zzb.values()) {
            if(((zzjh)object0) != zzjh.zza) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

