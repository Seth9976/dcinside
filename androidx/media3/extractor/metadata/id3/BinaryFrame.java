package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;

@UnstableApi
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR;
    public final byte[] b;

    static {
        BinaryFrame.CREATOR = new Parcelable.Creator() {
            public BinaryFrame a(Parcel parcel0) {
                return new BinaryFrame(parcel0);
            }

            public BinaryFrame[] b(int v) {
                return new BinaryFrame[v];
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

    BinaryFrame(Parcel parcel0) {
        super(((String)Util.o(parcel0.readString())));
        this.b = (byte[])Util.o(parcel0.createByteArray());
    }

    public BinaryFrame(String s, byte[] arr_b) {
        super(s);
        this.b = arr_b;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return BinaryFrame.class == class0 && (this.a.equals(((BinaryFrame)object0).a) && Arrays.equals(this.b, ((BinaryFrame)object0).b));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.b);
        return (this.a.hashCode() + 0x20F) * 0x1F + v;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeByteArray(this.b);
    }
}

