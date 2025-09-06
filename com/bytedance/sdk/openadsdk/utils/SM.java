package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.ReZ;
import java.io.BufferedReader;
import java.io.FileReader;

public class SM {
    public static int PjT() [...] // 潜在的解密器

    public static int PjT(int v) {
        int v2;
        BufferedReader bufferedReader2;
        Throwable throwable1;
        BufferedReader bufferedReader1;
        FileReader fileReader1;
        int v1 = 0;
        FileReader fileReader0 = null;
        BufferedReader bufferedReader0 = null;
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            try {
                fileReader1 = new FileReader("/sys/devices/system/cpu/cpu" + v + "/cpufreq/cpuinfo_max_freq");
            }
            catch(Throwable throwable0) {
                bufferedReader1 = bufferedReader0;
                throwable1 = throwable0;
                goto label_25;
            }
            try {
                bufferedReader2 = new BufferedReader(fileReader1);
            }
            catch(Throwable throwable2) {
                throwable1 = throwable2;
                fileReader0 = fileReader1;
                bufferedReader1 = bufferedReader0;
                goto label_25;
            }
            try {
                String s = bufferedReader2.readLine();
                if(!TextUtils.isEmpty(s)) {
                    v2 = Integer.parseInt(s);
                    goto label_39;
                }
                goto label_41;
            }
            catch(Throwable throwable1) {
                bufferedReader1 = bufferedReader2;
                fileReader0 = fileReader1;
            }
            try {
            label_25:
                RD.Zh("CpuUtils", throwable1.getMessage());
            }
            catch(Throwable throwable3) {
                try {
                    if(bufferedReader1 != null) {
                        bufferedReader1.close();
                    }
                    if(fileReader0 != null) {
                        fileReader0.close();
                    }
                }
                catch(Exception unused_ex) {
                }
                throw throwable3;
            }
            if(bufferedReader1 == null) {
                goto label_35;
            }
            else {
                try {
                    bufferedReader1.close();
                label_35:
                    if(fileReader0 != null) {
                        fileReader0.close();
                    }
                }
                catch(Exception unused_ex) {
                }
                bufferedReader0 = bufferedReader1;
                continue;
            }
        label_39:
            if(v2 > v1) {
                v1 = v2;
            }
            try {
            label_41:
                bufferedReader2.close();
                fileReader1.close();
            }
            catch(Exception unused_ex) {
            }
            bufferedReader0 = bufferedReader2;
            fileReader0 = fileReader1;
        }
        return v1;
    }

    public static int PjT(Context context0) {
        return ReZ.PjT(context0).Zh("cpu_count", 0);
    }

    public static int ReZ(Context context0) {
        return ReZ.PjT(context0).Zh("cpu_min_frequency", 0);
    }

    public static int Zh(int v) {
        int v2;
        BufferedReader bufferedReader2;
        Throwable throwable1;
        BufferedReader bufferedReader1;
        FileReader fileReader1;
        int v1 = 0;
        FileReader fileReader0 = null;
        BufferedReader bufferedReader0 = null;
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            try {
                fileReader1 = new FileReader("/sys/devices/system/cpu/cpu" + v + "/cpufreq/cpuinfo_min_freq");
            }
            catch(Throwable throwable0) {
                bufferedReader1 = bufferedReader0;
                throwable1 = throwable0;
                goto label_25;
            }
            try {
                bufferedReader2 = new BufferedReader(fileReader1);
            }
            catch(Throwable throwable2) {
                throwable1 = throwable2;
                fileReader0 = fileReader1;
                bufferedReader1 = bufferedReader0;
                goto label_25;
            }
            try {
                String s = bufferedReader2.readLine();
                if(!TextUtils.isEmpty(s)) {
                    v2 = Integer.parseInt(s);
                    goto label_39;
                }
                goto label_41;
            }
            catch(Throwable throwable1) {
                bufferedReader1 = bufferedReader2;
                fileReader0 = fileReader1;
            }
            try {
            label_25:
                RD.Zh("CpuUtils", throwable1.getMessage());
            }
            catch(Throwable throwable3) {
                try {
                    if(bufferedReader1 != null) {
                        bufferedReader1.close();
                    }
                    if(fileReader0 != null) {
                        fileReader0.close();
                    }
                }
                catch(Exception unused_ex) {
                }
                throw throwable3;
            }
            if(bufferedReader1 == null) {
                goto label_35;
            }
            else {
                try {
                    bufferedReader1.close();
                label_35:
                    if(fileReader0 != null) {
                        fileReader0.close();
                    }
                }
                catch(Exception unused_ex) {
                }
                bufferedReader0 = bufferedReader1;
                continue;
            }
        label_39:
            if(v2 < v1 || v1 == 0) {
                v1 = v2;
            }
            try {
            label_41:
                bufferedReader2.close();
                fileReader1.close();
            }
            catch(Exception unused_ex) {
            }
            bufferedReader0 = bufferedReader2;
            fileReader0 = fileReader1;
        }
        return v1;
    }

    public static int Zh(Context context0) {
        return ReZ.PjT(context0).Zh("cpu_max_frequency", 0);
    }
}

