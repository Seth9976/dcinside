package com.fsn.cauly.Y;

import android.app.KeyguardManager;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;

public class c0 extends RelativeLayout implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback, View.OnClickListener, a {
    class b implements Runnable {
        final c0 a;

        @Override
        public void run() {
            c0.this.f();
        }
    }

    static class c {
        static final int[] a;

        static {
            int[] arr_v = new int[h.values().length];
            c.a = arr_v;
            try {
                arr_v[h.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[h.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[h.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    class d extends v0 {
        final c0 s;

        @Override  // com.fsn.cauly.Y.v0
        public void c() {
        }
    }

    d a;
    t0 b;
    t0 c;
    RelativeLayout d;
    String e;
    MediaPlayer f;
    SurfaceView g;
    SurfaceHolder h;
    ProgressBar i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    int o;
    int p;
    int q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    h v;
    Handler w;
    WeakReference x;
    Runnable y;

    public c0(Context context0) {
        super(context0);
        this.n = false;
        this.t = false;
        this.u = false;
        this.v = h.a;
        this.w = new Handler();
        this.y = () -> {
            if(!c0.this.isShown()) {
                c0.this.w.postDelayed(c0.this.y, 150L);
                return;
            }
            c0.this.m();
            c0.this.g();
            c0.this.g.setVisibility(0);
            MediaPlayer mediaPlayer0 = c0.this.f;
            if(mediaPlayer0 != null) {
                mediaPlayer0.release();
            }
            MediaPlayer mediaPlayer1 = new MediaPlayer();
            c0.this.f = mediaPlayer1;
            mediaPlayer1.setOnErrorListener(c0.this);
            c0.this.f.setOnPreparedListener(c0.this);
            c0.this.f.setOnCompletionListener(c0.this);
            c0.this.f.setOnBufferingUpdateListener(c0.this);
            c0.this.f.setOnVideoSizeChangedListener(c0.this);
            c0.this.f.setOnInfoListener(c0.this);
            c0.this.f.setAudioStreamType(3);
            c0.this.f.setScreenOnWhilePlaying(true);
            c0.this.f.setDisplay(c0.this.g.getHolder());
            c0.this.f.reset();
            try {
                if(c0.this.e == null || !c0.this.e.startsWith(m0.d(c0.this.getContext()))) {
                    c0.this.f.setDataSource(c0.this.e);
                }
                else {
                    FileInputStream fileInputStream0 = new FileInputStream(new File(c0.this.e));
                    FileDescriptor fileDescriptor0 = fileInputStream0.getFD();
                    c0.this.f.setDataSource(fileDescriptor0);
                    fileInputStream0.close();
                }
                c0.this.f.prepareAsync();
            }
            catch(Throwable unused_ex) {
                c0.this.k();
                c0.this.d(-101, "Video Error : file is broken");
            }
            c0.this.a(c0.this.v);
        };
        d c0$d0 = new d(this);
        this.a = c0$d0;
        c0$d0.a(this);
        this.a.execute();
    }

    void a() {
        t0 t00 = this.c;
        if(t00 != null) {
            t00.cancel();
            this.c = null;
        }
        if(this.f != null) {
            boolean z = ((KeyguardManager)this.getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if(this.f.isPlaying() && z) {
                this.e();
            }
        }
        t0 t01 = new t0(50);
        this.c = t01;
        t01.a(this);
        this.c.execute();
    }

    public void a(h e0$h0) {
        int v = c.a[e0$h0.ordinal()];
        switch(v) {
            case 1: {
                if(((AudioManager)this.getContext().getSystemService("audio")).getRingerMode() == 2) {
                    this.t = true;
                    this.v = h.b;
                    return;
                }
                MediaPlayer mediaPlayer1 = this.f;
                if(mediaPlayer1 != null) {
                    mediaPlayer1.setVolume(0.0f, 0.0f);
                    this.t = false;
                    this.v = h.c;
                    return;
                }
                break;
            }
            case 2: {
                this.v = h.b;
                MediaPlayer mediaPlayer2 = this.f;
                if(mediaPlayer2 != null) {
                    mediaPlayer2.setVolume(1.0f, 1.0f);
                    this.t = true;
                    return;
                }
                break;
            }
            default: {
                if(v == 3) {
                    this.v = h.c;
                    MediaPlayer mediaPlayer0 = this.f;
                    if(mediaPlayer0 != null) {
                        mediaPlayer0.setVolume(0.0f, 0.0f);
                        this.t = false;
                    }
                }
            }
        }
    }

    @Override  // com.fsn.cauly.Y.s0$a
    public void a(s0 s00) {
        if(s00 == this.b) {
            this.p();
            this.n();
            return;
        }
        if(s00 == this.c) {
            this.a();
        }
    }

    public void a(String s) {
        this.e = s;
        this.l();
    }

    private void b(int v) {
        WeakReference weakReference0 = this.x;
        if(weakReference0 == null) {
            return;
        }
        com.fsn.cauly.Y.e0.d e0$d0 = (com.fsn.cauly.Y.e0.d)weakReference0.get();
        if(e0$d0 == null) {
            return;
        }
        e0$d0.a(v);
    }

    void c(int v, int v1) {
        WeakReference weakReference0 = this.x;
        if(weakReference0 == null) {
            return;
        }
        com.fsn.cauly.Y.e0.d e0$d0 = (com.fsn.cauly.Y.e0.d)weakReference0.get();
        if(e0$d0 == null) {
            return;
        }
        e0$d0.a(v, v1);
    }

    void d(int v, String s) {
        WeakReference weakReference0 = this.x;
        if(weakReference0 == null) {
            return;
        }
        com.fsn.cauly.Y.e0.d e0$d0 = (com.fsn.cauly.Y.e0.d)weakReference0.get();
        if(e0$d0 == null) {
            return;
        }
        e0$d0.a(v, s);
    }

    public void e() {
        if(this.f != null && this.f.isPlaying()) {
            this.f.pause();
        }
    }

    void e(g e0$g0) {
        WeakReference weakReference0 = this.x;
        if(weakReference0 == null) {
            return;
        }
        com.fsn.cauly.Y.e0.d e0$d0 = (com.fsn.cauly.Y.e0.d)weakReference0.get();
        if(e0$d0 == null) {
            return;
        }
        e0$d0.a(e0$g0);
    }

    // 检测为 Lambda 实现
    public void f() [...]

    void g() {
        this.j = false;
        this.k = false;
        this.r = false;
    }

    void h() {
        WeakReference weakReference0 = this.x;
        if(weakReference0 != null && !this.n) {
            com.fsn.cauly.Y.e0.d e0$d0 = (com.fsn.cauly.Y.e0.d)weakReference0.get();
            if(e0$d0 == null) {
                return;
            }
            e0$d0.d();
            this.n = true;
        }
    }

    public void i() {
        MediaPlayer mediaPlayer0 = this.f;
        if(mediaPlayer0 != null) {
            float f = ((float)mediaPlayer0.getVideoWidth()) / ((float)this.f.getVideoHeight());
            int v = com.fsn.cauly.blackdragoncore.utils.d.c(this.getContext());
            int v1 = com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = (RelativeLayout.LayoutParams)this.g.getLayoutParams();
            if(f > ((float)v) / ((float)v1)) {
                relativeLayout$LayoutParams0.width = v;
                relativeLayout$LayoutParams0.height = (int)(((float)v) / f);
            }
            else {
                relativeLayout$LayoutParams0.width = (int)(f * ((float)v1));
                relativeLayout$LayoutParams0.height = v1;
            }
            relativeLayout$LayoutParams0.addRule(13);
            this.g.setLayoutParams(relativeLayout$LayoutParams0);
        }
    }

    void j() {
        ProgressBar progressBar0 = this.i;
        if(progressBar0 != null) {
            progressBar0.setVisibility(8);
        }
    }

    void k() {
        t0 t00 = this.b;
        if(t00 != null) {
            t00.cancel();
            this.b = null;
        }
        MediaPlayer mediaPlayer0 = this.f;
        if(mediaPlayer0 != null) {
            try {
                mediaPlayer0.stop();
            }
            catch(Throwable unused_ex) {
            }
            this.f.release();
            this.f = null;
        }
        this.w.removeCallbacks(this.y);
        this.j();
    }

    void l() {
        class com.fsn.cauly.Y.c0.a implements Runnable {
            final c0 a;

            @Override
            public void run() {
                c0 c00 = c0.this;
                if(!c00.r) {
                    c00.surfaceCreated(c00.h);
                }
            }
        }

        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = com.fsn.cauly.blackdragoncore.utils.c.b();
        SurfaceView surfaceView0 = new SurfaceView(this.getContext().getApplicationContext());
        this.g = surfaceView0;
        surfaceView0.setLayoutParams(relativeLayout$LayoutParams0);
        SurfaceHolder surfaceHolder0 = this.g.getHolder();
        this.h = surfaceHolder0;
        surfaceHolder0.addCallback(this);
        this.h.setType(3);
        this.addView(this.g);
        new Handler().postDelayed(new com.fsn.cauly.Y.c0.a(this), 500L);
        RelativeLayout relativeLayout0 = new RelativeLayout(this.getContext());
        this.d = relativeLayout0;
        relativeLayout0.setBackgroundColor(0);
        this.d.setLayoutParams(relativeLayout$LayoutParams0);
        this.addView(this.d);
        this.m();
    }

    void m() {
        ProgressBar progressBar0 = this.i;
        if(progressBar0 == null) {
            this.i = new ProgressBar(this.getContext(), null, 0x101007A);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = com.fsn.cauly.blackdragoncore.utils.c.c();
            relativeLayout$LayoutParams0.addRule(13);
            this.i.setLayoutParams(relativeLayout$LayoutParams0);
            this.d.addView(this.i);
            return;
        }
        progressBar0.setVisibility(0);
    }

    void n() {
        t0 t00 = this.b;
        if(t00 != null) {
            t00.cancel();
        }
        t0 t01 = new t0(500);
        this.b = t01;
        t01.a(this);
        this.b.execute();
    }

    void o() {
        this.surfaceChanged(this.h, 0, this.g.getWidth(), this.g.getHeight());
        if(!this.s) {
            this.e(g.c);
            this.s = true;
        }
        if(this.f != null && !this.f.isPlaying()) {
            int v = this.q;
            if(v > 0) {
                this.f.seekTo(v);
            }
            this.f.start();
            this.p();
            this.n();
            this.h();
            this.a();
            this.j();
        }
    }

    @Override  // android.media.MediaPlayer$OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer0, int v) {
        if(!this.j) {
            return;
        }
        mediaPlayer0.getDuration();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
    }

    @Override  // android.media.MediaPlayer$OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer0) {
        if(this.j && this.k) {
            this.e(g.d);
        }
        MediaPlayer mediaPlayer1 = this.f;
        if(mediaPlayer1 != null && this.j) {
            mediaPlayer1.seekTo(0);
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        this.k();
        super.onDetachedFromWindow();
    }

    @Override  // android.media.MediaPlayer$OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer0, int v, int v1) {
        if(v == -38 && v1 == 0) {
            return false;
        }
        if(this.m) {
            return true;
        }
        this.m = true;
        this.k();
        if(v == 1 && v1 == 0x80000000) {
            this.d(-101, "Video Error : " + 1 + "(" + 0x80000000 + ")");
            return true;
        }
        this.d(-100, "Video Error : " + v + "(" + v1 + ")");
        return true;
    }

    @Override  // android.media.MediaPlayer$OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer0, int v, int v1) {
        if(v == 701) {
            this.m();
            return false;
        }
        this.j();
        return false;
    }

    @Override  // android.media.MediaPlayer$OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer0) {
        this.l = true;
        this.j = true;
        this.m = false;
        if(this.k) {
            this.o();
        }
    }

    @Override  // android.media.MediaPlayer$OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer0, int v, int v1) {
        if(v != 0 && v1 != 0) {
            this.k = true;
            this.o = v;
            this.p = v1;
            if(this.j) {
                this.o();
            }
            this.c(v, v1);
            return;
        }
        com.fsn.cauly.blackdragoncore.utils.g.a(com.fsn.cauly.blackdragoncore.utils.g.b.c, "invalid video width(" + v + ") or height(" + v1 + ")");
        this.k();
        this.d(-100, "Invalid Video Size");
    }

    void p() {
        this.b(this.f.getCurrentPosition());
    }

    public void setListener(com.fsn.cauly.Y.e0.d e0$d0) {
        this.x = new WeakReference(e0$d0);
    }

    @Override  // android.view.SurfaceHolder$Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
    }

    @Override  // android.view.SurfaceHolder$Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder0) {
        if(!this.r) {
            try {
                this.f();
                this.e(g.b);
                this.r = true;
            }
            catch(Exception unused_ex) {
            }
        }
    }

    @Override  // android.view.SurfaceHolder$Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
        if(this.j) {
            MediaPlayer mediaPlayer0 = this.f;
            if(mediaPlayer0 != null) {
                this.q = mediaPlayer0.getCurrentPosition();
            }
        }
        this.g();
        this.k();
    }
}

