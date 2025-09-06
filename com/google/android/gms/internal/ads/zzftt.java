package com.google.android.gms.internal.ads;

public final class zzftt {
    public static String zza(String s) {
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(zzftt.zze(s.charAt(v1))) {
                char[] arr_c = s.toCharArray();
                while(v1 < v) {
                    int v2 = arr_c[v1];
                    if(zzftt.zze(((char)v2))) {
                        arr_c[v1] = (char)(v2 ^ 0x20);
                    }
                    ++v1;
                }
                return String.valueOf(arr_c);
            }
        }
        return s;
    }

    public static String zzb(String s) {
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(zzftt.zzd(s.charAt(v1))) {
                char[] arr_c = s.toCharArray();
                while(v1 < v) {
                    int v2 = arr_c[v1];
                    if(zzftt.zzd(((char)v2))) {
                        arr_c[v1] = (char)(v2 ^ 0x20);
                    }
                    ++v1;
                }
                return String.valueOf(arr_c);
            }
        }
        return s;
    }

    public static boolean zzc(CharSequence charSequence0, CharSequence charSequence1) {
        int v = charSequence0.length();
        if(charSequence0 == charSequence1) {
            return true;
        }
        if(v == charSequence1.length()) {
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = charSequence0.charAt(v1);
                int v3 = charSequence1.charAt(v1);
                if(v2 != v3) {
                    int v4 = (char)((((char)v2) | 0x20) - 97);
                    if(v4 >= 26 || v4 != ((char)((((char)v3) | 0x20) - 97))) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean zzd(char c) {
        return c >= 97 && c <= 0x7A;
    }

    public static boolean zze(char c) {
        return c >= 65 && c <= 90;
    }

    private static int zzf(char c) [...] // Inlined contents
}

