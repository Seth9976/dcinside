package com.bytedance.sdk.openadsdk.multipro.cr;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.PjT.ReZ;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.SM;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

class Zh {
    private static SoftReference PjT;

    @Nullable
    public static SharedPreferences PjT(Context context0, String s) {
        if(context0 == null) {
            return null;
        }
        try {
            return context0.getSharedPreferences(Zh.PjT(s), 0);
        }
        catch(Throwable throwable0) {
            RD.Zh("SPMultiHelperImpl", new Object[]{"getSharedPreferences error ", throwable0.getMessage()});
            return null;
        }
    }

    private static Object PjT(String s, String s1) {
        SoftReference softReference0 = Zh.PjT;
        if(softReference0 != null) {
            ConcurrentHashMap concurrentHashMap0 = (ConcurrentHashMap)softReference0.get();
            if(concurrentHashMap0 != null) {
                Map map0 = (Map)concurrentHashMap0.get(Zh.PjT(s));
                return map0 == null ? null : map0.get(s1);
            }
        }
        return null;
    }

    static String PjT(Context context0, String s, String s1, String s2) {
        Object object0 = Zh.PjT(s, s1);
        if(object0 != null) {
            return String.valueOf(object0);
        }
        Object object1 = Zh.Zh(context0, s, s1, s2);
        Zh.PjT(s, s1, object1);
        return String.valueOf(object1);
    }

    // 去混淆评级： 低(20)
    private static String PjT(String s) {
        return TextUtils.isEmpty(s) ? "sphelper_ttopenadsdk" : s;
    }

    static void PjT(Context context0, String s, String s1, Object object0) {
        synchronized(Zh.class) {
            String s2 = PjT.PjT(s, s1);
            if(SM.XX(s2)) {
                com.bytedance.sdk.component.PjT pjT0 = com.bytedance.sdk.component.PjT.PjT(context0, s2);
                if(object0.equals(Zh.PjT(s2, s1))) {
                    return;
                }
                ReZ pjT$ReZ0 = pjT0.Zh();
                Zh.PjT(pjT$ReZ0, s1, object0);
                pjT$ReZ0.apply();
                Zh.PjT(s2, s1, object0);
                return;
            }
            SharedPreferences sharedPreferences0 = Zh.PjT(context0, s2);
            if(sharedPreferences0 == null) {
                return;
            }
            if(object0.equals(Zh.PjT(s2, s1))) {
                return;
            }
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            Zh.PjT(sharedPreferences$Editor0, s1, object0);
            sharedPreferences$Editor0.apply();
            Zh.PjT(s2, s1, object0);
        }
    }

    protected static void PjT(SharedPreferences.Editor sharedPreferences$Editor0, String s, Object object0) {
        if(object0 instanceof Integer) {
            sharedPreferences$Editor0.putInt(s, ((int)(((Integer)object0))));
        }
        if(object0 instanceof Long) {
            sharedPreferences$Editor0.putLong(s, ((long)(((Long)object0))));
        }
        if(object0 instanceof Float) {
            sharedPreferences$Editor0.putFloat(s, ((float)(((Float)object0))));
        }
        if(object0 instanceof Boolean) {
            sharedPreferences$Editor0.putBoolean(s, ((Boolean)object0).booleanValue());
        }
        if(object0 instanceof String) {
            sharedPreferences$Editor0.putString(s, ((String)object0));
        }
    }

    protected static void PjT(ReZ pjT$ReZ0, String s, Object object0) {
        if(object0 instanceof Integer) {
            pjT$ReZ0.PjT(s, ((int)(((Integer)object0))));
        }
        if(object0 instanceof Long) {
            pjT$ReZ0.PjT(s, ((long)(((Long)object0))));
        }
        if(object0 instanceof Float) {
            pjT$ReZ0.PjT(s, ((float)(((Float)object0))));
        }
        if(object0 instanceof Boolean) {
            pjT$ReZ0.PjT(s, ((Boolean)object0).booleanValue());
        }
        if(object0 instanceof String) {
            pjT$ReZ0.PjT(s, ((String)object0));
        }
    }

