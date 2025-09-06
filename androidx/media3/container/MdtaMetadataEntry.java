package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata.Builder;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.primitives.l;
import java.util.Arrays;

@UnstableApi
public final class MdtaMetadataEntry implements Entry {
    public static final Parcelable.Creator CREATOR = null;
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;
    public static final String e = "com.android.capture.fps";
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 23;
    public static final int i = 67;

    static {
        MdtaMetadataEntry.CREATOR = new Parcelable.Creator() {
            public MdtaMetadataEntry a(Parcel parcel0) {
                return new MdtaMetadataEntry(parcel0, null);
            }

            public MdtaMetadataEntry[] b(int v) {
                return new MdtaMetadataEntry[v];
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

    private MdtaMetadataEntry(Parcel parcel0) {
        this.a = (String)Util.o(parcel0.readString());
        this.b = (byte[])Util.o(parcel0.createByteArray());
        this.c = parcel0.readInt();
        this.d = parcel0.readInt();
    }

    MdtaMetadataEntry(Parcel parcel0, androidx.media3.container.MdtaMetadataEntry.1 mdtaMetadataEntry$10) {
        this(parcel0);
    }

    public MdtaMetadataEntry(String s, byte[] arr_b, int v) {
        this(s, arr_b, 0, v);
    }

    public MdtaMetadataEntry(String s, byte[] arr_b, int v, int v1) {
        this.a = s;
        this.b = arr_b;
        this.c = v;
        this.d = v1;
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
            return MdtaMetadataEntry.class == class0 && (this.a.equals(((MdtaMetadataEntry)object0).a) && Arrays.equals(this.b, ((MdtaMetadataEntry)object0).b) && this.c == ((MdtaMetadataEntry)object0).c && this.d == ((MdtaMetadataEntry)object0).d);
        }
        return false;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public Format h1() {
        return null;
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.b);
        return (((this.a.hashCode() + 0x20F) * 0x1F + v) * 0x1F + this.c) * 0x1F + this.d;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public void r3(Builder mediaMetadata$Builder0) {
    }

    @Override
    public String toString() {
        String s;
        switch(this.d) {
            case 1: {
                return "mdta: key=" + this.a + ", value=" + Util.T(this.b);
            }
            case 23: {
                s = String.valueOf(Float.intBitsToFloat(l.j(this.b)));
                return "mdta: key=" + this.a + ", value=" + s;
            }
            case 67: {
                s = String.valueOf(l.j(this.b));
                return "mdta: key=" + this.a + ", value=" + s;
            }
            default: {
                s = Util.w2(this.b);
                return "mdta: key=" + this.a + ", value=" + s;
            }
        }
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeByteArray(this.b);
        parcel0.writeInt(this.c);
        parcel0.writeInt(this.d);
    }
}

