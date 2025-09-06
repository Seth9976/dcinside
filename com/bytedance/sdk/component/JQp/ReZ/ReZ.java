package com.bytedance.sdk.component.JQp.ReZ;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import com.bytedance.sdk.component.JQp.Au;
import com.bytedance.sdk.component.JQp.DWo;
import com.bytedance.sdk.component.JQp.RD;
import com.bytedance.sdk.component.JQp.SM;
import com.bytedance.sdk.component.JQp.XX;
import com.bytedance.sdk.component.JQp.fDm;
import com.bytedance.sdk.component.JQp.ltE;
import com.bytedance.sdk.component.JQp.qj;
import com.bytedance.sdk.component.JQp.xE;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

public class ReZ implements SM {
    class PjT implements xE {
        final ReZ PjT;
        private xE Zh;

        public PjT(xE xE0) {
            this.Zh = xE0;
        }

        private boolean PjT(ImageView imageView0) {
            if(imageView0 != null) {
                Object object0 = imageView0.getTag(0x413C0901);
                return object0 != null && object0.equals(ReZ.this.ReZ);
            }
            return false;
        }

        @Override  // com.bytedance.sdk.component.JQp.xE
        public void PjT(int v, String s, Throwable throwable0) {
            if(ReZ.this.ub == 5) {
                ReZ.this.ltE.post(new Runnable() {
                    final PjT cr;

                    @Override
                    public void run() {
                        if(PjT.this.Zh != null) {
                            PjT.this.Zh.PjT(v, s, throwable0);
                        }
                    }
                });
                return;
            }
            xE xE0 = this.Zh;
            if(xE0 != null) {
                xE0.PjT(v, s, throwable0);
            }
        }

