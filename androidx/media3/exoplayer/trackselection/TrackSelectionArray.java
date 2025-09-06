package androidx.media3.exoplayer.trackselection;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

@UnstableApi
public final class TrackSelectionArray {
    public final int a;
    private final TrackSelection[] b;
    private int c;

    public TrackSelectionArray(TrackSelection[] arr_trackSelection) {
        this.b = arr_trackSelection;
        this.a = arr_trackSelection.length;
    }

    @Nullable
    public TrackSelection a(int v) {
        return this.b[v];
    }

    public TrackSelection[] b() {
        return (TrackSelection[])this.b.clone();
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return TrackSelectionArray.class == class0 ? Arrays.equals(this.b, ((TrackSelectionArray)object0).b) : false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        if(this.c == 0) {
            this.c = Arrays.hashCode(this.b) + 0x20F;
        }
        return this.c;
    }
}

