package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.collection.SimpleArrayMap;
import com.google.common.base.C;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public final class zzhg {
    public static class zza {
        private static volatile C zza;

        static {
        }

        public static C zza(Context context0) {
            C c1;
            C c0 = zza.zza;
            if(c0 == null) {
                synchronized(zza.class) {
                    c0 = zza.zza;
                    if(c0 == null) {
                        if(zzhk.zza(Build.TYPE, Build.TAGS)) {
                            if(!context0.isDeviceProtectedStorage()) {
                                context0 = context0.createDeviceProtectedStorageContext();
                            }
                            c1 = zzhg.zza(context0);
                        }
                        else {
                            c1 = C.a();
                        }
                        zza.zza = c1;
                        c0 = c1;
                    }
                }
            }
            return c0;
        }
    }

    private static zzhh zza(Context context0, File file0) {
        try(BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(new FileInputStream(file0)))) {
            SimpleArrayMap simpleArrayMap0 = new SimpleArrayMap();
            HashMap hashMap0 = new HashMap();
            String s;
            while((s = bufferedReader0.readLine()) != null) {
                String[] arr_s = s.split(" ", 3);
                if(arr_s.length == 3) {
                    String s1 = zzhg.zza(arr_s[0]);
                    String s2 = Uri.decode(zzhg.zza(arr_s[1]));
                    String s3 = (String)hashMap0.get(arr_s[2]);
                    if(s3 == null) {
                        String s4 = zzhg.zza(arr_s[2]);
                        s3 = Uri.decode(s4);
                        if(s3.length() < 0x400 || s3 == s4) {
                            hashMap0.put(s4, s3);
                        }
                    }
                    SimpleArrayMap simpleArrayMap1 = (SimpleArrayMap)simpleArrayMap0.get(s1);
                    if(simpleArrayMap1 == null) {
                        simpleArrayMap1 = new SimpleArrayMap();
                        simpleArrayMap0.put(s1, simpleArrayMap1);
                    }
                    simpleArrayMap1.put(s2, s3);
                }
                else {
                    Log.e("HermeticFileOverrides", "Invalid: " + s);
                }
            }
            Log.w("HermeticFileOverrides", "Parsed " + file0 + " for Android package " + "com.dcinside.app.android");
            return new zzgy(simpleArrayMap0);
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    @VisibleForTesting
    static C zza(Context context0) {
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            C c0 = zzhg.zzb(context0);
            return c0.e() ? C.f(zzhg.zza(context0, ((File)c0.d()))) : C.a();
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
    }

    private static final String zza(String s) {
        return new String(s);
    }

    private static C zzb(Context context0) {
        try {
            File file0 = new File(context0.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file0.exists() ? C.f(file0) : C.a();
        }
        catch(RuntimeException runtimeException0) {
            Log.e("HermeticFileOverrides", "no data dir", runtimeException0);
            return C.a();
        }
    }
}

