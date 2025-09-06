package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import java.lang.reflect.Method;

public class Yo {
    public static Class PjT(String s) {
        try {
            return Class.forName(s, true, Yo.PjT());
        }
        catch(ClassNotFoundException unused_ex) {
            try {
                return Class.forName(s, true, Yo.class.getClassLoader());
            }
            catch(ClassNotFoundException unused_ex) {
                try {
                    return Class.forName(s);
                }
                catch(ClassNotFoundException unused_ex) {
                    return null;
                }
            }
        }
    }

    private static ClassLoader PjT() {
        ClassLoader classLoader0 = Thread.currentThread().getContextClassLoader();
        return classLoader0 == null ? Yo.class.getClassLoader() : classLoader0;
    }

    public static Method PjT(String s, String s1, Class[] arr_class) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            try {
                Class class0 = Yo.PjT(s);
                return class0 == null ? null : class0.getMethod(s1, arr_class);
            }
            catch(Throwable unused_ex) {
            }
        }
        return null;
    }
}

