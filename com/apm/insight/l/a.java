package com.apm.insight.l;

import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.ProcessErrorStateInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Debug.MemoryInfo;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.apm.insight.runtime.a.b;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONObject;

public final class a {
    private static String a = null;
    private static Class b = null;
    private static Field c = null;
    private static Field d = null;
    private static boolean e = false;

    static {
    }

    private static long a(int v) {
        return v >= 0 ? ((long)v) << 10 : 0L;
    }

    private static String a() {
        StringBuilder stringBuilder0;
        BufferedReader bufferedReader0 = null;
        try {
            bufferedReader0 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            stringBuilder0 = new StringBuilder();
            int v;
            while((v = bufferedReader0.read()) > 0) {
                stringBuilder0.append(((char)v));
            }
        }
        catch(Throwable unused_ex) {
            com.apm.insight.a.a(bufferedReader0);
            return null;
        }
        com.apm.insight.a.a(bufferedReader0);
        return stringBuilder0.toString();
    }

    public static void a(Context context0, JSONObject jSONObject0) {
        try {
            Debug.MemoryInfo debug$MemoryInfo0 = new Debug.MemoryInfo();
            Debug.getMemoryInfo(debug$MemoryInfo0);
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("dalvikPrivateDirty", a.a(debug$MemoryInfo0.dalvikPrivateDirty));
            jSONObject1.put("dalvikPss", a.a(debug$MemoryInfo0.dalvikPss));
            jSONObject1.put("dalvikSharedDirty", a.a(debug$MemoryInfo0.dalvikSharedDirty));
            jSONObject1.put("nativePrivateDirty", a.a(debug$MemoryInfo0.nativePrivateDirty));
            jSONObject1.put("nativePss", a.a(debug$MemoryInfo0.nativePss));
            jSONObject1.put("nativeSharedDirty", a.a(debug$MemoryInfo0.nativeSharedDirty));
            jSONObject1.put("otherPrivateDirty", a.a(debug$MemoryInfo0.otherPrivateDirty));
            jSONObject1.put("otherPss", a.a(debug$MemoryInfo0.otherPss));
            jSONObject1.put("otherSharedDirty", debug$MemoryInfo0.otherSharedDirty);
            if(Build.VERSION.SDK_INT >= 23) {
                try {
                    String s = debug$MemoryInfo0.getMemoryStat("summary.graphics");
                    if(!TextUtils.isEmpty(s)) {
                        jSONObject1.put("summary.graphics", a.a(Integer.parseInt(s)));
                    }
                }
                catch(Throwable unused_ex) {
                }
            }
            jSONObject1.put("totalPrivateClean", c.a(debug$MemoryInfo0));
            jSONObject1.put("totalPrivateDirty", debug$MemoryInfo0.getTotalPrivateDirty());
            jSONObject1.put("totalPss", a.a(debug$MemoryInfo0.getTotalPss()));
            jSONObject1.put("totalSharedClean", c.b(debug$MemoryInfo0));
            jSONObject1.put("totalSharedDirty", a.a(debug$MemoryInfo0.getTotalSharedDirty()));
            jSONObject1.put("totalSwappablePss", a.a(c.c(debug$MemoryInfo0)));
            jSONObject0.put("memory_info", jSONObject1);
            ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
            if(activityManager0 != null) {
                JSONObject jSONObject2 = new JSONObject();
                ActivityManager.MemoryInfo activityManager$MemoryInfo0 = new ActivityManager.MemoryInfo();
                activityManager0.getMemoryInfo(activityManager$MemoryInfo0);
                jSONObject2.put("availMem", activityManager$MemoryInfo0.availMem);
                jSONObject2.put("lowMemory", activityManager$MemoryInfo0.lowMemory);
                jSONObject2.put("threshold", activityManager$MemoryInfo0.threshold);
                jSONObject2.put("totalMem", i.a(activityManager$MemoryInfo0));
                jSONObject0.put("sys_memory_info", jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            boolean z = false;
            com.apm.insight.entity.a.a(jSONObject0, "filters", "native_heap_leak", String.valueOf(Debug.getNativeHeapAllocatedSize() > 0xC800000L));
            jSONObject3.put("native_heap_size", Debug.getNativeHeapSize());
            jSONObject3.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
            jSONObject3.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
            Runtime runtime0 = Runtime.getRuntime();
            long v = runtime0.maxMemory();
            long v1 = runtime0.freeMemory();
            long v2 = runtime0.totalMemory();
            jSONObject3.put("max_memory", v);
            jSONObject3.put("free_memory", v1);
            jSONObject3.put("total_memory", v2);
            if(((float)(v2 - v1)) > ((float)v) * 0.95f) {
                z = true;
            }
            com.apm.insight.entity.a.a(jSONObject0, "filters", "java_heap_leak", String.valueOf(z));
            if(activityManager0 != null) {
                jSONObject3.put("memory_class", activityManager0.getMemoryClass());
                jSONObject3.put("large_memory_class", activityManager0.getLargeMemoryClass());
            }
            jSONObject0.put("app_memory_info", jSONObject3);
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void a(String s) {
        a.a = s;
    }

    // 去混淆评级： 低(30)
    public static boolean a(Context context0) {
        return context0 == null ? b.d().f() : b.d().f() || a.g(context0);
    }

    public static ActivityManager.ProcessErrorStateInfo b(Context context0) {
        ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
        if(activityManager0 == null) {
            return null;
        }
        int v = Process.myPid();
        List list0 = activityManager0.getProcessesInErrorState();
        if(list0 != null) {
            for(Object object0: list0) {
                ActivityManager.ProcessErrorStateInfo activityManager$ProcessErrorStateInfo0 = (ActivityManager.ProcessErrorStateInfo)object0;
                if(activityManager$ProcessErrorStateInfo0.pid == v && activityManager$ProcessErrorStateInfo0.condition == 2) {
                    return activityManager$ProcessErrorStateInfo0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public static boolean c(Context context0) {
        String s = a.d(context0);
        if(s != null && s.contains(":")) {
            return false;
        }
        return s == null || !s.equals("com.dcinside.app.android") ? s != null && s.equals(context0.getApplicationInfo().processName) : true;
    }

    public static String d(Context context0) [...] // 潜在的解密器

    public static String e(Context context0) {
        Class class0 = a.h(context0);
        if(a.c == null && class0 != null) {
            try {
                a.c = class0.getDeclaredField("VERSION_NAME");
            }
            catch(NoSuchFieldException unused_ex) {
            }
        }
        Field field0 = a.c;
        if(field0 != null) {
            try {
                return String.valueOf(field0.get(null));
            }
            catch(Throwable unused_ex) {
            }
        }
        return "";
    }

    public static int f(Context context0) {
        Class class0 = a.h(context0);
        if(a.d == null && class0 != null) {
            try {
                a.d = class0.getDeclaredField("VERSION_CODE");
            }
            catch(NoSuchFieldException unused_ex) {
            }
        }
        Field field0 = a.d;
        if(field0 != null) {
            try {
                return (int)(((Integer)field0.get(null)));
            }
            catch(Throwable unused_ex) {
            }
        }
        return -1;
    }

    private static boolean g(Context context0) {
        try {
            ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
            if(activityManager0 == null) {
                return false;
            }
            List list0 = activityManager0.getRunningAppProcesses();
            if(list0 != null) {
                for(Object object0: list0) {
                    ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                    if(activityManager$RunningAppProcessInfo0.importance == 100) {
                        return "com.dcinside.app.android".equals(activityManager$RunningAppProcessInfo0.pkgList[0]);
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    private static Class h(Context context0) {
        if(a.b == null && !a.e) {
            try {
                a.b = Class.forName("com.dcinside.app.android.BuildConfig");
            }
            catch(ClassNotFoundException unused_ex) {
            }
            a.e = true;
        }
        return a.b;
    }
}

