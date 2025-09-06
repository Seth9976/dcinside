package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle.State;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    final String a;
    final String b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final boolean i;
    final Bundle j;
    final boolean k;
    final int l;
    Bundle m;

    static {
        FragmentState.CREATOR = new Parcelable.Creator() {
            public FragmentState a(Parcel parcel0) {
                return new FragmentState(parcel0);
            }

            public FragmentState[] b(int v) {
                return new FragmentState[v];
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

    FragmentState(Parcel parcel0) {
        this.a = parcel0.readString();
        this.b = parcel0.readString();
        boolean z = false;
        this.c = parcel0.readInt() != 0;
        this.d = parcel0.readInt();
        this.e = parcel0.readInt();
        this.f = parcel0.readString();
        this.g = parcel0.readInt() != 0;
        this.h = parcel0.readInt() != 0;
        this.i = parcel0.readInt() != 0;
        this.j = parcel0.readBundle();
        if(parcel0.readInt() != 0) {
            z = true;
        }
        this.k = z;
        this.m = parcel0.readBundle();
        this.l = parcel0.readInt();
    }

    FragmentState(Fragment fragment0) {
        this.a = fragment0.getClass().getName();
        this.b = fragment0.mWho;
        this.c = fragment0.mFromLayout;
        this.d = fragment0.mFragmentId;
        this.e = fragment0.mContainerId;
        this.f = fragment0.mTag;
        this.g = fragment0.mRetainInstance;
        this.h = fragment0.mRemoving;
        this.i = fragment0.mDetached;
        this.j = fragment0.mArguments;
        this.k = fragment0.mHidden;
        this.l = fragment0.mMaxState.ordinal();
    }

    @NonNull
    Fragment a(@NonNull FragmentFactory fragmentFactory0, @NonNull ClassLoader classLoader0) {
        Fragment fragment0 = fragmentFactory0.a(classLoader0, this.a);
        Bundle bundle0 = this.j;
        if(bundle0 != null) {
            bundle0.setClassLoader(classLoader0);
        }
        fragment0.setArguments(this.j);
        fragment0.mWho = this.b;
        fragment0.mFromLayout = this.c;
        fragment0.mRestored = true;
        fragment0.mFragmentId = this.d;
        fragment0.mContainerId = this.e;
        fragment0.mTag = this.f;
        fragment0.mRetainInstance = this.g;
        fragment0.mRemoving = this.h;
        fragment0.mDetached = this.i;
        fragment0.mHidden = this.k;
        State[] arr_lifecycle$State = State.values();
        fragment0.mMaxState = arr_lifecycle$State[this.l];
        Bundle bundle1 = this.m;
        if(bundle1 != null) {
            fragment0.mSavedFragmentState = bundle1;
            return fragment0;
        }
        fragment0.mSavedFragmentState = new Bundle();
        return fragment0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    @NonNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("FragmentState{");
        stringBuilder0.append(this.a);
        stringBuilder0.append(" (");
        stringBuilder0.append(this.b);
        stringBuilder0.append(")}:");
        if(this.c) {
            stringBuilder0.append(" fromLayout");
        }
        if(this.e != 0) {
            stringBuilder0.append(" id=0x");
            stringBuilder0.append(Integer.toHexString(this.e));
        }
        if(this.f != null && !this.f.isEmpty()) {
            stringBuilder0.append(" tag=");
            stringBuilder0.append(this.f);
        }
        if(this.g) {
            stringBuilder0.append(" retainInstance");
        }
        if(this.h) {
            stringBuilder0.append(" removing");
        }
        if(this.i) {
            stringBuilder0.append(" detached");
        }
        if(this.k) {
            stringBuilder0.append(" hidden");
        }
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeInt(((int)this.c));
        parcel0.writeInt(this.d);
        parcel0.writeInt(this.e);
        parcel0.writeString(this.f);
        parcel0.writeInt(((int)this.g));
        parcel0.writeInt(((int)this.h));
        parcel0.writeInt(((int)this.i));
        parcel0.writeBundle(this.j);
        parcel0.writeInt(((int)this.k));
        parcel0.writeBundle(this.m);
        parcel0.writeInt(this.l);
    }
}

