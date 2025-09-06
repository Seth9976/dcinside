package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.view.View.BaseSavedState;
import androidx.annotation.NonNull;

class GifViewSavedState extends View.BaseSavedState {
    static final class a implements Parcelable.Creator {
        public GifViewSavedState a(Parcel parcel0) {
            return new GifViewSavedState(parcel0, null);
        }

        public GifViewSavedState[] b(int v) {
            return new GifViewSavedState[v];
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
    final long[][] a;

    static {
        GifViewSavedState.CREATOR = new a();
    }

    private GifViewSavedState(Parcel parcel0) {
        super(parcel0);
        this.a = new long[parcel0.readInt()][];
        for(int v = 0; true; ++v) {
            long[][] arr2_v = this.a;
            if(v >= arr2_v.length) {
                break;
            }
            arr2_v[v] = parcel0.createLongArray();
        }
    }

    GifViewSavedState(Parcel parcel0, a gifViewSavedState$a0) {
        this(parcel0);
    }

    GifViewSavedState(Parcelable parcelable0, long[] arr_v) {
        super(parcelable0);
        long[][] arr2_v = new long[1][];
        this.a = arr2_v;
        arr2_v[0] = arr_v;
    }

    GifViewSavedState(Parcelable parcelable0, Drawable[] arr_drawable) {
        super(parcelable0);
        this.a = new long[arr_drawable.length][];
        for(int v = 0; v < arr_drawable.length; ++v) {
            Drawable drawable0 = arr_drawable[v];
            this.a[v] = drawable0 instanceof e ? ((e)drawable0).g.o() : null;
        }
    }

    void a(Drawable drawable0, int v) {
        long[] arr_v = this.a[v];
        if(arr_v != null && drawable0 instanceof e) {
            ((e)drawable0).M(((long)((e)drawable0).g.E(arr_v, ((e)drawable0).f)));
        }
    }

    @Override  // android.view.View$BaseSavedState
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeInt(this.a.length);
        long[][] arr2_v = this.a;
        for(int v1 = 0; v1 < arr2_v.length; ++v1) {
            parcel0.writeLongArray(arr2_v[v1]);
        }
    }
}

