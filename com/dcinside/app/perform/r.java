package com.dcinside.app.perform;

import android.content.Context;
import android.media.AudioAttributes.Builder;
import android.media.AudioManager;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.Application;
import com.dcinside.app.util.kl;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.TWR;
import rx.g;
import rx.o;

public class r implements m {
    static final class a implements n {
        private static final a a;

        static {
            a.a = new a();
        }

        @Override  // com.dcinside.app.perform.n
        public Object a(@NonNull AppCompatActivity appCompatActivity0) {
            return this.c(appCompatActivity0);
        }

        public r c(@NonNull AppCompatActivity appCompatActivity0) {
            return new r();
        }

        @Override  // com.dcinside.app.perform.n
        @NonNull
        public Class type() {
            return r.class;
        }
    }

    public interface b {
        void b(boolean arg1, boolean arg2, int arg3, int arg4);
    }

    public static final class c implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
        private final WeakReference a;
        private boolean b;
        private MediaPlayer c;
        private b d;
        @Nullable
        private o e;
        @Nullable
        private o f;
        private final String g;
        private Runnable h;

        private c(r r0, String s) {
            this.e = null;
            this.f = null;
            this.h = () -> {
                if(this.d == null) {
                    return;
                }
                int v = 0;
                int v1 = 0;
                boolean z = false;
                if(this.m()) {
                    try {
                        z = true;
                        v = this.c.getCurrentPosition();
                        v1 = this.c.getDuration();
                    }
                    catch(Exception unused_ex) {
                    }
                }
                this.d.b(this.b, z, v, v1);
            };
            this.g = s;
            this.a = new WeakReference(r0);
            MediaPlayer mediaPlayer0 = new MediaPlayer();
            mediaPlayer0.setOnPreparedListener(this);
            mediaPlayer0.setOnCompletionListener(this);
            mediaPlayer0.setOnErrorListener(this);
            this.c = mediaPlayer0;
        }

        public static void d(int v) {
        }

        private boolean m() {
            try {
                if(this.c != null && this.c.isPlaying()) {
                    return true;
                }
            }
            catch(Exception unused_ex) {
            }
            return false;
        }

        // 去混淆评级： 低(20)
        private boolean n() {
            return this.b && !kl.a(new o[]{this.f});
        }

        // 检测为 Lambda 实现
        private void o() [...]

