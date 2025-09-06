package androidx.media;

import android.annotation.SuppressLint;
import android.media.AudioAttributes.Builder;
import android.media.AudioAttributes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RequiresApi(21)
@RestrictTo({Scope.a})
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    @RequiresApi(21)
    static class Builder implements androidx.media.AudioAttributesImpl.Builder {
        final AudioAttributes.Builder a;

        Builder() {
            this.a = new AudioAttributes.Builder();
        }

        Builder(Object object0) {
            this.a = new AudioAttributes.Builder(((AudioAttributes)object0));
        }

        @Override  // androidx.media.AudioAttributesImpl$Builder
        @SuppressLint({"WrongConstant"})
        @NonNull
        public androidx.media.AudioAttributesImpl.Builder a(int v) {
            return this.g(v);
        }

        @Override  // androidx.media.AudioAttributesImpl$Builder
        @NonNull
        public androidx.media.AudioAttributesImpl.Builder b(int v) {
            return this.f(v);
        }

        @Override  // androidx.media.AudioAttributesImpl$Builder
        @NonNull
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.a.build());
        }

        @Override  // androidx.media.AudioAttributesImpl$Builder
        @NonNull
        public androidx.media.AudioAttributesImpl.Builder c(int v) {
            return this.d(v);
        }

        @NonNull
        public Builder d(int v) {
            this.a.setContentType(v);
            return this;
        }

        @NonNull
        public Builder e(int v) {
            this.a.setFlags(v);
            return this;
        }

        @NonNull
        public Builder f(int v) {
            this.a.setLegacyStreamType(v);
            return this;
        }

        @SuppressLint({"WrongConstant"})
        @NonNull
        public Builder g(int v) {
            if(v == 16) {
                v = 12;
            }
            this.a.setUsage(v);
            return this;
        }

        @Override  // androidx.media.AudioAttributesImpl$Builder
        @NonNull
        public androidx.media.AudioAttributesImpl.Builder setFlags(int v) {
            return this.e(v);
        }
    }

    @RestrictTo({Scope.a})
    public AudioAttributes a;
    @RestrictTo({Scope.a})
    public int b;

    @RestrictTo({Scope.a})
    public AudioAttributesImplApi21() {
        this.b = -1;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes0) {
        this(audioAttributes0, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes0, int v) {
        this.a = audioAttributes0;
        this.b = v;
    }

    @Override  // androidx.media.AudioAttributesImpl
    public int C0() {
        return this.a.getUsage();
    }

    @Override  // androidx.media.AudioAttributesImpl
    public int D0() {
        int v = this.b;
        return v == -1 ? AudioAttributesCompat.b(false, this.getFlags(), this.C0()) : v;
    }

    @Override  // androidx.media.AudioAttributesImpl
    public int E0() {
        return this.b;
    }

    @Override  // androidx.media.AudioAttributesImpl
    public int F0() {
        return AudioAttributesCompat.b(true, this.getFlags(), this.C0());
    }

    @Override  // androidx.media.AudioAttributesImpl
    @Nullable
    public Object d() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof AudioAttributesImplApi21 ? this.a.equals(((AudioAttributesImplApi21)object0).a) : false;
    }

    @Override  // androidx.media.AudioAttributesImpl
    public int getFlags() {
        return this.a.getFlags();
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    @NonNull
    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.a;
    }

    @Override  // androidx.media.AudioAttributesImpl
    public int x() {
        return this.a.getContentType();
    }
}

