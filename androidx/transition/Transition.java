package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.util.Consumer;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public abstract class Transition implements Cloneable {
    static class AnimationInfo {
        View a;
        String b;
        TransitionValues c;
        WindowId d;
        Transition e;
        Animator f;

        AnimationInfo(View view0, String s, Transition transition0, WindowId windowId0, TransitionValues transitionValues0, Animator animator0) {
            this.a = view0;
            this.b = s;
            this.c = transitionValues0;
            this.d = windowId0;
            this.e = transition0;
            this.f = animator0;
        }
    }

    static class ArrayListManager {
        static ArrayList a(ArrayList arrayList0, Object object0) {
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
            }
            if(!arrayList0.contains(object0)) {
                arrayList0.add(object0);
            }
            return arrayList0;
        }

        static ArrayList b(ArrayList arrayList0, Object object0) {
            if(arrayList0 != null) {
                arrayList0.remove(object0);
                return arrayList0.isEmpty() ? null : arrayList0;
            }
            return null;
        }
    }

    public static abstract class EpicenterCallback {
        @Nullable
        public abstract Rect a(@NonNull Transition arg1);
    }

    @RequiresApi(26)
    static class Impl26 {
        @DoNotInline
        static long a(Animator animator0) {
            return animator0.getTotalDuration();
        }

        @DoNotInline
        static void b(Animator animator0, long v) {
            ((AnimatorSet)animator0).setCurrentPlayTime(v);
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MatchOrder {
    }

    @RequiresApi(34)
    class SeekController extends TransitionListenerAdapter implements OnAnimationUpdateListener, TransitionSeekController {
        private long a;
        private ArrayList b;
        private ArrayList c;
        private boolean d;
        private boolean e;
        private SpringAnimation f;
        private Consumer[] g;
        private final VelocityTracker1D h;
        private Runnable i;
        final Transition j;

        SeekController() {
            this.a = -1L;
            this.b = null;
            this.c = null;
            this.g = null;
            this.h = new VelocityTracker1D();
        }

        @Override  // androidx.transition.TransitionSeekController
        public void b(float f) {
            if(this.f != null) {
                throw new IllegalStateException("setCurrentFraction() called after animation has been started");
            }
            this.m(((long)(f * ((float)this.c()))));
        }

        @Override  // androidx.transition.TransitionSeekController
        public long c() {
            return Transition.this.Y();
        }

        @Override  // androidx.transition.TransitionSeekController
        public void d(@NonNull Consumer consumer0) {
            ArrayList arrayList0 = this.c;
            if(arrayList0 != null) {
                arrayList0.remove(consumer0);
            }
        }

        @Override  // androidx.transition.TransitionSeekController
        public float e() {
            return ((float)this.f()) / ((float)this.c());
        }

        @Override  // androidx.transition.TransitionSeekController
        public long f() {
            return Math.min(this.c(), Math.max(0L, this.a));
        }

        @Override  // androidx.transition.TransitionSeekController
        public void g() {
            this.v();
            this.f.z(((float)(this.c() + 1L)));
        }

        @Override  // androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationUpdateListener
        public void h(DynamicAnimation dynamicAnimation0, float f, float f1) {
            long v = Math.max(-1L, Math.min(this.c() + 1L, Math.round(f)));
            Transition.this.B0(v, this.a);
            this.a = v;
            this.u();
        }

        @Override  // androidx.transition.TransitionSeekController
        public void i(@NonNull Consumer consumer0) {
            if(this.isReady()) {
                consumer0.accept(this);
                return;
            }
            if(this.b == null) {
                this.b = new ArrayList();
            }
            this.b.add(consumer0);
        }

        @Override  // androidx.transition.TransitionSeekController
        public boolean isReady() {
            return this.d;
        }

        @Override  // androidx.transition.TransitionSeekController
        public void j(@NonNull Consumer consumer0) {
            ArrayList arrayList0 = this.b;
            if(arrayList0 != null) {
                arrayList0.remove(consumer0);
                if(this.b.isEmpty()) {
                    this.b = null;
                }
            }
        }

        @Override  // androidx.transition.TransitionSeekController
        public void m(long v) {
            if(this.f != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if(v != this.a && this.isReady()) {
                if(!this.e) {
                    if(v != 0L || this.a <= 0L) {
                        long v1 = this.c();
                        if(v == v1 && this.a < v1) {
                            v = v1 + 1L;
                        }
                    }
                    else {
                        v = -1L;
                    }
                    long v2 = this.a;
                    if(v != v2) {
                        Transition.this.B0(v, v2);
                        this.a = v;
                    }
                }
                this.u();
                long v3 = AnimationUtils.currentAnimationTimeMillis();
                this.h.a(v3, ((float)v));
            }
        }

        @Override  // androidx.transition.TransitionSeekController
        public void o(@NonNull Consumer consumer0) {
            if(this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(consumer0);
        }

        @Override  // androidx.transition.TransitionSeekController
        public void q(@NonNull Runnable runnable0) {
            this.i = runnable0;
            this.v();
            this.f.z(0.0f);
        }

        @Override  // androidx.transition.TransitionListenerAdapter
        public void r(@NonNull Transition transition0) {
            this.e = true;
        }

        private void u() {
            if(this.c != null && !this.c.isEmpty()) {
                int v = this.c.size();
                if(this.g == null) {
                    this.g = new Consumer[v];
                }
                Consumer[] arr_consumer = (Consumer[])this.c.toArray(this.g);
                this.g = null;
                for(int v1 = 0; v1 < v; ++v1) {
                    arr_consumer[v1].accept(this);
                    arr_consumer[v1] = null;
                }
                this.g = arr_consumer;
            }
        }

        private void v() {
            if(this.f != null) {
                return;
            }
            long v = AnimationUtils.currentAnimationTimeMillis();
            this.h.a(v, ((float)this.a));
            this.f = new SpringAnimation(new FloatValueHolder());
            SpringForce springForce0 = new SpringForce();
            springForce0.g(1.0f);
            springForce0.i(200.0f);
            this.f.D(springForce0);
            this.f.t(((float)this.a));
            this.f.c(this);
            this.f.u(this.h.b());
            this.f.p(((float)(this.c() + 1L)));
            this.f.q(-1.0f);
            this.f.r(4.0f);
            this.f.b((DynamicAnimation dynamicAnimation0, boolean z, float f, float f1) -> if(!z) {
                if(f < 1.0f) {
                    long v = this.c();
                    Transition transition0 = ((TransitionSet)Transition.this).T0(0);
                    Transition transition1 = transition0.C;
                    transition0.C = null;
                    Transition.this.B0(-1L, this.a);
                    Transition.this.B0(v, -1L);
                    this.a = v;
                    Runnable runnable0 = this.i;
                    if(runnable0 != null) {
                        runnable0.run();
                    }
                    Transition.this.E.clear();
                    if(transition1 != null) {
                        transition1.n0(TransitionNotification.b, true);
                    }
                }
                else {
                    Transition.this.n0(TransitionNotification.b, false);
                }
            });
        }

        void w() {
            long v = this.c() == 0L ? 1L : 0L;
            Transition.this.B0(v, this.a);
            this.a = v;
        }

        // 检测为 Lambda 实现
        private void x(DynamicAnimation dynamicAnimation0, boolean z, float f, float f1) [...]

        public void y() {
            this.d = true;
            ArrayList arrayList0 = this.b;
            if(arrayList0 != null) {
                this.b = null;
                for(int v = 0; v < arrayList0.size(); ++v) {
                    ((Consumer)arrayList0.get(v)).accept(this);
                }
            }
            this.u();
        }
    }

    public interface TransitionListener {
        void a(@NonNull Transition arg1);

        void k(@NonNull Transition arg1);

        void l(@NonNull Transition arg1);

        void n(@NonNull Transition arg1, boolean arg2);

        void p(@NonNull Transition arg1);

        void r(@NonNull Transition arg1);

        void s(@NonNull Transition arg1, boolean arg2);
    }

    interface TransitionNotification {
        public static final TransitionNotification a;
        public static final TransitionNotification b;
        public static final TransitionNotification c;
        public static final TransitionNotification d;
        public static final TransitionNotification e;

        static {
            TransitionNotification.a = new f();
            TransitionNotification.b = new g();
            TransitionNotification.c = new h();
            TransitionNotification.d = new i();
            TransitionNotification.e = new j();
        }

        void a(@NonNull TransitionListener arg1, @NonNull Transition arg2, boolean arg3);
    }

    private boolean A;
    boolean B;
    private Transition C;
    private ArrayList D;
    ArrayList E;
    TransitionPropagation F;
    private EpicenterCallback G;
    private ArrayMap H;
    private PathMotion I;
    long J;
    SeekController K;
    long L;
    private static final String M = "Transition";
    private static final int M8 = 4;
    private static final Animator[] N = null;
    private static final String N8 = "instance";
    static final boolean O = false;
    private static final String O8 = "name";
    public static final int P = 1;
    private static final String P8 = "id";
    private static final int Q = 1;
    private static final String Q8 = "itemId";
    private static final int[] R8 = null;
    private static final PathMotion S8 = null;
    private static ThreadLocal T8 = null;
    public static final int X = 2;
    public static final int Y = 3;
    public static final int Z = 4;
    private String a;
    private long b;
    long c;
    private TimeInterpolator d;
    ArrayList e;
    ArrayList f;
    private ArrayList g;
    private ArrayList h;
    private ArrayList i;
    private ArrayList j;
    private ArrayList k;
    private ArrayList l;
    private ArrayList m;
    private ArrayList n;
    private ArrayList o;
    private TransitionValuesMaps p;
    private TransitionValuesMaps q;
    TransitionSet r;
    private int[] s;
    private ArrayList t;
    private ArrayList u;
    private TransitionListener[] v;
    boolean w;
    ArrayList x;
    private Animator[] y;
    int z;

    static {
        Transition.N = new Animator[0];
        Transition.R8 = new int[]{2, 1, 3, 4};
        Transition.S8 = new PathMotion() {
            @Override  // androidx.transition.PathMotion
            @NonNull
            public Path a(float f, float f1, float f2, float f3) {
                Path path0 = new Path();
                path0.moveTo(f, f1);
                path0.lineTo(f2, f3);
                return path0;
            }
        };
        Transition.T8 = new ThreadLocal();
    }

    public Transition() {
        this.a = this.getClass().getName();
        this.b = -1L;
        this.c = -1L;
        this.d = null;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = new TransitionValuesMaps();
        this.q = new TransitionValuesMaps();
        this.r = null;
        this.s = Transition.R8;
        this.w = false;
        this.x = new ArrayList();
        this.y = Transition.N;
        this.z = 0;
        this.A = false;
        this.B = false;
        this.C = null;
        this.D = null;
        this.E = new ArrayList();
        this.I = Transition.S8;
    }

    public Transition(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        this.a = this.getClass().getName();
        this.b = -1L;
        this.c = -1L;
        this.d = null;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = new TransitionValuesMaps();
        this.q = new TransitionValuesMaps();
        this.r = null;
        this.s = Transition.R8;
        this.w = false;
        this.x = new ArrayList();
        this.y = Transition.N;
        this.z = 0;
        this.A = false;
        this.B = false;
        this.C = null;
        this.D = null;
        this.E = new ArrayList();
        this.I = Transition.S8;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, Styleable.c);
        long v = (long)TypedArrayUtils.k(typedArray0, ((XmlResourceParser)attributeSet0), "duration", 1, -1);
        if(v >= 0L) {
            this.C0(v);
        }
        long v1 = (long)TypedArrayUtils.k(typedArray0, ((XmlResourceParser)attributeSet0), "startDelay", 2, -1);
        if(v1 > 0L) {
            this.I0(v1);
        }
        int v2 = TypedArrayUtils.l(typedArray0, ((XmlResourceParser)attributeSet0), "interpolator", 0, 0);
        if(v2 > 0) {
            this.E0(AnimationUtils.loadInterpolator(context0, v2));
        }
        String s = TypedArrayUtils.m(typedArray0, ((XmlResourceParser)attributeSet0), "matchOrder", 3);
        if(s != null) {
            this.F0(Transition.o0(s));
        }
        typedArray0.recycle();
    }

    private ArrayList A(ArrayList arrayList0, int v, boolean z) {
        if(v > 0) {
            return z ? ArrayListManager.a(arrayList0, v) : ArrayListManager.b(arrayList0, v);
        }
        return arrayList0;
    }

    void A0(boolean z) {
        this.w = z;
    }

    private static ArrayList B(ArrayList arrayList0, Object object0, boolean z) {
        if(object0 != null) {
            return z ? ArrayListManager.a(arrayList0, object0) : ArrayListManager.b(arrayList0, object0);
        }
        return arrayList0;
    }

    @RequiresApi(34)
    void B0(long v, long v1) {
        long v2 = this.Y();
        boolean z = v < v1;
        int v4 = Long.compare(v1, 0L);
        if(v4 < 0 && v >= 0L || v1 > v2 && v <= v2) {
            this.B = false;
            this.n0(TransitionNotification.a, z);
        }
        int v5 = this.x.size();
        Animator[] arr_animator = (Animator[])this.x.toArray(this.y);
        this.y = Transition.N;
        for(int v3 = 0; v3 < v5; ++v3) {
            Animator animator0 = arr_animator[v3];
            arr_animator[v3] = null;
            Impl26.b(animator0, Math.min(Math.max(0L, v), Impl26.a(animator0)));
        }
        this.y = arr_animator;
        int v6 = Long.compare(v, v2);
        if(v6 > 0 && v1 <= v2 || v < 0L && v4 >= 0) {
            if(v6 > 0) {
                this.B = true;
            }
            this.n0(TransitionNotification.b, z);
        }
    }

    @NonNull
    public Transition C(@IdRes int v, boolean z) {
        this.i = this.A(this.i, v, z);
        return this;
    }

    @NonNull
    public Transition C0(long v) {
        this.c = v;
        return this;
    }

    @NonNull
    public Transition D(@NonNull View view0, boolean z) {
        this.j = this.H(this.j, view0, z);
        return this;
    }

    public void D0(@Nullable EpicenterCallback transition$EpicenterCallback0) {
        this.G = transition$EpicenterCallback0;
    }

    @NonNull
    public Transition E(@NonNull Class class0, boolean z) {
        this.k = this.G(this.k, class0, z);
        return this;
    }

    @NonNull
    public Transition E0(@Nullable TimeInterpolator timeInterpolator0) {
        this.d = timeInterpolator0;
        return this;
    }

    @NonNull
    public Transition F(@NonNull String s, boolean z) {
        this.l = Transition.B(this.l, s, z);
        return this;
    }

    public void F0(@Nullable int[] arr_v) {
        if(arr_v != null && arr_v.length != 0) {
            for(int v = 0; v < arr_v.length; ++v) {
                if(!Transition.e0(arr_v[v])) {
                    throw new IllegalArgumentException("matches contains invalid value");
                }
                if(Transition.k(arr_v, v)) {
                    throw new IllegalArgumentException("matches contains a duplicate value");
                }
            }
            this.s = (int[])arr_v.clone();
            return;
        }
        this.s = Transition.R8;
    }

    private ArrayList G(ArrayList arrayList0, Class class0, boolean z) {
        if(class0 != null) {
            return z ? ArrayListManager.a(arrayList0, class0) : ArrayListManager.b(arrayList0, class0);
        }
        return arrayList0;
    }

    public void G0(@Nullable PathMotion pathMotion0) {
        if(pathMotion0 == null) {
            this.I = Transition.S8;
            return;
        }
        this.I = pathMotion0;
    }

    private ArrayList H(ArrayList arrayList0, View view0, boolean z) {
        if(view0 != null) {
            return z ? ArrayListManager.a(arrayList0, view0) : ArrayListManager.b(arrayList0, view0);
        }
        return arrayList0;
    }

    public void H0(@Nullable TransitionPropagation transitionPropagation0) {
        this.F = transitionPropagation0;
    }

    @RestrictTo({Scope.c})
    void I(@Nullable ViewGroup viewGroup0) {
        ArrayMap arrayMap0 = Transition.S();
        int v = arrayMap0.size();
        if(viewGroup0 != null && v != 0) {
            WindowId windowId0 = viewGroup0.getWindowId();
            ArrayMap arrayMap1 = new ArrayMap(arrayMap0);
            arrayMap0.clear();
            for(int v1 = v - 1; v1 >= 0; --v1) {
                AnimationInfo transition$AnimationInfo0 = (AnimationInfo)arrayMap1.l(v1);
                if(transition$AnimationInfo0.a != null && windowId0.equals(transition$AnimationInfo0.d)) {
                    ((Animator)arrayMap1.g(v1)).end();
                }
            }
        }
    }

    @NonNull
    public Transition I0(long v) {
        this.b = v;
        return this;
    }

    public long J() {
        return this.c;
    }

    @RestrictTo({Scope.c})
    protected void J0() {
        if(this.z == 0) {
            this.n0(TransitionNotification.a, false);
            this.B = false;
        }
        ++this.z;
    }

    @Nullable
    public Rect K() {
        return this.G == null ? null : this.G.a(this);
    }

    String K0(String s) [...] // 潜在的解密器

    @Nullable
    public EpicenterCallback L() {
        return this.G;
    }

    @Nullable
    public TimeInterpolator M() {
        return this.d;
    }

    TransitionValues N(View view0, boolean z) {
        TransitionSet transitionSet0 = this.r;
        if(transitionSet0 != null) {
            return transitionSet0.N(view0, z);
        }
        ArrayList arrayList0 = z ? this.t : this.u;
        if(arrayList0 == null) {
            return null;
        }
        int v = arrayList0.size();
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v) {
                v1 = -1;
                break;
            }
            TransitionValues transitionValues0 = (TransitionValues)arrayList0.get(v1);
            if(transitionValues0 == null) {
                return null;
            }
            if(transitionValues0.b == view0) {
                break;
            }
        }
        if(v1 >= 0) {
            return z ? ((TransitionValues)this.u.get(v1)) : ((TransitionValues)this.t.get(v1));
        }
        return null;
    }

    @NonNull
    public String O() [...] // 潜在的解密器

    @NonNull
    public PathMotion P() {
        return this.I;
    }

    @Nullable
    public TransitionPropagation Q() {
        return this.F;
    }

    @NonNull
    public final Transition R() {
        return this.r == null ? this : this.r.R();
    }

    private static ArrayMap S() {
        ArrayMap arrayMap0 = (ArrayMap)Transition.T8.get();
        if(arrayMap0 == null) {
            arrayMap0 = new ArrayMap();
            Transition.T8.set(arrayMap0);
        }
        return arrayMap0;
    }

    public long T() {
        return this.b;
    }

    @NonNull
    public List U() {
        return this.e;
    }

    @Nullable
    public List V() {
        return this.g;
    }

    @Nullable
    public List W() {
        return this.h;
    }

    @NonNull
    public List X() {
        return this.f;
    }

    final long Y() {
        return this.J;
    }

    @Nullable
    public String[] Z() {
        return null;
    }

    @Nullable
    public TransitionValues a0(@NonNull View view0, boolean z) {
        TransitionSet transitionSet0 = this.r;
        if(transitionSet0 != null) {
            return transitionSet0.a0(view0, z);
        }
        return z ? ((TransitionValues)this.p.a.get(view0)) : ((TransitionValues)this.q.a.get(view0));
    }

    boolean b0() {
        return !this.x.isEmpty();
    }

    @NonNull
    public Transition c(@NonNull TransitionListener transition$TransitionListener0) {
        if(this.D == null) {
            this.D = new ArrayList();
        }
        this.D.add(transition$TransitionListener0);
        return this;
    }

    public boolean c0() {
        return false;
    }

    @RestrictTo({Scope.c})
    protected void cancel() {
        int v = this.x.size();
        Animator[] arr_animator = (Animator[])this.x.toArray(this.y);
        this.y = Transition.N;
        for(int v1 = v - 1; v1 >= 0; --v1) {
            Animator animator0 = arr_animator[v1];
            arr_animator[v1] = null;
            animator0.cancel();
        }
        this.y = arr_animator;
        this.n0(TransitionNotification.c, false);
    }

    @Override
    @NonNull
    public Object clone() throws CloneNotSupportedException {
        return this.s();
    }

    @NonNull
    public Transition d(@IdRes int v) {
        if(v != 0) {
            this.e.add(v);
        }
        return this;
    }

    public boolean d0(@Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        if(transitionValues0 != null && transitionValues1 != null) {
            String[] arr_s = this.Z();
            if(arr_s == null) {
                Iterator iterator0 = transitionValues0.a.keySet().iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        return false;
                    }
                    Object object0 = iterator0.next();
                    if(Transition.g0(transitionValues0, transitionValues1, ((String)object0))) {
                        break;
                    }
                }
            }
            else {
                for(int v = 0; v < arr_s.length; ++v) {
                    if(Transition.g0(transitionValues0, transitionValues1, arr_s[v])) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @NonNull
    public Transition e(@NonNull View view0) {
        this.f.add(view0);
        return this;
    }

    private static boolean e0(int v) {
        return v >= 1 && v <= 4;
    }

    @NonNull
    public Transition f(@NonNull Class class0) {
        if(this.h == null) {
            this.h = new ArrayList();
        }
        this.h.add(class0);
        return this;
    }

    boolean f0(View view0) {
        int v = view0.getId();
        if(this.i != null && this.i.contains(v)) {
            return false;
        }
        if(this.j != null && this.j.contains(view0)) {
            return false;
        }
        ArrayList arrayList0 = this.k;
        if(arrayList0 != null) {
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(((Class)this.k.get(v2)).isInstance(view0)) {
                    return false;
                }
            }
        }
        if(this.l != null && ViewCompat.C0(view0) != null && this.l.contains(ViewCompat.C0(view0))) {
            return false;
        }
        if(this.e.size() == 0 && this.f.size() == 0 && (this.h == null || this.h.isEmpty()) && (this.g == null || this.g.isEmpty())) {
            return true;
        }
        if(this.e.contains(v) || this.f.contains(view0) || this.g != null && this.g.contains(ViewCompat.C0(view0))) {
            return true;
        }
        if(this.h != null) {
            for(int v3 = 0; v3 < this.h.size(); ++v3) {
                if(((Class)this.h.get(v3)).isInstance(view0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @NonNull
    public Transition g(@NonNull String s) {
        if(this.g == null) {
            this.g = new ArrayList();
        }
        this.g.add(s);
        return this;
    }

    private static boolean g0(TransitionValues transitionValues0, TransitionValues transitionValues1, String s) {
        Object object0 = transitionValues0.a.get(s);
        Object object1 = transitionValues1.a.get(s);
        if(object0 == null && object1 == null) {
            return false;
        }
        return object0 == null || object1 == null ? true : !object0.equals(object1);
    }

    private void h(ArrayMap arrayMap0, ArrayMap arrayMap1) {
        for(int v1 = 0; v1 < arrayMap0.size(); ++v1) {
            TransitionValues transitionValues0 = (TransitionValues)arrayMap0.l(v1);
            if(this.f0(transitionValues0.b)) {
                this.t.add(transitionValues0);
                this.u.add(null);
            }
        }
        for(int v = 0; v < arrayMap1.size(); ++v) {
            TransitionValues transitionValues1 = (TransitionValues)arrayMap1.l(v);
            if(this.f0(transitionValues1.b)) {
                this.u.add(transitionValues1);
                this.t.add(null);
            }
        }
    }

    private void h0(ArrayMap arrayMap0, ArrayMap arrayMap1, SparseArray sparseArray0, SparseArray sparseArray1) {
        int v = sparseArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = (View)sparseArray0.valueAt(v1);
            if(view0 != null && this.f0(view0)) {
                View view1 = (View)sparseArray1.get(sparseArray0.keyAt(v1));
                if(view1 != null && this.f0(view1)) {
                    TransitionValues transitionValues0 = (TransitionValues)arrayMap0.get(view0);
                    TransitionValues transitionValues1 = (TransitionValues)arrayMap1.get(view1);
                    if(transitionValues0 != null && transitionValues1 != null) {
                        this.t.add(transitionValues0);
                        this.u.add(transitionValues1);
                        arrayMap0.remove(view0);
                        arrayMap1.remove(view1);
                    }
                }
            }
        }
    }

    private void i0(ArrayMap arrayMap0, ArrayMap arrayMap1) {
        for(int v = arrayMap0.size() - 1; v >= 0; --v) {
            View view0 = (View)arrayMap0.g(v);
            if(view0 != null && this.f0(view0)) {
                TransitionValues transitionValues0 = (TransitionValues)arrayMap1.remove(view0);
                if(transitionValues0 != null && this.f0(transitionValues0.b)) {
                    TransitionValues transitionValues1 = (TransitionValues)arrayMap0.i(v);
                    this.t.add(transitionValues1);
                    this.u.add(transitionValues0);
                }
            }
        }
    }

    private static void j(TransitionValuesMaps transitionValuesMaps0, View view0, TransitionValues transitionValues0) {
        transitionValuesMaps0.a.put(view0, transitionValues0);
        int v = view0.getId();
        if(v >= 0) {
            if(transitionValuesMaps0.b.indexOfKey(v) >= 0) {
                transitionValuesMaps0.b.put(v, null);
            }
            else {
                transitionValuesMaps0.b.put(v, view0);
            }
        }
        String s = ViewCompat.C0(view0);
        if(s != null) {
            if(transitionValuesMaps0.d.containsKey(s)) {
                transitionValuesMaps0.d.put(s, null);
            }
            else {
                transitionValuesMaps0.d.put(s, view0);
            }
        }
        if(view0.getParent() instanceof ListView) {
            ListView listView0 = (ListView)view0.getParent();
            if(listView0.getAdapter().hasStableIds()) {
                long v1 = listView0.getItemIdAtPosition(listView0.getPositionForView(view0));
                if(transitionValuesMaps0.c.j(v1) >= 0) {
                    View view1 = (View)transitionValuesMaps0.c.g(v1);
                    if(view1 != null) {
                        view1.setHasTransientState(false);
                        transitionValuesMaps0.c.n(v1, null);
                    }
                }
                else {
                    view0.setHasTransientState(true);
                    transitionValuesMaps0.c.n(v1, view0);
                }
            }
        }
    }

    private void j0(ArrayMap arrayMap0, ArrayMap arrayMap1, LongSparseArray longSparseArray0, LongSparseArray longSparseArray1) {
        int v = longSparseArray0.w();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = (View)longSparseArray0.x(v1);
            if(view0 != null && this.f0(view0)) {
                View view1 = (View)longSparseArray1.g(longSparseArray0.m(v1));
                if(view1 != null && this.f0(view1)) {
                    TransitionValues transitionValues0 = (TransitionValues)arrayMap0.get(view0);
                    TransitionValues transitionValues1 = (TransitionValues)arrayMap1.get(view1);
                    if(transitionValues0 != null && transitionValues1 != null) {
                        this.t.add(transitionValues0);
                        this.u.add(transitionValues1);
                        arrayMap0.remove(view0);
                        arrayMap1.remove(view1);
                    }
                }
            }
        }
    }

    private static boolean k(int[] arr_v, int v) {
        int v1 = arr_v[v];
        for(int v2 = 0; v2 < v; ++v2) {
            if(arr_v[v2] == v1) {
                return true;
            }
        }
        return false;
    }

    private void k0(ArrayMap arrayMap0, ArrayMap arrayMap1, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        int v = arrayMap2.size();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = (View)arrayMap2.l(v1);
            if(view0 != null && this.f0(view0)) {
                View view1 = (View)arrayMap3.get(arrayMap2.g(v1));
                if(view1 != null && this.f0(view1)) {
                    TransitionValues transitionValues0 = (TransitionValues)arrayMap0.get(view0);
                    TransitionValues transitionValues1 = (TransitionValues)arrayMap1.get(view1);
                    if(transitionValues0 != null && transitionValues1 != null) {
                        this.t.add(transitionValues0);
                        this.u.add(transitionValues1);
                        arrayMap0.remove(view0);
                        arrayMap1.remove(view1);
                    }
                }
            }
        }
    }

    @RestrictTo({Scope.c})
    protected void l(@Nullable Animator animator0) {
        if(animator0 == null) {
            this.w();
            return;
        }
        if(this.J() >= 0L) {
            animator0.setDuration(this.J());
        }
        if(this.T() >= 0L) {
            animator0.setStartDelay(this.T() + animator0.getStartDelay());
        }
        if(this.M() != null) {
            animator0.setInterpolator(this.M());
        }
        animator0.addListener(new AnimatorListenerAdapter() {
            final Transition a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                Transition.this.w();
                animator0.removeListener(this);
            }
        });
        animator0.start();
    }

    private void l0(TransitionValuesMaps transitionValuesMaps0, TransitionValuesMaps transitionValuesMaps1) {
        ArrayMap arrayMap0 = new ArrayMap(transitionValuesMaps0.a);
        ArrayMap arrayMap1 = new ArrayMap(transitionValuesMaps1.a);
        for(int v = 0; true; ++v) {
            int[] arr_v = this.s;
            if(v >= arr_v.length) {
                break;
            }
            switch(arr_v[v]) {
                case 1: {
                    this.i0(arrayMap0, arrayMap1);
                    break;
                }
                case 2: {
                    this.k0(arrayMap0, arrayMap1, transitionValuesMaps0.d, transitionValuesMaps1.d);
                    break;
                }
                case 3: {
                    this.h0(arrayMap0, arrayMap1, transitionValuesMaps0.b, transitionValuesMaps1.b);
                    break;
                }
                case 4: {
                    this.j0(arrayMap0, arrayMap1, transitionValuesMaps0.c, transitionValuesMaps1.c);
                }
            }
        }
        this.h(arrayMap0, arrayMap1);
    }

    public abstract void m(@NonNull TransitionValues arg1);

    private void m0(Transition transition0, TransitionNotification transition$TransitionNotification0, boolean z) {
        Transition transition1 = this.C;
        if(transition1 != null) {
            transition1.m0(transition0, transition$TransitionNotification0, z);
        }
        if(this.D != null && !this.D.isEmpty()) {
            int v = this.D.size();
            TransitionListener[] arr_transition$TransitionListener = this.v == null ? new TransitionListener[v] : this.v;
            this.v = null;
            TransitionListener[] arr_transition$TransitionListener1 = (TransitionListener[])this.D.toArray(arr_transition$TransitionListener);
            for(int v1 = 0; v1 < v; ++v1) {
                transition$TransitionNotification0.a(arr_transition$TransitionListener1[v1], transition0, z);
                arr_transition$TransitionListener1[v1] = null;
            }
            this.v = arr_transition$TransitionListener1;
        }
    }

    private void n(View view0, boolean z) {
        if(view0 == null) {
            return;
        }
        int v = view0.getId();
        if(this.i != null && this.i.contains(v)) {
            return;
        }
        if(this.j != null && this.j.contains(view0)) {
            return;
        }
        ArrayList arrayList0 = this.k;
        if(arrayList0 != null) {
            int v2 = arrayList0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                if(((Class)this.k.get(v3)).isInstance(view0)) {
                    return;
                }
            }
        }
        if(view0.getParent() instanceof ViewGroup) {
            TransitionValues transitionValues0 = new TransitionValues(view0);
            if(z) {
                this.p(transitionValues0);
            }
            else {
                this.m(transitionValues0);
            }
            transitionValues0.c.add(this);
            this.o(transitionValues0);
            if(z) {
                Transition.j(this.p, view0, transitionValues0);
            }
            else {
                Transition.j(this.q, view0, transitionValues0);
            }
        }
        if(!(view0 instanceof ViewGroup) || this.m != null && this.m.contains(v)) {
            return;
        }
        if(this.n != null && this.n.contains(view0)) {
            return;
        }
        ArrayList arrayList1 = this.o;
        if(arrayList1 != null) {
            int v4 = arrayList1.size();
            for(int v5 = 0; v5 < v4; ++v5) {
                if(((Class)this.o.get(v5)).isInstance(view0)) {
                    return;
                }
            }
        }
        for(int v1 = 0; v1 < ((ViewGroup)view0).getChildCount(); ++v1) {
            this.n(((ViewGroup)view0).getChildAt(v1), z);
        }
    }

    void n0(TransitionNotification transition$TransitionNotification0, boolean z) {
        this.m0(this, transition$TransitionNotification0, z);
    }

    void o(TransitionValues transitionValues0) {
        if(this.F != null && !transitionValues0.a.isEmpty()) {
            String[] arr_s = this.F.b();
            if(arr_s == null) {
                return;
            }
            for(int v = 0; v < arr_s.length; ++v) {
                if(!transitionValues0.a.containsKey(arr_s[v])) {
                    this.F.a(transitionValues0);
                    return;
                }
            }
        }
    }

    private static int[] o0(String s) {
        StringTokenizer stringTokenizer0 = new StringTokenizer(s, ",");
        int[] arr_v = new int[stringTokenizer0.countTokens()];
        for(int v = 0; stringTokenizer0.hasMoreTokens(); ++v) {
            String s1 = stringTokenizer0.nextToken().trim();
            if("id".equalsIgnoreCase(s1)) {
                arr_v[v] = 3;
            }
            else if("instance".equalsIgnoreCase(s1)) {
                arr_v[v] = 1;
            }
            else if("name".equalsIgnoreCase(s1)) {
                arr_v[v] = 2;
            }
            else if("itemId".equalsIgnoreCase(s1)) {
                arr_v[v] = 4;
            }
            else {
                if(!s1.isEmpty()) {
                    throw new InflateException("Unknown match type in matchOrder: \'" + s1 + "\'");
                }
                int[] arr_v1 = new int[arr_v.length - 1];
                System.arraycopy(arr_v, 0, arr_v1, 0, v);
                --v;
                arr_v = arr_v1;
            }
        }
        return arr_v;
    }

    public abstract void p(@NonNull TransitionValues arg1);

    @RestrictTo({Scope.c})
    public void p0(@Nullable View view0) {
        if(!this.B) {
            int v = this.x.size();
            Animator[] arr_animator = (Animator[])this.x.toArray(this.y);
            this.y = Transition.N;
            for(int v1 = v - 1; v1 >= 0; --v1) {
                Animator animator0 = arr_animator[v1];
                arr_animator[v1] = null;
                animator0.pause();
            }
            this.y = arr_animator;
            this.n0(TransitionNotification.d, false);
            this.A = true;
        }
    }

    void q(@NonNull ViewGroup viewGroup0, boolean z) {
        this.r(z);
        if((this.e.size() > 0 || this.f.size() > 0) && (this.g == null || this.g.isEmpty()) && (this.h == null || this.h.isEmpty())) {
            for(int v1 = 0; v1 < this.e.size(); ++v1) {
                View view0 = viewGroup0.findViewById(((int)(((Integer)this.e.get(v1)))));
                if(view0 != null) {
                    TransitionValues transitionValues0 = new TransitionValues(view0);
                    if(z) {
                        this.p(transitionValues0);
                    }
                    else {
                        this.m(transitionValues0);
                    }
                    transitionValues0.c.add(this);
                    this.o(transitionValues0);
                    if(z) {
                        Transition.j(this.p, view0, transitionValues0);
                    }
                    else {
                        Transition.j(this.q, view0, transitionValues0);
                    }
                }
            }
            for(int v2 = 0; v2 < this.f.size(); ++v2) {
                View view1 = (View)this.f.get(v2);
                TransitionValues transitionValues1 = new TransitionValues(view1);
                if(z) {
                    this.p(transitionValues1);
                }
                else {
                    this.m(transitionValues1);
                }
                transitionValues1.c.add(this);
                this.o(transitionValues1);
                if(z) {
                    Transition.j(this.p, view1, transitionValues1);
                }
                else {
                    Transition.j(this.q, view1, transitionValues1);
                }
            }
        }
        else {
            this.n(viewGroup0, z);
        }
        if(!z) {
            ArrayMap arrayMap0 = this.H;
            if(arrayMap0 != null) {
                int v3 = arrayMap0.size();
                ArrayList arrayList0 = new ArrayList(v3);
                for(int v4 = 0; v4 < v3; ++v4) {
                    String s = (String)this.H.g(v4);
                    arrayList0.add(((View)this.p.d.remove(s)));
                }
                for(int v = 0; v < v3; ++v) {
                    View view2 = (View)arrayList0.get(v);
                    if(view2 != null) {
                        String s1 = (String)this.H.l(v);
                        this.p.d.put(s1, view2);
                    }
                }
            }
        }
    }

    void q0(@NonNull ViewGroup viewGroup0) {
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.l0(this.p, this.q);
        ArrayMap arrayMap0 = Transition.S();
        WindowId windowId0 = viewGroup0.getWindowId();
        for(int v = arrayMap0.size() - 1; v >= 0; --v) {
            Animator animator0 = (Animator)arrayMap0.g(v);
            if(animator0 != null) {
                AnimationInfo transition$AnimationInfo0 = (AnimationInfo)arrayMap0.get(animator0);
                if(transition$AnimationInfo0 != null && transition$AnimationInfo0.a != null && windowId0.equals(transition$AnimationInfo0.d)) {
                    TransitionValues transitionValues0 = transition$AnimationInfo0.c;
                    View view0 = transition$AnimationInfo0.a;
                    TransitionValues transitionValues1 = this.a0(view0, true);
                    TransitionValues transitionValues2 = this.N(view0, true);
                    if(transitionValues1 == null && transitionValues2 == null) {
                        transitionValues2 = (TransitionValues)this.q.a.get(view0);
                    }
                    if((transitionValues1 != null || transitionValues2 != null) && transition$AnimationInfo0.e.d0(transitionValues0, transitionValues2)) {
                        Transition transition0 = transition$AnimationInfo0.e;
                        if(transition0.R().K != null) {
                            animator0.cancel();
                            transition0.x.remove(animator0);
                            arrayMap0.remove(animator0);
                            if(transition0.x.size() == 0) {
                                transition0.n0(TransitionNotification.c, false);
                                if(!transition0.B) {
                                    transition0.B = true;
                                    transition0.n0(TransitionNotification.b, false);
                                }
                            }
                        }
                        else if(animator0.isRunning() || animator0.isStarted()) {
                            animator0.cancel();
                        }
                        else {
                            arrayMap0.remove(animator0);
                        }
                    }
                }
            }
        }
        this.u(viewGroup0, this.p, this.q, this.t, this.u);
        if(this.K == null) {
            this.z0();
            return;
        }
        if(Build.VERSION.SDK_INT >= 34) {
            this.r0();
            this.K.w();
            this.K.y();
        }
    }

    void r(boolean z) {
        if(z) {
            this.p.a.clear();
            this.p.b.clear();
            this.p.c.b();
            return;
        }
        this.q.a.clear();
        this.q.b.clear();
        this.q.c.b();
    }

    @RequiresApi(34)
    void r0() {
        ArrayMap arrayMap0 = Transition.S();
        this.J = 0L;
        for(int v = 0; v < this.E.size(); ++v) {
            Animator animator0 = (Animator)this.E.get(v);
            AnimationInfo transition$AnimationInfo0 = (AnimationInfo)arrayMap0.get(animator0);
            if(animator0 != null && transition$AnimationInfo0 != null) {
                if(this.J() >= 0L) {
                    transition$AnimationInfo0.f.setDuration(this.J());
                }
                if(this.T() >= 0L) {
                    transition$AnimationInfo0.f.setStartDelay(this.T() + transition$AnimationInfo0.f.getStartDelay());
                }
                if(this.M() != null) {
                    transition$AnimationInfo0.f.setInterpolator(this.M());
                }
                this.x.add(animator0);
                this.J = Math.max(this.J, Impl26.a(animator0));
            }
        }
        this.E.clear();
    }

    @NonNull
    public Transition s() {
        try {
            Transition transition0 = (Transition)super.clone();
            transition0.E = new ArrayList();
            transition0.p = new TransitionValuesMaps();
            transition0.q = new TransitionValuesMaps();
            transition0.t = null;
            transition0.u = null;
            transition0.K = null;
            transition0.C = this;
            transition0.D = null;
            return transition0;
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new RuntimeException(cloneNotSupportedException0);
        }
    }

    @NonNull
    public Transition s0(@NonNull TransitionListener transition$TransitionListener0) {
        ArrayList arrayList0 = this.D;
        if(arrayList0 == null) {
            return this;
        }
        if(!arrayList0.remove(transition$TransitionListener0)) {
            Transition transition0 = this.C;
            if(transition0 != null) {
                transition0.s0(transition$TransitionListener0);
            }
        }
        if(this.D.size() == 0) {
            this.D = null;
        }
        return this;
    }

    @Nullable
    public Animator t(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        return null;
    }

    @NonNull
    public Transition t0(@IdRes int v) {
        if(v != 0) {
            this.e.remove(Integer.valueOf(v));
        }
        return this;
    }

    // 去混淆评级： 低(20)
    @Override
    @NonNull
    public String toString() {
        return "Transition@7eae0eaf: ";
    }

    void u(@NonNull ViewGroup viewGroup0, @NonNull TransitionValuesMaps transitionValuesMaps0, @NonNull TransitionValuesMaps transitionValuesMaps1, @NonNull ArrayList arrayList0, @NonNull ArrayList arrayList1) {
        Animator animator2;
        int v4;
        TransitionValues transitionValues2;
        View view0;
        ArrayMap arrayMap0 = Transition.S();
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        int v = arrayList0.size();
        boolean z = this.R().K != null;
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        for(int v2 = 0; v2 < v; v2 = v4 + 1) {
            TransitionValues transitionValues0 = (TransitionValues)arrayList0.get(v2);
            TransitionValues transitionValues1 = (TransitionValues)arrayList1.get(v2);
            if(transitionValues0 != null && !transitionValues0.c.contains(this)) {
                transitionValues0 = null;
            }
            if(transitionValues1 != null && !transitionValues1.c.contains(this)) {
                transitionValues1 = null;
            }
            if(transitionValues0 == null && transitionValues1 == null) {
                v4 = v2;
            }
            else if(transitionValues0 == null || transitionValues1 == null || this.d0(transitionValues0, transitionValues1)) {
                Animator animator0 = this.t(viewGroup0, transitionValues0, transitionValues1);
                if(animator0 == null) {
                    v4 = v2;
                }
                else {
                    if(transitionValues1 == null) {
                        v4 = v2;
                        view0 = transitionValues0.b;
                        animator2 = animator0;
                        transitionValues2 = null;
                    }
                    else {
                        view0 = transitionValues1.b;
                        String[] arr_s = this.Z();
                        Animator animator1 = animator0;
                        if(arr_s == null || arr_s.length <= 0) {
                            v4 = v2;
                            transitionValues2 = null;
                        }
                        else {
                            transitionValues2 = new TransitionValues(view0);
                            TransitionValues transitionValues3 = (TransitionValues)transitionValuesMaps1.a.get(view0);
                            if(transitionValues3 != null) {
                                for(int v3 = 0; v3 < arr_s.length; ++v3) {
                                    String s = arr_s[v3];
                                    Object object0 = transitionValues3.a.get(s);
                                    transitionValues2.a.put(s, object0);
                                }
                            }
                            v4 = v2;
                            int v5 = arrayMap0.size();
                            for(int v6 = 0; v6 < v5; ++v6) {
                                AnimationInfo transition$AnimationInfo0 = (AnimationInfo)arrayMap0.get(((Animator)arrayMap0.g(v6)));
                                if(transition$AnimationInfo0.c != null && transition$AnimationInfo0.a == view0 && transition$AnimationInfo0.b.equals("androidx.transition.Transition") && transition$AnimationInfo0.c.equals(transitionValues2)) {
                                    animator1 = null;
                                    break;
                                }
                            }
                        }
                        animator2 = animator1;
                    }
                    if(animator2 != null) {
                        TransitionPropagation transitionPropagation0 = this.F;
                        if(transitionPropagation0 != null) {
                            long v7 = transitionPropagation0.c(viewGroup0, this, transitionValues0, transitionValues1);
                            sparseIntArray0.put(this.E.size(), ((int)v7));
                            v1 = Math.min(v7, v1);
                        }
                        AnimationInfo transition$AnimationInfo1 = new AnimationInfo(view0, "androidx.transition.Transition", this, viewGroup0.getWindowId(), transitionValues2, animator2);
                        if(z) {
                            AnimatorSet animatorSet0 = new AnimatorSet();
                            animatorSet0.play(animator2);
                            animator2 = animatorSet0;
                        }
                        arrayMap0.put(animator2, transition$AnimationInfo1);
                        this.E.add(animator2);
                    }
                }
            }
            else {
                v4 = v2;
            }
        }
        if(sparseIntArray0.size() != 0) {
            for(int v8 = 0; v8 < sparseIntArray0.size(); ++v8) {
                int v9 = sparseIntArray0.keyAt(v8);
                AnimationInfo transition$AnimationInfo2 = (AnimationInfo)arrayMap0.get(((Animator)this.E.get(v9)));
                long v10 = ((long)sparseIntArray0.valueAt(v8)) - v1;
                long v11 = transition$AnimationInfo2.f.getStartDelay();
                transition$AnimationInfo2.f.setStartDelay(v10 + v11);
            }
        }
    }

    @NonNull
    public Transition u0(@NonNull View view0) {
        this.f.remove(view0);
        return this;
    }

    @NonNull
    @RequiresApi(34)
    TransitionSeekController v() {
        SeekController transition$SeekController0 = new SeekController(this);
        this.K = transition$SeekController0;
        this.c(transition$SeekController0);
        return this.K;
    }

    @NonNull
    public Transition v0(@NonNull Class class0) {
        ArrayList arrayList0 = this.h;
        if(arrayList0 != null) {
            arrayList0.remove(class0);
        }
        return this;
    }

    @RestrictTo({Scope.c})
    protected void w() {
        int v = this.z - 1;
        this.z = v;
        if(v == 0) {
            this.n0(TransitionNotification.b, false);
            for(int v1 = 0; v1 < this.p.c.w(); ++v1) {
                View view0 = (View)this.p.c.x(v1);
                if(view0 != null) {
                    view0.setHasTransientState(false);
                }
            }
            for(int v2 = 0; v2 < this.q.c.w(); ++v2) {
                View view1 = (View)this.q.c.x(v2);
                if(view1 != null) {
                    view1.setHasTransientState(false);
                }
            }
            this.B = true;
        }
    }

    @NonNull
    public Transition w0(@NonNull String s) {
        ArrayList arrayList0 = this.g;
        if(arrayList0 != null) {
            arrayList0.remove(s);
        }
        return this;
    }

    @NonNull
    public Transition x(@IdRes int v, boolean z) {
        this.m = this.A(this.m, v, z);
        return this;
    }

    @RestrictTo({Scope.c})
    public void x0(@Nullable View view0) {
        if(this.A) {
            if(!this.B) {
                int v = this.x.size();
                Animator[] arr_animator = (Animator[])this.x.toArray(this.y);
                this.y = Transition.N;
                for(int v1 = v - 1; v1 >= 0; --v1) {
                    Animator animator0 = arr_animator[v1];
                    arr_animator[v1] = null;
                    animator0.resume();
                }
                this.y = arr_animator;
                this.n0(TransitionNotification.e, false);
            }
            this.A = false;
        }
    }

    @NonNull
    public Transition y(@NonNull View view0, boolean z) {
        this.n = this.H(this.n, view0, z);
        return this;
    }

    private void y0(Animator animator0, ArrayMap arrayMap0) {
        if(animator0 != null) {
            animator0.addListener(new AnimatorListenerAdapter() {
                final Transition b;

                @Override  // android.animation.AnimatorListenerAdapter
                public void onAnimationEnd(Animator animator0) {
                    arrayMap0.remove(animator0);
                    Transition.this.x.remove(animator0);
                }

                @Override  // android.animation.AnimatorListenerAdapter
                public void onAnimationStart(Animator animator0) {
                    Transition.this.x.add(animator0);
                }
            });
            this.l(animator0);
        }
    }

    @NonNull
    public Transition z(@NonNull Class class0, boolean z) {
        this.o = this.G(this.o, class0, z);
        return this;
    }

    @RestrictTo({Scope.c})
    protected void z0() {
        this.J0();
        ArrayMap arrayMap0 = Transition.S();
        for(Object object0: this.E) {
            Animator animator0 = (Animator)object0;
            if(arrayMap0.containsKey(animator0)) {
                this.J0();
                this.y0(animator0, arrayMap0);
            }
        }
        this.E.clear();
        this.w();
    }
}

