package androidx.transition;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;

public interface TransitionSeekController {
    void b(@FloatRange(from = 0.0, to = 1.0) float arg1);

    @IntRange(from = 0L)
    long c();

    void d(@NonNull Consumer arg1);

    @FloatRange(from = 0.0, to = 1.0)
    float e();

    @IntRange(from = 0L)
    long f();

    void g();

    void i(@NonNull Consumer arg1);

    boolean isReady();

    void j(@NonNull Consumer arg1);

    void m(@IntRange(from = 0L) long arg1);

    void o(@NonNull Consumer arg1);

    void q(@NonNull Runnable arg1);
}

