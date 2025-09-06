package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.KeyAttributes;
import androidx.constraintlayout.motion.widget.KeyPosition;
import androidx.constraintlayout.motion.widget.MotionController;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R.styleable;
import java.util.HashMap;

public class MotionEffect extends MotionHelper {
    public static final int A = 2;
    public static final int B = 3;
    private static final int C = -1;
    private float o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private int u;
    private int v;
    public static final String w = "FadeMove";
    public static final int x = -1;
    public static final int y = 0;
    public static final int z = 1;

    public MotionEffect(Context context0) {
        super(context0);
        this.o = 0.1f;
        this.p = 49;
        this.q = 50;
        this.r = 0;
        this.s = 0;
        this.t = true;
        this.u = -1;
        this.v = -1;
    }

    public MotionEffect(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.o = 0.1f;
        this.p = 49;
        this.q = 50;
        this.r = 0;
        this.s = 0;
        this.t = true;
        this.u = -1;
        this.v = -1;
        this.M(context0, attributeSet0);
    }

    public MotionEffect(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.o = 0.1f;
        this.p = 49;
        this.q = 50;
        this.r = 0;
        this.s = 0;
        this.t = true;
        this.u = -1;
        this.v = -1;
        this.M(context0, attributeSet0);
    }

    private void M(Context context0, AttributeSet attributeSet0) {
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.MotionEffect);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.MotionEffect_motionEffect_start) {
                    this.p = Math.max(Math.min(typedArray0.getInt(v2, this.p), 99), 0);
                }
                else if(v2 == styleable.MotionEffect_motionEffect_end) {
                    this.q = Math.max(Math.min(typedArray0.getInt(v2, this.q), 99), 0);
                }
                else if(v2 == styleable.MotionEffect_motionEffect_translationX) {
                    this.r = typedArray0.getDimensionPixelOffset(v2, this.r);
                }
                else if(v2 == styleable.MotionEffect_motionEffect_translationY) {
                    this.s = typedArray0.getDimensionPixelOffset(v2, this.s);
                }
                else if(v2 == styleable.MotionEffect_motionEffect_alpha) {
                    this.o = typedArray0.getFloat(v2, this.o);
                }
                else if(v2 == styleable.MotionEffect_motionEffect_move) {
                    this.v = typedArray0.getInt(v2, this.v);
                }
                else if(v2 == styleable.MotionEffect_motionEffect_strict) {
                    this.t = typedArray0.getBoolean(v2, this.t);
                }
                else if(v2 == styleable.MotionEffect_motionEffect_viewTransition) {
                    this.u = typedArray0.getResourceId(v2, this.u);
                }
            }
            int v3 = this.p;
            int v4 = this.q;
            if(v3 == v4) {
                if(v3 > 0) {
                    this.p = v3 - 1;
                }
                else {
                    this.q = v4 + 1;
                }
            }
            typedArray0.recycle();
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionHelper
    public void b(MotionLayout motionLayout0, HashMap hashMap0) {
        KeyAttributes keyAttributes5;
        KeyAttributes keyAttributes4;
        KeyAttributes keyAttributes3;
        View[] arr_view = this.x(((ConstraintLayout)this.getParent()));
        if(arr_view == null) {
            Log.v("FadeMove", ".(null:-1) c() views = null");
            return;
        }
        KeyAttributes keyAttributes0 = new KeyAttributes();
        KeyAttributes keyAttributes1 = new KeyAttributes();
        keyAttributes0.j("alpha", this.o);
        keyAttributes1.j("alpha", this.o);
        keyAttributes0.h(this.p);
        keyAttributes1.h(this.q);
        KeyPosition keyPosition0 = new KeyPosition();
        keyPosition0.h(this.p);
        keyPosition0.A(0);
        keyPosition0.j("percentX", 0);
        keyPosition0.j("percentY", 0);
        KeyPosition keyPosition1 = new KeyPosition();
        keyPosition1.h(this.q);
        keyPosition1.A(0);
        keyPosition1.j("percentX", 1);
        keyPosition1.j("percentY", 1);
        KeyAttributes keyAttributes2 = null;
        if(this.r > 0) {
            keyAttributes3 = new KeyAttributes();
            keyAttributes4 = new KeyAttributes();
            keyAttributes3.j("translationX", this.r);
            keyAttributes3.h(this.q);
            keyAttributes4.j("translationX", 0);
            keyAttributes4.h(this.q - 1);
        }
        else {
            keyAttributes3 = null;
            keyAttributes4 = null;
        }
        if(this.s > 0) {
            keyAttributes2 = new KeyAttributes();
            keyAttributes5 = new KeyAttributes();
            keyAttributes2.j("translationY", this.s);
            keyAttributes2.h(this.q);
            keyAttributes5.j("translationY", 0);
            keyAttributes5.h(this.q - 1);
        }
        else {
            keyAttributes5 = null;
        }
        int v1 = this.v;
        if(v1 == -1) {
            int[] arr_v = new int[4];
            for(int v2 = 0; v2 < arr_view.length; ++v2) {
                MotionController motionController0 = (MotionController)hashMap0.get(arr_view[v2]);
                if(motionController0 != null) {
                    float f = motionController0.t() - motionController0.G();
                    float f1 = motionController0.u() - motionController0.H();
                    if(f1 < 0.0f) {
                        ++arr_v[1];
                    }
                    if(f1 > 0.0f) {
                        ++arr_v[0];
                    }
                    if(f > 0.0f) {
                        ++arr_v[3];
                    }
                    if(f < 0.0f) {
                        ++arr_v[2];
                    }
                }
            }
            int v3 = arr_v[0];
            v1 = 0;
            for(int v = 1; v < 4; ++v) {
                int v4 = arr_v[v];
                if(v3 < v4) {
                    v3 = v4;
                    v1 = v;
                }
            }
        }
        int v5 = 0;
        while(v5 < arr_view.length) {
            MotionController motionController1 = (MotionController)hashMap0.get(arr_view[v5]);
            if(motionController1 != null) {
                float f2 = motionController1.t() - motionController1.G();
                float f3 = motionController1.u() - motionController1.H();
                if(v1 != 0) {
                    switch(v1) {
                        case 1: {
                            if(f3 >= 0.0f || this.t && f2 != 0.0f) {
                                goto label_85;
                            }
                            else {
                                break;
                            }
                            goto label_82;
                        }
                        case 2: {
                        label_82:
                            if(f2 >= 0.0f || this.t && f3 != 0.0f) {
                                goto label_85;
                            }
                            else {
                                break;
                            }
                            goto label_84;
                        }
                        case 3: {
                        label_84:
                            if(f2 <= 0.0f || this.t && f3 != 0.0f) {
                            label_85:
                                int v6 = this.u;
                                if(v6 == -1) {
                                    motionController1.a(keyAttributes0);
                                    motionController1.a(keyAttributes1);
                                    motionController1.a(keyPosition0);
                                    motionController1.a(keyPosition1);
                                    if(this.r > 0) {
                                        motionController1.a(keyAttributes3);
                                        motionController1.a(keyAttributes4);
                                    }
                                    if(this.s > 0) {
                                        motionController1.a(keyAttributes2);
                                        motionController1.a(keyAttributes5);
                                    }
                                }
                                else {
                                    motionLayout0.b0(v6, motionController1);
                                }
                            }
                            break;
                        }
                        default: {
                            goto label_85;
                        }
                    }
                }
                else if(f3 <= 0.0f || this.t && f2 != 0.0f) {
                    goto label_85;
                }
            }
            ++v5;
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionHelper
    public boolean f() {
        return true;
    }
}

