package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata.Builder;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.g;

@UnstableApi
public final class SmtaMetadataEntry implements Entry {
    public static final Parcelable.Creator CREATOR;
    public final float a;
    public final int b;

    static {
        SmtaMetadataEntry.CREATOR = new Parcelable.Creator() {
            public SmtaMetadataEntry a(Parcel parcel0) {
                return new SmtaMetadataEntry(parcel0, null);
            }

            public SmtaMetadataEntry[] b(int v) {
                return new SmtaMetadataEntry[v];
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

    public SmtaMetadataEntry(float f, int v) {
        this.a = f;
        this.b = v;
    }

    private SmtaMetadataEntry(Parcel parcel0) {
        this.a = parcel0.readFloat();
        this.b = parcel0.readInt();
    }

    SmtaMetadataEntry(Parcel parcel0, androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry.1 smtaMetadataEntry$10) {
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
            return SmtaMetadataEntry.class == class0 && (this.a == ((SmtaMetadataEntry)object0).a && this.b == ((SmtaMetadataEntry)object0).b);
        }
        return false;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public Format h1() {
        return null;
    }

    @Override
    public int hashCode() {
        return (g.i(this.a) + 0x20F) * 0x1F + this.b;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public void r3(Builder mediaMetadata$Builder0) {
    }

    @Override
    public String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeFloat(this.a);
        parcel0.writeInt(this.b);
    }
}

