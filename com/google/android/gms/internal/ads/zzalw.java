package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public final class zzalw implements zzakf {
    private final zzdy zza;
    private final zzalm zzb;

    public zzalw() {
        this.zza = new zzdy();
        this.zzb = new zzalm();
    }

    // This method was un-flattened
    @Override  // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] arr_b, int v, int v1, zzake zzake0, zzdb zzdb0) {
        this.zza.zzJ(arr_b, v1 + v);
        this.zza.zzL(v);
        ArrayList arrayList0 = new ArrayList();
        try {
            zzdy zzdy0 = this.zza;
            int v2 = zzdy0.zzd();
            Charset charset0 = StandardCharsets.UTF_8;
            String s = zzdy0.zzz(charset0);
            if(s == null || !s.startsWith("WEBVTT")) {
                zzdy0.zzL(v2);
                throw zzbc.zza(("Expected WEBVTT. Got " + zzdy0.zzz(charset0)), null);
            }
        }
        catch(zzbc zzbc0) {
            throw new IllegalArgumentException(zzbc0);
        }
        while(!TextUtils.isEmpty(this.zza.zzz(StandardCharsets.UTF_8))) {
        }
        ArrayList arrayList1 = new ArrayList();
        while(true) {
            zzdy zzdy1 = this.zza;
            int v3 = zzdy1.zzd();
            String s1 = zzdy1.zzz(StandardCharsets.UTF_8);
            if(s1 == null) {
                zzdy1.zzL(v3);
                zzajz.zza(new zzalz(arrayList1), zzake0, zzdb0);
                return;
            }
            if("STYLE".equals(s1)) {
                zzdy1.zzL(v3);
                if(!arrayList1.isEmpty()) {
                    throw new IllegalArgumentException("A style block was found after the first cue.");
                }
                this.zza.zzz(StandardCharsets.UTF_8);
                arrayList0.addAll(this.zzb.zzb(this.zza));
            }
            else if(s1.startsWith("NOTE")) {
                zzdy1.zzL(v3);
                zzdy zzdy2 = this.zza;
                while(!TextUtils.isEmpty(zzdy2.zzz(StandardCharsets.UTF_8))) {
                }
            }
            else {
                zzdy1.zzL(v3);
                zzalo zzalo0 = zzalv.zzc(this.zza, arrayList0);
                if(zzalo0 != null) {
                    arrayList1.add(zzalo0);
                }
            }
        }
    }
}

