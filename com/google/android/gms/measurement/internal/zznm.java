package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;

public final class zznm {
    private static final String[] zza;
    private final Map zzb;

    static {
        zznm.zza = new String[]{"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};
    }

    private zznm(Map map0) {
        HashMap hashMap0 = new HashMap();
        this.zzb = hashMap0;
        hashMap0.putAll(map0);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zznm ? this.zzc().equalsIgnoreCase(((zznm)object0).zzc()) : false;
    }

    @Override
    public final int hashCode() {
        return this.zzc().hashCode();
    }

    @Override
    public final String toString() {
        return this.zzc();
    }

    private static int zza(SharedPreferences sharedPreferences0, String s) {
        try {
            return sharedPreferences0.getInt(s, -1);
        }
        catch(ClassCastException unused_ex) {
            return -1;
        }
    }

    public static zznm zza(SharedPreferences sharedPreferences0) {
        HashMap hashMap0 = new HashMap();
        String s = zznm.zzb(sharedPreferences0, "IABTCF_VendorConsents");
        if(!"\u0000".equals(s) && s.length() > 0x2F2) {
            hashMap0.put("GoogleConsent", String.valueOf(s.charAt(0x2F2)));
        }
        int v = zznm.zza(sharedPreferences0, "IABTCF_gdprApplies");
        if(v != -1) {
            hashMap0.put("gdprApplies", String.valueOf(v));
        }
        int v1 = zznm.zza(sharedPreferences0, "IABTCF_EnableAdvertiserConsentMode");
        if(v1 != -1) {
            hashMap0.put("EnableAdvertiserConsentMode", String.valueOf(v1));
        }
        int v2 = zznm.zza(sharedPreferences0, "IABTCF_PolicyVersion");
        if(v2 != -1) {
            hashMap0.put("PolicyVersion", String.valueOf(v2));
        }
        String s1 = zznm.zzb(sharedPreferences0, "IABTCF_PurposeConsents");
        if(!"\u0000".equals(s1)) {
            hashMap0.put("PurposeConsents", s1);
        }
        int v3 = zznm.zza(sharedPreferences0, "IABTCF_CmpSdkID");
        if(v3 != -1) {
            hashMap0.put("CmpSdkID", String.valueOf(v3));
        }
        return new zznm(hashMap0);
    }

    public static String zza(String s, boolean z) {
        if(z && s.length() > 4) {
            char[] arr_c = s.toCharArray();
            int v;
            for(v = 1; true; ++v) {
                if(v >= 0x40) {
                    v = 0;
                    break;
                }
                if(arr_c[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(v)) {
                    break;
                }
            }
            arr_c[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | v);
            return String.valueOf(arr_c);
        }
        return s;
    }

    public final Bundle zza() {
        if("1".equals(this.zzb.get("GoogleConsent")) && "1".equals(this.zzb.get("gdprApplies")) && "1".equals(this.zzb.get("EnableAdvertiserConsentMode"))) {
            int v = this.zze();
            if(v < 0) {
                return Bundle.EMPTY;
            }
            String s = (String)this.zzb.get("PurposeConsents");
            if(TextUtils.isEmpty(s)) {
                return Bundle.EMPTY;
            }
            Bundle bundle0 = new Bundle();
            String s1 = "denied";
            if(s.length() > 0) {
                bundle0.putString("ad_storage", (s.charAt(0) == 49 ? "granted" : "denied"));
            }
            if(s.length() > 3) {
                bundle0.putString("ad_personalization", (s.charAt(2) != 49 || s.charAt(3) != 49 ? "denied" : "granted"));
            }
            if(s.length() > 6 && v >= 4) {
                if(s.charAt(0) == 49 && s.charAt(6) == 49) {
                    s1 = "granted";
                }
                bundle0.putString("ad_user_data", s1);
            }
            return bundle0;
        }
        return Bundle.EMPTY;
    }

    private static String zzb(SharedPreferences sharedPreferences0, String s) {
        try {
            return sharedPreferences0.getString(s, "\u0000");
        }
        catch(ClassCastException unused_ex) {
            return "\u0000";
        }
    }

    public final String zzb() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("1");
        int v = this.zzd();
        if(v < 0 || v > 0xFFF) {
            stringBuilder0.append("00");
        }
        else {
            stringBuilder0.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(v >> 6 & 0x3F));
            stringBuilder0.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(v & 0x3F));
        }
        int v1 = this.zze();
        if(v1 < 0 || v1 > 0x3F) {
            stringBuilder0.append("0");
        }
        else {
            stringBuilder0.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(v1));
        }
        Preconditions.checkArgument(true);
        int v2 = "1".equals(this.zzb.get("gdprApplies")) ? 2 : 0;
        stringBuilder0.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(("1".equals(this.zzb.get("EnableAdvertiserConsentMode")) ? v2 | 12 : v2 | 4)));
        return stringBuilder0.toString();
    }

    final String zzc() {
        StringBuilder stringBuilder0 = new StringBuilder();
        String[] arr_s = zznm.zza;
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(this.zzb.containsKey(s)) {
                if(stringBuilder0.length() > 0) {
                    stringBuilder0.append(";");
                }
                stringBuilder0.append(s);
                stringBuilder0.append("=");
                stringBuilder0.append(((String)this.zzb.get(s)));
            }
        }
        return stringBuilder0.toString();
    }

    private final int zzd() {
        try {
            String s = (String)this.zzb.get("CmpSdkID");
            return TextUtils.isEmpty(s) ? -1 : Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
        }
        return -1;
    }

    private final int zze() {
        try {
            String s = (String)this.zzb.get("PolicyVersion");
            return TextUtils.isEmpty(s) ? -1 : Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
        }
        return -1;
    }
}

