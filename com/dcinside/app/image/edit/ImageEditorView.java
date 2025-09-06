package com.dcinside.app.image.edit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ImageEditorView extends ConstraintLayout {
    private ImageView a;
    private BrushDrawingView b;

    public ImageEditorView(Context context0) {
        super(context0);
        this.A();
    }

    public ImageEditorView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.A();
    }

    public ImageEditorView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.A();
    }

    private void A() {
        int v = View.generateViewId();
        ImageView imageView0 = new ImageView(this.getContext());
        this.a = imageView0;
        imageView0.setId(v);
        this.a.setAdjustViewBounds(true);
        LayoutParams constraintLayout$LayoutParams0 = new LayoutParams(-1, -2);
        constraintLayout$LayoutParams0.t = 0;
        constraintLayout$LayoutParams0.v = 0;
        constraintLayout$LayoutParams0.i = 0;
        constraintLayout$LayoutParams0.l = 0;
        this.addView(this.a, constraintLayout$LayoutParams0);
        BrushDrawingView brushDrawingView0 = new BrushDrawingView(this.getContext());
        this.b = brushDrawingView0;
        brushDrawingView0.setVisibility(8);
        LayoutParams constraintLayout$LayoutParams1 = new LayoutParams(0, 0);
        constraintLayout$LayoutParams1.t = v;
        constraintLayout$LayoutParams1.v = v;
        constraintLayout$LayoutParams1.i = v;
        constraintLayout$LayoutParams1.l = v;
        this.addView(this.b, constraintLayout$LayoutParams1);
    }

    BrushDrawingView getBrushDrawingView() {
        return this.b;
    }

    public ImageView getSource() {
        return this.a;
    }
}

