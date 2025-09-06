package com.bytedance.adsdk.ugeno.yoga;

import com.bytedance.adsdk.ugeno.yoga.PjT.PjT;
import java.util.ArrayList;
import java.util.List;

@PjT
public abstract class YogaNodeJNIBase extends xf implements Cloneable {
    private ReZ JQp;
    protected long PjT;
    private List ReZ;
    private boolean XX;
    private YogaNodeJNIBase Zh;
    @PjT
    private float[] arr;
    private SM cr;
    private Object cz;
    @PjT
    private int mLayoutDirection;

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    private YogaNodeJNIBase(long v) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.XX = true;
        if(v == 0L) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.PjT = v;
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public float Au() {
        return this.arr == null ? 0.0f : this.arr[2];
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void Au(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.PjT, f);
    }

    public YogaNodeJNIBase DWo() {
        return this.Zh;
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void DWo(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.PjT, f);
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public float JQp() {
        return this.arr == null ? 0.0f : this.arr[3];
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void JQp(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.PjT, f);
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public int PjT() {
        return this.ReZ == null ? 0 : this.ReZ.size();
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public int PjT(xf xf0) {
        return this.ReZ == null ? -1 : this.ReZ.indexOf(xf0);
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public xf PjT(int v) {
        return this.ReZ(v);
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void PjT(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.PjT, f);
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void PjT(float f, float f1) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(this);
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            List list0 = ((YogaNodeJNIBase)arrayList0.get(v1)).ReZ;
            if(list0 != null) {
                for(Object object0: list0) {
                    arrayList0.add(((YogaNodeJNIBase)object0));
                }
            }
        }
        Object[] arr_object = arrayList0.toArray(new YogaNodeJNIBase[arrayList0.size()]);
        long[] arr_v = new long[((YogaNodeJNIBase[])arr_object).length];
        for(int v = 0; v < ((YogaNodeJNIBase[])arr_object).length; ++v) {
            arr_v[v] = ((YogaNodeJNIBase[])arr_object)[v].PjT;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.PjT, f, f1, arr_v, ((YogaNodeJNIBase[])arr_object));
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void PjT(JQp jQp0, float f) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.PjT, jQp0.PjT(), f);
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void PjT(SM sM0) {
        this.cr = sM0;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.PjT, sM0 != null);
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void PjT(XX xX0) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.PjT, xX0.PjT());
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void PjT(Zh zh0) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.PjT, zh0.PjT());
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void PjT(cr cr0) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.PjT, cr0.PjT());
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void PjT(cz cz0) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.PjT, cz0.PjT());
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void PjT(qla qla0) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.PjT, qla0.PjT());
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void PjT(xE xE0) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.PjT, xE0.PjT());
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void PjT(xf xf0, int v) {
        if(!(xf0 instanceof YogaNodeJNIBase)) {
            return;
        }
        if(((YogaNodeJNIBase)xf0).Zh != null) {
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
        if(this.ReZ == null) {
            this.ReZ = new ArrayList(4);
        }
        this.ReZ.add(v, ((YogaNodeJNIBase)xf0));
        ((YogaNodeJNIBase)xf0).Zh = this;
        YogaNative.jni_YGNodeInsertChildJNI(this.PjT, ((YogaNodeJNIBase)xf0).PjT, v);
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void PjT(Object object0) {
        this.cz = object0;
    }

    public YogaNodeJNIBase ReZ(int v) {
        List list0 = this.ReZ;
        if(list0 == null) {
            throw new IllegalStateException("YogaNode does not have children");
        }
        return (YogaNodeJNIBase)list0.get(v);
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void ReZ() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.PjT);
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void ReZ(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.PjT, f);
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void ReZ(JQp jQp0, float f) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.PjT, jQp0.PjT(), f);
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void ReZ(Zh zh0) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.PjT, zh0.PjT());
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public Object SM() {
        return this.cz;
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void SM(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.PjT, f);
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public float XX() {
        return this.arr == null ? 0.0f : this.arr[1];
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void XX(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.PjT, f);
    }

    private void Zh(xf xf0) {
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public xf Zh() {
        return this.DWo();
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public xf Zh(int v) {
        return this.cr(v);
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void Zh(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.PjT, f);
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void Zh(JQp jQp0, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.PjT, jQp0.PjT(), f);
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void Zh(Zh zh0) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.PjT, zh0.PjT());
    }

    @PjT
    public final float baseline(float f, float f1) {
        return this.JQp.PjT(this, f, f1);
    }

    public YogaNodeJNIBase cr(int v) {
        List list0 = this.ReZ;
        if(list0 == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBase0 = (YogaNodeJNIBase)list0.remove(v);
        yogaNodeJNIBase0.Zh = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.PjT, yogaNodeJNIBase0.PjT);
        return yogaNodeJNIBase0;
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void cr() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.PjT);
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void cr(float f) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.PjT, f);
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public float cz() {
        return this.arr == null ? 0.0f : this.arr[4];
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void cz(float f) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.PjT, f);
    }

    @PjT
    public final long measure(float f, int v, float f1, int v1) {
        if(!this.qj()) {
            throw new RuntimeException("Measure function isn\'t defined!");
        }
        return this.cr.PjT(this, f, DWo.PjT(v), f1, DWo.PjT(v1));
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void qj(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.PjT, f);
    }

    public boolean qj() {
        return this.cr != null;
    }

    @PjT
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase0, int v) {
        List list0 = this.ReZ;
        if(list0 == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list0.remove(v);
        this.ReZ.add(v, yogaNodeJNIBase0);
        yogaNodeJNIBase0.Zh = this;
        return yogaNodeJNIBase0.PjT;
    }

    @Override  // com.bytedance.adsdk.ugeno.yoga.xf
    public void xf(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.PjT, f);
    }
}

