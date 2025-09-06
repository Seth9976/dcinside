package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata.Builder;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.List;
import java.util.Map;

@UnstableApi
public final class IcyHeaders implements Entry {
    public static final Parcelable.Creator CREATOR = null;
    public final int a;
    @Nullable
    public final String b;
    @Nullable
    public final String c;
    @Nullable
    public final String d;
    public final boolean e;
    public final int f;
    public static final String g = "Icy-MetaData";
    public static final String h = "1";
    private static final String i = "IcyHeaders";
    private static final String j = "icy-br";
    private static final String k = "icy-genre";
    private static final String l = "icy-name";
    private static final String m = "icy-url";
    private static final String n = "icy-pub";
    private static final String o = "icy-metaint";

    static {
        IcyHeaders.CREATOR = new Parcelable.Creator() {
            public IcyHeaders a(Parcel parcel0) {
                return new IcyHeaders(parcel0);
            }

            public IcyHeaders[] b(int v) {
                return new IcyHeaders[v];
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

    public IcyHeaders(int v, @Nullable String s, @Nullable String s1, @Nullable String s2, boolean z, int v1) {
        Assertions.a(v1 == -1 || v1 > 0);
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = z;
        this.f = v1;
    }

    IcyHeaders(Parcel parcel0) {
        this.a = parcel0.readInt();
        this.b = parcel0.readString();
        this.c = parcel0.readString();
        this.d = parcel0.readString();
        this.e = Util.S1(parcel0);
        this.f = parcel0.readInt();
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public byte[] E0() {
        return null;
    }

    @Nullable
    public static IcyHeaders a(Map map0) {
        int v3;
        boolean z1;
        String s3;
        String s2;
        String s1;
        int v2;
        boolean z;
        int v1;
        List list0 = (List)map0.get("icy-br");
        int v = -1;
        if(list0 == null) {
            z = false;
            v2 = -1;
        }
        else {
            String s = (String)list0.get(0);
            try {
                v1 = -1;
                v1 = Integer.parseInt(s) * 1000;
                if(v1 <= 0) {
                    Log.n("IcyHeaders", "Invalid bitrate: " + s);
                    z = false;
                    v1 = -1;
                }
                else {
                    z = true;
                }
            }
            catch(NumberFormatException unused_ex) {
                Log.n("IcyHeaders", "Invalid bitrate header: " + s);
                v2 = v1;
                z = false;
                goto label_21;
            }
            v2 = v1;
        }
    label_21:
        List list1 = (List)map0.get("icy-genre");
        if(list1 == null) {
            s1 = null;
        }
        else {
            s1 = (String)list1.get(0);
            z = true;
        }
        List list2 = (List)map0.get("icy-name");
        if(list2 == null) {
            s2 = null;
        }
        else {
            s2 = (String)list2.get(0);
            z = true;
        }
        List list3 = (List)map0.get("icy-url");
        if(list3 == null) {
            s3 = null;
        }
        else {
            s3 = (String)list3.get(0);
            z = true;
        }
        List list4 = (List)map0.get("icy-pub");
        if(list4 == null) {
            z1 = false;
        }
        else {
            z1 = ((String)list4.get(0)).equals("1");
            z = true;
        }
        List list5 = (List)map0.get("icy-metaint");
        if(list5 != null) {
            String s4 = (String)list5.get(0);
            try {
                v3 = Integer.parseInt(s4);
                if(v3 > 0) {
                    return new IcyHeaders(v2, s1, s2, s3, z1, v3);
                }
                goto label_51;
            }
            catch(NumberFormatException unused_ex) {
                Log.n("IcyHeaders", "Invalid metadata interval: " + s4);
                return z ? new IcyHeaders(v2, s1, s2, s3, z1, v) : null;
            }
            return new IcyHeaders(v2, s1, s2, s3, z1, v3);
            try {
            label_51:
                Log.n("IcyHeaders", "Invalid metadata interval: " + s4);
                return z ? new IcyHeaders(v2, s1, s2, s3, z1, -1) : null;
            }
            catch(NumberFormatException unused_ex) {
                v = v3;
            }
            Log.n("IcyHeaders", "Invalid metadata interval: " + s4);
            return z ? new IcyHeaders(v2, s1, s2, s3, z1, v) : null;
        }
        return z ? new IcyHeaders(v2, s1, s2, s3, z1, -1) : null;
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
            return IcyHeaders.class == class0 && (this.a == ((IcyHeaders)object0).a && Util.g(this.b, ((IcyHeaders)object0).b) && Util.g(this.c, ((IcyHeaders)object0).c) && Util.g(this.d, ((IcyHeaders)object0).d) && this.e == ((IcyHeaders)object0).e && this.f == ((IcyHeaders)object0).f);
        }
        return false;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public Format h1() {
        return null;
    }

    @Override
    public int hashCode() {
        int v = (this.a + 0x20F) * 0x1F;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        String s = this.d;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((((v + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F + this.e) * 0x1F + this.f;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public void r3(Builder mediaMetadata$Builder0) {
        String s = this.c;
        if(s != null) {
            mediaMetadata$Builder0.n0(s);
        }
        String s1 = this.b;
        if(s1 != null) {
            mediaMetadata$Builder0.c0(s1);
        }
    }

    @Override
    public String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.a + ", metadataInterval=" + this.f;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
        Util.C2(parcel0, this.e);
        parcel0.writeInt(this.f);
    }
}

