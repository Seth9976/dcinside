package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

public final class zzfok {
    public static boolean zza(int v) {
        return v - 1 == 2 || v - 1 == 4 || v - 1 == 5 || v - 1 == 6 || v - 1 == 7;
    }

    public static final int zzb(Context context0, zzfni zzfni0) {
        String s;
        int v;
        File file0 = new File(new File(context0.getApplicationInfo().dataDir), "lib");
        if(file0.exists()) {
            File[] arr_file = file0.listFiles(new zzgae(Pattern.compile(".*\\.so$", 2)));
            if(arr_file == null || arr_file.length == 0) {
                zzfni0.zzb(5017, "No .so");
            label_45:
                String s1 = zzfok.zzc(context0, zzfni0);
                if(TextUtils.isEmpty(s1)) {
                    zzfok.zzd(null, "Empty dev arch", context0, zzfni0);
                    v = 1;
                    s = "UNSUPPORTED";
                }
                else if(s1.equalsIgnoreCase("i686") || s1.equalsIgnoreCase("x86")) {
                    v = 5;
                    s = "X86";
                }
                else if(s1.equalsIgnoreCase("x86_64")) {
                    v = 7;
                    s = "X86_64";
                }
                else if(s1.equalsIgnoreCase("arm64-v8a")) {
                    v = 6;
                    s = "ARM64";
                }
                else if(s1.equalsIgnoreCase("armeabi-v7a") || s1.equalsIgnoreCase("armv71")) {
                    v = 3;
                    s = "ARM7";
                }
                else if(s1.equalsIgnoreCase("riscv64")) {
                    v = 8;
                    s = "RISCV64";
                }
                else {
                    zzfok.zzd(null, s1, context0, zzfni0);
                    v = 1;
                    s = "UNSUPPORTED";
                }
            }
            else {
                try(FileInputStream fileInputStream0 = new FileInputStream(arr_file[0])) {
                    byte[] arr_b = new byte[20];
                    if(fileInputStream0.read(arr_b) == 20) {
                        byte[] arr_b1 = {0, 0};
                        if(arr_b[5] == 2) {
                            zzfok.zzd(arr_b, null, context0, zzfni0);
                            goto label_41;
                        }
                        else {
                            arr_b1[0] = arr_b[19];
                            arr_b1[1] = arr_b[18];
                            switch(ByteBuffer.wrap(arr_b1).getShort()) {
                                case 3: {
                                    v = 5;
                                    s = "X86";
                                    break;
                                }
                                case 40: {
                                    v = 3;
                                    s = "ARM7";
                                    break;
                                }
                                case 62: {
                                    v = 7;
                                    s = "X86_64";
                                    break;
                                }
                                case 0xB7: {
                                    v = 6;
                                    s = "ARM64";
                                    break;
                                }
                                case 0xF3: {
                                    v = 8;
                                    s = "RISCV64";
                                    break;
                                }
                                default: {
                                    zzfok.zzd(arr_b, null, context0, zzfni0);
                                    goto label_41;
                                }
                            }
                        }
                    }
                    else {
                        goto label_41;
                    }
                    goto label_74;
                }
                catch(IOException iOException0) {
                    zzfok.zzd(null, iOException0.toString(), context0, zzfni0);
                }
            label_41:
                v = 1;
                s = "UNSUPPORTED";
            }
        }
        else {
            zzfni0.zzb(5017, "No lib/");
            goto label_45;
        }
    label_74:
        zzfni0.zzb(5018, s);
        return v;
    }

    private static final String zzc(Context context0, zzfni zzfni0) {
        HashSet hashSet0 = new HashSet(Arrays.asList(new String[]{"i686", "armv71"}));
        if(!TextUtils.isEmpty("aarch64") && hashSet0.contains("aarch64")) {
            return "aarch64";
        }
        String[] arr_s = Build.SUPPORTED_ABIS;
        if(arr_s != null && arr_s.length > 0) {
            try {
                return arr_s[0];
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                zzfni0.zzc(2024, 0L, noSuchFieldException0);
                return "arm64-v8a";
            }
            catch(IllegalAccessException illegalAccessException0) {
                zzfni0.zzc(2024, 0L, illegalAccessException0);
                return "arm64-v8a";
            }
        }
        return "arm64-v8a";
    }

    private static final void zzd(byte[] arr_b, String s, Context context0, zzfni zzfni0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("os.arch:");
        stringBuilder0.append("aarch64");
        stringBuilder0.append(";");
        String[] arr_s = Build.SUPPORTED_ABIS;
        if(arr_s != null) {
            try {
                stringBuilder0.append("supported_abis:");
                stringBuilder0.append(Arrays.toString(arr_s));
                stringBuilder0.append(";");
            }
            catch(NoSuchFieldException | IllegalAccessException unused_ex) {
            }
        }
        stringBuilder0.append("CPU_ABI:");
        stringBuilder0.append("arm64-v8a");
        stringBuilder0.append(";CPU_ABI2:");
        stringBuilder0.append("arm64-v8a");
        stringBuilder0.append(";");
        if(arr_b != null) {
            stringBuilder0.append("ELF:");
            stringBuilder0.append(Arrays.toString(arr_b));
            stringBuilder0.append(";");
        }
        if(s != null) {
            stringBuilder0.append("dbg:");
            stringBuilder0.append(s);
            stringBuilder0.append(";");
        }
        zzfni0.zzb(4007, stringBuilder0.toString());
    }
}

