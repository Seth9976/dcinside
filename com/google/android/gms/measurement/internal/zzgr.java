package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfy.zzj;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import jeb.synthetic.TWR;
import w4.d;

public final class zzgr extends zznr {
    public zzgr(zznv zznv0) {
        super(zznv0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzoo g_() {
        return super.g_();
    }

    static byte[] zza(zzgr zzgr0, HttpURLConnection httpURLConnection0) {
        return zzgr.zza(httpURLConnection0);
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

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Context zza() {
        return super.zza();
    }

    @WorkerThread
    public final void zza(String s, zznw zznw0, zzj zzfy$zzj0, zzgu zzgu0) {
        this.zzt();
        this.zzal();
        try {
            URL uRL0 = new URI(zznw0.zzb()).toURL();
            this.g_();
            byte[] arr_b = zzfy$zzj0.zzca();
            this.zzl().zza(new zzgw(this, s, uRL0, arr_b, zznw0.zzc(), zzgu0));
        }
        catch(IllegalArgumentException | MalformedURLException | URISyntaxException unused_ex) {
            this.zzj().zzg().zza("Failed to parse URL. Not uploading MeasurementBatch. appId", zzgo.zza(s), zznw0.zzb());
        }
    }

    @WorkerThread
    public final void zza(String s, URL uRL0, byte[] arr_b, Map map0, zzgu zzgu0) {
        this.zzt();
        this.zzal();
        Preconditions.checkNotNull(uRL0);
        Preconditions.checkNotNull(arr_b);
        Preconditions.checkNotNull(zzgu0);
        this.zzl().zza(new zzgw(this, s, uRL0, arr_b, map0, zzgu0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Clock zzb() {
        return super.zzb();
    }

    @Override  // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
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

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzt zzg() {
        return super.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzal zzh() {
        return super.zzh();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzgh zzi() {
        return super.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzgo zzj() {
        return super.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzha zzk() {
        return super.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzhv zzl() {
        return super.zzl();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzhl zzm() {
        return super.zzm();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzmw zzn() {
        return super.zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zznu zzo() {
        return super.zzo();
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

    public final boolean zzu() {
        this.zzal();
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
}

