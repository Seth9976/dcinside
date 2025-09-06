package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.ump.a;
import com.google.android.ump.c.b;
import com.google.android.ump.c.c;
import com.google.android.ump.d;
import j..util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;
import jeb.synthetic.TWR;

final class zzu {
    private final Application zza;
    private final Handler zzb;
    private final Executor zzc;
    private final zzap zzd;
    private final zzbn zze;
    private final zzl zzf;
    private final zzx zzg;
    private final zze zzh;

    zzu(Application application0, zzab zzab0, Handler handler0, Executor executor0, zzap zzap0, zzbn zzbn0, zzl zzl0, zzx zzx0, zze zze0) {
        this.zza = application0;
        this.zzb = handler0;
        this.zzc = executor0;
        this.zzd = zzap0;
        this.zze = zzbn0;
        this.zzf = zzl0;
        this.zzg = zzx0;
        this.zzh = zze0;
    }

    // 检测为 Lambda 实现
    final void zza(c c$c0, zzz zzz0) [...]

    // 检测为 Lambda 实现
    final void zzb(Activity activity0, d d0, c c$c0, b c$b0) [...]

    final void zzc(@Nullable Activity activity0, d d0, c c$c0, b c$b0) {
        zzq zzq0 = () -> {
            try {
                a a0 = d0.a();
                if(a0 == null || !a0.b()) {
                    Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + zzcl.zza(this.zza) + "\") to set this as a debug device.");
                }
                zzck zzck0 = this.zzd(this.zzf.zzc(activity0, d0));
                zzz zzz0 = new zzw(this.zzg, zzck0).zza();
                this.zzd.zzg(zzz0.zza);
                this.zzd.zzi(zzz0.zzb);
                this.zze.zzd(zzz0.zzc);
                this.zzh.zza().execute(() -> {
                    Objects.requireNonNull(c$c0);
                    zzt zzt0 = new zzt(c$c0);
                    this.zzb.post(zzt0);
                    if(zzz0.zzb != com.google.android.ump.c.d.b) {
                        this.zze.zzc();
                    }
                });
                return;
            }
            catch(zzg zzg0) {
            }
            catch(RuntimeException runtimeException0) {
                goto label_16;
            }
            zzr zzr0 = new zzr(c$b0, zzg0);
            this.zzb.post(zzr0);
            return;
        label_16:
            zzs zzs0 = new zzs(c$b0, new zzg(1, "Caught exception when trying to request consent info update: " + Log.getStackTraceString(runtimeException0)));
            this.zzb.post(zzs0);
        };
        this.zzc.execute(zzq0);
    }

    @WorkerThread
    private final zzck zzd(zzci zzci0) throws zzg {
        OutputStreamWriter outputStreamWriter0;
        HttpURLConnection httpURLConnection0;
        try {
            httpURLConnection0 = (HttpURLConnection)new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection0.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.zza));
            httpURLConnection0.setConnectTimeout(10000);
            httpURLConnection0.setReadTimeout(30000);
            httpURLConnection0.setDoOutput(true);
            httpURLConnection0.setRequestMethod("POST");
            httpURLConnection0.setRequestProperty("Content-Type", "application/json");
            outputStreamWriter0 = new OutputStreamWriter(httpURLConnection0.getOutputStream(), "UTF-8");
        }
        catch(SocketTimeoutException socketTimeoutException0) {
            throw new zzg(4, "The server timed out.", socketTimeoutException0);
        }
        catch(IOException iOException0) {
            throw new zzg(2, "Error making request.", iOException0);
        }
        try(JsonWriter jsonWriter0 = new JsonWriter(outputStreamWriter0)) {
            jsonWriter0.beginObject();
            String s = zzci0.zza;
            if(s != null) {
                jsonWriter0.name("admob_app_id");
                jsonWriter0.value(s);
            }
            zzce zzce0 = zzci0.zzb;
            if(zzce0 != null) {
                jsonWriter0.name("device_info");
                jsonWriter0.beginObject();
                int v = zzce0.zzc;
                if(v != 1) {
                    jsonWriter0.name("os_type");
                    switch(v - 1) {
                        case 0: {
                            jsonWriter0.value("UNKNOWN");
                            break;
                        }
                        case 1: {
                            jsonWriter0.value("ANDROID");
                            break;
                        }
                    }
                }
                String s1 = zzce0.zza;
                if(s1 != null) {
                    jsonWriter0.name("model");
                    jsonWriter0.value(s1);
                }
                Integer integer0 = zzce0.zzb;
                if(integer0 != null) {
                    jsonWriter0.name("android_api_level");
                    jsonWriter0.value(integer0);
                }
                jsonWriter0.endObject();
            }
            String s2 = zzci0.zzc;
            if(s2 != null) {
                jsonWriter0.name("language_code");
                jsonWriter0.value(s2);
            }
            Boolean boolean0 = zzci0.zzd;
            if(boolean0 != null) {
                jsonWriter0.name("tag_for_under_age_of_consent");
                jsonWriter0.value(boolean0.booleanValue());
            }
            Map map0 = zzci0.zze;
            if(!map0.isEmpty()) {
                jsonWriter0.name("stored_infos_map");
                jsonWriter0.beginObject();
                Iterator iterator0 = map0.entrySet().iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    jsonWriter0.name(((String)((Map.Entry)object0).getKey()));
                    jsonWriter0.value(((String)((Map.Entry)object0).getValue()));
                }
                jsonWriter0.endObject();
            }
            zzcg zzcg0 = zzci0.zzf;
            if(zzcg0 != null) {
                jsonWriter0.name("screen_info");
                jsonWriter0.beginObject();
                Integer integer1 = zzcg0.zza;
                if(integer1 != null) {
                    jsonWriter0.name("width");
                    jsonWriter0.value(integer1);
                }
                Integer integer2 = zzcg0.zzb;
                if(integer2 != null) {
                    jsonWriter0.name("height");
                    jsonWriter0.value(integer2);
                }
                Double double0 = zzcg0.zzc;
                if(double0 != null) {
                    jsonWriter0.name("density");
                    jsonWriter0.value(double0);
                }
                List list0 = zzcg0.zzd;
                if(!list0.isEmpty()) {
                    jsonWriter0.name("screen_insets");
                    jsonWriter0.beginArray();
                    Iterator iterator1 = list0.iterator();
                    while(true) {
                        if(!iterator1.hasNext()) {
                            break;
                        }
                        Object object1 = iterator1.next();
                        jsonWriter0.beginObject();
                        Integer integer3 = ((zzcf)object1).zza;
                        if(integer3 != null) {
                            jsonWriter0.name("top");
                            jsonWriter0.value(integer3);
                        }
                        Integer integer4 = ((zzcf)object1).zzb;
                        if(integer4 != null) {
                            jsonWriter0.name("left");
                            jsonWriter0.value(integer4);
                        }
                        Integer integer5 = ((zzcf)object1).zzc;
                        if(integer5 != null) {
                            jsonWriter0.name("right");
                            jsonWriter0.value(integer5);
                        }
                        Integer integer6 = ((zzcf)object1).zzd;
                        if(integer6 != null) {
                            jsonWriter0.name("bottom");
                            jsonWriter0.value(integer6);
                        }
                        jsonWriter0.endObject();
                    }
                    jsonWriter0.endArray();
                }
                jsonWriter0.endObject();
            }
            zzcc zzcc0 = zzci0.zzg;
            if(zzcc0 != null) {
                jsonWriter0.name("app_info");
                jsonWriter0.beginObject();
                String s3 = zzcc0.zza;
                if(s3 != null) {
                    jsonWriter0.name("package_name");
                    jsonWriter0.value(s3);
                }
                String s4 = zzcc0.zzb;
                if(s4 != null) {
                    jsonWriter0.name("publisher_display_name");
                    jsonWriter0.value(s4);
                }
                String s5 = zzcc0.zzc;
                if(s5 != null) {
                    jsonWriter0.name("version");
                    jsonWriter0.value(s5);
                }
                jsonWriter0.endObject();
            }
            zzch zzch0 = zzci0.zzh;
            if(zzch0 != null) {
                jsonWriter0.name("sdk_info");
                jsonWriter0.beginObject();
                String s6 = zzch0.zza;
                if(s6 != null) {
                    jsonWriter0.name("version");
                    jsonWriter0.value(s6);
                }
                jsonWriter0.endObject();
            }
            List list1 = zzci0.zzi;
            if(!list1.isEmpty()) {
                jsonWriter0.name("debug_params");
                jsonWriter0.beginArray();
                Iterator iterator2 = list1.iterator();
                while(true) {
                    if(!iterator2.hasNext()) {
                        break;
                    }
                    Object object2 = iterator2.next();
                    switch(((zzcd)object2).ordinal()) {
                        case 0: {
                            jsonWriter0.value("DEBUG_PARAM_UNKNOWN");
                            break;
                        }
                        case 1: {
                            jsonWriter0.value("ALWAYS_SHOW");
                            break;
                        }
                        case 2: {
                            jsonWriter0.value("GEO_OVERRIDE_EEA");
                            break;
                        }
                        case 3: {
                            jsonWriter0.value("GEO_OVERRIDE_NON_EEA");
                            break;
                        }
                        case 4: {
                            jsonWriter0.value("PREVIEWING_DEBUG_MESSAGES");
                            break;
                        }
                    }
                }
                jsonWriter0.endArray();
            }
            jsonWriter0.endObject();
            goto label_218;
        }
        catch(Throwable throwable0) {
            try {
                TWR.safeClose$NT(outputStreamWriter0, throwable0);
                throw throwable0;
            label_218:
                outputStreamWriter0.close();
                int v1 = httpURLConnection0.getResponseCode();
                if(v1 != 200) {
                    throw new IOException("Http error code - " + v1 + ".\n" + new Scanner(httpURLConnection0.getErrorStream()).useDelimiter("\\A").next());
                }
                String s7 = httpURLConnection0.getHeaderField("x-ump-using-header");
                if(s7 != null) {
                    zzck zzck0 = zzck.zza(new JsonReader(new StringReader(s7)));
                    zzck0.zza = new Scanner(httpURLConnection0.getInputStream()).useDelimiter("\\A").next();
                    return zzck0;
                }
                try(BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(httpURLConnection0.getInputStream(), "UTF-8"))) {
                    bufferedReader0.readLine();
                    try(JsonReader jsonReader0 = new JsonReader(bufferedReader0)) {
                        return zzck.zza(jsonReader0);
                    }
                }
            }
            catch(SocketTimeoutException socketTimeoutException0) {
            }
            catch(IOException iOException0) {
                throw new zzg(2, "Error making request.", iOException0);
            }
        }
        throw new zzg(4, "The server timed out.", socketTimeoutException0);
    }
}

