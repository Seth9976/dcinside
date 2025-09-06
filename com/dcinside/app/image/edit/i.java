package com.dcinside.app.image.edit;

import android.graphics.Bitmap;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class i {
    @l
    public static final I0 a(@l O o0, @l WeakReference weakReference0, @l String s, @l j j0, @l WeakReference weakReference1) {
        @f(c = "com.dcinside.app.image.edit.PhotoEditorWriteKt$write$1", f = "PhotoEditorWrite.kt", i = {2}, l = {20, 27, 37, 56, 59, 73}, m = "invokeSuspend", n = {"parentView"}, s = {"L$0"})
        static final class a extends o implements A3.o {
            Object k;
            int l;
            final WeakReference m;
            final j n;
            final String o;
            final WeakReference p;

            a(WeakReference weakReference0, j j0, String s, WeakReference weakReference1, d d0) {
                this.m = weakReference0;
                this.n = j0;
                this.o = s;
                this.p = weakReference1;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new a(this.m, this.n, this.o, this.p, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.image.edit.PhotoEditorWriteKt$write$1$1", f = "PhotoEditorWrite.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.i.a.a extends o implements A3.o {
                    int k;
                    final WeakReference l;

                    com.dcinside.app.image.edit.i.a.a(WeakReference weakReference0, d d0) {
                        this.l = weakReference0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.dcinside.app.image.edit.i.a.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.image.edit.i.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        g d$g0 = (g)this.l.get();
                        if(d$g0 != null) {
                            d$g0.onFailure(new NullPointerException("editor not found."));
                            return S0.a;
                        }
                        return null;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.PhotoEditorWriteKt$write$1$2", f = "PhotoEditorWrite.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class b extends o implements A3.o {
                    int k;
                    final ImageEditorView l;

                    b(ImageEditorView imageEditorView0, d d0) {
                        this.l = imageEditorView0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new b(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.setDrawingCacheEnabled(false);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.PhotoEditorWriteKt$write$1$3", f = "PhotoEditorWrite.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class c extends o implements A3.o {
                    int k;
                    final j l;
                    final WeakReference m;
                    final WeakReference n;
                    final String o;

                    c(j j0, WeakReference weakReference0, WeakReference weakReference1, String s, d d0) {
                        this.l = j0;
                        this.m = weakReference0;
                        this.n = weakReference1;
                        this.o = s;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new c(this.l, this.m, this.n, this.o, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((c)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        try {
                            if(this.l.c()) {
                                com.dcinside.app.image.edit.d d0 = (com.dcinside.app.image.edit.d)this.m.get();
                                if(d0 != null) {
                                    d0.n();
                                }
                            }
                            g d$g0 = (g)this.n.get();
                            if(d$g0 != null) {
                                d$g0.onSuccess(this.o);
                                return S0.a;
                            }
                            return null;
                        }
                        catch(Exception exception0) {
                        }
                        timber.log.b.a.y(exception0);
                        g d$g1 = (g)this.n.get();
                        if(d$g1 != null) {
                            d$g1.onFailure(exception0);
                            return S0.a;
                        }
                        return null;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.PhotoEditorWriteKt$write$1$4", f = "PhotoEditorWrite.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.i.a.d extends o implements A3.o {
                    int k;
                    final WeakReference l;
                    final Exception m;

                    com.dcinside.app.image.edit.i.a.d(WeakReference weakReference0, Exception exception0, d d0) {
                        this.l = weakReference0;
                        this.m = exception0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.dcinside.app.image.edit.i.a.d(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.image.edit.i.a.d)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        g d$g0 = (g)this.l.get();
                        if(d$g0 != null) {
                            d$g0.onFailure(this.m);
                            return S0.a;
                        }
                        return null;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.PhotoEditorWriteKt$write$1$drawingCache$1", f = "PhotoEditorWrite.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class e extends o implements A3.o {
                    int k;
                    final ImageEditorView l;

                    e(ImageEditorView imageEditorView0, d d0) {
                        this.l = imageEditorView0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new e(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((e)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.setDrawingCacheEnabled(true);
                        return this.l.getDrawingCache();
                    }
                }


                @f(c = "com.dcinside.app.image.edit.PhotoEditorWriteKt$write$1$prepare$1", f = "PhotoEditorWrite.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.i.a.f extends o implements A3.o {
                    int k;
                    final WeakReference l;

                    com.dcinside.app.image.edit.i.a.f(WeakReference weakReference0, d d0) {
                        this.l = weakReference0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.dcinside.app.image.edit.i.a.f(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.image.edit.i.a.f)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        com.dcinside.app.image.edit.d d0 = (com.dcinside.app.image.edit.d)this.l.get();
                        if(d0 == null) {
                            return kotlin.coroutines.jvm.internal.b.a(false);
                        }
                        d0.p();
                        ImageEditorView imageEditorView0 = d0.B();
                        if(imageEditorView0 != null) {
                            imageEditorView0.setDrawingCacheEnabled(false);
                        }
                        return kotlin.coroutines.jvm.internal.b.a(true);
                    }
                }

                ImageEditorView imageEditorView0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                try {
                    switch(this.l) {
                        case 0: {
                            goto label_9;
                        }
                        case 1: {
                            goto label_15;
                        }
                        case 2: {
                            goto label_3;
                        }
                        case 3: {
                            goto label_32;
                        }
                        case 4: {
                            goto label_54;
                        }
                        case 5: {
                            goto label_5;
                        }
                        case 6: {
                            goto label_7;
                        }
                    }
                }
                catch(Exception exception0) {
                    goto label_60;
                }
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            label_3:
                f0.n(object0);
                return S0.a;
                try {
                label_5:
                    f0.n(object0);
                    return S0.a;
                }
                catch(Exception exception0) {
                    goto label_60;
                }
            label_7:
                f0.n(object0);
                return S0.a;
            label_9:
                f0.n(object0);
                com.dcinside.app.image.edit.i.a.f i$a$f0 = new com.dcinside.app.image.edit.i.a.f(this.m, null);
                this.l = 1;
                object0 = kotlinx.coroutines.i.h(h0.e(), i$a$f0, this);
                if(object0 == object1) {
                    return object1;
                label_15:
                    f0.n(object0);
                }
                if(!((Boolean)object0).booleanValue()) {
                    com.dcinside.app.image.edit.i.a.a i$a$a0 = new com.dcinside.app.image.edit.i.a.a(this.p, null);
                    this.l = 2;
                    return kotlinx.coroutines.i.h(h0.e(), i$a$a0, this) == object1 ? object1 : S0.a;
                }
                try {
                    com.dcinside.app.image.edit.d d0 = (com.dcinside.app.image.edit.d)this.m.get();
                    imageEditorView0 = d0 == null ? null : d0.B();
                    if(imageEditorView0 == null) {
                        throw new NullPointerException("editor parent is null.");
                    }
                    e i$a$e0 = new e(imageEditorView0, null);
                    this.k = imageEditorView0;
                    this.l = 3;
                    object0 = kotlinx.coroutines.i.h(h0.e(), i$a$e0, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_34;
                }
                catch(Exception exception0) {
                    goto label_60;
                }
            label_32:
                imageEditorView0 = (ImageEditorView)this.k;
                try {
                    f0.n(object0);
                label_34:
                    L.o(object0, "withContext(...)");
                    Bitmap bitmap0 = (Bitmap)object0;
                    if(this.n.d()) {
                        bitmap0 = com.dcinside.app.image.edit.d.H(bitmap0);
                    }
                    int v = this.n.b();
                    int v1 = this.n.a();
                    File file0 = new File(this.o);
                    if(v == 0 || v1 == 0) {
                        L.m(bitmap0);
                        com.dcinside.app.internal.a.c(bitmap0, file0, null, 0, 6, null);
                    }
                    else {
                        Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap0, v, v1, true);
                        L.m(bitmap1);
                        com.dcinside.app.internal.a.c(bitmap1, file0, null, 0, 6, null);
                        bitmap1.recycle();
                    }
                    b i$a$b0 = new b(imageEditorView0, null);
                    this.k = null;
                    this.l = 4;
                    if(kotlinx.coroutines.i.h(h0.e(), i$a$b0, this) == object1) {
                        return object1;
                    label_54:
                        f0.n(object0);
                    }
                    c i$a$c0 = new c(this.n, this.m, this.p, this.o, null);
                    this.l = 5;
                    return kotlinx.coroutines.i.h(h0.e(), i$a$c0, this) == object1 ? object1 : S0.a;
                }
                catch(Exception exception0) {
                }
            label_60:
                timber.log.b.a.y(exception0);
                com.dcinside.app.image.edit.i.a.d i$a$d0 = new com.dcinside.app.image.edit.i.a.d(this.p, exception0, null);
                this.k = null;
                this.l = 6;
                return kotlinx.coroutines.i.h(h0.e(), i$a$d0, this) == object1 ? object1 : S0.a;
            }
        }

        L.p(o0, "coroutineScope");
        L.p(weakReference0, "weakImageEditor");
        L.p(s, "imagePath");
        L.p(j0, "saveSettings");
        L.p(weakReference1, "weakOnSaveListener");
        return k.f(o0, null, null, new a(weakReference0, j0, s, weakReference1, null), 3, null);
    }
}

