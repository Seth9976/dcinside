package androidx.navigation;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.L;
import y4.l;

public final class NavBackStackEntryState.Companion.CREATOR.1 implements Parcelable.Creator {
    @l
    public NavBackStackEntryState a(@l Parcel parcel0) {
        L.p(parcel0, "inParcel");
        return new NavBackStackEntryState(parcel0);
    }

    @l
    public NavBackStackEntryState[] b(int v) {
        return new NavBackStackEntryState[v];
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

