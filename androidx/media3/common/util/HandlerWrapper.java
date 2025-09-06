package androidx.media3.common.util;

import android.os.Looper;
import androidx.annotation.Nullable;

@UnstableApi
public interface HandlerWrapper {
    public interface Message {
        void a();

        HandlerWrapper getTarget();
    }

    boolean a(int arg1, int arg2);

    boolean b(Runnable arg1);

    Message c(int arg1);

    boolean d(int arg1);

    Message e(int arg1, @Nullable Object arg2);

    void f(@Nullable Object arg1);

    Message g(int arg1, int arg2, int arg3);

    boolean h(Message arg1);

    Message i(int arg1, int arg2, int arg3, @Nullable Object arg4);

    Looper j();

    boolean k(Runnable arg1);

    boolean l(Runnable arg1, long arg2);

    boolean m(int arg1);

    boolean n(int arg1, long arg2);

    void o(int arg1);
}