        @Override  // android.media.MediaPlayer$OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer0) {
            this.b = false;
            kl.b(new o[]{this.f});
            if(this.m()) {
                try {
                    this.c.stop();
                }
                catch(Exception unused_ex) {
                }
                try {
                    this.c.reset();
                }
                catch(Exception unused_ex) {
                }
            }
            this.v();
        }

        @Override  // android.media.MediaPlayer$OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer0, int v, int v1) {
            this.b = false;
            kl.b(new o[]{this.f});
            if(this.m()) {
                try {
                    this.c.stop();
                }
                catch(Exception unused_ex) {
                }
                try {
                    this.c.reset();
                }
                catch(Exception unused_ex) {
                }
            }
            this.v();
            return false;
        }

        @Override  // android.media.MediaPlayer$OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer0) {
            if(this.b && ((r)this.a.get()).c) {
                this.b = false;
                mediaPlayer0.start();
                this.v();
                if(!kl.a(new o[]{this.e})) {
                    return;
                }
                this.e = g.K2(0L, 200L, TimeUnit.MILLISECONDS).x5((Long long0) -> {
                    if(((r)this.a.get()).c && this.m()) {
                        this.v();
                        return;
                    }
                    kl.b(new o[]{this.e});
                });
            }
        }

        // 检测为 Lambda 实现
        private void p(Long long0) [...]

        private static void q(int v) {
        }

        // 检测为 Lambda 实现
        private void r(MediaPlayer mediaPlayer0) [...]

        private static c s(r r0, String s) {
            try {
                return new c(r0, s);
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
                return null;
            }
        }

        public final c t() {
            int v = 0;
            if(this.m() || this.n()) {
                this.b = false;
                kl.b(new o[]{this.f});
                try {
                    this.c.stop();
                }
                catch(Exception unused_ex) {
                }
                try {
                    this.c.reset();
                }
                catch(Exception unused_ex) {
                }
            }
            else {
                AudioManager audioManager0 = (AudioManager)Application.e().getSystemService("audio");
                if(audioManager0 != null) {
                    v = audioManager0.requestAudioFocus(new u(), 3, 1);
                }
                if(v == 1) {
                    this.u();
                }
            }
            this.v();
            return this;
        }

        private void u() {
            this.b = true;
            this.f = g.Q2(this.c).x5((MediaPlayer mediaPlayer0) -> {
                FileInputStream fileInputStream1;
                FileInputStream fileInputStream0;
                try {
                    try {
                        fileInputStream0 = null;
                        mediaPlayer0.stop();
                    }
                    catch(Exception exception0) {
                        try {
                            exception0.printStackTrace();
                        }
                        catch(Exception exception1) {
                            goto label_18;
                        }
                    }
                    try {
                        mediaPlayer0.reset();
                        goto label_9;
                    }
                    catch(Exception exception2) {
                        try {
                            exception2.printStackTrace();
                        label_9:
                            mediaPlayer0.setAudioAttributes(new AudioAttributes.Builder().build());
                            if(this.g.startsWith("/")) {
                                fileInputStream1 = new FileInputStream(this.g);
                                goto label_12;
                            }
                            else {
                                goto label_14;
                            }
                            goto label_19;
                        }
                        catch(Exception exception1) {
                            goto label_18;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    goto label_30;
                }
                try {
                label_12:
                    mediaPlayer0.setDataSource(fileInputStream1.getFD());
                    goto label_19;
                }
                catch(Exception exception1) {
                    goto label_24;
                }
                catch(Throwable throwable0) {
                    goto label_36;
                }
                try {
                label_14:
                    mediaPlayer0.setDataSource(Application.e(), Uri.parse(this.g));
                    fileInputStream1 = null;
                    goto label_19;
                }
                catch(Exception exception1) {
                label_18:
                    goto label_25;
                    try {
                    label_19:
                        mediaPlayer0.prepare();
                        if(fileInputStream1 != null) {
                            fileInputStream1.close();
                            return;
                        }
                        return;
                    }
                    catch(Exception exception1) {
                    }
                    catch(Throwable throwable0) {
                        goto label_36;
                    }
                label_24:
                    fileInputStream0 = fileInputStream1;
                    try {
                    label_25:
                        exception1.printStackTrace();
                        this.b = false;
                        this.v();
                        goto label_32;
                    }
                    catch(Throwable throwable0) {
                    }
                    goto label_30;
                }
                catch(Throwable throwable0) {
                label_30:
                    TWR.safeClose$NT(fileInputStream0, throwable0);
                    throw throwable0;
                }
            label_32:
                if(fileInputStream0 != null) {
                    try {
                        fileInputStream0.close();
                    }
                    catch(Exception unused_ex) {
                    }
                    return;
                label_36:
                    TWR.safeClose$NT(fileInputStream1, throwable0);
                    throw throwable0;
                }
            });
        }

        private void v() {
            r r0 = (r)this.a.get();
            if(r0 == null) {
                return;
            }
            r0.a.removeCallbacks(this.h);
            r0.a.post(this.h);
        }

        private void w(b r$b0) {
            this.d = r$b0;
            this.v();
        }

        public final c x() {
            if(this.m() || this.n()) {
                this.b = false;
                kl.b(new o[]{this.f});
                try {
                    this.c.stop();
                }
                catch(Exception unused_ex) {
                }
                try {
                    this.c.reset();
                }
                catch(Exception unused_ex) {
                }
            }
            this.v();
            return this;
        }
    }

    private final Handler a;
    private final HashMap b;
    private boolean c;

    public r() {
        this.a = new Handler(Looper.getMainLooper());
        this.b = new HashMap();
    }

    @Override  // com.dcinside.app.perform.m
    public void a(@Nullable Context context0) {
        this.c = false;
        this.h();
        this.b.clear();
    }

    @Override  // com.dcinside.app.perform.m
    public void b(@Nullable Context context0) {
        this.c = false;
        this.h();
        this.b.clear();
    }

    @Override  // com.dcinside.app.perform.m
    public void c(@Nullable Context context0) {
        this.c = false;
    }

    @Override  // com.dcinside.app.perform.m
    public void d(@Nullable Context context0) {
        this.c = true;
    }

    public static r g(AppCompatActivity appCompatActivity0) {
        a r$a0 = a.a;
        return (r)q.c.a(appCompatActivity0, r$a0);
    }

    private void h() {
        if(this.b.size() == 0) {
            return;
        }
        synchronized(this) {
            if(this.b.size() == 0) {
                return;
            }
            for(Object object0: this.b.values()) {
                c r$c0 = (c)object0;
                kl.b(new o[]{r$c0.e, r$c0.f});
                r$c0.b = false;
                if(r$c0.c != null) {
                    try {
                        r$c0.c.release();
                    }
                    catch(Exception unused_ex) {
                    }
                    r$c0.v();
                    r$c0.c = null;
                }
            }
            this.b.clear();
        }
    }

    @Nullable
    public c i(String s) {
        c r$c0 = null;
        if(m0.a.h(s)) {
            return null;
        }
        try {
            c r$c1 = (c)this.b.get(s);
            if(r$c1 != null) {
                return r$c1;
            }
            r$c0 = c.s(this, s);
            if(r$c0 != null) {
                this.b.put(s, r$c0);
                return r$c0;
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        return r$c0;
    }

    @Nullable
    public c j(String s, b r$b0) {
        c r$c0 = this.i(s);
        if(r$c0 != null) {
            r$c0.w(r$b0);
        }
        return r$c0;
    }
}

