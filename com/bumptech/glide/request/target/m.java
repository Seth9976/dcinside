package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.n;
import com.bumptech.glide.request.transition.f;

public final class m extends e {
    class a implements Handler.Callback {
        a() {
            super();
        }

        @Override  // android.os.Handler$Callback
        public boolean handleMessage(Message message0) {
            if(message0.what == 1) {
                ((m)message0.obj).a();
                return true;
            }
            return false;
        }
    }

    private final n d;
    private static final int e = 1;
    private static final Handler f;

    static {
        m.f = new Handler(Looper.getMainLooper(), new a());
    }

    private m(n n0, int v, int v1) {
        super(v, v1);
        this.d = n0;
    }

    @Override  // com.bumptech.glide.request.target.p
    public void B(@Nullable Drawable drawable0) {
    }

    @Override  // com.bumptech.glide.request.target.p
    public void C(@NonNull Object object0, @Nullable f f0) {
        com.bumptech.glide.request.e e0 = this.z();
        if(e0 != null && e0.e()) {
            m.f.obtainMessage(1, this).sendToTarget();
        }
    }

    void a() {
        this.d.q(this);
    }

    public static m b(n n0, int v, int v1) {
        return new m(n0, v, v1);
    }
}

