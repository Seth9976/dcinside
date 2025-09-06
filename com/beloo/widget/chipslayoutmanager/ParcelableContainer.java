package com.beloo.widget.chipslayoutmanager;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import com.beloo.widget.chipslayoutmanager.cache.CacheParcelableContainer;

class ParcelableContainer implements Parcelable {
    static final class a implements Parcelable.Creator {
        public ParcelableContainer a(Parcel parcel0) {
            return new ParcelableContainer(parcel0, null);
        }

        public ParcelableContainer[] b(int v) {
            return new ParcelableContainer[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    public static final Parcelable.Creator CREATOR;
    private AnchorViewState a;
    private SparseArray b;
    private SparseArray c;
    private int d;

    static {
        ParcelableContainer.CREATOR = new a();
    }

    ParcelableContainer() {
        this.b = new SparseArray();
        SparseArray sparseArray0 = new SparseArray();
        this.c = sparseArray0;
        sparseArray0.put(1, 0);
        this.c.put(2, 0);
    }

    private ParcelableContainer(Parcel parcel0) {
        this.b = new SparseArray();
        this.c = new SparseArray();
        this.a = (AnchorViewState)AnchorViewState.CREATOR.createFromParcel(parcel0);
        this.b = parcel0.readSparseArray(CacheParcelableContainer.class.getClassLoader());
        this.c = parcel0.readSparseArray(Integer.class.getClassLoader());
        this.d = parcel0.readInt();
    }

    ParcelableContainer(Parcel parcel0, a parcelableContainer$a0) {
        this(parcel0);
    }

    AnchorViewState a() {
        return this.a;
    }

    @IntRange(from = 0L)
    @Nullable
    Integer c(int v) {
        return (Integer)this.c.get(v);
    }

    int d() {
        return this.d;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    Parcelable e(int v) {
        return (Parcelable)this.b.get(v);
    }

    void f(AnchorViewState anchorViewState0) {
        this.a = anchorViewState0;
    }

    void g(int v, @Nullable Integer integer0) {
        this.c.put(v, integer0);
    }

    void h(int v) {
        this.d = v;
    }

    void i(int v, Parcelable parcelable0) {
        this.b.put(v, parcelable0);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        this.a.writeToParcel(parcel0, v);
        parcel0.writeSparseArray(this.b);
        parcel0.writeSparseArray(this.c);
        parcel0.writeInt(this.d);
    }
}

