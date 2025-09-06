package com.bytedance.sdk.openadsdk.core.Zh;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.settings.SM;
import com.bytedance.sdk.openadsdk.core.ub;

public abstract class ReZ implements View.OnClickListener, View.OnTouchListener {
    public static class PjT {
        public int PjT;
        public double ReZ;
        public double Zh;
        public long cr;

        public PjT(int v, double f, double f1, long v1) {
            this.PjT = v;
            this.Zh = f;
            this.ReZ = f1;
            this.cr = v1;
        }
    }

    public SparseArray Co;
    private static long JQp = 0L;
    protected View Jo;
    protected int KM;
    protected float Lrd;
    private static float PjT = 0.0f;
    protected static int Qf = 8;
    protected float RD;
    private static float ReZ;
    protected float Sks;
    private int XX;
    protected int Yo;
    protected boolean ZX;
    private static float Zh;
    protected long cRA;
    private static float cr;
    private int cz;
    protected int iZZ;
    protected float tT;
    protected long yIW;

    static {
        if(ub.PjT() != null) {
            ReZ.Qf = ub.Zh();
        }
        ReZ.PjT = 0.0f;
        ReZ.Zh = 0.0f;
        ReZ.ReZ = 0.0f;
        ReZ.cr = 0.0f;
        ReZ.JQp = 0L;
    }

    public ReZ() {
        this.RD = -1.0f;
        this.Sks = -1.0f;
        this.tT = -1.0f;
        this.Lrd = -1.0f;
        this.cRA = -1L;
        this.yIW = -1L;
        this.iZZ = -1;
        this.Yo = 0xFFFFFC00;
        this.KM = -1;
        this.ZX = true;
        this.Co = new SparseArray();
        this.cz = 0;
        this.XX = 0;
    }

    private boolean PjT(View view0, Point point0) {
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                View view1 = ((ViewGroup)view0).getChildAt(v);
                if(Zh.ReZ(view1)) {
                    int[] arr_v = new int[2];
                    view1.getLocationOnScreen(arr_v);
                    if(view0.isShown()) {
                        int v1 = arr_v[0];
                        if(point0.x >= v1 && point0.x <= v1 + view1.getWidth()) {
                            int v2 = arr_v[1];
                            return point0.y >= v2 && point0.y <= v2 + view1.getHeight();
                        }
                    }
                    return false;
                }
                if(this.PjT(view1, point0)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected abstract void PjT(View arg1, float arg2, float arg3, float arg4, float arg5, SparseArray arg6, boolean arg7);

    public boolean XX() {
        return this.ZX;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(!SM.PjT()) {
            return;
        }
        this.PjT(view0, this.RD, this.Sks, this.tT, this.Lrd, this.Co, this.ZX);
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        int v1;
        this.Yo = motionEvent0.getDeviceId();
        this.iZZ = motionEvent0.getToolType(0);
        this.KM = motionEvent0.getSource();
        int v = 1;
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                this.cz = (int)motionEvent0.getRawX();
                this.XX = (int)motionEvent0.getRawY();
                this.RD = motionEvent0.getRawX();
                this.Sks = motionEvent0.getRawY();
                this.cRA = System.currentTimeMillis();
                this.iZZ = motionEvent0.getToolType(0);
                this.Yo = motionEvent0.getDeviceId();
                this.KM = motionEvent0.getSource();
                ReZ.JQp = System.currentTimeMillis();
                this.ZX = true;
                this.Jo = view0;
                com.bytedance.sdk.openadsdk.core.SM.ReZ.PjT(motionEvent0);
                v1 = 0;
                break;
            }
            case 1: {
                this.tT = motionEvent0.getRawX();
                this.Lrd = motionEvent0.getRawY();
                this.yIW = System.currentTimeMillis();
                if(Math.abs(this.tT - ((float)this.cz)) >= ((float)ReZ.Qf) || Math.abs(this.Lrd - ((float)this.XX)) >= ((float)ReZ.Qf)) {
                    this.ZX = false;
                }
                Point point0 = new Point(((int)this.tT), ((int)this.Lrd));
                if(view0 != null && !Zh.ReZ(view0) && this.PjT(((View)view0.getParent()), point0)) {
                    return true;
                }
                v1 = 3;
                break;
            }
            case 2: {
                ReZ.ReZ += Math.abs(motionEvent0.getX() - ReZ.PjT);
                ReZ.cr += Math.abs(motionEvent0.getY() - ReZ.Zh);
                ReZ.PjT = motionEvent0.getX();
                ReZ.Zh = motionEvent0.getY();
                if(System.currentTimeMillis() - ReZ.JQp <= 200L || ReZ.ReZ <= ((float)ReZ.Qf) && ReZ.cr <= ((float)ReZ.Qf)) {
                    v = 2;
                }
                this.tT = motionEvent0.getRawX();
                this.Lrd = motionEvent0.getRawY();
                if(Math.abs(this.tT - ((float)this.cz)) >= ((float)ReZ.Qf) || Math.abs(this.Lrd - ((float)this.XX)) >= ((float)ReZ.Qf)) {
                    this.ZX = false;
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
        this.Co.put(motionEvent0.getActionMasked(), new PjT(v1, ((double)motionEvent0.getSize()), ((double)motionEvent0.getPressure()), System.currentTimeMillis()));
        return false;
    }
}

