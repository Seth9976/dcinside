package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public final class zzfoy {
    public static File zza(@NonNull File file0, boolean z) {
        if(z && file0.exists() && !file0.isDirectory()) {
            file0.delete();
        }
        if(!file0.exists()) {
            file0.mkdirs();
        }
        return file0;
    }

    // 去混淆评级： 低(20)
    public static File zzb(String s, String s1, @NonNull File file0) {
        return TextUtils.isEmpty(s) || TextUtils.isEmpty(s1) ? null : new File(zzfoy.zzc(s, file0), s1);
    }

    public static File zzc(String s, @NonNull File file0) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        File file1 = new File(file0, s);
        zzfoy.zza(file1, false);
        return file1;
    }

    public static boolean zzd(@NonNull File file0) {
        if(!file0.exists()) {
            return true;
        }
        File[] arr_file = file0.listFiles();
        if(arr_file != null) {
            boolean z = true;
            for(int v = 0; v < arr_file.length; ++v) {
                File file1 = arr_file[v];
                z = file1 != null && zzfoy.zzd(file1) && z;
            }
            return file0.delete() && z;
        }
        return file0.delete();
    }

    public static boolean zze(@NonNull File file0, @NonNull byte[] arr_b) {
        FileOutputStream fileOutputStream0 = null;
        try {
            fileOutputStream0 = new FileOutputStream(file0);
            if(Build.VERSION.SDK_INT >= 34) {
                file0.setReadOnly();
            }
            fileOutputStream0.write(arr_b);
            fileOutputStream0.flush();
            return true;
        }
        catch(IOException unused_ex) {
            return false;
        }
        finally {
            IOUtils.closeQuietly(fileOutputStream0);
        }
    }
}

