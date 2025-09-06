package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;

@UnstableApi
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = null;
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;
    public static final String g = "MLLT";

    static {
        MlltFrame.CREATOR = new Parcelable.Creator() {
            public MlltFrame a(Parcel parcel0) {
                return new MlltFrame(parcel0);
            }

            public MlltFrame[] b(int v) {
                return new MlltFrame[v];
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

    public MlltFrame(int v, int v1, int v2, int[] arr_v, int[] arr_v1) {
        super("MLLT");
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = arr_v;
        this.f = arr_v1;
    }

    MlltFrame(Parcel parcel0) {
        super("MLLT");
        this.b = parcel0.readInt();
        this.c = parcel0.readInt();
        this.d = parcel0.readInt();
        this.e = (int[])Util.o(parcel0.createIntArray());
        this.f = (int[])Util.o(parcel0.createIntArray());
    }

    @Override  // androidx.media3.extractor.metadata.id3.Id3Frame
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
            return MlltFrame.class == class0 && (this.b == ((MlltFrame)object0).b && this.c == ((MlltFrame)object0).c && this.d == ((MlltFrame)object0).d && Arrays.equals(this.e, ((MlltFrame)object0).e) && Arrays.equals(this.f, ((MlltFrame)object0).f));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.e);
        int v1 = Arrays.hashCode(this.f);
        return ((((this.b + 0x20F) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + v) * 0x1F + v1;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.b);
        parcel0.writeInt(this.c);
        parcel0.writeInt(this.d);
        parcel0.writeIntArray(this.e);
        parcel0.writeIntArray(this.f);
    }
}

