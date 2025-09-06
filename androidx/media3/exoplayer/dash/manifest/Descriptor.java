package androidx.media3.exoplayer.dash.manifest;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public final class Descriptor {
    public final String a;
    @Nullable
    public final String b;
    @Nullable
    public final String c;

    public Descriptor(String s, @Nullable String s1, @Nullable String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return Descriptor.class == class0 && (Util.g(this.a, ((Descriptor)object0).a) && Util.g(this.b, ((Descriptor)object0).b) && Util.g(this.c, ((Descriptor)object0).c));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }
}

