package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata.Builder;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class Mp4TimestampData implements Entry {
    public static final Parcelable.Creator CREATOR = null;
    public final long a;
    public final long b;
    public final long c;
    public static final int d = -1;
    private static final int e = 2082844800;

    static {
        Mp4TimestampData.CREATOR = new Parcelable.Creator() {
            public Mp4TimestampData a(Parcel parcel0) {
                return new Mp4TimestampData(parcel0, null);
            }

            public Mp4TimestampData[] b(int v) {
                return new Mp4TimestampData[v];
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

    public Mp4TimestampData(long v, long v1) {
        this.a = v;
        this.b = v1;
        this.c = -1L;
    }

    public Mp4TimestampData(long v, long v1, long v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    private Mp4TimestampData(Parcel parcel0) {
        this.a = parcel0.readLong();
        this.b = parcel0.readLong();
        this.c = parcel0.readLong();
    }

    Mp4TimestampData(Parcel parcel0, androidx.media3.container.Mp4TimestampData.1 mp4TimestampData$10) {
        this(parcel0);
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public byte[] E0() {
        return null;
    }

    public static long a(long v) {
        return v / 1000L + 2082844800L;
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
        return object0 instanceof Mp4TimestampData ? this.a == ((Mp4TimestampData)object0).a && this.b == ((Mp4TimestampData)object0).b && this.c == ((Mp4TimestampData)object0).c : false;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public Format h1() {
        return null;
    }

    @Override
    public int hashCode() {
        return ((0x20F + ((int)(this.a ^ this.a >>> 0x20))) * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + ((int)(this.c ^ this.c >>> 0x20));
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public void r3(Builder mediaMetadata$Builder0) {
    }

    @Override
    public String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.a);
        parcel0.writeLong(this.b);
        parcel0.writeLong(this.c);
    }
}

