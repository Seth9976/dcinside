package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public abstract class ActivityResultContract {
    public static final class SynchronousResult {
        private final Object a;

        public SynchronousResult(Object object0) {
            this.a = object0;
        }

        public final Object a() {
            return this.a;
        }
    }

    @l
    public abstract Intent a(@l Context arg1, Object arg2);

    @m
    public SynchronousResult b(@l Context context0, Object object0) {
        L.p(context0, "context");
        return null;
    }

    public abstract Object c(int arg1, @m Intent arg2);
}

