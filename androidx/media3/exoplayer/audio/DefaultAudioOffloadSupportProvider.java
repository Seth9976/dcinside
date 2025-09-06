package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public final class DefaultAudioOffloadSupportProvider implements AudioOffloadSupportProvider {
    @RequiresApi(29)
    static final class Api29 {
        @DoNotInline
        public static AudioOffloadSupport a(AudioFormat audioFormat0, AudioAttributes audioAttributes0, boolean z) {
            return AudioManager.isOffloadedPlaybackSupported(audioFormat0, audioAttributes0) ? new Builder().e(true).g(z).d() : AudioOffloadSupport.d;
        }
    }

    @RequiresApi(0x1F)
    static final class Api31 {
        @DoNotInline
        public static AudioOffloadSupport a(AudioFormat audioFormat0, AudioAttributes audioAttributes0, boolean z) {
            int v = AudioManager.getPlaybackOffloadSupport(audioFormat0, audioAttributes0);
            if(v == 0) {
                return AudioOffloadSupport.d;
            }
            Builder audioOffloadSupport$Builder0 = new Builder();
            return Util.a <= 0x20 || v != 2 ? audioOffloadSupport$Builder0.e(true).f(false).g(z).d() : audioOffloadSupport$Builder0.e(true).f(true).g(z).d();
        }
    }

    @Nullable
    private final Context a;
    private Boolean b;
    private static final String c = "offloadVariableRateSupported";

    public DefaultAudioOffloadSupportProvider() {
        this(null);
    }

    public DefaultAudioOffloadSupportProvider(@Nullable Context context0) {
        this.a = context0;
    }

    @Override  // androidx.media3.exoplayer.audio.DefaultAudioSink$AudioOffloadSupportProvider
    public AudioOffloadSupport a(Format format0, androidx.media3.common.AudioAttributes audioAttributes0) {
        Assertions.g(format0);
        Assertions.g(audioAttributes0);
        int v = Util.a;
        if(v >= 29 && format0.C != -1) {
            boolean z = this.b(this.a);
            int v1 = MimeTypes.f(((String)Assertions.g(format0.n)), format0.j);
            if(v1 != 0 && v >= Util.X(v1)) {
                int v2 = Util.a0(format0.B);
                if(v2 == 0) {
                    return AudioOffloadSupport.d;
                }
                try {
                    AudioFormat audioFormat0 = Util.Z(format0.C, v2, v1);
                    return v < 0x1F ? Api29.a(audioFormat0, audioAttributes0.b().a, z) : Api31.a(audioFormat0, audioAttributes0.b().a, z);
                }
                catch(IllegalArgumentException unused_ex) {
                    return AudioOffloadSupport.d;
                }
            }
            return AudioOffloadSupport.d;
        }
        return AudioOffloadSupport.d;
    }

    private boolean b(@Nullable Context context0) {
        Boolean boolean0 = this.b;
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        if(context0 != null) {
            AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
            if(audioManager0 != null) {
                String s = audioManager0.getParameters("offloadVariableRateSupported");
                this.b = Boolean.valueOf(s != null && s.equals("offloadVariableRateSupported=1"));
                return this.b.booleanValue();
            }
            this.b = Boolean.FALSE;
            return false;
        }
        this.b = Boolean.FALSE;
        return false;
    }
}

