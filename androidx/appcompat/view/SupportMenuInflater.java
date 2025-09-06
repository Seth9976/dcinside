package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.c})
public class SupportMenuInflater extends MenuInflater {
    static class InflatedOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        private Object a;
        private Method b;
        private static final Class[] c;

        static {
            InflatedOnMenuItemClickListener.c = new Class[]{MenuItem.class};
        }

        public InflatedOnMenuItemClickListener(Object object0, String s) {
            this.a = object0;
            Class class0 = object0.getClass();
            try {
                this.b = class0.getMethod(s, InflatedOnMenuItemClickListener.c);
            }
            catch(Exception exception0) {
                InflateException inflateException0 = new InflateException("Couldn\'t resolve menu item onClick handler " + s + " in class " + class0.getName());
                inflateException0.initCause(exception0);
                throw inflateException0;
            }
        }

        @Override  // android.view.MenuItem$OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem0) {
            try {
                if(this.b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean)this.b.invoke(this.a, menuItem0)).booleanValue();
                }
                this.b.invoke(this.a, menuItem0);
                return true;
            }
            catch(Exception exception0) {
            }
            throw new RuntimeException(exception0);
        }
    }

    class MenuState {
        ActionProvider A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D;
        private PorterDuff.Mode E;
        final SupportMenuInflater F;
        private static final int G = 0;
        private static final int H = 0;
        private static final int I = 0;
        private static final int J = 0;
        private static final int K = 0;
        private static final boolean L = false;
        private static final boolean M = true;
        private static final boolean N = true;
        private Menu a;
        private int b;
        private int c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private int i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public MenuState(Menu menu0) {
            this.D = null;
            this.E = null;
            this.a = menu0;
            this.h();
        }

        public void a() {
            this.h = true;
            this.i(this.a.add(this.b, this.i, this.j, this.k));
        }

        public SubMenu b() {
            this.h = true;
            SubMenu subMenu0 = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            this.i(subMenu0.getItem());
            return subMenu0;
        }

        private char c(String s) {
            return s == null ? '\u0000' : s.charAt(0);
        }

        public boolean d() {
            return this.h;
        }

        private Object e(String s, Class[] arr_class, Object[] arr_object) {
            try {
                Constructor constructor0 = Class.forName(s, false, SupportMenuInflater.this.c.getClassLoader()).getConstructor(arr_class);
                constructor0.setAccessible(true);
                return constructor0.newInstance(arr_object);
            }
            catch(Exception exception0) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + s, exception0);
                return null;
            }
        }

        public void f(AttributeSet attributeSet0) {
            TypedArray typedArray0 = SupportMenuInflater.this.c.obtainStyledAttributes(attributeSet0, styleable.MenuGroup);
            this.b = typedArray0.getResourceId(styleable.MenuGroup_android_id, 0);
            this.c = typedArray0.getInt(styleable.MenuGroup_android_menuCategory, 0);
            this.d = typedArray0.getInt(styleable.MenuGroup_android_orderInCategory, 0);
            this.e = typedArray0.getInt(styleable.MenuGroup_android_checkableBehavior, 0);
            this.f = typedArray0.getBoolean(styleable.MenuGroup_android_visible, true);
            this.g = typedArray0.getBoolean(styleable.MenuGroup_android_enabled, true);
            typedArray0.recycle();
        }

        public void g(AttributeSet attributeSet0) {
            TintTypedArray tintTypedArray0 = TintTypedArray.F(SupportMenuInflater.this.c, attributeSet0, styleable.MenuItem);
            this.i = tintTypedArray0.u(styleable.MenuItem_android_id, 0);
            this.j = tintTypedArray0.o(styleable.MenuItem_android_menuCategory, this.c) & 0xFFFF0000 | tintTypedArray0.o(styleable.MenuItem_android_orderInCategory, this.d) & 0xFFFF;
            this.k = tintTypedArray0.x(styleable.MenuItem_android_title);
            this.l = tintTypedArray0.x(styleable.MenuItem_android_titleCondensed);
            this.m = tintTypedArray0.u(styleable.MenuItem_android_icon, 0);
            this.n = this.c(tintTypedArray0.w(styleable.MenuItem_android_alphabeticShortcut));
            this.o = tintTypedArray0.o(styleable.MenuItem_alphabeticModifiers, 0x1000);
            this.p = this.c(tintTypedArray0.w(styleable.MenuItem_android_numericShortcut));
            this.q = tintTypedArray0.o(styleable.MenuItem_numericModifiers, 0x1000);
            this.r = tintTypedArray0.C(styleable.MenuItem_android_checkable) ? tintTypedArray0.a(11, false) : this.e;
            this.s = tintTypedArray0.a(styleable.MenuItem_android_checked, false);
            this.t = tintTypedArray0.a(styleable.MenuItem_android_visible, this.f);
            this.u = tintTypedArray0.a(styleable.MenuItem_android_enabled, this.g);
            this.v = tintTypedArray0.o(styleable.MenuItem_showAsAction, -1);
            this.z = tintTypedArray0.w(styleable.MenuItem_android_onClick);
            this.w = tintTypedArray0.u(styleable.MenuItem_actionLayout, 0);
            this.x = tintTypedArray0.w(styleable.MenuItem_actionViewClass);
            String s = tintTypedArray0.w(styleable.MenuItem_actionProviderClass);
            this.y = s;
            if(s == null || this.w != 0 || this.x != null) {
                if(s != null) {
                    Log.w("SupportMenuInflater", "Ignoring attribute \'actionProviderClass\'. Action view already specified.");
                }
                this.A = null;
            }
            else {
                this.A = (ActionProvider)this.e(s, SupportMenuInflater.k, SupportMenuInflater.this.b);
            }
            this.B = tintTypedArray0.x(styleable.MenuItem_contentDescription);
            this.C = tintTypedArray0.x(styleable.MenuItem_tooltipText);
            this.E = tintTypedArray0.C(styleable.MenuItem_iconTintMode) ? DrawableUtils.e(tintTypedArray0.o(19, -1), this.E) : null;
            this.D = tintTypedArray0.C(styleable.MenuItem_iconTint) ? tintTypedArray0.d(18) : null;
            tintTypedArray0.I();
            this.h = false;
        }

        public void h() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }

        private void i(MenuItem menuItem0) {
            boolean z = false;
            menuItem0.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int v = this.v;
            if(v >= 0) {
                menuItem0.setShowAsAction(v);
            }
            if(this.z != null) {
                if(SupportMenuInflater.this.c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem0.setOnMenuItemClickListener(new InflatedOnMenuItemClickListener(SupportMenuInflater.this.b(), this.z));
            }
            if(this.r >= 2) {
                if(menuItem0 instanceof MenuItemImpl) {
                    ((MenuItemImpl)menuItem0).w(true);
                }
                else if(menuItem0 instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS)menuItem0).j(true);
                }
            }
            String s = this.x;
            if(s != null) {
                menuItem0.setActionView(((View)this.e(s, SupportMenuInflater.j, SupportMenuInflater.this.a)));
                z = true;
            }
            int v1 = this.w;
            if(v1 > 0) {
                if(z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute \'itemActionViewLayout\'. Action view already specified.");
                }
                else {
                    menuItem0.setActionView(v1);
                }
            }
            ActionProvider actionProvider0 = this.A;
            if(actionProvider0 != null) {
                MenuItemCompat.l(menuItem0, actionProvider0);
            }
            MenuItemCompat.p(menuItem0, this.B);
            MenuItemCompat.w(menuItem0, this.C);
            MenuItemCompat.o(menuItem0, this.n, this.o);
            MenuItemCompat.s(menuItem0, this.p, this.q);
            PorterDuff.Mode porterDuff$Mode0 = this.E;
            if(porterDuff$Mode0 != null) {
                MenuItemCompat.r(menuItem0, porterDuff$Mode0);
            }
            ColorStateList colorStateList0 = this.D;
            if(colorStateList0 != null) {
                MenuItemCompat.q(menuItem0, colorStateList0);
            }
        }
    }

    final Object[] a;
    final Object[] b;
    Context c;
    private Object d;
    static final String e = "SupportMenuInflater";
    private static final String f = "menu";
    private static final String g = "group";
    private static final String h = "item";
    static final int i;
    static final Class[] j;
    static final Class[] k;

    static {
        Class[] arr_class = {Context.class};
        SupportMenuInflater.j = arr_class;
        SupportMenuInflater.k = arr_class;
    }

    public SupportMenuInflater(Context context0) {
        super(context0);
        this.c = context0;
        Object[] arr_object = {context0};
        this.a = arr_object;
        this.b = arr_object;
    }

    private Object a(Object object0) {
        if(object0 instanceof Activity) {
            return object0;
        }
        return object0 instanceof ContextWrapper ? this.a(((ContextWrapper)object0).getBaseContext()) : object0;
    }

    Object b() {
        if(this.d == null) {
            this.d = this.a(this.c);
        }
        return this.d;
    }

    private void c(XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Menu menu0) throws XmlPullParserException, IOException {
        MenuState supportMenuInflater$MenuState0 = new MenuState(this, menu0);
        int v = xmlPullParser0.getEventType();
        do {
            if(v == 2) {
                String s = xmlPullParser0.getName();
                if(!s.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + s);
                }
                v = xmlPullParser0.next();
                break;
            }
            v = xmlPullParser0.next();
        }
        while(v != 1);
        String s1 = null;
        boolean z = false;
        boolean z1 = false;
        while(!z1) {
            switch(v) {
                case 1: {
                    throw new RuntimeException("Unexpected end of document");
                }
                case 2: {
                    if(!z) {
                        String s2 = xmlPullParser0.getName();
                        if(s2.equals("group")) {
                            supportMenuInflater$MenuState0.f(attributeSet0);
                        }
                        else if(s2.equals("item")) {
                            supportMenuInflater$MenuState0.g(attributeSet0);
                        }
                        else if(s2.equals("menu")) {
                            this.c(xmlPullParser0, attributeSet0, supportMenuInflater$MenuState0.b());
                        }
                        else {
                            s1 = s2;
                            z = true;
                        }
                    }
                    break;
                }
                case 3: {
                    String s3 = xmlPullParser0.getName();
                    if(z && s3.equals(s1)) {
                        s1 = null;
                        z = false;
                    }
                    else if(s3.equals("group")) {
                        supportMenuInflater$MenuState0.h();
                    }
                    else if(!s3.equals("item")) {
                        if(s3.equals("menu")) {
                            z1 = true;
                        }
                    }
                    else if(!supportMenuInflater$MenuState0.d()) {
                        if(supportMenuInflater$MenuState0.A == null || !supportMenuInflater$MenuState0.A.b()) {
                            supportMenuInflater$MenuState0.a();
                        }
                        else {
                            supportMenuInflater$MenuState0.b();
                        }
                    }
                }
            }
            v = xmlPullParser0.next();
        }
    }

    @Override  // android.view.MenuInflater
    public void inflate(@LayoutRes int v, Menu menu0) {
        XmlResourceParser xmlResourceParser0;
        if(!(menu0 instanceof SupportMenu)) {
            super.inflate(v, menu0);
            return;
        }
        try {
            try {
                xmlResourceParser0 = null;
                boolean z = false;
                xmlResourceParser0 = this.c.getResources().getLayout(v);
                AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
                if(menu0 instanceof MenuBuilder && ((MenuBuilder)menu0).I()) {
                    ((MenuBuilder)menu0).n0();
                    z = true;
                }
                this.c(xmlResourceParser0, attributeSet0, menu0);
                goto label_24;
            }
            catch(XmlPullParserException xmlPullParserException0) {
            }
            catch(IOException iOException0) {
                throw new InflateException("Error inflating menu XML", iOException0);
            }
            throw new InflateException("Error inflating menu XML", xmlPullParserException0);
        }
        catch(Throwable throwable0) {
        }
        if(z) {
            ((MenuBuilder)menu0).m0();
        }
        if(xmlResourceParser0 != null) {
            xmlResourceParser0.close();
        }
        throw throwable0;
    label_24:
        if(z) {
            ((MenuBuilder)menu0).m0();
        }
        if(xmlResourceParser0 != null) {
            xmlResourceParser0.close();
        }
    }
}

