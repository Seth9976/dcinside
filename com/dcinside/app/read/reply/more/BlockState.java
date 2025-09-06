package com.dcinside.app.read.reply.more;

import O3.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.dcinside.app.realm.e;
import io.realm.F0;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@d
public final class BlockState implements Parcelable {
    @s0({"SMAP\nReplyMoreItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyMoreItem.kt\ncom/dcinside/app/read/reply/more/BlockState$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n120#2,3:117\n124#2:121\n1#3:120\n*S KotlinDebug\n*F\n+ 1 ReplyMoreItem.kt\ncom/dcinside/app/read/reply/more/BlockState$Companion\n*L\n79#1:117,3\n79#1:121\n79#1:120\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final BlockState a(@l String s, @l String s1, @l String s2, @l String s3) {
            BlockState blockState1;
            BlockState blockState0;
            e e0;
            L.p(s, "galleryId");
            L.p(s1, "userName");
            L.p(s2, "userIp");
            L.p(s3, "userId");
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                e0 = e.k.c(f00, s);
                if(e0 == null) {
                    blockState0 = new BlockState(false, false, false, 7, null);
                    goto label_9;
                }
                goto label_11;
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
        label_9:
            c.a(f00, null);
            return blockState0;
            try {
            label_11:
                blockState1 = new BlockState(e0.W5().contains(s1), e0.V5().contains(s2), e0.U5().contains(s3));
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            return blockState1;
        }
    }

    public static final class b implements Parcelable.Creator {
        @l
        public final BlockState a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            boolean z = false;
            boolean z1 = parcel0.readInt() != 0;
            boolean z2 = parcel0.readInt() != 0;
            if(parcel0.readInt() != 0) {
                z = true;
            }
            return new BlockState(z1, z2, z);
        }

        @l
        public final BlockState[] b(int v) {
            return new BlockState[v];
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
    public static final Parcelable.Creator CREATOR = null;
    private final boolean a;
    private final boolean b;
    private final boolean c;
    @l
    public static final a d = null;
    @l
    public static final String e = "block_name";
    @l
    public static final String f = "block_ip";
    @l
    public static final String g = "block_id";

    static {
        BlockState.d = new a(null);
        BlockState.CREATOR = new b();
    }

    public BlockState() {
        this(false, false, false, 7, null);
    }

    public BlockState(boolean z, boolean z1, boolean z2) {
        this.a = z;
        this.b = z1;
        this.c = z2;
    }

    public BlockState(boolean z, boolean z1, boolean z2, int v, w w0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        if((v & 4) != 0) {
            z2 = false;
        }
        this(z, z1, z2);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final BlockState e(boolean z, boolean z1, boolean z2) {
        return new BlockState(z, z1, z2);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlockState)) {
            return false;
        }
        if(this.a != ((BlockState)object0).a) {
            return false;
        }
        return this.b == ((BlockState)object0).b ? this.c == ((BlockState)object0).c : false;
    }

    public static BlockState f(BlockState blockState0, boolean z, boolean z1, boolean z2, int v, Object object0) {
        if((v & 1) != 0) {
            z = blockState0.a;
        }
        if((v & 2) != 0) {
            z1 = blockState0.b;
        }
        if((v & 4) != 0) {
            z2 = blockState0.c;
        }
        return blockState0.e(z, z1, z2);
    }

    public final boolean g() {
        return this.c;
    }

    public final boolean h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return (androidx.compose.foundation.c.a(this.a) * 0x1F + androidx.compose.foundation.c.a(this.b)) * 0x1F + androidx.compose.foundation.c.a(this.c);
    }

    public final boolean i() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "BlockState(isNameBlocked=" + this.a + ", isIpBlocked=" + this.b + ", isIdBlocked=" + this.c + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "out");
        parcel0.writeInt(((int)this.a));
        parcel0.writeInt(((int)this.b));
        parcel0.writeInt(((int)this.c));
    }
}

