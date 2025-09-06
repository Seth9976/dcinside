package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata.Builder;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class MotionPhotoMetadata implements Entry {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    static {
        MotionPhotoMetadata.CREATOR = new Parcelable.Creator() {
            public MotionPhotoMetadata a(Parcel parcel0) {
                return new MotionPhotoMetadata(parcel0, null);
            }

            public MotionPhotoMetadata[] b(int v) {
                return new MotionPhotoMetadata[v];
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

    public MotionPhotoMetadata(long v, long v1, long v2, long v3, long v4) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
    }

    private MotionPhotoMetadata(Parcel parcel0) {
        this.a = parcel0.readLong();
        this.b = parcel0.readLong();
        this.c = parcel0.readLong();
        this.d = parcel0.readLong();
        this.e = parcel0.readLong();
    }

    MotionPhotoMetadata(Parcel parcel0, androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata.1 motionPhotoMetadata$10) {
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
            return MotionPhotoMetadata.class == class0 && (this.a == ((MotionPhotoMetadata)object0).a && this.b == ((MotionPhotoMetadata)object0).b && this.c == ((MotionPhotoMetadata)object0).c && this.d == ((MotionPhotoMetadata)object0).d && this.e == ((MotionPhotoMetadata)object0).e);
        }
        return false;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public Format h1() {
        return null;
    }

    @Override
    public int hashCode() {
        return ((((0x20F + ((int)(this.a ^ this.a >>> 0x20))) * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + ((int)(this.c ^ this.c >>> 0x20))) * 0x1F + ((int)(this.d ^ this.d >>> 0x20))) * 0x1F + ((int)(this.e ^ this.e >>> 0x20));
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public void r3(Builder mediaMetadata$Builder0) {
    }

    @Override
    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.a);
        parcel0.writeLong(this.b);
        parcel0.writeLong(this.c);
        parcel0.writeLong(this.d);
        parcel0.writeLong(this.e);
    }
}

