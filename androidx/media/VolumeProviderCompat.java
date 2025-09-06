package androidx.media;

import android.media.VolumeProvider;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class VolumeProviderCompat {
    @RequiresApi(21)
    static class Api21Impl {
        @DoNotInline
        static void a(VolumeProvider volumeProvider0, int v) {
            volumeProvider0.setCurrentVolume(v);
        }
    }

    public static abstract class Callback {
        public abstract void a(VolumeProviderCompat arg1);
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ControlType {
    }

    private final int a;
    private final int b;
    private final String c;
    private int d;
    private Callback e;
    private VolumeProvider f;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;

    public VolumeProviderCompat(int v, int v1, int v2) {
        this(v, v1, v2, null);
    }

    @RestrictTo({Scope.c})
    public VolumeProviderCompat(int v, int v1, int v2, @Nullable String s) {
        this.a = v;
        this.b = v1;
        this.d = v2;
        this.c = s;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    @Nullable
    @RestrictTo({Scope.c})
    public final String d() {
        return this.c;
    }

    public Object e() {
        if(this.f == null) {
            if(Build.VERSION.SDK_INT >= 30) {
                this.f = new VolumeProvider(this.a, this.b, this.d, this.c) {
                    final VolumeProviderCompat a;

                    @Override  // android.media.VolumeProvider
                    public void onAdjustVolume(int v) {
                    }

                    @Override  // android.media.VolumeProvider
                    public void onSetVolumeTo(int v) {
                    }
                };
                return this.f;
            }
            this.f = new VolumeProvider(this.a, this.b, this.d) {
                final VolumeProviderCompat a;

                @Override  // android.media.VolumeProvider
                public void onAdjustVolume(int v) {
                }

                @Override  // android.media.VolumeProvider
                public void onSetVolumeTo(int v) {
                }
            };
        }
        return this.f;
    }

    public void f(int v) {
    }

    public void g(int v) {
    }

    public void h(Callback volumeProviderCompat$Callback0) {
        this.e = volumeProviderCompat$Callback0;
    }

    public final void i(int v) {
        this.d = v;
        Api21Impl.a(((VolumeProvider)this.e()), v);
        Callback volumeProviderCompat$Callback0 = this.e;
        if(volumeProviderCompat$Callback0 != null) {
            volumeProviderCompat$Callback0.a(this);
        }
    }
}

