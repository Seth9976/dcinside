package com.bytedance.sdk.component.adexpress.PjT.Zh;

import android.text.TextUtils;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.adexpress.PjT.PjT.PjT;
import com.bytedance.sdk.component.utils.Sks;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class JQp extends ReZ {
    private AtomicLong Au;
    private boolean JQp;
    private static File PjT;
    private AtomicBoolean ReZ;
    private AtomicInteger XX;
    private static volatile JQp Zh;
    private AtomicBoolean cr;
    private AtomicBoolean cz;

    private JQp() {
        this.ReZ = new AtomicBoolean(true);
        this.cr = new AtomicBoolean(false);
        this.JQp = false;
        this.cz = new AtomicBoolean(false);
        this.XX = new AtomicInteger(0);
        this.Au = new AtomicLong();
        this.DWo();
    }

    public static File Au() {
        if(JQp.PjT == null) {
            try {
                File file0 = new File(new File(cr.PjT(), "tt_tmpl_pkg"), "template");
                file0.mkdirs();
                JQp.PjT = file0;
            }
            catch(Throwable unused_ex) {
            }
        }
        return JQp.PjT;
    }

    private void DWo() {
        com.bytedance.sdk.component.adexpress.cr.cr.Zh(new Au("init") {
            final JQp PjT;

            @Override
            public void run() {
                com.bytedance.sdk.component.adexpress.PjT.Zh.Au.PjT();
                JQp.this.ReZ.set(false);
                JQp.this.cr();
                JQp.this.XX();
                if(PjT.PjT().ReZ() != null && Sks.PjT(PjT.PjT().ReZ().Zh())) {
                    PjT.PjT().ReZ().ReZ().post(new Runnable() {
                        final com.bytedance.sdk.component.adexpress.PjT.Zh.JQp.1 PjT;

                        @Override
                        public void run() {
                            if(PjT.PjT().ReZ() != null) {
                                PjT.PjT().ReZ().cr();
                            }
                        }
                    });
                }
            }
        }, 10);
    }

    public boolean JQp() {
        return this.JQp;
    }

    @Override  // com.bytedance.sdk.component.adexpress.PjT.Zh.ReZ
    public File PjT() {
        return JQp.Au();
    }

    public void PjT(boolean z) {
        boolean z3;
        List list0;
        if(this.ReZ.get()) {
            return;
        }
        try {
            if(this.cr.get()) {
                if(z) {
                    this.XX.getAndIncrement();
                }
                return;
            }
            boolean z1 = true;
            this.cr.set(true);
            com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT pjT0 = PjT.PjT().ReZ().JQp();
            com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT pjT1 = com.bytedance.sdk.component.adexpress.PjT.Zh.Au.Zh();
            if(pjT0 != null && pjT0.Au()) {
                if(!com.bytedance.sdk.component.adexpress.PjT.Zh.Au.Zh(pjT0)) {
                    this.cr.set(false);
                    this.Au.set(System.currentTimeMillis());
                    return;
                }
                if(PjT.PjT().ReZ() != null) {
                    PjT.PjT().ReZ().ReZ().post(new Runnable() {
                        final JQp PjT;

                        @Override
                        public void run() {
                            com.bytedance.sdk.component.adexpress.JQp.JQp.PjT().Zh();
                        }
                    });
                }
                com.bytedance.sdk.component.adexpress.PjT.Zh.Au.PjT(pjT0);
                boolean z2 = pjT0.JQp() == null || TextUtils.isEmpty(pjT0.JQp().PjT()) ? false : this.PjT(pjT0.JQp().PjT());
                if(pjT0.PjT().size() == 0) {
                    list0 = null;
                    z3 = z2;
                }
                else {
                    list0 = this.PjT(pjT0, pjT1);
                    z3 = list0 == null ? false : true;
                }
                if(!z2) {
                    List list1 = this.Zh(pjT0, pjT1);
                    if(list0 == null || list1 == null) {
                        list0 = list1;
                    }
                    else {
                        list0.addAll(list1);
                    }
                    if(list1 == null) {
                        z1 = false;
                    }
                    if(list1 == null) {
                        this.cr.set(false);
                    }
                    z3 = z1;
                }
                if(z3 && this.PjT(pjT0)) {
                    com.bytedance.sdk.component.adexpress.PjT.Zh.Au.PjT(pjT0);
                    com.bytedance.sdk.component.adexpress.PjT.Zh.Au.ReZ();
                    this.Zh(list0);
                }
                this.cr();
                this.cr.set(false);
                this.Au.set(System.currentTimeMillis());
                this.qj();
                return;
            }
            this.cr.set(false);
            this.PjT(109);
        }
        catch(Throwable unused_ex) {
        }
    }

    // 去混淆评级： 低(40)
    public boolean PjT(com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT pjT0) {
        return pjT0 == null ? false : this.PjT(pjT0.PjT()) || this.PjT(pjT0.JQp()) || this.PjT(pjT0.cz());
    }

    public void ReZ() {
        this.DWo();
    }

    public void SM() {
        this.cz.set(true);
        this.JQp = false;
        this.cr.set(false);
    }

    public void XX() {
        this.PjT(false);
    }

    public static JQp Zh() {
        if(JQp.Zh == null) {
            Class class0 = JQp.class;
            __monitor_enter(class0);
            try {
                if(JQp.Zh == null) {
                    JQp.Zh = new JQp();
                }
                __monitor_exit(class0);
                return JQp.Zh;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return JQp.Zh;
    }

    public void Zh(boolean z) {
        this.cz.set(z);
    }

    public void cr() {
        com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT pjT0 = com.bytedance.sdk.component.adexpress.PjT.Zh.Au.Zh();
        if(pjT0 != null && pjT0.Au()) {
            boolean z = this.PjT(pjT0);
            if(!z) {
                com.bytedance.sdk.component.adexpress.PjT.Zh.Au.cr();
            }
            this.JQp = z;
        }
    }

    public com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT cz() {
        return com.bytedance.sdk.component.adexpress.PjT.Zh.Au.Zh();
    }

    private void qj() {
        if(this.XX.getAndSet(0) > 0 && System.currentTimeMillis() - this.Au.get() > 600000L) {
            this.XX();
        }
    }
}

