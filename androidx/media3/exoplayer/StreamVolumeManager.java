package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;

final class StreamVolumeManager {
    public interface Listener {
        void C(int arg1);

        void F(int arg1, boolean arg2);
    }

    final class VolumeChangeReceiver extends BroadcastReceiver {
        final StreamVolumeManager a;

        private VolumeChangeReceiver() {
        }

        VolumeChangeReceiver(androidx.media3.exoplayer.StreamVolumeManager.1 streamVolumeManager$10) {
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            StreamVolumeManager.this.b.post(new b1(StreamVolumeManager.this));
        }
    }

    private final Context a;
    private final Handler b;
    private final Listener c;
    private final AudioManager d;
    @Nullable
    private VolumeChangeReceiver e;
    private int f;
    private int g;
    private boolean h;
    private static final String i = "StreamVolumeManager";
    private static final String j = "android.media.VOLUME_CHANGED_ACTION";

    public StreamVolumeManager(Context context0, Handler handler0, Listener streamVolumeManager$Listener0) {
        Context context1 = context0.getApplicationContext();
        this.a = context1;
        this.b = handler0;
        this.c = streamVolumeManager$Listener0;
        AudioManager audioManager0 = (AudioManager)Assertions.k(((AudioManager)context1.getSystemService("audio")));
        this.d = audioManager0;
        this.f = 3;
        this.g = StreamVolumeManager.h(audioManager0, 3);
        this.h = StreamVolumeManager.f(audioManager0, 3);
        VolumeChangeReceiver streamVolumeManager$VolumeChangeReceiver0 = new VolumeChangeReceiver(this, null);
        IntentFilter intentFilter0 = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        try {
            context1.registerReceiver(streamVolumeManager$VolumeChangeReceiver0, intentFilter0);
            this.e = streamVolumeManager$VolumeChangeReceiver0;
        }
        catch(RuntimeException runtimeException0) {
            Log.o("StreamVolumeManager", "Error registering stream volume receiver", runtimeException0);
        }
    }

    public void c(int v) {
        if(this.g <= this.e()) {
            return;
        }
        this.d.adjustStreamVolume(this.f, -1, v);
        this.o();
    }

    public int d() {
        return this.d.getStreamMaxVolume(this.f);
    }

    public int e() {
        return Util.a < 28 ? 0 : this.d.getStreamMinVolume(this.f);
    }

    private static boolean f(AudioManager audioManager0, int v) {
        return Util.a < 23 ? StreamVolumeManager.h(audioManager0, v) == 0 : audioManager0.isStreamMute(v);
    }

    public int g() {
        return this.g;
    }

    private static int h(AudioManager audioManager0, int v) {
        try {
            return audioManager0.getStreamVolume(v);
        }
        catch(RuntimeException runtimeException0) {
            Log.o("StreamVolumeManager", "Could not retrieve stream volume for stream type " + v, runtimeException0);
            return audioManager0.getStreamMaxVolume(v);
        }
    }

    public void i(int v) {
        if(this.g >= this.d()) {
            return;
        }
        this.d.adjustStreamVolume(this.f, 1, v);
        this.o();
    }

    public boolean j() {
        return this.h;
    }

    public void k() {
        VolumeChangeReceiver streamVolumeManager$VolumeChangeReceiver0 = this.e;
        if(streamVolumeManager$VolumeChangeReceiver0 != null) {
            try {
                this.a.unregisterReceiver(streamVolumeManager$VolumeChangeReceiver0);
            }
            catch(RuntimeException runtimeException0) {
                Log.o("StreamVolumeManager", "Error unregistering stream volume receiver", runtimeException0);
            }
            this.e = null;
        }
    }

    public void l(boolean z, int v) {
        if(Util.a >= 23) {
            this.d.adjustStreamVolume(this.f, (z ? -100 : 100), v);
        }
        else {
            this.d.setStreamMute(this.f, z);
        }
        this.o();
    }

    public void m(int v) {
        if(this.f == v) {
            return;
        }
        this.f = v;
        this.o();
        this.c.C(v);
    }

    public void n(int v, int v1) {
        if(v >= this.e() && v <= this.d()) {
            this.d.setStreamVolume(this.f, v, v1);
            this.o();
        }
    }

    private void o() {
        int v = StreamVolumeManager.h(this.d, this.f);
        boolean z = StreamVolumeManager.f(this.d, this.f);
        if(this.g != v || this.h != z) {
            this.g = v;
            this.h = z;
            this.c.F(v, z);
        }
    }

    class androidx.media3.exoplayer.StreamVolumeManager.1 {
    }

}

