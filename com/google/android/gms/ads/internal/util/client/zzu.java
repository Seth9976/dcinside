package com.google.android.gms.ads.internal.util.client;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

public final class zzu implements zze {
    @Nullable
    private final String zza;

    public zzu() {
        throw null;
    }

    public zzu(@Nullable String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.ads.internal.util.client.zze
    @WorkerThread
    public final zzt zza(String s) {
        zzt zzt0;
        try {
            try {
                zzt0 = zzt.zzb;
                zzo.zze(("Pinging URL: " + s));
                HttpURLConnection httpURLConnection0 = (HttpURLConnection)new URI(s).toURL().openConnection();
                try {
                    String s1 = this.zza;
                    httpURLConnection0.setConnectTimeout(60000);
                    httpURLConnection0.setInstanceFollowRedirects(true);
                    httpURLConnection0.setReadTimeout(60000);
                    if(s1 != null) {
                        httpURLConnection0.setRequestProperty("User-Agent", s1);
                    }
                    httpURLConnection0.setUseCaches(false);
                    zzl zzl0 = new zzl(null);
                    zzl0.zzc(httpURLConnection0, null);
                    int v1 = httpURLConnection0.getResponseCode();
                    zzl0.zze(httpURLConnection0, v1);
                    if(v1 < 200 || v1 >= 300) {
                        zzo.zzj(("Received non-success response code " + v1 + " from pinging URL: " + s));
                        if(v1 == 502) {
                            zzt0 = zzt.zzc;
                        }
                    }
                    else {
                        zzt0 = zzt.zza;
                    }
                    return zzt0;
                }
                finally {
                    httpURLConnection0.disconnect();
                }
                goto label_32;
            }
            catch(IndexOutOfBoundsException | URISyntaxException indexOutOfBoundsException0) {
            }
            catch(IOException | RuntimeException iOException0) {
                goto label_32;
            }
            zzo.zzj(("Error while parsing ping URL: " + s + ". " + indexOutOfBoundsException0.getMessage()));
            return zzt0;
        label_32:
            zzo.zzj(("Error while pinging URL: " + s + ". " + iOException0.getMessage()));
            return zzt.zzc;
        }
        catch(Throwable throwable0) {
        }
        throw throwable0;
    }
}

