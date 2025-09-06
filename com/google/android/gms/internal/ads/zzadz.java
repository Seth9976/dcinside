package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public final class zzadz {
    public static int zza(int v) {
        int v1;
        for(v1 = 0; v > 0; ++v1) {
            v >>>= 1;
        }
        return v1;
    }

    @Nullable
    public static zzay zzb(List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < list0.size(); ++v) {
            String s = (String)list0.get(v);
            String[] arr_s = s.split("=", 2);
            if(arr_s.length != 2) {
                zzdo.zzf("VorbisUtil", "Failed to parse Vorbis comment: " + s);
            }
            else if(arr_s[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList0.add(zzafn.zzb(new zzdy(Base64.decode(arr_s[1], 0))));
                }
                catch(RuntimeException runtimeException0) {
                    zzdo.zzg("VorbisUtil", "Failed to parse vorbis picture", runtimeException0);
                }
            }
            else {
                arrayList0.add(new zzahe(arr_s[0], arr_s[1]));
            }
        }
        return arrayList0.isEmpty() ? null : new zzay(arrayList0);
    }

    public static zzadw zzc(zzdy zzdy0, boolean z, boolean z1) throws zzbc {
        if(z) {
            zzadz.zzd(3, zzdy0, false);
        }
        String s = zzdy0.zzB(((int)zzdy0.zzs()), StandardCharsets.UTF_8);
        long v1 = zzdy0.zzs();
        String[] arr_s = new String[((int)v1)];
        int v2 = s.length() + 15;
        for(int v = 0; ((long)v) < v1; ++v) {
            String s1 = zzdy0.zzB(((int)zzdy0.zzs()), StandardCharsets.UTF_8);
            arr_s[v] = s1;
            v2 = v2 + 4 + s1.length();
        }
        if(z1 && (zzdy0.zzm() & 1) == 0) {
            throw zzbc.zza("framing bit expected to be set", null);
        }
        return new zzadw(s, arr_s, v2 + 1);
    }

    public static boolean zzd(int v, zzdy zzdy0, boolean z) throws zzbc {
        if(zzdy0.zzb() < 7) {
            if(!z) {
                throw zzbc.zza(("too short header: " + zzdy0.zzb()), null);
            }
            return false;
        }
        if(zzdy0.zzm() != v) {
            if(!z) {
                throw zzbc.zza(("expected header type " + Integer.toHexString(v)), null);
            }
            return false;
        }
        if(zzdy0.zzm() == 0x76 && zzdy0.zzm() == 0x6F && zzdy0.zzm() == 0x72 && zzdy0.zzm() == 98 && zzdy0.zzm() == 105 && zzdy0.zzm() == 0x73) {
            return true;
        }
        if(!z) {
            throw zzbc.zza("expected characters \'vorbis\'", null);
        }
        return false;
    }
}

