package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public final class AudioCapabilitiesReceiver {
    @RequiresApi(23)
    static final class Api23 {
        @DoNotInline
        public static void a(Context context0, AudioDeviceCallback audioDeviceCallback0, Handler handler0) {
            ((AudioManager)Assertions.g(((AudioManager)context0.getSystemService("audio")))).registerAudioDeviceCallback(audioDeviceCallback0, handler0);
        }

        @DoNotInline
        public static void b(Context context0, AudioDeviceCallback audioDeviceCallback0) {
            ((AudioManager)Assertions.g(((AudioManager)context0.getSystemService("audio")))).unregisterAudioDeviceCallback(audioDeviceCallback0);
        }
    }

    @RequiresApi(23)
    final class AudioDeviceCallbackV23 extends AudioDeviceCallback {
        final AudioCapabilitiesReceiver a;

        private AudioDeviceCallbackV23() {
        }

        AudioDeviceCallbackV23(androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.1 audioCapabilitiesReceiver$10) {
        }

        @Override  // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] arr_audioDeviceInfo) {
            AudioCapabilities audioCapabilities0 = AudioCapabilities.h(AudioCapabilitiesReceiver.this.a, AudioCapabilitiesReceiver.this.i, AudioCapabilitiesReceiver.this.h);
            AudioCapabilitiesReceiver.this.f(audioCapabilities0);
        }

        @Override  // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] arr_audioDeviceInfo) {
            if(Util.z(arr_audioDeviceInfo, AudioCapabilitiesReceiver.this.h)) {
                AudioCapabilitiesReceiver.this.h = null;
            }
            AudioCapabilities audioCapabilities0 = AudioCapabilities.h(AudioCapabilitiesReceiver.this.a, AudioCapabilitiesReceiver.this.i, AudioCapabilitiesReceiver.this.h);
            AudioCapabilitiesReceiver.this.f(audioCapabilities0);
        }
    }

    final class ExternalSurroundSoundSettingObserver extends ContentObserver {
        private final ContentResolver a;
        private final Uri b;
        final AudioCapabilitiesReceiver c;

        public ExternalSurroundSoundSettingObserver(Handler handler0, ContentResolver contentResolver0, Uri uri0) {
            super(handler0);
            this.a = contentResolver0;
            this.b = uri0;
        }

        public void a() {
            this.a.registerContentObserver(this.b, false, this);
        }

        public void b() {
            this.a.unregisterContentObserver(this);
        }

        @Override  // android.database.ContentObserver
        public void onChange(boolean z) {
            AudioCapabilities audioCapabilities0 = AudioCapabilities.h(AudioCapabilitiesReceiver.this.a, AudioCapabilitiesReceiver.this.i, AudioCapabilitiesReceiver.this.h);
            AudioCapabilitiesReceiver.this.f(audioCapabilities0);
        }
    }

    final class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        final AudioCapabilitiesReceiver a;

        private HdmiAudioPlugBroadcastReceiver() {
        }

        HdmiAudioPlugBroadcastReceiver(androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.1 audioCapabilitiesReceiver$10) {
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            if(!this.isInitialStickyBroadcast()) {
                AudioCapabilities audioCapabilities0 = AudioCapabilities.g(context0, intent0, AudioCapabilitiesReceiver.this.i, AudioCapabilitiesReceiver.this.h);
                AudioCapabilitiesReceiver.this.f(audioCapabilities0);
            }
        }
    }

    public interface Listener {
        void a(AudioCapabilities arg1);
    }

    private final Context a;
    private final Listener b;
    private final Handler c;
    @Nullable
    private final AudioDeviceCallbackV23 d;
    @Nullable
    private final BroadcastReceiver e;
    @Nullable
    private final ExternalSurroundSoundSettingObserver f;
    @Nullable
    private AudioCapabilities g;
    @Nullable
    private AudioDeviceInfoApi23 h;
    private AudioAttributes i;
    private boolean j;

    @Deprecated
    public AudioCapabilitiesReceiver(Context context0, Listener audioCapabilitiesReceiver$Listener0) {
        this(context0, audioCapabilitiesReceiver$Listener0, AudioAttributes.g, null);
    }

    public AudioCapabilitiesReceiver(Context context0, Listener audioCapabilitiesReceiver$Listener0, AudioAttributes audioAttributes0, @Nullable AudioDeviceInfo audioDeviceInfo0) {
        this(context0, audioCapabilitiesReceiver$Listener0, audioAttributes0, (Util.a < 23 || audioDeviceInfo0 == null ? null : new AudioDeviceInfoApi23(audioDeviceInfo0)));
    }

    AudioCapabilitiesReceiver(Context context0, Listener audioCapabilitiesReceiver$Listener0, AudioAttributes audioAttributes0, @Nullable AudioDeviceInfoApi23 audioDeviceInfoApi230) {
        Context context1 = context0.getApplicationContext();
        this.a = context1;
        this.b = (Listener)Assertions.g(audioCapabilitiesReceiver$Listener0);
        this.i = audioAttributes0;
        this.h = audioDeviceInfoApi230;
        Handler handler0 = Util.J();
        this.c = handler0;
        ExternalSurroundSoundSettingObserver audioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver0 = null;
        this.d = Util.a < 23 ? null : new AudioDeviceCallbackV23(this, null);
        this.e = Util.a < 21 ? null : new HdmiAudioPlugBroadcastReceiver(this, null);
        Uri uri0 = AudioCapabilities.l();
        if(uri0 != null) {
            audioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver0 = new ExternalSurroundSoundSettingObserver(this, handler0, context1.getContentResolver(), uri0);
        }
        this.f = audioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver0;
    }

    private void f(AudioCapabilities audioCapabilities0) {
        if(this.j && !audioCapabilities0.equals(this.g)) {
            this.g = audioCapabilities0;
            this.b.a(audioCapabilities0);
        }
    }

    public AudioCapabilities g() {
        if(this.j) {
            return (AudioCapabilities)Assertions.g(this.g);
        }
        this.j = true;
        ExternalSurroundSoundSettingObserver audioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver0 = this.f;
        if(audioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver0 != null) {
            audioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver0.a();
        }
        if(Util.a >= 23) {
            AudioDeviceCallbackV23 audioCapabilitiesReceiver$AudioDeviceCallbackV230 = this.d;
            if(audioCapabilitiesReceiver$AudioDeviceCallbackV230 != null) {
                Api23.a(this.a, audioCapabilitiesReceiver$AudioDeviceCallbackV230, this.c);
            }
        }
        Intent intent0 = null;
        if(this.e != null) {
            IntentFilter intentFilter0 = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
            intent0 = this.a.registerReceiver(this.e, intentFilter0, null, this.c);
        }
        AudioCapabilities audioCapabilities0 = AudioCapabilities.g(this.a, intent0, this.i, this.h);
        this.g = audioCapabilities0;
        return audioCapabilities0;
    }

    public void h(AudioAttributes audioAttributes0) {
        this.i = audioAttributes0;
        this.f(AudioCapabilities.h(this.a, audioAttributes0, this.h));
    }

    @RequiresApi(23)
    public void i(@Nullable AudioDeviceInfo audioDeviceInfo0) {
        AudioDeviceInfoApi23 audioDeviceInfoApi230 = null;
        if(Util.g(audioDeviceInfo0, (this.h == null ? null : this.h.a))) {
            return;
        }
        if(audioDeviceInfo0 != null) {
            audioDeviceInfoApi230 = new AudioDeviceInfoApi23(audioDeviceInfo0);
        }
        this.h = audioDeviceInfoApi230;
        this.f(AudioCapabilities.h(this.a, this.i, audioDeviceInfoApi230));
    }

    public void j() {
        if(!this.j) {
            return;
        }
        this.g = null;
        if(Util.a >= 23) {
            AudioDeviceCallbackV23 audioCapabilitiesReceiver$AudioDeviceCallbackV230 = this.d;
            if(audioCapabilitiesReceiver$AudioDeviceCallbackV230 != null) {
                Api23.b(this.a, audioCapabilitiesReceiver$AudioDeviceCallbackV230);
            }
        }
        BroadcastReceiver broadcastReceiver0 = this.e;
        if(broadcastReceiver0 != null) {
            this.a.unregisterReceiver(broadcastReceiver0);
        }
        ExternalSurroundSoundSettingObserver audioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver0 = this.f;
        if(audioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver0 != null) {
            audioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver0.b();
        }
        this.j = false;
    }

    class androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.1 {
    }

}

