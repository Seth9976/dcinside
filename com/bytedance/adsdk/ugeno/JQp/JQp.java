package com.bytedance.adsdk.ugeno.JQp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseIntArray;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.XX.XX;
import java.util.ArrayList;
import java.util.List;

public class JQp extends ViewGroup implements PjT {
    public static class com.bytedance.adsdk.ugeno.JQp.JQp.PjT extends ViewGroup.MarginLayoutParams implements Zh {
        private int Au;
        public static final Parcelable.Creator CREATOR;
        private boolean DWo;
        private float JQp;
        private int PjT;
        private float ReZ;
        private int SM;
        private int XX;
        private float Zh;
        private int cr;
        private int cz;

        static {
            com.bytedance.adsdk.ugeno.JQp.JQp.PjT.CREATOR = new Parcelable.Creator() {
                public com.bytedance.adsdk.ugeno.JQp.JQp.PjT PjT(Parcel parcel0) {
                    return new com.bytedance.adsdk.ugeno.JQp.JQp.PjT(parcel0);
                }

                public com.bytedance.adsdk.ugeno.JQp.JQp.PjT[] PjT(int v) {
                    return new com.bytedance.adsdk.ugeno.JQp.JQp.PjT[v];
                }

                @Override  // android.os.Parcelable$Creator
                public Object createFromParcel(Parcel parcel0) {
                    return this.PjT(parcel0);
                }

                @Override  // android.os.Parcelable$Creator
                public Object[] newArray(int v) {
                    return this.PjT(v);
                }
            };
        }

        public com.bytedance.adsdk.ugeno.JQp.JQp.PjT(int v, int v1) {
            super(new ViewGroup.LayoutParams(v, v1));
            this.PjT = 1;
            this.Zh = 0.0f;
            this.ReZ = 0.0f;
            this.cr = -1;
            this.JQp = -1.0f;
            this.cz = -1;
            this.XX = -1;
            this.Au = 0xFFFFFF;
            this.SM = 0xFFFFFF;
        }

        protected com.bytedance.adsdk.ugeno.JQp.JQp.PjT(Parcel parcel0) {
            boolean z = false;
            super(0, 0);
            this.Zh = 0.0f;
            this.ReZ = 0.0f;
            this.cr = -1;
            this.JQp = -1.0f;
            this.cz = -1;
            this.XX = -1;
            this.Au = 0xFFFFFF;
            this.SM = 0xFFFFFF;
            this.PjT = parcel0.readInt();
            this.Zh = parcel0.readFloat();
            this.ReZ = parcel0.readFloat();
            this.cr = parcel0.readInt();
            this.JQp = parcel0.readFloat();
            this.cz = parcel0.readInt();
            this.XX = parcel0.readInt();
            this.Au = parcel0.readInt();
            this.SM = parcel0.readInt();
            if(parcel0.readByte() != 0) {
                z = true;
            }
            this.DWo = z;
            this.bottomMargin = parcel0.readInt();
            this.leftMargin = parcel0.readInt();
            this.rightMargin = parcel0.readInt();
            this.topMargin = parcel0.readInt();
            this.height = parcel0.readInt();
            this.width = parcel0.readInt();
        }

        public com.bytedance.adsdk.ugeno.JQp.JQp.PjT(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.PjT = 1;
            this.Zh = 0.0f;
            this.ReZ = 0.0f;
            this.cr = -1;
            this.JQp = -1.0f;
            this.cz = -1;
            this.XX = -1;
            this.Au = 0xFFFFFF;
            this.SM = 0xFFFFFF;
        }

        public com.bytedance.adsdk.ugeno.JQp.JQp.PjT(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.PjT = 1;
            this.Zh = 0.0f;
            this.ReZ = 0.0f;
            this.cr = -1;
            this.JQp = -1.0f;
            this.cz = -1;
            this.XX = -1;
            this.Au = 0xFFFFFF;
            this.SM = 0xFFFFFF;
        }

        public com.bytedance.adsdk.ugeno.JQp.JQp.PjT(com.bytedance.adsdk.ugeno.JQp.JQp.PjT jQp$PjT0) {
            super(jQp$PjT0);
            this.PjT = jQp$PjT0.PjT;
            this.Zh = jQp$PjT0.Zh;
            this.ReZ = jQp$PjT0.ReZ;
            this.cr = jQp$PjT0.cr;
            this.JQp = jQp$PjT0.JQp;
            this.cz = jQp$PjT0.cz;
            this.XX = jQp$PjT0.XX;
            this.Au = jQp$PjT0.Au;
            this.SM = jQp$PjT0.SM;
            this.DWo = jQp$PjT0.DWo;
        }

        @Override  // com.bytedance.adsdk.ugeno.JQp.Zh
        public int Au() {
            return this.XX;
        }

        @Override  // com.bytedance.adsdk.ugeno.JQp.Zh
        public int DWo() {
            return this.SM;
        }

