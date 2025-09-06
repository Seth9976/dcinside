package androidx.media3.exoplayer;

import android.content.Context;
import com.google.common.base.Q;

public final class r implements Q {
    public final Context a;

    public r(Context context0) {
        this.a = context0;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return Builder.B(this.a);
    }
}

