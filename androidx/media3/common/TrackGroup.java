package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.O2;
import java.util.ArrayList;
import java.util.Arrays;

public final class TrackGroup {
    @UnstableApi
    public final int a;
    @UnstableApi
    public final String b;
    @UnstableApi
    public final int c;
    private final Format[] d;
    private int e;
    private static final String f = "TrackGroup";
    private static final String g;
    private static final String h;

    static {
        TrackGroup.g = "0";
        TrackGroup.h = "1";
    }

    @UnstableApi
    public TrackGroup(String s, Format[] arr_format) {
        Assertions.a(arr_format.length > 0);
        this.b = s;
        this.d = arr_format;
        this.a = arr_format.length;
        int v = MimeTypes.m(arr_format[0].n);
        if(v == -1) {
            v = MimeTypes.m(arr_format[0].m);
        }
        this.c = v;
        this.i();
    }

    @UnstableApi
    public TrackGroup(Format[] arr_format) {
        this("", arr_format);
    }

    @CheckResult
    @UnstableApi
    public TrackGroup a(String s) {
        return new TrackGroup(s, this.d);
    }

    @UnstableApi
    public static TrackGroup b(Bundle bundle0) {
        ArrayList arrayList0 = bundle0.getParcelableArrayList(TrackGroup.g);
        if(arrayList0 == null) {
            return new TrackGroup(bundle0.getString(TrackGroup.h, ""), ((Format[])O2.A().toArray(new Format[0])));
        }
        O2 o20 = BundleCollectionUtil.d(new J0(), arrayList0);
        return new TrackGroup(bundle0.getString(TrackGroup.h, ""), ((Format[])o20.toArray(new Format[0])));
    }

    @UnstableApi
    public Format c(int v) {
        return this.d[v];
    }

    @UnstableApi
    public int d(Format format0) {
        for(int v = 0; true; ++v) {
            Format[] arr_format = this.d;
            if(v >= arr_format.length) {
                break;
            }
            if(format0 == arr_format[v]) {
                return v;
            }
        }
        return -1;
    }

    private static void e(String s, @Nullable String s1, @Nullable String s2, int v) {
        Log.e("TrackGroup", "", new IllegalStateException("Different " + s + " combined in one TrackGroup: \'" + s1 + "\' (track 0) and \'" + s2 + "\' (track " + v + ")"));
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return TrackGroup.class == class0 && (this.b.equals(((TrackGroup)object0).b) && Arrays.equals(this.d, ((TrackGroup)object0).d));
        }
        return false;
    }

    // 去混淆评级： 低(20)
    private static String f(@Nullable String s) {
        return s != null && !s.equals("und") ? s : "";
    }

    private static int g(int v) {
        return v | 0x4000;
    }

    @UnstableApi
    public Bundle h() {
        Bundle bundle0 = new Bundle();
        ArrayList arrayList0 = new ArrayList(this.d.length);
        Format[] arr_format = this.d;
        for(int v = 0; v < arr_format.length; ++v) {
            arrayList0.add(arr_format[v].k(true));
        }
        bundle0.putParcelableArrayList(TrackGroup.g, arrayList0);
        bundle0.putString(TrackGroup.h, this.b);
        return bundle0;
    }

    @Override
    public int hashCode() {
        if(this.e == 0) {
            int v = Arrays.hashCode(this.d);
            this.e = (this.b.hashCode() + 0x20F) * 0x1F + v;
        }
        return this.e;
    }

    private void i() {
        String s = TrackGroup.f(this.d[0].d);
        int v = TrackGroup.g(this.d[0].f);
        for(int v1 = 1; true; ++v1) {
            Format[] arr_format = this.d;
            if(v1 >= arr_format.length) {
                break;
            }
            if(!s.equals(TrackGroup.f(arr_format[v1].d))) {
                TrackGroup.e("languages", this.d[0].d, this.d[v1].d, v1);
                return;
            }
            if(v != TrackGroup.g(this.d[v1].f)) {
                TrackGroup.e("role flags", Integer.toBinaryString(this.d[0].f), Integer.toBinaryString(this.d[v1].f), v1);
                return;
            }
        }
    }
}

