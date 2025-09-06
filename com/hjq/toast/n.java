package com.hjq.toast;

import android.util.Log;
import java.lang.reflect.Modifier;
import y2.c;

public class n implements c {
    @Override  // y2.c
    public boolean a(o o0) {
        this.e(o0.a);
        return false;
    }

    // 去混淆评级： 低(40)
    protected boolean b(Class class0) {
        return c.class.isAssignableFrom(class0) || s.class.equals(class0) || class0.isInterface() || Modifier.isAbstract(class0.getModifiers());
    }

    protected boolean c() {
        return s.p();
    }

    protected void d(String s) {
        Log.i("Toaster", s);
    }

    protected void e(CharSequence charSequence0) {
        if(!this.c()) {
            return;
        }
        StackTraceElement[] arr_stackTraceElement = new Throwable().getStackTrace();
        for(int v = 0; v < arr_stackTraceElement.length; ++v) {
            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
            int v1 = stackTraceElement0.getLineNumber();
            if(v1 > 0) {
                String s = stackTraceElement0.getClassName();
                try {
                    if(!this.b(Class.forName(s))) {
                        this.d("(" + stackTraceElement0.getFileName() + ":" + v1 + ") " + charSequence0.toString());
                        return;
                    }
                }
                catch(ClassNotFoundException classNotFoundException0) {
                    classNotFoundException0.printStackTrace();
                }
            }
        }
    }
}

