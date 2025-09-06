package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzfkr {
    private final zzflc zza;
    private final WebView zzb;
    private final List zzc;
    private final Map zzd;
    @Nullable
    private final String zze;
    @Nullable
    private final String zzf;
    private final zzfks zzg;

    private zzfkr(zzflc zzflc0, WebView webView0, String s, List list0, @Nullable String s1, @Nullable String s2, zzfks zzfks0) {
        this.zzc = new ArrayList();
        this.zzd = new HashMap();
        this.zza = zzflc0;
        this.zzb = webView0;
        this.zzg = zzfks0;
        this.zzf = s1;
        this.zze = s2;
    }

    public final WebView zza() {
        return this.zzb;
    }

    public static zzfkr zzb(zzflc zzflc0, WebView webView0, @Nullable String s, @Nullable String s1) {
        if(s1 != null) {
            zzfmk.zzd(s1, 0x100, "CustomReferenceData is greater than 256 characters");
        }
        return new zzfkr(zzflc0, webView0, null, null, s, s1, zzfks.zza);
    }

    public static zzfkr zzc(zzflc zzflc0, WebView webView0, @Nullable String s, @Nullable String s1) {
        zzfmk.zzd("", 0x100, "CustomReferenceData is greater than 256 characters");
        return new zzfkr(zzflc0, webView0, null, null, s, "", zzfks.zzc);
    }

    public final zzfks zzd() {
        return this.zzg;
    }

    public final zzflc zze() {
        return this.zza;
    }

    @Nullable
    public final String zzf() {
        return this.zzf;
    }

    @Nullable
    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return DesugarCollections.unmodifiableMap(this.zzd);
    }
}

