package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.customview.view.AbsSavedState;

public class ExtendableSavedState extends AbsSavedState {
    class a implements Parcelable.ClassLoaderCreator {
        a() {
            super();
        }

        @Nullable
        public ExtendableSavedState a(@NonNull Parcel parcel0) {
            return new ExtendableSavedState(parcel0, null, null);
        }

        @NonNull
        public ExtendableSavedState b(@NonNull Parcel parcel0, ClassLoader classLoader0) {
            return new ExtendableSavedState(parcel0, classLoader0, null);
        }

        @NonNull
        public ExtendableSavedState[] c(int v) {
            return new ExtendableSavedState[v];
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
    @NonNull
    public final SimpleArrayMap c;

    static {
        ExtendableSavedState.CREATOR = new a();
    }

    private ExtendableSavedState(@NonNull Parcel parcel0, ClassLoader classLoader0) {
        super(parcel0, classLoader0);
        int v = parcel0.readInt();
        String[] arr_s = new String[v];
        parcel0.readStringArray(arr_s);
        Bundle[] arr_bundle = new Bundle[v];
        parcel0.readTypedArray(arr_bundle, Bundle.CREATOR);
        this.c = new SimpleArrayMap(v);
        for(int v1 = 0; v1 < v; ++v1) {
            this.c.put(arr_s[v1], arr_bundle[v1]);
        }
    }

    ExtendableSavedState(Parcel parcel0, ClassLoader classLoader0, a extendableSavedState$a0) {
        this(parcel0, classLoader0);
    }

    public ExtendableSavedState(Parcelable parcelable0) {
        super(parcelable0);
        this.c = new SimpleArrayMap();
    }

    @Override
    @NonNull
    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.c + "}";
    }

    @Override  // androidx.customview.view.AbsSavedState
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        int v1 = this.c.size();
        parcel0.writeInt(v1);
        String[] arr_s = new String[v1];
        Bundle[] arr_bundle = new Bundle[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_s[v2] = (String)this.c.g(v2);
            arr_bundle[v2] = (Bundle)this.c.l(v2);
        }
        parcel0.writeStringArray(arr_s);
        parcel0.writeTypedArray(arr_bundle, 0);
    }
}