        @Override  // com.bytedance.adsdk.ugeno.JQp.Zh
        public float JQp() {
            return this.ReZ;
        }

        @Override  // com.bytedance.adsdk.ugeno.JQp.Zh
        public int PjT() {
            return this.width;
        }

        public void PjT(float f) {
            this.Zh = f;
        }

        @Override  // com.bytedance.adsdk.ugeno.JQp.Zh
        public void PjT(int v) {
            this.cz = v;
        }

        @Override  // com.bytedance.adsdk.ugeno.JQp.Zh
        public int ReZ() {
            return this.PjT;
        }

        public void ReZ(float f) {
            this.JQp = f;
        }

        public void ReZ(int v) {
            this.PjT = v;
        }

        @Override  // com.bytedance.adsdk.ugeno.JQp.Zh
        public int SM() {
            return this.Au;
        }

        @Override  // com.bytedance.adsdk.ugeno.JQp.Zh
        public int XX() {
            return this.cz;
        }

        @Override  // com.bytedance.adsdk.ugeno.JQp.Zh
        public int Zh() {
            return this.height;
        }

        public void Zh(float f) {
            this.ReZ = f;
        }

        @Override  // com.bytedance.adsdk.ugeno.JQp.Zh
        public void Zh(int v) {
            this.XX = v;
        }

        @Override  // com.bytedance.adsdk.ugeno.JQp.Zh
        public float cr() {
            return this.Zh;
        }

        public void cr(int v) {
            this.cr = v;
        }

        @Override  // com.bytedance.adsdk.ugeno.JQp.Zh
        public int cz() {
            return this.cr;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // com.bytedance.adsdk.ugeno.JQp.Zh
        public int fDm() {
            return this.topMargin;
        }

        @Override  // com.bytedance.adsdk.ugeno.JQp.Zh
        public boolean qj() {
            return this.DWo;
        }

        @Override  // com.bytedance.adsdk.ugeno.JQp.Zh
        public int qla() {
            return this.rightMargin;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeInt(this.PjT);
            parcel0.writeFloat(this.Zh);
            parcel0.writeFloat(this.ReZ);
            parcel0.writeInt(this.cr);
            parcel0.writeFloat(this.JQp);
            parcel0.writeInt(this.cz);
            parcel0.writeInt(this.XX);
            parcel0.writeInt(this.Au);
            parcel0.writeInt(this.SM);
            parcel0.writeByte(((byte)this.DWo));
            parcel0.writeInt(this.bottomMargin);
            parcel0.writeInt(this.leftMargin);
            parcel0.writeInt(this.rightMargin);
            parcel0.writeInt(this.topMargin);
            parcel0.writeInt(this.height);
            parcel0.writeInt(this.width);
        }

        @Override  // com.bytedance.adsdk.ugeno.JQp.Zh
        public int xE() {
            return this.bottomMargin;
        }

        @Override  // com.bytedance.adsdk.ugeno.JQp.Zh
        public float xf() {
            return this.JQp;
        }

        @Override  // com.bytedance.adsdk.ugeno.JQp.Zh
        public int xs() {
            return this.leftMargin;
        }
    }

    private Drawable Au;
    private int DWo;
    private int JQp;
    private int PjT;
    private int ReZ;
    private int SM;
    private Drawable XX;
    private int Zh;
    private int cr;
    private int cz;
    private SparseIntArray fDm;
    private com.bytedance.adsdk.ugeno.JQp.cr.PjT gK;
    private int qj;
    private cr qla;
    private com.bytedance.adsdk.ugeno.cr ub;
    private List xE;
    private int xf;
    private int[] xs;

    public JQp(Context context0) {
        super(context0, null);
        this.cz = -1;
        this.qla = new cr(this);
        this.xE = new ArrayList();
        this.gK = new com.bytedance.adsdk.ugeno.JQp.cr.PjT();
    }

