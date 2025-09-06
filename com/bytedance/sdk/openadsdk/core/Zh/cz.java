package com.bytedance.sdk.openadsdk.core.Zh;

import android.util.SparseArray;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.core.ub;

public class cz {
    public int Au;
    public static int DWo = 8;
    public long JQp;
    public float PjT;
    public float ReZ;
    public int SM;
    public int XX;
    public float Zh;
    public float cr;
    public long cz;
    private static float fDm;
    private int gK;
    private int ltE;
    public boolean qj;
    private static float qla;
    private static long ub;
    private static float xE;
    public SparseArray xf;
    private static float xs;

    static {
        if(ub.PjT() != null) {
            cz.DWo = ub.Zh();
        }
        cz.xs = 0.0f;
        cz.fDm = 0.0f;
        cz.qla = 0.0f;
        cz.xE = 0.0f;
        cz.ub = 0L;
    }

    public cz() {
        this.PjT = -1.0f;
        this.Zh = -1.0f;
        this.ReZ = -1.0f;
        this.cr = -1.0f;
        this.JQp = -1L;
        this.cz = -1L;
        this.XX = -1;
        this.Au = 0xFFFFFC00;
        this.SM = -1;
        this.qj = true;
        this.xf = new SparseArray();
        this.gK = 0;
        this.ltE = 0;
    }

    public void PjT(MotionEvent motionEvent0) {
        int v1;
        this.Au = motionEvent0.getDeviceId();
        this.XX = motionEvent0.getToolType(0);
        this.SM = motionEvent0.getSource();
        int v = 1;
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                this.gK = (int)motionEvent0.getRawX();
                this.ltE = (int)motionEvent0.getRawY();
                this.PjT = motionEvent0.getRawX();
                this.Zh = motionEvent0.getRawY();
                this.JQp = System.currentTimeMillis();
                this.XX = motionEvent0.getToolType(0);
                this.Au = motionEvent0.getDeviceId();
                this.SM = motionEvent0.getSource();
                cz.ub = System.currentTimeMillis();
                this.qj = true;
                v1 = 0;
                break;
            }
            case 1: {
                this.ReZ = motionEvent0.getRawX();
                this.cr = motionEvent0.getRawY();
                this.cz = System.currentTimeMillis();
                if(Math.abs(this.ReZ - ((float)this.gK)) >= ((float)cz.DWo) || Math.abs(this.cr - ((float)this.ltE)) >= ((float)cz.DWo)) {
                    this.qj = false;
                }
                v1 = 3;
                break;
            }
            case 2: {
                cz.qla += Math.abs(motionEvent0.getX() - cz.xs);
                cz.xE += Math.abs(motionEvent0.getY() - cz.fDm);
                cz.xs = motionEvent0.getX();
                cz.fDm = motionEvent0.getY();
                if(System.currentTimeMillis() - cz.ub <= 200L || cz.qla <= ((float)cz.DWo) && cz.xE <= ((float)cz.DWo)) {
                    v = 2;
                }
                this.ReZ = motionEvent0.getRawX();
                this.cr = motionEvent0.getRawY();
                if(Math.abs(this.ReZ - ((float)this.gK)) >= ((float)cz.DWo) || Math.abs(this.cr - ((float)this.ltE)) >= ((float)cz.DWo)) {
                    this.qj = false;
                }
                v1 = v;
                break;
            }
            case 3: {
                v1 = 4;
                break;
            }
            default: {
                v1 = -1;
            }
        }
        this.xf.put(motionEvent0.getActionMasked(), new PjT(v1, ((double)motionEvent0.getSize()), ((double)motionEvent0.getPressure()), System.currentTimeMillis()));
    }
}

