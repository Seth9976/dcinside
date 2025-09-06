package com.beloo.widget.chipslayoutmanager.anchor;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Locale;

public class AnchorViewState implements Parcelable {
    static final class a implements Parcelable.Creator {
        public AnchorViewState a(Parcel parcel0) {
            return new AnchorViewState(parcel0, null);
        }

        public AnchorViewState[] b(int v) {
            return new AnchorViewState[v];
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
    private Integer a;
    private Rect b;

    static {
        AnchorViewState.CREATOR = new a();
    }

    private AnchorViewState() {
        this.a = 0;
    }

    AnchorViewState(int v, @NonNull Rect rect0) {
        this.a = v;
        this.b = rect0;
    }

    private AnchorViewState(Parcel parcel0) {
        this.a = 0;
        int v = parcel0.readInt();
        this.a = v == -1 ? null : v;
        this.b = (Rect)parcel0.readParcelable(AnchorViewState.class.getClassLoader());
    }

    AnchorViewState(Parcel parcel0, a anchorViewState$a0) {
        this(parcel0);
    }

    public Rect a() {
        return this.b;
    }

    static AnchorViewState c() {
        return new AnchorViewState();
    }

    public Integer d() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.b == null;
    }

    public boolean f() {
        return ((int)this.d()) == -1;
    }

    public void g(Rect rect0) {
        this.b = rect0;
    }

    public void h(Integer integer0) {
        this.a = integer0;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "AnchorState. Position = %d, Rect = %s", this.a, String.valueOf(this.b));
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt((this.a == null ? -1 : ((int)this.a)));
        parcel0.writeParcelable(this.b, 0);
    }
}

