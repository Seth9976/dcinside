package com.bykv.vk.openvk.PjT.PjT.Zh.cr;

import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.d;
import com.bytedance.sdk.component.utils.KM.PjT;
import com.bytedance.sdk.component.utils.KM;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class h implements a, b, c, d, e, f, g, PjT, s.a {
    class com.bykv.vk.openvk.PjT.PjT.Zh.cr.h.f implements Runnable {
        final h a;

        @Override
        public void run() {
            if(h.this.cz == null) {
                return;
            }
            long v = h.this.ub();
            if(v > 0L && Build.VERSION.SDK_INT >= 23 && h.this.cz() && h.this.xE != 0x8000000000000000L) {
                try {
                    if(h.this.xE == v) {
                        if(!h.this.fDm && h.this.ub >= 400L) {
                            h.this.l(701, 800);
                            h.this.fDm = true;
                        }
                        h.this.ub += (long)h.this.Qf;
                    }
                    else {
                        if(h.this.fDm) {
                            h.this.qla += h.this.ub;
                            h.this.l(702, 800);
                        }
                        h.this.ub = 0L;
                        h.this.fDm = false;
                    }
                }
                catch(Throwable unused_ex) {
                }
            }
            if(h.this.xE() > 0L) {
                if(h.this.xE != v) {
                    long v1 = h.this.xE();
                    h.this.d(v, v1);
                }
                h.this.xE = v;
            }
            if(h.this.Zh()) {
                long v2 = h.this.xE();
                long v3 = h.this.xE();
                h.this.d(v2, v3);
            }
            else if(h.this.xs != null) {
                h.this.xs.postDelayed(this, ((long)h.this.Qf));
            }
        }
    }

    class o implements Runnable {
        private long a;
        private boolean b;
        final h c;

        public void a(long v) {
            this.a = v;
        }

        public void b(boolean z) {
            this.b = z;
        }

        @Override
        public void run() {
            if(h.this.cz != null) {
                try {
                    if(!this.b) {
                        long v = h.this.cz.SM();
                        h.this.xf = Math.max(this.a, v);
                    }
                }
                catch(Throwable unused_ex) {
                }
            }
            if(h.this.xs != null) {
                h.this.xs.sendEmptyMessageDelayed(100, 0L);
            }
        }
    }

    private boolean Au;
    private final Runnable Co;
    private boolean DWo;
    private boolean JQp;
    private Surface Jo;
    private CountDownLatch KM;
    private static final SparseIntArray Lrd;
    private boolean Owx;
    private SurfaceTexture PjT;
    private volatile int Qf;
    private ArrayList RD;
    private int ReZ;
    private boolean SM;
    private int Sks;
    private final boolean XX;
    private boolean Yo;
    private AtomicBoolean ZX;
    private long Zd;
    private SurfaceHolder Zh;
    private boolean cRA;
    private int cr;
    private volatile com.bykv.vk.openvk.PjT.PjT.Zh.cr.b cz;
    private boolean fDm;
    private long gK;
    private v.b iZZ;
    private long ig;
    private static boolean kph;
    private long ltE;
    private volatile boolean qZS;
    private volatile int qj;
    private long qla;
    private boolean rds;
    private String tT;
    private long ub;
    private final o wN;
    private long xE;
    private long xf;
    private KM xs;
    private final List yIW;

    static {
        h.Lrd = new SparseIntArray();
        h.kph = false;
    }

    public h() {
        this.ReZ = 0;
        this.JQp = false;
        this.cz = null;
        this.XX = false;
        this.Au = false;
        this.qj = 201;
        this.xf = -1L;
        this.fDm = false;
        this.qla = 0L;
        this.xE = 0x8000000000000000L;
        this.ub = 0L;
        this.gK = 0L;
        this.ltE = 0L;
        this.Sks = 0;
        this.tT = "0";
        this.yIW = new CopyOnWriteArrayList();
        this.iZZ = null;
        this.Yo = false;
        this.KM = new CountDownLatch(1);
        this.Qf = 200;
        this.ZX = new AtomicBoolean(false);
        this.Jo = null;
        this.Co = new com.bykv.vk.openvk.PjT.PjT.Zh.cr.h.f(this);
        this.wN = new o(this);
        this.Zd = 0L;
        this.ig = 0L;
        this.rds = false;
        this.f("SSMediaPlayerWrapper");
    }

    @Override  // s.a
    public boolean Au() {
        return this.DWo;
    }

    static long DWo(h h0) {
        return h0.xf;
    }

    public void DWo() {
        class com.bykv.vk.openvk.PjT.PjT.Zh.cr.h.b implements Runnable {
            final h a;

            @Override
            public void run() {
                if(h.this.XX() && h.this.cz != null) {
                    try {
                        h.this.cz.JQp();
                        for(Object object0: h.this.yIW) {
                            WeakReference weakReference0 = (WeakReference)object0;
                            if(weakReference0 != null && weakReference0.get() != null) {
                                ((s.a.a)weakReference0.get()).JQp(h.this);
                            }
                        }
                        h.this.qj = 206;
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
        }

        if(this.Au()) {
            return;
        }
        if(this.xs != null) {
            this.ZX.set(true);
            this.xs.post(new com.bykv.vk.openvk.PjT.PjT.Zh.cr.h.b(this));
        }
    }

    @Override  // s.a
    public int JQp() {
        return this.cz == null || this.Au() ? 0 : this.cz.fDm();
    }

    public void PjT(int v) {
        if(this.Au()) {
            return;
        }
        this.Qf = v;
    }

    public void PjT(long v) {
        class com.bykv.vk.openvk.PjT.PjT.Zh.cr.h.g implements Runnable {
            final long a;
            final h b;

            com.bykv.vk.openvk.PjT.PjT.Zh.cr.h.g(long v) {
                this.a = v;
                super();
            }

            @Override
            public void run() {
                if(h.this.xs != null) {
                    h.this.xs.obtainMessage(106, this.a).sendToTarget();
                }
            }
        }

        if(this.Au()) {
            return;
        }
        if(this.qj == 206 || this.qj == 0xCF || this.qj == 209) {
            this.n(new com.bykv.vk.openvk.PjT.PjT.Zh.cr.h.g(this, v));
        }
    }

    public void PjT(SurfaceTexture surfaceTexture0) {
        class com.bykv.vk.openvk.PjT.PjT.Zh.cr.h.h implements Runnable {
            final SurfaceTexture a;
            final h b;

            com.bykv.vk.openvk.PjT.PjT.Zh.cr.h.h(SurfaceTexture surfaceTexture0) {
                this.a = surfaceTexture0;
                super();
            }

            @Override
            public void run() {
                h.this.i();
                if(h.this.xs != null) {
                    h.this.xs.obtainMessage(0x6F, this.a).sendToTarget();
                }
            }
        }

        if(this.Au()) {
            return;
        }
        this.PjT = surfaceTexture0;
        this.PjT(true);
        this.n(new com.bykv.vk.openvk.PjT.PjT.Zh.cr.h.h(this, surfaceTexture0));
    }

    @Override  // com.bytedance.sdk.component.utils.KM$PjT
    public void PjT(Message message0) {
        int v = this.qj;
        int v1 = message0.what;
        if(this.cz != null) {
            switch(message0.what) {
                case 100: {
                    goto label_29;
                }
                case 101: {
                    goto label_39;
                }
                case 102: {
                    try {
                        this.cz.xf();
                        this.qj = 201;
                        return;
                    }
                    catch(Throwable unused_ex) {
                        break;
                    }
                }
                case 103: {
                    try {
                        this.s();
                    }
                    catch(Throwable unused_ex) {
                    }
                    for(Object object0: this.yIW) {
                        WeakReference weakReference0 = (WeakReference)object0;
                        if(weakReference0 != null && weakReference0.get() != null) {
                            ((s.a.a)weakReference0.get()).ReZ(this);
                        }
                    }
                    this.qj = 203;
                    return;
                }
                case 104: {
                    goto label_56;
                }
                case 105: {
                    goto label_59;
                }
                case 106: {
                    goto label_63;
                }
                case 107: {
                    this.c();
                    if(this.qj == 201 || this.qj == 203) {
                        try {
                            v.b b0 = (v.b)message0.obj;
                            if(TextUtils.isEmpty(b0.Zh())) {
                                b0.PjT(s.b.h());
                            }
                            File file0 = new File(b0.Zh(), b0.fDm());
                            if(file0.exists()) {
                                file0.getAbsolutePath();
                                this.cz.PjT(file0.getAbsolutePath());
                            }
                            else {
                                b0.xs();
                                if((h.kph || b0.Zh == 1) && Build.VERSION.SDK_INT < 23) {
                                    this.cz.PjT(b0.xs());
                                    b0.xs();
                                }
                                else if(Build.VERSION.SDK_INT >= 23) {
                                    this.cz.PjT(b0);
                                    b0.xs();
                                }
                                else {
                                    String s = j.d.a().d(b0);
                                    this.cz.PjT(s);
                                }
                            }
                            this.qj = 202;
                            return;
                        }
                        catch(Throwable unused_ex) {
                            break;
                        }
                    }
                label_89:
                    this.qj = 200;
                    if(!this.Au) {
                        v.a a0 = new v.a(308, v1);
                        a0.b(v + "," + v1);
                        for(Object object2: this.yIW) {
                            WeakReference weakReference2 = (WeakReference)object2;
                            if(weakReference2 != null && weakReference2.get() != null) {
                                ((s.a.a)weakReference2.get()).PjT(this, a0);
                            }
                        }
                        this.Au = true;
                        return;
                    }
                    break;
                }
                case 110: {
                    try {
                        this.cz.PjT(((SurfaceHolder)message0.obj));
                        this.cz.Zh(true);
                        this.KM.await(1L, TimeUnit.SECONDS);
                        this.a();
                        return;
                    label_23:
                        this.Jo = new Surface(((SurfaceTexture)message0.obj));
                        this.cz.i(this.Jo);
                        this.cz.Zh(true);
                        this.KM.await(1L, TimeUnit.SECONDS);
                        this.a();
                        return;
                    label_29:
                        if(this.qj != 205 && this.qj != 0xCF && this.qj != 209) {
                            goto label_89;
                        }
                        else {
                            this.cz.JQp();
                            this.ltE = SystemClock.elapsedRealtime();
                            this.qj = 206;
                            if(this.xf > 0L) {
                                this.cz.PjT(this.xf, this.cr);
                                this.xf = -1L;
                            }
                            if(this.iZZ != null) {
                                this.Zh(this.Yo);
                                return;
                            label_39:
                                if(this.fDm) {
                                    this.qla += this.ub;
                                }
                                this.fDm = false;
                                this.ub = 0L;
                                this.xE = 0x8000000000000000L;
                                if(this.qj == 206 || this.qj == 0xCF || this.qj == 209) {
                                    this.cz.XX();
                                    this.qj = 0xCF;
                                    this.qZS = false;
                                    for(Object object1: this.yIW) {
                                        WeakReference weakReference1 = (WeakReference)object1;
                                        if(weakReference1 != null && weakReference1.get() != null) {
                                            ((s.a.a)weakReference1.get()).cr(this);
                                        }
                                    }
                                    return;
                                label_56:
                                    if(this.qj == 202 || this.qj == 0xD0) {
                                        this.cz.Au();
                                        return;
                                    label_59:
                                        if(this.qj == 205 || this.qj == 206 || this.qj == 0xCF || this.qj == 0xD0 || this.qj == 209) {
                                            this.cz.cz();
                                            this.qj = 0xD0;
                                            return;
                                        label_63:
                                            if(this.qj == 206 || this.qj == 0xCF || this.qj == 209) {
                                                this.cz.PjT(((long)(((Long)message0.obj))), this.cr);
                                                return;
                                            }
                                        }
                                    }
                                }
                                goto label_89;
                            }
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    break;
                }
                case 0x6F: {
                    goto label_23;
                }
                default: {
                    return;
                }
            }
        }
        try {
        }
        catch(Throwable unused_ex) {
        }
    }

    public void PjT(SurfaceHolder surfaceHolder0) {
        class i implements Runnable {
            final SurfaceHolder a;
            final h b;

            i(SurfaceHolder surfaceHolder0) {
                this.a = surfaceHolder0;
                super();
            }

            @Override
            public void run() {
                h.this.i();
                if(h.this.xs != null) {
                    h.this.xs.obtainMessage(110, this.a).sendToTarget();
                }
            }
        }

        if(this.Au()) {
            return;
        }
        this.Zh = surfaceHolder0;
        this.PjT(true);
        this.n(new i(this, surfaceHolder0));
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b$e
    public void PjT(com.bykv.vk.openvk.PjT.PjT.Zh.cr.b b0) {
        this.qj = 209;
        h.Lrd.delete(this.Sks);
        KM kM0 = this.xs;
        if(kM0 != null) {
            kM0.removeCallbacks(this.Co);
        }
        for(Object object0: this.yIW) {
            WeakReference weakReference0 = (WeakReference)object0;
            if(weakReference0 != null && weakReference0.get() != null) {
                ((s.a.a)weakReference0.get()).PjT(this);
            }
        }
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b$b
    public void PjT(com.bykv.vk.openvk.PjT.PjT.Zh.cr.b b0, int v) {
        if(this.cz != b0) {
            return;
        }
        for(Object object0: this.yIW) {
            WeakReference weakReference0 = (WeakReference)object0;
            if(weakReference0 != null && weakReference0.get() != null) {
                ((s.a.a)weakReference0.get()).Zh(this, v);
            }
        }
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b$d
    public void PjT(com.bykv.vk.openvk.PjT.PjT.Zh.cr.b b0, int v, int v1, int v2, int v3) {
        for(Object object0: this.yIW) {
            WeakReference weakReference0 = (WeakReference)object0;
            if(weakReference0 != null && weakReference0.get() != null) {
                ((s.a.a)weakReference0.get()).PjT(this, v, v1);
            }
        }
    }

    public void PjT(s.a.a a$a0) {
        if(a$a0 == null) {
            return;
        }
        for(Object object0: this.yIW) {
            if(((WeakReference)object0) != null && ((WeakReference)object0).get() == a$a0) {
                return;
            }
            if(false) {
                break;
            }
        }
        WeakReference weakReference0 = new WeakReference(a$a0);
        this.yIW.add(weakReference0);
    }

    public void PjT(v.b b0) {
        class j implements Runnable {
            final v.b a;
            final h b;

            j(v.b b0) {
                this.a = b0;
                super();
            }

            @Override
            public void run() {
                h.this.i();
                if(h.this.xs != null) {
                    h.this.xs.obtainMessage(107, this.a).sendToTarget();
                }
            }
        }

        if(this.Au()) {
            return;
        }
        this.iZZ = b0;
        if(b0 != null) {
            this.rds = this.rds && !b0.cr();
        }
        this.n(new j(this, b0));
    }

    public void PjT(boolean z) {
        class n implements Runnable {
            final boolean a;
            final h b;

            n(boolean z) {
                this.a = z;
                super();
            }

            @Override
            public void run() {
                if(h.this.cz != null) {
                    h.this.cz.PjT(this.a);
                }
            }
        }

        if(this.Au()) {
            return;
        }
        this.cRA = z;
        if(this.cz != null) {
            this.cz.PjT(z);
            return;
        }
        KM kM0 = this.xs;
        if(kM0 != null) {
            kM0.post(new n(this, z));
        }
    }

    public void PjT(boolean z, long v, boolean z1) {
        if(this.Au()) {
            return;
        }
        this.i();
        this.Yo = z1;
        this.ZX.set(true);
        this.qZS = false;
        this.Zh(z1);
        if(z) {
            this.xf = v;
            this.j();
        }
        else {
            this.m(v);
        }
        KM kM0 = this.xs;
        if(kM0 != null) {
            kM0.removeCallbacks(this.Co);
            this.xs.postDelayed(this.Co, ((long)this.Qf));
        }
        this.KM.countDown();
    }

    @Override  // s.a
    public boolean PjT() {
        return this.JQp;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b$c
    public boolean PjT(com.bykv.vk.openvk.PjT.PjT.Zh.cr.b b0, int v, int v1) {
        this.q();
        this.qj = 200;
        KM kM0 = this.xs;
        if(kM0 != null) {
            kM0.removeCallbacks(this.Co);
        }
        if(this.g(v, v1)) {
            this.b();
        }
        if(!this.ZX.get()) {
            return true;
        }
        this.ZX.set(false);
        v.a a0 = new v.a(v, v1);
        for(Object object0: this.yIW) {
            WeakReference weakReference0 = (WeakReference)object0;
            if(weakReference0 != null && weakReference0.get() != null) {
                ((s.a.a)weakReference0.get()).PjT(this, a0);
            }
        }
        return true;
    }

    public static void ReZ(boolean z) {
        h.kph = z;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b$g
    public void ReZ(com.bykv.vk.openvk.PjT.PjT.Zh.cr.b b0) {
        for(Object object0: this.yIW) {
            WeakReference weakReference0 = (WeakReference)object0;
            if(weakReference0 != null && weakReference0.get() != null) {
                ((s.a.a)weakReference0.get()).PjT(this, true);
            }
        }
    }

    // 去混淆评级： 低(30)
    @Override  // s.a
    public boolean ReZ() {
        return this.xs() || this.cz() || this.XX();
    }

    public void SM() {
        if(this.Au()) {
            return;
        }
        if(this.cz == null) {
            return;
        }
        this.ZX.set(true);
        if(this.qj != 206) {
            this.c();
            this.qZS = false;
            this.wN.b(true);
            this.m(0L);
            KM kM0 = this.xs;
            if(kM0 != null) {
                kM0.removeCallbacks(this.Co);
                this.xs.postDelayed(this.Co, ((long)this.Qf));
            }
        }
        this.KM.countDown();
    }

    static int XX(h h0) {
        return h0.ReZ;
    }

    // 去混淆评级： 低(30)
    @Override  // s.a
    public boolean XX() {
        return (this.qj == 0xCF || this.qZS) && (this.xs != null && !this.xs.hasMessages(100));
    }

    public void Zh(int v) {
        this.cr = v;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b$a
    public void Zh(com.bykv.vk.openvk.PjT.PjT.Zh.cr.b b0) {
        if(this.Au()) {
            return;
        }
        try {
            this.qj = 205;
            v.b b1 = this.iZZ;
            if(b1 != null) {
                float f = b1.xf();
                if(f > 0.0f) {
                    s.c c0 = new s.c();
                    c0.b(f);
                    this.cz.a(c0);
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        if(this.xs != null) {
            if(this.qZS) {
                this.r();
            }
            else {
                this.xs.sendMessage(this.xs.obtainMessage(100, -1, -1));
            }
        }
        h.Lrd.delete(this.Sks);
        if(!this.rds && !this.Owx) {
            this.t();
            this.Owx = true;
        }
        for(Object object0: this.yIW) {
            WeakReference weakReference0 = (WeakReference)object0;
            if(weakReference0 != null && weakReference0.get() != null) {
                ((s.a.a)weakReference0.get()).Zh(this);
            }
        }
    }

    public void Zh(boolean z) {
        class m implements Runnable {
            final boolean a;
            final h b;

            m(boolean z) {
                this.a = z;
                super();
            }

            @Override
            public void run() {
                if(!h.this.Au() && h.this.cz != null) {
                    try {
                        h.this.Yo = this.a;
                        h.this.cz.cr(this.a);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
        }

        if(this.Au()) {
            return;
        }
        KM kM0 = this.xs;
        if(kM0 == null) {
            return;
        }
        kM0.post(new m(this, z));
    }

    @Override  // s.a
    public boolean Zh() {
        return this.qj == 209;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b$f
    public boolean Zh(com.bykv.vk.openvk.PjT.PjT.Zh.cr.b b0, int v, int v1) {
        if(this.cz != b0) {
            return false;
        }
        if(v1 == -1004) {
            v.a a0 = new v.a(v, -1004);
            for(Object object0: this.yIW) {
                WeakReference weakReference0 = (WeakReference)object0;
                if(weakReference0 != null && weakReference0.get() != null) {
                    ((s.a.a)weakReference0.get()).PjT(this, a0);
                }
            }
        }
        this.l(v, v1);
        return false;
    }

    private void a() {
        if(this.RD != null && !this.RD.isEmpty()) {
            this.k();
        }
    }

    private void b() {
        class k implements Runnable {
            final h a;

            @Override
            public void run() {
                if(h.this.xs != null && h.this.xs.getLooper() != null) {
                    try {
                        com.bytedance.sdk.component.Au.PjT.PjT.PjT().PjT(h.this.xs);
                        h.this.xs = null;
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
        }

        if(this.xs != null && this.xs.getLooper() != null) {
            this.xs.post(new k(this));
        }
    }

    private void c() {
        this.qla = 0L;
        this.ReZ = 0;
        this.ub = 0L;
        this.fDm = false;
        this.xE = 0x8000000000000000L;
    }

    @Override  // s.a
    public int cr() {
        return this.cz == null || this.Au() ? 0 : this.cz.xs();
    }

    // 去混淆评级： 低(30)
    @Override  // s.a
    public boolean cz() {
        return (this.qj == 206 || this.xs != null && this.xs.hasMessages(100)) && !this.qZS;
    }

    private void d(long v, long v1) {
        for(Object object0: this.yIW) {
            WeakReference weakReference0 = (WeakReference)object0;
            if(weakReference0 != null && weakReference0.get() != null) {
                ((s.a.a)weakReference0.get()).PjT(this, v, v1);
            }
        }
    }

    private void e(Runnable runnable0) {
        try {
            if(this.RD == null) {
                this.RD = new ArrayList();
            }
            this.RD.add(runnable0);
        }
        catch(Throwable unused_ex) {
        }
    }

    private void f(String s) {
        this.Sks = 0;
        this.xs = com.bytedance.sdk.component.Au.PjT.PjT.PjT().PjT(this, "csj_" + s);
        this.rds = true;
        this.i();
    }

    public long fDm() {
        if(Build.VERSION.SDK_INT >= 23) {
            if(this.fDm) {
                return this.ub <= 0L ? this.qla : this.qla + this.ub;
            }
            return this.qla;
        }
        return this.ig;
    }

    private boolean g(int v, int v1) {
        switch(v) {
            case -1010: 
            case -1007: 
            case -1004: 
            case -110: 
            case 100: 
            case 200: {
                return true;
            }
            default: {
                return v1 == 1 || v1 == 700 || v1 == 800;
            }
        }
    }

    public SurfaceHolder gK() {
        return this.Zh;
    }

    private void h() {
        if(this.RD != null && !this.RD.isEmpty()) {
            this.RD.clear();
        }
    }

    private void i() {
        class com.bykv.vk.openvk.PjT.PjT.Zh.cr.h.a implements Runnable {
            final h a;

            @Override
            public void run() {
                if(h.this.cz == null) {
                    try {
                        com.bykv.vk.openvk.PjT.PjT.Zh.cr.g g0 = new com.bykv.vk.openvk.PjT.PjT.Zh.cr.g();
                        h.this.cz = g0;
                    }
                    catch(Throwable throwable0) {
                        throwable0.getMessage();
                    }
                    if(h.this.cz == null) {
                        return;
                    }
                    h.this.tT = "0";
                    h.this.cz.g(h.this);
                    h.this.cz.f(h.this);
                    h.this.cz.h(h.this);
                    h.this.cz.j(h.this);
                    h.this.cz.d(h.this);
                    h.this.cz.b(h.this);
                    h.this.cz.e(h.this);
                    try {
                        h.this.cz.ReZ(false);
                    }
                    catch(Throwable unused_ex) {
                    }
                    h.this.Au = false;
                }
            }
        }

        KM kM0 = this.xs;
        if(kM0 != null) {
            kM0.post(new com.bykv.vk.openvk.PjT.PjT.Zh.cr.h.a(this));
        }
    }

    private void j() {
        class com.bykv.vk.openvk.PjT.PjT.Zh.cr.h.e implements Runnable {
            final h a;

            @Override
            public void run() {
                if(h.this.xs != null) {
                    h.this.xs.sendEmptyMessage(104);
                }
            }
        }

        this.n(new com.bykv.vk.openvk.PjT.PjT.Zh.cr.h.e(this));
    }

    private void k() {
        if(this.SM) {
            return;
        }
        this.SM = true;
        for(Object object0: new ArrayList(this.RD)) {
            ((Runnable)object0).run();
        }
        this.RD.clear();
        this.SM = false;
    }

    private void l(int v, int v1) {
        switch(v) {
            case 701: {
                this.Zd = SystemClock.elapsedRealtime();
                ++this.ReZ;
                for(Object object0: this.yIW) {
                    WeakReference weakReference0 = (WeakReference)object0;
                    if(weakReference0 != null && weakReference0.get() != null) {
                        ((s.a.a)weakReference0.get()).PjT(this, 0x7FFFFFFF, 0, 0);
                    }
                }
                return;
            }
            case 702: {
                if(this.Zd > 0L) {
                    this.ig += SystemClock.elapsedRealtime() - this.Zd;
                    this.Zd = 0L;
                }
                for(Object object1: this.yIW) {
                    WeakReference weakReference1 = (WeakReference)object1;
                    if(weakReference1 != null && weakReference1.get() != null) {
                        ((s.a.a)weakReference1.get()).PjT(this, 0x7FFFFFFF);
                    }
                }
                return;
            }
            default: {
                if(this.rds && v == 3) {
                    this.a();
                    this.t();
                    this.Zh(this.Yo);
                }
            }
        }
    }

    public SurfaceTexture ltE() {
        return this.PjT;
    }

    private void m(long v) {
        this.wN.a(v);
        if(this.cRA) {
            this.n(this.wN);
            return;
        }
        if(this.p(this.iZZ)) {
            this.n(this.wN);
            return;
        }
        this.e(this.wN);
    }

    private void n(Runnable runnable0) {
        if(runnable0 != null && !this.Au()) {
            if(!this.DWo) {
                runnable0.run();
                return;
            }
            this.e(runnable0);
        }
    }

    private void o(String s) throws Throwable {
        FileInputStream fileInputStream0 = new FileInputStream(s);
        this.cz.c(fileInputStream0.getFD());
        fileInputStream0.close();
    }

    private boolean p(v.b b0) {
        return b0 != null && b0.cr();
    }

    private void q() {
        int v = h.Lrd.get(this.Sks);
        h.Lrd.put(this.Sks, v + 1);
    }

    public void qj() {
        class com.bykv.vk.openvk.PjT.PjT.Zh.cr.h.c implements Runnable {
            final h a;

            @Override
            public void run() {
                if(h.this.xs != null) {
                    h.this.xs.sendEmptyMessage(101);
                }
            }
        }


        class com.bykv.vk.openvk.PjT.PjT.Zh.cr.h.d implements Runnable {
            final h a;

            @Override
            public void run() {
                if(h.this.xs != null) {
                    h.this.xs.sendEmptyMessage(101);
                }
            }
        }

        if(this.Au()) {
            return;
        }
        KM kM0 = this.xs;
        if(kM0 != null) {
            kM0.removeMessages(100);
            this.qZS = true;
            if(this.rds) {
                if(!this.JQp && !this.p(this.iZZ)) {
                    this.e(new com.bykv.vk.openvk.PjT.PjT.Zh.cr.h.d(this));
                    return;
                }
                KM kM2 = this.xs;
                if(kM2 != null) {
                    kM2.sendEmptyMessage(101);
                }
            }
            else {
                if(!this.Owx && !this.p(this.iZZ)) {
                    this.e(new com.bykv.vk.openvk.PjT.PjT.Zh.cr.h.c(this));
                    return;
                }
                KM kM1 = this.xs;
                if(kM1 != null) {
                    kM1.sendEmptyMessage(101);
                }
            }
        }
    }

    public int qla() {
        return this.ReZ;
    }

    private void r() {
        class l implements Runnable {
            final h a;

            @Override
            public void run() {
                try {
                    h.this.cz.XX();
                    h.this.qj = 0xCF;
                    h.this.qZS = false;
                }
                catch(Throwable unused_ex) {
                }
            }
        }

        KM kM0 = this.xs;
        if(kM0 != null) {
            kM0.post(new l(this));
        }
    }

    private void s() {
        if(this.cz == null) {
            return;
        }
        try {
            this.cz.xf();
        }
        catch(Throwable unused_ex) {
        }
        this.cz.f(null);
        this.cz.e(null);
        this.cz.j(null);
        this.cz.b(null);
        this.cz.h(null);
        this.cz.g(null);
        this.cz.d(null);
        try {
            this.cz.qj();
        }
        catch(Throwable unused_ex) {
        }
    }

    private void t() {
        long v = SystemClock.elapsedRealtime() - this.ltE;
        for(Object object0: this.yIW) {
            WeakReference weakReference0 = (WeakReference)object0;
            if(weakReference0 != null && weakReference0.get() != null) {
                ((s.a.a)weakReference0.get()).PjT(this, v);
            }
        }
        this.JQp = true;
    }

    public long ub() {
        if(this.Au()) {
            return 0L;
        }
        if(this.qj == 206 || this.qj == 0xCF) {
            try {
                return this.cz.SM();
            }
            catch(Throwable unused_ex) {
            }
        }
        return 0L;
    }

    public long xE() {
        long v = this.gK;
        if(v != 0L) {
            return v;
        }
        if(this.qj == 206 || this.qj == 0xCF) {
            try {
                this.gK = this.cz.DWo();
            }
            catch(Throwable unused_ex) {
            }
        }
        return this.gK;
    }

    public void xf() {
        if(this.Au()) {
            return;
        }
        this.DWo = true;
        this.h();
        KM kM0 = this.xs;
        if(kM0 != null) {
            try {
                kM0.removeCallbacksAndMessages(null);
                if(this.cz != null) {
                    this.xs.sendEmptyMessage(103);
                }
            }
            catch(Throwable unused_ex) {
                this.b();
                return;
            }
            this.b();
        }
    }

    public boolean xs() {
        return this.qj == 205;
    }
}

