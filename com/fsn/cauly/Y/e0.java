package com.fsn.cauly.Y;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Bitmap;
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
import android.widget.ImageButton;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;
import android.widget.Toast;
import com.fsn.cauly.blackdragoncore.utils.g.b;
import com.fsn.cauly.blackdragoncore.utils.m;
import java.lang.ref.WeakReference;

public class e0 extends RelativeLayout implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback, View.OnClickListener, SeekBar.OnSeekBarChangeListener, a {
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

    public interface d {
        void a(int arg1);

        void a(int arg1, int arg2);

        void a(int arg1, String arg2);

        void a(e arg1);

        void a(g arg1);

        void d();
    }

    public static enum e {
        Rewind,
        Play,
        Pause,
        Forward;

    }

    class f extends v0 {
        final e0 s;

        @Override  // com.fsn.cauly.Y.v0
        public void c() {
            e0.this.e = m.a(e0.this.getContext(), "control_play.png");
            e0.this.f = m.a(e0.this.getContext(), "control_pause.png");
            e0.this.g = m.a(e0.this.getContext(), "control_fastfw.png");
            e0.this.h = m.a(e0.this.getContext(), "control_rewind.png");
        }
    }

    public static enum g {
        Unknown,
        Ready,
        Start,
        End;

    }

    public static enum h {
        Default,
        Turnon,
        Turnoff;

    }

    boolean A;
    boolean B;
    h C;
    WeakReference D;
    f a;
    t0 b;
    t0 c;
    t0 d;
    Bitmap e;
    Bitmap f;
    Bitmap g;
    Bitmap h;
    ImageButton i;
    RelativeLayout j;
    RelativeLayout k;
    String l;
    MediaPlayer m;
    SurfaceView n;
    SurfaceHolder o;
    SeekBar p;
    ProgressBar q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;
    int w;
    int x;
    int y;
    boolean z;

    public e0(Context context0) {
        super(context0);
        this.v = false;
        this.B = false;
        this.C = h.a;
    }

    void a() {
        MediaPlayer mediaPlayer0 = this.m;
        if(mediaPlayer0 == null) {
            return;
        }
        int v = mediaPlayer0.getCurrentPosition() + 15000;
        if(this.m.getDuration() < v) {
            v = this.m.getDuration();
        }
        this.m.seekTo(v);
        this.h(3000);
        this.e(e.d);
    }

    public void a(h e0$h0) {
        int v = c.a[e0$h0.ordinal()];
        switch(v) {
            case 1: {
                if(((AudioManager)this.getContext().getSystemService("audio")).getRingerMode() == 2) {
                    this.B = true;
                    this.C = h.b;
                    return;
                }
                MediaPlayer mediaPlayer1 = this.m;
                if(mediaPlayer1 != null) {
                    mediaPlayer1.setVolume(0.0f, 0.0f);
                    this.B = false;
                    this.C = h.c;
                    return;
                }
                break;
            }
            case 2: {
                this.C = h.b;
                MediaPlayer mediaPlayer2 = this.m;
                if(mediaPlayer2 != null) {
                    mediaPlayer2.setVolume(1.0f, 1.0f);
                    this.B = true;
                    return;
                }
                break;
            }
            default: {
                if(v == 3) {
                    this.C = h.c;
                    MediaPlayer mediaPlayer0 = this.m;
                    if(mediaPlayer0 != null) {
                        mediaPlayer0.setVolume(0.0f, 0.0f);
                        this.B = false;
                    }
                }
            }
        }
    }

    @Override  // com.fsn.cauly.Y.s0$a
    public void a(s0 s00) {
        if(s00 == this.c) {
            this.a(false);
            return;
        }
        if(s00 == this.b) {
            this.y();
            this.w();
            return;
        }
        if(s00 == this.d) {
            this.o();
            return;
        }
        this.v();
    }

    public void a(String s) {
        this.l = s;
        f e0$f0 = new f(this);
        this.a = e0$f0;
        e0$f0.a(this);
        this.a.execute();
    }

