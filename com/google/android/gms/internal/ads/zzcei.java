package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class zzcei extends zzfr implements zzgt {
    private static final Pattern zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzgs zze;
    private zzgd zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    static {
        zzcei.zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    }

    zzcei(String s, zzgy zzgy0, int v, int v1, long v2, long v3) {
        super(true);
        zzcw.zzc(s);
        this.zzd = s;
        this.zze = new zzgs();
        this.zzb = v;
        this.zzc = v1;
        this.zzh = new ArrayDeque();
        this.zzq = v2;
        this.zzr = v3;
        if(zzgy0 != null) {
            this.zzf(zzgy0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] arr_b, int v, int v1) throws zzgp {
        if(v1 == 0) {
            return 0;
        }
        try {
            long v2 = this.zzm;
            if(this.zzl - v2 == 0L) {
                return -1;
            }
            long v3 = this.zzr;
            long v4 = this.zzp;
            if(this.zzn + v2 + ((long)v1) + v3 > v4 + 1L) {
                long v5 = this.zzo;
                if(v4 < v5) {
                    long v6 = Math.min(v5, Math.max(this.zzq + (v4 + 1L) - v3 - 1L, -1L + (v4 + 1L + ((long)v1))));
                    this.zzk(v4 + 1L, v6, 2);
                    this.zzp = v6;
                    v4 = v6;
                }
            }
            int v7 = this.zzi.read(arr_b, v, ((int)Math.min(v1, v4 + 1L - this.zzn - this.zzm)));
            if(v7 == -1) {
                throw new EOFException();
            }
            this.zzm += (long)v7;
            this.zzg(v7);
            return v7;
        }
        catch(IOException iOException0) {
        }
        throw new zzgp(iOException0, this.zzf, 2000, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgd0) throws zzgp {
        long v2;
        long v1;
        long v;
        this.zzf = zzgd0;
        this.zzm = 0L;
        this.zzn = zzgd0.zze;
        HttpURLConnection httpURLConnection0 = this.zzk(zzgd0.zze, (zzgd0.zzf == -1L ? this.zzq : Math.min(this.zzq, zzgd0.zzf)) + zzgd0.zze - 1L, 1);
        this.zzg = httpURLConnection0;
        String s = httpURLConnection0.getHeaderField("Content-Range");
        if(!TextUtils.isEmpty(s)) {
            Matcher matcher0 = zzcei.zza.matcher(s);
            if(matcher0.find()) {
                try {
                    Long.parseLong(matcher0.group(1));
                    v = Long.parseLong(matcher0.group(2));
                    v1 = Long.parseLong(matcher0.group(3));
                    v2 = zzgd0.zzf;
                }
                catch(NumberFormatException unused_ex) {
                    zzo.zzg(("Unexpected Content-Range [" + s + "]"));
                    throw new zzceg(s, zzgd0);
                }
                if(v2 == -1L) {
                    this.zzl = v1 - this.zzn;
                    this.zzo = v1 - 1L;
                }
                else {
                    this.zzl = v2;
                    this.zzo = Math.max(v, this.zzn + v2 - 1L);
                }
                this.zzp = v;
                this.zzj = true;
                this.zzj(zzgd0);
                return this.zzl;
            }
        }
        throw new zzceg(s, zzgd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        return this.zzg == null ? null : Uri.parse(this.zzg.getURL().toString());
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
                    throw new zzgp(iOException0, this.zzf, 2000, 3);
                }
            }
        }
        finally {
            this.zzi = null;
            this.zzl();
            if(this.zzj) {
                this.zzj = false;
                this.zzh();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfr, com.google.android.gms.internal.ads.zzgt
    @Nullable
    public final Map zze() {
        return this.zzg == null ? null : this.zzg.getHeaderFields();
    }

    @VisibleForTesting
    final HttpURLConnection zzk(long v, long v1, int v2) throws zzgp {
        HttpURLConnection httpURLConnection0;
        String s = this.zzf.zza.toString();
        try {
            httpURLConnection0 = (HttpURLConnection)new URL(s).openConnection();
            httpURLConnection0.setConnectTimeout(this.zzb);
            httpURLConnection0.setReadTimeout(this.zzc);
            for(Object object0: this.zze.zza().entrySet()) {
                httpURLConnection0.setRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            httpURLConnection0.setRequestProperty("Range", "bytes=" + v + "-" + v1);
            httpURLConnection0.setRequestProperty("User-Agent", this.zzd);
            httpURLConnection0.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection0.setRequestMethod("GET");
            httpURLConnection0.connect();
            this.zzh.add(httpURLConnection0);
        }
        catch(IOException iOException0) {
            throw new zzgp("Unable to connect to " + s, iOException0, this.zzf, 2000, v2);
        }
        String s1 = this.zzf.zza.toString();
        try {
            int v3 = httpURLConnection0.getResponseCode();
            this.zzk = v3;
        }
        catch(IOException iOException1) {
            this.zzl();
            throw new zzgp("Unable to connect to " + s1, iOException1, this.zzf, 2000, v2);
        }
        if(v3 >= 200 && v3 <= 299) {
            try {
                InputStream inputStream0 = httpURLConnection0.getInputStream();
                if(this.zzi != null) {
                    inputStream0 = new SequenceInputStream(this.zzi, inputStream0);
                }
                this.zzi = inputStream0;
                return httpURLConnection0;
            }
            catch(IOException iOException2) {
            }
            this.zzl();
            throw new zzgp(iOException2, this.zzf, 2000, v2);
        }
        Map map0 = httpURLConnection0.getHeaderFields();
        this.zzl();
        throw new zzceh(this.zzk, map0, this.zzf, v2);
    }

    private final void zzl() {
        while(!this.zzh.isEmpty()) {
            HttpURLConnection httpURLConnection0 = (HttpURLConnection)this.zzh.remove();
            try {
                httpURLConnection0.disconnect();
            }
            catch(Exception exception0) {
                zzo.zzh("Unexpected error while disconnecting", exception0);
            }
        }
        this.zzg = null;
    }
}

