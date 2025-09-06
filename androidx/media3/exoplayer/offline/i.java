package androidx.media3.exoplayer.offline;

import android.os.Handler.Callback;
import android.os.Message;

public final class i implements Handler.Callback {
    public final MediaPreparer a;

    public i(MediaPreparer downloadHelper$MediaPreparer0) {
        this.a = downloadHelper$MediaPreparer0;
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        return this.a.b(message0);
    }
}

