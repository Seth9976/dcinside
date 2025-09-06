package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata.Builder;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;

@UnstableApi
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = null;
    public final String b;
    @Nullable
    public final String c;
    public final int d;
    public final byte[] e;
    public static final String f = "APIC";

    static {
        ApicFrame.CREATOR = new Parcelable.Creator() {
            public ApicFrame a(Parcel parcel0) {
                return new ApicFrame(parcel0);
            }

            public ApicFrame[] b(int v) {
                return new ApicFrame[v];
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

    ApicFrame(Parcel parcel0) {
        super("APIC");
        this.b = (String)Util.o(parcel0.readString());
        this.c = parcel0.readString();
        this.d = parcel0.readInt();
        this.e = (byte[])Util.o(parcel0.createByteArray());
    }

    public ApicFrame(String s, @Nullable String s1, int v, byte[] arr_b) {
        super("APIC");
        this.b = s;
        this.c = s1;
        this.d = v;
        this.e = arr_b;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return ApicFrame.class == class0 && (this.d == ((ApicFrame)object0).d && Util.g(this.b, ((ApicFrame)object0).b) && Util.g(this.c, ((ApicFrame)object0).c) && Arrays.equals(this.e, ((ApicFrame)object0).e));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = (this.d + 0x20F) * 0x1F;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v + v2) * 0x1F + v1) * 0x1F + Arrays.hashCode(this.e);
    }

    @Override  // androidx.media3.extractor.metadata.id3.Id3Frame
    public void r3(Builder mediaMetadata$Builder0) {
        mediaMetadata$Builder0.J(this.e, this.d);
    }

    @Override  // androidx.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        parcel0.writeInt(this.d);
        parcel0.writeByteArray(this.e);
    }
}