    private boolean JQp(int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            if(((ReZ)this.xE.get(v1)).Zh() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean JQp(int v, int v1) {
        for(int v2 = 1; v2 <= v1; ++v2) {
            View view0 = this.ReZ(v - v2);
            if(view0 != null && view0.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private void PjT(int v, int v1) {
        if(this.fDm == null) {
            this.fDm = new SparseIntArray(this.getChildCount());
        }
        if(this.qla.Zh(this.fDm)) {
            this.xs = this.qla.PjT(this.fDm);
        }
        switch(this.PjT) {
            case 0: 
            case 1: {
                this.Zh(v, v1);
                return;
            }
            case 2: 
            case 3: {
                this.ReZ(v, v1);
                return;
            }
            default: {
                throw new IllegalStateException("Invalid value for the flex direction is set: " + this.PjT);
            }
        }
    }

    private void PjT(int v, int v1, int v2, int v3) {
        int v11;
        int v10;
        int v9;
        int v8;
        int v4 = View.MeasureSpec.getMode(v1);
        int v5 = View.MeasureSpec.getSize(v1);
        int v6 = View.MeasureSpec.getMode(v2);
        int v7 = View.MeasureSpec.getSize(v2);
        switch(v) {
            case 0: 
            case 1: {
                v8 = this.getSumOfCrossSize() + this.getPaddingTop() + this.getPaddingBottom();
                v9 = this.getLargestMainSize();
                break;
            }
            case 2: 
            case 3: {
                v8 = this.getLargestMainSize();
                v9 = this.getSumOfCrossSize() + this.getPaddingLeft() + this.getPaddingRight();
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid flex direction: " + v);
            }
        }
        switch(v4) {
            case 0x80000000: {
                if(v5 < v9) {
                    v3 = View.combineMeasuredStates(v3, 0x1000000);
                }
                else {
                    v5 = v9;
                }
                v10 = View.resolveSizeAndState(v5, v1, v3);
                break;
            }
            case 0: {
                v10 = View.resolveSizeAndState(v9, v1, v3);
                break;
            }
            case 0x40000000: {
                if(v5 < v9) {
                    v3 = View.combineMeasuredStates(v3, 0x1000000);
                }
                v10 = View.resolveSizeAndState(v5, v1, v3);
                break;
            }
            default: {
                throw new IllegalStateException("Unknown width mode is set: " + v4);
            }
        }
        switch(v6) {
            case 0x80000000: {
                if(v7 < v8) {
                    v3 = View.combineMeasuredStates(v3, 0x100);
                }
                else {
                    v7 = v8;
                }
                v11 = View.resolveSizeAndState(v7, v2, v3);
                break;
            }
            case 0: {
                v11 = View.resolveSizeAndState(v8, v2, v3);
                break;
            }
            case 0x40000000: {
                if(v7 < v8) {
                    v3 = View.combineMeasuredStates(v3, 0x100);
                }
                v11 = View.resolveSizeAndState(v7, v2, v3);
                break;
            }
            default: {
                throw new IllegalStateException("Unknown height mode is set: " + v6);
            }
        }
        this.setMeasuredDimension(v10, v11);
    }

    private void PjT(Canvas canvas0, int v, int v1, int v2) {
        Drawable drawable0 = this.Au;
        if(drawable0 == null) {
            return;
        }
        drawable0.setBounds(v, v1, this.xf + v, v2 + v1);
        this.Au.draw(canvas0);
    }

    private void PjT(Canvas canvas0, boolean z, boolean z1) {
        int v = this.getPaddingLeft();
        int v1 = this.getPaddingRight();
        int v2 = Math.max(0, this.getWidth() - v1 - v);
        int v3 = this.xE.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            ReZ reZ0 = (ReZ)this.xE.get(v4);
            for(int v5 = 0; v5 < reZ0.Au; ++v5) {
                int v6 = reZ0.qla + v5;
                View view0 = this.ReZ(v6);
                if(view0 != null && view0.getVisibility() != 8) {
                    com.bytedance.adsdk.ugeno.JQp.JQp.PjT jQp$PjT0 = (com.bytedance.adsdk.ugeno.JQp.JQp.PjT)view0.getLayoutParams();
                    if(this.cr(v6, v5)) {
                        this.PjT(canvas0, (z ? view0.getRight() + jQp$PjT0.rightMargin : view0.getLeft() - jQp$PjT0.leftMargin - this.xf), reZ0.Zh, reZ0.XX);
                    }
                    if(v5 == reZ0.Au - 1 && (this.DWo & 4) > 0) {
                        this.PjT(canvas0, (z ? view0.getLeft() - jQp$PjT0.leftMargin - this.xf : view0.getRight() + jQp$PjT0.rightMargin), reZ0.Zh, reZ0.XX);
                    }
                }
            }
            if(this.cr(v4)) {
                this.Zh(canvas0, v, (z1 ? reZ0.cr : reZ0.Zh - this.qj), v2);
            }
            if(this.cz(v4) && (this.SM & 4) > 0) {
                this.Zh(canvas0, v, (z1 ? reZ0.Zh - this.qj : reZ0.cr), v2);
            }
        }
    }

    private void PjT(boolean z, int v, int v1, int v2, int v3) {
        com.bytedance.adsdk.ugeno.JQp.JQp.PjT jQp$PjT1;
        int v19;
        float f6;
        int v17;
        float f2;
        float f1;
        float f;
        int v4 = this.getPaddingLeft();
        int v5 = this.getPaddingRight();
        int v6 = v2 - v;
        int v7 = v3 - v1 - this.getPaddingBottom();
        int v8 = this.getPaddingTop();
        int v9 = this.xE.size();
        int v10 = 0;
        while(v10 < v9) {
            ReZ reZ0 = (ReZ)this.xE.get(v10);
            if(this.cr(v10)) {
                v7 -= this.qj;
                v8 += this.qj;
            }
            int v11 = this.ReZ;
            switch(v11) {
                case 0: {
                    f1 = (float)v4;
                    f2 = (float)(v6 - v5);
                    break;
                }
                case 1: {
                    f2 = (float)(reZ0.JQp - v4);
                    f1 = (float)(v6 - reZ0.JQp + v5);
                    break;
                }
                default: {
                    if(v11 == 2) {
                        f1 = ((float)v4) + ((float)(v6 - reZ0.JQp)) / 2.0f;
                        f2 = ((float)(v6 - v5)) - ((float)(v6 - reZ0.JQp)) / 2.0f;
                        break;
                    }
                    else {
                        switch(v11) {
                            case 3: {
                                f1 = (float)v4;
                                int v13 = reZ0.Zh();
                                f = ((float)(v6 - reZ0.JQp)) / (v13 == 1 ? 1.0f : ((float)(v13 - 1)));
                                f2 = (float)(v6 - v5);
                                goto label_42;
                            }
                            case 4: {
                                int v14 = reZ0.Zh();
                                f = v14 == 0 ? 0.0f : ((float)(v6 - reZ0.JQp)) / ((float)v14);
                                f1 = ((float)v4) + f / 2.0f;
                                f2 = ((float)(v6 - v5)) - f / 2.0f;
                                goto label_42;
                            }
                            default: {
                                if(v11 != 5) {
                                    throw new IllegalStateException("Invalid justifyContent is set: " + this.ReZ);
                                }
                                int v12 = reZ0.Zh();
                                f = v12 == 0 ? 0.0f : ((float)(v6 - reZ0.JQp)) / ((float)(v12 + 1));
                                f1 = ((float)v4) + f;
                                f2 = ((float)(v6 - v5)) - f;
                                goto label_42;
                            }
                        }
                    }
                    f1 = (float)v4;
                    f2 = (float)(v6 - v5);
                    break;
                }
            }
            f = 0.0f;
        label_42:
            float f3 = Math.max(f, 0.0f);
            for(int v15 = 0; v15 < reZ0.Au; v15 = v19 + 1) {
                int v16 = reZ0.qla + v15;
                View view0 = this.ReZ(v16);
                if(view0 == null || view0.getVisibility() == 8) {
                    v19 = v15;
                }
                else {
                    com.bytedance.adsdk.ugeno.JQp.JQp.PjT jQp$PjT0 = (com.bytedance.adsdk.ugeno.JQp.JQp.PjT)view0.getLayoutParams();
                    float f4 = f1 + ((float)jQp$PjT0.leftMargin);
                    float f5 = f2 - ((float)jQp$PjT0.rightMargin);
                    if(this.cr(v16, v15)) {
                        f4 += (float)this.xf;
                        v17 = this.xf;
                        f6 = f5 - ((float)this.xf);
                    }
                    else {
                        f6 = f5;
                        v17 = 0;
                    }
                    int v18 = v15 != reZ0.Au - 1 || (this.DWo & 4) <= 0 ? 0 : this.xf;
                    if(this.Zh != 2) {
                        v19 = v15;
                        jQp$PjT1 = jQp$PjT0;
                        if(z) {
                            this.qla.PjT(view0, reZ0, Math.round(f6) - view0.getMeasuredWidth(), v8, Math.round(f6), v8 + view0.getMeasuredHeight());
                        }
                        else {
                            this.qla.PjT(view0, reZ0, Math.round(f4), v8, Math.round(f4) + view0.getMeasuredWidth(), v8 + view0.getMeasuredHeight());
                        }
                    }
                    else if(z) {
                        v19 = v15;
                        jQp$PjT1 = jQp$PjT0;
                        this.qla.PjT(view0, reZ0, Math.round(f6) - view0.getMeasuredWidth(), v7 - view0.getMeasuredHeight(), Math.round(f6), v7);
                    }
                    else {
                        v19 = v15;
                        jQp$PjT1 = jQp$PjT0;
                        this.qla.PjT(view0, reZ0, Math.round(f4), v7 - view0.getMeasuredHeight(), Math.round(f4) + view0.getMeasuredWidth(), v7);
                    }
                    f1 = f4 + (((float)view0.getMeasuredWidth()) + f3 + ((float)jQp$PjT1.rightMargin));
                    float f7 = f6 - (((float)view0.getMeasuredWidth()) + f3 + ((float)jQp$PjT1.leftMargin));
                    if(z) {
                        reZ0.PjT(view0, v18, 0, v17, 0);
                    }
                    else {
                        reZ0.PjT(view0, v17, 0, v18, 0);
                    }
                    f2 = f7;
                }
            }
            v8 += reZ0.XX;
            v7 -= reZ0.XX;
            ++v10;
        }
    }

    private void PjT(boolean z, boolean z1, int v, int v1, int v2, int v3) {
        com.bytedance.adsdk.ugeno.JQp.JQp.PjT jQp$PjT1;
        int v20;
        float f7;
        int v18;
        float f6;
        float f2;
        float f1;
        float f;
        int v4 = this.getPaddingTop();
        int v5 = this.getPaddingBottom();
        int v6 = this.getPaddingRight();
        int v7 = this.getPaddingLeft();
        int v8 = v3 - v1;
        int v9 = v2 - v - v6;
        int v10 = this.xE.size();
        int v11 = 0;
        while(v11 < v10) {
            ReZ reZ0 = (ReZ)this.xE.get(v11);
            if(this.cr(v11)) {
                v7 += this.xf;
                v9 -= this.xf;
            }
            int v12 = this.ReZ;
            switch(v12) {
                case 0: {
                    f1 = (float)v4;
                    f2 = (float)(v8 - v5);
                    break;
                }
                case 1: {
                    f1 = (float)(v8 - reZ0.JQp + v5);
                    f2 = (float)(reZ0.JQp - v4);
                    break;
                }
                default: {
                    if(v12 == 2) {
                        f2 = ((float)(v8 - v5)) - ((float)(v8 - reZ0.JQp)) / 2.0f;
                        f1 = ((float)v4) + ((float)(v8 - reZ0.JQp)) / 2.0f;
                        break;
                    }
                    else {
                        switch(v12) {
                            case 3: {
                                f1 = (float)v4;
                                int v14 = reZ0.Zh();
                                f = ((float)(v8 - reZ0.JQp)) / (v14 == 1 ? 1.0f : ((float)(v14 - 1)));
                                f2 = (float)(v8 - v5);
                                goto label_43;
                            }
                            case 4: {
                                int v15 = reZ0.Zh();
                                f = v15 == 0 ? 0.0f : ((float)(v8 - reZ0.JQp)) / ((float)v15);
                                f1 = ((float)v4) + f / 2.0f;
                                f2 = ((float)(v8 - v5)) - f / 2.0f;
                                goto label_43;
                            }
                            default: {
                                if(v12 != 5) {
                                    throw new IllegalStateException("Invalid justifyContent is set: " + this.ReZ);
                                }
                                int v13 = reZ0.Zh();
                                f = v13 == 0 ? 0.0f : ((float)(v8 - reZ0.JQp)) / ((float)(v13 + 1));
                                f1 = ((float)v4) + f;
                                f2 = ((float)(v8 - v5)) - f;
                                goto label_43;
                            }
                        }
                    }
                    f1 = (float)v4;
                    f2 = (float)(v8 - v5);
                    break;
                }
            }
            f = 0.0f;
        label_43:
            float f3 = Math.max(f, 0.0f);
            for(int v16 = 0; v16 < reZ0.Au; v16 = v20 + 1) {
                int v17 = reZ0.qla + v16;
                View view0 = this.ReZ(v17);
                if(view0 == null || view0.getVisibility() == 8) {
                    v20 = v16;
                }
                else {
                    com.bytedance.adsdk.ugeno.JQp.JQp.PjT jQp$PjT0 = (com.bytedance.adsdk.ugeno.JQp.JQp.PjT)view0.getLayoutParams();
                    float f4 = f1 + ((float)jQp$PjT0.topMargin);
                    float f5 = f2 - ((float)jQp$PjT0.bottomMargin);
                    if(this.cr(v17, v16)) {
                        f6 = f4 + ((float)this.qj);
                        v18 = this.qj;
                        f7 = f5 - ((float)this.qj);
                    }
                    else {
                        f6 = f4;
                        f7 = f5;
                        v18 = 0;
                    }
                    int v19 = v16 != reZ0.Au - 1 || (this.SM & 4) <= 0 ? 0 : this.qj;
                    if(!z) {
                        v20 = v16;
                        jQp$PjT1 = jQp$PjT0;
                        if(z1) {
                            this.qla.PjT(view0, reZ0, false, v7, Math.round(f7) - view0.getMeasuredHeight(), v7 + view0.getMeasuredWidth(), Math.round(f7));
                        }
                        else {
                            this.qla.PjT(view0, reZ0, false, v7, Math.round(f6), v7 + view0.getMeasuredWidth(), Math.round(f6) + view0.getMeasuredHeight());
                        }
                    }
                    else if(z1) {
                        v20 = v16;
                        jQp$PjT1 = jQp$PjT0;
                        this.qla.PjT(view0, reZ0, true, v9 - view0.getMeasuredWidth(), Math.round(f7) - view0.getMeasuredHeight(), v9, Math.round(f7));
                    }
                    else {
                        v20 = v16;
                        jQp$PjT1 = jQp$PjT0;
                        this.qla.PjT(view0, reZ0, true, v9 - view0.getMeasuredWidth(), Math.round(f6), v9, Math.round(f6) + view0.getMeasuredHeight());
                    }
                    float f8 = f6 + (((float)view0.getMeasuredHeight()) + f3 + ((float)jQp$PjT1.bottomMargin));
                    float f9 = f7 - (((float)view0.getMeasuredHeight()) + f3 + ((float)jQp$PjT1.topMargin));
                    if(z1) {
                        reZ0.PjT(view0, 0, v19, 0, v18);
                    }
                    else {
                        reZ0.PjT(view0, 0, v18, 0, v19);
                    }
                    f1 = f8;
                    f2 = f9;
                }
            }
            v7 += reZ0.XX;
            v9 -= reZ0.XX;
            ++v11;
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public int PjT(int v, int v1, int v2) {
        return ViewGroup.getChildMeasureSpec(v, v1, v2);
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public int PjT(View view0) {
        return 0;
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public int PjT(View view0, int v, int v1) {
        int v2 = 0;
        if(this.PjT()) {
            if(this.cr(v, v1)) {
                v2 = this.xf;
            }
            return (this.DWo & 4) <= 0 ? v2 : v2 + this.xf;
        }
        if(this.cr(v, v1)) {
            v2 = this.qj;
        }
        return (this.SM & 4) <= 0 ? v2 : v2 + this.qj;
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public View PjT(int v) {
        return this.getChildAt(v);
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public void PjT(View view0, int v, int v1, ReZ reZ0) {
        if(this.cr(v, v1)) {
            if(this.PjT()) {
                reZ0.JQp += this.xf;
                reZ0.cz += this.xf;
                return;
            }
            reZ0.JQp += this.qj;
            reZ0.cz += this.qj;
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public void PjT(ReZ reZ0) {
        if(this.PjT()) {
            if((this.DWo & 4) > 0) {
                reZ0.JQp += this.xf;
                reZ0.cz += this.xf;
            }
        }
        else if((this.SM & 4) > 0) {
            reZ0.JQp += this.qj;
            reZ0.cz += this.qj;
        }
    }

    public void PjT(com.bytedance.adsdk.ugeno.Zh.ReZ reZ0) {
        this.ub = reZ0;
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public boolean PjT() {
        return this.PjT == 0 || this.PjT == 1;
    }

    private void ReZ(int v, int v1) {
        this.xE.clear();
        this.gK.PjT();
        this.qla.Zh(this.gK, v, v1);
        this.xE = this.gK.PjT;
        this.qla.PjT(v, v1);
        this.qla.Zh(v, v1, this.getPaddingLeft() + this.getPaddingRight());
        this.qla.PjT();
        this.PjT(this.PjT, v, v1, this.gK.Zh);
    }

    public View ReZ(int v) {
        if(v >= 0) {
            return v >= this.xs.length ? null : this.getChildAt(this.xs[v]);
        }
        return null;
    }

    private void Zh() {
        if(this.XX == null && this.Au == null) {
            this.setWillNotDraw(true);
            return;
        }
        this.setWillNotDraw(false);
    }

    private void Zh(int v, int v1) {
        this.xE.clear();
        this.gK.PjT();
        this.qla.PjT(this.gK, v, v1);
        this.xE = this.gK.PjT;
        this.qla.PjT(v, v1);
        if(this.cr == 3) {
            for(Object object0: this.xE) {
                ReZ reZ0 = (ReZ)object0;
                int v2 = 0x80000000;
                for(int v3 = 0; v3 < reZ0.Au; ++v3) {
                    View view0 = this.ReZ(reZ0.qla + v3);
                    if(view0 != null && view0.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.JQp.JQp.PjT jQp$PjT0 = (com.bytedance.adsdk.ugeno.JQp.JQp.PjT)view0.getLayoutParams();
                        if(this.Zh == 2) {
                            int v5 = Math.max(reZ0.xf - view0.getMeasuredHeight() + view0.getBaseline(), jQp$PjT0.bottomMargin);
                            v2 = Math.max(v2, view0.getMeasuredHeight() + jQp$PjT0.topMargin + v5);
                        }
                        else {
                            int v4 = Math.max(reZ0.xf - view0.getBaseline(), jQp$PjT0.topMargin);
                            v2 = Math.max(v2, view0.getMeasuredHeight() + v4 + jQp$PjT0.bottomMargin);
                        }
                    }
                }
                reZ0.XX = v2;
            }
        }
        this.qla.Zh(v, v1, this.getPaddingTop() + this.getPaddingBottom());
        this.qla.PjT();
        this.PjT(this.PjT, v, v1, this.gK.Zh);
    }

    private void Zh(Canvas canvas0, int v, int v1, int v2) {
        Drawable drawable0 = this.XX;
        if(drawable0 == null) {
            return;
        }
        drawable0.setBounds(v, v1, v2 + v, this.qj + v1);
        this.XX.draw(canvas0);
    }

    private void Zh(Canvas canvas0, boolean z, boolean z1) {
        int v = this.getPaddingTop();
        int v1 = this.getPaddingBottom();
        int v2 = Math.max(0, this.getHeight() - v1 - v);
        int v3 = this.xE.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            ReZ reZ0 = (ReZ)this.xE.get(v4);
            for(int v5 = 0; v5 < reZ0.Au; ++v5) {
                int v6 = reZ0.qla + v5;
                View view0 = this.ReZ(v6);
                if(view0 != null && view0.getVisibility() != 8) {
                    com.bytedance.adsdk.ugeno.JQp.JQp.PjT jQp$PjT0 = (com.bytedance.adsdk.ugeno.JQp.JQp.PjT)view0.getLayoutParams();
                    if(this.cr(v6, v5)) {
                        int v7 = z1 ? view0.getBottom() + jQp$PjT0.bottomMargin : view0.getTop() - jQp$PjT0.topMargin - this.qj;
                        this.Zh(canvas0, reZ0.PjT, v7, reZ0.XX);
                    }
                    if(v5 == reZ0.Au - 1 && (this.SM & 4) > 0) {
                        int v8 = z1 ? view0.getTop() - jQp$PjT0.topMargin - this.qj : view0.getBottom() + jQp$PjT0.bottomMargin;
                        this.Zh(canvas0, reZ0.PjT, v8, reZ0.XX);
                    }
                }
            }
            if(this.cr(v4)) {
                this.PjT(canvas0, (z ? reZ0.ReZ : reZ0.PjT - this.xf), v, v2);
            }
            if(this.cz(v4) && (this.DWo & 4) > 0) {
                this.PjT(canvas0, (z ? reZ0.PjT - this.xf : reZ0.ReZ), v, v2);
            }
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public int Zh(int v, int v1, int v2) {
        return ViewGroup.getChildMeasureSpec(v, v1, v2);
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public View Zh(int v) {
        return this.ReZ(v);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(this.fDm == null) {
            this.fDm = new SparseIntArray(this.getChildCount());
        }
        this.xs = this.qla.PjT(view0, v, viewGroup$LayoutParams0, this.fDm);
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof com.bytedance.adsdk.ugeno.JQp.JQp.PjT;
    }

    private boolean cr(int v) {
        if(v >= 0 && v < this.xE.size()) {
            if(this.JQp(v)) {
                return this.PjT() ? (this.SM & 1) != 0 : (this.DWo & 1) != 0;
            }
            return this.PjT() ? (this.SM & 2) != 0 : (this.DWo & 2) != 0;
        }
        return false;
    }

    private boolean cr(int v, int v1) {
        if(this.JQp(v, v1)) {
            return this.PjT() ? (this.DWo & 1) != 0 : (this.SM & 1) != 0;
        }
        return this.PjT() ? (this.DWo & 2) != 0 : (this.SM & 2) != 0;
    }

    private boolean cz(int v) {
        if(v >= 0 && v < this.xE.size()) {
            for(int v1 = v + 1; v1 < this.xE.size(); ++v1) {
                if(((ReZ)this.xE.get(v1)).Zh() > 0) {
                    return false;
                }
            }
            return this.PjT() ? (this.SM & 4) != 0 : (this.DWo & 4) != 0;
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof com.bytedance.adsdk.ugeno.JQp.JQp.PjT) {
            return new com.bytedance.adsdk.ugeno.JQp.JQp.PjT(((com.bytedance.adsdk.ugeno.JQp.JQp.PjT)viewGroup$LayoutParams0));
        }
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new com.bytedance.adsdk.ugeno.JQp.JQp.PjT(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new com.bytedance.adsdk.ugeno.JQp.JQp.PjT(viewGroup$LayoutParams0);
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public int getAlignContent() {
        return this.JQp;
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public int getAlignItems() {
        return this.cr;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.XX;
    }

    public Drawable getDividerDrawableVertical() {
        return this.Au;
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public int getFlexDirection() {
        return this.PjT;
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public int getFlexItemCount() {
        return this.getChildCount();
    }

    public List getFlexLines() {
        List list0 = new ArrayList(this.xE.size());
        for(Object object0: this.xE) {
            ReZ reZ0 = (ReZ)object0;
            if(reZ0.Zh() != 0) {
                list0.add(reZ0);
            }
        }
        return list0;
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public List getFlexLinesInternal() {
        return this.xE;
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public int getFlexWrap() {
        return this.Zh;
    }

    public int getJustifyContent() {
        return this.ReZ;
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public int getLargestMainSize() {
        int v = 0x80000000;
        for(Object object0: this.xE) {
            v = Math.max(v, ((ReZ)object0).JQp);
        }
        return v;
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public int getMaxLine() {
        return this.cz;
    }

    public int getShowDividerHorizontal() {
        return this.SM;
    }

    public int getShowDividerVertical() {
        return this.DWo;
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public int getSumOfCrossSize() {
        int v = this.xE.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            ReZ reZ0 = (ReZ)this.xE.get(v1);
            if(this.cr(v1)) {
                v2 += (this.PjT() ? this.qj : this.xf);
            }
            if(this.cz(v1)) {
                v2 += (this.PjT() ? this.qj : this.xf);
            }
            v2 += reZ0.XX;
        }
        return v2;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.cr cr0 = this.ub;
        if(cr0 != null) {
            cr0.XX();
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.cr cr0 = this.ub;
        if(cr0 != null) {
            cr0.Au();
        }
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        if(this.Au == null && this.XX == null) {
            return;
        }
        if(this.SM == 0 && this.DWo == 0) {
            return;
        }
        int v = XX.PjT(this);
        int v1 = this.PjT;
        boolean z = false;
        int v2 = 1;
        switch(v1) {
            case 0: {
                if(this.Zh == 2) {
                    z = true;
                }
                this.PjT(canvas0, v == 1, z);
                return;
            }
            case 1: {
                if(this.Zh == 2) {
                    z = true;
                }
                this.PjT(canvas0, v != 1, z);
                return;
            }
            case 2: {
                if(v != 1) {
                    v2 = 0;
                }
                if(this.Zh == 2) {
                    v2 ^= 1;
                }
                this.Zh(canvas0, ((boolean)v2), false);
                return;
            }
            default: {
                if(v1 == 3) {
                    if(v == 1) {
                        z = true;
                    }
                    if(this.Zh == 2) {
                        z = !z;
                    }
                    this.Zh(canvas0, z, true);
                }
            }
        }
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        com.bytedance.adsdk.ugeno.cr cr0 = this.ub;
        if(cr0 != null) {
            cr0.cz();
        }
        int v4 = XX.PjT(this);
        int v5 = 0;
        switch(this.PjT) {
            case 0: {
                this.PjT(v4 == 1, v, v1, v2, v3);
                break;
            }
            case 1: {
                this.PjT(v4 != 1, v, v1, v2, v3);
                break;
            }
            case 2: {
                if(v4 == 1) {
                    v5 = 1;
                }
                this.PjT(((boolean)(this.Zh == 2 ? v5 ^ 1 : v5)), false, v, v1, v2, v3);
                break;
            }
            case 3: {
                if(v4 == 1) {
                    v5 = 1;
                }
                this.PjT(((boolean)(this.Zh == 2 ? v5 ^ 1 : v5)), true, v, v1, v2, v3);
                break;
            }
            default: {
                throw new IllegalStateException("Invalid flex direction is set: " + this.PjT);
            }
        }
        com.bytedance.adsdk.ugeno.cr cr1 = this.ub;
        if(cr1 != null) {
            cr1.PjT(v, v1, v2, v3);
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        com.bytedance.adsdk.ugeno.cr cr0 = this.ub;
        if(cr0 == null) {
            this.PjT(v, v1);
        }
        else {
            int[] arr_v = cr0.PjT(v, v1);
            this.PjT(arr_v[0], arr_v[1]);
        }
        com.bytedance.adsdk.ugeno.cr cr1 = this.ub;
        if(cr1 != null) {
            cr1.JQp();
        }
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        com.bytedance.adsdk.ugeno.cr cr0 = this.ub;
        if(cr0 != null) {
            cr0.Zh(v, v1, v2, v3);
        }
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setAlignContent(int v) {
        if(this.JQp != v) {
            this.JQp = v;
            this.requestLayout();
        }
    }

    public void setAlignItems(int v) {
        if(this.cr != v) {
            this.cr = v;
            this.requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable0) {
        this.setDividerDrawableHorizontal(drawable0);
        this.setDividerDrawableVertical(drawable0);
    }

    public void setDividerDrawableHorizontal(Drawable drawable0) {
        if(drawable0 == this.XX) {
            return;
        }
        this.XX = drawable0;
        this.qj = drawable0 == null ? 0 : drawable0.getIntrinsicHeight();
        this.Zh();
        this.requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable0) {
        if(drawable0 == this.Au) {
            return;
        }
        this.Au = drawable0;
        this.xf = drawable0 == null ? 0 : drawable0.getIntrinsicWidth();
        this.Zh();
        this.requestLayout();
    }

    public void setFlexDirection(int v) {
        if(this.PjT != v) {
            this.PjT = v;
            this.requestLayout();
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.JQp.PjT
    public void setFlexLines(List list0) {
        this.xE = list0;
    }

    public void setFlexWrap(int v) {
        if(this.Zh != v) {
            this.Zh = v;
            this.requestLayout();
        }
    }

    public void setJustifyContent(int v) {
        if(this.ReZ != v) {
            this.ReZ = v;
            this.requestLayout();
        }
    }

    public void setMaxLine(int v) {
        if(this.cz != v) {
            this.cz = v;
            this.requestLayout();
        }
    }

    public void setShowDivider(int v) {
        this.setShowDividerVertical(v);
        this.setShowDividerHorizontal(v);
    }

    public void setShowDividerHorizontal(int v) {
        if(v != this.SM) {
            this.SM = v;
            this.requestLayout();
        }
    }

    public void setShowDividerVertical(int v) {
        if(v != this.DWo) {
            this.DWo = v;
            this.requestLayout();
        }
    }
}

