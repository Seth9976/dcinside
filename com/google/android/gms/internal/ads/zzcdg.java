package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public final class zzcdg implements zzfqq {
    public final String zza;

    public zzcdg(String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqq
    public final URLConnection zza() {
        int v = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzM)));
        URL uRL0 = new URL(this.zza);
        int v1 = 0;
        while(true) {
            ++v1;
            if(v1 > 20) {
                throw new IOException("Too many redirects (20)");
            }
            URLConnection uRLConnection0 = uRL0.openConnection();
            uRLConnection0.setConnectTimeout(v);
            uRLConnection0.setReadTimeout(v);
            if(!(uRLConnection0 instanceof HttpURLConnection)) {
                throw new IOException("Invalid protocol.");
            }
            zzl zzl0 = new zzl(null);
            zzl0.zzc(((HttpURLConnection)uRLConnection0), null);
            ((HttpURLConnection)uRLConnection0).setInstanceFollowRedirects(false);
            int v2 = ((HttpURLConnection)uRLConnection0).getResponseCode();
            zzl0.zze(((HttpURLConnection)uRLConnection0), v2);
            if(v2 / 100 != 3) {
                return (HttpURLConnection)uRLConnection0;
            }
            String s = ((HttpURLConnection)uRLConnection0).getHeaderField("Location");
            if(s == null) {
                throw new IOException("Missing Location header in redirect");
            }
            URL uRL1 = new URL(uRL0, s);
            String s1 = uRL1.getProtocol();
            if(s1 == null) {
                break;
            }
            if(!s1.equals("http") && !s1.equals("https")) {
                throw new IOException("Unsupported scheme: " + s1);
            }
            zzo.zze(("Redirecting to " + s));
            ((HttpURLConnection)uRLConnection0).disconnect();
            uRL0 = uRL1;
        }
        throw new IOException("Protocol is null");
    }
}

