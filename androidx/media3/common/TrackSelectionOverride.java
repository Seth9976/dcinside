package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.O2;
import com.google.common.primitives.l;
import java.util.Collections;
import java.util.List;

public final class TrackSelectionOverride {
    public final TrackGroup a;
    public final O2 b;
    private static final String c;
    private static final String d;

    static {
        TrackSelectionOverride.c = "0";
        TrackSelectionOverride.d = "1";
    }

    public TrackSelectionOverride(TrackGroup trackGroup0, int v) {
        this(trackGroup0, O2.B(v));
    }

    public TrackSelectionOverride(TrackGroup trackGroup0, List list0) {
        if(!list0.isEmpty() && (((int)(((Integer)Collections.min(list0)))) < 0 || ((int)(((Integer)Collections.max(list0)))) >= trackGroup0.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = trackGroup0;
        this.b = O2.r(list0);
    }

    @UnstableApi
    public static TrackSelectionOverride a(Bundle bundle0) {
        return new TrackSelectionOverride(TrackGroup.b(((Bundle)Assertions.g(bundle0.getBundle(TrackSelectionOverride.c)))), l.c(((int[])Assertions.g(bundle0.getIntArray(TrackSelectionOverride.d)))));
    }

    public int b() {
        return this.a.c;
    }

    @UnstableApi
    public Bundle c() {
        Bundle bundle0 = new Bundle();
        Bundle bundle1 = this.a.h();
        bundle0.putBundle(TrackSelectionOverride.c, bundle1);
        int[] arr_v = l.D(this.b);
        bundle0.putIntArray(TrackSelectionOverride.d, arr_v);
        return bundle0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return TrackSelectionOverride.class == class0 && (this.a.equals(((TrackSelectionOverride)object0).a) && this.b.equals(((TrackSelectionOverride)object0).b));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() + this.b.hashCode() * 0x1F;
    }
}

