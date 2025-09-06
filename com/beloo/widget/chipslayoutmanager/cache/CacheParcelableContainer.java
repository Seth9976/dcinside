package com.beloo.widget.chipslayoutmanager.cache;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.LinkedList;
import java.util.NavigableSet;
import java.util.TreeSet;

public final class CacheParcelableContainer implements Parcelable {
    static final class a implements Parcelable.Creator {
        public CacheParcelableContainer a(Parcel parcel0) {
            return new CacheParcelableContainer(parcel0, null);
        }

        public CacheParcelableContainer[] b(int v) {
            return new CacheParcelableContainer[v];
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
    private NavigableSet a;
    private NavigableSet b;

    static {
        CacheParcelableContainer.CREATOR = new a();
    }

    private CacheParcelableContainer(Parcel parcel0) {
        this.a = new TreeSet();
        this.b = new TreeSet();
        LinkedList linkedList0 = new LinkedList();
        LinkedList linkedList1 = new LinkedList();
        parcel0.readList(linkedList0, Integer.class.getClassLoader());
        parcel0.readList(linkedList1, Integer.class.getClassLoader());
        this.a = new TreeSet(linkedList0);
        this.b = new TreeSet(linkedList1);
    }

    CacheParcelableContainer(Parcel parcel0, a cacheParcelableContainer$a0) {
        this(parcel0);
    }

    CacheParcelableContainer(NavigableSet navigableSet0, NavigableSet navigableSet1) {
        this.a = new TreeSet();
        new TreeSet();
        this.a = navigableSet0;
        this.b = navigableSet1;
    }

    NavigableSet a() {
        return this.b;
    }

    NavigableSet c() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        LinkedList linkedList0 = new LinkedList(this.a);
        LinkedList linkedList1 = new LinkedList(this.b);
        parcel0.writeList(linkedList0);
        parcel0.writeList(linkedList1);
    }
}

