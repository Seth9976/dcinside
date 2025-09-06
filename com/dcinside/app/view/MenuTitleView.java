package com.dcinside.app.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import com.dcinside.app.R.styleable;
import com.dcinside.app.util.vk;

public class MenuTitleView extends LinearLayout {
    private TextView a;
    private TextView b;
    private ImageView c;

    public MenuTitleView(Context context0) {
        super(context0);
        this.a(context0, null);
    }

    public MenuTitleView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a(context0, attributeSet0);
    }

    public MenuTitleView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a(context0, attributeSet0);
    }

    @TargetApi(21)
    public MenuTitleView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.a(context0, attributeSet0);
    }

    private void a(Context context0, AttributeSet attributeSet0) {
        TypedArray typedArray0;
        this.setGravity(17);
        this.setOrientation(0);
        View.inflate(context0, 0x7F0E0216, this);  // layout:view_menu_title
        this.a = (TextView)this.findViewById(0x7F0B0834);  // id:menu_title_text
        this.b = (TextView)this.findViewById(0x7F0B0833);  // id:menu_title_sub
        ImageView imageView0 = (ImageView)this.findViewById(0x7F0B0832);  // id:menu_title_arrow
        this.c = imageView0;
        vk.h(0x7F04032A, new View[]{imageView0});  // attr:icTintNormal
        if(attributeSet0 != null) {
            try {
                typedArray0 = null;
                typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, styleable.MenuTitleView, 0, 0);
                this.setText(typedArray0.getString(1));
                this.setIcon(typedArray0.getResourceId(0, 0));
            }
            catch(Exception unused_ex) {
                if(typedArray0 == null) {
                    return;
                }
            }
            catch(Throwable throwable0) {
                if(typedArray0 != null) {
                    typedArray0.recycle();
                }
                throw throwable0;
            }
            typedArray0.recycle();
        }
    }

    public ImageView getArrow() {
        return this.c;
    }

    public TextView getSub() {
        return this.b;
    }

    public TextView getText() {
        return this.a;
    }

    public void setIcon(@DrawableRes int v) {
        if(v != 0) {
            Drawable drawable0 = ContextCompat.getDrawable(this.getContext(), v);
            if(drawable0 != null) {
                drawable0.setBounds(0, 0, 0, 0);
            }
            this.a.setCompoundDrawables(drawable0, null, null, null);
            return;
        }
        this.a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    public void setSub(@StringRes int v) {
        this.setSub(this.getResources().getString(v));
    }

    public void setSub(String s) {
        this.getSub().setText(s);
    }

    public void setText(@StringRes int v) {
        this.setText(this.getResources().getString(v));
    }

    public void setText(String s) {
        this.getText().setText(s);
    }
}

