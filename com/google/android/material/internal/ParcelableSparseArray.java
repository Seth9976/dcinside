package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public class ParcelableSparseArray extends SparseArray implements Parcelable {
    class a implements Parcelable.ClassLoaderCreator {
        a() {
            super();
        }

        @Nullable
        public ParcelableSparseArray a(@NonNull Parcel parcel0) {
            return new ParcelableSparseArray(parcel0, null);
        }

        @NonNull
        public ParcelableSparseArray b(@NonNull Parcel parcel0, ClassLoader classLoader0) {
            return new ParcelableSparseArray(parcel0, classLoader0);
        }

        @NonNull
        public ParcelableSparseArray[] c(int v) {
            return new ParcelableSparseArray[v];
        }

        @Override  // android.os.Parcelable$Creator
        @Nullable
        public Object createFromParcel(@NonNull Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$ClassLoaderCreator
        @NonNull
        public Object createFromParcel(@NonNull Parcel parcel0, ClassLoader classLoader0) {
            return this.b(parcel0, classLoader0);
        }

        @Override  // android.os.Parcelable$Creator
        @NonNull
        public Object[] newArray(int v) {
            return this.c(v);
        }
    }

    public static final Parcelable.Creator CREATOR;

    static {
        ParcelableSparseArray.CREATOR = new a();
    }

    public ParcelableSparseArray() {
    }

    public ParcelableSparseArray(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0) {
        int v = parcel0.readInt();
        int[] arr_v = new int[v];
        parcel0.readIntArray(arr_v);
        Parcelable[] arr_parcelable = parcel0.readParcelableArray(classLoader0);
        for(int v1 = 0; v1 < v; ++v1) {
            this.put(arr_v[v1], arr_parcelable[v1]);
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = this.size();
        int[] arr_v = new int[v1];
        Parcelable[] arr_parcelable = new Parcelable[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_v[v2] = this.keyAt(v2);
            arr_parcelable[v2] = (Parcelable)this.valueAt(v2);
        }
        parcel0.writeInt(v1);
        parcel0.writeIntArray(arr_v);
        parcel0.writeParcelableArray(arr_parcelable, v);
    }
}

