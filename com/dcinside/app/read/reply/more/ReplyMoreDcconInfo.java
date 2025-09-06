package com.dcinside.app.read.reply.more;

import O3.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.compose.foundation.c;
import com.dcinside.app.dccon.b;
import io.realm.F0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;

@d
public final class ReplyMoreDcconInfo implements Parcelable {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final ReplyMoreDcconInfo a(@l F0 f00, @m b b0) {
            L.p(f00, "realm");
            if(b0 == null) {
                return new ReplyMoreDcconInfo(null, 0L, false, false, 15, null);
            }
            String s = b0.i();
            if(s != null) {
                Long long0 = v.d1(s);
                if(long0 != null) {
                    long0.longValue();
                }
            }
            return new ReplyMoreDcconInfo(null, 0L, false, false, 15, null);
        }
    }

    public static final class com.dcinside.app.read.reply.more.ReplyMoreDcconInfo.b implements Parcelable.Creator {
        @l
        public final ReplyMoreDcconInfo a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            String s = parcel0.readString();
            long v = parcel0.readLong();
            boolean z = true;
            boolean z1 = parcel0.readInt() != 0;
            if(parcel0.readInt() == 0) {
                z = false;
            }
            return new ReplyMoreDcconInfo(s, v, z1, z);
        }

        @l
        public final ReplyMoreDcconInfo[] b(int v) {
            return new ReplyMoreDcconInfo[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    @l
    public static final Parcelable.Creator CREATOR;
    @l
    private String a;
    private final long b;
    private boolean c;
    private boolean d;
    @l
    public static final a e;

    static {
        ReplyMoreDcconInfo.e = new a(null);
        ReplyMoreDcconInfo.CREATOR = new com.dcinside.app.read.reply.more.ReplyMoreDcconInfo.b();
    }

    public ReplyMoreDcconInfo() {
        this(null, 0L, false, false, 15, null);
    }

    public ReplyMoreDcconInfo(@l String s, long v, boolean z, boolean z1) {
        L.p(s, "dcconUrl");
        super();
        this.a = s;
        this.b = v;
        this.c = z;
        this.d = z1;
    }

    public ReplyMoreDcconInfo(String s, long v, boolean z, boolean z1, int v1, w w0) {
        if((v1 & 1) != 0) {
            s = "";
        }
        if((v1 & 2) != 0) {
            v = 0L;
        }
        this(s, v, ((v1 & 4) == 0 ? z : false), ((v1 & 8) == 0 ? z1 : false));
    }

    @l
    public final String a() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ReplyMoreDcconInfo)) {
            return false;
        }
        if(!L.g(this.a, ((ReplyMoreDcconInfo)object0).a)) {
            return false;
        }
        if(this.b != ((ReplyMoreDcconInfo)object0).b) {
            return false;
        }
        return this.c == ((ReplyMoreDcconInfo)object0).c ? this.d == ((ReplyMoreDcconInfo)object0).d : false;
    }

    @l
    public final ReplyMoreDcconInfo f(@l String s, long v, boolean z, boolean z1) {
        L.p(s, "dcconUrl");
        return new ReplyMoreDcconInfo(s, v, z, z1);
    }

    public static ReplyMoreDcconInfo g(ReplyMoreDcconInfo replyMoreDcconInfo0, String s, long v, boolean z, boolean z1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = replyMoreDcconInfo0.a;
        }
        if((v1 & 2) != 0) {
            v = replyMoreDcconInfo0.b;
        }
        if((v1 & 4) != 0) {
            z = replyMoreDcconInfo0.c;
        }
        if((v1 & 8) != 0) {
            z1 = replyMoreDcconInfo0.d;
        }
        return replyMoreDcconInfo0.f(s, v, z, z1);
    }

    public final long h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + c.a(this.c)) * 0x1F + c.a(this.d);
    }

    @l
    public final String i() {
        return this.a;
    }

    public final boolean l() {
        return this.c;
    }

    public final boolean m() {
        return this.d;
    }

    public final void o(boolean z) {
        this.c = z;
    }

    public final void q(@l String s) {
        L.p(s, "<set-?>");
        this.a = s;
    }

    public final void r(boolean z) {
        this.d = z;
    }

    @Override
    @l
    public String toString() {
        return "ReplyMoreDcconInfo(dcconUrl=" + this.a + ", dcconGroupIndex=" + this.b + ", isBlocked=" + this.c + ", isGroupBlocked=" + this.d + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "out");
        parcel0.writeString(this.a);
        parcel0.writeLong(this.b);
        parcel0.writeInt(((int)this.c));
        parcel0.writeInt(((int)this.d));
    }
}