    public void a(boolean z) {
        if(z) {
            this.k.setVisibility(0);
            this.t = true;
            this.h(3000);
            return;
        }
        this.k.setVisibility(4);
        this.k.bringToFront();
        this.t = false;
    }

    private void b(int v) {
        WeakReference weakReference0 = this.D;
        if(weakReference0 == null) {
            return;
        }
        d e0$d0 = (d)weakReference0.get();
        if(e0$d0 == null) {
            return;
        }
        e0$d0.a(v);
    }

    void c(int v, int v1) {
        WeakReference weakReference0 = this.D;
        if(weakReference0 == null) {
            return;
        }
        d e0$d0 = (d)weakReference0.get();
        if(e0$d0 == null) {
            return;
        }
        e0$d0.a(v, v1);
    }

    void d(int v, String s) {
        WeakReference weakReference0 = this.D;
        if(weakReference0 == null) {
            return;
        }
        d e0$d0 = (d)weakReference0.get();
        if(e0$d0 == null) {
            return;
        }
        e0$d0.a(v, s);
    }

    void e(e e0$e0) {
        WeakReference weakReference0 = this.D;
        if(weakReference0 == null) {
            return;
        }
        d e0$d0 = (d)weakReference0.get();
        if(e0$d0 == null) {
            return;
        }
        e0$d0.a(e0$e0);
    }

    void f(g e0$g0) {
        WeakReference weakReference0 = this.D;
        if(weakReference0 == null) {
            return;
        }
        d e0$d0 = (d)weakReference0.get();
        if(e0$d0 == null) {
            return;
        }
        e0$d0.a(e0$g0);
    }

    void g() {
        MediaPlayer mediaPlayer0 = this.m;
        if(mediaPlayer0 == null) {
            this.l();
            this.i.setImageBitmap(this.f);
            return;
        }
        if(mediaPlayer0.isPlaying()) {
            this.k();
            this.e(e.c);
            return;
        }
        this.n();
        this.e(e.b);
    }

    void h(int v) {
        t0 t00 = this.c;
        if(t00 != null) {
            t00.cancel();
        }
        t0 t01 = new t0(v);
        this.c = t01;
        t01.a(this);
        this.c.execute();
    }

    public boolean i() {
        return this.B;
    }

    public boolean j() {
        return this.m == null ? false : this.m.isPlaying();
    }

    public void k() {
        if(this.m != null && this.m.isPlaying()) {
            this.i.setImageBitmap(this.e);
            this.m.pause();
            this.h(3000);
        }
    }

