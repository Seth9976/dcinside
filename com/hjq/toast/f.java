package com.hjq.toast;

import android.annotation.SuppressLint;
import android.app.Application;
import android.widget.Toast;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class f extends j {
    private static boolean b;

    public f(Application application0) {
        super(application0);
    }

    @SuppressLint({"DiscouragedPrivateApi", "PrivateApi"})
    private static void b() {
        Class class0 = Toast.class;
        if(f.b) {
            return;
        }
        try {
            f.b = true;
            Method method0 = class0.getDeclaredMethod("getService", null);
            method0.setAccessible(true);
            Object object0 = method0.invoke(null, null);
            if(object0 == null) {
                return;
            }
            if(Proxy.isProxyClass(object0.getClass()) && Proxy.getInvocationHandler(object0) instanceof e) {
                return;
            }
            Object object1 = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{Class.forName("android.app.INotificationManager")}, new e(object0));
            Field field0 = class0.getDeclaredField("sService");
            field0.setAccessible(true);
            field0.set(null, object1);
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
    }

    @Override  // android.widget.Toast, y2.b
    public void show() {
        f.b();
        super.show();
    }
}

