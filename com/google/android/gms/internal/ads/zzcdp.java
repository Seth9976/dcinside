package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

final class zzcdp extends zzfr implements zzgt {
    private static final Pattern zza;
    private static final AtomicReference zzb;
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzgs zzg;
    private zzgd zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    static {
        zzcdp.zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
        zzcdp.zzb = new AtomicReference();
    }

    zzcdp(String s, zzgy zzgy0, int v, int v1, int v2) {
        super(true);
        this.zzc = new zzcdo(this);
        this.zzr = new HashSet();
        zzcw.zzc(s);
        this.zzf = s;
        this.zzg = new zzgs();
        this.zzd = v;
        this.zze = v1;
        this.zzq = v2;
        if(zzgy0 != null) {
            this.zzf(zzgy0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] arr_b, int v, int v1) throws zzgp {
        try {
            int v2 = 0;
            if(this.zzo != this.zzm) {
                byte[] arr_b1 = (byte[])zzcdp.zzb.getAndSet(null);
                if(arr_b1 == null) {
                    arr_b1 = new byte[0x1000];
                }
                while(true) {
                    long v3 = this.zzo;
                    long v4 = this.zzm;
                    if(v3 == v4) {
                        break;
                    }
                    int v5 = this.zzj.read(arr_b1, 0, ((int)Math.min(v4 - v3, arr_b1.length)));
                    if(Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if(v5 == -1) {
                        throw new EOFException();
                    }
                    this.zzo += (long)v5;
                    this.zzg(v5);
                }
                zzcdp.zzb.set(arr_b1);
            }
            if(v1 != 0) {
                long v6 = this.zzn;
                if(v6 != -1L) {
                    long v7 = v6 - this.zzp;
                    if(v7 == 0L) {
                        return -1;
                    }
                    v1 = (int)Math.min(v1, v7);
                }
                v2 = this.zzj.read(arr_b, v, v1);
                if(v2 == -1) {
                    if(this.zzn != -1L) {
                        throw new EOFException();
                    }
                    return -1;
                }
                this.zzp += (long)v2;
                this.zzg(v2);
            }
            return v2;
        }
        catch(IOException iOException0) {
        }
        throw new zzgp(iOException0, this.zzh, 2000, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgd0) throws zzgp {
        long v7;
        long v5;
        long v3;
        HttpURLConnection httpURLConnection0;
        try {
            this.zzh = zzgd0;
            this.zzp = 0L;
            this.zzo = 0L;
            URL uRL0 = new URL(zzgd0.zza.toString());
            long v = zzgd0.zze;
            long v1 = zzgd0.zzf;
            boolean z = zzgd0.zzb(1);
            int v2 = 0;
        alab1:
            while(true) {
                if(v2 > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + (v2 + 1));
                }
                httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                if(httpURLConnection0 instanceof HttpsURLConnection) {
                    ((HttpsURLConnection)httpURLConnection0).setSSLSocketFactory(this.zzc);
                }
                httpURLConnection0.setConnectTimeout(this.zzd);
                httpURLConnection0.setReadTimeout(this.zze);
                Iterator iterator0 = this.zzg.zza().entrySet().iterator();
                while(true) {
                    v3 = -1L;
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    httpURLConnection0.setRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                }
                if(v != 0L) {
                    httpURLConnection0.setRequestProperty("Range", (v1 == -1L ? "bytes=" + v + "-" : "bytes=" + v + "-" + (v + v1 - 1L)));
                }
                else if(v1 != -1L) {
                    httpURLConnection0.setRequestProperty("Range", (v1 == -1L ? "bytes=" + 0L + "-" : "bytes=" + 0L + "-" + (v1 - 1L)));
                }
                httpURLConnection0.setRequestProperty("User-Agent", this.zzf);
                if(!z) {
                    httpURLConnection0.setRequestProperty("Accept-Encoding", "identity");
                }
                httpURLConnection0.setInstanceFollowRedirects(false);
                httpURLConnection0.setDoOutput(false);
                httpURLConnection0.connect();
                switch(httpURLConnection0.getResponseCode()) {
                    case 300: 
                    case 301: 
                    case 302: 
                    case 303: 
                    case 307: 
                    case 308: {
                        String s = httpURLConnection0.getHeaderField("Location");
                        httpURLConnection0.disconnect();
                        if(s == null) {
                            throw new ProtocolException("Null location redirect");
                        }
                        URL uRL1 = new URL(uRL0, s);
                        String s1 = uRL1.getProtocol();
                        if(!"https".equals(s1) && !"http".equals(s1)) {
                            throw new ProtocolException("Unsupported protocol redirect: " + s1);
                        }
                        uRL0 = uRL1;
                        ++v2;
                        break;
                    }
                    default: {
                        break alab1;
                    }
                }
            }
            this.zzi = httpURLConnection0;
        }
        catch(IOException iOException0) {
            throw new zzgp("Unable to connect to " + zzgd0.zza.toString(), iOException0, zzgd0, 2000, 1);
        }
        try {
            int v4 = httpURLConnection0.getResponseCode();
            this.zzl = v4;
        }
        catch(IOException iOException1) {
            this.zzn();
            throw new zzgp("Unable to connect to " + zzgd0.zza.toString(), iOException1, zzgd0, 2000, 1);
        }
        if(v4 >= 200 && v4 <= 299) {
            if(v4 == 200) {
                v5 = zzgd0.zze;
                if(v5 == 0L) {
                    v5 = 0L;
                }
            }
            else {
                v5 = 0L;
            }
            this.zzm = v5;
            if(zzgd0.zzb(1)) {
                this.zzn = zzgd0.zzf;
            }
            else {
                long v6 = zzgd0.zzf;
                if(v6 == -1L) {
                    HttpURLConnection httpURLConnection1 = this.zzi;
                    String s2 = httpURLConnection1.getHeaderField("Content-Length");
                    if(TextUtils.isEmpty(s2)) {
                        v7 = -1L;
                    }
                    else {
                        try {
                            v7 = Long.parseLong(s2);
                        }
                        catch(NumberFormatException unused_ex) {
                            zzo.zzg(("Unexpected Content-Length [" + s2 + "]"));
                            v7 = -1L;
                        }
                    }
                    String s3 = httpURLConnection1.getHeaderField("Content-Range");
                    if(!TextUtils.isEmpty(s3)) {
                        Matcher matcher0 = zzcdp.zza.matcher(s3);
                        if(matcher0.find()) {
                            try {
                                long v8 = Long.parseLong(matcher0.group(2)) - Long.parseLong(matcher0.group(1)) + 1L;
                                if(Long.compare(v7, 0L) < 0) {
                                    v7 = v8;
                                }
                                else if(v7 != v8) {
                                    zzo.zzj(("Inconsistent headers [" + s2 + "] [" + s3 + "]"));
                                    v7 = Math.max(v7, v8);
                                }
                            }
                            catch(NumberFormatException unused_ex) {
                                zzo.zzg(("Unexpected Content-Range [" + s3 + "]"));
                            }
                        }
                    }
                    if(v7 != -1L) {
                        v3 = v7 - this.zzm;
                    }
                    this.zzn = v3;
                }
                else {
                    this.zzn = v6;
                }
            }
            try {
                this.zzj = this.zzi.getInputStream();
            }
            catch(IOException iOException2) {
                this.zzn();
                throw new zzgp(iOException2, zzgd0, 2000, 1);
            }
            this.zzk = true;
            this.zzj(zzgd0);
            return this.zzn;
        }
        Map map0 = this.zzi.getHeaderFields();
        this.zzn();
        zzgr zzgr0 = new zzgr(this.zzl, null, null, map0, zzgd0, zzei.zzf);
        if(this.zzl == 0x1A0) {
            zzgr0.initCause(new zzfz(2008));
        }
        throw zzgr0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        return this.zzi == null ? null : Uri.parse(this.zzi.getURL().toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws zzgp {
        try {
            InputStream inputStream0 = this.zzj;
            if(inputStream0 != null) {
                try {
                    inputStream0.close();
                }
                catch(IOException iOException0) {
                    throw new zzgp(iOException0, this.zzh, 2000, 3);
                }
            }
        }
        finally {
            this.zzj = null;
            this.zzn();
            if(this.zzk) {
                this.zzk = false;
                this.zzh();
            }
            this.zzr.clear();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfr, com.google.android.gms.internal.ads.zzgt
    @Nullable
    public final Map zze() {
        return this.zzi == null ? null : this.zzi.getHeaderFields();
    }

    static void zzl(zzcdp zzcdp0, Socket socket0) {
        zzcdp0.zzr.add(socket0);
    }

    final void zzm(int v) {
        this.zzq = v;
        for(Object object0: this.zzr) {
            Socket socket0 = (Socket)object0;
            if(!socket0.isClosed()) {
                try {
                    socket0.setReceiveBufferSize(this.zzq);
                }
                catch(SocketException socketException0) {
                    zzo.zzk("Failed to update receive buffer size.", socketException0);
                }
            }
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection0 = this.zzi;
        if(httpURLConnection0 != null) {
            try {
                httpURLConnection0.disconnect();
            }
            catch(Exception exception0) {
                zzo.zzh("Unexpected error while disconnecting", exception0);
            }
            this.zzi = null;
        }
    }
}

