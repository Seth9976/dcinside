package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioFocusRequest.Builder;
import android.media.AudioFocusRequest;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

final class AudioFocusManager {
    class AudioFocusListener implements AudioManager.OnAudioFocusChangeListener {
        private final Handler a;
        final AudioFocusManager b;

        public AudioFocusListener(Handler handler0) {
            this.a = handler0;
        }

        // 检测为 Lambda 实现
        private void b(int v) [...]

        @Override  // android.media.AudioManager$OnAudioFocusChangeListener
        public void onAudioFocusChange(int v) {
            j j0 = () -> AudioFocusManager.this.i(v);
            this.a.post(j0);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface PlayerCommand {
    }

    public interface PlayerControl {
        void G(float arg1);

        void H(int arg1);
    }

    private final AudioManager a;
    private final AudioFocusListener b;
    @Nullable
    private PlayerControl c;
    @Nullable
    private AudioAttributes d;
    private int e;
    private int f;
    private float g;
    private AudioFocusRequest h;
    private boolean i;
    public static final int j = -1;
    public static final int k = 0;
    public static final int l = 1;
    private static final int m = 0;
    private static final int n = 1;
    private static final int o = 2;
    private static final int p = 3;
    private static final int q = 4;
    private static final int r = 0;
    private static final int s = 1;
    private static final int t = 2;
    private static final int u = 3;
    private static final int v = 4;
    private static final String w = "AudioFocusManager";
    private static final float x = 0.2f;
    private static final float y = 1.0f;

    public AudioFocusManager(Context context0, Handler handler0, PlayerControl audioFocusManager$PlayerControl0) {
        this.g = 1.0f;
        this.a = (AudioManager)Assertions.g(((AudioManager)context0.getApplicationContext().getSystemService("audio")));
        this.c = audioFocusManager$PlayerControl0;
        this.b = new AudioFocusListener(this, handler0);
        this.e = 0;
    }

    private void a() {
        this.a.abandonAudioFocus(this.b);
    }

    private void b() {
        if(this.e != 0 && this.e != 1) {
            if(Util.a >= 26) {
                this.c();
                return;
            }
            this.a();
        }
    }

    @RequiresApi(26)
    private void c() {
        AudioFocusRequest audioFocusRequest0 = this.h;
        if(audioFocusRequest0 != null) {
            this.a.abandonAudioFocusRequest(audioFocusRequest0);
        }
    }

    private static int e(@Nullable AudioAttributes audioAttributes0) {
        if(audioAttributes0 == null) {
            return 0;
        }
        switch(audioAttributes0.c) {
            case 0: {
                Log.n("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            }
            case 3: {
                return 0;
            }
            case 2: 
            case 4: {
                return 2;
            }
            case 11: {
                return audioAttributes0.a == 1 ? 2 : 3;
            }
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 12: 
            case 13: {
                return 3;
            }
            case 1: 
            case 14: {
                return 1;
            }
            case 16: {
                return 4;
            }
            default: {
                Log.n("AudioFocusManager", "Unidentified audio usage: " + audioAttributes0.c);
                return 0;
            }
        }
    }

    private void f(int v) {
        PlayerControl audioFocusManager$PlayerControl0 = this.c;
        if(audioFocusManager$PlayerControl0 != null) {
            audioFocusManager$PlayerControl0.H(v);
        }
    }

    @VisibleForTesting
    AudioManager.OnAudioFocusChangeListener g() {
        return this.b;
    }

    public float h() {
        return this.g;
    }

    private void i(int v) {
        if(v != -3 && v != -2) {
            switch(v) {
                case -1: {
                    this.f(-1);
                    this.b();
                    this.o(1);
                    return;
                }
                case 1: {
                    this.o(2);
                    this.f(1);
                    return;
                }
                default: {
                    Log.n("AudioFocusManager", "Unknown focus change type: " + v);
                    return;
                }
            }
        }
        if(v != -2 && !this.r()) {
            this.o(4);
            return;
        }
        this.f(0);
        this.o(3);
    }

    public void j() {
        this.c = null;
        this.b();
        this.o(0);
    }

    private int k() {
        if(this.e == 2) {
            return 1;
        }
        if((Util.a < 26 ? this.l() : this.m()) == 1) {
            this.o(2);
            return 1;
        }
        this.o(1);
        return -1;
    }

    private int l() {
        int v = Util.G0(((AudioAttributes)Assertions.g(this.d)).c);
        return this.a.requestAudioFocus(this.b, v, this.f);
    }

    @RequiresApi(26)
    private int m() {
        AudioFocusRequest audioFocusRequest0 = this.h;
        if(audioFocusRequest0 == null || this.i) {
            AudioFocusRequest.Builder audioFocusRequest$Builder0 = audioFocusRequest0 == null ? g.a(this.f) : h.a(this.h);
            boolean z = this.r();
            this.h = audioFocusRequest$Builder0.setAudioAttributes(((AudioAttributes)Assertions.g(this.d)).b().a).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(this.b).build();
            this.i = false;
        }
        return this.a.requestAudioFocus(this.h);
    }

    public void n(@Nullable AudioAttributes audioAttributes0) {
        if(!Util.g(this.d, audioAttributes0)) {
            this.d = audioAttributes0;
            int v = AudioFocusManager.e(audioAttributes0);
            this.f = v;
            Assertions.b(v == 0 || v == 1, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    private void o(int v) {
        if(this.e == v) {
            return;
        }
        this.e = v;
        float f = v == 4 ? 0.2f : 1.0f;
        if(this.g == f) {
            return;
        }
        this.g = f;
        PlayerControl audioFocusManager$PlayerControl0 = this.c;
        if(audioFocusManager$PlayerControl0 != null) {
            audioFocusManager$PlayerControl0.G(f);
        }
    }

    private boolean p(int v) {
        return v != 1 && this.f == 1;
    }

    public int q(boolean z, int v) {
        if(!this.p(v)) {
            this.b();
            this.o(0);
            return 1;
        }
        if(z) {
            return this.k();
        }
        switch(this.e) {
            case 1: {
                return -1;
            }
            case 3: {
                return 0;
            }
            default: {
                return 1;
            }
        }
    }

    private boolean r() {
        return this.d != null && this.d.a == 1;
    }
}

