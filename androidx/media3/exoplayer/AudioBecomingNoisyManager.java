package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

final class AudioBecomingNoisyManager {
    final class AudioBecomingNoisyReceiver extends BroadcastReceiver implements Runnable {
        private final EventListener a;
        private final Handler b;
        final AudioBecomingNoisyManager c;

        public AudioBecomingNoisyReceiver(Handler handler0, EventListener audioBecomingNoisyManager$EventListener0) {
            this.b = handler0;
            this.a = audioBecomingNoisyManager$EventListener0;
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            if("android.media.AUDIO_BECOMING_NOISY".equals(intent0.getAction())) {
                this.b.post(this);
            }
        }

        @Override
        public void run() {
            if(AudioBecomingNoisyManager.this.c) {
                this.a.q();
            }
        }
    }

    public interface EventListener {
        void q();
    }

    private final Context a;
    private final AudioBecomingNoisyReceiver b;
    private boolean c;

    public AudioBecomingNoisyManager(Context context0, Handler handler0, EventListener audioBecomingNoisyManager$EventListener0) {
        this.a = context0.getApplicationContext();
        this.b = new AudioBecomingNoisyReceiver(this, handler0, audioBecomingNoisyManager$EventListener0);
    }

    public void b(boolean z) {
        if(z && !this.c) {
            IntentFilter intentFilter0 = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");
            this.a.registerReceiver(this.b, intentFilter0);
            this.c = true;
            return;
        }
        if(!z && this.c) {
            this.a.unregisterReceiver(this.b);
            this.c = false;
        }
    }
}

