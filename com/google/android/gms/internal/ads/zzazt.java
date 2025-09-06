package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.PriorityQueue;
import o3.j;

@j
public final class zzazt {
    @VisibleForTesting
    static long zza(long v, int v1) {
        if(v1 == 1) {
            return v;
        }
        long v2 = v * v % 0x4000FFFFL;
        return (v1 & 1) == 0 ? zzazt.zza(v2, v1 >> 1) % 0x4000FFFFL : v * (zzazt.zza(v2, v1 >> 1) % 0x4000FFFFL) % 0x4000FFFFL;
    }

    @VisibleForTesting
    static String zzb(String[] arr_s, int v, int v1) {
        int v2 = v1 + v;
        if(arr_s.length < v2) {
            zzo.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        while(v < v2 - 1) {
            stringBuilder0.append(arr_s[v]);
            stringBuilder0.append(' ');
            ++v;
        }
        stringBuilder0.append(arr_s[v2 - 1]);
        return stringBuilder0.toString();
    }

    public static void zzc(String[] arr_s, int v, int v1, PriorityQueue priorityQueue0) {
        if(arr_s.length < 6) {
            zzazt.zzd(v, zzazt.zze(arr_s, 0, arr_s.length), zzazt.zzb(arr_s, 0, arr_s.length), arr_s.length, priorityQueue0);
            return;
        }
        long v2 = zzazt.zze(arr_s, 0, 6);
        zzazt.zzd(v, v2, zzazt.zzb(arr_s, 0, 6), 6, priorityQueue0);
        for(int v3 = 1; v3 < arr_s.length - 5; ++v3) {
            int v4 = zzazp.zza(arr_s[v3 - 1]);
            long v5 = (long)zzazp.zza(arr_s[v3 + 5]);
            String s = zzazt.zzb(arr_s, v3, 6);
            v2 = ((v2 + 0x4000FFFFL - zzazt.zza(0x1001FFFL, 5) * ((((long)v4) + 0x7FFFFFFFL) % 0x4000FFFFL) % 0x4000FFFFL) % 0x4000FFFFL * 0x1001FFFL % 0x4000FFFFL + (v5 + 0x7FFFFFFFL) % 0x4000FFFFL) % 0x4000FFFFL;
            zzazt.zzd(v, v2, s, arr_s.length, priorityQueue0);
        }
    }

    @VisibleForTesting
    static void zzd(int v, long v1, String s, int v2, PriorityQueue priorityQueue0) {
        zzazs zzazs0 = new zzazs(v1, s, v2);
        if((priorityQueue0.size() != v || ((zzazs)priorityQueue0.peek()).zzc <= zzazs0.zzc && ((zzazs)priorityQueue0.peek()).zza <= zzazs0.zza) && !priorityQueue0.contains(zzazs0)) {
            priorityQueue0.add(zzazs0);
            if(priorityQueue0.size() > v) {
                priorityQueue0.poll();
            }
        }
    }

    private static long zze(String[] arr_s, int v, int v1) {
        long v2 = (((long)zzazp.zza(arr_s[0])) + 0x7FFFFFFFL) % 0x4000FFFFL;
        for(int v3 = 1; v3 < v1; ++v3) {
            v2 = (v2 * 0x1001FFFL % 0x4000FFFFL + (((long)zzazp.zza(arr_s[v3])) + 0x7FFFFFFFL) % 0x4000FFFFL) % 0x4000FFFFL;
        }
        return v2;
    }
}

