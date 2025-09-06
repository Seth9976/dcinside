package com.facebook.drawee.drawable;

import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import y4.l;
import y4.m;
import z3.n;

public final class f {
    @l
    public static final f a;

    static {
        f.a = new f();
    }

    @m
    @n
    public static final Drawable a(@m Drawable drawable0) {
        if(drawable0 == null) {
            return null;
        }
        c c0 = drawable0 instanceof c ? ((c)drawable0) : null;
        if(c0 != null) {
            Drawable drawable1 = c0.p();
            if(drawable1 != null) {
                return drawable1;
            }
        }
        Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
        return drawable$ConstantState0 == null ? null : drawable$ConstantState0.newDrawable();
    }

    @n
    public static final void b(@m Drawable drawable0, @m Drawable drawable1) {
        if(drawable1 != null && drawable0 != null && drawable0 != drawable1) {
            drawable0.setBounds(drawable1.getBounds());
            drawable0.setChangingConfigurations(drawable1.getChangingConfigurations());
            drawable0.setLevel(drawable1.getLevel());
            drawable0.setVisible(drawable1.isVisible(), false);
            drawable0.setState(drawable1.getState());
        }
    }

    @n
    public static final int c(int v) {
        switch(v >>> 24) {
            case 0: {
                return -2;
            }
            case 0xFF: {
                return -1;
            }
            default: {
                return -3;
            }
        }
    }

    @n
    public static final int d(int v, int v1) {
        switch(v1) {
            case 0: {
                return v & 0xFFFFFF;
            }
            case 0xFF: {
                return v;
            }
            default: {
                return v & 0xFFFFFF | (v >>> 24) * (v1 + (v1 >> 7)) >> 8 << 24;
            }
        }
    }

    @n
    public static final void e(@m Drawable drawable0, @m Drawable.Callback drawable$Callback0, @m v v0) {
        if(drawable0 == null) {
            return;
        }
        drawable0.setCallback(drawable$Callback0);
        u u0 = drawable0 instanceof u ? ((u)drawable0) : null;
        if(u0 != null) {
            u0.h(v0);
        }
    }

    @n
    public static final void f(@m Drawable drawable0, @m e e0) {
        if(drawable0 == null) {
            return;
        }
        if(e0 != null) {
            e0.a(drawable0);
        }
    }
}

