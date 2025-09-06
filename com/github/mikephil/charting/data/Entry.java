package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.k;

public class Entry extends f implements Parcelable {
    static final class a implements Parcelable.Creator {
        public Entry a(Parcel parcel0) {
            return new Entry(parcel0);
        }

        public Entry[] b(int v) {
            return new Entry[v];
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
    private float d;

    static {
        Entry.CREATOR = new a();
    }

    public Entry() {
        this.d = 0.0f;
    }

    public Entry(float f, float f1) {
        super(f1);
        this.d = f;
    }

    public Entry(float f, float f1, Drawable drawable0) {
        super(f1, drawable0);
        this.d = f;
    }

    public Entry(float f, float f1, Drawable drawable0, Object object0) {
        super(f1, drawable0, object0);
        this.d = f;
    }

    public Entry(float f, float f1, Object object0) {
        super(f1, object0);
        this.d = f;
    }

    protected Entry(Parcel parcel0) {
        this.d = parcel0.readFloat();
        this.g(parcel0.readFloat());
        if(parcel0.readInt() == 1) {
            this.e(parcel0.readParcelable(Object.class.getClassLoader()));
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Entry h() {
        return new Entry(this.d, this.d(), this.a());
    }

    public boolean i(Entry entry0) {
        if(entry0 == null) {
            return false;
        }
        if(entry0.a() != this.a()) {
            return false;
        }
        return Math.abs(entry0.d - this.d) > k.g ? false : Math.abs(entry0.d() - this.d()) <= k.g;
    }

    public float l() {
        return this.d;
    }

    public void m(float f) {
        this.d = f;
    }

    @Override
    public String toString() [...] // 潜在的解密器

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeFloat(this.d);
        parcel0.writeFloat(this.d());
        if(this.a() != null) {
            if(!(this.a() instanceof Parcelable)) {
                throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
            }
            parcel0.writeInt(1);
            parcel0.writeParcelable(((Parcelable)this.a()), v);
            return;
        }
        parcel0.writeInt(0);
    }
}

