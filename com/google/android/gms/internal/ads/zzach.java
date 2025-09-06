package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzach implements zzacs {
    private static final int[] zza;
    private static final zzacg zzb;
    private static final zzacg zzc;
    @Nullable
    private zzfxn zzd;
    private final zzakd zze;

    static {
        zzach.zza = new int[]{5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
        zzach.zzb = new zzacg(new zzacd());
        zzach.zzc = new zzacg(new zzace());
    }

    public zzach() {
        this.zze = new zzajy();
    }

    @Override  // com.google.android.gms.internal.ads.zzacs
    public final zzacn[] zza(Uri uri0, Map map0) {
        int v2;
        int v1;
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList(21);
            List list0 = (List)map0.get("Content-Type");
            String s = list0 != null && !list0.isEmpty() ? ((String)list0.get(0)) : null;
            if(s == null) {
            label_65:
                v1 = -1;
            }
            else {
                switch(zzbb.zze(s)) {
                    case "application/mp4": {
                        v1 = 8;
                        goto label_66;
                    }
                    case "application/webm": {
                        break;
                    }
                    case "audio/3gpp": {
                        v1 = 3;
                        goto label_66;
                    }
                    case "audio/ac3": {
                        v1 = 0;
                        goto label_66;
                    }
                    case "audio/ac4": {
                        v1 = 1;
                        goto label_66;
                    }
                    case "audio/amr": {
                        v1 = 3;
                        goto label_66;
                    }
                    case "audio/amr-wb": {
                        v1 = 3;
                        goto label_66;
                    }
                    case "audio/eac3": {
                        v1 = 0;
                        goto label_66;
                    }
                    case "audio/eac3-joc": {
                        v1 = 0;
                        goto label_66;
                    }
                    case "audio/flac": {
                        v1 = 4;
                        goto label_66;
                    }
                    case "audio/midi": {
                        v1 = 15;
                        goto label_66;
                    }
                    case "audio/mp4": {
                        v1 = 8;
                        goto label_66;
                    }
                    case "audio/mpeg": {
                        v1 = 7;
                        goto label_66;
                    }
                    case "audio/ogg": {
                        v1 = 9;
                        goto label_66;
                    }
                    case "audio/wav": {
                        v1 = 12;
                        goto label_66;
                    }
                    case "video/x-matroska": 
                    case "audio/webm": {
                        break;
                    }
                    case "audio/x-matroska": {
                        break;
                    }
                    case "image/avif": {
                        v1 = 21;
                        goto label_66;
                    }
                    case "image/bmp": {
                        v1 = 19;
                        goto label_66;
                    }
                    case "image/heic": 
                    case "image/heif": {
                        v1 = 20;
                        goto label_66;
                    }
                    case "image/jpeg": {
                        v1 = 14;
                        goto label_66;
                    }
                    case "image/png": {
                        v1 = 17;
                        goto label_66;
                    }
                    case "image/webp": {
                        v1 = 18;
                        goto label_66;
                    }
                    case "text/vtt": {
                        v1 = 13;
                        goto label_66;
                    }
                    case "video/mp2p": {
                        v1 = 10;
                        goto label_66;
                    }
                    case "video/mp2t": {
                        v1 = 11;
                        goto label_66;
                    }
                    case "video/mp4": {
                        v1 = 8;
                        goto label_66;
                    }
                    case "video/webm": {
                        break;
                    }
                    case "video/x-flv": {
                        v1 = 5;
                        goto label_66;
                    }
                    case "video/x-msvideo": {
                        v1 = 16;
                        goto label_66;
                    }
                    default: {
                        goto label_65;
                    }
                }
                v1 = 6;
            }
        label_66:
            if(v1 != -1) {
                this.zzb(v1, arrayList0);
            }
            String s1 = uri0.getLastPathSegment();
            if(s1 == null) {
                v2 = -1;
            }
            else if(s1.endsWith(".ac3") || s1.endsWith(".ec3")) {
                v2 = 0;
            }
            else if(s1.endsWith(".ac4")) {
                v2 = 1;
            }
            else if(s1.endsWith(".adts") || s1.endsWith(".aac")) {
                v2 = 2;
            }
            else if(s1.endsWith(".amr")) {
                v2 = 3;
            }
            else if(s1.endsWith(".flac")) {
                v2 = 4;
            }
            else if(s1.endsWith(".flv")) {
                v2 = 5;
            }
            else if(s1.endsWith(".mid") || s1.endsWith(".midi") || s1.endsWith(".smf")) {
                v2 = 15;
            }
            else if(s1.startsWith(".mk", s1.length() - 4) || s1.endsWith(".webm")) {
                v2 = 6;
            }
            else if(s1.endsWith(".mp3")) {
                v2 = 7;
            }
            else if(s1.endsWith(".mp4") || s1.startsWith(".m4", s1.length() - 4) || s1.startsWith(".mp4", s1.length() - 5) || s1.startsWith(".cmf", s1.length() - 5)) {
                v2 = 8;
            }
            else if(s1.startsWith(".og", s1.length() - 4) || s1.endsWith(".opus")) {
                v2 = 9;
            }
            else if(s1.endsWith(".ps") || s1.endsWith(".mpeg") || s1.endsWith(".mpg") || s1.endsWith(".m2p")) {
                v2 = 10;
            }
            else if(s1.endsWith(".ts") || s1.startsWith(".ts", s1.length() - 4)) {
                v2 = 11;
            }
            else if(s1.endsWith(".wav") || s1.endsWith(".wave")) {
                v2 = 12;
            }
            else if(s1.endsWith(".vtt") || s1.endsWith(".webvtt")) {
                v2 = 13;
            }
            else if(s1.endsWith(".jpg") || s1.endsWith(".jpeg")) {
                v2 = 14;
            }
            else if(s1.endsWith(".avi")) {
                v2 = 16;
            }
            else if(s1.endsWith(".png")) {
                v2 = 17;
            }
            else if(s1.endsWith(".webp")) {
                v2 = 18;
            }
            else if(s1.endsWith(".bmp") || s1.endsWith(".dib")) {
                v2 = 19;
            }
            else if(s1.endsWith(".heic") || s1.endsWith(".heif")) {
                v2 = 20;
            }
            else if(s1.endsWith(".avif")) {
                v2 = 21;
            }
            else {
                v2 = -1;
            }
            if(v2 != -1 && v2 != v1) {
                this.zzb(v2, arrayList0);
            }
            int[] arr_v = zzach.zza;
            for(int v3 = 0; v3 < 21; ++v3) {
                int v4 = arr_v[v3];
                if(v4 != v1 && v4 != v2) {
                    this.zzb(v4, arrayList0);
                }
            }
            return (zzacn[])arrayList0.toArray(new zzacn[arrayList0.size()]);
        }
    }

    private final void zzb(int v, List list0) {
        switch(v) {
            case 0: {
                list0.add(new zzama());
                return;
            }
            case 1: {
                list0.add(new zzamc());
                return;
            }
            case 2: {
                list0.add(new zzame(0));
                return;
            }
            case 3: {
                list0.add(new zzaea(0));
                return;
            }
            case 4: {
                zzacn zzacn0 = zzach.zzb.zza(new Object[]{0});
                if(zzacn0 != null) {
                    list0.add(zzacn0);
                    return;
                }
                list0.add(new zzaes(0));
                return;
            }
            case 5: {
                list0.add(new zzaeu());
                return;
            }
            case 6: {
                list0.add(new zzahm(this.zze, 0));
                return;
            }
            case 7: {
                list0.add(new zzahs(0));
                return;
            }
            case 8: {
                list0.add(new zzaiq(this.zze, 0, null, null, zzfxn.zzn(), null));
                list0.add(new zzaiv(this.zze, 0));
                return;
            }
            case 9: {
                list0.add(new zzajl());
                return;
            }
            case 10: {
                list0.add(new zzanj());
                return;
            }
            case 11: {
                if(this.zzd == null) {
                    this.zzd = zzfxn.zzn();
                }
                zzef zzef0 = new zzef(0L);
                zzamg zzamg0 = new zzamg(0, this.zzd);
                list0.add(new zzant(1, 0, this.zze, zzef0, zzamg0, 112800));
                return;
            }
            case 12: {
                list0.add(new zzaoe());
                return;
            }
            case 14: {
                list0.add(new zzafa(0));
                return;
            }
            case 15: {
                zzacn zzacn1 = zzach.zzc.zza(new Object[0]);
                if(zzacn1 != null) {
                    list0.add(zzacn1);
                }
                return;
            }
            case 16: {
                list0.add(new zzaef(0, this.zze));
                return;
            }
            case 17: {
                list0.add(new zzajw());
                return;
            }
            case 18: {
                list0.add(new zzaoj());
                return;
            }
            case 19: {
                list0.add(new zzaen());
                return;
            }
            case 20: {
                list0.add(new zzaez());
                return;
            }
            case 21: {
                list0.add(new zzaem());
            }
        }
    }
}

