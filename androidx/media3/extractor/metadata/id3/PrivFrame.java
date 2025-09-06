package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;

@UnstableApi
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = null;
    public final String b;
    public final byte[] c;
    public static final String d = "PRIV";

    static {
        PrivFrame.CREATOR = new Parcelable.Creator() {
            public PrivFrame a(Parcel parcel0) {
                return new PrivFrame(parcel0);
            }

            public PrivFrame[] b(int v) {
                return new PrivFrame[v];
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

    PrivFrame(Parcel parcel0) {
        super("PRIV");
        this.b = (String)Util.o(parcel0.readString());
        this.c = (byte[])Util.o(parcel0.createByteArray());
    }

    public PrivFrame(String s, byte[] arr_b) {
        super("PRIV");
        this.b = s;
        this.c = arr_b;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return PrivFrame.class == class0 && (Util.g(this.b, ((PrivFrame)object0).b) && Arrays.equals(this.c, ((PrivFrame)object0).c));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.b == null ? Arrays.hashCode(this.c) + 0x3FD1 : (this.b.hashCode() + 0x20F) * 0x1F + Arrays.hashCode(this.c);
    }

    @Override  // androidx.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.a + ": owner=" + this.b;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.b);
        parcel0.writeByteArray(this.c);
    }
}