        @Override  // com.bytedance.sdk.component.JQp.xE
        public void PjT(qj qj0) {
            ImageView imageView0 = (ImageView)ReZ.this.xf.get();
            if(imageView0 != null && ReZ.this.qj != 3 && this.PjT(imageView0) && qj0.Zh() instanceof Bitmap) {
                com.bytedance.sdk.component.JQp.ReZ.ReZ.PjT.1 reZ$PjT$10 = new Runnable() {
                    final PjT ReZ;

                    @Override
                    public void run() {
                        imageView0.setImageBitmap(((Bitmap)qj0.Zh()));
                    }
                };
                ReZ.this.ltE.post(reZ$PjT$10);
            }
            try {
                if(ReZ.this.DWo != null && qj0.Zh() instanceof Bitmap) {
                    Bitmap bitmap0 = ReZ.this.DWo.PjT(((Bitmap)qj0.Zh()));
                    if(bitmap0 != null) {
                        qj0.PjT(bitmap0);
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
            if(ReZ.this.ub == 5) {
                com.bytedance.sdk.component.JQp.ReZ.ReZ.PjT.2 reZ$PjT$20 = new Runnable() {
                    final PjT Zh;

                    @Override
                    public void run() {
                        if(PjT.this.Zh != null) {
                            PjT.this.Zh.PjT(qj0);
                        }
                    }
                };
                ReZ.this.ltE.postAtFrontOfQueue(reZ$PjT$20);
                return;
            }
            xE xE0 = this.Zh;
            if(xE0 != null) {
                xE0.PjT(qj0);
            }
        }
    }

    public static class Zh implements DWo {
        private int Au;
        private int DWo;
        private ImageView.ScaleType JQp;
        private boolean Owx;
        private xE PjT;
        private ExecutorService RD;
        private String ReZ;
        private int SM;
        private boolean Sks;
        private int XX;
        private ImageView Zh;
        private String cr;
        private Bitmap.Config cz;
        private String fDm;
        private int gK;
        private int ltE;
        private ltE qj;
        private com.bytedance.sdk.component.JQp.Zh qla;
        private fDm tT;
        private Au ub;
        private cz xE;
        private boolean xf;
        private boolean xs;

        public Zh(cz cz0) {
            this.SM = 1;
            this.DWo = 5;
            this.xE = cz0;
        }

        @Override  // com.bytedance.sdk.component.JQp.DWo
        public DWo JQp(int v) {
            this.ltE = v;
            return this;
        }

        @Override  // com.bytedance.sdk.component.JQp.DWo
        public DWo PjT(int v) {
            this.XX = v;
            return this;
        }

        @Override  // com.bytedance.sdk.component.JQp.DWo
        public DWo PjT(Bitmap.Config bitmap$Config0) {
            this.cz = bitmap$Config0;
            return this;
        }

        @Override  // com.bytedance.sdk.component.JQp.DWo
        public DWo PjT(ImageView.ScaleType imageView$ScaleType0) {
            this.JQp = imageView$ScaleType0;
            return this;
        }

        @Override  // com.bytedance.sdk.component.JQp.DWo
        public DWo PjT(Au au0) {
            this.ub = au0;
            return this;
        }

        @Override  // com.bytedance.sdk.component.JQp.DWo
        public DWo PjT(ltE ltE0) {
            this.qj = ltE0;
            return this;
        }

        @Override  // com.bytedance.sdk.component.JQp.DWo
        public DWo PjT(String s) {
            this.ReZ = s;
            return this;
        }

        @Override  // com.bytedance.sdk.component.JQp.DWo
        public DWo PjT(boolean z) {
            this.xs = z;
            return this;
        }

        @Override  // com.bytedance.sdk.component.JQp.DWo
        public SM PjT(ImageView imageView0) {
            this.Zh = imageView0;
            return new ReZ(this, null).tT();
        }

        @Override  // com.bytedance.sdk.component.JQp.DWo
        public SM PjT(xE xE0) {
            this.PjT = xE0;
            return new ReZ(this, null).tT();
        }

        @Override  // com.bytedance.sdk.component.JQp.DWo
        public SM PjT(xE xE0, int v) {
            this.DWo = v;
            return this.PjT(xE0);
        }

        @Override  // com.bytedance.sdk.component.JQp.DWo
        public DWo ReZ(int v) {
            this.SM = v;
            return this;
        }

        public DWo ReZ(String s) {
            this.cr = s;
            return this;
        }

        @Override  // com.bytedance.sdk.component.JQp.DWo
        public DWo Zh(int v) {
            this.Au = v;
            return this;
        }

        @Override  // com.bytedance.sdk.component.JQp.DWo
        public DWo Zh(String s) {
            this.fDm = s;
            return this;
        }

        @Override  // com.bytedance.sdk.component.JQp.DWo
        public DWo cr(int v) {
            this.gK = v;
            return this;
        }
    }

    private int Au;
    private Au DWo;
    private xE JQp;
    private ExecutorService KM;
    private com.bytedance.sdk.component.JQp.ReZ.PjT Lrd;
    private boolean Owx;
    Future PjT;
    private boolean Qf;
    private XX RD;
    private String ReZ;
    private int SM;
    private int Sks;
    private Bitmap.Config XX;
    private boolean Yo;
    private fDm ZX;
    private String Zh;
    private com.bytedance.sdk.component.JQp.Zh cRA;
    private String cr;
    private ImageView.ScaleType cz;
    private boolean fDm;
    private Queue gK;
    private int iZZ;
    private final Handler ltE;
    private int qj;
    private boolean qla;
    private cz tT;
    private int ub;
    private ltE xE;
    private WeakReference xf;
    private volatile boolean xs;
    private int yIW;

    private ReZ(Zh reZ$Zh0) {
        this.gK = new LinkedBlockingQueue();
        this.ltE = new Handler(Looper.getMainLooper());
        this.Owx = true;
        this.Zh = reZ$Zh0.cr;
        this.JQp = new PjT(this, reZ$Zh0.PjT);
        this.xf = new WeakReference(reZ$Zh0.Zh);
        this.cz = reZ$Zh0.JQp;
        this.XX = reZ$Zh0.cz;
        this.Au = reZ$Zh0.XX;
        this.SM = reZ$Zh0.Au;
        this.qj = reZ$Zh0.SM;
        this.ub = reZ$Zh0.DWo;
        this.xE = reZ$Zh0.qj;
        this.cRA = this.PjT(reZ$Zh0);
        if(!TextUtils.isEmpty(reZ$Zh0.ReZ)) {
            this.Zh(reZ$Zh0.ReZ);
            this.PjT(reZ$Zh0.ReZ);
        }
        this.fDm = reZ$Zh0.xf;
        this.qla = reZ$Zh0.xs;
        this.tT = reZ$Zh0.xE;
        this.DWo = reZ$Zh0.ub;
        this.iZZ = reZ$Zh0.ltE;
        this.yIW = reZ$Zh0.gK;
        this.KM = reZ$Zh0.RD;
        this.Yo = reZ$Zh0.Owx;
        this.Qf = reZ$Zh0.Sks;
        this.ZX = reZ$Zh0.tT;
        this.gK.add(new com.bytedance.sdk.component.JQp.JQp.ReZ());
    }

    ReZ(Zh reZ$Zh0, com.bytedance.sdk.component.JQp.ReZ.ReZ.1 reZ$10) {
        this(reZ$Zh0);
    }

    public xE Au() {
        return this.JQp;
    }

    public String DWo() {
        return this.ReZ;
    }

    @Override  // com.bytedance.sdk.component.JQp.SM
    public Bitmap.Config JQp() {
        return this.XX;
    }

    public boolean Owx() {
        return this.Yo;
    }

    private com.bytedance.sdk.component.JQp.Zh PjT(Zh reZ$Zh0) {
        if(reZ$Zh0.qla != null) {
            return reZ$Zh0.qla;
        }
        return TextUtils.isEmpty(reZ$Zh0.fDm) ? com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.DWo() : com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT(new File(reZ$Zh0.fDm));
    }

    private void PjT(int v, String s, Throwable throwable0) {
        new com.bytedance.sdk.component.JQp.JQp.Au(v, s, throwable0).PjT(this);
        this.gK.clear();
    }

    @Override  // com.bytedance.sdk.component.JQp.SM
    public String PjT() {
        return this.Zh;
    }

    public void PjT(int v) {
        this.Sks = v;
    }

    public void PjT(com.bytedance.sdk.component.JQp.ReZ.PjT pjT0) {
        this.Lrd = pjT0;
    }

    public void PjT(XX xX0) {
        this.RD = xX0;
    }

    public void PjT(String s) {
        this.cr = s;
    }

    public void PjT(boolean z) {
        this.Owx = z;
    }

    // 去混淆评级： 低(20)
    public boolean PjT(com.bytedance.sdk.component.JQp.JQp.SM sM0) {
        return this.xs ? false : this.gK.add(sM0);
    }

    public fDm RD() {
        return this.ZX;
    }

    @Override  // com.bytedance.sdk.component.JQp.SM
    public int ReZ() {
        return this.SM;
    }

    public String SM() {
        return this.cr;
    }

    public String Sks() {
        return this.DWo() + this.xf();
    }

    public int XX() {
        return this.iZZ;
    }

    @Override  // com.bytedance.sdk.component.JQp.SM
    public int Zh() {
        return this.Au;
    }

    public void Zh(String s) {
        if(this.xf != null && this.xf.get() != null) {
            ((ImageView)this.xf.get()).setTag(0x413C0901, s);
        }
        this.ReZ = s;
    }

    @Override  // com.bytedance.sdk.component.JQp.SM
    public ImageView.ScaleType cr() {
        return this.cz;
    }

    public int cz() {
        return this.yIW;
    }

    public boolean fDm() {
        return this.qla;
    }

    public cz gK() {
        return this.tT;
    }

    public com.bytedance.sdk.component.JQp.Zh ltE() {
        return this.cRA;
    }

    public Bitmap.Config qj() {
        return this.XX;
    }

    public boolean qla() {
        return this.Owx;
    }

    private SM tT() {
        try {
            ExecutorService executorService0 = null;
            if(this.tT == null) {
                xE xE0 = this.JQp;
                if(xE0 != null) {
                    xE0.PjT(1005, "not init !", null);
                    return this;
                }
                return this;
            }
            String s = this.PjT();
            if(TextUtils.isEmpty(s)) {
                xE xE1 = this.JQp;
                if(xE1 != null) {
                    xE1.PjT(2000, "url is empty", null);
                }
                return this;
            }
            RD rD0 = this.tT.JQp();
            if(!s.startsWith("http://") && !s.startsWith("https://") && rD0 != null) {
                rD0.PjT(1006, "url is not validate " + s);
            }
            if(this.KM == null) {
                executorService0 = this.tT.XX();
            }
            com.bytedance.sdk.component.JQp.ReZ.ReZ.1 reZ$10 = new Runnable() {
                final ReZ PjT;

                @Override
                public void run() {
                    try {
                        while(!ReZ.this.xs) {
                            com.bytedance.sdk.component.JQp.JQp.SM sM0 = (com.bytedance.sdk.component.JQp.JQp.SM)ReZ.this.gK.poll();
                            if(sM0 == null) {
                                break;
                            }
                            if(ReZ.this.xE != null) {
                                ReZ.this.xE.PjT(sM0.PjT(), ReZ.this);
                            }
                            sM0.PjT(ReZ.this);
                            if(ReZ.this.xE != null) {
                                ReZ.this.xE.Zh(sM0.PjT(), ReZ.this);
                            }
                        }
                        if(ReZ.this.xs) {
                            ReZ.this.PjT(1003, "canceled", null);
                        }
                        return;
                    }
                    catch(Throwable throwable0) {
                    }
                    ReZ.this.PjT(2000, throwable0.getMessage(), throwable0);
                    if(ReZ.this.xE != null) {
                        ReZ.this.xE.Zh("exception", ReZ.this);
                    }
                }
            };
            if(this.Qf) {
                reZ$10.run();
                return this;
            }
            ExecutorService executorService1 = this.KM;
            if(executorService1 != null) {
                this.PjT = executorService1.submit(reZ$10);
                return this;
            }
            if(executorService0 != null) {
                this.PjT = executorService0.submit(reZ$10);
                return this;
            }
        }
        catch(Exception exception0) {
            Log.e("ImageRequest", exception0.getMessage());
        }
        return this;
    }

    public int ub() {
        return this.Sks;
    }

    public XX xE() {
        return this.RD;
    }

    public int xf() {
        return this.qj;
    }

    public boolean xs() {
        return this.fDm;
    }
}

