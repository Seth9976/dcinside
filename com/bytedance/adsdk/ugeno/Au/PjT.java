package com.bytedance.adsdk.ugeno.Au;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public abstract class PjT implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final PjT PjT;
    private final Parcelable Zh;

    static {
        PjT.PjT = new PjT() {
            {
                super(null);
            }
        };
        PjT.CREATOR = new Parcelable.ClassLoaderCreator() {
            public PjT PjT(Parcel parcel0) {
                return this.PjT(parcel0, null);
            }

            public PjT PjT(Parcel parcel0, ClassLoader classLoader0) {
                if(parcel0.readParcelable(classLoader0) != null) {
                    throw new IllegalStateException("superState must be null");
                }
                return PjT.PjT;
            }

            public PjT[] PjT(int v) {
                return new PjT[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.PjT(parcel0);
            }

            @Override  // android.os.Parcelable$ClassLoaderCreator
            public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
                return this.PjT(parcel0, classLoader0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.PjT(v);
            }
        };
    }

    private PjT() {
        this.Zh = null;
    }

    protected PjT(Parcel parcel0, ClassLoader classLoader0) {
        Parcelable parcelable0 = parcel0.readParcelable(classLoader0);
        if(parcelable0 == null) {
            parcelable0 = PjT.PjT;
        }
        this.Zh = parcelable0;
    }

    protected PjT(Parcelable parcelable0) {
        if(parcelable0 == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if(parcelable0 == PjT.PjT) {
            parcelable0 = null;
        }
        this.Zh = parcelable0;
    }

    PjT(com.bytedance.adsdk.ugeno.Au.PjT.1 pjT$10) {
    }

    public final Parcelable PjT() {
        return this.Zh;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.Zh, v);
    }
}

