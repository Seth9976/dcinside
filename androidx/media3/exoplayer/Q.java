package androidx.media3.exoplayer;

import android.content.Context;
import com.google.common.base.Q;

public final class q implements Q {
    public final Context a;

    public q(Context context0) {
        this.a = context0;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return Builder.A(this.a);
    }
}

