package com.coupang.ads.view.image;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.coupang.ads.R.styleable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;
import z3.j;

@SuppressLint({"AppCompatCustomView"})
public class RoundImageView extends ImageView {
    private int _height;
    private int _width;
    private int leftBottomRadius;
    private int leftTopRadius;
    private Path path;
    private int rightBottomRadius;
    private int rightTopRadius;

    @j
    public RoundImageView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 0, 14, null);
    }

    @j
    public RoundImageView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 0, 12, null);
    }

    @j
    public RoundImageView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        this(context0, attributeSet0, v, 0, 8, null);
    }

    @j
    public RoundImageView(@l Context context0, @m AttributeSet attributeSet0, int v, int v1) {
        L.p(context0, "context");
        super(context0, attributeSet0, v, v1);
        this.a(context0, attributeSet0);
    }

    public RoundImageView(Context context0, AttributeSet attributeSet0, int v, int v1, int v2, w w0) {
        if((v2 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = 0;
        }
        this(context0, attributeSet0, v, v1);
    }

    public void _$_clearFindViewByIdCache() {
    }

    private final void a(Context context0, AttributeSet attributeSet0) {
        this.path = new Path();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.RoundImageView);
        L.o(typedArray0, "context.obtainStyledAttr…styleable.RoundImageView)");
        int v = typedArray0.getDimensionPixelOffset(styleable.RoundImageView_radius, 0);
        this.leftTopRadius = typedArray0.getDimensionPixelOffset(styleable.RoundImageView_left_top_radius, 0);
        this.rightTopRadius = typedArray0.getDimensionPixelOffset(styleable.RoundImageView_right_top_radius, 0);
        this.rightBottomRadius = typedArray0.getDimensionPixelOffset(styleable.RoundImageView_right_bottom_radius, 0);
        int v1 = typedArray0.getDimensionPixelOffset(styleable.RoundImageView_left_bottom_radius, 0);
        this.leftBottomRadius = v1;
        if(this.leftTopRadius == 0) {
            this.leftTopRadius = v;
        }
        if(this.rightTopRadius == 0) {
            this.rightTopRadius = v;
        }
        if(this.rightBottomRadius == 0) {
            this.rightBottomRadius = v;
        }
        if(v1 == 0) {
            this.leftBottomRadius = v;
        }
        typedArray0.recycle();
    }

    @Override  // android.widget.ImageView
    protected void onDraw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        int v = s.u(this.leftTopRadius, this.leftBottomRadius);
        int v1 = s.u(this.rightTopRadius, this.rightBottomRadius);
        int v2 = s.u(this.leftTopRadius, this.rightTopRadius);
        int v3 = s.u(this.leftBottomRadius, this.rightBottomRadius);
        if(this._width >= v + v1 && this._height > v2 + v3) {
            Path path0 = this.path;
            Path path1 = null;
            if(path0 == null) {
                L.S("path");
                path0 = null;
            }
            path0.moveTo(((float)this.leftTopRadius), 0.0f);
            Path path2 = this.path;
            if(path2 == null) {
                L.S("path");
                path2 = null;
            }
            path2.lineTo(((float)(this._width - this.rightTopRadius)), 0.0f);
            Path path3 = this.path;
            if(path3 == null) {
                L.S("path");
                path3 = null;
            }
            path3.quadTo(((float)this._width), 0.0f, ((float)this._width), ((float)this.rightTopRadius));
            Path path4 = this.path;
            if(path4 == null) {
                L.S("path");
                path4 = null;
            }
            path4.lineTo(((float)this._width), ((float)(this._height - this.rightBottomRadius)));
            Path path5 = this.path;
            if(path5 == null) {
                L.S("path");
                path5 = null;
            }
            path5.quadTo(((float)this._width), ((float)this._height), ((float)(this._width - this.rightBottomRadius)), ((float)this._height));
            Path path6 = this.path;
            if(path6 == null) {
                L.S("path");
                path6 = null;
            }
            path6.lineTo(((float)this.leftBottomRadius), ((float)this._height));
            Path path7 = this.path;
            if(path7 == null) {
                L.S("path");
                path7 = null;
            }
            path7.quadTo(0.0f, ((float)this._height), 0.0f, ((float)(this._height - this.leftBottomRadius)));
            Path path8 = this.path;
            if(path8 == null) {
                L.S("path");
                path8 = null;
            }
            path8.lineTo(0.0f, ((float)this.leftTopRadius));
            Path path9 = this.path;
            if(path9 == null) {
                L.S("path");
                path9 = null;
            }
            path9.quadTo(0.0f, 0.0f, ((float)this.leftTopRadius), 0.0f);
            Path path10 = this.path;
            if(path10 == null) {
                L.S("path");
            }
            else {
                path1 = path10;
            }
            canvas0.clipPath(path1);
        }
        super.onDraw(canvas0);
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this._width = v;
        this._height = v1;
    }
}

