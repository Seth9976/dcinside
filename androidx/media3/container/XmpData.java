package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata.Builder;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;

@UnstableApi
public final class XmpData implements Entry {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;

    static {
        XmpData.CREATOR = new Parcelable.Creator() {
            public XmpData a(Parcel parcel0) {
                return new XmpData(parcel0, null);
            }

            public XmpData[] b(int v) {
                return new XmpData[v];
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

    private XmpData(Parcel parcel0) {
        this.a = (byte[])Util.o(parcel0.createByteArray());
    }

    XmpData(Parcel parcel0, androidx.media3.container.XmpData.1 xmpData$10) {
        this(parcel0);
    }

    public XmpData(byte[] arr_b) {
        this.a = arr_b;
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
            return XmpData.class == class0 ? Arrays.equals(this.a, ((XmpData)object0).a) : false;
        }
        return false;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public Format h1() {
        return null;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public void r3(Builder mediaMetadata$Builder0) {
    }

    @Override
    public String toString() {
        return "XMP: " + Util.w2(this.a);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeByteArray(this.a);
    }
}

