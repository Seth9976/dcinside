package f1;

import com.facebook.imagepipeline.producers.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nForwardingRequestListener2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingRequestListener2.kt\ncom/facebook/imagepipeline/listener/ForwardingRequestListener2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n37#1:128\n38#1,7:130\n45#1:138\n37#1:139\n38#1,7:141\n45#1:149\n37#1:150\n38#1,7:152\n45#1:160\n37#1:161\n38#1,7:163\n45#1:171\n37#1:172\n38#1,7:174\n45#1:182\n37#1:183\n38#1,7:185\n45#1:193\n37#1:194\n38#1,7:196\n45#1:204\n37#1:205\n38#1,7:207\n45#1:215\n37#1:216\n38#1,7:218\n45#1:226\n37#1:227\n38#1,7:229\n45#1:237\n1863#2,2:126\n1863#2:129\n1864#2:137\n1863#2:140\n1864#2:148\n1863#2:151\n1864#2:159\n1863#2:162\n1864#2:170\n1863#2:173\n1864#2:181\n1863#2:184\n1864#2:192\n1863#2:195\n1864#2:203\n1863#2:206\n1864#2:214\n1863#2:217\n1864#2:225\n1863#2:228\n1864#2:236\n1755#2,3:238\n*S KotlinDebug\n*F\n+ 1 ForwardingRequestListener2.kt\ncom/facebook/imagepipeline/listener/ForwardingRequestListener2\n*L\n48#1:128\n48#1:130,7\n48#1:138\n52#1:139\n52#1:141,7\n52#1:149\n60#1:150\n60#1:152,7\n60#1:160\n71#1:161\n71#1:163,7\n71#1:171\n81#1:172\n81#1:174,7\n81#1:182\n91#1:183\n91#1:185,7\n91#1:193\n101#1:194\n101#1:196,7\n101#1:204\n107#1:205\n107#1:207,7\n107#1:215\n111#1:216\n111#1:218,7\n111#1:226\n115#1:227\n115#1:229,7\n115#1:237\n37#1:126,2\n48#1:129\n48#1:137\n52#1:140\n52#1:148\n60#1:151\n60#1:159\n71#1:162\n71#1:170\n81#1:173\n81#1:181\n91#1:184\n91#1:192\n101#1:195\n101#1:203\n107#1:206\n107#1:214\n111#1:217\n111#1:225\n115#1:228\n115#1:236\n119#1:238,3\n*E\n"})
public final class c implements e {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final List a;
    @l
    public static final a b = null;
    @l
    private static final String c = "ForwardingRequestListener2";

    static {
        c.b = new a(null);
    }

    public c(@m Set set0) {
        if(set0 == null) {
            this.a = new ArrayList();
            return;
        }
        ArrayList arrayList0 = new ArrayList(set0.size());
        this.a = arrayList0;
        u.t2(set0, arrayList0);
    }

    public c(@l e[] arr_e) {
        L.p(arr_e, "listenersToAdd");
        super();
        ArrayList arrayList0 = new ArrayList(arr_e.length);
        this.a = arrayList0;
        kotlin.collections.l.Ua(arr_e, arrayList0);
    }

    @Override  // com.facebook.imagepipeline.producers.l0
    public void a(@l j0 j00, @l String s, boolean z) {
        L.p(j00, "producerContext");
        L.p(s, "producerName");
        for(Object object0: this.a) {
            e e0 = (e)object0;
            try {
                e0.a(j00, s, z);
            }
            catch(Exception exception0) {
                x0.a.v("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", exception0);
            }
        }
    }

    @Override  // com.facebook.imagepipeline.producers.l0
    public void b(@l j0 j00, @l String s) {
        L.p(j00, "producerContext");
        L.p(s, "producerName");
        for(Object object0: this.a) {
            e e0 = (e)object0;
            try {
                e0.b(j00, s);
            }
            catch(Exception exception0) {
                x0.a.v("ForwardingRequestListener2", "InternalListener exception in onProducerStart", exception0);
            }
        }
    }

    @Override  // f1.e
    public void c(@l j0 j00) {
        L.p(j00, "producerContext");
        for(Object object0: this.a) {
            e e0 = (e)object0;
            try {
                e0.c(j00);
            }
            catch(Exception exception0) {
                x0.a.v("ForwardingRequestListener2", "InternalListener exception in onRequestStart", exception0);
            }
        }
    }

    @Override  // com.facebook.imagepipeline.producers.l0
    public void d(@m j0 j00, @m String s, @m Map map0) {
        for(Object object0: this.a) {
            e e0 = (e)object0;
            try {
                e0.d(j00, s, map0);
            }
            catch(Exception exception0) {
                x0.a.v("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", exception0);
            }
        }
    }

    @Override  // f1.e
    public void e(@l j0 j00) {
        L.p(j00, "producerContext");
        for(Object object0: this.a) {
            e e0 = (e)object0;
            try {
                e0.e(j00);
            }
            catch(Exception exception0) {
                x0.a.v("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", exception0);
            }
        }
    }

    @Override  // com.facebook.imagepipeline.producers.l0
    public boolean f(@l j0 j00, @l String s) {
        L.p(j00, "producerContext");
        L.p(s, "producerName");
        Iterable iterable0 = this.a;
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(((e)object0).f(j00, s)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    @Override  // f1.e
    public void g(@l j0 j00) {
        L.p(j00, "producerContext");
        for(Object object0: this.a) {
            e e0 = (e)object0;
            try {
                e0.g(j00);
            }
            catch(Exception exception0) {
                x0.a.v("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", exception0);
            }
        }
    }

    @Override  // com.facebook.imagepipeline.producers.l0
    public void h(@l j0 j00, @l String s, @l String s1) {
        L.p(j00, "producerContext");
        L.p(s, "producerName");
        L.p(s1, "producerEventName");
        for(Object object0: this.a) {
            e e0 = (e)object0;
            try {
                e0.h(j00, s, s1);
            }
            catch(Exception exception0) {
                x0.a.v("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", exception0);
            }
        }
    }

    @Override  // f1.e
    public void i(@l j0 j00, @l Throwable throwable0) {
        L.p(j00, "producerContext");
        L.p(throwable0, "throwable");
        for(Object object0: this.a) {
            e e0 = (e)object0;
            try {
                e0.i(j00, throwable0);
            }
            catch(Exception exception0) {
                x0.a.v("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", exception0);
            }
        }
    }

    @Override  // com.facebook.imagepipeline.producers.l0
    public void j(@m j0 j00, @m String s, @m Map map0) {
        for(Object object0: this.a) {
            e e0 = (e)object0;
            try {
                e0.j(j00, s, map0);
            }
            catch(Exception exception0) {
                x0.a.v("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", exception0);
            }
        }
    }

    @Override  // com.facebook.imagepipeline.producers.l0
    public void k(@m j0 j00, @m String s, @m Throwable throwable0, @m Map map0) {
        for(Object object0: this.a) {
            e e0 = (e)object0;
            try {
                e0.k(j00, s, throwable0, map0);
            }
            catch(Exception exception0) {
                x0.a.v("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", exception0);
            }
        }
    }

    public final void l(@l e e0) {
        L.p(e0, "requestListener");
        this.a.add(e0);
    }

    private final void m(String s, Function1 function10) {
        for(Object object0: this.a) {
            e e0 = (e)object0;
            try {
                function10.invoke(e0);
            }
            catch(Exception exception0) {
                x0.a.v("ForwardingRequestListener2", "InternalListener exception in " + s, exception0);
            }
        }
    }
}

