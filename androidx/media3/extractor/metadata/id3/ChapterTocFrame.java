package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;

@UnstableApi
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = null;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    private final Id3Frame[] f;
    public static final String g = "CTOC";

    static {
        ChapterTocFrame.CREATOR = new Parcelable.Creator() {
            public ChapterTocFrame a(Parcel parcel0) {
                return new ChapterTocFrame(parcel0);
            }

            public ChapterTocFrame[] b(int v) {
                return new ChapterTocFrame[v];
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

    ChapterTocFrame(Parcel parcel0) {
        super("CTOC");
        this.b = (String)Util.o(parcel0.readString());
        boolean z = true;
        this.c = parcel0.readByte() != 0;
        if(parcel0.readByte() == 0) {
            z = false;
        }
        this.d = z;
        this.e = (String[])Util.o(parcel0.createStringArray());
        int v1 = parcel0.readInt();
        this.f = new Id3Frame[v1];
        for(int v = 0; v < v1; ++v) {
            this.f[v] = (Id3Frame)parcel0.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterTocFrame(String s, boolean z, boolean z1, String[] arr_s, Id3Frame[] arr_id3Frame) {
        super("CTOC");
        this.b = s;
        this.c = z;
        this.d = z1;
        this.e = arr_s;
        this.f = arr_id3Frame;
    }

    public Id3Frame a(int v) {
        return this.f[v];
    }

    public int c() {
        return this.f.length;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return ChapterTocFrame.class == class0 && (this.c == ((ChapterTocFrame)object0).c && this.d == ((ChapterTocFrame)object0).d && Util.g(this.b, ((ChapterTocFrame)object0).b) && Arrays.equals(this.e, ((ChapterTocFrame)object0).e) && Arrays.equals(this.f, ((ChapterTocFrame)object0).f));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = ((this.c + 0x20F) * 0x1F + this.d) * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.b);
        parcel0.writeByte(((byte)this.c));
        parcel0.writeByte(((byte)this.d));
        parcel0.writeStringArray(this.e);
        parcel0.writeInt(this.f.length);
        Id3Frame[] arr_id3Frame = this.f;
        for(int v1 = 0; v1 < arr_id3Frame.length; ++v1) {
            parcel0.writeParcelable(arr_id3Frame[v1], 0);
        }
    }
}