    public void l() {
        ProgressBar progressBar0 = this.q;
        if(progressBar0 != null) {
            progressBar0.setVisibility(0);
        }
        this.s();
        this.n.setVisibility(0);
        this.n.setBackgroundColor(0xFF000000);
        MediaPlayer mediaPlayer0 = this.m;
        if(mediaPlayer0 != null) {
            mediaPlayer0.release();
        }
        MediaPlayer mediaPlayer1 = new MediaPlayer();
        this.m = mediaPlayer1;
        mediaPlayer1.setOnErrorListener(this);
        this.m.setOnPreparedListener(this);
        this.m.setOnCompletionListener(this);
        this.m.setOnBufferingUpdateListener(this);
        this.m.setOnVideoSizeChangedListener(this);
        this.m.setOnInfoListener(this);
        this.m.setAudioStreamType(3);
        this.m.setScreenOnWhilePlaying(true);
        this.m.setDisplay(this.o);
        this.m.reset();
        try {
            this.m.setDataSource(this.l);
            this.m.prepareAsync();
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
        this.a(true);
        this.a(this.C);
    }

    void m() {
        MediaPlayer mediaPlayer0 = this.m;
        if(mediaPlayer0 == null) {
            return;
        }
        int v = mediaPlayer0.getCurrentPosition() - 5000;
        if(v < 0) {
            v = 0;
        }
        this.m.seekTo(v);
        this.h(3000);
        this.e(e.a);
    }

    public void n() {
        if(this.m != null && !this.m.isPlaying()) {
            this.i.setImageBitmap(this.f);
            this.m.start();
            this.h(3000);
        }
    }

    void o() {
        t0 t00 = this.d;
        if(t00 != null) {
            t00.cancel();
            this.d = null;
        }
        if(this.m != null) {
            boolean z = ((KeyguardManager)this.getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if(this.m.isPlaying() && z) {
                this.k();
            }
        }
        t0 t01 = new t0(50);
        this.d = t01;
        t01.a(this);
        this.d.execute();
    }

    @Override  // android.media.MediaPlayer$OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer0, int v) {
        if(!this.r) {
            return;
        }
        int v1 = mediaPlayer0.getDuration();
        this.p.setSecondaryProgress(((int)(((float)(v1 * v)) / 100.0f)));
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(!this.t) {
            return;
        }
        switch(view0.getId()) {
            case 1: {
                this.m();
                return;
            }
            case 2: {
                this.g();
                return;
            }
            case 3: {
                this.a();
            }
        }
    }

    @Override  // android.media.MediaPlayer$OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer0) {
        if(this.r && this.s) {
            this.f(g.d);
        }
        this.i.setImageBitmap(this.e);
        MediaPlayer mediaPlayer1 = this.m;
        if(mediaPlayer1 != null && this.r) {
            mediaPlayer1.seekTo(0);
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        this.u();
        super.onDetachedFromWindow();
    }

    @Override  // android.media.MediaPlayer$OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer0, int v, int v1) {
        if(v == -38 && v1 == 0) {
            return false;
        }
        if(this.u) {
            return true;
        }
        this.u = true;
        Toast.makeText(this.getContext(), "동영상을 재생할 수 없습니다.", 0).show();
        this.u();
        this.d(-100, "Video Error : " + v + "(" + v1 + ")");
        return true;
    }

