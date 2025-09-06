package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle.State;
import java.util.ArrayList;
import java.util.Map;

@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator CREATOR = null;
    final int[] a;
    final ArrayList b;
    final int[] c;
    final int[] d;
    final int e;
    final String f;
    final int g;
    final int h;
    final CharSequence i;
    final int j;
    final CharSequence k;
    final ArrayList l;
    final ArrayList m;
    final boolean n;
    private static final String o = "FragmentManager";

    static {
        BackStackRecordState.CREATOR = new Parcelable.Creator() {
            public BackStackRecordState a(Parcel parcel0) {
                return new BackStackRecordState(parcel0);
            }

            public BackStackRecordState[] b(int v) {
                return new BackStackRecordState[v];
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

    BackStackRecordState(Parcel parcel0) {
        this.a = parcel0.createIntArray();
        this.b = parcel0.createStringArrayList();
        this.c = parcel0.createIntArray();
        this.d = parcel0.createIntArray();
        this.e = parcel0.readInt();
        this.f = parcel0.readString();
        this.g = parcel0.readInt();
        this.h = parcel0.readInt();
        Parcelable.Creator parcelable$Creator0 = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence)parcelable$Creator0.createFromParcel(parcel0);
        this.j = parcel0.readInt();
        this.k = (CharSequence)parcelable$Creator0.createFromParcel(parcel0);
        this.l = parcel0.createStringArrayList();
        this.m = parcel0.createStringArrayList();
        this.n = parcel0.readInt() != 0;
    }

    BackStackRecordState(BackStackRecord backStackRecord0) {
        int v = backStackRecord0.c.size();
        this.a = new int[v * 6];
        if(!backStackRecord0.i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList(v);
        this.c = new int[v];
        this.d = new int[v];
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Op fragmentTransaction$Op0 = (Op)backStackRecord0.c.get(v1);
            this.a[v2] = fragmentTransaction$Op0.a;
            this.b.add((fragmentTransaction$Op0.b == null ? null : fragmentTransaction$Op0.b.mWho));
            this.a[v2 + 1] = fragmentTransaction$Op0.c;
            this.a[v2 + 2] = fragmentTransaction$Op0.d;
            this.a[v2 + 3] = fragmentTransaction$Op0.e;
            int v3 = v2 + 5;
            this.a[v2 + 4] = fragmentTransaction$Op0.f;
            v2 += 6;
            this.a[v3] = fragmentTransaction$Op0.g;
            this.c[v1] = fragmentTransaction$Op0.h.ordinal();
            this.d[v1] = fragmentTransaction$Op0.i.ordinal();
        }
        this.e = backStackRecord0.h;
        this.f = backStackRecord0.k;
        this.g = backStackRecord0.P;
        this.h = backStackRecord0.l;
        this.i = backStackRecord0.m;
        this.j = backStackRecord0.n;
        this.k = backStackRecord0.o;
        this.l = backStackRecord0.p;
        this.m = backStackRecord0.q;
        this.n = backStackRecord0.r;
    }

    private void a(@NonNull BackStackRecord backStackRecord0) {
        int v = 0;
        for(int v1 = 0; true; ++v1) {
            boolean z = true;
            if(v >= this.a.length) {
                break;
            }
            Op fragmentTransaction$Op0 = new Op();
            fragmentTransaction$Op0.a = this.a[v];
            if(FragmentManager.W0(2)) {
                Log.v("FragmentManager", "Instantiate " + backStackRecord0 + " op #" + v1 + " base fragment #" + this.a[v + 1]);
            }
            State[] arr_lifecycle$State = State.values();
            fragmentTransaction$Op0.h = arr_lifecycle$State[this.c[v1]];
            State[] arr_lifecycle$State1 = State.values();
            fragmentTransaction$Op0.i = arr_lifecycle$State1[this.d[v1]];
            int[] arr_v = this.a;
            if(arr_v[v + 1] == 0) {
                z = false;
            }
            fragmentTransaction$Op0.c = z;
            int v2 = arr_v[v + 2];
            fragmentTransaction$Op0.d = v2;
            int v3 = arr_v[v + 3];
            fragmentTransaction$Op0.e = v3;
            int v4 = v + 5;
            int v5 = arr_v[v + 4];
            fragmentTransaction$Op0.f = v5;
            v += 6;
            int v6 = arr_v[v4];
            fragmentTransaction$Op0.g = v6;
            backStackRecord0.d = v2;
            backStackRecord0.e = v3;
            backStackRecord0.f = v5;
            backStackRecord0.g = v6;
            backStackRecord0.m(fragmentTransaction$Op0);
        }
        backStackRecord0.h = this.e;
        backStackRecord0.k = this.f;
        backStackRecord0.i = true;
        backStackRecord0.l = this.h;
        backStackRecord0.m = this.i;
        backStackRecord0.n = this.j;
        backStackRecord0.o = this.k;
        backStackRecord0.p = this.l;
        backStackRecord0.q = this.m;
        backStackRecord0.r = this.n;
    }

    @NonNull
    public BackStackRecord c(@NonNull FragmentManager fragmentManager0) {
        BackStackRecord backStackRecord0 = new BackStackRecord(fragmentManager0);
        this.a(backStackRecord0);
        backStackRecord0.P = this.g;
        for(int v = 0; v < this.b.size(); ++v) {
            String s = (String)this.b.get(v);
            if(s != null) {
                Op fragmentTransaction$Op0 = (Op)backStackRecord0.c.get(v);
                fragmentTransaction$Op0.b = fragmentManager0.o0(s);
            }
        }
        backStackRecord0.U(1);
        return backStackRecord0;
    }

    @NonNull
    public BackStackRecord d(@NonNull FragmentManager fragmentManager0, @NonNull Map map0) {
        BackStackRecord backStackRecord0 = new BackStackRecord(fragmentManager0);
        this.a(backStackRecord0);
        for(int v = 0; v < this.b.size(); ++v) {
            String s = (String)this.b.get(v);
            if(s != null) {
                Fragment fragment0 = (Fragment)map0.get(s);
                if(fragment0 == null) {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f + " failed due to missing saved state for Fragment (" + s + ")");
                }
                ((Op)backStackRecord0.c.get(v)).b = fragment0;
                continue;
            }
        }
        return backStackRecord0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeIntArray(this.a);
        parcel0.writeStringList(this.b);
        parcel0.writeIntArray(this.c);
        parcel0.writeIntArray(this.d);
        parcel0.writeInt(this.e);
        parcel0.writeString(this.f);
        parcel0.writeInt(this.g);
        parcel0.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel0, 0);
        parcel0.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel0, 0);
        parcel0.writeStringList(this.l);
        parcel0.writeStringList(this.m);
        parcel0.writeInt(((int)this.n));
    }
}

