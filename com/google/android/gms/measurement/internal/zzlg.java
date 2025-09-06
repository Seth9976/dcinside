package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcy;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

@WorkerThread
final class zzlg implements Runnable {
    private final URL zza;
    private final zzld zzb;
    private final String zzc;
    private final Map zzd;
    private final zzle zze;

    public zzlg(zzle zzle0, String s, URL uRL0, byte[] arr_b, Map map0, zzld zzld0) {
        this.zze = zzle0;
        super();
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(uRL0);
        Preconditions.checkNotNull(zzld0);
        this.zza = uRL0;
        this.zzb = zzld0;
        this.zzc = s;
        this.zzd = null;
    }

    @Override
    public final void run() {
        byte[] arr_b;
        Map map0;
        HttpURLConnection httpURLConnection0;
        this.zze.zzr();
        int v = 0;
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
            goto label_30;
        }
        catch(Throwable throwable0) {
            httpURLConnection0 = null;
            map0 = null;
            goto label_35;
        }
        try {
            v = httpURLConnection0.getResponseCode();
            map0 = null;
            map0 = httpURLConnection0.getHeaderFields();
            arr_b = zzle.zza(this.zze, httpURLConnection0);
            goto label_39;
        }
        catch(IOException iOException0) {
            map0 = null;
            goto label_30;
            try {
                arr_b = zzle.zza(this.zze, httpURLConnection0);
                goto label_39;
            }
            catch(IOException iOException0) {
            }
            catch(Throwable throwable0) {
                goto label_35;
            }
        label_30:
            if(httpURLConnection0 != null) {
                httpURLConnection0.disconnect();
            }
            this.zzb(v, iOException0, null, map0);
            return;
        }
        catch(Throwable throwable0) {
        }
    label_35:
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        this.zzb(v, null, null, map0);
        throw throwable0;
    label_39:
        httpURLConnection0.disconnect();
        this.zzb(v, null, arr_b, map0);
    }

    // 检测为 Lambda 实现
    final void zza(int v, Exception exception0, byte[] arr_b, Map map0) [...]

    private final void zzb(int v, Exception exception0, byte[] arr_b, Map map0) {
        this.zze.zzl().zzb(() -> this.zzb.zza(this.zzc, v, exception0, arr_b, map0));
    }
}

