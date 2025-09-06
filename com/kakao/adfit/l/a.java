package com.kakao.adfit.l;

import A3.o;
import android.content.Context;
import android.media.AudioAttributes.Builder;
import android.media.MediaPlayer.TrackInfo;
import android.media.MediaPlayer;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.kakao.adfit.m.f;
import java.util.ArrayList;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;

public final class a implements b {
    public static final class com.kakao.adfit.l.a.a {
        private com.kakao.adfit.l.a.a() {
        }

        public com.kakao.adfit.l.a.a(w w0) {
        }
    }

    public static final class com.kakao.adfit.l.a.b implements c {
        @Override  // com.kakao.adfit.l.b$c
        public b a(Context context0, String s) {
            L.p(context0, "context");
            L.p(s, "path");
            return new a(s, null);
        }
    }

    public abstract class com.kakao.adfit.l.a.c {
        public static final int[] a;

        static {
            int[] arr_v = new int[d.values().length];
            try {
                arr_v[d.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.e.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.f.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.g.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.a.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.b.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.h.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.c.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.i.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.j.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            com.kakao.adfit.l.a.c.a = arr_v;
        }
    }

    private final String a;
    private MediaPlayer b;
    private d c;
    private boolean d;
    private Surface e;
    private int f;
    private float g;
    private int h;
    private o i;
    private final ArrayList j;
    private o k;
    private o l;
    private o m;
    private final Handler n;
    public static final com.kakao.adfit.l.a.a o;

    static {
        a.o = new com.kakao.adfit.l.a.a(null);
    }

    private a(String s) {
        public static final class com.kakao.adfit.l.a.d extends Handler {
            public abstract class com.kakao.adfit.l.a.d.a {
                public static final int[] a;

                static {
                    int[] arr_v = new int[d.values().length];
                    try {
                        arr_v[d.d.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[d.e.ordinal()] = 2;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[d.f.ordinal()] = 3;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[d.g.ordinal()] = 4;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    com.kakao.adfit.l.a.d.a.a = arr_v;
                }
            }

            final a a;

            com.kakao.adfit.l.a.d(a a0, Looper looper0) {
                this.a = a0;
                super(looper0);
            }

            @Override  // android.os.Handler
            public void handleMessage(Message message0) {
                com.kakao.adfit.l.b.b b$b0 = null;
                L.p(message0, "msg");
                a a0 = this.a;
            alab1:
                switch(message0.what) {
                    case 1: {
                        o o4 = a0.q();
                        if(o4 == null) {
                            return;
                        }
                        switch(a0.d()) {
                            case 1: 
                            case 2: 
                            case 3: {
                                o4.invoke(a0, a0.t());
                                if(a0.g() && !this.hasMessages(1)) {
                                    this.sendEmptyMessageDelayed(1, 100L);
                                }
                                break alab1;
                            }
                            case 4: {
                                o4.invoke(a0, a0.k());
                                return;
                            }
                            default: {
                                return;
                            }
                        }
                    }
                    case 2: {
                        this.removeMessages(2);
                        o o3 = a0.o();
                        if(o3 != null) {
                            o3.invoke(a0, Boolean.valueOf(a0.l()));
                            return;
                        }
                        break;
                    }
                    case 3: {
                        o o2 = a0.p();
                        if(o2 != null) {
                            Object object0 = message0.obj;
                            if(object0 instanceof com.kakao.adfit.l.b.b) {
                                b$b0 = (com.kakao.adfit.l.b.b)object0;
                            }
                            if(b$b0 == null) {
                                return;
                            }
                            o2.invoke(a0, b$b0);
                            return;
                        }
                        break;
                    }
                    case 4: {
                        if(a0.d() == d.c) {
                            f.b("MediaPlayer Timeout");
                            try {
                                MediaPlayer mediaPlayer1 = a0.b;
                                if(mediaPlayer1 == null) {
                                    L.S("player");
                                    mediaPlayer1 = null;
                                }
                                try {
                                    mediaPlayer1.setSurface(null);
                                }
                                catch(Exception unused_ex) {
                                }
                                mediaPlayer1.release();
                            }
                            catch(Exception unused_ex) {
                            }
                            this.a.b(d.j);
                            o o1 = a0.p();
                            if(o1 != null) {
                                o1.invoke(a0, com.kakao.adfit.l.b.b.b);
                                return;
                            }
                        }
                        break;
                    }
                    case 5: {
                        if(a0.d() == d.e && this.a.l()) {
                            f.b("MediaPlayer Buffering Timeout");
                            try {
                                MediaPlayer mediaPlayer0 = a0.b;
                                if(mediaPlayer0 == null) {
                                    L.S("player");
                                    mediaPlayer0 = null;
                                }
                                try {
                                    mediaPlayer0.setSurface(null);
                                }
                                catch(Exception unused_ex) {
                                }
                                mediaPlayer0.release();
                            }
                            catch(Exception unused_ex) {
                            }
                            this.a.b(d.j);
                            o o0 = a0.p();
                            if(o0 != null) {
                                o0.invoke(a0, com.kakao.adfit.l.b.b.b);
                                return;
                            }
                        }
                        break;
                    }
                }
            }
        }

        this.a = s;
        this.c = d.a;
        this.g = 1.0f;
        this.j = new ArrayList();
        this.n = new com.kakao.adfit.l.a.d(this, Looper.getMainLooper());
    }

    public a(String s, w w0) {
        this(s);
    }

    private final void a(int v, int v1) {
        f.b(("MediaPlayer Runtime Error: state = " + this.d() + ", error = " + v + '/' + v1));
    }

    // 检测为 Lambda 实现
    private static final void a(a a0, MediaPlayer mediaPlayer0) [...]

    private final void a(d b$d0) {
        o o0 = this.r();
        if(o0 == null) {
            return;
        }
        this.j.add(b$d0);
        if(this.j.size() > 1) {
            return;
        }
        do {
            o0.invoke(this, b$d0);
            if(!L.g(this.r(), o0)) {
                return;
            }
            this.j.remove(0);
            b$d0 = (d)u.G2(this.j);
        }
        while(b$d0 != null);
    }

    private final void a(String s) {
    }

    private final void a(String s, Exception exception0) {
        f.b(("Failed to call MediaPlayer#" + s + ": state = " + this.d() + ", " + exception0));
    }

    private void a(boolean z) {
        if(this.d != z) {
            this.d = z;
            if(z) {
                if(!this.n.hasMessages(2)) {
                    this.n.sendEmptyMessageDelayed(2, 500L);
                }
                if(this.d() == d.e && !this.n.hasMessages(5)) {
                    this.n.sendEmptyMessageDelayed(5, 5000L);
                }
            }
            else {
                this.n.sendEmptyMessage(2);
                if(this.n.hasMessages(5)) {
                    this.n.removeMessages(5);
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static final boolean a(a a0, MediaPlayer mediaPlayer0, int v, int v1) [...]

    @Override  // com.kakao.adfit.l.b
    public int a() {
        if(this.m()) {
            try {
                MediaPlayer mediaPlayer0 = this.b;
                if(mediaPlayer0 == null) {
                    L.S("player");
                    mediaPlayer0 = null;
                }
                return mediaPlayer0.getVideoHeight();
            }
            catch(Exception exception0) {
            }
            this.a("getVideoHeight()", exception0);
        }
        return 0;
    }

    @Override  // com.kakao.adfit.l.b
    public void a(float f) {
        this.g = f;
        if(this.m()) {
            try {
                MediaPlayer mediaPlayer0 = this.b;
                if(mediaPlayer0 == null) {
                    L.S("player");
                    mediaPlayer0 = null;
                }
                mediaPlayer0.setVolume(f, f);
                return;
            }
            catch(Exception exception0) {
            }
            this.a("setVolume()", exception0);
        }
    }

    @Override  // com.kakao.adfit.l.b
    public void a(int v) {
        d b$d0 = this.d();
        if(b$d0 != d.d && b$d0 != d.e && b$d0 != d.f) {
            return;
        }
        try {
            MediaPlayer mediaPlayer0 = this.b;
            if(mediaPlayer0 == null) {
                L.S("player");
                mediaPlayer0 = null;
            }
            mediaPlayer0.seekTo(v);
            return;
        }
        catch(Exception exception0) {
        }
        this.a("seekTo()", exception0);
    }

    @Override  // com.kakao.adfit.l.b
    public void a(o o0) {
        if(!L.g(this.l, o0)) {
            this.l = o0;
            this.n.removeMessages(1);
            if(o0 != null && this.m()) {
                this.n.sendEmptyMessage(1);
            }
        }
    }

    @Override  // com.kakao.adfit.l.b
    public void a(Surface surface0) {
        if(!L.g(this.e, surface0)) {
            this.e = surface0;
            MediaPlayer mediaPlayer0 = null;
            if(surface0 == null || !surface0.isValid()) {
                d b$d1 = this.d();
                if(b$d1 != d.a && b$d1 != d.i) {
                    try {
                        MediaPlayer mediaPlayer2 = this.b;
                        if(mediaPlayer2 == null) {
                            L.S("player");
                            mediaPlayer2 = null;
                        }
                        mediaPlayer2.setSurface(null);
                        return;
                    }
                    catch(Exception exception1) {
                    }
                    this.a("setSurface()", exception1);
                }
            }
            else {
                d b$d0 = this.d();
                if(b$d0 != d.a && b$d0 != d.i && b$d0 != d.j) {
                    try {
                        MediaPlayer mediaPlayer1 = this.b;
                        if(mediaPlayer1 == null) {
                            L.S("player");
                        }
                        else {
                            mediaPlayer0 = mediaPlayer1;
                        }
                        mediaPlayer0.setSurface(surface0);
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    this.a("setSurface()", exception0);
                    this.b(d.j);
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void b(a a0, MediaPlayer mediaPlayer0) [...]

    private void b(d b$d0) {
        d b$d1 = this.c;
        if(b$d1 != b$d0) {
            if(b$d1 == d.c) {
                this.n.removeMessages(4);
            }
            this.c = b$d0;
            this.a(b$d0);
        }
    }

    // 检测为 Lambda 实现
    private static final boolean b(a a0, MediaPlayer mediaPlayer0, int v, int v1) [...]

    @Override  // com.kakao.adfit.l.b
    public void b() {
        this.h = 1;
        int v = com.kakao.adfit.l.a.c.a[this.d().ordinal()];
        if(v != 9) {
            switch(v) {
                case 1: {
                    try {
                    label_5:
                        MediaPlayer mediaPlayer0 = this.b;
                        if(mediaPlayer0 == null) {
                            L.S("player");
                            mediaPlayer0 = null;
                        }
                        mediaPlayer0.start();
                    }
                    catch(Exception exception0) {
                        this.a("start()", exception0);
                        this.b(d.j);
                        return;
                    }
                    this.b(d.e);
                    if(this.q() != null) {
                        this.n.sendEmptyMessage(1);
                    }
                    if(this.l() && !this.n.hasMessages(5)) {
                        this.n.sendEmptyMessageDelayed(5, 5000L);
                        return;
                    }
                    break;
                }
                case 10: {
                    break;
                }
                default: {
                    if(v == 2 || v == 3 || v == 4) {
                        goto label_5;
                    }
                }
            }
        }
    }

    @Override  // com.kakao.adfit.l.b
    public void b(o o0) {
        if(!L.g(this.k, o0)) {
            this.k = o0;
            this.n.removeMessages(2);
            if(o0 != null) {
                this.n.sendEmptyMessage(2);
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void c(a a0, MediaPlayer mediaPlayer0) [...]

    @Override  // com.kakao.adfit.l.b
    public int c() {
        if(this.m()) {
            try {
                MediaPlayer mediaPlayer0 = this.b;
                if(mediaPlayer0 == null) {
                    L.S("player");
                    mediaPlayer0 = null;
                }
                return mediaPlayer0.getVideoWidth();
            }
            catch(Exception exception0) {
            }
            this.a("getVideoWidth()", exception0);
        }
        return 0;
    }

    @Override  // com.kakao.adfit.l.b
    public void c(o o0) {
        if(!L.g(this.i, o0)) {
            this.i = o0;
            this.j.clear();
            if(o0 != null) {
                this.a(this.d());
            }
        }
    }

    @Override  // com.kakao.adfit.l.b
    public d d() {
        return this.c;
    }

    @Override  // com.kakao.adfit.l.b
    public void e() {
        MediaPlayer mediaPlayer1;
        if(this.d() != d.a) {
            MediaPlayer mediaPlayer0 = this.b;
            if(mediaPlayer0 != null) {
                try {
                    mediaPlayer1 = null;
                    mediaPlayer0.setSurface(null);
                }
                catch(Exception unused_ex) {
                }
                try {
                    MediaPlayer mediaPlayer2 = this.b;
                    if(mediaPlayer2 == null) {
                        L.S("player");
                    }
                    else {
                        mediaPlayer1 = mediaPlayer2;
                    }
                    mediaPlayer1.release();
                    goto label_14;
                }
                catch(Exception exception0) {
                }
                this.a("release()", exception0);
            }
        }
    label_14:
        this.b(d.i);
        this.a(false);
    }

    @Override  // com.kakao.adfit.l.b
    public Surface f() {
        return this.e;
    }

    @Override  // com.kakao.adfit.l.b
    public boolean g() {
        return com.kakao.adfit.l.b.a.a(this);
    }

    @Override  // com.kakao.adfit.l.b
    public void h() {
        MediaPlayer mediaPlayer0 = null;
        this.h = 0;
        switch(this.d()) {
            case 2: 
            case 3: {
                try {
                    if(this.g()) {
                        MediaPlayer mediaPlayer1 = this.b;
                        if(mediaPlayer1 == null) {
                            L.S("player");
                            mediaPlayer1 = null;
                        }
                        if(mediaPlayer1.isPlaying()) {
                            this.f = Math.max(this.t(), this.f);
                        }
                    }
                    goto label_14;
                }
                catch(Exception exception0) {
                }
                try {
                    this.a("isPlaying()", exception0);
                label_14:
                    MediaPlayer mediaPlayer2 = this.b;
                    if(mediaPlayer2 == null) {
                        L.S("player");
                    }
                    else {
                        mediaPlayer0 = mediaPlayer2;
                    }
                    mediaPlayer0.pause();
                }
                catch(Exception exception1) {
                    this.a("pause()", exception1);
                    this.b(d.j);
                    return;
                }
                this.b(d.f);
            }
        }
    }

    @Override  // com.kakao.adfit.l.b
    public boolean i() {
        if(this.m()) {
            MediaPlayer mediaPlayer0 = this.b;
            if(mediaPlayer0 == null) {
                L.S("player");
                mediaPlayer0 = null;
            }
            MediaPlayer.TrackInfo[] arr_mediaPlayer$TrackInfo = mediaPlayer0.getTrackInfo();
            L.o(arr_mediaPlayer$TrackInfo, "player.trackInfo");
            for(int v = 0; v < arr_mediaPlayer$TrackInfo.length; ++v) {
                if(arr_mediaPlayer$TrackInfo[v].getTrackType() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // com.kakao.adfit.l.b
    public void j() {
        if(this.h == 2) {
            this.h = 0;
        }
        MediaPlayer mediaPlayer0 = null;
        switch(this.d()) {
            case 5: {
                this.b = this.n();
                try {
                    if(this.s().length() == 0) {
                        this.a("setDataSource()", new RuntimeException("\"path\" is empty."));
                        this.b(d.j);
                        return;
                    }
                    MediaPlayer mediaPlayer3 = this.b;
                    if(mediaPlayer3 == null) {
                        L.S("player");
                    }
                    else {
                        mediaPlayer0 = mediaPlayer3;
                    }
                    mediaPlayer0.setDataSource(this.s());
                }
                catch(Exception exception2) {
                    this.a("setDataSource()", exception2);
                    this.b(d.j);
                    return;
                }
                this.a(false);
                this.b(d.b);
                this.j();
                break;
            }
            case 6: 
            case 7: {
                Surface surface0 = this.f();
                if(surface0 != null && surface0.isValid()) {
                    try {
                        MediaPlayer mediaPlayer1 = this.b;
                        if(mediaPlayer1 == null) {
                            L.S("player");
                            mediaPlayer1 = null;
                        }
                        mediaPlayer1.setSurface(surface0);
                        goto label_17;
                    }
                    catch(Exception exception0) {
                    }
                    this.a("setSurface()", exception0);
                    this.b(d.j);
                    return;
                }
                try {
                label_17:
                    MediaPlayer mediaPlayer2 = this.b;
                    if(mediaPlayer2 == null) {
                        L.S("player");
                    }
                    else {
                        mediaPlayer0 = mediaPlayer2;
                    }
                    mediaPlayer0.prepareAsync();
                }
                catch(Exception exception1) {
                    this.a("prepareAsync()", exception1);
                    this.b(d.j);
                    return;
                }
                this.b(d.c);
                if(!this.n.hasMessages(4)) {
                    this.n.sendEmptyMessageDelayed(4, 5000L);
                    return;
                }
                break;
            }
        }
    }

    @Override  // com.kakao.adfit.l.b
    public int k() {
        if(this.m()) {
            try {
                MediaPlayer mediaPlayer0 = this.b;
                if(mediaPlayer0 == null) {
                    L.S("player");
                    mediaPlayer0 = null;
                }
                return mediaPlayer0.getDuration();
            }
            catch(Exception exception0) {
            }
            this.a("getDuration()", exception0);
        }
        return 0;
    }

    @Override  // com.kakao.adfit.l.b
    public boolean l() {
        return this.d;
    }

    @Override  // com.kakao.adfit.l.b
    public boolean m() {
        return com.kakao.adfit.l.b.a.b(this);
    }

    private final MediaPlayer n() {
        MediaPlayer mediaPlayer0 = new MediaPlayer();
        if(Build.VERSION.SDK_INT >= 24) {
            mediaPlayer0.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
        }
        else {
            mediaPlayer0.setAudioStreamType(3);
        }
        mediaPlayer0.setOnPreparedListener((MediaPlayer mediaPlayer0) -> {
            L.p(this, "this$0");
            this.w();
        });
        mediaPlayer0.setOnCompletionListener((MediaPlayer mediaPlayer0) -> {
            L.p(this, "this$0");
            this.v();
        });
        mediaPlayer0.setOnErrorListener((MediaPlayer mediaPlayer0, int v, int v1) -> {
            L.p(this, "this$0");
            this.a(v, v1);
            d b$d0 = this.d();
            if(b$d0 != d.i) {
                d b$d1 = d.j;
                if(b$d0 != b$d1) {
                    this.b(b$d1);
                    this.n.obtainMessage(3, com.kakao.adfit.l.b.b.d);
                }
            }
            return true;
        });
        mediaPlayer0.setOnSeekCompleteListener((MediaPlayer mediaPlayer0) -> {
            L.p(this, "this$0");
            if(this.q() != null && this.m()) {
                this.n.sendEmptyMessage(1);
            }
        });
        mediaPlayer0.setOnInfoListener((MediaPlayer mediaPlayer0, int v, int v1) -> {
            L.p(this, "this$0");
            switch(v) {
                case 701: {
                    if(this.m()) {
                        this.a(true);
                    }
                    return false;
                }
                case 702: {
                    this.a(false);
                    return false;
                }
                default: {
                    return false;
                }
            }
        });
        return mediaPlayer0;
    }

    public o o() {
        return this.k;
    }

    public o p() {
        return this.m;
    }

    public o q() {
        return this.l;
    }

    public o r() {
        return this.i;
    }

    public String s() {
        return this.a;
    }

    public int t() {
        switch(this.d()) {
            case 1: 
            case 2: 
            case 3: {
                try {
                    MediaPlayer mediaPlayer0 = this.b;
                    if(mediaPlayer0 == null) {
                        L.S("player");
                        mediaPlayer0 = null;
                    }
                    return mediaPlayer0.getCurrentPosition();
                }
                catch(Exception exception0) {
                }
                this.a("getCurrentPosition()", exception0);
                return 0;
            }
            case 4: {
                return this.k();
            }
            default: {
                return 0;
            }
        }
    }

    public float u() {
        return this.g;
    }

    private final void v() {
        if(this.d() != d.e) {
            if(this.d() == d.g) {
                return;
            }
            return;
        }
        if(this.f < this.k()) {
            this.f = this.k();
            if(this.q() != null) {
                this.n.sendEmptyMessage(1);
            }
        }
        if(this.h == 1) {
            this.h = 0;
        }
        this.b(d.g);
    }

    private final void w() {
        if(this.d() != d.c) {
            if(this.m()) {
                return;
            }
            return;
        }
        this.b(d.d);
        MediaPlayer mediaPlayer0 = null;
        try {
            MediaPlayer mediaPlayer1 = this.b;
            if(mediaPlayer1 == null) {
                L.S("player");
                mediaPlayer1 = null;
            }
            mediaPlayer1.setVolume(this.u(), this.u());
        }
        catch(Exception exception0) {
            this.a("setVolume()", exception0);
        }
        int v = this.k();
        if(500 <= this.f && this.f < v) {
            try {
                MediaPlayer mediaPlayer2 = this.b;
                if(mediaPlayer2 == null) {
                    L.S("player");
                }
                else {
                    mediaPlayer0 = mediaPlayer2;
                }
                mediaPlayer0.seekTo(this.f);
                goto label_25;
            }
            catch(Exception exception1) {
            }
            this.a("seekTo()", exception1);
        }
    label_25:
        switch(this.h) {
            case 1: {
                this.b();
                break;
            }
            case 2: {
                this.x();
            }
        }
        if(this.q() != null) {
            this.n.sendEmptyMessage(1);
        }
    }

    public void x() {
        MediaPlayer mediaPlayer0 = null;
        this.h = 2;
        int v = com.kakao.adfit.l.a.c.a[this.d().ordinal()];
        if(v == 1 || v == 2 || (v == 3 || v == 4 || v == 7)) {
            try {
                if(this.g()) {
                    MediaPlayer mediaPlayer1 = this.b;
                    if(mediaPlayer1 == null) {
                        L.S("player");
                        mediaPlayer1 = null;
                    }
                    if(mediaPlayer1.isPlaying()) {
                        this.f = Math.max(this.t(), this.f);
                    }
                }
                goto label_14;
            }
            catch(Exception exception0) {
            }
            try {
                this.a("isPlaying()", exception0);
            }
            catch(Exception exception1) {
                this.a("stop()", exception1);
                this.b(d.j);
                return;
            }
            try {
            label_14:
                MediaPlayer mediaPlayer2 = this.b;
                if(mediaPlayer2 == null) {
                    L.S("player");
                    mediaPlayer2 = null;
                }
                mediaPlayer2.setSurface(null);
            }
            catch(Exception unused_ex) {
            }
            try {
                MediaPlayer mediaPlayer3 = this.b;
                if(mediaPlayer3 == null) {
                    L.S("player");
                }
                else {
                    mediaPlayer0 = mediaPlayer3;
                }
                mediaPlayer0.stop();
            }
            catch(Exception exception1) {
                this.a("stop()", exception1);
                this.b(d.j);
                return;
            }
            this.b(d.h);
            this.a(false);
        }
    }
}

