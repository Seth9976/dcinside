package okhttp3.internal.platform.android;

import java.lang.reflect.Method;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class CloseGuard {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final CloseGuard get() {
            try {
                Class class0 = Class.forName("dalvik.system.CloseGuard");
                return new CloseGuard(class0.getMethod("get", null), class0.getMethod("open", String.class), class0.getMethod("warnIfOpen", null));
            }
            catch(Exception unused_ex) {
                return new CloseGuard(null, null, null);
            }
        }
    }

    @l
    public static final Companion Companion;
    @m
    private final Method getMethod;
    @m
    private final Method openMethod;
    @m
    private final Method warnIfOpenMethod;

    static {
        CloseGuard.Companion = new Companion(null);
    }

    public CloseGuard(@m Method method0, @m Method method1, @m Method method2) {
        this.getMethod = method0;
        this.openMethod = method1;
        this.warnIfOpenMethod = method2;
    }

    @m
    public final Object createAndOpen(@l String s) {
        L.p(s, "closer");
        Method method0 = this.getMethod;
        if(method0 != null) {
            try {
                Object object0 = method0.invoke(null, null);
                L.m(this.openMethod);
                this.openMethod.invoke(object0, s);
                return object0;
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }

    public final boolean warnIfOpen(@m Object object0) {
        if(object0 != null) {
            try {
                L.m(this.warnIfOpenMethod);
                this.warnIfOpenMethod.invoke(object0, null);
                return true;
            }
            catch(Exception unused_ex) {
            }
        }
        return false;
    }
}

