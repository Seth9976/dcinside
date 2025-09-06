package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.z;
import com.google.common.collect.O2;
import com.google.common.primitives.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Tracks {
    public static final class Group {
        public final int a;
        private final TrackGroup b;
        private final boolean c;
        private final int[] d;
        private final boolean[] e;
        private static final String f;
        private static final String g;
        private static final String h;
        private static final String i;

        static {
            Group.f = "0";
            Group.g = "1";
            Group.h = "3";
            Group.i = "4";
        }

        @UnstableApi
        public Group(TrackGroup trackGroup0, boolean z, int[] arr_v, boolean[] arr_z) {
            this.a = trackGroup0.a;
            boolean z1 = false;
            Assertions.a(trackGroup0.a == arr_v.length && trackGroup0.a == arr_z.length);
            this.b = trackGroup0;
            if(z && trackGroup0.a > 1) {
                z1 = true;
            }
            this.c = z1;
            this.d = (int[])arr_v.clone();
            this.e = (boolean[])arr_z.clone();
        }

        @UnstableApi
        public Group a(String s) {
            return new Group(this.b.a(s), this.c, this.d, this.e);
        }

        @UnstableApi
        public static Group b(Bundle bundle0) {
            TrackGroup trackGroup0 = TrackGroup.b(((Bundle)Assertions.g(bundle0.getBundle(Group.f))));
            int[] arr_v = (int[])z.a(bundle0.getIntArray(Group.g), new int[trackGroup0.a]);
            boolean[] arr_z = (boolean[])z.a(bundle0.getBooleanArray(Group.h), new boolean[trackGroup0.a]);
            return new Group(trackGroup0, bundle0.getBoolean(Group.i, false), arr_v, arr_z);
        }

        public TrackGroup c() {
            return this.b;
        }

        public Format d(int v) {
            return this.b.c(v);
        }

        @UnstableApi
        public int e(int v) {
            return this.d[v];
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return Group.class == class0 && (this.c == ((Group)object0).c && this.b.equals(((Group)object0).b) && Arrays.equals(this.d, ((Group)object0).d) && Arrays.equals(this.e, ((Group)object0).e));
            }
            return false;
        }

        public int f() {
            return this.b.c;
        }

        public boolean g() {
            return this.c;
        }

        public boolean h() {
            return a.f(this.e, true);
        }

        @Override
        public int hashCode() {
            int v = Arrays.hashCode(this.d);
            int v1 = Arrays.hashCode(this.e);
            return ((this.b.hashCode() * 0x1F + this.c) * 0x1F + v) * 0x1F + v1;
        }

        public boolean i() {
            return this.j(false);
        }

        public boolean j(boolean z) {
            for(int v = 0; v < this.d.length; ++v) {
                if(this.m(v, z)) {
                    return true;
                }
            }
            return false;
        }

        public boolean k(int v) {
            return this.e[v];
        }

        public boolean l(int v) {
            return this.m(v, false);
        }

        public boolean m(int v, boolean z) {
            int v1 = this.d[v];
            return v1 == 4 || z && v1 == 3;
        }

        public Bundle n() {
            Bundle bundle0 = new Bundle();
            Bundle bundle1 = this.b.h();
            bundle0.putBundle(Group.f, bundle1);
            bundle0.putIntArray(Group.g, this.d);
            bundle0.putBooleanArray(Group.h, this.e);
            bundle0.putBoolean(Group.i, this.c);
            return bundle0;
        }
    }

    private final O2 a;
    public static final Tracks b;
    private static final String c;

    static {
        Tracks.b = new Tracks(O2.A());
        Tracks.c = "0";
    }

    @UnstableApi
    public Tracks(List list0) {
        this.a = O2.r(list0);
    }

    public boolean a(int v) {
        for(int v1 = 0; v1 < this.a.size(); ++v1) {
            if(((Group)this.a.get(v1)).f() == v) {
                return true;
            }
        }
        return false;
    }

    @UnstableApi
    public static Tracks b(Bundle bundle0) {
        ArrayList arrayList0 = bundle0.getParcelableArrayList(Tracks.c);
        return arrayList0 == null ? new Tracks(O2.A()) : new Tracks(BundleCollectionUtil.d(new N0(), arrayList0));
    }

    public O2 c() {
        return this.a;
    }

    public boolean d() {
        return this.a.isEmpty();
    }

    public boolean e(int v) {
        for(int v1 = 0; v1 < this.a.size(); ++v1) {
            Group tracks$Group0 = (Group)this.a.get(v1);
            if(tracks$Group0.h() && tracks$Group0.f() == v) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return Tracks.class == class0 ? this.a.equals(((Tracks)object0).a) : false;
        }
        return false;
    }

    public boolean f(int v) {
        return this.g(v, false);
    }

    public boolean g(int v, boolean z) {
        for(int v1 = 0; v1 < this.a.size(); ++v1) {
            if(((Group)this.a.get(v1)).f() == v && ((Group)this.a.get(v1)).j(z)) {
                return true;
            }
        }
        return false;
    }

    @UnstableApi
    @Deprecated
    public boolean h(int v) {
        return this.i(v, false);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    // 去混淆评级： 低(20)
    @UnstableApi
    @Deprecated
    public boolean i(int v, boolean z) {
        return !this.a(v) || this.g(v, z);
    }

    @UnstableApi
    public Bundle j() {
        Bundle bundle0 = new Bundle();
        M0 m00 = new M0();
        ArrayList arrayList0 = BundleCollectionUtil.i(this.a, m00);
        bundle0.putParcelableArrayList(Tracks.c, arrayList0);
        return bundle0;
    }
}