    @Override  // android.media.MediaPlayer$OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer0, int v, int v1) {
        if(v == 701) {
            ProgressBar progressBar0 = this.q;
            if(progressBar0 == null) {
                this.q = new ProgressBar(this.getContext(), null, 0x101007A);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = com.fsn.cauly.blackdragoncore.utils.c.c();
                relativeLayout$LayoutParams0.addRule(13);
                this.q.setLayoutParams(relativeLayout$LayoutParams0);
                this.j.addView(this.q);
                return false;
            }
            progressBar0.setVisibility(0);
        }
        return false;
    }

    @Override  // android.media.MediaPlayer$OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer0) {
        this.p.setMax(mediaPlayer0.getDuration());
        this.t = true;
        this.r = true;
        this.u = false;
        if(this.s) {
            this.x();
        }
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
        MediaPlayer mediaPlayer0 = this.m;
        if(mediaPlayer0 == null) {
            return;
        }
        if(z) {
            mediaPlayer0.seekTo(v);
            return;
        }
        if(v > 0) {
            this.n.setBackgroundColor(0);
            ProgressBar progressBar0 = this.q;
            if(progressBar0 != null) {
                progressBar0.setVisibility(4);
            }
        }
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar0) {
        MediaPlayer mediaPlayer0 = this.m;
        if(mediaPlayer0 == null) {
            return;
        }
        if(mediaPlayer0.isPlaying()) {
            this.m.pause();
            this.i.setImageBitmap(this.e);
        }
        t0 t00 = this.c;
        if(t00 != null) {
            t00.cancel();
            this.c = null;
        }
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar0) {
        MediaPlayer mediaPlayer0 = this.m;
        if(mediaPlayer0 == null) {
            return;
        }
        if(!mediaPlayer0.isPlaying()) {
            this.m.start();
            this.i.setImageBitmap(this.f);
        }
        this.m.seekTo(this.p.getProgress());
        this.h(3000);
    }

    @Override  // android.media.MediaPlayer$OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer0, int v, int v1) {
        if(v != 0 && v1 != 0) {
            this.s = true;
            this.w = v;
            this.x = v1;
            if(this.r) {
                this.x();
            }
            this.c(v, v1);
            return;
        }
        com.fsn.cauly.blackdragoncore.utils.g.a(b.c, "invalid video width(" + v + ") or height(" + v1 + ")");
        Toast.makeText(this.getContext(), "동영상을 재생할 수 없습니다.", 0).show();
        this.u();
        this.d(-100, "Invalid Video Size");
    }

    LinearLayout p() {
        LinearLayout linearLayout0 = new LinearLayout(this.getContext());
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        LinearLayout linearLayout1 = com.fsn.cauly.blackdragoncore.utils.c.a(this.getContext(), true, linearLayout$LayoutParams0);
        linearLayout1.setGravity(5);
        LinearLayout linearLayout2 = com.fsn.cauly.blackdragoncore.utils.c.a(this.getContext(), true, linearLayout$LayoutParams0);
        linearLayout2.setGravity(17);
        LinearLayout linearLayout3 = com.fsn.cauly.blackdragoncore.utils.c.a(this.getContext(), true, linearLayout$LayoutParams0);
        linearLayout3.setGravity(3);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
        ImageButton imageButton0 = com.fsn.cauly.blackdragoncore.utils.c.a(this.getContext(), this.h, linearLayout$LayoutParams1);
        imageButton0.setId(1);
        imageButton0.setOnClickListener(this);
        linearLayout1.addView(imageButton0);
        linearLayout0.addView(linearLayout1);
        ImageButton imageButton1 = com.fsn.cauly.blackdragoncore.utils.c.a(this.getContext(), this.e, linearLayout$LayoutParams1);
        this.i = imageButton1;
        imageButton1.setId(2);
        this.i.setOnClickListener(this);
        linearLayout2.addView(this.i);
        linearLayout0.addView(linearLayout2);
        ImageButton imageButton2 = com.fsn.cauly.blackdragoncore.utils.c.a(this.getContext(), this.g, linearLayout$LayoutParams1);
        imageButton2.setId(3);
        imageButton2.setOnClickListener(this);
        linearLayout3.addView(imageButton2);
        linearLayout0.addView(linearLayout3);
        return linearLayout0;
    }

    LinearLayout q() {
        LinearLayout linearLayout0 = new LinearLayout(this.getContext());
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = com.fsn.cauly.blackdragoncore.utils.c.a(-1, -2);
        linearLayout$LayoutParams0.setMargins(com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), 33.0f), 0, com.fsn.cauly.blackdragoncore.utils.d.a(this.getContext(), 50.0f), 0);
        linearLayout0.setLayoutParams(linearLayout$LayoutParams0);
        this.p = new SeekBar(this.getContext());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
        this.p.setLayoutParams(relativeLayout$LayoutParams0);
        this.p.setBackgroundColor(0);
        this.p.setOnSeekBarChangeListener(this);
        this.p.setProgress(0);
        linearLayout0.addView(this.p);
        return linearLayout0;
    }

    public void r() {
        f e0$f0 = this.a;
        if(e0$f0 != null) {
            e0$f0.cancel();
            this.a = null;
        }
        t0 t00 = this.b;
        if(t00 != null) {
            t00.cancel();
            this.b = null;
        }
        t0 t01 = this.c;
        if(t01 != null) {
            t01.cancel();
            this.c = null;
        }
        t0 t02 = this.d;
        if(t02 != null) {
            t02.cancel();
            this.d = null;
        }
        this.u();
    }

    void s() {
        this.r = false;
        this.s = false;
    }

    public void setListener(d e0$d0) {
        this.D = new WeakReference(e0$d0);
    }

    @Override  // android.view.SurfaceHolder$Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
    }

    @Override  // android.view.SurfaceHolder$Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder0) {
        if(!this.z) {
            this.f(g.b);
            this.z = true;
        }
        try {
            this.l();
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }

    @Override  // android.view.SurfaceHolder$Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
        if(this.r) {
            MediaPlayer mediaPlayer0 = this.m;
            if(mediaPlayer0 != null) {
                this.y = mediaPlayer0.getCurrentPosition();
            }
        }
        this.s();
        this.n.setBackgroundColor(0xFF000000);
        this.u();
    }

    void t() {
        WeakReference weakReference0 = this.D;
        if(weakReference0 != null && !this.v) {
            d e0$d0 = (d)weakReference0.get();
            if(e0$d0 == null) {
                return;
            }
            e0$d0.d();
            this.v = true;
        }
    }

    void u() {
        t0 t00 = this.b;
        if(t00 != null) {
            t00.cancel();
            this.b = null;
        }
        MediaPlayer mediaPlayer0 = this.m;
        if(mediaPlayer0 != null) {
            try {
                mediaPlayer0.stop();
            }
            catch(Throwable unused_ex) {
            }
            this.m.release();
            this.m = null;
        }
        ProgressBar progressBar0 = this.q;
        if(progressBar0 != null) {
            progressBar0.setVisibility(4);
        }
    }

    void v() {
        class com.fsn.cauly.Y.e0.a implements Runnable {
            final e0 a;

            @Override
            public void run() {
                e0 e00 = e0.this;
                if(!e00.z) {
                    e00.surfaceCreated(e00.o);
                }
            }
        }


        class com.fsn.cauly.Y.e0.b implements View.OnClickListener {
            final e0 a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                e0 e00 = e0.this;
                if(e00.r && e00.s || e00.u) {
                    if(!e00.t) {
                        e00.a(true);
                        return;
                    }
                    e00.a(false);
                }
            }
        }

        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = com.fsn.cauly.blackdragoncore.utils.c.b();
        SurfaceView surfaceView0 = new SurfaceView(this.getContext().getApplicationContext());
        this.n = surfaceView0;
        surfaceView0.setLayoutParams(relativeLayout$LayoutParams0);
        SurfaceHolder surfaceHolder0 = this.n.getHolder();
        this.o = surfaceHolder0;
        surfaceHolder0.addCallback(this);
        this.o.setType(3);
        this.addView(this.n);
        new Handler().postDelayed(new com.fsn.cauly.Y.e0.a(this), 500L);
        RelativeLayout relativeLayout0 = new RelativeLayout(this.getContext());
        this.j = relativeLayout0;
        relativeLayout0.setBackgroundColor(0);
        this.j.setLayoutParams(relativeLayout$LayoutParams0);
        this.addView(this.j);
        this.j.setOnClickListener(new com.fsn.cauly.Y.e0.b(this));
        RelativeLayout relativeLayout1 = com.fsn.cauly.blackdragoncore.utils.c.a(this.getContext(), com.fsn.cauly.blackdragoncore.utils.c.b());
        this.k = relativeLayout1;
        this.j.addView(relativeLayout1);
        this.k.setVisibility(8);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = com.fsn.cauly.blackdragoncore.utils.c.a(-1, -2);
        LinearLayout linearLayout0 = this.p();
        LinearLayout linearLayout1 = this.q();
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams1.addRule(12);
        LinearLayout linearLayout2 = com.fsn.cauly.blackdragoncore.utils.c.a(this.getContext(), false, relativeLayout$LayoutParams1);
        linearLayout2.addView(linearLayout0, linearLayout$LayoutParams0);
        linearLayout2.addView(linearLayout1, linearLayout$LayoutParams0);
        linearLayout2.setBackgroundColor(0xFF000000);
        linearLayout2.getBackground().setAlpha(0x5F);
        this.k.addView(linearLayout2);
    }

    void w() {
        t0 t00 = this.b;
        if(t00 != null) {
            t00.cancel();
        }
        t0 t01 = new t0(500);
        this.b = t01;
        t01.a(this);
        this.b.execute();
    }

    void x() {
        this.surfaceChanged(this.o, 0, this.n.getWidth(), this.n.getHeight());
        if(!this.A) {
            this.f(g.c);
            this.A = true;
        }
        if(this.m != null && !this.m.isPlaying()) {
            int v = this.y;
            if(v > 0) {
                this.m.seekTo(v);
            }
            this.m.start();
            this.i.setImageBitmap(this.f);
            this.y();
            this.w();
            this.h(3000);
            this.t();
            this.o();
        }
    }

    void y() {
        int v = this.m.getCurrentPosition();
        this.p.setProgress(v);
        this.b(v);
    }
}

