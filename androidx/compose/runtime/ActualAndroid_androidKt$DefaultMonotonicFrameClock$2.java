package androidx.compose.runtime;

import A3.a;
import android.os.Looper;
import kotlin.jvm.internal.N;
import y4.l;

final class ActualAndroid_androidKt.DefaultMonotonicFrameClock.2 extends N implements a {
    public static final ActualAndroid_androidKt.DefaultMonotonicFrameClock.2 e;

    static {
        ActualAndroid_androidKt.DefaultMonotonicFrameClock.2.e = new ActualAndroid_androidKt.DefaultMonotonicFrameClock.2();
    }

    ActualAndroid_androidKt.DefaultMonotonicFrameClock.2() {
        super(0);
    }

    @l
    public final MonotonicFrameClock b() {
        return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.a : SdkStubsFallbackFrameClock.a;
    }

    @Override  // A3.a
    public Object invoke() {
        return this.b();
    }
}

