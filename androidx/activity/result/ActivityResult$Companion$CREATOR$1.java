package androidx.activity.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.L;
import y4.l;

public final class ActivityResult.Companion.CREATOR.1 implements Parcelable.Creator {
    @l
    public ActivityResult a(@l Parcel parcel0) {
        L.p(parcel0, "parcel");
        return new ActivityResult(parcel0);
    }

    @l
    public ActivityResult[] b(int v) {
        return new ActivityResult[v];
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

