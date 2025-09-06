package com.dcinside.rich.styles;

import android.text.Editable;
import android.widget.ImageView;
import com.dcinside.rich.RichEditText;
import com.dcinside.rich.RichToolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class a implements b {
    public static final class com.dcinside.rich.styles.a.a {
        private com.dcinside.rich.styles.a.a() {
        }

        public com.dcinside.rich.styles.a.a(w w0) {
        }
    }

    @l
    private Class a;
    @m
    private final WeakReference b;
    @m
    private final WeakReference c;
    @l
    public static final com.dcinside.rich.styles.a.a d = null;
    public static final int e = 18;
    public static final int f = 17;
    public static final int g = 34;

    static {
        a.d = new com.dcinside.rich.styles.a.a(null);
    }

    public a(@l RichToolbar richToolbar0, @l ImageView imageView0) {
        L.p(richToolbar0, "toolbar");
        L.p(imageView0, "imageView");
        super();
        Type type0 = this.getClass().getGenericSuperclass();
        L.n(type0, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        Type type1 = ((ParameterizedType)type0).getActualTypeArguments()[0];
        L.n(type1, "null cannot be cast to non-null type java.lang.Class<E of com.dcinside.rich.styles.AbstractRichStyle>");
        this.a = (Class)type1;
        this.b = new WeakReference(richToolbar0);
        this.c = new WeakReference(imageView0);
    }

    @Override  // com.dcinside.rich.styles.b
    @m
    public RichEditText b() {
        RichToolbar richToolbar0 = this.e();
        return richToolbar0 == null ? null : richToolbar0.getEditText();
    }

    @Override  // com.dcinside.rich.styles.b
    public void c() {
        RichEditText richEditText0 = this.b();
        if(richEditText0 != null) {
            richEditText0.p();
        }
    }

    @Override  // com.dcinside.rich.styles.b
    @m
    public RichToolbar e() {
        return this.b == null ? null : ((RichToolbar)this.b.get());
    }

    @Override  // com.dcinside.rich.styles.b
    @m
    public ImageView g() {
        return this.c == null ? null : ((ImageView)this.c.get());
    }

    protected final void h(@l Editable editable0, Object object0, int v, int v1, int v2) {
        L.p(editable0, "editable");
        if(v1 >= v) {
            editable0.setSpan(object0, v, v1, v2);
        }
    }

    @l
    protected final Class i() {
        return this.a;
    }

    protected static void j() {
    }

    protected final void k(@l Class class0) {
        L.p(class0, "<set-?>");
        this.a = class0;
    }
}

