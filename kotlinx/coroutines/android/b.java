package kotlinx.coroutines.android;

import android.os.Build.VERSION;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.coroutines.a;
import kotlin.coroutines.g;
import kotlinx.coroutines.CoroutineExceptionHandler;
import y4.l;
import y4.m;

public final class b extends a implements CoroutineExceptionHandler {
    @m
    private volatile Object _preHandler;

    public b() {
        super(CoroutineExceptionHandler.A8);
        this._preHandler = this;
    }

    private final Method b1() {
        Method method0;
        Object object0 = this._preHandler;
        if(object0 != this) {
            return (Method)object0;
        }
        try {
            method0 = null;
            Method method1 = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if(Modifier.isPublic(method1.getModifiers()) && Modifier.isStatic(method1.getModifiers())) {
                method0 = method1;
            }
        }
        catch(Throwable unused_ex) {
        }
        this._preHandler = method0;
        return method0;
    }

    @Override  // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(@l g g0, @l Throwable throwable0) {
        if(26 <= Build.VERSION.SDK_INT && Build.VERSION.SDK_INT < 28) {
            Method method0 = this.b1();
            Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = null;
            Object object0 = method0 == null ? null : method0.invoke(null, null);
            if(object0 instanceof Thread.UncaughtExceptionHandler) {
                thread$UncaughtExceptionHandler0 = (Thread.UncaughtExceptionHandler)object0;
            }
            if(thread$UncaughtExceptionHandler0 != null) {
                thread$UncaughtExceptionHandler0.uncaughtException(Thread.currentThread(), throwable0);
            }
        }
    }
}

