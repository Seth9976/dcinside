package com.bytedance.sdk.openadsdk.cz;

import com.bytedance.sdk.openadsdk.core.ReZ;
import com.bytedance.sdk.openadsdk.core.fDm;

public class PjT {
    private int[] Au;
    private boolean DWo;
    private int[] JQp;
    private static volatile PjT PjT;
    private boolean ReZ;
    private int[] SM;
    private int[] XX;
    private boolean Zh;
    private boolean cr;
    private int[] cz;
    private boolean fDm;
    private boolean qj;
    private int qla;
    private boolean ub;
    private boolean xE;
    private int[] xf;
    private boolean xs;

    static {
    }

    private PjT() {
        this.Zh();
    }

    public boolean Au() {
        return this.cr;
    }

    public int[] DWo() {
        return this.cz;
    }

    public boolean JQp() {
        return this.xE;
    }

    public static PjT PjT() {
        if(PjT.PjT == null) {
            Class class0 = ReZ.class;
            __monitor_enter(class0);
            try {
                if(PjT.PjT == null) {
                    PjT.PjT = new PjT();
                }
                __monitor_exit(class0);
                return PjT.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return PjT.PjT;
    }

    private boolean PjT(String[] arr_s) {
        switch(arr_s.length) {
            case 1: {
                return "session".equals(arr_s[0]);
            }
            case 2: {
                return "session".equals(arr_s[1]);
            }
            default: {
                return false;
            }
        }
    }

    private int[] ReZ(String[] arr_s) {
        int[] arr_v = new int[arr_s.length];
        int v1 = 0;
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            try {
                int v2 = Integer.parseInt(s);
                arr_v[v1] = v2;
                if(v2 > 0) {
                    ++v1;
                }
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        if(v1 != arr_s.length) {
            int[] arr_v1 = new int[v1];
            System.arraycopy(arr_v, 0, arr_v1, 0, v1);
            return arr_v1;
        }
        return arr_v;
    }

    public boolean ReZ() {
        return this.fDm;
    }

    public int[] SM() {
        return this.JQp;
    }

    public boolean XX() {
        return this.ReZ;
    }

    private int[] Zh(String[] arr_s) {
        return arr_s.length <= 0 ? new int[0] : this.ReZ(arr_s[0].split(","));
    }

    public void Zh() {
        fDm.Zh().post(new Runnable() {
            final PjT PjT;

            @Override
            public void run() {
                boolean z = com.bytedance.sdk.openadsdk.RD.PjT.PjT("feature_switch", false);
                PjT.this.fDm = z;
                if(!PjT.this.fDm) {
                    return;
                }
                try {
                    boolean z1 = com.bytedance.sdk.openadsdk.RD.PjT.PjT("exclude_banner_native", false);
                    PjT.this.ub = z1;
                    int v = com.bytedance.sdk.openadsdk.RD.PjT.PjT("feature_timer_interval", 10000);
                    PjT.this.qla = v;
                    boolean z2 = com.bytedance.sdk.openadsdk.RD.PjT.PjT("enable_feature_cids", true);
                    PjT.this.xE = z2;
                    String[] arr_s = {"1,3,5", "session"};
                    String[] arr_s1 = {"1,3,5", "session"};
                    String[] arr_s2 = {"1,3,5", "session"};
                    boolean z3 = PjT.this.PjT(arr_s);
                    PjT.this.Zh = z3;
                    boolean z4 = PjT.this.PjT(arr_s1);
                    PjT.this.ReZ = z4;
                    boolean z5 = PjT.this.PjT(arr_s2);
                    PjT.this.cr = z5;
                    int[] arr_v = PjT.this.Zh(arr_s);
                    PjT.this.JQp = arr_v;
                    int[] arr_v1 = PjT.this.Zh(arr_s1);
                    PjT.this.cz = arr_v1;
                    int[] arr_v2 = PjT.this.Zh(arr_s2);
                    PjT.this.XX = arr_v2;
                    int[] arr_v3 = PjT.this.ReZ(new String[]{"1", "3", "5session"});
                    PjT.this.xf = arr_v3;
                    String[] arr_s3 = {"1,3,5", "session"};
                    String[] arr_s4 = {"1,3,5", "session"};
                    boolean z6 = PjT.this.PjT(arr_s3);
                    PjT.this.DWo = z6;
                    boolean z7 = PjT.this.PjT(arr_s4);
                    PjT.this.qj = z7;
                    int[] arr_v4 = PjT.this.Zh(arr_s3);
                    PjT.this.Au = arr_v4;
                    int[] arr_v5 = PjT.this.Zh(arr_s4);
                    PjT.this.SM = arr_v5;
                    boolean z8 = com.bytedance.sdk.openadsdk.RD.PjT.PjT("pag_video_30p_session", true);
                    PjT.this.xs = z8;
                }
                catch(Throwable unused_ex) {
                }
            }
        });
    }

    public int cr() {
        return this.qla;
    }

    public boolean cz() {
        return this.Zh;
    }

    public boolean fDm() {
        return this.DWo;
    }

    public boolean gK() {
        return this.ub;
    }

    public int[] qj() {
        return this.XX;
    }

    public boolean qla() {
        return this.qj;
    }

    public boolean ub() {
        return this.xs;
    }

    public int[] xE() {
        return this.xf;
    }

    public int[] xf() {
        return this.Au;
    }

    public int[] xs() {
        return this.SM;
    }
}

