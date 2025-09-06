package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    ArrayList a;
    ArrayList b;
    BackStackRecordState[] c;
    int d;
    String e;
    ArrayList f;
    ArrayList g;
    ArrayList h;

    static {
        FragmentManagerState.CREATOR = new Parcelable.Creator() {
            public FragmentManagerState a(Parcel parcel0) {
                return new FragmentManagerState(parcel0);
            }

            public FragmentManagerState[] b(int v) {
                return new FragmentManagerState[v];
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

    public FragmentManagerState() {
        this.e = null;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    public FragmentManagerState(Parcel parcel0) {
        this.e = null;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.a = parcel0.createStringArrayList();
        this.b = parcel0.createStringArrayList();
        this.c = (BackStackRecordState[])parcel0.createTypedArray(BackStackRecordState.CREATOR);
        this.d = parcel0.readInt();
        this.e = parcel0.readString();
        this.f = parcel0.createStringArrayList();
        this.g = parcel0.createTypedArrayList(BackStackState.CREATOR);
        this.h = parcel0.createTypedArrayList(LaunchedFragmentInfo.CREATOR);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeStringList(this.a);
        parcel0.writeStringList(this.b);
        parcel0.writeTypedArray(this.c, v);
        parcel0.writeInt(this.d);
        parcel0.writeString(this.e);
        parcel0.writeStringList(this.f);
        parcel0.writeTypedList(this.g);
        parcel0.writeTypedList(this.h);
    }
}

