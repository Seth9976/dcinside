package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata.Builder;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.g;

@UnstableApi
public final class Mp4LocationData implements Entry {
    public static final Parcelable.Creator CREATOR;
    public final float a;
    public final float b;

    static {
        Mp4LocationData.CREATOR = new Parcelable.Creator() {
            public Mp4LocationData a(Parcel parcel0) {
                return new Mp4LocationData(parcel0, null);
            }

            public Mp4LocationData[] b(int v) {
                return new Mp4LocationData[v];
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

    public Mp4LocationData(@FloatRange(from = -90.0, to = 90.0) float f, @FloatRange(from = -180.0, to = 180.0) float f1) {
        Assertions.b(f >= -90.0f && f <= 90.0f && f1 >= -180.0f && f1 <= 180.0f, "Invalid latitude or longitude");
        this.a = f;
        this.b = f1;
    }

    private Mp4LocationData(Parcel parcel0) {
        this.a = parcel0.readFloat();
        this.b = parcel0.readFloat();
    }

    Mp4LocationData(Parcel parcel0, androidx.media3.container.Mp4LocationData.1 mp4LocationData$10) {
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
        if(object0 != null) {
            Class class0 = object0.getClass();
            return Mp4LocationData.class == class0 && (this.a == ((Mp4LocationData)object0).a && this.b == ((Mp4LocationData)object0).b);
        }
        return false;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public Format h1() {
        return null;
    }

    @Override
    public int hashCode() {
        return (g.i(this.a) + 0x20F) * 0x1F + g.i(this.b);
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public void r3(Builder mediaMetadata$Builder0) {
    }

    @Override
    public String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeFloat(this.a);
        parcel0.writeFloat(this.b);
    }
}

