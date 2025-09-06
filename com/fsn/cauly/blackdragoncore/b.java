package com.fsn.cauly.blackdragoncore;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.fsn.cauly.R.drawable;
import com.fsn.cauly.Y.i0;
import com.fsn.cauly.Y.j0;
import com.fsn.cauly.Y.l0;
import com.fsn.cauly.Y.m0;
import com.fsn.cauly.Y.o;
import com.fsn.cauly.Y.q.a;
import com.fsn.cauly.Y.q;
import com.fsn.cauly.Y.r;
import com.fsn.cauly.Y.s0;
import com.fsn.cauly.Y.s;
import com.fsn.cauly.Y.t0;
import com.fsn.cauly.Y.t;
import com.fsn.cauly.Y.u;
import com.fsn.cauly.Y.v0;
import com.fsn.cauly.Y.v;
import com.fsn.cauly.Y.w;
import com.fsn.cauly.Y.y;
import com.fsn.cauly.blackdragoncore.utils.c;
import com.fsn.cauly.blackdragoncore.utils.g;
import com.fsn.cauly.blackdragoncore.utils.h;
import com.fsn.cauly.blackdragoncore.utils.j;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class b implements a, com.fsn.cauly.Y.s0.a {
    class e extends v0 {
        final b s;

        @Override  // com.fsn.cauly.Y.v0
        public void c() {
            try {
                b.this.e = new View(b.this.a.b);
                b.this.e.setBackgroundResource(drawable.cauly_default_banner);
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
            }
        }
    }

    i0 a;
    q b;
    long c;
    public static boolean d = false;
    View e;
    s0 f;
    s0 g;
    s0 h;
    s0 i;
    boolean j;
    ArrayList k;
    Handler l;
    int m;
    private j0 n;
    static long o;
    static long p;
    static s0 q;

    static {
    }

    public b() {
        this.k = new ArrayList();
        this.m = 0;
    }

    void A() {
        if(this.e == null) {
            return;
        }
        RelativeLayout relativeLayout0 = (RelativeLayout)this.a.a();
        if(relativeLayout0 != null) {
            c.a(this.e);
            relativeLayout0.removeView(this.e);
            this.e = null;
        }
    }

    void B() {
        s0 s00 = this.h;
        if(s00 != null) {
            s00.cancel();
            this.h.a(null);
            this.h = null;
        }
    }

    void C() {
        s0 s00 = this.i;
        if(s00 != null) {
            s00.cancel();
            this.i = null;
        }
    }

    void D() {
        long v = System.currentTimeMillis();
        if(v - d.b > 1800000L) {
            d.b = v;
            j0 j00 = new j0();
            d.a().a(this.a, j00);
        }
    }

    boolean E() {
        i0 i00 = this.a;
        if(i00.r == null) {
            return false;
        }
        String s = j.a(i00.b, "CLOSEAD", "");
        if(!TextUtils.isEmpty(s) && s.contains("::")) {
            String[] arr_s = s.split("::");
            if(arr_s.length == 4 && !TextUtils.isEmpty(arr_s[0])) {
                long v = Long.parseLong(arr_s[0]);
                int v1 = Integer.parseInt(arr_s[1]);
                String s1 = arr_s[3];
                try {
                    if(v1 == 0 && com.fsn.cauly.Y.b.a(this.a.b, s1).o == 0) {
                        return this.a.r.t <= 0 || System.currentTimeMillis() - v >= ((long)this.a.r.t) ? this.a.r.t <= 0 : true;
                    }
                    return false;
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return false;
    }

    j0 F() {
        i0 i00 = this.a;
        if(i00.r == null) {
            return null;
        }
        String s = j.a(i00.b, "CLOSEAD", "");
        if(!TextUtils.isEmpty(s) && s.contains("::")) {
            String[] arr_s = s.split("::");
            if(arr_s.length == 4 && !TextUtils.isEmpty(arr_s[0])) {
                Integer.parseInt(arr_s[1]);
                String s1 = arr_s[3];
                try {
                    return com.fsn.cauly.Y.b.a(this.a.b, s1);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return null;
    }

    int G() {
        i0 i00 = this.a;
        if(i00.r == null) {
            return -1;
        }
        String s = j.a(i00.b, "CLOSEAD", "");
        if(!TextUtils.isEmpty(s) && s.contains("::")) {
            String[] arr_s = s.split("::");
            return arr_s.length != 4 || TextUtils.isEmpty(arr_s[0]) ? -1 : Integer.parseInt(arr_s[1]);
        }
        return -1;
    }

    void H() {
        if(com.fsn.cauly.blackdragoncore.a.a().a(this.a.b, true)) {
            com.fsn.cauly.blackdragoncore.a.a().b(this.a.b, true);
            com.fsn.cauly.Y.a a0 = new com.fsn.cauly.Y.a(this.a);
            a0.setTag(22);
            a0.a(this);
            a0.execute();
            return;
        }
        this.I();
    }

    void I() {
        s0 s00 = this.g;
        boolean z = this.a.r != null;
        if(this.a.a == com.fsn.cauly.Y.i0.a.d) {
            if(s00 != null && s00.getErrorCode() == 0) {
                b.o = System.currentTimeMillis();
                this.a.r = ((com.fsn.cauly.Y.e)s00).i();
            }
            if(this.k.size() > 0) {
                this.j(((int)(((Integer)this.k.get(0)))));
            }
        }
        else if(s00 != null && s00.getErrorCode() == 0) {
            b.o = System.currentTimeMillis();
            this.a.r = ((com.fsn.cauly.Y.e)s00).i();
            if(!z) {
                this.i(false, false);
            }
        }
        else if(!z) {
            if(this.a.F && !com.fsn.cauly.blackdragoncore.c.b().e(this.a)) {
                this.P();
            }
            this.d(((com.fsn.cauly.Y.e)s00).getErrorCode(), ((com.fsn.cauly.Y.e)s00).d());
        }
        l0 l00 = this.a.r;
        if(l00 != null && (l00.u != null && l00.u.equalsIgnoreCase("y"))) {
            b.d = true;
        }
    }

    void J() {
        String s = j.a(this.a.b, "BANNERAD", "");
        if(!TextUtils.isEmpty(s) && s.contains("::")) {
            com.fsn.cauly.Y.i0.a i0$a0 = com.fsn.cauly.Y.i0.a.a;
            if(this.a.a == i0$a0) {
                String[] arr_s = s.split("::");
                if(arr_s.length >= 2 && arr_s[1].length() > 0) {
                    l0 l00 = this.a.r;
                    if(l00 != null && l00.r > 0) {
                        try {
                            long v = Long.parseLong(arr_s[1]);
                            i0 i00 = this.a;
                            if(System.currentTimeMillis() - v < ((long)i00.r.r)) {
                                this.z(com.fsn.cauly.Y.b.a(i00.b, arr_s[2]));
                                if(this.a.a == i0$a0 && !this.a.s) {
                                    this.Q();
                                }
                                return;
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                }
            }
        }
        j.b(this.a.b, "BANNERAD", "");
        this.d(-200, "Request Failed( You are not allowed to send requests under minimum interval )");
        if(this.a.F && !com.fsn.cauly.blackdragoncore.c.b().e(this.a)) {
            this.P();
        }
        if(this.a.a == com.fsn.cauly.Y.i0.a.a && !this.a.s) {
            this.Q();
        }
    }

    void K() {
        this.B();
        if(this.e == null) {
            return;
        }
        RelativeLayout relativeLayout0 = (RelativeLayout)this.a.a();
        if(relativeLayout0 != null) {
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, com.fsn.cauly.blackdragoncore.utils.d.a(this.a, com.fsn.cauly.Y.i0.a.a).y);
            relativeLayout0.addView(this.e, relativeLayout$LayoutParams0);
        }
    }

    boolean L() {
        int v;
        l0 l00 = this.a.r;
        if(l00 == null) {
            v = 10;
        }
        else {
            v = l00.x;
            if(v <= 0) {
                v = 10;
            }
        }
        if(this.m >= v) {
            this.m = 0;
            return true;
        }
        return false;
    }

    void M() {
        i0 i00 = this.a;
        if(i00 != null) {
            i00.c();
        }
        this.y();
    }

    int N() {
        i0 i00 = this.a;
        if(i00.v) {
            return 1;
        }
        if(i00.r == null) {
            return 2;
        }
        this.y();
        if(!this.w()) {
            return 7;
        }
        if(this.n() && !this.a.M) {
            return 6;
        }
        if(!com.fsn.cauly.blackdragoncore.c.b().d(this.a) && !com.fsn.cauly.blackdragoncore.c.b().b(this.a)) {
            com.fsn.cauly.Y.i0.a i0$a0 = com.fsn.cauly.Y.i0.a.b;
            if(this.a.a == i0$a0 && !this.v() || this.a.a == com.fsn.cauly.Y.i0.a.a && !this.v() && com.fsn.cauly.blackdragoncore.c.b().e(this.a)) {
                return 3;
            }
            if(this.a.a == i0$a0 && com.fsn.cauly.blackdragoncore.c.b().g(this.a)) {
                return 8;
            }
            return this.r() ? 9 : -1;
        }
        return 5;
    }

    void O() {
        i0 i00 = this.a;
        if(i00 == null) {
            return;
        }
        i00.d();
        long v = System.currentTimeMillis() - b.o;
        long v1 = (long)m0.f;
        if(v > v1) {
            this.h(false);
        }
        else {
            this.t(((int)(v1 - v)));
        }
        this.i(false, false);
    }

    void P() {
        i0 i00 = this.a;
        if(i00 == null) {
            return;
        }
        if(i00.a != com.fsn.cauly.Y.i0.a.b && i00.a != com.fsn.cauly.Y.i0.a.d && this.e == null && this.h == null) {
            e b$e0 = new e(this);
            this.h = b$e0;
            b$e0.setTag(7);
            this.h.a(this);
            this.h.execute();
        }
    }

    void Q() {
        if(this.a == null) {
            return;
        }
        this.y();
        i0 i00 = this.a;
        Object object0 = i00.c;
        if(object0 != null && object0 instanceof View) {
            try {
                if(i00.Q && ((ViewGroup)((View)object0).getParent()) != null) {
                    i0 i01 = this.a;
                    l0 l00 = i01.r;
                    if(l00 != null) {
                        t0 t00 = new t0((i01.n ? l00.m * 1000 : i01.o * 1000));
                        this.f = t00;
                        t00.a(this);
                        t00.setTag(2);
                        t00.execute();
                    }
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }

    Object a(int v, Object object0, Object object1) {
        class com.fsn.cauly.blackdragoncore.b.a implements Runnable {
            final Object a;
            final Object b;
            final b c;

            com.fsn.cauly.blackdragoncore.b.a(Object object0, Object object1) {
                this.a = object0;
                this.b = object1;
                super();
            }

            @Override
            public void run() {
                b.this.a(this.a, this.b);
            }
        }

        try {
            switch(v) {
                case 1: {
                    i0 i00 = new i0();
                    this.a = i00;
                    i00.b = (Context)object1;
                    i00.a(((HashMap)object0));
                    this.l = new Handler();
                    i0 i01 = this.a;
                    if(i01 != null) {
                        Context context0 = i01.b;
                        if(context0 != null) {
                            m0.c(context0, j.a(context0, "EN_ID", false));
                            return null;
                        }
                    }
                    break;
                }
                case 2: {
                    if(TextUtils.isEmpty(m0.i(this.a.b))) {
                        Handler handler0 = this.l;
                        if(handler0 != null) {
                            handler0.postDelayed(new com.fsn.cauly.blackdragoncore.b.a(this, object0, object1), 500L);
                        }
                        return true;
                    }
                    return this.a(object0, object1);
                }
                case 3: {
                    this.x();
                    return null;
                }
                case 5: {
                    this.O();
                    return null;
                }
                case 6: {
                    this.M();
                    return null;
                }
                case 7: {
                    if(this.j) {
                        this.j = false;
                        ((w)this.b).a(object0);
                        return null;
                    }
                    break;
                }
                case 8: {
                    this.m(((Boolean)object0).booleanValue());
                    return null;
                }
                case 10: {
                    String s = (String)object0;
                    return null;
                }
                case 12: 
                case 13: 
                case 14: {
                    if(this.a.r != null) {
                        this.j(v);
                        return null;
                    }
                    if(this.k.size() <= 0) {
                        if(System.currentTimeMillis() - b.o <= ((long)m0.f) || !h.a(this.a.b)) {
                            this.h(true);
                        }
                        else {
                            this.h(false);
                        }
                    }
                    if(!this.k.contains(v)) {
                        this.k.add(v);
                        return null;
                    }
                    break;
                }
                case 15: {
                    if(this.j) {
                        this.j = false;
                        ((u)this.b).h();
                        return null;
                    }
                    break;
                }
                case 16: {
                    ((t)this.b).b(object0);
                    return null;
                }
                case 17: {
                    ((t)this.b).a(object0);
                    return null;
                }
                case 18: {
                    if(this.j) {
                        this.j = false;
                        this.a();
                        return null;
                    }
                    break;
                }
                default: {
                    return null;
                }
            }
        }
        catch(Exception unused_ex) {
        }
        return null;
    }

    public Object a(Object object0, Object object1) {
        if(!this.a.a(object0, object1)) {
            return false;
        }
        this.y();
        g.a(com.fsn.cauly.blackdragoncore.utils.g.b.a, "Cauly 3.5.30 started.");
        this.a.R = System.currentTimeMillis();
        if(this.a.a == com.fsn.cauly.Y.i0.a.d) {
            return true;
        }
        if(System.currentTimeMillis() - b.o > ((long)m0.f) && h.a(this.a.b)) {
            this.h(false);
            return true;
        }
        this.h(true);
        return true;
    }

    public void a() {
        o.a(this.a, this.n, null);
    }

    @Override  // com.fsn.cauly.Y.q$a
    public void a(j0 j00) {
        this.a.a(102, null, null);
        if(this.a != null && this.a.a == com.fsn.cauly.Y.i0.a.d) {
            this.e(500, false);
        }
    }

    @Override  // com.fsn.cauly.Y.q$a
    public void a(j0 j00, int v, String s) {
        if(j00 != null && !j00.J) {
            j00.J = true;
            this.d(v, s);
        }
    }

    @Override  // com.fsn.cauly.Y.s0$a
    public void a(s0 s00) {
        try {
            switch(s00.getTag()) {
                case 1: {
                    this.f = null;
                    this.q(s00);
                    break;
                }
                case 2: {
                    this.f = null;
                    this.i(false, false);
                    return;
                }
                case 3: {
                    this.d(-200, "Request Failed( You are not allowed to send requests under minimum interval )");
                    return;
                }
                case 4: {
                    this.f = null;
                    this.i(false, false);
                    return;
                }
                case 5: {
                    this.H();
                    return;
                }
                case 7: {
                    this.K();
                    return;
                }
                case 8: {
                    this.d(200, "No filled AD");
                    return;
                }
                case 10: {
                    this.u(s00);
                    return;
                }
                case 11: {
                    this.f(12, false, false);
                    return;
                }
                case 12: 
                case 13: 
                case 14: {
                    j0 j00 = ((com.fsn.cauly.Y.b)s00).j();
                    this.c(s00.getTag(), j00, ((com.fsn.cauly.Y.b)s00).getErrorCode(), ((com.fsn.cauly.Y.b)s00).d(), ((com.fsn.cauly.Y.b)s00).f(), false);
                    return;
                }
                case 20: {
                    this.J();
                    return;
                }
                case 22: {
                    this.l(s00);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    void b(int v) {
        String s = j.a(this.a.b, "CLOSEAD", "");
        if(!TextUtils.isEmpty(s) && s.contains("::")) {
            String[] arr_s = s.split("::");
            if(arr_s.length == 4 && !TextUtils.isEmpty(arr_s[0])) {
                int v1 = Integer.parseInt(arr_s[1]);
                String s1 = arr_s[2];
                String s2 = arr_s[3];
                try {
                    this.c(v, com.fsn.cauly.Y.b.a(this.a.b, s2), v1, s1, s2, true);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    @Override  // com.fsn.cauly.Y.q$a
    public void b(j0 j00) {
        this.j = true;
        this.A();
        this.n = j00;
        if(!j00.J) {
            j00.J = true;
            this.k(j00, j00.o, j00.p);
        }
        i0 i00 = this.a;
        if(i00.a == com.fsn.cauly.Y.i0.a.a && i00.Q) {
            o.a(i00, j00, null);
        }
    }

    void c(int v, j0 j00, int v1, String s, String s1, boolean z) {
        class com.fsn.cauly.blackdragoncore.b.c implements Runnable {
            final b a;

            @Override
            public void run() {
                if(b.this.k.size() > 0) {
                    int v = (int)(((Integer)b.this.k.get(0)));
                    b.this.j(v);
                }
            }
        }

        String s2;
        if(v1 == 0) {
            j00.o = this.o(j00);
            s2 = this.s(j00);
        }
        else {
            s2 = s;
        }
        switch(v) {
            case 12: {
                if(z || v1 != 0 || j00.o != 0 && j00.o != 400) {
                    if(v1 == 0) {
                        v1 = j00.o;
                    }
                    this.d(v1, s2);
                }
                else if(!d.a().b(this.a, j00)) {
                    this.e(100, true);
                }
                else {
                    int v2 = j00.o;
                    if(v2 == 0) {
                        String s3 = com.fsn.cauly.blackdragoncore.c.a(j00, s2);
                        this.a.a(0x70, j00.o, s3);
                    }
                    else if(v2 == 400) {
                        this.d(400, s2);
                    }
                    j.b(this.a.b, "CLOSEAD", System.currentTimeMillis() + "::" + 0 + "::" + s + "::" + s1);
                }
                break;
            }
            case 13: {
                if(v1 != 0 || j00.o != 0 && j00.o != 100) {
                    if(v1 == 0) {
                        v1 = j00.o;
                    }
                    this.d(v1, s2);
                }
                else {
                    String s4 = com.fsn.cauly.blackdragoncore.c.a(j00, s2);
                    this.a.a(0x70, j00.o, s4);
                }
                break;
            }
            case 14: {
                ((s)this.b).b(j00);
                j.b(this.a.b, "CLOSEAD", "");
            }
        }
        if(this.k.size() > 0) {
            this.k.remove(0);
        }
        new Handler().post(new com.fsn.cauly.blackdragoncore.b.c(this));
    }

    void d(int v, String s) {
        this.a.a(101, v, s);
    }

    private void e(int v, boolean z) {
        class com.fsn.cauly.blackdragoncore.b.d implements Runnable {
            final boolean a;
            final b b;

            com.fsn.cauly.blackdragoncore.b.d(boolean z) {
                this.a = z;
                super();
            }

            @Override
            public void run() {
                i0 i00 = b.this.a;
                if(i00 != null && (i00.b != null && i00.b instanceof Activity && ((Activity)i00.b).hasWindowFocus())) {
                    b.this.f(12, false, this.a);
                }
            }
        }

        this.l.postDelayed(new com.fsn.cauly.blackdragoncore.b.d(this, z), ((long)v));
    }

    void f(int v, boolean z, boolean z1) {
        this.D();
        if(v == 13 || z && this.E()) {
            if(v == 14) {
                this.z(null);
                this.b(14);
                return;
            }
            if(v == 13) {
                j0 j00 = this.F();
                if(j00 != null) {
                    if(this.G() == 0 && j00.o == 0) {
                        this.b(13);
                        return;
                    }
                    this.d(this.o(j00), this.s(j00));
                    return;
                }
                this.d(200, "No filled AD");
                return;
            }
            this.p(v);
        }
        else {
            if(v == 14) {
                this.z(null);
            }
            if(!z1 && !this.v()) {
                if(v == 13 || v == 14) {
                    this.d(-200, "Request Failed( You are not allowed to send requests under minimum interval )");
                    this.p(v);
                }
            }
            else if(v != 14) {
                this.p(v);
                if(this.L()) {
                    return;
                }
                Point point0 = com.fsn.cauly.blackdragoncore.utils.d.a(this.a, this.a.a);
                int v1 = this.m;
                this.m = v1 + 1;
                com.fsn.cauly.Y.b b0 = new com.fsn.cauly.Y.b(this.a, point0.x, point0.y, false, true, v1);
                this.f = b0;
                b0.setTag(v);
                b0.a(this);
                b0.execute();
            }
        }
    }

    void g(String s, String s1) {
        i0 i00 = this.a;
        if(i00.a == com.fsn.cauly.Y.i0.a.a) {
            j.b(i00.b, "BANNERAD", s + "::" + System.currentTimeMillis() + "::" + s1);
        }
    }

    void h(boolean z) {
        s0 s00 = this.g;
        if(s00 != null) {
            s00.cancel();
            this.g = null;
        }
        String s = m0.f(this.a.b);
        if(!z && s != null) {
            File file0 = new File(s);
            if(file0.exists()) {
                file0.delete();
            }
        }
        com.fsn.cauly.Y.e e0 = new com.fsn.cauly.Y.e(this.a.b, this.a.f, s);
        e0.a(z);
        this.g = e0;
        e0.setTag(5);
        this.g.a(this);
        this.g.execute();
    }

    void i(boolean z, boolean z1) {
        Point point0;
        if(this.L()) {
            this.d(200, "No filled AD");
            i0 i00 = this.a;
            if(i00.a == com.fsn.cauly.Y.i0.a.a) {
                if(!i00.s) {
                    this.Q();
                }
                if(this.a.F && !com.fsn.cauly.blackdragoncore.c.b().e(this.a)) {
                    this.P();
                }
            }
            return;
        }
        this.D();
        i0 i01 = this.a;
        com.fsn.cauly.Y.i0.a i0$a0 = i01.a;
        if(i0$a0 == com.fsn.cauly.Y.i0.a.f) {
            this.b = new t(i01);
            return;
        }
        if(i0$a0 == com.fsn.cauly.Y.i0.a.h) {
            this.b = new y(i01);
            return;
        }
        if(i0$a0 == com.fsn.cauly.Y.i0.a.g) {
            if(this.b == null) {
                v v0 = new v(i01);
                this.b = v0;
                v0.a(this);
                this.b.a(((j0)this.a.C.get("adItem")));
            }
            return;
        }
        if(i0$a0 == com.fsn.cauly.Y.i0.a.c) {
            int v1 = this.m;
            this.m = v1 + 1;
            com.fsn.cauly.Y.b b0 = new com.fsn.cauly.Y.b(this.a, ((int)this.a.E), !this.a.E, false, z, v1);
            this.f = b0;
            b0.setTag(10);
            b0.a(this);
            b0.execute();
            return;
        }
        int v2 = this.N();
        if(z1) {
            v2 = 9;
        }
        else {
            this.m = 0;
        }
        if(v2 < 0) {
            l0 l00 = this.a.r;
            if(l00 != null && l00.v) {
                t0 t00 = new t0(10);
                t00.setTag(20);
                t00.a(this);
                t00.execute();
                return;
            }
            this.d(-200, "Request Failed( You are not allowed to send requests under minimum interval )");
            return;
        }
        if(v2 == 9) {
            boolean z2 = this.a.a != com.fsn.cauly.Y.i0.a.a || com.fsn.cauly.blackdragoncore.c.b().h(this.a) || !com.fsn.cauly.blackdragoncore.c.b().g(this.a) ? z : true;
            boolean z3 = this.a.a == com.fsn.cauly.Y.i0.a.a ? com.fsn.cauly.blackdragoncore.utils.d.a(this.a) : true;
            ViewGroup viewGroup0 = (ViewGroup)this.a.C.get("viewgroup_id");
            if(viewGroup0 != null) {
                point0 = com.fsn.cauly.blackdragoncore.utils.d.a(this.a.b, viewGroup0);
            }
            else if(this.a.C.containsKey("ad_customSize")) {
                String s = (String)this.a.C.get("ad_customSize");
                point0 = com.fsn.cauly.blackdragoncore.utils.d.a(this.a.b, s);
            }
            else {
                point0 = com.fsn.cauly.blackdragoncore.utils.d.a(this.a, this.a.a);
            }
            int v3 = this.m;
            this.m = v3 + 1;
            com.fsn.cauly.Y.b b1 = new com.fsn.cauly.Y.b(this.a, point0.x, point0.y, z3, z2, v3);
            this.f = b1;
            b1.setTag(1);
            b1.a(this);
            b1.execute();
            return;
        }
        if(this.a.a == com.fsn.cauly.Y.i0.a.b) {
            t0 t01 = new t0(10);
            this.i = t01;
            if(v2 == 3) {
                t01.setTag(3);
            }
            else {
                t01.setTag(8);
            }
            this.i.a(this);
            this.i.execute();
            return;
        }
        t0 t02 = new t0(500);
        this.f = t02;
        t02.a(this);
        this.f.setTag(4);
        this.f.execute();
    }

    void j(int v) {
        this.f(v, true, false);
    }

    void k(j0 j00, int v, String s) {
        String s1 = com.fsn.cauly.blackdragoncore.c.a(j00, s);
        this.a.a(100, v, s1);
    }

    private void l(s0 s00) {
        try {
            com.fsn.cauly.blackdragoncore.a.a().b(this.a.b, false);
            if(((com.fsn.cauly.Y.a)s00).getErrorCode() == 0) {
                switch(((com.fsn.cauly.Y.a)s00).l()) {
                    case 0: 
                    case 200: {
                        com.fsn.cauly.blackdragoncore.a.a().h(this.a.b);
                        com.fsn.cauly.blackdragoncore.a.a().a(this.a.b, ((long)((com.fsn.cauly.Y.a)s00).k()));
                        com.fsn.cauly.blackdragoncore.a.a().a(this.a.b, ((com.fsn.cauly.Y.a)s00).j());
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
        this.I();
    }

    void m(boolean z) {
        this.a.w = z;
    }

    boolean n() {
        return ((KeyguardManager)this.a.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    int o(j0 j00) {
        int v = j00.o;
        boolean z = "0".equals(j00.a);
        int v1 = 100;
        if(z && j00.o == 0) {
            v = 100;
        }
        if(!z || j00.o != 400) {
            v1 = v;
        }
        int v2 = j00.o;
        if(v2 != 400 && this.a.a == com.fsn.cauly.Y.i0.a.b && z) {
            v1 = 200;
        }
        return v2 != 400 && !this.x(j00) ? 200 : v1;
    }

    @Override  // com.fsn.cauly.Y.q$a
    public void onClickAd() {
        g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "onClickAd.");
        this.a.a(99, null, null);
    }

    void p(int v) {
        class com.fsn.cauly.blackdragoncore.b.b implements Runnable {
            final b a;

            @Override
            public void run() {
                i0 i00 = b.this.a;
                if(i00 != null && (i00.b != null && i00.r != null && ((Activity)i00.b).hasWindowFocus())) {
                    t0 t00 = new t0((b.this.a.r.t > 0 ? b.this.a.r.t : 600000));
                    b.q = t00;
                    t00.a(b.this);
                    t00.setTag(11);
                    t00.execute();
                }
            }
        }

        if(v == 12) {
            s0 s00 = b.q;
            if(s00 != null) {
                s00.cancel();
            }
            this.l.postDelayed(new com.fsn.cauly.blackdragoncore.b.b(this), 500L);
        }
    }

    void q(s0 s00) {
        String s;
        if(this.a.v) {
            this.i(false, false);
        }
        else {
            j0 j00 = ((com.fsn.cauly.Y.b)s00).j();
            int v = s00.getErrorCode();
            if(v == 0) {
                j00.o = this.o(j00);
                s = this.s(j00);
            }
            else {
                s = ((com.fsn.cauly.Y.b)s00).d();
            }
            if(v != 0 || j00.o != 0 && j00.o != 100) {
                if(j00 != null) {
                    j00.J = true;
                }
                if(v == 0) {
                    v = j00.o;
                }
                this.d(v, s);
                i0 i00 = this.a;
                if(i00 == null) {
                    return;
                }
                if(i00.F && !com.fsn.cauly.blackdragoncore.c.b().e(this.a)) {
                    this.P();
                }
            }
            else {
                if(!d.a().b(this.a, j00)) {
                    this.i(false, true);
                    return;
                }
                if(com.fsn.cauly.blackdragoncore.c.b().b(this.a, j00)) {
                    this.i(true, false);
                    return;
                }
                this.z(j00);
                this.g(j00.n, ((com.fsn.cauly.Y.b)s00).f());
            }
            if(this.a.a == com.fsn.cauly.Y.i0.a.a && !this.a.s) {
                this.Q();
            }
            if(j00 != null && j00.Q && System.currentTimeMillis() - b.p > 60000L) {
                b.p = System.currentTimeMillis();
                this.h(false);
            }
        }
    }

    boolean r() {
        if(this.a.a == com.fsn.cauly.Y.i0.a.a) {
            long v = System.currentTimeMillis();
            long v1 = j.a(this.a.b, "BANNER_REQUEST_TIME", 0L);
            i0 i00 = this.a;
            if(v - v1 <= ((long)(i00.r.r > 0 ? i00.r.r : 0))) {
                return false;
            }
            j.b(i00.b, "BANNER_REQUEST_TIME", v);
        }
        return true;
    }

    String s(j0 j00) {
        if(!this.x(j00)) {
            return "Undisplayable AD dropped.";
        }
        int v = j00.o;
        if(v != -200) {
            switch(v) {
                case -100: {
                    return "SDK error";
                }
                case 0: 
                case 100: {
                    return null;
                }
                case 200: {
                    return "No filled AD";
                }
                case 400: {
                    return "Invalid APPCODE";
                }
                case 500: {
                    return "Server error";
                }
                default: {
                    return "Cauly error";
                }
            }
        }
        return "Request Failed";
    }

    void t(int v) {
        t0 t00 = new t0(v);
        t00.a(this);
        t00.setTag(6);
        t00.execute();
    }

    void u(s0 s00) {
        String s;
        j0 j00 = ((com.fsn.cauly.Y.b)s00).j();
        int v = s00.getErrorCode();
        if(v == 0) {
            j00.o = this.o(j00);
            s = this.s(j00);
        }
        else {
            s = ((com.fsn.cauly.Y.b)s00).d();
        }
        if(v == 0 && (j00.o == 0 || j00.o == 100)) {
            if(!d.a().b(this.a, j00)) {
                this.i(false, true);
                return;
            }
            this.z(j00);
            return;
        }
        if(v == 0) {
            v = j00.o;
        }
        this.d(v, s);
    }

    boolean v() {
        i0 i00 = this.a;
        if(i00.r == null) {
            return true;
        }
        com.fsn.cauly.Y.i0.a i0$a0 = i00.a;
        long v = 1000L;
        if(i0$a0 == com.fsn.cauly.Y.i0.a.b) {
            long v1 = System.currentTimeMillis();
            long v2 = j.a(this.a.b, "LAST_INTERSTITAL_TIME", 0L);
            i0 i01 = this.a;
            int v3 = i01.r.q;
            if(v3 >= 0) {
                v = (long)v3;
            }
            if(v1 - v2 <= v) {
                g.a(com.fsn.cauly.blackdragoncore.utils.g.b.c, "Request Failed( You are not allowed to send requests under minimum interval )");
                return false;
            }
            j.b(i01.b, "LAST_INTERSTITAL_TIME", v1);
            return true;
        }
        if(i0$a0 == com.fsn.cauly.Y.i0.a.d) {
            long v4 = System.currentTimeMillis();
            long v5 = j.a(this.a.b, "LAST_CLOSEAD_TIME", 0L);
            i0 i02 = this.a;
            int v6 = i02.r.s;
            if(v6 >= 0) {
                v = (long)v6;
            }
            if(v4 - v5 <= v) {
                g.a(com.fsn.cauly.blackdragoncore.utils.g.b.c, "Request Failed( You are not allowed to send requests under minimum interval )");
                return false;
            }
            j.b(i02.b, "LAST_CLOSEAD_TIME", v4);
            return true;
        }
        long v7 = System.currentTimeMillis();
        if(v7 - this.c <= 1000L) {
            g.a(com.fsn.cauly.blackdragoncore.utils.g.b.c, "Request Failed( You are not allowed to send requests under minimum interval )");
            return false;
        }
        this.c = v7;
        return true;
    }

    boolean w() {
        return ((PowerManager)this.a.b.getSystemService("power")).isScreenOn();
    }

    public void x() {
        this.y();
        this.B();
        this.C();
        i0 i00 = this.a;
        if(i00 != null) {
            i00.e();
        }
        q q0 = this.b;
        if(q0 != null) {
            q0.g();
        }
    }

    // 去混淆评级： 低(30)
    boolean x(j0 j00) {
        if(this.a.b instanceof Activity) {
            return j00.A == null ? false : (!j00.A.equalsIgnoreCase("portrait_fix") && (j00.f == null || !j00.f.equalsIgnoreCase("3d")) || com.fsn.cauly.blackdragoncore.utils.d.b(this.a.b, 1)) && ((!j00.A.equalsIgnoreCase("landscape_fix") || com.fsn.cauly.blackdragoncore.utils.d.b(this.a.b, 0)) && (!j00.A.equalsIgnoreCase("allow_orientation") || com.fsn.cauly.blackdragoncore.utils.d.b(this.a.b, -1)));
        }
        return true;
    }

    void y() {
        s0 s00 = this.f;
        if(s00 != null) {
            s00.cancel();
            this.f = null;
        }
        s0 s01 = b.q;
        if(s01 != null) {
            s01.cancel();
        }
    }

    void z(j0 j00) {
        try {
            i0 i00 = this.a;
            if(i00 == null) {
                return;
            }
            if(this.b == null || i00.a == com.fsn.cauly.Y.i0.a.d) {
                com.fsn.cauly.Y.i0.a i0$a0 = i00.a;
                if(i0$a0 == com.fsn.cauly.Y.i0.a.a) {
                    this.b = new r(i00);
                }
                else if(i0$a0 == com.fsn.cauly.Y.i0.a.c) {
                    this.b = new v(i00);
                }
                else if(i0$a0 == com.fsn.cauly.Y.i0.a.d) {
                    this.b = new s(this.a);
                }
                else if(i0$a0 == com.fsn.cauly.Y.i0.a.e) {
                    this.b = new u(i00);
                }
                else {
                    this.b = new w(i00);
                }
                this.b.a(this);
            }
            this.b.a(j00);
        }
        catch(Exception unused_ex) {
        }
    }
}

