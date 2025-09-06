package pl.droidsonroids.gif;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

class n extends Handler {
    private final WeakReference a;
    static final int b = -1;

    n(e e0) {
        super(Looper.getMainLooper());
        this.a = new WeakReference(e0);
    }

    @Override  // android.os.Handler
    public void handleMessage(@NonNull Message message0) {
        e e0 = (e)this.a.get();
        if(e0 == null) {
            return;
        }
        if(message0.what == -1) {
            e0.invalidateSelf();
            return;
        }
        for(Object object0: e0.h) {
            ((a)object0).a(message0.what);
        }
    }
}

