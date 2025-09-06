package androidx.media3.exoplayer.source;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.O2;
import com.google.common.collect.z3;
import java.util.ArrayList;

@UnstableApi
public final class TrackGroupArray {
    public final int a;
    private final O2 b;
    private int c;
    private static final String d = "TrackGroupArray";
    public static final TrackGroupArray e;
    private static final String f;

    static {
        TrackGroupArray.e = new TrackGroupArray(new TrackGroup[0]);
        TrackGroupArray.f = "0";
    }

    public TrackGroupArray(TrackGroup[] arr_trackGroup) {
        this.b = O2.x(arr_trackGroup);
        this.a = arr_trackGroup.length;
        this.i();
    }

    public static TrackGroupArray b(Bundle bundle0) {
        ArrayList arrayList0 = bundle0.getParcelableArrayList(TrackGroupArray.f);
        return arrayList0 == null ? new TrackGroupArray(new TrackGroup[0]) : new TrackGroupArray(((TrackGroup[])BundleCollectionUtil.d(new N(), arrayList0).toArray(new TrackGroup[0])));
    }

    public TrackGroup c(int v) {
        return (TrackGroup)this.b.get(v);
    }

    public O2 d() {
        L l0 = new L();
        return O2.r(z3.D(this.b, l0));
    }

    public int e(TrackGroup trackGroup0) {
        int v = this.b.indexOf(trackGroup0);
        return v >= 0 ? v : -1;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return TrackGroupArray.class == class0 && (this.a == ((TrackGroupArray)object0).a && this.b.equals(((TrackGroupArray)object0).b));
        }
        return false;
    }

    public boolean f() {
        return this.a == 0;
    }

    public Bundle h() {
        Bundle bundle0 = new Bundle();
        M m0 = new M();
        ArrayList arrayList0 = BundleCollectionUtil.i(this.b, m0);
        bundle0.putParcelableArrayList(TrackGroupArray.f, arrayList0);
        return bundle0;
    }

    @Override
    public int hashCode() {
        if(this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    private void i() {
        for(int v = 0; v < this.b.size(); ++v) {
            for(int v1 = v + 1; v1 < this.b.size(); ++v1) {
                if(((TrackGroup)this.b.get(v)).equals(this.b.get(v1))) {
                    Log.e("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
        }
    }
}

