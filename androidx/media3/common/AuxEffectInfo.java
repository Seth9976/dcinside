package androidx.media3.common;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class AuxEffectInfo {
    public final int a;
    public final float b;
    public static final int c;

    public AuxEffectInfo(int v, float f) {
        this.a = v;
        this.b = f;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return AuxEffectInfo.class == class0 && (this.a == ((AuxEffectInfo)object0).a && Float.compare(((AuxEffectInfo)object0).b, this.b) == 0);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.a + 0x20F) * 0x1F + Float.floatToIntBits(this.b);
    }
}

