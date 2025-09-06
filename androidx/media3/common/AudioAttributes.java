package androidx.media3.common;

import O1.a;
import android.media.AudioAttributes.Builder;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

public final class AudioAttributes {
    @RequiresApi(29)
    static final class Api29 {
        @DoNotInline
        public static void a(AudioAttributes.Builder audioAttributes$Builder0, int v) {
            audioAttributes$Builder0.setAllowedCapturePolicy(v);
        }
    }

    @RequiresApi(0x20)
    static final class Api32 {
        @DoNotInline
        public static void a(AudioAttributes.Builder audioAttributes$Builder0, int v) {
            audioAttributes$Builder0.setSpatializationBehavior(v);
        }
    }

    @RequiresApi(21)
    public static final class AudioAttributesV21 {
        public final android.media.AudioAttributes a;

        private AudioAttributesV21(AudioAttributes audioAttributes0) {
            AudioAttributes.Builder audioAttributes$Builder0 = new AudioAttributes.Builder().setContentType(audioAttributes0.a).setFlags(audioAttributes0.b).setUsage(audioAttributes0.c);
            int v = Util.a;
            if(v >= 29) {
                Api29.a(audioAttributes$Builder0, audioAttributes0.d);
            }
            if(v >= 0x20) {
                Api32.a(audioAttributes$Builder0, audioAttributes0.e);
            }
            this.a = audioAttributes$Builder0.build();
        }

        AudioAttributesV21(AudioAttributes audioAttributes0, androidx.media3.common.AudioAttributes.1 audioAttributes$10) {
            this(audioAttributes0);
        }
    }

    public static final class Builder {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;

        public Builder() {
            this.a = 0;
            this.b = 0;
            this.c = 1;
            this.d = 1;
            this.e = 0;
        }

        public AudioAttributes a() {
            return new AudioAttributes(this.a, this.b, this.c, this.d, this.e, null);
        }

        @a
        public Builder b(int v) {
            this.d = v;
            return this;
        }

        @a
        public Builder c(int v) {
            this.a = v;
            return this;
        }

        @a
        public Builder d(int v) {
            this.b = v;
            return this;
        }

        @a
        public Builder e(int v) {
            this.e = v;
            return this;
        }

        @a
        public Builder f(int v) {
            this.c = v;
            return this;
        }
    }

    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    @Nullable
    private AudioAttributesV21 f;
    public static final AudioAttributes g;
    private static final String h;
    private static final String i;
    private static final String j;
    private static final String k;
    private static final String l;

    static {
        AudioAttributes.g = new Builder().a();
        AudioAttributes.h = "0";
        AudioAttributes.i = "1";
        AudioAttributes.j = "2";
        AudioAttributes.k = "3";
        AudioAttributes.l = "4";
    }

    private AudioAttributes(int v, int v1, int v2, int v3, int v4) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
    }

    AudioAttributes(int v, int v1, int v2, int v3, int v4, androidx.media3.common.AudioAttributes.1 audioAttributes$10) {
        this(v, v1, v2, v3, v4);
    }

    @UnstableApi
    public static AudioAttributes a(Bundle bundle0) {
        Builder audioAttributes$Builder0 = new Builder();
        String s = AudioAttributes.h;
        if(bundle0.containsKey(s)) {
            audioAttributes$Builder0.c(bundle0.getInt(s));
        }
        String s1 = AudioAttributes.i;
        if(bundle0.containsKey(s1)) {
            audioAttributes$Builder0.d(bundle0.getInt(s1));
        }
        String s2 = AudioAttributes.j;
        if(bundle0.containsKey(s2)) {
            audioAttributes$Builder0.f(bundle0.getInt(s2));
        }
        String s3 = AudioAttributes.k;
        if(bundle0.containsKey(s3)) {
            audioAttributes$Builder0.b(bundle0.getInt(s3));
        }
        String s4 = AudioAttributes.l;
        if(bundle0.containsKey(s4)) {
            audioAttributes$Builder0.e(bundle0.getInt(s4));
        }
        return audioAttributes$Builder0.a();
    }

    @RequiresApi(21)
    public AudioAttributesV21 b() {
        if(this.f == null) {
            this.f = new AudioAttributesV21(this, null);
        }
        return this.f;
    }

    @UnstableApi
    public Bundle c() {
        Bundle bundle0 = new Bundle();
        bundle0.putInt(AudioAttributes.h, this.a);
        bundle0.putInt(AudioAttributes.i, this.b);
        bundle0.putInt(AudioAttributes.j, this.c);
        bundle0.putInt(AudioAttributes.k, this.d);
        bundle0.putInt(AudioAttributes.l, this.e);
        return bundle0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return AudioAttributes.class == class0 && (this.a == ((AudioAttributes)object0).a && this.b == ((AudioAttributes)object0).b && this.c == ((AudioAttributes)object0).c && this.d == ((AudioAttributes)object0).d && this.e == ((AudioAttributes)object0).e);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((((this.a + 0x20F) * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e;
    }

    class androidx.media3.common.AudioAttributes.1 {
    }

}

