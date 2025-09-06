package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class zzdzp implements zzffr {
    protected final Context zza;
    protected final String zzb;

    public zzdzp(Context context0, String s, zzbvs zzbvs0, int v) {
        this.zza = context0;
        this.zzb = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzffr
    public final Object zza(Object object0) throws Exception {
        return this.zzb(((zzdzn)object0));
    }

    public final zzdzo zzb(zzdzn zzdzn0) throws zzdvy {
        long v = zzv.zzC().elapsedRealtime();
        return this.zzc(zzdzn0.zza, zzdzn0.zzb, zzdzn0.zzc, zzdzn0.zzd, zzdzn0.zze, v);
    }

    protected final zzdzo zzc(String s, int v, Map map0, byte[] arr_b, String s1, long v1) throws zzdvy {
        String s4;
        Closeable closeable0;
        InputStreamReader inputStreamReader0;
        URL uRL1;
        BufferedOutputStream bufferedOutputStream1;
        zzl zzl0;
        BufferedOutputStream bufferedOutputStream0;
        HttpURLConnection httpURLConnection0;
        int v2;
        HashMap hashMap0;
        URL uRL0;
        zzdzo zzdzo0;
        try {
            zzdzo0 = new zzdzo();
            zzo.zzi(("SDK version: " + this.zzb));
            zzo.zze(("AdRequestServiceImpl: Sending request: " + s));
            uRL0 = new URL(s);
            hashMap0 = new HashMap();
            v2 = 0;
            while(true) {
            label_6:
                httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                break;
            }
        }
        catch(IOException iOException0) {
            goto label_109;
        }
        try {
            zzv.zzq().zzf(this.zza, this.zzb, false, httpURLConnection0, false, v);
            for(Object object0: map0.entrySet()) {
                httpURLConnection0.addRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            if(!TextUtils.isEmpty(s1)) {
                httpURLConnection0.setRequestProperty("Content-Type", s1);
            }
            bufferedOutputStream0 = null;
            zzl0 = new zzl(null);
        }
        catch(zzdvy zzdvy0) {
            goto label_100;
        }
        catch(Throwable throwable0) {
            goto label_104;
        }
        try {
            zzl0.zzc(httpURLConnection0, arr_b);
            goto label_22;
        }
        catch(Throwable throwable1) {
            try {
                zzo.zzh("Network request logging failed.", throwable1);
                zzv.zzp().zzv(throwable1, "HttpRequestFunction.logAdRequest");
            label_22:
                if(arr_b.length > 0) {
                    httpURLConnection0.setDoOutput(true);
                    httpURLConnection0.setFixedLengthStreamingMode(arr_b.length);
                    goto label_25;
                }
                goto label_36;
            }
            catch(zzdvy zzdvy0) {
                goto label_100;
            }
            catch(Throwable throwable0) {
                goto label_104;
            }
        }
        try {
        label_25:
            bufferedOutputStream1 = new BufferedOutputStream(httpURLConnection0.getOutputStream());
        }
        catch(Throwable throwable2) {
            try {
                goto label_33;
            }
            catch(zzdvy zzdvy0) {
                goto label_100;
            }
            catch(Throwable throwable0) {
                goto label_104;
            }
        }
        try {
            bufferedOutputStream1.write(arr_b);
            goto label_35;
        }
        catch(Throwable throwable2) {
            try {
                bufferedOutputStream0 = bufferedOutputStream1;
            label_33:
                IOUtils.closeQuietly(bufferedOutputStream0);
                throw throwable2;
            label_35:
                IOUtils.closeQuietly(bufferedOutputStream1);
            label_36:
                int v3 = httpURLConnection0.getResponseCode();
                for(Object object1: httpURLConnection0.getHeaderFields().entrySet()) {
                    String s2 = (String)((Map.Entry)object1).getKey();
                    List list0 = (List)((Map.Entry)object1).getValue();
                    if(hashMap0.containsKey(s2)) {
                        ((List)hashMap0.get(s2)).addAll(list0);
                    }
                    else {
                        hashMap0.put(s2, new ArrayList(list0));
                    }
                }
                zzl0.zze(httpURLConnection0, v3);
                zzdzo0.zza = v3;
                zzdzo0.zzb = hashMap0;
                zzdzo0.zzc = "";
                if(v3 >= 200 && v3 < 300) {
                    goto label_73;
                }
                if(v3 < 300 || v3 >= 400) {
                    zzo.zzj(("Received error HTTP response code: " + v3));
                    throw new zzdvy(1, "Received error HTTP response code: " + v3);
                }
                String s3 = httpURLConnection0.getHeaderField("Location");
                if(TextUtils.isEmpty(s3)) {
                    zzo.zzj("No location header to follow redirect.");
                    throw new zzdvy(1, "No location header to follow redirect");
                }
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzhH)).booleanValue()) {
                    try {
                        uRL1 = new URI(s3).toURL();
                    }
                    catch(URISyntaxException uRISyntaxException0) {
                        throw new zzdvy(1, uRISyntaxException0.getMessage(), uRISyntaxException0);
                    }
                }
                else {
                    uRL1 = new URL(s3);
                }
                ++v2;
                if(v2 > ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzfb))))) {
                    zzo.zzj("Too many redirects.");
                    throw new zzdvy(1, "Too many redirects");
                }
            }
            catch(zzdvy zzdvy0) {
                goto label_100;
            }
            catch(Throwable throwable0) {
                goto label_104;
            }
        }
        try {
            httpURLConnection0.disconnect();
            uRL0 = uRL1;
            goto label_6;
        }
        catch(IOException iOException0) {
            goto label_109;
        }
        try {
        label_73:
            inputStreamReader0 = new InputStreamReader(httpURLConnection0.getInputStream());
        }
        catch(Throwable throwable3) {
            closeable0 = null;
            goto label_88;
        }
        try {
            StringBuilder stringBuilder0 = new StringBuilder(0x2000);
            char[] arr_c = new char[0x800];
            int v4;
            while((v4 = inputStreamReader0.read(arr_c)) != -1) {
                stringBuilder0.append(arr_c, 0, v4);
            }
            s4 = stringBuilder0.toString();
            goto label_90;
        }
        catch(Throwable throwable3) {
        }
        closeable0 = inputStreamReader0;
        try {
            try {
            label_88:
                IOUtils.closeQuietly(closeable0);
                throw throwable3;
            label_90:
                IOUtils.closeQuietly(inputStreamReader0);
                zzl0.zzg(s4);
                zzdzo0.zzc = s4;
                if(TextUtils.isEmpty(s4) && !((Boolean)zzbe.zzc().zza(zzbcl.zzfv)).booleanValue()) {
                    throw new zzdvy(3);
                }
                zzdzo0.zzd = zzv.zzC().elapsedRealtime() - v1;
                goto label_106;
            }
            catch(zzdvy zzdvy0) {
            }
        label_100:
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzih)).booleanValue()) {
                throw zzdvy0;
            }
            zzdzo0.zzd = zzv.zzC().elapsedRealtime() - v1;
            goto label_106;
        }
        catch(Throwable throwable0) {
        }
        try {
        label_104:
            httpURLConnection0.disconnect();
            throw throwable0;
        label_106:
            httpURLConnection0.disconnect();
            return zzdzo0;
        }
        catch(IOException iOException0) {
        label_109:
            String s5 = "Error while connecting to ad server: " + iOException0.getMessage();
            zzo.zzj(s5);
            throw new zzdvy(1, s5, iOException0);
        }
    }
}

