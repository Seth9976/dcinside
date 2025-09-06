package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class RendererConfiguration {
    public final int a;
    public final boolean b;
    public static final RendererConfiguration c;

    static {
        RendererConfiguration.c = new RendererConfiguration(0, false);
    }

    public RendererConfiguration(int v, boolean z) {
        this.a = v;
        this.b = z;
    }

    public RendererConfiguration(boolean z) {
        this.a = 0;
        this.b = z;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return RendererConfiguration.class == class0 && (this.a == ((RendererConfiguration)object0).a && this.b == ((RendererConfiguration)object0).b);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.a << 1) + this.b;
    }
}

