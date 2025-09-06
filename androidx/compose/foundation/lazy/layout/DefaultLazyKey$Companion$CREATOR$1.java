package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.L;
import y4.l;

public final class DefaultLazyKey.Companion.CREATOR.1 implements Parcelable.Creator {
    @l
    public DefaultLazyKey a(@l Parcel parcel0) {
        L.p(parcel0, "parcel");
        return new DefaultLazyKey(parcel0.readInt());
    }

    @l
    public DefaultLazyKey[] b(int v) {
        return new DefaultLazyKey[v];
    }

    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel parcel0) {
        return this.a(parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int v) {
        return this.b(v);
    }
}

