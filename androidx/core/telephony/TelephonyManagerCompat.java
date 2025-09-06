package androidx.core.telephony;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TelephonyManagerCompat {
    @RequiresApi(23)
    static class Api23Impl {
        @SuppressLint({"MissingPermission"})
        @RequiresPermission("android.permission.READ_PHONE_STATE")
        static String a(TelephonyManager telephonyManager0, int v) {
            return telephonyManager0.getDeviceId(v);
        }
    }

    @RequiresApi(26)
    static class Api26Impl {
        @SuppressLint({"MissingPermission"})
        @RequiresPermission("android.permission.READ_PHONE_STATE")
        static String a(TelephonyManager telephonyManager0) {
            return telephonyManager0.getImei();
        }
    }

    @RequiresApi(30)
    static class Api30Impl {
        static int a(TelephonyManager telephonyManager0) {
            return telephonyManager0.getSubscriptionId();
        }
    }

    private static Method a;
    private static Method b;

    @SuppressLint({"MissingPermission"})
    @RequiresPermission("android.permission.READ_PHONE_STATE")
    public static String a(TelephonyManager telephonyManager0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 26) {
            return Api26Impl.a(telephonyManager0);
        }
        if(v >= 22) {
            int v1 = TelephonyManagerCompat.b(telephonyManager0);
            if(v1 != -1 && v1 != 0x7FFFFFFF) {
                int v2 = SubscriptionManagerCompat.a(v1);
                if(v >= 23) {
                    return Api23Impl.a(telephonyManager0, v2);
                }
                try {
                    if(TelephonyManagerCompat.a == null) {
                        Method method0 = TelephonyManager.class.getDeclaredMethod("getDeviceId", Integer.TYPE);
                        TelephonyManagerCompat.a = method0;
                        method0.setAccessible(true);
                    }
                    return (String)TelephonyManagerCompat.a.invoke(telephonyManager0, v2);
                }
                catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException unused_ex) {
                    return null;
                }
            }
        }
        return telephonyManager0.getDeviceId();
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int b(TelephonyManager telephonyManager0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 30) {
            return Api30Impl.a(telephonyManager0);
        }
        if(v >= 22) {
            try {
                if(TelephonyManagerCompat.b == null) {
                    Method method0 = TelephonyManager.class.getDeclaredMethod("getSubId", null);
                    TelephonyManagerCompat.b = method0;
                    method0.setAccessible(true);
                }
                Integer integer0 = (Integer)TelephonyManagerCompat.b.invoke(telephonyManager0, null);
                if(integer0 != null && ((int)integer0) != -1) {
                    return (int)integer0;
                }
            }
            catch(InvocationTargetException | IllegalAccessException | NoSuchMethodException unused_ex) {
            }
        }
        return 0x7FFFFFFF;
    }
}

