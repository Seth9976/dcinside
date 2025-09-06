package com.bumptech.glide.load.engine;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class y {
    static final class a implements Handler.Callback {
        static final int a = 1;

        @Override  // android.os.Handler$Callback
        public boolean handleMessage(Message message0) {
            if(message0.what == 1) {
                ((v)message0.obj).recycle();
                return true;
            }
            return false;
        }
    }

    private boolean a;
    private final Handler b;

    y() {
        this.b = new Handler(Looper.getMainLooper(), new a());
    }

    void a(v v0, boolean z) {
        synchronized(this) {
            if(this.a || z) {
                this.b.obtainMessage(1, v0).sendToTarget();
            }
            else {
                this.a = true;
                v0.recycle();
                this.a = false;
            }
        }
    }
}

