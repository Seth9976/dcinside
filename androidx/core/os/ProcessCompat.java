package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.UserHandle;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

public final class ProcessCompat {
    static class Api19Impl {
        private static final Object a;
        private static Method b;
        private static boolean c;

        static {
            Api19Impl.a = new Object();
        }

        @SuppressLint({"DiscouragedPrivateApi"})
        static boolean a(int v) {
            try {
                Object object0 = Api19Impl.a;
                synchronized(object0) {
                    if(!Api19Impl.c) {
                        Api19Impl.c = true;
                        Api19Impl.b = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method0 = Api19Impl.b;
                if(method0 != null) {
                    Boolean boolean0 = (Boolean)method0.invoke(null, v);
                    if(boolean0 == null) {
                        throw new NullPointerException();
                    }
                    return boolean0.booleanValue();
                }
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
            }
            return true;
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        static boolean a(int v) {
            return Process.isApplicationUid(v);
        }
    }

    public static boolean a(int v) {
        return Build.VERSION.SDK_INT < 24 ? Api19Impl.a(v) : Api24Impl.a(v);
    }
}

