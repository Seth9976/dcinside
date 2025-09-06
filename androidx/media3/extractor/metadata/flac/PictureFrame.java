package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata.Builder;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.f;
import java.util.Arrays;

@UnstableApi
public final class PictureFrame implements Entry {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    static {
        PictureFrame.CREATOR = new Parcelable.Creator() {
            public PictureFrame a(Parcel parcel0) {
                return new PictureFrame(parcel0);
            }

            public PictureFrame[] b(int v) {
                return new PictureFrame[v];
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

    public PictureFrame(int v, String s, String s1, int v1, int v2, int v3, int v4, byte[] arr_b) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = v1;
        this.e = v2;
        this.f = v3;
        this.g = v4;
        this.h = arr_b;
    }

    PictureFrame(Parcel parcel0) {
        this.a = parcel0.readInt();
        this.b = (String)Util.o(parcel0.readString());
        this.c = (String)Util.o(parcel0.readString());
        this.d = parcel0.readInt();
        this.e = parcel0.readInt();
        this.f = parcel0.readInt();
        this.g = parcel0.readInt();
        this.h = (byte[])Util.o(parcel0.createByteArray());
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public byte[] E0() {
        return null;
    }

    public static PictureFrame a(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.s();
        String s = MimeTypes.v(parsableByteArray0.J(parsableByteArray0.s(), f.a));
        String s1 = parsableByteArray0.I(parsableByteArray0.s());
        int v1 = parsableByteArray0.s();
        int v2 = parsableByteArray0.s();
        int v3 = parsableByteArray0.s();
        int v4 = parsableByteArray0.s();
        int v5 = parsableByteArray0.s();
        byte[] arr_b = new byte[v5];
        parsableByteArray0.n(arr_b, 0, v5);
        return new PictureFrame(v, s, s1, v1, v2, v3, v4, arr_b);
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
            return PictureFrame.class == class0 && (this.a == ((PictureFrame)object0).a && this.b.equals(((PictureFrame)object0).b) && this.c.equals(((PictureFrame)object0).c) && this.d == ((PictureFrame)object0).d && this.e == ((PictureFrame)object0).e && this.f == ((PictureFrame)object0).f && this.g == ((PictureFrame)object0).g && Arrays.equals(this.h, ((PictureFrame)object0).h));
        }
        return false;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public Format h1() {
        return null;
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.h);
        return (((((((this.a + 0x20F) * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + this.f) * 0x1F + this.g) * 0x1F + v;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public void r3(Builder mediaMetadata$Builder0) {
        mediaMetadata$Builder0.J(this.h, this.a);
    }

    @Override
    public String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        parcel0.writeInt(this.d);
        parcel0.writeInt(this.e);
        parcel0.writeInt(this.f);
        parcel0.writeInt(this.g);
        parcel0.writeByteArray(this.h);
    }
}

