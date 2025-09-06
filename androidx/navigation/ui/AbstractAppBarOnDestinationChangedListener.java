package androidx.navigation.ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.StringRes;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.customview.widget.Openable;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavController.OnDestinationChangedListener;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.r0;
import y4.l;
import y4.m;

public abstract class AbstractAppBarOnDestinationChangedListener implements OnDestinationChangedListener {
    @l
    private final Context a;
    @l
    private final Set b;
    @m
    private final WeakReference c;
    @m
    private DrawerArrowDrawable d;
    @m
    private ValueAnimator e;

    public AbstractAppBarOnDestinationChangedListener(@l Context context0, @l AppBarConfiguration appBarConfiguration0) {
        L.p(context0, "context");
        L.p(appBarConfiguration0, "configuration");
        super();
        this.a = context0;
        this.b = appBarConfiguration0.d();
        Openable openable0 = appBarConfiguration0.c();
        this.c = openable0 == null ? null : new WeakReference(openable0);
    }

    @Override  // androidx.navigation.NavController$OnDestinationChangedListener
    public void a(@l NavController navController0, @l NavDestination navDestination0, @m Bundle bundle0) {
        L.p(navController0, "controller");
        L.p(navDestination0, "destination");
        if(navDestination0 instanceof FloatingWindow) {
            return;
        }
        Openable openable0 = this.c == null ? null : ((Openable)this.c.get());
        if(this.c != null && openable0 == null) {
            navController0.G0(this);
            return;
        }
        CharSequence charSequence0 = navDestination0.r();
        boolean z = true;
        if(charSequence0 != null) {
            StringBuffer stringBuffer0 = new StringBuffer();
            Matcher matcher0 = Pattern.compile("\\{(.+?)\\}").matcher(charSequence0);
            while(matcher0.find()) {
                String s = matcher0.group(1);
                if(bundle0 == null || !bundle0.containsKey(s)) {
                    throw new IllegalArgumentException("Could not find \"" + s + "\" in " + bundle0 + " to fill label \"" + charSequence0 + '\"');
                }
                matcher0.appendReplacement(stringBuffer0, "");
                stringBuffer0.append(String.valueOf(bundle0.get(s)));
            }
            matcher0.appendTail(stringBuffer0);
            this.d(stringBuffer0);
        }
        boolean z1 = NavigationUI.i(navDestination0, this.b);
        if(openable0 == null && z1) {
            this.c(null, 0);
            return;
        }
        if(openable0 == null || !z1) {
            z = false;
        }
        this.b(z);
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    private final void b(boolean z) {
        V v0;
        DrawerArrowDrawable drawerArrowDrawable0 = this.d;
        if(drawerArrowDrawable0 == null) {
        label_4:
            DrawerArrowDrawable drawerArrowDrawable1 = new DrawerArrowDrawable(this.a);
            this.d = drawerArrowDrawable1;
            v0 = r0.a(drawerArrowDrawable1, Boolean.FALSE);
        }
        else {
            v0 = r0.a(drawerArrowDrawable0, Boolean.TRUE);
            if(v0 == null) {
                goto label_4;
            }
        }
        DrawerArrowDrawable drawerArrowDrawable2 = (DrawerArrowDrawable)v0.a();
        this.c(drawerArrowDrawable2, (z ? string.nav_app_bar_open_drawer_description : string.nav_app_bar_navigate_up_description));
        if(((Boolean)v0.b()).booleanValue()) {
            float f = drawerArrowDrawable2.i();
            ValueAnimator valueAnimator0 = this.e;
            if(valueAnimator0 != null) {
                valueAnimator0.cancel();
            }
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(drawerArrowDrawable2, "progress", new float[]{f, (z ? 0.0f : 1.0f)});
            this.e = objectAnimator0;
            if(objectAnimator0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.animation.ObjectAnimator");
            }
            objectAnimator0.start();
            return;
        }
        drawerArrowDrawable2.setProgress((z ? 0.0f : 1.0f));
    }

    protected abstract void c(@m Drawable arg1, @StringRes int arg2);

    protected abstract void d(@m CharSequence arg1);
}

