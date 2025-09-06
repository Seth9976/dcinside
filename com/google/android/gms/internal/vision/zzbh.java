package com.google.android.gms.internal.vision;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public final class zzbh {
    private static zzbe zza(File file0) {
        zzbe zzbe0;
        BufferedReader bufferedReader0;
        try {
            bufferedReader0 = new BufferedReader(new InputStreamReader(new FileInputStream(file0)));
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
        try {
            HashMap hashMap0 = new HashMap();
            String s;
            while((s = bufferedReader0.readLine()) != null) {
                String[] arr_s = s.split(" ", 3);
                if(arr_s.length == 3) {
                    String s1 = arr_s[0];
                    String s2 = Uri.decode(arr_s[1]);
                    String s3 = Uri.decode(arr_s[2]);
                    if(!hashMap0.containsKey(s1)) {
                        hashMap0.put(s1, new HashMap());
                    }
                    ((Map)hashMap0.get(s1)).put(s2, s3);
                }
                else {
                    Log.e("HermeticFileOverrides", (s.length() == 0 ? new String("Invalid: ") : "Invalid: " + s));
                }
            }
            Log.i("HermeticFileOverrides", "Parsed " + file0);
            zzbe0 = new zzbe(hashMap0);
            goto label_24;
        }
        catch(Throwable throwable0) {
        }
        try {
            bufferedReader0.close();
            throw throwable0;
        }
        catch(Throwable throwable1) {
            try {
                zzfe.zza(throwable0, throwable1);
                throw throwable0;
            label_24:
                bufferedReader0.close();
                return zzbe0;
            }
            catch(IOException iOException0) {
            }
        }
        throw new RuntimeException(iOException0);
    }

    public static zzcy zza(Context context0) {
        if(!Build.TYPE.equals("eng") && !Build.TYPE.equals("userdebug") || !Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys")) {
            return zzcy.zzc();
        }
        if(!context0.isDeviceProtectedStorage()) {
            context0 = context0.createDeviceProtectedStorageContext();
        }
        zzcy zzcy0 = zzbh.zzb(context0);
        return zzcy0.zza() ? zzcy.zza(zzbh.zza(((File)zzcy0.zzb()))) : zzcy.zzc();
    }

    private static zzcy zzb(Context context0) {
        zzcy zzcy0;
        File file0;
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            try {
                file0 = new File(context0.getDir("phenotype_hermetic", 0), "overrides.txt");
                zzcy0 = file0.exists() ? zzcy.zza(file0) : zzcy.zzc();
                goto label_16;
            }
            catch(RuntimeException runtimeException0) {
            }
            Log.e("HermeticFileOverrides", "no data dir", runtimeException0);
        }
        catch(Throwable throwable0) {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            throw throwable0;
        }
        StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        return zzcy.zzc();
        try {
            zzcy0 = file0.exists() ? zzcy.zza(file0) : zzcy.zzc();
        }
        catch(Throwable throwable0) {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            throw throwable0;
        }
    label_16:
        StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        return zzcy0;
    }
}