    private static void PjT(String s, String s1, Object object0) {
        if(Zh.PjT == null || Zh.PjT.get() == null) {
            Zh.PjT = new SoftReference(new ConcurrentHashMap());
        }
        String s2 = Zh.PjT(s);
        ConcurrentHashMap concurrentHashMap0 = (ConcurrentHashMap)Zh.PjT.get();
        if(concurrentHashMap0.get(s2) == null) {
            concurrentHashMap0.put(s2, new HashMap());
        }
        ((Map)concurrentHashMap0.get(s2)).put(s1, object0);
    }

    static boolean PjT(Context context0, String s, String s1) {
        String s2 = PjT.PjT(s, s1);
        if(SM.XX(s2)) {
            return com.bytedance.sdk.component.PjT.PjT(context0, s2).PjT(s1);
        }
        SharedPreferences sharedPreferences0 = Zh.PjT(context0, s2);
        return sharedPreferences0 != null && sharedPreferences0.contains(s1);
    }

    static Map ReZ(Context context0, String s) {
        SharedPreferences sharedPreferences0 = Zh.PjT(context0, s);
        return sharedPreferences0 == null ? null : sharedPreferences0.getAll();
    }

    private static Object Zh(Context context0, String s, String s1, String s2) {
        String s3 = Zh.PjT(s);
        if(!Zh.PjT(context0, s3, s1)) {
            return null;
        }
        if(s2.equalsIgnoreCase("string")) {
            return PjT.PjT(context0, s3, s1, null);
        }
        if(s2.equalsIgnoreCase("boolean")) {
            return Boolean.valueOf(PjT.PjT(context0, s3, s1, false));
        }
        if(s2.equalsIgnoreCase("int")) {
            return PjT.PjT(context0, s3, s1, 0);
        }
        if(s2.equalsIgnoreCase("long")) {
            return PjT.PjT(context0, s3, s1, 0L);
        }
        if(s2.equalsIgnoreCase("float")) {
            return PjT.PjT(context0, s3, s1, 0.0f);
        }
        return s2.equalsIgnoreCase("string_set") ? PjT.PjT(context0, s3, s1, null) : null;
    }

    static void Zh(Context context0, String s) {
        if(SM.XX(s)) {
            com.bytedance.sdk.component.PjT.PjT(context0, s).Zh().PjT().apply();
            Zh.Zh(s);
            return;
        }
        SharedPreferences sharedPreferences0 = Zh.PjT(context0, s);
        if(sharedPreferences0 == null) {
            return;
        }
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        sharedPreferences$Editor0.clear();
        sharedPreferences$Editor0.apply();
        Zh.Zh(s);
    }

    public static void Zh(Context context0, String s, String s1) {
        try {
            String s2 = PjT.PjT(s, s1);
            if(SM.XX(s2)) {
                com.bytedance.sdk.component.PjT.PjT(context0, s2).Zh().PjT(s1).apply();
                return;
            }
            SharedPreferences sharedPreferences0 = Zh.PjT(context0, s2);
            if(sharedPreferences0 == null) {
                return;
            }
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            sharedPreferences$Editor0.remove(s1);
            sharedPreferences$Editor0.apply();
            if(Zh.PjT != null && Zh.PjT.get() != null) {
                String s3 = Zh.PjT(s2);
                Map map0 = (Map)((ConcurrentHashMap)Zh.PjT.get()).get(s3);
                if(map0 != null && map0.size() != 0) {
                    map0.remove(s1);
                }
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    private static void Zh(String s) {
        if(Zh.PjT != null && Zh.PjT.get() != null) {
            Map map0 = (Map)((ConcurrentHashMap)Zh.PjT.get()).get(Zh.PjT(s));
            if(map0 != null) {
                map0.clear();
            }
        }
    }
}

