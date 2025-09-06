package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public class ParcelableSparseBooleanArray extends SparseBooleanArray implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        @NonNull
        public ParcelableSparseBooleanArray a(@NonNull Parcel parcel0) {
            int v = parcel0.readInt();
            ParcelableSparseBooleanArray parcelableSparseBooleanArray0 = new ParcelableSparseBooleanArray(v);
            int[] arr_v = new int[v];
            boolean[] arr_z = new boolean[v];
            parcel0.readIntArray(arr_v);
            parcel0.readBooleanArray(arr_z);
            for(int v1 = 0; v1 < v; ++v1) {
                parcelableSparseBooleanArray0.put(arr_v[v1], arr_z[v1]);
            }
            return parcelableSparseBooleanArray0;
        }

        @NonNull
        public ParcelableSparseBooleanArray[] b(int v) {
            return new ParcelableSparseBooleanArray[v];
        }

        @Override  // android.os.Parcelable$Creator
        @NonNull
        public Object createFromParcel(@NonNull Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        @NonNull
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    public static final Parcelable.Creator CREATOR;

    static {
        ParcelableSparseBooleanArray.CREATOR = new a();
    }

    public ParcelableSparseBooleanArray() {
    }

    public ParcelableSparseBooleanArray(int v) {
        super(v);
    }

    public ParcelableSparseBooleanArray(@NonNull SparseBooleanArray sparseBooleanArray0) {
        super(sparseBooleanArray0.size());
        for(int v = 0; v < sparseBooleanArray0.size(); ++v) {
            this.put(sparseBooleanArray0.keyAt(v), sparseBooleanArray0.valueAt(v));
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        int[] arr_v = new int[this.size()];
        boolean[] arr_z = new boolean[this.size()];
        for(int v1 = 0; v1 < this.size(); ++v1) {
            arr_v[v1] = this.keyAt(v1);
            arr_z[v1] = this.valueAt(v1);
        }
        parcel0.writeInt(this.size());
        parcel0.writeIntArray(arr_v);
        parcel0.writeBooleanArray(arr_z);
    }
}

