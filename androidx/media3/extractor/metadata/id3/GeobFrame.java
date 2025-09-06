package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;

@UnstableApi
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = null;
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;
    public static final String f = "GEOB";

    static {
        GeobFrame.CREATOR = new Parcelable.Creator() {
            public GeobFrame a(Parcel parcel0) {
                return new GeobFrame(parcel0);
            }

            public GeobFrame[] b(int v) {
                return new GeobFrame[v];
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

    GeobFrame(Parcel parcel0) {
        super("GEOB");
        this.b = (String)Util.o(parcel0.readString());
        this.c = (String)Util.o(parcel0.readString());
        this.d = (String)Util.o(parcel0.readString());
        this.e = (byte[])Util.o(parcel0.createByteArray());
    }

    public GeobFrame(String s, String s1, String s2, byte[] arr_b) {
        super("GEOB");
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = arr_b;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return GeobFrame.class == class0 && (Util.g(this.b, ((GeobFrame)object0).b) && Util.g(this.c, ((GeobFrame)object0).c) && Util.g(this.d, ((GeobFrame)object0).d) && Arrays.equals(this.e, ((GeobFrame)object0).e));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.b == null ? 0 : this.b.hashCode();
        int v2 = this.c == null ? 0 : this.c.hashCode();
        String s = this.d;
        if(s != null) {
            v = s.hashCode();
        }
        return (((v1 + 0x20F) * 0x1F + v2) * 0x1F + v) * 0x1F + Arrays.hashCode(this.e);
    }

    @Override  // androidx.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
        parcel0.writeByteArray(this.e);
    }
}

