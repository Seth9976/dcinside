package androidx.work.impl.constraints;

import androidx.compose.foundation.c;
import y4.l;
import y4.m;

public final class NetworkState {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public NetworkState(boolean z, boolean z1, boolean z2, boolean z3) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = z3;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    @l
    public final NetworkState e(boolean z, boolean z1, boolean z2, boolean z3) {
        return new NetworkState(z, z1, z2, z3);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof NetworkState)) {
            return false;
        }
        if(this.a != ((NetworkState)object0).a) {
            return false;
        }
        if(this.b != ((NetworkState)object0).b) {
            return false;
        }
        return this.c == ((NetworkState)object0).c ? this.d == ((NetworkState)object0).d : false;
    }

    public static NetworkState f(NetworkState networkState0, boolean z, boolean z1, boolean z2, boolean z3, int v, Object object0) {
        if((v & 1) != 0) {
            z = networkState0.a;
        }
        if((v & 2) != 0) {
            z1 = networkState0.b;
        }
        if((v & 4) != 0) {
            z2 = networkState0.c;
        }
        if((v & 8) != 0) {
            z3 = networkState0.d;
        }
        return networkState0.e(z, z1, z2, z3);
    }

    public final boolean g() {
        return this.a;
    }

    public final boolean h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return ((c.a(this.a) * 0x1F + c.a(this.b)) * 0x1F + c.a(this.c)) * 0x1F + c.a(this.d);
    }

    public final boolean i() {
        return this.d;
    }

    public final boolean j() {
        return this.b;
    }

    @Override
    @l
    public String toString() {
        return "NetworkState(isConnected=" + this.a + ", isValidated=" + this.b + ", isMetered=" + this.c + ", isNotRoaming=" + this.d + ')';
    }
}

