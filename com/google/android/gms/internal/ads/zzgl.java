package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public final class zzgl extends zzfr implements zzgt {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    @Nullable
    private final String zzd;
    @Nullable
    private final zzgs zze;
    private final zzgs zzf;
    @Nullable
    private zzgd zzg;
    @Nullable
    private HttpURLConnection zzh;
    @Nullable
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    zzgl(String s, int v, int v1, boolean z, boolean z1, zzgs zzgs0, zzfuo zzfuo0, boolean z2, zzgk zzgk0) {
        super(true);
        this.zzd = s;
        this.zzb = v;
        this.zzc = v1;
        this.zza = z;
        this.zze = zzgs0;
        this.zzf = new zzgs();
    }

    @Override  // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] arr_b, int v, int v1) throws zzgp {
        if(v1 == 0) {
            return 0;
        }
        try {
            long v2 = this.zzl;
            if(v2 == -1L) {
            label_7:
                int v4 = this.zzi.read(arr_b, v, v1);
                if(v4 != -1) {
                    this.zzm += (long)v4;
                    this.zzg(v4);
                    return v4;
                }
            }
            else {
                long v3 = v2 - this.zzm;
                if(v3 != 0L) {
                    v1 = (int)Math.min(v1, v3);
                    goto label_7;
                }
            }
            return -1;
        }
        catch(IOException iOException0) {
        }
        throw zzgp.zza(iOException0, this.zzg, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgd0) throws zzgp {
        byte[] arr_b;
        String s2;
        long v5;
        String s1;
        long v4;
        HttpURLConnection httpURLConnection1;
        HttpURLConnection httpURLConnection0;
        this.zzg = zzgd0;
        this.zzm = 0L;
        this.zzl = 0L;
        this.zzi(zzgd0);
        try {
            URL uRL0 = new URL(zzgd0.zza.toString());
            long v = zzgd0.zze;
            long v1 = zzgd0.zzf;
            boolean z = zzgd0.zzb(1);
            if(this.zza) {
                URL uRL1 = uRL0;
                int v2 = 0;
            alab1:
                while(true) {
                    if(v2 > 20) {
                        throw new zzgp(new NoRouteToHostException("Too many redirects: " + (v2 + 1)), zzgd0, 2001, 1);
                    }
                    httpURLConnection0 = this.zzk(uRL1, 1, null, v, v1, z, false, zzgd0.zzd);
                    int v3 = httpURLConnection0.getResponseCode();
                    String s = httpURLConnection0.getHeaderField("Location");
                    switch(v3) {
                        case 300: 
                        case 301: 
                        case 302: 
                        case 303: 
                        case 307: 
                        case 308: {
                            httpURLConnection0.disconnect();
                            uRL1 = this.zzl(uRL1, s, zzgd0);
                            ++v2;
                            break;
                        }
                        default: {
                            break alab1;
                        }
                    }
                }
                httpURLConnection1 = httpURLConnection0;
            }
            else {
                httpURLConnection1 = this.zzk(uRL0, 1, null, v, v1, z, true, zzgd0.zzd);
            }
            v4 = -1L;
            this.zzh = httpURLConnection1;
            this.zzk = httpURLConnection1.getResponseCode();
            s1 = httpURLConnection1.getResponseMessage();
        }
        catch(IOException iOException0) {
            this.zzm();
            throw zzgp.zza(iOException0, zzgd0, 1);
        }
        if(this.zzk >= 200 && this.zzk <= 299) {
            httpURLConnection1.getContentType();
            if(this.zzk == 200) {
                v5 = zzgd0.zze;
                if(v5 == 0L) {
                    v5 = 0L;
                }
            }
            else {
                v5 = 0L;
            }
            boolean z1 = "gzip".equalsIgnoreCase(httpURLConnection1.getHeaderField("Content-Encoding"));
            if(z1) {
                this.zzl = zzgd0.zzf;
            }
            else {
                long v6 = zzgd0.zzf;
                if(v6 == -1L) {
                    long v7 = zzgu.zza(httpURLConnection1.getHeaderField("Content-Length"), httpURLConnection1.getHeaderField("Content-Range"));
                    if(v7 != -1L) {
                        v4 = v7 - v5;
                    }
                    this.zzl = v4;
                }
                else {
                    this.zzl = v6;
                }
            }
            try {
                this.zzi = httpURLConnection1.getInputStream();
                if(z1) {
                    this.zzi = new GZIPInputStream(this.zzi);
                }
            }
            catch(IOException iOException1) {
                this.zzm();
                throw new zzgp(iOException1, zzgd0, 2000, 1);
            }
            this.zzj = true;
            this.zzj(zzgd0);
            if(v5 == 0L) {
                return this.zzl;
            }
            else {
                try {
                    while(v5 > 0L) {
                        int v8 = this.zzi.read(new byte[0x1000], 0, ((int)Math.min(v5, 0x1000L)));
                        if(Thread.currentThread().isInterrupted()) {
                            throw new zzgp(new InterruptedIOException(), zzgd0, 2000, 1);
                        }
                        if(v8 == -1) {
                            throw new zzgp(zzgd0, 2008, 1);
                        }
                        v5 -= (long)v8;
                        this.zzg(v8);
                    }
                    return this.zzl;
                }
                catch(IOException iOException2) {
                }
            }
            this.zzm();
            throw iOException2 instanceof zzgp ? ((zzgp)iOException2) : new zzgp(iOException2, zzgd0, 2000, 1);
        }
        Map map0 = httpURLConnection1.getHeaderFields();
        if(this.zzk == 0x1A0) {
            long v9 = zzgu.zzb(httpURLConnection1.getHeaderField("Content-Range"));
            s2 = s1;
            if(zzgd0.zze == v9) {
                this.zzj = true;
                this.zzj(zzgd0);
                return zzgd0.zzf == -1L ? 0L : zzgd0.zzf;
            }
        }
        else {
            s2 = s1;
        }
        InputStream inputStream0 = httpURLConnection1.getErrorStream();
        try {
            arr_b = inputStream0 == null ? zzei.zzf : zzgad.zzb(inputStream0);
        }
        catch(IOException unused_ex) {
            arr_b = zzei.zzf;
        }
        this.zzm();
        zzfz zzfz0 = this.zzk == 0x1A0 ? new zzfz(2008) : null;
        throw new zzgr(this.zzk, s2, zzfz0, map0, zzgd0, arr_b);
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection0 = this.zzh;
        if(httpURLConnection0 != null) {
            return Uri.parse(httpURLConnection0.getURL().toString());
        }
        return this.zzg == null ? null : this.zzg.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws zzgp {
        try {
            InputStream inputStream0 = this.zzi;
            if(inputStream0 != null) {
                try {
                    inputStream0.close();
                }
                catch(IOException iOException0) {
                    throw new zzgp(iOException0, this.zzg, 2000, 3);
                }
            }
        }
        finally {
            this.zzi = null;
            this.zzm();
            if(this.zzj) {
                this.zzj = false;
                this.zzh();
            }
            this.zzh = null;
            this.zzg = null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfr, com.google.android.gms.internal.ads.zzgt
    public final Map zze() {
        HttpURLConnection httpURLConnection0 = this.zzh;
        return httpURLConnection0 == null ? zzfxq.zzd() : new zzgj(httpURLConnection0.getHeaderFields());
    }

    private final HttpURLConnection zzk(URL uRL0, int v, @Nullable byte[] arr_b, long v1, long v2, boolean z, boolean z1, Map map0) throws IOException {
        String s;
        HttpURLConnection httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
        httpURLConnection0.setConnectTimeout(this.zzb);
        httpURLConnection0.setReadTimeout(this.zzc);
        HashMap hashMap0 = new HashMap();
        hashMap0.putAll(this.zze.zza());
        hashMap0.putAll(this.zzf.zza());
        hashMap0.putAll(map0);
        for(Object object0: hashMap0.entrySet()) {
            httpURLConnection0.setRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        if(v1 != 0L) {
        label_17:
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("bytes=");
            stringBuilder0.append(v1);
            stringBuilder0.append("-");
            if(v2 != -1L) {
                stringBuilder0.append(v1 + v2 - 1L);
            }
            s = stringBuilder0.toString();
        }
        else if(v2 == -1L) {
            s = null;
        }
        else {
            v1 = 0L;
            goto label_17;
        }
        if(s != null) {
            httpURLConnection0.setRequestProperty("Range", s);
        }
        String s1 = this.zzd;
        if(s1 != null) {
            httpURLConnection0.setRequestProperty("User-Agent", s1);
        }
        httpURLConnection0.setRequestProperty("Accept-Encoding", (z ? "gzip" : "identity"));
        httpURLConnection0.setInstanceFollowRedirects(z1);
        httpURLConnection0.setDoOutput(false);
        httpURLConnection0.setRequestMethod("GET");
        httpURLConnection0.connect();
        return httpURLConnection0;
    }

    private final URL zzl(URL uRL0, @Nullable String s, zzgd zzgd0) throws zzgp {
        URL uRL1;
        if(s == null) {
            throw new zzgp("Null location redirect", zzgd0, 2001, 1);
        }
        try {
            uRL1 = new URL(uRL0, s);
        }
        catch(MalformedURLException malformedURLException0) {
            throw new zzgp(malformedURLException0, zzgd0, 2001, 1);
        }
        String s1 = uRL1.getProtocol();
        if(!"https".equals(s1) && !"http".equals(s1)) {
            throw new zzgp("Unsupported protocol redirect: " + s1, zzgd0, 2001, 1);
        }
        if(!this.zza && !s1.equals(uRL0.getProtocol())) {
            throw new zzgp("Disallowed cross-protocol redirect (" + uRL0.getProtocol() + " to " + s1 + ")", zzgd0, 2001, 1);
        }
        return uRL1;
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection0 = this.zzh;
        if(httpURLConnection0 != null) {
            try {
                httpURLConnection0.disconnect();
            }
            catch(Exception exception0) {
                zzdo.zzd("DefaultHttpDataSource", "Unexpected error while disconnecting", exception0);
            }
        }
    }
}

