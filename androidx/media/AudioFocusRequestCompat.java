package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest.Builder;
import android.media.AudioFocusRequest;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;

public class AudioFocusRequestCompat {
    @RequiresApi(26)
    static class Api26Impl {
        @DoNotInline
        static AudioFocusRequest a(int v, AudioAttributes audioAttributes0, boolean z, AudioManager.OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener0, Handler handler0) {
            return new AudioFocusRequest.Builder(v).setAudioAttributes(audioAttributes0).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(audioManager$OnAudioFocusChangeListener0, handler0).build();
        }
    }

    public static final class Builder {
        private int a;
        private AudioManager.OnAudioFocusChangeListener b;
        private Handler c;
        private AudioAttributesCompat d;
        private boolean e;

        public Builder(int v) {
            this.d = AudioFocusRequestCompat.g;
            this.d(v);
        }

        public Builder(@NonNull AudioFocusRequestCompat audioFocusRequestCompat0) {
            this.d = AudioFocusRequestCompat.g;
            if(audioFocusRequestCompat0 == null) {
                throw new IllegalArgumentException("AudioFocusRequestCompat to copy must not be null");
            }
            this.a = audioFocusRequestCompat0.e();
            this.b = audioFocusRequestCompat0.f();
            this.c = audioFocusRequestCompat0.d();
            this.d = audioFocusRequestCompat0.b();
            this.e = audioFocusRequestCompat0.g();
        }

        public AudioFocusRequestCompat a() {
            if(this.b == null) {
                throw new IllegalStateException("Can\'t build an AudioFocusRequestCompat instance without a listener");
            }
            return new AudioFocusRequestCompat(this.a, this.b, this.c, this.d, this.e);
        }

        private static boolean b(int v) {
            return v == 1 || v == 2 || v == 3 || v == 4;
        }

        @NonNull
        public Builder c(@NonNull AudioAttributesCompat audioAttributesCompat0) {
            if(audioAttributesCompat0 == null) {
                throw new NullPointerException("Illegal null AudioAttributes");
            }
            this.d = audioAttributesCompat0;
            return this;
        }

        @NonNull
        public Builder d(int v) {
            if(!Builder.b(v)) {
                throw new IllegalArgumentException("Illegal audio focus gain type " + v);
            }
            this.a = v;
            return this;
        }

        @NonNull
        public Builder e(@NonNull AudioManager.OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener0) {
            return this.f(audioManager$OnAudioFocusChangeListener0, new Handler(Looper.getMainLooper()));
        }

        @NonNull
        public Builder f(@NonNull AudioManager.OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener0, @NonNull Handler handler0) {
            if(audioManager$OnAudioFocusChangeListener0 == null) {
                throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
            }
            if(handler0 == null) {
                throw new IllegalArgumentException("Handler must not be null");
            }
            this.b = audioManager$OnAudioFocusChangeListener0;
            this.c = handler0;
            return this;
        }

        @NonNull
        public Builder g(boolean z) {
            this.e = z;
            return this;
        }
    }

    static class OnAudioFocusChangeListenerHandlerCompat implements AudioManager.OnAudioFocusChangeListener, Handler.Callback {
        private final Handler a;
        private final AudioManager.OnAudioFocusChangeListener b;
        private static final int c = 0x2A74B2;

        OnAudioFocusChangeListenerHandlerCompat(@NonNull AudioManager.OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener0, @NonNull Handler handler0) {
            this.b = audioManager$OnAudioFocusChangeListener0;
            this.a = new Handler(handler0.getLooper(), this);
        }

        @Override  // android.os.Handler$Callback
        public boolean handleMessage(Message message0) {
            if(message0.what == 0x2A74B2) {
                this.b.onAudioFocusChange(message0.arg1);
                return true;
            }
            return false;
        }

        @Override  // android.media.AudioManager$OnAudioFocusChangeListener
        public void onAudioFocusChange(int v) {
            Message message0 = Message.obtain(this.a, 0x2A74B2, v, 0);
            this.a.sendMessage(message0);
        }
    }

    private final int a;
    private final AudioManager.OnAudioFocusChangeListener b;
    private final Handler c;
    private final AudioAttributesCompat d;
    private final boolean e;
    private final Object f;
    static final AudioAttributesCompat g;

    static {
        AudioFocusRequestCompat.g = new androidx.media.AudioAttributesCompat.Builder().e(1).a();
    }

    AudioFocusRequestCompat(int v, AudioManager.OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener0, Handler handler0, AudioAttributesCompat audioAttributesCompat0, boolean z) {
        this.a = v;
        this.c = handler0;
        this.d = audioAttributesCompat0;
        this.e = z;
        int v1 = Build.VERSION.SDK_INT;
        this.b = v1 >= 26 || handler0.getLooper() == Looper.getMainLooper() ? audioManager$OnAudioFocusChangeListener0 : new OnAudioFocusChangeListenerHandlerCompat(audioManager$OnAudioFocusChangeListener0, handler0);
        if(v1 >= 26) {
            this.f = Api26Impl.a(v, this.a(), z, this.b, handler0);
            return;
        }
        this.f = null;
    }

    @RequiresApi(21)
    AudioAttributes a() {
        return this.d == null ? null : ((AudioAttributes)this.d.c());
    }

    @NonNull
    public AudioAttributesCompat b() {
        return this.d;
    }

    @RequiresApi(26)
    AudioFocusRequest c() {
        return (AudioFocusRequest)this.f;
    }

    @NonNull
    public Handler d() {
        return this.c;
    }

    public int e() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof AudioFocusRequestCompat ? this.a == ((AudioFocusRequestCompat)object0).a && this.e == ((AudioFocusRequestCompat)object0).e && ObjectsCompat.a(this.b, ((AudioFocusRequestCompat)object0).b) && ObjectsCompat.a(this.c, ((AudioFocusRequestCompat)object0).c) && ObjectsCompat.a(this.d, ((AudioFocusRequestCompat)object0).d) : false;
    }

    @NonNull
    public AudioManager.OnAudioFocusChangeListener f() {
        return this.b;
    }

    public boolean g() {
        return this.e;
    }

    @Override
    public int hashCode() {
        return ObjectsCompat.b(new Object[]{this.a, this.b, this.c, this.d, Boolean.valueOf(this.e)});
    }
}

