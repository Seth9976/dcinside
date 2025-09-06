package com.bytedance.sdk.component.cz.PjT;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.cz.PjT.Zh.ReZ.ReZ;
import com.bytedance.sdk.component.cz.PjT.Zh.Zh.PjT;
import com.bytedance.sdk.component.cz.PjT.Zh.Zh.Zh;
import com.bytedance.sdk.component.utils.Sks;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public class cr {
    public static final cr PjT;

    static {
        cr.PjT = new cr();
    }

    private void PjT(int v) {
        if(v == 0) {
            PjT.PjT();
            return;
        }
        if(v == 1) {
            Zh.PjT();
        }
    }

    private void PjT(com.bytedance.sdk.component.cz.PjT.PjT pjT0) {
        if(Looper.myLooper() != Looper.getMainLooper() && com.bytedance.sdk.component.cz.PjT.ReZ.PjT.Zh()) {
            com.bytedance.sdk.component.cz.PjT.ReZ.PjT.PjT();
            return;
        }
        JQp jQp0 = pjT0.cr();
        if(jQp0 != null && com.bytedance.sdk.component.cz.PjT.ReZ.PjT.Zh()) {
            Executor executor0 = jQp0.JQp();
            if(executor0 != null) {
                executor0.execute(new Runnable() {
                    final cr PjT;

                    @Override
                    public void run() {
                        com.bytedance.sdk.component.cz.PjT.ReZ.PjT.PjT();
                    }
                });
            }
        }
    }

    private void PjT(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0, int v) {
        if(v == 0) {
            PjT.PjT(pjT0);
            return;
        }
        if(v == 1) {
            Zh.PjT(pjT0);
        }
    }

    private void PjT(String s, int v, boolean z) {
        if(v == 0) {
            PjT.PjT(s);
            return;
        }
        if(v == 1) {
            Zh.PjT(s, z);
        }
    }

    private void PjT(String s, List list0, boolean z, int v, int v1, String s1) {
        if(v == 0) {
            PjT.PjT(s, list0, z);
            return;
        }
        if(v == 1) {
            Zh.PjT(s, list0, z, v1, s1);
        }
    }

    private boolean PjT(Context context0, JQp jQp0) {
        if(context0 != null && jQp0 != null) {
            switch(jQp0.cz()) {
                case 1: {
                    return jQp0.fDm();
                }
                case 2: {
                    return true;
                }
                default: {
                    try {
                        return Sks.PjT(context0);
                    }
                    catch(Throwable throwable0) {
                        throwable0.getMessage();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void PjT() {
        JQp jQp0 = Au.XX().xE();
        if(jQp0 != null && Au.XX().cz() != null && jQp0.cr() != null) {
            if(Au.XX().Zh()) {
                if(this.PjT(Au.XX().cz(), jQp0)) {
                    Au.XX().SM();
                    return;
                }
                if(this.ReZ()) {
                    jQp0.cr().execute(new com.bytedance.sdk.component.cz.PjT.JQp.JQp("start") {
                        final cr Zh;

                        @Override
                        public void run() {
                            int v = jQp0.cz();
                            cr.this.PjT(v);
                        }
                    });
                    return;
                }
                this.PjT(jQp0.cz());
                return;
            }
            Au.XX().SM();
        }
    }

    public void PjT(com.bytedance.sdk.component.cz.PjT.PjT pjT0, Context context0) {
        this.Zh(pjT0, context0);
        Au.XX().PjT(context0);
        Au.XX().PjT(pjT0.DWo());
        Au.XX().Zh(pjT0.XX());
        Au.XX().ReZ(pjT0.Au());
        Au.XX().PjT(pjT0.Zh());
        Au.XX().cr(pjT0.SM());
        Au.XX().JQp(pjT0.cz());
        Au au0 = Au.XX();
        com.bytedance.sdk.component.cz.PjT.PjT.JQp jQp0 = pjT0.PjT() == null ? com.bytedance.sdk.component.cz.PjT.PjT.PjT.JQp.PjT : pjT0.PjT();
        au0.PjT(jQp0);
        Au.XX().Zh(pjT0.qj());
        Au.XX().PjT(pjT0.cr());
        Au.XX().PjT(pjT0.ReZ());
        Au.XX().PjT(pjT0.JQp());
        ReZ.PjT(pjT0.xs());
        ReZ.Zh(pjT0.xf());
        this.PjT(pjT0);
    }

    public void PjT(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        this.Zh(pjT0);
    }

    public void PjT(String s, List list0, boolean z, Map map0, int v, String s1) {
        JQp jQp0 = Au.XX().xE();
        if(jQp0 == null || Au.XX().cz() == null || jQp0.cr() == null || !jQp0.Au()) {
            return;
        }
        switch(jQp0.cz()) {
            case 0: {
                if(TextUtils.isEmpty(s) || list0 == null || list0.isEmpty()) {
                    return;
                }
                break;
            }
            case 1: {
                if(list0 == null || list0.isEmpty()) {
                    return;
                }
            }
        }
        if(Au.XX().Zh() && !this.PjT(Au.XX().cz(), jQp0)) {
            if(this.ReZ()) {
                jQp0.cr().execute(new com.bytedance.sdk.component.cz.PjT.JQp.JQp("trackFailed") {
                    final cr XX;

                    @Override
                    public void run() {
                        int v = jQp0.cz();
                        cr.this.PjT(s, list0, z, v, v, s1);
                    }
                });
                return;
            }
            this.PjT(s, list0, z, jQp0.cz(), v, s1);
            return;
        }
        Au.XX().PjT(s, list0, z, map0, v, s1);
    }

    public void PjT(String s, boolean z) {
        JQp jQp0 = Au.XX().xE();
        if(jQp0 == null || Au.XX().cz() == null || jQp0.cr() == null || !jQp0.Au()) {
            return;
        }
        if(jQp0.cz() == 0 && TextUtils.isEmpty(s)) {
            return;
        }
        if(Au.XX().Zh() && !this.PjT(Au.XX().cz(), jQp0)) {
            if(this.ReZ()) {
                jQp0.cr().execute(new com.bytedance.sdk.component.cz.PjT.JQp.JQp("trackFailed") {
                    final cr cr;

                    @Override
                    public void run() {
                        int v = jQp0.cz();
                        cr.this.PjT(s, v, z);
                    }
                });
                return;
            }
            this.PjT(s, jQp0.cz(), z);
            return;
        }
        Au.XX().PjT(s, z);
    }

    public void PjT(boolean z) {
        Au.XX().PjT(z);
    }

    private boolean ReZ() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    private void Zh(int v) {
        if(v == 0) {
            PjT.Zh();
            return;
        }
        if(v == 1) {
            Zh.Zh();
        }
    }

    private void Zh(com.bytedance.sdk.component.cz.PjT.PjT pjT0, Context context0) {
        com.bytedance.sdk.component.cz.PjT.ReZ.PjT(context0, "context == null");
        com.bytedance.sdk.component.cz.PjT.ReZ.PjT(pjT0, "AdLogConfig == null");
        com.bytedance.sdk.component.cz.PjT.ReZ.PjT(pjT0.cr(), "AdLogDepend ==null");
    }

    private void Zh(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        JQp jQp0 = Au.XX().xE();
        if(pjT0 != null && jQp0 != null && Au.XX().cz() != null && jQp0.cr() != null) {
            if(Au.XX().Zh()) {
                if(this.PjT(Au.XX().cz(), jQp0)) {
                    Au.XX().PjT(pjT0);
                    return;
                }
                this.ReZ();
                if(this.ReZ()) {
                    jQp0.cr().execute(new com.bytedance.sdk.component.cz.PjT.JQp.JQp("dispatchEvent") {
                        final cr ReZ;

                        @Override
                        public void run() {
                            int v = jQp0.cz();
                            cr.this.PjT(pjT0, v);
                        }
                    });
                    return;
                }
                this.PjT(pjT0, jQp0.cz());
                return;
            }
            Au.XX().PjT(pjT0);
        }
    }

    public void Zh() {
        JQp jQp0 = Au.XX().xE();
        if(jQp0 != null && Au.XX().cz() != null && jQp0.cr() != null) {
            if(Au.XX().Zh()) {
                if(this.PjT(Au.XX().cz(), jQp0)) {
                    Au.XX().qj();
                    return;
                }
                if(this.ReZ()) {
                    jQp0.cr().execute(new com.bytedance.sdk.component.cz.PjT.JQp.JQp("stop") {
                        final cr Zh;

                        @Override
                        public void run() {
                            int v = jQp0.cz();
                            cr.this.Zh(v);
                        }
                    });
                    return;
                }
                this.Zh(jQp0.cz());
                return;
            }
            Au.XX().qj();
        }
    }
}

