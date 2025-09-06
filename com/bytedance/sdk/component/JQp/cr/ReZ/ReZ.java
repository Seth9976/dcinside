package com.bytedance.sdk.component.JQp.cr.ReZ;

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
import com.bytedance.sdk.component.JQp.cr.Zh.JQp;
import com.bytedance.sdk.component.JQp.cr.Zh.cr;
import com.bytedance.sdk.component.JQp.fDm;
import com.bytedance.sdk.component.JQp.ltE;
import com.bytedance.sdk.component.JQp.qj;
import com.bytedance.sdk.component.JQp.xE;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

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
                ReZ.this.gK.post(new Runnable() {
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
                com.bytedance.sdk.component.JQp.cr.ReZ.ReZ.PjT.1 reZ$PjT$10 = new Runnable() {
                    final PjT ReZ;

                    @Override
                    public void run() {
                        imageView0.setImageBitmap(((Bitmap)qj0.Zh()));
                    }
                };
                ReZ.this.gK.post(reZ$PjT$10);
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
                com.bytedance.sdk.component.JQp.cr.ReZ.ReZ.PjT.2 reZ$PjT$20 = new Runnable() {
                    final PjT Zh;

                    @Override
                    public void run() {
                        if(PjT.this.Zh != null) {
                            PjT.this.Zh.PjT(qj0);
                        }
                    }
                };
                ReZ.this.gK.postAtFrontOfQueue(reZ$PjT$20);
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
        private ExecutorService Owx;
        private xE PjT;
        private boolean RD;
        private String ReZ;
        private int SM;
        private fDm Sks;
        private int XX;
        private ImageView Zh;
        private String cr;
        private Bitmap.Config cz;
        private String fDm;
        private int gK;
        private int ltE;
        private ltE qj;
        private com.bytedance.sdk.component.JQp.Zh qla;
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
            return new ReZ(this, null).RD();
        }

        @Override  // com.bytedance.sdk.component.JQp.DWo
        public SM PjT(xE xE0) {
            this.PjT = xE0;
            return new ReZ(this, null).RD();
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
    private byte[] KM;
    private int Lrd;
    private XX Owx;
    Future PjT;
    private int RD;
    private String ReZ;
    private int SM;
    private cz Sks;
    private Bitmap.Config XX;
    private fDm Yo;
    private String Zh;
    private int cRA;
    private String cr;
    private ImageView.ScaleType cz;
    private boolean fDm;
    private final Handler gK;
    private boolean iZZ;
    private boolean ltE;
    private int qj;
    private boolean qla;
    private com.bytedance.sdk.component.JQp.Zh tT;
    private int ub;
    private ltE xE;
    private WeakReference xf;
    private volatile boolean xs;
    private ExecutorService yIW;

    private ReZ(Zh reZ$Zh0) {
        this.gK = new Handler(Looper.getMainLooper());
        this.ltE = true;
        this.KM = null;
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
        this.tT = this.PjT(reZ$Zh0);
        if(!TextUtils.isEmpty(reZ$Zh0.ReZ)) {
            this.Zh(reZ$Zh0.ReZ);
            this.PjT(reZ$Zh0.ReZ);
        }
        this.fDm = reZ$Zh0.xf;
        this.qla = reZ$Zh0.xs;
        this.Sks = reZ$Zh0.xE;
        this.DWo = reZ$Zh0.ub;
        this.cRA = reZ$Zh0.ltE;
        this.Lrd = reZ$Zh0.gK;
        this.yIW = reZ$Zh0.Owx;
        this.iZZ = reZ$Zh0.RD;
        this.Yo = reZ$Zh0.Sks;
    }

    ReZ(Zh reZ$Zh0, com.bytedance.sdk.component.JQp.cr.ReZ.ReZ.1 reZ$10) {
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

    public String Owx() {
        return this.DWo() + this.xf();
    }

    private com.bytedance.sdk.component.JQp.Zh PjT(Zh reZ$Zh0) {
        if(reZ$Zh0.qla != null) {
            return reZ$Zh0.qla;
        }
        return TextUtils.isEmpty(reZ$Zh0.fDm) ? com.bytedance.sdk.component.JQp.cr.ReZ.PjT.Zh.DWo() : com.bytedance.sdk.component.JQp.cr.ReZ.PjT.Zh.PjT(new File(reZ$Zh0.fDm));
    }

    @Override  // com.bytedance.sdk.component.JQp.SM
    public String PjT() {
        return this.Zh;
    }

    public void PjT(int v) {
        this.RD = v;
    }

    public void PjT(String s) {
        this.cr = s;
    }

    public void PjT(boolean z) {
        this.ltE = z;
    }

    public void PjT(byte[] arr_b) {
        this.KM = arr_b;
    }

    private SM RD() {
        try {
            ExecutorService executorService0 = null;
            if(this.Sks == null) {
                xE xE0 = this.JQp;
                if(xE0 != null) {
                    xE0.PjT(1005, "not init !", null);
                    return this;
                }
                return this;
            }
            String s = this.PjT();
            if(TextUtils.isEmpty(s)) {
                this.JQp.PjT(2000, "url is empty", null);
                return this;
            }
            RD rD0 = this.Sks.JQp();
            if(!s.startsWith("http://") && !s.startsWith("https://") && rD0 != null) {
                rD0.PjT(1006, "url is not validate " + s);
            }
            if(this.yIW == null) {
                executorService0 = this.Sks.cr();
            }
            com.bytedance.sdk.component.JQp.cr.ReZ.ReZ.1 reZ$10 = new Runnable() {
                final ReZ PjT;

                @Override
                public void run() {
                    com.bytedance.sdk.component.JQp.cr.ReZ.PjT pjT0 = new com.bytedance.sdk.component.JQp.cr.ReZ.PjT(ReZ.this, ReZ.this.xE);
                    try {
                        ArrayList arrayList0 = new ArrayList();
                        arrayList0.add(new com.bytedance.sdk.component.JQp.cr.Zh.Zh());
                        arrayList0.add(new JQp());
                        arrayList0.add(new com.bytedance.sdk.component.JQp.cr.Zh.PjT());
                        arrayList0.add(new com.bytedance.sdk.component.JQp.cr.Zh.ReZ());
                        arrayList0.add(new cr());
                        for(int v = 0; v < arrayList0.size(); ++v) {
                            if(ReZ.this.xs) {
                                pjT0.PjT(1003, "canceled", null);
                                return;
                            }
                            com.bytedance.sdk.component.JQp.cr.Zh.cz cz0 = (com.bytedance.sdk.component.JQp.cr.Zh.cz)arrayList0.get(v);
                            if(ReZ.this.xE != null && cz0 != null && !"data_intercept".equals(cz0.PjT())) {
                                ReZ.this.xE.PjT(cz0.PjT(), ReZ.this);
                            }
                            boolean z = cz0.PjT(ReZ.this, ReZ.this.xE, pjT0);
                            if(ReZ.this.xE != null && !"data_intercept".equals(cz0.PjT())) {
                                ReZ.this.xE.Zh(cz0.PjT(), ReZ.this);
                            }
                            if(!z) {
                                break;
                            }
                        }
                        return;
                    }
                    catch(Throwable throwable0) {
                    }
                    pjT0.PjT(2000, throwable0.getMessage(), throwable0);
                }
            };
            if(this.iZZ) {
                reZ$10.run();
                return this;
            }
            ExecutorService executorService1 = this.yIW;
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

    @Override  // com.bytedance.sdk.component.JQp.SM
    public int ReZ() {
        return this.SM;
    }

    public String SM() {
        return this.cr;
    }

    public int XX() {
        return this.cRA;
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
        return this.Lrd;
    }

    public byte[] fDm() {
        return this.KM;
    }

    public com.bytedance.sdk.component.JQp.Zh gK() {
        return this.tT;
    }

    public fDm ltE() {
        return this.Yo;
    }

    public Bitmap.Config qj() {
        return this.XX;
    }

    public XX qla() {
        return this.Owx;
    }

    public cz ub() {
        return this.Sks;
    }

    public int xE() {
        return this.RD;
    }

    public int xf() {
        return this.qj;
    }

    public boolean xs() {
        return this.ltE;
    }
}

