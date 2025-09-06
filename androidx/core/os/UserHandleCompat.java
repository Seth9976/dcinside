package androidx.core.os;

import android.os.Build.VERSION;
import android.os.UserHandle;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UserHandleCompat {
    @RequiresApi(24)
    static class Api24Impl {
        static UserHandle a(int v) {
            return UserHandle.getUserHandleForUid(v);
        }
    }

    private static Method a;
    private static Constructor b;

    private static Method a() throws NoSuchMethodException {
        if(UserHandleCompat.a == null) {
            Method method0 = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            UserHandleCompat.a = method0;
            method0.setAccessible(true);
        }
        return UserHandleCompat.a;
    }

    private static Constructor b() throws NoSuchMethodException {
        if(UserHandleCompat.b == null) {
            Constructor constructor0 = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            UserHandleCompat.b = constructor0;
            constructor0.setAccessible(true);
        }
        return UserHandleCompat.b;
    }

    public static UserHandle c(int v) {
        if(Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.a(v);
        }
        try {
            Integer integer0 = (Integer)UserHandleCompat.a().invoke(null, v);
            return (UserHandle)UserHandleCompat.b().newInstance(integer0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            NoSuchMethodError noSuchMethodError0 = new NoSuchMethodError();
            noSuchMethodError0.initCause(noSuchMethodException0);
            throw noSuchMethodError0;
        }
        catch(IllegalAccessException illegalAccessException0) {
            IllegalAccessError illegalAccessError0 = new IllegalAccessError();
            illegalAccessError0.initCause(illegalAccessException0);
            throw illegalAccessError0;
        }
        catch(InstantiationException instantiationException0) {
            InstantiationError instantiationError0 = new InstantiationError();
            instantiationError0.initCause(instantiationException0);
            throw instantiationError0;
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException(invocationTargetException0);
        }
    }
}

