package com.iab.omid.library.bytedance2.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bytedance2.processor.a.a;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements a {
    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int arg1, long arg2);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int arg1, long arg2);
    }

    class b implements Runnable {
        b() {
            super();
        }

        @Override
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    class c implements Runnable {
        c() {
            super();
        }

        @Override
        public void run() {
            if(TreeWalker.k != null) {
                TreeWalker.k.post(TreeWalker.l);
                TreeWalker.k.postDelayed(TreeWalker.m, 200L);
            }
        }
    }

    private List a;
    private int b;
    private boolean c;
    private final List d;
    private com.iab.omid.library.bytedance2.processor.b e;
    private com.iab.omid.library.bytedance2.walking.a f;
    private com.iab.omid.library.bytedance2.walking.b g;
    private long h;
    private static TreeWalker i;
    private static Handler j;
    private static Handler k;
    private static final Runnable l;
    private static final Runnable m;

    static {
        TreeWalker.i = new TreeWalker();
        TreeWalker.j = new Handler(Looper.getMainLooper());
        TreeWalker.k = null;
        TreeWalker.l = new b();
        TreeWalker.m = new c();
    }

    TreeWalker() {
        this.a = new ArrayList();
        this.c = false;
        this.d = new ArrayList();
        this.f = new com.iab.omid.library.bytedance2.walking.a();
        this.e = new com.iab.omid.library.bytedance2.processor.b();
        this.g = new com.iab.omid.library.bytedance2.walking.b(new com.iab.omid.library.bytedance2.walking.async.c());
    }

    private void a(long v) {
        if(this.a.size() > 0) {
            for(Object object0: this.a) {
                TreeWalkerTimeLogger treeWalker$TreeWalkerTimeLogger0 = (TreeWalkerTimeLogger)object0;
                treeWalker$TreeWalkerTimeLogger0.onTreeProcessed(this.b, TimeUnit.NANOSECONDS.toMillis(v));
                if(treeWalker$TreeWalkerTimeLogger0 instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger)treeWalker$TreeWalkerTimeLogger0).onTreeProcessedNano(this.b, v);
                }
            }
        }
    }

    private void a(View view0, com.iab.omid.library.bytedance2.processor.a a0, JSONObject jSONObject0, com.iab.omid.library.bytedance2.walking.c c0, boolean z) {
        a0.a(view0, jSONObject0, this, c0 == com.iab.omid.library.bytedance2.walking.c.a, z);
    }

    private void a(String s, View view0, JSONObject jSONObject0) {
        com.iab.omid.library.bytedance2.processor.a a0 = this.e.b();
        String s1 = this.f.b(s);
        if(s1 != null) {
            JSONObject jSONObject1 = a0.a(view0);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject1, s);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObject1, s1);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject0, jSONObject1);
        }
    }

    private boolean a(View view0, JSONObject jSONObject0) {
        com.iab.omid.library.bytedance2.walking.a.a a$a0 = this.f.c(view0);
        if(a$a0 != null) {
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject0, a$a0);
            return true;
        }
        return false;
    }

    @Override  // com.iab.omid.library.bytedance2.processor.a$a
    public void a(View view0, com.iab.omid.library.bytedance2.processor.a a0, JSONObject jSONObject0, boolean z) {
        if(!h.d(view0)) {
            return;
        }
        com.iab.omid.library.bytedance2.walking.c c0 = this.f.e(view0);
        if(c0 == com.iab.omid.library.bytedance2.walking.c.c) {
            return;
        }
        JSONObject jSONObject1 = a0.a(view0);
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject0, jSONObject1);
        if(!this.b(view0, jSONObject1)) {
            boolean z1 = z || this.a(view0, jSONObject1);
            if(this.c && c0 == com.iab.omid.library.bytedance2.walking.c.b && !z1) {
                com.iab.omid.library.bytedance2.weakreference.a a1 = new com.iab.omid.library.bytedance2.weakreference.a(view0);
                this.d.add(a1);
            }
            this.a(view0, a0, jSONObject1, c0, z1);
        }
        ++this.b;
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalker$TreeWalkerTimeLogger0) {
        if(!this.a.contains(treeWalker$TreeWalkerTimeLogger0)) {
            this.a.add(treeWalker$TreeWalkerTimeLogger0);
        }
    }

    private boolean b(View view0, JSONObject jSONObject0) {
        String s = this.f.d(view0);
        if(s != null) {
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject0, s);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject0, Boolean.valueOf(this.f.f(view0)));
            this.f.d();
            return true;
        }
        return false;
    }

    private void d() {
        this.a(9374354558900L - this.h);
    }

    private void e() {
        this.b = 0;
        this.d.clear();
        this.c = false;
        for(Object object0: com.iab.omid.library.bytedance2.internal.c.c().a()) {
            if(((com.iab.omid.library.bytedance2.adsession.a)object0).e()) {
                this.c = true;
                break;
            }
            if(false) {
                break;
            }
        }
        this.h = 9374356971300L;
    }

    @VisibleForTesting
    void f() {
        this.f.e();
        com.iab.omid.library.bytedance2.processor.a a0 = this.e.a();
        if(this.f.b().size() > 0) {
            for(Object object0: this.f.b()) {
                JSONObject jSONObject0 = a0.a(null);
                this.a(((String)object0), this.f.a(((String)object0)), jSONObject0);
                com.iab.omid.library.bytedance2.utils.c.b(jSONObject0);
                HashSet hashSet0 = new HashSet();
                hashSet0.add(((String)object0));
                this.g.a(jSONObject0, hashSet0, 9374443009700L);
            }
        }
        if(this.f.c().size() > 0) {
            JSONObject jSONObject1 = a0.a(null);
            this.a(null, a0, jSONObject1, com.iab.omid.library.bytedance2.walking.c.a, false);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObject1);
            this.g.b(jSONObject1, this.f.c(), 9374443009700L);
            if(this.c) {
                for(Object object1: com.iab.omid.library.bytedance2.internal.c.c().a()) {
                    ((com.iab.omid.library.bytedance2.adsession.a)object1).a(this.d);
                }
            }
        }
        else {
            this.g.b();
        }
        this.f.a();
    }

    public void g() {
        this.k();
    }

    public static TreeWalker getInstance() {
        return TreeWalker.i;
    }

    public void h() {
        this.i();
    }

    private void i() {
        if(TreeWalker.k == null) {
            Handler handler0 = new Handler(Looper.getMainLooper());
            TreeWalker.k = handler0;
            handler0.post(TreeWalker.l);
            TreeWalker.k.postDelayed(TreeWalker.m, 200L);
        }
    }

    public void j() {
        class com.iab.omid.library.bytedance2.walking.TreeWalker.a implements Runnable {
            final TreeWalker a;

            @Override
            public void run() {
                TreeWalker.this.g.b();
            }
        }

        this.g();
        this.a.clear();
        TreeWalker.j.post(new com.iab.omid.library.bytedance2.walking.TreeWalker.a(this));
    }

    private void k() {
        Handler handler0 = TreeWalker.k;
        if(handler0 != null) {
            handler0.removeCallbacks(TreeWalker.m);
            TreeWalker.k = null;
        }
    }

    private void l() {
        this.e();
        this.f();
        this.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalker$TreeWalkerTimeLogger0) {
        if(this.a.contains(treeWalker$TreeWalkerTimeLogger0)) {
            this.a.remove(treeWalker$TreeWalkerTimeLogger0);
        }
    }
}

