package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.Clock;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import jeb.synthetic.TWR;
import w4.d;

public final class zzle extends zzjd {
    zzle(zzhy zzhy0) {
        super(zzhy0);
    }

    static byte[] zza(zzle zzle0, HttpURLConnection httpURLConnection0) {
        return zzle.zza(httpURLConnection0);
    }

    @WorkerThread
    private static byte[] zza(HttpURLConnection httpURLConnection0) throws IOException {
        byte[] arr_b1;
        InputStream inputStream0 = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            inputStream0 = httpURLConnection0.getInputStream();
            byte[] arr_b = new byte[0x400];
            int v;
            while((v = inputStream0.read(arr_b)) > 0) {
                byteArrayOutputStream0.write(arr_b, 0, v);
            }
            arr_b1 = byteArrayOutputStream0.toByteArray();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(inputStream0, throwable0);
            throw throwable0;
        }
        inputStream0.close();
        return arr_b1;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final Context zza() {
        return super.zza();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final Clock zzb() {
        return super.zzb();
    }

    public final boolean zzc() {
        this.zzac();
        ConnectivityManager connectivityManager0 = (ConnectivityManager)this.zza().getSystemService("connectivity");
        NetworkInfo networkInfo0 = null;
        if(connectivityManager0 != null) {
            try {
                networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            }
            catch(SecurityException unused_ex) {
            }
        }
        return networkInfo0 != null && networkInfo0.isConnected();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzab zzd() {
        return super.zzd();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzag zze() {
        return super.zze();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzaz zzf() {
        return super.zzf();
    }

    @Override  // com.google.android.gms.measurement.internal.zzjd
    protected final boolean zzh() {
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzgh zzi() {
        return super.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzgo zzj() {
        return super.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzha zzk() {
        return super.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzhv zzl() {
        return super.zzl();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzos zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzr() {
        super.zzr();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzt() {
        super.zzt();
    }
}

