package com.bykv.vk.openvk.PjT.PjT.Zh.cr;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import s.c;
import v.b;

public class g extends a {
    static class com.bykv.vk.openvk.PjT.PjT.Zh.cr.g.a implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
        private final WeakReference a;

        public com.bykv.vk.openvk.PjT.PjT.Zh.cr.g.a(g g0) {
            this.a = new WeakReference(g0);
        }

        @Override  // android.media.MediaPlayer$OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer0, int v) {
            try {
                g g0 = (g)this.a.get();
                if(g0 != null) {
                    g0.l(v);
                }
            }
            catch(Throwable unused_ex) {
            }
        }

        @Override  // android.media.MediaPlayer$OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer0) {
            try {
                g g0 = (g)this.a.get();
                if(g0 != null) {
                    g0.o();
                }
            }
            catch(Throwable unused_ex) {
            }
        }

        @Override  // android.media.MediaPlayer$OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer0, int v, int v1) {
            try {
                g g0 = (g)this.a.get();
                if(g0 != null && g0.n(v, v1)) {
                    return true;
                }
            }
            catch(Throwable unused_ex) {
            }
            return false;
        }

        @Override  // android.media.MediaPlayer$OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer0, int v, int v1) {
            try {
                g g0 = (g)this.a.get();
                if(g0 != null && g0.q(v, v1)) {
                    return true;
                }
            }
            catch(Throwable unused_ex) {
            }
            return false;
        }

        @Override  // android.media.MediaPlayer$OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer0) {
            try {
                g g0 = (g)this.a.get();
                if(g0 != null) {
                    g0.p();
                }
            }
            catch(Throwable unused_ex) {
            }
        }

        @Override  // android.media.MediaPlayer$OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer0) {
            try {
                g g0 = (g)this.a.get();
                if(g0 != null) {
                    g0.r();
                }
            }
            catch(Throwable unused_ex) {
            }
        }

        @Override  // android.media.MediaPlayer$OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer0, int v, int v1) {
            try {
                g g0 = (g)this.a.get();
                if(g0 != null) {
                    g0.m(v, v1, 1, 1);
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private final MediaPlayer i;
    private final com.bykv.vk.openvk.PjT.PjT.Zh.cr.g.a j;
    private A.a k;
    private Surface l;
    private final Object m;
    private volatile boolean n;

    public g() {
        MediaPlayer mediaPlayer0;
        Object object0 = new Object();
        this.m = object0;
        synchronized(object0) {
            mediaPlayer0 = new MediaPlayer();
            this.i = mediaPlayer0;
        }
        this.s(mediaPlayer0);
        try {
            mediaPlayer0.setAudioStreamType(3);
        }
        catch(Throwable unused_ex) {
        }
        this.j = new com.bykv.vk.openvk.PjT.PjT.Zh.cr.g.a(this);
        this.v();
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public void Au() {
        MediaPlayer mediaPlayer0 = this.i;
        if(mediaPlayer0 != null) {
            mediaPlayer0.prepareAsync();
        }
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public long DWo() {
        try {
            return (long)this.i.getDuration();
        }
        catch(Throwable unused_ex) {
            return 0L;
        }
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public void JQp() throws Throwable {
        this.i.start();
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public void PjT(long v, int v1) throws Throwable {
        if(Build.VERSION.SDK_INT >= 26) {
            switch(v1) {
                case 0: {
                    this.i.seekTo(((long)(((int)v))), 0);
                    return;
                }
                case 1: {
                    this.i.seekTo(((long)(((int)v))), 1);
                    return;
                }
                case 2: {
                    this.i.seekTo(((long)(((int)v))), 2);
                    return;
                }
                case 3: {
                    this.i.seekTo(((long)(((int)v))), 3);
                    return;
                }
                default: {
                    this.i.seekTo(((int)v));
                    return;
                }
            }
        }
        this.i.seekTo(((int)v));
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public void PjT(SurfaceHolder surfaceHolder0) throws Throwable {
        Object object0 = this.m;
        __monitor_enter(object0);
        try {
            if(!this.n && surfaceHolder0 != null && surfaceHolder0.getSurface() != null && this.h) {
                this.i.setDisplay(surfaceHolder0);
            }
        }
        catch(Throwable unused_ex) {
        }
        __monitor_exit(object0);
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public void PjT(String s) throws Throwable {
        Uri uri0 = Uri.parse(s);
        String s1 = uri0.getScheme();
        if(!TextUtils.isEmpty(s1) && s1.equalsIgnoreCase("file")) {
            String s2 = uri0.getPath();
            this.i.setDataSource(s2);
            return;
        }
        this.i.setDataSource(s);
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    @RequiresApi(api = 23)
    public void PjT(b b0) {
        synchronized(this) {
            this.k = A.a.a(s.b.b(), b0);
            com.bykv.vk.openvk.PjT.PjT.Zh.PjT.Zh.b.b(b0);
            this.i.setDataSource(this.k);
        }
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public void ReZ(boolean z) throws Throwable {
        this.i.setLooping(z);
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public long SM() {
        try {
            return (long)this.i.getCurrentPosition();
        }
        catch(Throwable unused_ex) {
            return 0L;
        }
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public void XX() throws Throwable {
        this.i.pause();
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public void Zh(boolean z) throws Throwable {
        this.i.setScreenOnWhilePlaying(z);
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    @RequiresApi(api = 23)
    public void a(c c0) throws Throwable {
        if(Build.VERSION.SDK_INT >= 23) {
            PlaybackParams playbackParams0 = this.i.getPlaybackParams().setSpeed(c0.a());
            this.i.setPlaybackParams(playbackParams0);
        }
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public void c(FileDescriptor fileDescriptor0) throws Throwable {
        this.i.setDataSource(fileDescriptor0);
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public void cr(boolean z) throws Throwable {
        MediaPlayer mediaPlayer0 = this.i;
        if(mediaPlayer0 == null) {
            return;
        }
        if(z) {
            mediaPlayer0.setVolume(0.0f, 0.0f);
            return;
        }
        mediaPlayer0.setVolume(1.0f, 1.0f);
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public void cz() throws Throwable {
        this.i.stop();
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public int fDm() {
        return this.i == null ? 0 : this.i.getVideoHeight();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        this.u();
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    @TargetApi(14)
    public void i(Surface surface0) {
        this.u();
        this.l = surface0;
        this.i.setSurface(surface0);
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public void qj() throws Throwable {
        Object object0 = this.m;
        __monitor_enter(object0);
        try {
            if(!this.n) {
                this.i.release();
                this.n = true;
                this.u();
                this.t();
                this.k();
                this.v();
            }
            __monitor_exit(object0);
            return;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(object0);
        throw throwable0;
    }

    private void s(MediaPlayer mediaPlayer0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class class0 = Class.forName("android.media.MediaTimeProvider");
            Class class1 = Class.forName("android.media.SubtitleController");
            Class class2 = Class.forName("android.media.SubtitleController$Anchor");
            Class class3 = Class.forName("android.media.SubtitleController$Listener");
            Object object0 = class1.getConstructor(Context.class, class0, class3).newInstance(s.b.b(), null, null);
            Field field0 = class1.getDeclaredField("mHandler");
            field0.setAccessible(true);
            try {
                field0.set(object0, new Handler());
            }
            catch(Throwable unused_ex) {
                field0.setAccessible(false);
                return;
            }
            field0.setAccessible(false);
            mediaPlayer0.getClass().getMethod("setSubtitleAnchor", class1, class2).invoke(mediaPlayer0, object0, null);
        }
        catch(Throwable unused_ex) {
        }
    }

    private void t() {
        if(Build.VERSION.SDK_INT >= 23) {
            A.a a0 = this.k;
            if(a0 != null) {
                try {
                    a0.close();
                }
                catch(Throwable unused_ex) {
                }
                this.k = null;
            }
        }
    }

    private void u() {
        try {
            Surface surface0 = this.l;
            if(surface0 != null) {
                surface0.release();
                this.l = null;
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    private void v() {
        this.i.setOnPreparedListener(this.j);
        this.i.setOnBufferingUpdateListener(this.j);
        this.i.setOnCompletionListener(this.j);
        this.i.setOnSeekCompleteListener(this.j);
        this.i.setOnVideoSizeChangedListener(this.j);
        this.i.setOnErrorListener(this.j);
        this.i.setOnInfoListener(this.j);
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public void xf() throws Throwable {
        try {
            this.i.reset();
        }
        catch(Throwable unused_ex) {
        }
        this.t();
        this.k();
        this.v();
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public int xs() {
        return this.i == null ? 0 : this.i.getVideoWidth();
    }
}

