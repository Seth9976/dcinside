package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class StreamKey implements Parcelable, Comparable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final int c;
    private static final String d;
    private static final String e;
    private static final String f;

    static {
        StreamKey.CREATOR = new Parcelable.Creator() {
            public StreamKey a(Parcel parcel0) {
                return new StreamKey(parcel0);
            }

            public StreamKey[] b(int v) {
                return new StreamKey[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        };
        StreamKey.d = "0";
        StreamKey.e = "1";
        StreamKey.f = "2";
    }

    public StreamKey(int v, int v1) {
        this(0, v, v1);
    }

    public StreamKey(int v, int v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    StreamKey(Parcel parcel0) {
        this.a = parcel0.readInt();
        this.b = parcel0.readInt();
        this.c = parcel0.readInt();
    }

    public int a(StreamKey streamKey0) {
        int v = this.a - streamKey0.a;
        if(v == 0) {
            v = this.b - streamKey0.b;
            return v == 0 ? this.c - streamKey0.c : v;
        }
        return v;
    }

    public static StreamKey c(Bundle bundle0) {
        return new StreamKey(bundle0.getInt(StreamKey.d, 0), bundle0.getInt(StreamKey.e, 0), bundle0.getInt(StreamKey.f, 0));
    }

    @Override
    public int compareTo(Object object0) {
        return this.a(((StreamKey)object0));
    }

    public Bundle d() {
        Bundle bundle0 = new Bundle();
        int v = this.a;
        if(v != 0) {
            bundle0.putInt(StreamKey.d, v);
        }
        int v1 = this.b;
        if(v1 != 0) {
            bundle0.putInt(StreamKey.e, v1);
        }
        int v2 = this.c;
        if(v2 != 0) {
            bundle0.putInt(StreamKey.f, v2);
        }
        return bundle0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return StreamKey.class == class0 && (this.a == ((StreamKey)object0).a && this.b == ((StreamKey)object0).b && this.c == ((StreamKey)object0).c);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.a * 0x1F + this.b) * 0x1F + this.c;
    }

    @Override
    public String toString() {
        return this.a + "." + this.b + "." + this.c;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
        parcel0.writeInt(this.b);
        parcel0.writeInt(this.c);
    }
}

