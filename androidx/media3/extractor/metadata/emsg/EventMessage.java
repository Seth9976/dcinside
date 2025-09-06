package androidx.media3.extractor.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;

@UnstableApi
public final class EventMessage implements Entry {
    public static final Parcelable.Creator CREATOR = null;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    private int f;
    @VisibleForTesting
    public static final String g = "https://aomedia.org/emsg/ID3";
    private static final String h = "https://developer.apple.com/streaming/emsg-id3";
    @VisibleForTesting
    public static final String i = "urn:scte:scte35:2014:bin";
    private static final Format j;
    private static final Format k;

    static {
        EventMessage.j = new Builder().o0("application/id3").K();
        EventMessage.k = new Builder().o0("application/x-scte35").K();
        EventMessage.CREATOR = new Parcelable.Creator() {
            public EventMessage a(Parcel parcel0) {
                return new EventMessage(parcel0);
            }

            public EventMessage[] b(int v) {
                return new EventMessage[v];
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

    EventMessage(Parcel parcel0) {
        this.a = (String)Util.o(parcel0.readString());
        this.b = (String)Util.o(parcel0.readString());
        this.c = parcel0.readLong();
        this.d = parcel0.readLong();
        this.e = (byte[])Util.o(parcel0.createByteArray());
    }

    public EventMessage(String s, String s1, long v, long v1, byte[] arr_b) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = v1;
        this.e = arr_b;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    @Nullable
    public byte[] E0() {
        return this.h1() == null ? null : this.e;
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
            return EventMessage.class == class0 && (this.c == ((EventMessage)object0).c && this.d == ((EventMessage)object0).d && Util.g(this.a, ((EventMessage)object0).a) && Util.g(this.b, ((EventMessage)object0).b) && Arrays.equals(this.e, ((EventMessage)object0).e));
        }
        return false;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    @Nullable
    public Format h1() {
        this.a.hashCode();
        switch(this.a) {
            case "https://aomedia.org/emsg/ID3": {
                return EventMessage.j;
            }
            case "https://developer.apple.com/streaming/emsg-id3": {
                return EventMessage.j;
            }
            case "urn:scte:scte35:2014:bin": {
                return EventMessage.k;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public int hashCode() {
        if(this.f == 0) {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            String s = this.b;
            if(s != null) {
                v = s.hashCode();
            }
            int v2 = Arrays.hashCode(this.e);
            this.f = ((((v1 + 0x20F) * 0x1F + v) * 0x1F + ((int)(this.c ^ this.c >>> 0x20))) * 0x1F + ((int)(this.d ^ this.d >>> 0x20))) * 0x1F + v2;
        }
        return this.f;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public void r3(androidx.media3.common.MediaMetadata.Builder mediaMetadata$Builder0) {
    }

    @Override
    public String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeLong(this.c);
        parcel0.writeLong(this.d);
        parcel0.writeByteArray(this.e);
    }
}

