package com.unity3d.ads.core.data.datasource;

import androidx.compose.animation.core.b;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class VolumeSettingsChange {
    public static final class MuteChange extends VolumeSettingsChange {
        private final boolean isMuted;

        public MuteChange(boolean z) {
            super(null);
            this.isMuted = z;
        }

        public final boolean component1() {
            return this.isMuted;
        }

        @l
        public final MuteChange copy(boolean z) {
            return new MuteChange(z);
        }

        public static MuteChange copy$default(MuteChange volumeSettingsChange$MuteChange0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = volumeSettingsChange$MuteChange0.isMuted;
            }
            return volumeSettingsChange$MuteChange0.copy(z);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof MuteChange ? this.isMuted == ((MuteChange)object0).isMuted : false;
        }

        @Override
        public int hashCode() {
            return this.isMuted ? 1 : 0;
        }

        public final boolean isMuted() {
            return this.isMuted;
        }

        @Override
        @l
        public String toString() {
            return "MuteChange(isMuted=" + this.isMuted + ')';
        }
    }

    public static final class VolumeChange extends VolumeSettingsChange {
        private final double volume;

        public VolumeChange(double f) {
            super(null);
            this.volume = f;
        }

        public final double component1() {
            return this.volume;
        }

        @l
        public final VolumeChange copy(double f) {
            return new VolumeChange(f);
        }

        public static VolumeChange copy$default(VolumeChange volumeSettingsChange$VolumeChange0, double f, int v, Object object0) {
            if((v & 1) != 0) {
                f = volumeSettingsChange$VolumeChange0.volume;
            }
            return volumeSettingsChange$VolumeChange0.copy(f);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof VolumeChange ? Double.compare(this.volume, ((VolumeChange)object0).volume) == 0 : false;
        }

        public final double getVolume() {
            return this.volume;
        }

        @Override
        public int hashCode() {
            return b.a(this.volume);
        }

        @Override
        @l
        public String toString() {
            return "VolumeChange(volume=" + this.volume + ')';
        }
    }

    private VolumeSettingsChange() {
    }

    public VolumeSettingsChange(w w0) {
    }
}

