package androidx.media3.common;

import O1.a;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public final class DeviceInfo {
    public static final class Builder {
        private final int a;
        private int b;
        private int c;
        @Nullable
        private String d;

        public Builder(int v) {
            this.a = v;
        }

        public DeviceInfo e() {
            Assertions.a(this.b <= this.c);
            return new DeviceInfo(this, null);
        }

        @a
        public Builder f(@IntRange(from = 0L) int v) {
            this.c = v;
            return this;
        }

        @a
        public Builder g(@IntRange(from = 0L) int v) {
            this.b = v;
            return this;
        }

        @a
        public Builder h(@Nullable String s) {
            Assertions.a(this.a != 0 || s == null);
            this.d = s;
            return this;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface PlaybackType {
    }

    public final int a;
    @IntRange(from = 0L)
    public final int b;
    @IntRange(from = 0L)
    public final int c;
    @Nullable
    public final String d;
    public static final int e = 0;
    public static final int f = 1;
    public static final DeviceInfo g;
    private static final String h;
    private static final String i;
    private static final String j;
    private static final String k;

    static {
        DeviceInfo.g = new Builder(0).e();
        DeviceInfo.h = "0";
        DeviceInfo.i = "1";
        DeviceInfo.j = "2";
        DeviceInfo.k = "3";
    }

    @UnstableApi
    @Deprecated
    public DeviceInfo(int v, @IntRange(from = 0L) int v1, @IntRange(from = 0L) int v2) {
        this(new Builder(v).g(v1).f(v2));
    }

    private DeviceInfo(Builder deviceInfo$Builder0) {
        this.a = deviceInfo$Builder0.a;
        this.b = deviceInfo$Builder0.b;
        this.c = deviceInfo$Builder0.c;
        this.d = deviceInfo$Builder0.d;
    }

    DeviceInfo(Builder deviceInfo$Builder0, androidx.media3.common.DeviceInfo.1 deviceInfo$10) {
        this(deviceInfo$Builder0);
    }

    @UnstableApi
    public static DeviceInfo a(Bundle bundle0) {
        int v = bundle0.getInt(DeviceInfo.h, 0);
        int v1 = bundle0.getInt(DeviceInfo.i, 0);
        int v2 = bundle0.getInt(DeviceInfo.j, 0);
        String s = bundle0.getString(DeviceInfo.k);
        return new Builder(v).g(v1).f(v2).h(s).e();
    }

    @UnstableApi
    public Bundle b() {
        Bundle bundle0 = new Bundle();
        int v = this.a;
        if(v != 0) {
            bundle0.putInt(DeviceInfo.h, v);
        }
        int v1 = this.b;
        if(v1 != 0) {
            bundle0.putInt(DeviceInfo.i, v1);
        }
        int v2 = this.c;
        if(v2 != 0) {
            bundle0.putInt(DeviceInfo.j, v2);
        }
        String s = this.d;
        if(s != null) {
            bundle0.putString(DeviceInfo.k, s);
        }
        return bundle0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof DeviceInfo ? this.a == ((DeviceInfo)object0).a && this.b == ((DeviceInfo)object0).b && this.c == ((DeviceInfo)object0).c && Util.g(this.d, ((DeviceInfo)object0).d) : false;
    }

    @Override
    public int hashCode() {
        int v = (((this.a + 0x20F) * 0x1F + this.b) * 0x1F + this.c) * 0x1F;
        return this.d == null ? v : v + this.d.hashCode();
    }

    class androidx.media3.common.DeviceInfo.1 {
    }

}

