package androidx.activity;

import A3.a;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class ImmLeaksCleaner.Companion.cleaner.2 extends N implements a {
    public static final ImmLeaksCleaner.Companion.cleaner.2 e;

    static {
        ImmLeaksCleaner.Companion.cleaner.2.e = new ImmLeaksCleaner.Companion.cleaner.2();
    }

    ImmLeaksCleaner.Companion.cleaner.2() {
        super(0);
    }

    @l
    public final Cleaner b() {
        try {
            Field field0 = InputMethodManager.class.getDeclaredField("mServedView");
            field0.setAccessible(true);
            Field field1 = InputMethodManager.class.getDeclaredField("mNextServedView");
            field1.setAccessible(true);
            Field field2 = InputMethodManager.class.getDeclaredField("mH");
            field2.setAccessible(true);
            L.o(field2, "hField");
            L.o(field0, "servedViewField");
            L.o(field1, "nextServedViewField");
            return new ValidCleaner(field2, field0, field1);
        }
        catch(NoSuchFieldException unused_ex) {
            return FailedInitialization.a;
        }
    }

    @Override  // A3.a
    public Object invoke() {
        return this.b();
    }
}

