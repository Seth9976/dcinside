package androidx.media3.ui;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface TimeBar {
    public interface OnScrubListener {
        void G(TimeBar arg1, long arg2);

        void K(TimeBar arg1, long arg2, boolean arg3);

        void u(TimeBar arg1, long arg2);
    }

    void a(OnScrubListener arg1);

    void b(@Nullable long[] arg1, @Nullable boolean[] arg2, int arg3);

    void c(OnScrubListener arg1);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long arg1);

    void setDuration(long arg1);

    void setEnabled(boolean arg1);

    void setKeyCountIncrement(int arg1);

    void setKeyTimeIncrement(long arg1);

    void setPosition(long arg1);
}

