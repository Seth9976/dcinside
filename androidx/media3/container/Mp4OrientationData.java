package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata.Builder;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class Mp4OrientationData implements Entry {
    public static final Parcelable.Creator CREATOR;
    public final int a;

    static {
        Mp4OrientationData.CREATOR = new Parcelable.Creator() {
            public Mp4OrientationData a(Parcel parcel0) {
                return new Mp4OrientationData(parcel0, null);
            }

            public Mp4OrientationData[] b(int v) {
                return new Mp4OrientationData[v];
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

    public Mp4OrientationData(int v) {
        Assertions.b(v == 0 || v == 90 || v == 180 || v == 270, "Unsupported orientation");
        this.a = v;
    }

    private Mp4OrientationData(Parcel parcel0) {
        this.a = parcel0.readInt();
    }

    Mp4OrientationData(Parcel parcel0, androidx.media3.container.Mp4OrientationData.1 mp4OrientationData$10) {
        this(parcel0);
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public byte[] E0() {
        return null;
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
        return object0 instanceof Mp4OrientationData ? this.a == ((Mp4OrientationData)object0).a : false;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public Format h1() {
        return null;
    }

    @Override
    public int hashCode() {
        return this.a + 0x20F;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public void r3(Builder mediaMetadata$Builder0) {
    }

    @Override
    public String toString() {
        return "Orientation= " + this.a;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
    }
}

