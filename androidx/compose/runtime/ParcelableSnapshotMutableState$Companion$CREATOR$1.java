package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ParcelableSnapshotMutableState.Companion.CREATOR.1 implements Parcelable.ClassLoaderCreator {
    @l
    public ParcelableSnapshotMutableState a(@l Parcel parcel0) {
        L.p(parcel0, "parcel");
        return this.b(parcel0, null);
    }

    @l
    public ParcelableSnapshotMutableState b(@l Parcel parcel0, @m ClassLoader classLoader0) {
        L.p(parcel0, "parcel");
        if(classLoader0 == null) {
            classLoader0 = ParcelableSnapshotMutableState.Companion.CREATOR.1.class.getClassLoader();
        }
        Object object0 = parcel0.readValue(classLoader0);
        int v = parcel0.readInt();
        switch(v) {
            case 0: {
                return new ParcelableSnapshotMutableState(object0, SnapshotStateKt.l());
            }
            case 1: {
                return new ParcelableSnapshotMutableState(object0, SnapshotStateKt.w());
            }
            case 2: {
                return new ParcelableSnapshotMutableState(object0, SnapshotStateKt.s());
            }
            default: {
                throw new IllegalStateException("Unsupported MutableState policy " + v + " was restored");
            }
        }
    }

    @l
    public ParcelableSnapshotMutableState[] c(int v) {
        return new ParcelableSnapshotMutableState[v];
    }

    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel parcel0) {
        return this.a(parcel0);
    }

    @Override  // android.os.Parcelable$ClassLoaderCreator
    public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
        return this.b(parcel0, classLoader0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int v) {
        return this.c(v);
    }
}

