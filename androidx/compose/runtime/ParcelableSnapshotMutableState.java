package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.f;

@SuppressLint({"BanParcelableUsage"})
public final class ParcelableSnapshotMutableState extends SnapshotMutableStateImpl implements Parcelable {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        public static void a() {
        }
    }

    @l
    @f
    public static final Parcelable.Creator CREATOR = null;
    @l
    public static final Companion c = null;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;

    static {
        ParcelableSnapshotMutableState.c = new Companion(null);
        ParcelableSnapshotMutableState.CREATOR = new ParcelableSnapshotMutableState.Companion.CREATOR.1();
    }

    public ParcelableSnapshotMutableState(Object object0, @l SnapshotMutationPolicy snapshotMutationPolicy0) {
        L.p(snapshotMutationPolicy0, "policy");
        super(object0, snapshotMutationPolicy0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        int v1;
        L.p(parcel0, "parcel");
        parcel0.writeValue(this.getValue());
        SnapshotMutationPolicy snapshotMutationPolicy0 = this.a();
        if(L.g(snapshotMutationPolicy0, SnapshotStateKt.l())) {
            v1 = 0;
        }
        else if(L.g(snapshotMutationPolicy0, SnapshotStateKt.w())) {
            v1 = 1;
        }
        else if(L.g(snapshotMutationPolicy0, SnapshotStateKt.s())) {
            v1 = 2;
        }
        else {
            throw new IllegalStateException("Only known types of MutableState\'s SnapshotMutationPolicy are supported");
        }
        parcel0.writeInt(v1);
    }
}

