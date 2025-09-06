package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcy;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map.Entry;
import java.util.Map;

@WorkerThread
final class zzgw implements Runnable {
    private final URL zza;
    private final byte[] zzb;
    private final zzgu zzc;
    private final String zzd;
    private final Map zze;
    private final zzgr zzf;

    public zzgw(zzgr zzgr0, String s, URL uRL0, byte[] arr_b, Map map0, zzgu zzgu0) {
        this.zzf = zzgr0;
        super();
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(uRL0);
        Preconditions.checkNotNull(zzgu0);
        this.zza = uRL0;
        this.zzb = arr_b;
        this.zzc = zzgu0;
        this.zzd = s;
        this.zze = map0;
    }

    @Override
    public final void run() {
        byte[] arr_b1;
        Map map3;
        int v2;
        int v1;
        int v;
        Throwable throwable2;
        IOException iOException2;
        OutputStream outputStream1;
        byte[] arr_b;
        Map map1;
        Map map0;
        HttpURLConnection httpURLConnection0;
        this.zzf.zzr();
        OutputStream outputStream0 = null;
        try {
            URLConnection uRLConnection0 = zzcy.zza().zza(this.zza, "client-measurement");
            if(!(uRLConnection0 instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection0 = (HttpURLConnection)uRLConnection0;
            httpURLConnection0.setDefaultUseCaches(false);
            httpURLConnection0.setConnectTimeout(60000);
            httpURLConnection0.setReadTimeout(61000);
            httpURLConnection0.setInstanceFollowRedirects(false);
            httpURLConnection0.setDoInput(true);
        }
        catch(IOException iOException0) {
            httpURLConnection0 = null;
            map0 = null;
            iOException2 = iOException0;
            v2 = 0;
            goto label_77;
        }
        catch(Throwable throwable0) {
            httpURLConnection0 = null;
            map1 = null;
            throwable2 = throwable0;
            v1 = 0;
            goto label_90;
        }
        try {
            Map map2 = this.zze;
            if(map2 != null) {
                for(Object object0: map2.entrySet()) {
                    httpURLConnection0.addRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                }
            }
            if(this.zzb != null) {
                arr_b = this.zzf.g_().zzb(this.zzb);
                this.zzf.zzj().zzp().zza("Uploading data. size", ((int)arr_b.length));
                httpURLConnection0.setDoOutput(true);
                httpURLConnection0.addRequestProperty("Content-Encoding", "gzip");
                httpURLConnection0.setFixedLengthStreamingMode(arr_b.length);
                httpURLConnection0.connect();
                outputStream1 = httpURLConnection0.getOutputStream();
                goto label_35;
            }
            v = httpURLConnection0.getResponseCode();
            goto label_60;
        }
        catch(IOException iOException0) {
            map0 = null;
            iOException2 = iOException0;
            v2 = 0;
            goto label_77;
        }
        catch(Throwable throwable0) {
            map1 = null;
            throwable2 = throwable0;
            v1 = 0;
            goto label_90;
        }
        try {
        label_35:
            outputStream1.write(arr_b);
            outputStream1.close();
        }
        catch(IOException iOException1) {
            map0 = null;
            outputStream0 = outputStream1;
            iOException2 = iOException1;
            v2 = 0;
            goto label_77;
        }
        catch(Throwable throwable1) {
            map1 = null;
            outputStream0 = outputStream1;
            throwable2 = throwable1;
            v1 = 0;
            goto label_90;
        }
        try {
            v = httpURLConnection0.getResponseCode();
        }
        catch(IOException iOException0) {
            map0 = null;
            iOException2 = iOException0;
            v2 = 0;
            goto label_77;
        }
        catch(Throwable throwable0) {
            map1 = null;
            throwable2 = throwable0;
            v1 = 0;
            goto label_90;
        }
        try {
        label_60:
            map3 = httpURLConnection0.getHeaderFields();
        }
        catch(IOException iOException3) {
            map0 = null;
            v2 = v;
            goto label_76;
        }
        catch(Throwable throwable3) {
            map1 = null;
            throwable2 = throwable3;
            v1 = v;
            goto label_90;
        }
        try {
            arr_b1 = zzgr.zza(this.zzf, httpURLConnection0);
            goto label_99;
        }
        catch(IOException iOException3) {
            v2 = v;
            map0 = map3;
        label_76:
            iOException2 = iOException3;
        label_77:
            if(outputStream0 != null) {
                try {
                    outputStream0.close();
                }
                catch(IOException iOException4) {
                    this.zzf.zzj().zzg().zza("Error closing HTTP compressed POST connection output stream. appId", zzgo.zza(this.zzd), iOException4);
                }
            }
            if(httpURLConnection0 != null) {
                httpURLConnection0.disconnect();
            }
            this.zzf.zzl().zzb(new zzgt(this.zzd, this.zzc, v2, iOException2, null, map0, null));
            return;
        }
        catch(Throwable throwable4) {
            throwable2 = throwable4;
            v1 = v;
            map1 = map3;
        }
    label_90:
        if(outputStream0 != null) {
            try {
                outputStream0.close();
            }
            catch(IOException iOException5) {
                this.zzf.zzj().zzg().zza("Error closing HTTP compressed POST connection output stream. appId", zzgo.zza(this.zzd), iOException5);
            }
        }
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        this.zzf.zzl().zzb(new zzgt(this.zzd, this.zzc, v1, null, null, map1, null));
        throw throwable2;
    label_99:
        httpURLConnection0.disconnect();
        this.zzf.zzl().zzb(new zzgt(this.zzd, this.zzc, v, null, arr_b1, map3, null));
    }
}

