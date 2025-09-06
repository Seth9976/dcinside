package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import androidx.annotation.UiThread;
import com.facebook.fresco.animation.backend.d;
import y4.l;

public interface j {
    public static final class a {
        public static void a(@l j j0, int v) {
        }

        public static void b(@l j j0) {
        }
    }

    @UiThread
    void a(int arg1, int arg2, @l A3.a arg3);

    void b(int arg1);

    @l
    d c();

    void clear();

    @UiThread
    @l
    com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.l d(int arg1, int arg2, int arg3);

    void onStop();
}

