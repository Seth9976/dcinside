package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class zzl {
    public static final int zza = 0;
    private static final Object zzb = null;
    @GuardedBy("lock")
    private static boolean zzc = false;
    @GuardedBy("lock")
    private static boolean zzd = false;
    private static final Clock zze;
    private static final Set zzf;
    private final List zzg;

    static {
        zzl.zzb = new Object();
        zzl.zze = DefaultClock.getInstance();
        zzl.zzf = new HashSet(Arrays.asList(new String[0]));
    }

    public zzl() {
        throw null;
    }

    public zzl(@Nullable String s) {
        List list0 = zzl.zzk() ? Arrays.asList(new String[]{"network_request_56176e7e-3c0f-448b-8feb-29fb1b21ebef"}) : new ArrayList();
        this.zzg = list0;
    }

    // 检测为 Lambda 实现
    static void zza(String s, String s1, Map map0, byte[] arr_b, JsonWriter jsonWriter0) throws IOException [...]

    // 检测为 Lambda 实现
    static void zzb(int v, Map map0, JsonWriter jsonWriter0) throws IOException [...]

    public final void zzc(HttpURLConnection httpURLConnection0, @Nullable byte[] arr_b) {
        if(!zzl.zzk()) {
            return;
        }
        HashMap hashMap0 = httpURLConnection0.getRequestProperties() == null ? null : new HashMap(httpURLConnection0.getRequestProperties());
        this.zzp(new String(httpURLConnection0.getURL().toString()), new String(httpURLConnection0.getRequestMethod()), hashMap0, arr_b);
    }

    public final void zzd(String s, String s1, @Nullable Map map0, @Nullable byte[] arr_b) {
        if(!zzl.zzk()) {
            return;
        }
        this.zzp(s, "GET", map0, arr_b);
    }

    public final void zze(HttpURLConnection httpURLConnection0, int v) {
        String s = null;
        if(zzl.zzk()) {
            this.zzq((httpURLConnection0.getHeaderFields() == null ? null : new HashMap(httpURLConnection0.getHeaderFields())), v);
            if(v < 200 || v >= 300) {
                try {
                    s = httpURLConnection0.getResponseMessage();
                }
                catch(IOException iOException0) {
                    zzo.zzj(("Can not get error message from error HttpURLConnection\n" + iOException0.getMessage()));
                }
                this.zzo(s);
            }
        }
    }

    public final void zzf(@Nullable Map map0, int v) {
        if(zzl.zzk()) {
            this.zzq(map0, v);
            if(v < 200 || v >= 300) {
                this.zzo(null);
            }
        }
    }

    public final void zzg(@Nullable String s) {
        if(zzl.zzk() && s != null) {
            this.zzh(s.getBytes());
        }
    }

    public final void zzh(byte[] arr_b) {
        this.zzn("onNetworkResponseBody", new zzh(arr_b));
    }

    public static void zzi() {
        synchronized(zzl.zzb) {
            zzl.zzc = false;
            zzl.zzd = false;
            zzo.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z) {
        synchronized(zzl.zzb) {
            zzl.zzc = true;
            zzl.zzd = z;
        }
    }

    public static boolean zzk() {
        boolean z = false;
        synchronized(zzl.zzb) {
            if(zzl.zzc && zzl.zzd) {
                z = true;
            }
        }
        return z;
    }

    public static boolean zzl() {
        synchronized(zzl.zzb) {
        }
        return zzl.zzc;
    }

    private static void zzm(String s) {
        synchronized(zzl.class) {
            zzo.zzi("GMA Debug BEGIN");
            for(int v1 = 0; v1 < s.length(); v1 += 4000) {
                zzo.zzi(("GMA Debug CONTENT " + s.substring(v1, Math.min(v1 + 4000, s.length()))));
            }
            zzo.zzi("GMA Debug FINISH");
        }
    }

    private final void zzn(String s, zzk zzk0) {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        try {
            jsonWriter0.beginObject();
            jsonWriter0.name("timestamp").value(zzl.zze.currentTimeMillis());
            jsonWriter0.name("event").value(s);
            jsonWriter0.name("components").beginArray();
            for(Object object0: this.zzg) {
                jsonWriter0.value(((String)object0));
            }
            jsonWriter0.endArray();
            zzk0.zza(jsonWriter0);
            jsonWriter0.endObject();
            jsonWriter0.flush();
            jsonWriter0.close();
        }
        catch(IOException iOException0) {
            zzo.zzh("unable to log", iOException0);
        }
        zzl.zzm(stringWriter0.toString());
    }

    private final void zzo(@Nullable String s) {
        this.zzn("onNetworkRequestError", new zzi(s));
    }

    private final void zzp(String s, String s1, @Nullable Map map0, @Nullable byte[] arr_b) {
        this.zzn("onNetworkRequest", (JsonWriter jsonWriter0) -> {
            jsonWriter0.name("params").beginObject();
            jsonWriter0.name("firstline").beginObject();
            jsonWriter0.name("uri").value(s);
            jsonWriter0.name("verb").value(s1);
            jsonWriter0.endObject();
            zzl.zzr(jsonWriter0, map0);
            if(arr_b != null) {
                jsonWriter0.name("body").value(Base64Utils.encode(arr_b));
            }
            jsonWriter0.endObject();
        });
    }

    private final void zzq(@Nullable Map map0, int v) {
        this.zzn("onNetworkResponse", (JsonWriter jsonWriter0) -> {
            jsonWriter0.name("params").beginObject();
            jsonWriter0.name("firstline").beginObject();
            jsonWriter0.name("code").value(((long)v));
            jsonWriter0.endObject();
            zzl.zzr(jsonWriter0, map0);
            jsonWriter0.endObject();
        });
    }

    private static void zzr(JsonWriter jsonWriter0, @Nullable Map map0) throws IOException {
        if(map0 == null) {
            return;
        }
        jsonWriter0.name("headers").beginArray();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s = (String)map$Entry0.getKey();
            if(zzl.zzf.contains(s)) {
            }
            else if(map$Entry0.getValue() instanceof List) {
                for(Object object1: ((List)map$Entry0.getValue())) {
                    jsonWriter0.beginObject();
                    jsonWriter0.name("name").value(s);
                    jsonWriter0.name("value").value(((String)object1));
                    jsonWriter0.endObject();
                }
            }
            else if(map$Entry0.getValue() instanceof String) {
                jsonWriter0.beginObject();
                jsonWriter0.name("name").value(s);
                jsonWriter0.name("value").value(((String)map$Entry0.getValue()));
                jsonWriter0.endObject();
            }
            else {
                zzo.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                if(true) {
                    break;
                }
            }
        }
        jsonWriter0.endArray();
    }
}

