package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressLint({"BanParcelableUsage"})
public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final Parcelable a;
    public static final AbsSavedState b;

    static {
        AbsSavedState.b = new AbsSavedState() {
            {
                super(null);
            }
        };
        AbsSavedState.CREATOR = new Parcelable.ClassLoaderCreator() {
            public AbsSavedState a(Parcel parcel0) {
                return this.b(parcel0, null);
            }

            public AbsSavedState b(Parcel parcel0, ClassLoader classLoader0) {
                if(parcel0.readParcelable(classLoader0) != null) {
                    throw new IllegalStateException("superState must be null");
                }
                return AbsSavedState.b;
            }

            public AbsSavedState[] c(int v) {
                return new AbsSavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$ClassLoaderCreator
            public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
                return this.b(parcel0, classLoader0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.c(v);
            }
        };
    }

    private AbsSavedState() {
        this.a = null;
    }

    protected AbsSavedState(@NonNull Parcel parcel0) {
        this(parcel0, null);
    }

    protected AbsSavedState(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0) {
        Parcelable parcelable0 = parcel0.readParcelable(classLoader0);
        if(parcelable0 == null) {
            parcelable0 = AbsSavedState.b;
        }
        this.a = parcelable0;
    }

    protected AbsSavedState(@NonNull Parcelable parcelable0) {
        if(parcelable0 == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if(parcelable0 == AbsSavedState.b) {
            parcelable0 = null;
        }
        this.a = parcelable0;
    }

    AbsSavedState(androidx.customview.view.AbsSavedState.1 absSavedState$10) {
    }

    @Nullable
    public final Parcelable a() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.a, v);
    }
}

