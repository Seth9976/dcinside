package X1;

import androidx.annotation.Nullable;
import java.util.Stack;

public class e {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    @Nullable
    public final e d;

    private e(String s, String s1, StackTraceElement[] arr_stackTraceElement, @Nullable e e0) {
        this.a = s;
        this.b = s1;
        this.c = arr_stackTraceElement;
        this.d = e0;
    }

    public static e a(Throwable throwable0, d d0) {
        Stack stack0 = new Stack();
        while(throwable0 != null) {
            stack0.push(throwable0);
            throwable0 = throwable0.getCause();
        }
        e e0;
        for(e0 = null; !stack0.isEmpty(); e0 = new e(throwable1.getLocalizedMessage(), throwable1.getClass().getName(), d0.a(throwable1.getStackTrace()), e0)) {
            Throwable throwable1 = (Throwable)stack0.pop();
        }
        return e0;
    }
}

