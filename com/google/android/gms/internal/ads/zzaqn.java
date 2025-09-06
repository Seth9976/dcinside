package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

public final class zzaqn extends zzaqa {
    public zzaqn() {
        throw null;
    }

    public zzaqn(zzaqm zzaqm0, SSLSocketFactory sSLSocketFactory0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzaqa
    public final zzaqk zza(zzapm zzapm0, Map map0) throws IOException, zzaou {
        zzaqk zzaqk0;
        int v1;
        HashMap hashMap0 = new HashMap();
        hashMap0.putAll(map0);
        hashMap0.putAll(zzapm0.zzl());
        URL uRL0 = new URL(zzapm0.zzk());
        HttpURLConnection httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
        httpURLConnection0.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int v = zzapm0.zzb();
        httpURLConnection0.setConnectTimeout(v);
        httpURLConnection0.setReadTimeout(v);
        boolean z = false;
        httpURLConnection0.setUseCaches(false);
        httpURLConnection0.setDoInput(true);
        "https".equals(uRL0.getProtocol());
        try {
            for(Object object0: hashMap0.keySet()) {
                httpURLConnection0.setRequestProperty(((String)object0), ((String)hashMap0.get(((String)object0))));
            }
            if(zzapm0.zza() == 0) {
                httpURLConnection0.setRequestMethod("GET");
            }
            else {
                httpURLConnection0.setRequestMethod("POST");
                byte[] arr_b = zzapm0.zzx();
                if(arr_b != null) {
                    httpURLConnection0.setDoOutput(true);
                    if(!httpURLConnection0.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection0.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream0 = new DataOutputStream(httpURLConnection0.getOutputStream());
                    dataOutputStream0.write(arr_b);
                    dataOutputStream0.close();
                }
            }
            v1 = httpURLConnection0.getResponseCode();
            if(v1 == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if(v1 >= 100 && v1 < 200 || (v1 == 204 || v1 == 304)) {
                zzaqk0 = new zzaqk(v1, zzaqn.zzb(httpURLConnection0.getHeaderFields()), -1, null);
                goto label_38;
            }
            return new zzaqk(v1, zzaqn.zzb(httpURLConnection0.getHeaderFields()), httpURLConnection0.getContentLength(), new zzaql(httpURLConnection0));
        }
        catch(Throwable throwable0) {
            goto label_43;
        }
    label_38:
        httpURLConnection0.disconnect();
        return zzaqk0;
        try {
        }
        catch(Throwable throwable0) {
            z = true;
        }
    label_43:
        if(!z) {
            httpURLConnection0.disconnect();
        }
        throw throwable0;
    }

    @VisibleForTesting
    static List zzb(Map map0) {
        List list0 = new ArrayList(map0.size());
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(map$Entry0.getKey() != null) {
                for(Object object1: ((List)map$Entry0.getValue())) {
                    list0.add(new zzape(((String)map$Entry0.getKey()), ((String)object1)));
                }
            }
        }
        return list0;
    }
}

