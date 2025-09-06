package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({Scope.a})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final VersionedParcelable a;

    static {
        ParcelImpl.CREATOR = new Parcelable.Creator() {
            public ParcelImpl a(Parcel parcel0) {
                return new ParcelImpl(parcel0);
            }

            public ParcelImpl[] b(int v) {
                return new ParcelImpl[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        };
    }

    protected ParcelImpl(Parcel parcel0) {
        this.a = new VersionedParcelParcel(parcel0).g0();
    }

    public ParcelImpl(VersionedParcelable versionedParcelable0) {
        this.a = versionedParcelable0;
    }

    public VersionedParcelable a() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        new VersionedParcelParcel(parcel0).l1(this.a);
    }
}

