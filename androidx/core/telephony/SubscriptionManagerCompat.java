package androidx.core.telephony;

import android.os.Build.VERSION;
import android.telephony.SubscriptionManager;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(22)
public class SubscriptionManagerCompat {
    @RequiresApi(29)
    static class Api29Impl {
        static int a(int v) {
            return SubscriptionManager.getSlotIndex(v);
        }
    }

    private static Method a;

    public static int a(int v) {
        if(v == -1) {
            return -1;
        }
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 29) {
            return Api29Impl.a(v);
        }
        try {
            if(SubscriptionManagerCompat.a == null) {
                SubscriptionManagerCompat.a = v1 >= 26 ? SubscriptionManager.class.getDeclaredMethod("getSlotIndex", Integer.TYPE) : SubscriptionManager.class.getDeclaredMethod("getSlotId", Integer.TYPE);
                SubscriptionManagerCompat.a.setAccessible(true);
            }
            Integer integer0 = (Integer)SubscriptionManagerCompat.a.invoke(null, v);
            return integer0 == null ? -1 : ((int)integer0);
        }
        catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException unused_ex) {
        }
        return -1;
    }
}

