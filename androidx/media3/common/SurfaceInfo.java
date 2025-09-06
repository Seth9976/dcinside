package androidx.media3.common;

import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class SurfaceInfo {
    public final Surface a;
    public final int b;
    public final int c;
    public final int d;

    public SurfaceInfo(Surface surface0, int v, int v1) {
        this(surface0, v, v1, 0);
    }

    public SurfaceInfo(Surface surface0, int v, int v1, int v2) {
        Assertions.b(v2 == 0 || v2 == 90 || v2 == 180 || v2 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.a = surface0;
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof SurfaceInfo ? this.b == ((SurfaceInfo)object0).b && this.c == ((SurfaceInfo)object0).c && this.d == ((SurfaceInfo)object0).d && this.a.equals(((SurfaceInfo)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }
}

