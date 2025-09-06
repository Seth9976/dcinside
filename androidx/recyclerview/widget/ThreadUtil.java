package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

interface ThreadUtil {
    public interface BackgroundCallback {
        void a(int arg1, int arg2, int arg3, int arg4, int arg5);

        void b(int arg1, int arg2);

        void c(int arg1);

        @SuppressLint({"UnknownNullness"})
        void d(Tile arg1);
    }

    public interface MainThreadCallback {
        void a(int arg1, int arg2);

        void b(int arg1, int arg2);

        @SuppressLint({"UnknownNullness"})
        void c(int arg1, Tile arg2);
    }

    MainThreadCallback a(MainThreadCallback arg1);

    BackgroundCallback b(BackgroundCallback arg1);
}

