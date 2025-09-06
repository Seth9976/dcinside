package com.fsn.cauly.Y;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.fsn.cauly.blackdragoncore.utils.g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class d0 implements InvocationHandler {
    public interface b {
        void a();

        void a(String arg1);

        void b();

        void c();
    }

    Handler a;
    Context b;
    WeakReference c;
    boolean d;
    boolean e;
    Object f;
    String g;
    boolean h;
    String i;
    Method j;
    Method k;
    Method l;
    Method m;

    public View a() {
        View view1;
        Class class2;
        Class class0 = String.class;
        View view0 = null;
        if(!this.e) {
            return null;
        }
        try {
            ClassLoader classLoader0 = this.b.getClassLoader();
            Class class1 = classLoader0.loadClass("com.trid.tridad.OnNotifyListener");
            class2 = classLoader0.loadClass("com.trid.tridad.TriDContentsView");
            Constructor constructor0 = class2.getConstructor(Context.class, class0, class0, class0, class1, class0, Boolean.TYPE, Boolean.TYPE);
            Object object0 = Proxy.newProxyInstance(classLoader0, new Class[]{class1}, this);
            view1 = (View)constructor0.newInstance(this.b, null, null, null, object0, this.g, Boolean.FALSE, Boolean.valueOf(this.h));
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
            return view0;
        }
        try {
            this.j = class2.getMethod("goToApp", class0, class0);
            this.k = class2.getMethod("notify", class0, class0);
            this.l = class2.getMethod("onPause", null);
            this.m = class2.getMethod("onResume", null);
            return view1;
        }
        catch(Throwable throwable0) {
            view0 = view1;
        }
        throwable0.printStackTrace();
        return view0;
    }

    public void a(View view0) {
        try {
            this.l.invoke(view0, null);
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
    }

    public void a(View view0, String s, String s1) {
        try {
            this.j.invoke(view0, s, s1);
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
    }

    public boolean a(Context context0, b d0$b0) {
        this.c();
        this.b = context0;
        this.c = new WeakReference(d0$b0);
        ClassLoader classLoader0 = context0.getClassLoader();
        try {
            Class class0 = classLoader0.loadClass("com.trid.tridad.TriDLoader");
            this.f = class0.getConstructor(Context.class, Handler.class, Integer.TYPE).newInstance(context0, this.a, 0);
            this.g = (String)class0.getMethod("getEnginePath", null).invoke(this.f, null);
            this.h = class0.getMethod("isLocalEngine", null).invoke(this.f, null).equals(Boolean.TRUE);
            return true;
        }
        catch(Throwable unused_ex) {
            g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "No 3d Module Linked.");
            return false;
        }
    }

    void b(Message message0) {
        b d0$b0 = (b)this.c.get();
        if(d0$b0 == null) {
            return;
        }
        switch(message0.what) {
            case 0: {
                d0$b0.b();
                return;
            }
            case 100: {
                d0$b0.a();
                return;
            }
            case 200: {
                d0$b0.a(this.i);
            }
        }
    }

    public void b(View view0) {
        try {
            this.m.invoke(view0, null);
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
    }

    public void b(View view0, String s, String s1) {
        try {
            this.k.invoke(view0, s, s1);
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
    }

    public void c() {
        class a extends Handler {
            final d0 a;

            @Override  // android.os.Handler
            public void handleMessage(Message message0) {
                d0 d00 = d0.this;
                if(d00.d) {
                    return;
                }
                if(!d00.e) {
                    d00.e = true;
                    d00.e();
                    return;
                }
                d00.b(message0);
            }
        }

        if(this.a != null) {
            return;
        }
        this.a = new a(this);
    }

    public void d() {
        this.d = true;
    }

    void e() {
        b d0$b0 = (b)this.c.get();
        if(d0$b0 == null) {
            return;
        }
        d0$b0.c();
    }

    @Override
    public Object invoke(Object object0, Method method0, Object[] arr_object) {
        if(method0.getName().equals("onNotify")) {
            String s = (String)arr_object[0];
            String s1 = (String)arr_object[1];
            if(s.equals("on3DViewClosed")) {
                this.a.sendEmptyMessage(0);
                return 0;
            }
            if(s.equals("onShowMovie")) {
                this.i = s1;
                this.a.sendEmptyMessage(200);
                return 0;
            }
            if(s.equals("on3DViewReady")) {
                this.a.sendEmptyMessage(100);
            }
        }
        return 0;
    }
}

