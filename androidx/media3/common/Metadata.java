package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;
import java.util.List;

@UnstableApi
public final class Metadata implements Parcelable {
    public interface Entry extends Parcelable {
        @Nullable
        byte[] E0();

        @Nullable
        Format h1();

        void r3(Builder arg1);
    }

    public static final Parcelable.Creator CREATOR;
    private final Entry[] a;
    public final long b;

    static {
        Metadata.CREATOR = new Parcelable.Creator() {
            public Metadata a(Parcel parcel0) {
                return new Metadata(parcel0);
            }

            public Metadata[] b(int v) {
                return new Metadata[v];
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
    }

    public Metadata(long v, List list0) {
        this(v, ((Entry[])list0.toArray(new Entry[0])));
    }

    public Metadata(long v, Entry[] arr_metadata$Entry) {
        this.b = v;
        this.a = arr_metadata$Entry;
    }

    Metadata(Parcel parcel0) {
        this.a = new Entry[parcel0.readInt()];
        for(int v = 0; true; ++v) {
            Entry[] arr_metadata$Entry = this.a;
            if(v >= arr_metadata$Entry.length) {
                break;
            }
            arr_metadata$Entry[v] = (Entry)parcel0.readParcelable(Entry.class.getClassLoader());
        }
        this.b = parcel0.readLong();
    }

    public Metadata(List list0) {
        this(((Entry[])list0.toArray(new Entry[0])));
    }

    public Metadata(Entry[] arr_metadata$Entry) {
        this(0x8000000000000001L, arr_metadata$Entry);
    }

    public Metadata a(Entry[] arr_metadata$Entry) {
        if(arr_metadata$Entry.length == 0) {
            return this;
        }
        Entry[] arr_metadata$Entry1 = (Entry[])Util.K1(this.a, arr_metadata$Entry);
        return new Metadata(this.b, arr_metadata$Entry1);
    }

    public Metadata c(@Nullable Metadata metadata0) {
        return metadata0 == null ? this : this.a(metadata0.a);
    }

    public Metadata d(long v) {
        return this.b == v ? this : new Metadata(v, this.a);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Entry e(int v) {
        return this.a[v];
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return Metadata.class == class0 && (Arrays.equals(this.a, ((Metadata)object0).a) && this.b == ((Metadata)object0).b);
        }
        return false;
    }

    public int f() {
        return this.a.length;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.a) * 0x1F + ((int)(this.b ^ this.b >>> 0x20));
    }

    @Override
    public String toString() {
        return "entries=" + Arrays.toString(this.a) + (this.b == 0x8000000000000001L ? "" : ", presentationTimeUs=" + this.b);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a.length);
        Entry[] arr_metadata$Entry = this.a;
        for(int v1 = 0; v1 < arr_metadata$Entry.length; ++v1) {
            parcel0.writeParcelable(arr_metadata$Entry[v1], 0);
        }
        parcel0.writeLong(this.b);
    }
}

