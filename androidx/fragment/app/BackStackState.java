package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressLint({"BanParcelableUsage"})
class BackStackState implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    final List a;
    final List b;

    static {
        BackStackState.CREATOR = new Parcelable.Creator() {
            public BackStackState a(Parcel parcel0) {
                return new BackStackState(parcel0);
            }

            public BackStackState[] b(int v) {
                return new BackStackState[v];
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

    BackStackState(@NonNull Parcel parcel0) {
        this.a = parcel0.createStringArrayList();
        this.b = parcel0.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    BackStackState(List list0, List list1) {
        this.a = list0;
        this.b = list1;
    }

    @NonNull
    List a(@NonNull FragmentManager fragmentManager0, Map map0) {
        HashMap hashMap0 = new HashMap(this.a.size());
        for(Object object0: this.a) {
            String s = (String)object0;
            Fragment fragment0 = (Fragment)map0.get(s);
            if(fragment0 == null) {
                FragmentState fragmentState0 = fragmentManager0.H0().C(s, null);
                if(fragmentState0 != null) {
                    Fragment fragment1 = fragmentState0.a(fragmentManager0.G0(), fragmentManager0.J0().f().getClassLoader());
                    hashMap0.put(fragment1.mWho, fragment1);
                }
            }
            else {
                hashMap0.put(fragment0.mWho, fragment0);
            }
        }
        List list0 = new ArrayList();
        for(Object object1: this.b) {
            ((ArrayList)list0).add(((BackStackRecordState)object1).d(fragmentManager0, hashMap0));
        }
        return list0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        parcel0.writeStringList(this.a);
        parcel0.writeTypedList(this.b);
    }
}

