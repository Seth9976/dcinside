package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RequiresApi(26)
@RestrictTo({Scope.a})
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {
    @RequiresApi(26)
    static class Builder extends androidx.media.AudioAttributesImplApi21.Builder {
        Builder() {
        }

        Builder(Object object0) {
            super(object0);
        }

        @Override  // androidx.media.AudioAttributesImplApi21$Builder
        @NonNull
        public androidx.media.AudioAttributesImpl.Builder a(int v) {
            return this.h(v);
        }

        @Override  // androidx.media.AudioAttributesImplApi21$Builder
        @NonNull
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi26(this.a.build());
        }

        @Override  // androidx.media.AudioAttributesImplApi21$Builder
        @NonNull
        public androidx.media.AudioAttributesImplApi21.Builder g(int v) {
            return this.h(v);
        }

        @NonNull
        public Builder h(int v) {
            this.a.setUsage(v);
            return this;
        }
    }

    @RestrictTo({Scope.a})
    public AudioAttributesImplApi26() {
    }

    AudioAttributesImplApi26(AudioAttributes audioAttributes0) {
        super(audioAttributes0, -1);
    }

    @Override  // androidx.media.AudioAttributesImplApi21
    public int F0() {
        return this.a.getVolumeControlStream();
    }
}

