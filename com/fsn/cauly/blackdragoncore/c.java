package com.fsn.cauly.blackdragoncore;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.fsn.cauly.Y.i0.a;
import com.fsn.cauly.Y.i0;
import com.fsn.cauly.Y.j0;
import com.fsn.cauly.Y.q;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    private static c a;
    public HashMap b;
    public HashMap c;

    static {
    }

    public c() {
        this.b = new HashMap();
    }

    public static String a(j0 j00, String s) {
        if(j00 != null) {
            try {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("earntype", "" + j00.b0);
                jSONObject0.put("price", "" + j00.a0);
                return jSONObject0.toString();
            }
            catch(JSONException unused_ex) {
            }
        }
        return s;
    }

    public HashMap a() {
        return this.c;
    }

    public void a(i0 i00, j0 j00) {
        Iterator iterator0 = this.b.keySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            i0 i01 = (i0)object0;
            if(i01.a() == null) {
                iterator0.remove();
            }
            else if(i00.c != null && i01.c.equals(i00.c)) {
                iterator0.remove();
            }
            else if(this.k(i01)) {
                iterator0.remove();
            }
        }
        this.b.put(i00, j00);
    }

    public void a(String s, i0 i00, j0 j00, com.fsn.cauly.blackdragoncore.contents.c c0, q q0) {
        if(this.c == null) {
            this.c = new HashMap();
        }
        this.c.put("adContext", i00);
        this.c.put("adItem", j00);
        this.c.put("landing_type", s);
        this.c.put("contentView", c0);
        this.c.put("adContainer", q0);
    }

    public boolean a(i0 i00, j0 j00, boolean z) {
        if(j00 != null && i00 != null) {
            if(this.b(i00)) {
                return true;
            }
            a i0$a0 = i00.a;
            if(i0$a0 == a.a) {
                if(j00.f != null && j00.f.startsWith("rich_pe")) {
                    if(!this.d(i00)) {
                        return this.h(i00) ? false : this.g(i00);
                    }
                    return true;
                }
                return z && this.g(i00);
            }
            return i0$a0 == a.b && (this.d(i00) || this.g(i00));
        }
        return false;
    }

    public static c b() {
        synchronized(c.class) {
            if(c.a == null) {
                Class class1 = c.class;
                synchronized(class1) {
                    if(c.a == null) {
                        c.a = new c();
                    }
                }
            }
            return c.a;
        }
    }

    public boolean b(i0 i00) {
        for(Object object0: this.b.keySet()) {
            if("call".equals(((j0)this.b.get(((i0)object0))).l) && ((i0)object0).x) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public boolean b(i0 i00, j0 j00) {
        return this.a(i00, j00, false);
    }

    private HashMap c(i0 i00) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.b.keySet()) {
            i0 i01 = (i0)object0;
            if(i01.b != null && i01.b.getClass().equals(i00.b.getClass())) {
                hashMap0.put(i01, ((j0)this.b.get(i01)));
            }
        }
        return hashMap0;
    }

    public void c(i0 i00, j0 j00) {
        Iterator iterator0 = this.b.keySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            i0 i01 = (i0)object0;
            if(i01.a() == null) {
                iterator0.remove();
            }
            else if(i00.c != null && i01.c.equals(i00.c)) {
                iterator0.remove();
            }
        }
        if(i00.a == a.b) {
            i00.x = true;
        }
        this.b.put(i00, j00);
    }

    public boolean d(i0 i00) {
        Iterator iterator0 = this.b.keySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            i0 i01 = (i0)object0;
            if(i01.c == null) {
            }
            else if(this.k(i01)) {
                iterator0.remove();
            }
            else {
                if(i01.b != null && i01.b.getClass().equals(i00.b.getClass()) && i01.a == a.b && i01.x) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public boolean e(i0 i00) {
        for(Object object0: this.b.keySet()) {
            if(i00.a() != null && ((i0)object0).a() != null && i00.c.equals(((i0)object0).c)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    private boolean f(i0 i00) {
        if(i00.a() != null && i00.a() instanceof View) {
            View view0 = (View)i00.a();
            Context context0 = i00.b;
            return context0 instanceof Activity ? !view0.isShown() && !((Activity)context0).hasWindowFocus() : !view0.isShown();
        }
        return false;
    }

    public boolean g(i0 i00) {
        Iterator iterator0 = this.b.keySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            i0 i01 = (i0)object0;
            j0 j00 = (j0)this.b.get(i01);
            if(i01.c == null) {
            }
            else if(this.k(i01)) {
                iterator0.remove();
            }
            else if(this.f(i01) && i01.b.getClass().equals(i00.b.getClass())) {
                iterator0.remove();
            }
            else {
                if(j00 != null && i01.b != null && (j00.f != null && j00.f.startsWith("rich_pe") && i01.b.getClass().equals(i00.b.getClass()))) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public boolean h(i0 i00) {
        if(this.g(i00)) {
            HashMap hashMap0 = this.c(i00);
            for(Object object0: hashMap0.keySet()) {
                j0 j00 = (j0)hashMap0.get(((i0)object0));
                if(i00.c.equals(((i0)object0).c) && (j00.f != null && j00.f.startsWith("rich_pe"))) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public void i(i0 i00) {
        this.b.remove(i00);
    }

    public void j(i0 i00) {
        if(i00 == null) {
            return;
        }
        Iterator iterator0 = this.b.keySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            i0 i01 = (i0)object0;
            Context context0 = i01.b;
            if(context0 == null) {
                iterator0.remove();
            }
            else if(context0.getClass().equals(i00.b.getClass())) {
                iterator0.remove();
            }
            else {
                Context context1 = i01.b;
                if(context1 instanceof Activity) {
                    Context context2 = i00.b;
                    if(context2 instanceof Activity && ((Activity)context1).getParent() != null && ((Activity)context2).getParent() != null && ((Activity)context1).getParent().getClass().equals(((Activity)context2).getParent().getClass())) {
                        iterator0.remove();
                    }
                }
            }
        }
    }

    private boolean k(i0 i00) {
        if(i00.a() != null && i00.a() instanceof View) {
            View view0 = (View)i00.a();
            Context context0 = i00.b;
            return context0 instanceof Activity ? !view0.isShown() && ((Activity)context0).hasWindowFocus() : !view0.isShown();
        }
        return false;
    }
}

