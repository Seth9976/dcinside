package com.dcinside.app.album.picker;

import Y.T;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.IntentCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.Application;
import com.dcinside.app.album.Album;
import com.dcinside.app.album.j;
import com.dcinside.app.base.d;
import com.dcinside.app.gif.frame.Frame;
import com.dcinside.app.image.ImageViewerActivity;
import com.dcinside.app.image.VideoPreviewActivity;
import com.dcinside.app.internal.r;
import com.dcinside.app.rx.bus.m0;
import com.dcinside.app.rx.bus.o0;
import com.dcinside.app.rx.bus.x;
import com.dcinside.app.settings.ImageSizeActivity;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.cl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.vk;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import com.google.android.material.snackbar.Snackbar;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.sequences.p;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.X;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nPickerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickerActivity.kt\ncom/dcinside/app/album/picker/PickerActivity\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,556:1\n35#2:557\n176#3,2:558\n176#3,2:560\n60#4:562\n60#4:564\n60#4:565\n1#5:563\n25#6:566\n25#6:570\n25#6:573\n1628#7,3:567\n1557#7:574\n1628#7,3:575\n13367#8,2:571\n*S KotlinDebug\n*F\n+ 1 PickerActivity.kt\ncom/dcinside/app/album/picker/PickerActivity\n*L\n80#1:557\n148#1:558,2\n165#1:560,2\n176#1:562\n179#1:564\n182#1:565\n224#1:566\n502#1:570\n343#1:573\n228#1:567,3\n344#1:574\n344#1:575,3\n191#1:571,2\n*E\n"})
public final class PickerActivity extends d implements PermissionListener {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    static final class b extends SpanSizeLookup {
        private int e;

        public b(int v) {
            this.e = v;
        }

        @Override  // androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup
        public int f(int v) {
            return v == 0 ? this.e : 1;
        }

        public final void m(int v) {
            this.e = v;
        }
    }

    private int A;
    @m
    private X B;
    @m
    private I0 C;
    @m
    private rx.subscriptions.b D;
    private com.afollestad.dragselectrecyclerview.b E;
    private ActivityResultLauncher F;
    private b G;
    @l
    public static final a H = null;
    @l
    public static final String I = "extra_upload_image";
    @l
    public static final String J = "PickerActivity.extra_auto_image";
    private T u;
    private boolean v;
    private boolean w;
    @m
    private Album x;
    @m
    private String y;
    @m
    private j z;

    static {
        PickerActivity.H = new a(null);
    }

    private final int W1() {
        Configuration configuration0 = this.getResources().getConfiguration();
        L.o(configuration0, "getConfiguration(...)");
        return Math.max(((int)Math.ceil(((double)configuration0.screenWidthDp) / 150.0)), 3);
    }

    private final void X1(Intent intent0) {
        String s = intent0 == null ? null : intent0.getStringExtra("extra_gif_path");
        if(s != null && s.length() > 0) {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(s);
            Intent intent1 = new Intent();
            intent1.putStringArrayListExtra("intent_path", arrayList0);
            this.setResult(-1, intent1);
            this.finish();
        }
    }

    private final void Y1() {
        String[] arr_s = {this.y};
        com.dcinside.app.album.picker.a a0 = (String s, Uri uri0) -> {
            L.p(this, "this$0");
            T t0 = this.u;
            Adapter recyclerView$Adapter0 = null;
            if(t0 == null) {
                L.S("binding");
                t0 = null;
            }
            L.o(t0.m, "photoPickerRecycler");
            Adapter recyclerView$Adapter1 = t0.m.getAdapter();
            if(recyclerView$Adapter1 instanceof f) {
                recyclerView$Adapter0 = recyclerView$Adapter1;
            }
            if(((f)recyclerView$Adapter0) == null) {
                return;
            }
            Iterable iterable0 = ((f)recyclerView$Adapter0).y();
            ArrayList arrayList0 = new ArrayList(u.b0(iterable0, 10));
            for(Object object0: iterable0) {
                arrayList0.add(((int)(((Number)object0).intValue() + 1)));
            }
            this.p2(arrayList0);
        };
        MediaScannerConnection.scanFile(this, arr_s, new String[]{"image/*"}, a0);
    }

    // 检测为 Lambda 实现
    private static final void Z1(PickerActivity pickerActivity0, String s, Uri uri0) [...]

    private final void a2(int v) {
        T t0 = this.u;
        com.afollestad.dragselectrecyclerview.b b0 = null;
        if(t0 == null) {
            L.S("binding");
            t0 = null;
        }
        L.o(t0.m, "photoPickerRecycler");
        Adapter recyclerView$Adapter0 = t0.m.getAdapter();
        if(!(recyclerView$Adapter0 instanceof f)) {
            recyclerView$Adapter0 = null;
        }
        if(((f)recyclerView$Adapter0) != null) {
            List list0 = ((f)recyclerView$Adapter0).y();
            ((f)recyclerView$Adapter0).x().clear();
            ((f)recyclerView$Adapter0).x().addAll(list0);
        }
        com.afollestad.dragselectrecyclerview.b b1 = this.E;
        if(b1 == null) {
            L.S("touchListener");
        }
        else {
            b0 = b1;
        }
        b0.v(true, v);
    }

    private final void b2(m0 m00) {
        Intent intent0 = new Intent(this, ImageViewerActivity.class);
        intent0.putExtra("com.dcinside.app.extra.GALLERY_ID", m00.c());
        intent0.putExtra("com.dcinside.app.extra.POST_NUMBER", m00.g());
        intent0.putExtra("com.dcinside.app.extra.POST_SUBJECT", m00.k());
        intent0.putExtra("com.dcinside.app.extra.IMAGE_SELECTED", m00.l());
        intent0.putExtra("com.dcinside.app.extra.SHOW_PATH_CHANGE", m00.j());
        intent0.putParcelableArrayListExtra("com.dcinside.app.extra.RESIZE_IMAGE_LIST", m00.h());
        intent0.putParcelableArrayListExtra("com.dcinside.app.extra.ORIGIN_IMAGE_LIST", m00.f());
        intent0.putExtra("com.dcinside.app.extra.EXTRA_SHOW_IMAGE_MODE", m00.e());
        intent0.putStringArrayListExtra("com.dcinside.app.extra.EXTRA_VIDEO_THUMBNAIL_LIST", m00.d());
        intent0.putExtra("com.dcinside.app.extra.EXTRA_CAN_BLOCK", m00.b());
        ActivityResultLauncher activityResultLauncher0 = null;
        intent0.putExtra("com.dcinside.app.extra.EXTRA_ALBUM_BUCKET_ID", (this.x == null ? null : this.x.a()));
        intent0.putExtra("com.dcinside.app.extra.EXTRA_CURSOR_POSITION", m00.a());
        intent0.putExtra("com.dcinside.app.extra.EXTRA_SELECTED_IMAGE_POSITIONS", m00.i());
        ActivityResultLauncher activityResultLauncher1 = this.F;
        if(activityResultLauncher1 == null) {
            L.S("activityResultImageViewer");
        }
        else {
            activityResultLauncher0 = activityResultLauncher1;
        }
        activityResultLauncher0.b(intent0);
    }

    private final void c2(o0 o00) {
        String s = o00.a();
        VideoPreviewActivity.w.a(this, s);
    }

    private final TextView d2() {
        T t0 = this.u;
        if(t0 == null) {
            L.S("binding");
            t0 = null;
        }
        TextView textView0 = t0.e;
        if(!textView0.isSelected()) {
            dl.a.t4(0);
            textView0.setSelected(true);
            T t1 = this.u;
            if(t1 == null) {
                L.S("binding");
                t1 = null;
            }
            t1.f.setSelected(false);
            PickerActivity.q2(this, null, 1, null);
        }
        L.o(textView0, "also(...)");
        return textView0;
    }

    private final TextView e2() {
        T t0 = this.u;
        if(t0 == null) {
            L.S("binding");
            t0 = null;
        }
        TextView textView0 = t0.f;
        if(!textView0.isSelected()) {
            dl.a.t4(1);
            textView0.setSelected(true);
            T t1 = this.u;
            if(t1 == null) {
                L.S("binding");
                t1 = null;
            }
            t1.e.setSelected(false);
            PickerActivity.q2(this, null, 1, null);
        }
        L.o(textView0, "also(...)");
        return textView0;
    }

    private final void f2() {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.album.picker.PickerActivity$onClickMakeGif$1", f = "PickerActivity.kt", i = {}, l = {452, 461, 468, 474}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPickerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickerActivity.kt\ncom/dcinside/app/album/picker/PickerActivity$onClickMakeGif$1\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,556:1\n25#2:557\n25#2:558\n1123#3,4:559\n*S KotlinDebug\n*F\n+ 1 PickerActivity.kt\ncom/dcinside/app/album/picker/PickerActivity$onClickMakeGif$1\n*L\n447#1:557\n448#1:558\n458#1:559,4\n*E\n"})
        static final class c extends o implements A3.o {
            int k;
            final PickerActivity l;

            c(PickerActivity pickerActivity0, kotlin.coroutines.d d0) {
                this.l = pickerActivity0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new c(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.album.picker.PickerActivity$onClickMakeGif$1$1", f = "PickerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.album.picker.PickerActivity.c.a extends o implements A3.o {
                    int k;
                    final PickerActivity l;

                    com.dcinside.app.album.picker.PickerActivity.c.a(PickerActivity pickerActivity0, kotlin.coroutines.d d0) {
                        this.l = pickerActivity0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.album.picker.PickerActivity.c.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.album.picker.PickerActivity.c.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        Dl.D(this.l, 0x7F1503E3);  // string:gif_make_image_least "최소 2장 이상의 파일은 선택되어야합니다."
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.album.picker.PickerActivity.c.b extends N implements Function1 {
                    public static final com.dcinside.app.album.picker.PickerActivity.c.b e;

                    static {
                        com.dcinside.app.album.picker.PickerActivity.c.b.e = new com.dcinside.app.album.picker.PickerActivity.c.b();
                    }

                    com.dcinside.app.album.picker.PickerActivity.c.b() {
                        super(1);
                    }

                    @l
                    public final String a(@l PickerItem pickerItem0) {
                        L.p(pickerItem0, "it");
                        return pickerItem0.m();
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((PickerItem)object0));
                    }
                }


                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.album.picker.PickerActivity$onClickMakeGif$1$4", f = "PickerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.album.picker.PickerActivity.c.c extends o implements A3.o {
                    int k;
                    final PickerActivity l;
                    final ArrayList m;

                    com.dcinside.app.album.picker.PickerActivity.c.c(PickerActivity pickerActivity0, ArrayList arrayList0, kotlin.coroutines.d d0) {
                        this.l = pickerActivity0;
                        this.m = arrayList0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.album.picker.PickerActivity.c.c(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.album.picker.PickerActivity.c.c)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        com.dcinside.app.gif.maker.d.f.l(this.l, this.m, U.a.c);
                        return S0.a;
                    }
                }


                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.album.picker.PickerActivity$onClickMakeGif$1$5", f = "PickerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.album.picker.PickerActivity.c.d extends o implements A3.o {
                    int k;
                    final PickerActivity l;

                    com.dcinside.app.album.picker.PickerActivity.c.d(PickerActivity pickerActivity0, kotlin.coroutines.d d0) {
                        this.l = pickerActivity0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.album.picker.PickerActivity.c.d(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.album.picker.PickerActivity.c.d)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        Dl.D(this.l, 0x7F1503E5);  // string:gif_make_select_files "대상을 선택해주세요."
                        return S0.a;
                    }
                }


                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.album.picker.PickerActivity$onClickMakeGif$1$6", f = "PickerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class e extends o implements A3.o {
                    int k;
                    final PickerActivity l;
                    final String m;

                    e(PickerActivity pickerActivity0, String s, kotlin.coroutines.d d0) {
                        this.l = pickerActivity0;
                        this.m = s;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new e(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((e)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        com.dcinside.app.gif.maker.d.f.k(this.l, this.m, U.a.c);
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        T t0 = this.l.u;
                        if(t0 == null) {
                            L.S("binding");
                            t0 = null;
                        }
                        L.o(t0.m, "photoPickerRecycler");
                        Adapter recyclerView$Adapter0 = t0.m.getAdapter();
                        if(!(recyclerView$Adapter0 instanceof f)) {
                            recyclerView$Adapter0 = null;
                        }
                        if(((f)recyclerView$Adapter0) != null) {
                            List list0 = ((f)recyclerView$Adapter0).y();
                            if(list0 != null) {
                                T t1 = this.l.u;
                                if(t1 == null) {
                                    L.S("binding");
                                    t1 = null;
                                }
                                L.o(t1.m, "photoPickerRecycler");
                                Adapter recyclerView$Adapter1 = t1.m.getAdapter();
                                if(!(recyclerView$Adapter1 instanceof f)) {
                                    recyclerView$Adapter1 = null;
                                }
                                if(((f)recyclerView$Adapter1) != null) {
                                    List list1 = ((f)recyclerView$Adapter1).w(list0);
                                    if(list1 != null) {
                                        T t2 = this.l.u;
                                        if(t2 == null) {
                                            L.S("binding");
                                            t2 = null;
                                        }
                                        if(t2.e.isSelected()) {
                                            if(list0.size() < 2) {
                                                com.dcinside.app.album.picker.PickerActivity.c.a pickerActivity$c$a0 = new com.dcinside.app.album.picker.PickerActivity.c.a(this.l, null);
                                                this.k = 1;
                                                return i.h(h0.e(), pickerActivity$c$a0, this) == object1 ? object1 : S0.a;
                                            }
                                            ArrayList arrayList0 = new ArrayList();
                                            int v = 0;
                                            for(Object object2: p.k1(u.A1(list1), com.dcinside.app.album.picker.PickerActivity.c.b.e)) {
                                                if(v < 0) {
                                                    u.Z();
                                                }
                                                arrayList0.add(new Frame(((long)v), ((String)object2), 0, 0));
                                                ++v;
                                            }
                                            com.dcinside.app.album.picker.PickerActivity.c.c pickerActivity$c$c0 = new com.dcinside.app.album.picker.PickerActivity.c.c(this.l, arrayList0, null);
                                            this.k = 2;
                                            if(i.h(h0.e(), pickerActivity$c$c0, this) == object1) {
                                                return object1;
                                            }
                                        }
                                        else {
                                            if(list0.isEmpty()) {
                                                com.dcinside.app.album.picker.PickerActivity.c.d pickerActivity$c$d0 = new com.dcinside.app.album.picker.PickerActivity.c.d(this.l, null);
                                                this.k = 3;
                                                return i.h(h0.e(), pickerActivity$c$d0, this) == object1 ? object1 : S0.a;
                                            }
                                            String s = ((PickerItem)u.B2(list1)).m();
                                            e pickerActivity$c$e0 = new e(this.l, s, null);
                                            this.k = 4;
                                            if(i.h(h0.e(), pickerActivity$c$e0, this) == object1) {
                                                return object1;
                                            }
                                        }
                                        return S0.a;
                                    }
                                }
                                return S0.a;
                            }
                        }
                        return S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 3: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 2: 
                    case 4: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        I0 i00 = this.C;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.C = k.f(LifecycleOwnerKt.a(this), h0.c(), null, new c(this, null), 2, null);
    }

    // 检测为 Lambda 实现
    private static final void g2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void h2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void i2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void j2(f f0, ActivityResult activityResult0) [...]

    private final void k2() {
        ColorStateList colorStateList0;
        T t0 = this.u;
        T t1 = null;
        if(t0 == null) {
            L.S("binding");
            t0 = null;
        }
        ImageView imageView0 = t0.k;
        L.o(imageView0, "photoPickerImageWatermarkUseImage");
        if(imageView0.isSelected()) {
            String s = this.getIntent().getStringExtra("extra_user_nickname");
            if(s == null || s.length() == 0 || s.length() < 2) {
                com.dcinside.app.internal.c.v(this, 0x7F1504F4);  // string:image_watermark_need_nickname "서명 추가 시 닉네임이 필요합니다. 글쓰기 상단에 닉네임을 먼저 입력해 주세요."
                T t2 = this.u;
                if(t2 == null) {
                    L.S("binding");
                    t2 = null;
                }
                t2.k.setSelected(false);
            }
        }
        boolean z = imageView0.isSelected();
        T t3 = this.u;
        if(t3 == null) {
            L.S("binding");
        }
        else {
            t1 = t3;
        }
        ImageView imageView1 = t1.k;
        imageView1.setImageResource((z ? 0x7F08031F : 0x7F08031E));  // drawable:ico_checkbox_checked
        dl dl0 = dl.a;
        imageView1.setAlpha((dl0.q2().l() || dl0.q2().p() || z ? 1.0f : 0.4f));
        if(dl0.q2().l()) {
            colorStateList0 = ContextCompat.getColorStateList(this, 0x7F060127);  // color:gray
        }
        else if(dl0.q2().p()) {
            colorStateList0 = ContextCompat.getColorStateList(this, 0x7F0605B8);  // color:white
        }
        else {
            colorStateList0 = z ? ContextCompat.getColorStateList(this, 0x7F06012D) : vk.c(this, 0x7F04032A);  // color:grey5
        }
        ImageViewCompat.c(imageView1, colorStateList0);
        dl0.n6(z);
    }

    private final void l2() {
        T t0 = this.u;
        if(t0 == null) {
            L.S("binding");
            t0 = null;
        }
        L.o(t0.k, "photoPickerImageWatermarkUseImage");
        boolean z = t0.k.isSelected();
        t0.k.setSelected(!z);
        this.k2();
    }

    private final void m2(boolean z, boolean z1, List list0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.album.picker.PickerActivity$receiveShowList$1", f = "PickerActivity.kt", i = {}, l = {378}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.album.picker.PickerActivity.m extends o implements A3.o {
            int k;
            private Object l;
            final boolean m;
            final PickerActivity n;
            final boolean o;
            final List p;

            com.dcinside.app.album.picker.PickerActivity.m(boolean z, PickerActivity pickerActivity0, boolean z1, List list0, kotlin.coroutines.d d0) {
                this.m = z;
                this.n = pickerActivity0;
                this.o = z1;
                this.p = list0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new com.dcinside.app.album.picker.PickerActivity.m(this.m, this.n, this.o, this.p, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.album.picker.PickerActivity.m)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @s0({"SMAP\nPickerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickerActivity.kt\ncom/dcinside/app/album/picker/PickerActivity$receiveShowList$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,556:1\n1#2:557\n*E\n"})
                static final class com.dcinside.app.album.picker.PickerActivity.m.a extends N implements Function1 {
                    public static final com.dcinside.app.album.picker.PickerActivity.m.a e;

                    static {
                        com.dcinside.app.album.picker.PickerActivity.m.a.e = new com.dcinside.app.album.picker.PickerActivity.m.a();
                    }

                    com.dcinside.app.album.picker.PickerActivity.m.a() {
                        super(1);
                    }

                    @m
                    public final PickerItem a(@l Cursor cursor0) {
                        L.p(cursor0, "it");
                        try {
                            String s = cursor0.getString(1);
                            if(s != null) {
                                String s1 = s.length() <= 0 ? null : s;
                                if(s1 != null) {
                                    File file0 = new File(s1);
                                    String s2 = kotlin.io.m.b0(file0);
                                    Locale locale0 = Locale.getDefault();
                                    L.o(locale0, "getDefault(...)");
                                    String s3 = s2.toUpperCase(locale0);
                                    L.o(s3, "toUpperCase(...)");
                                    return new PickerItem(s1, s3, false, file0.length(), 0L);
                                }
                            }
                            return new PickerItem("", "", false, 0L, 0L);
                        }
                        catch(Exception unused_ex) {
                            return null;
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((Cursor)object0));
                    }
                }


                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.album.picker.PickerActivity$receiveShowList$1$2", f = "PickerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nPickerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickerActivity.kt\ncom/dcinside/app/album/picker/PickerActivity$receiveShowList$1$2\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,556:1\n25#2:557\n25#2:558\n*S KotlinDebug\n*F\n+ 1 PickerActivity.kt\ncom/dcinside/app/album/picker/PickerActivity$receiveShowList$1$2\n*L\n379#1:557\n387#1:558\n*E\n"})
                static final class com.dcinside.app.album.picker.PickerActivity.m.b extends o implements A3.o {
                    int k;
                    final PickerActivity l;
                    final boolean m;
                    final List n;

                    com.dcinside.app.album.picker.PickerActivity.m.b(PickerActivity pickerActivity0, boolean z, List list0, kotlin.coroutines.d d0) {
                        this.l = pickerActivity0;
                        this.m = z;
                        this.n = list0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.album.picker.PickerActivity.m.b(this.l, this.m, this.n, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.album.picker.PickerActivity.m.b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        T t0 = this.l.u;
                        Adapter recyclerView$Adapter0 = null;
                        if(t0 == null) {
                            L.S("binding");
                            t0 = null;
                        }
                        L.o(t0.m, "photoPickerRecycler");
                        Adapter recyclerView$Adapter1 = t0.m.getAdapter();
                        if(!(recyclerView$Adapter1 instanceof f)) {
                            recyclerView$Adapter1 = null;
                        }
                        if(((f)recyclerView$Adapter1) != null) {
                            boolean z = this.l.getIntent().getBooleanExtra("PickerActivity.extra_auto_image", false);
                            ((f)recyclerView$Adapter1).H(this.l.w, this.m, this.l.v, this.l.z, z);
                        }
                        if(!this.n.isEmpty()) {
                            T t1 = this.l.u;
                            if(t1 == null) {
                                L.S("binding");
                                t1 = null;
                            }
                            L.o(t1.m, "photoPickerRecycler");
                            Adapter recyclerView$Adapter2 = t1.m.getAdapter();
                            if(recyclerView$Adapter2 instanceof f) {
                                recyclerView$Adapter0 = recyclerView$Adapter2;
                            }
                            if(((f)recyclerView$Adapter0) == null) {
                                return S0.a;
                            }
                            ((f)recyclerView$Adapter0).K(u.Y5(this.n));
                            this.l.o2(this.n.size());
                            ((f)recyclerView$Adapter0).notifyItemRangeChanged(0, this.n.size());
                            return S0.a;
                        }
                        this.l.o2(0);
                        return S0.a;
                    }
                }

                Cursor cursor0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        long v = 0L;
                        if(this.m) {
                            com.dcinside.app.album.l l0 = com.dcinside.app.album.l.a;
                            Album album0 = this.n.x;
                            if(album0 != null) {
                                v = album0.a();
                            }
                            cursor0 = l0.h(v);
                        }
                        else {
                            com.dcinside.app.album.l l1 = com.dcinside.app.album.l.a;
                            Album album1 = this.n.x;
                            if(album1 != null) {
                                v = album1.a();
                            }
                            cursor0 = l1.g(v, this.n.w);
                        }
                        j j0 = this.n.z;
                        if(j0 != null) {
                            j0.h();
                        }
                        j j1 = new j(o0, cursor0, com.dcinside.app.album.picker.PickerActivity.m.a.e);
                        this.n.z = j1;
                        com.dcinside.app.album.picker.PickerActivity.m.b pickerActivity$m$b0 = new com.dcinside.app.album.picker.PickerActivity.m.b(this.n, this.o, this.p, null);
                        this.k = 1;
                        return i.h(h0.e(), pickerActivity$m$b0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        k.f(LifecycleOwnerKt.a(this), h0.c(), null, new com.dcinside.app.album.picker.PickerActivity.m(z1, this, z, list0, null), 2, null);
    }

    static void n2(PickerActivity pickerActivity0, boolean z, boolean z1, List list0, int v, Object object0) {
        if((v & 4) != 0) {
            list0 = u.H();
        }
        pickerActivity0.m2(z, z1, list0);
    }

    public final void o2(int v) {
        String s1;
        boolean z = this.getIntent().getBooleanExtra("PickerActivity.extra_auto_image", false);
        String s = null;
        if(this.v || z) {
            Album album1 = this.x;
            if(album1 != null) {
                s = album1.c();
            }
            s1 = String.valueOf(s);
        }
        else {
            Album album0 = this.x;
            if(album0 != null) {
                s = album0.c();
            }
            s1 = s + "(" + v + "/" + U.a.b + ")";
        }
        this.setTitle(s1);
    }

    @Override  // com.dcinside.app.base.d
    @kotlin.k(message = "Deprecated in Java")
    protected void onActivityResult(int v, int v1, @m Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v1 != -1) {
            return;
        }
        if(v == U.a.e) {
            this.Y1();
            return;
        }
        switch(v) {
            case 0x3FD: {
                this.X1(intent0);
                return;
            }
            case 0x3FE: {
                this.X1(intent0);
                return;
            }
            case 0x400: {
                this.s2();
            }
        }
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    public void onConfigurationChanged(@l Configuration configuration0) {
        L.p(configuration0, "newConfig");
        super.onConfigurationChanged(configuration0);
        T t0 = this.u;
        b pickerActivity$b0 = null;
        if(t0 == null) {
            L.S("binding");
            t0 = null;
        }
        LayoutManager recyclerView$LayoutManager0 = t0.m.getLayoutManager();
        GridLayoutManager gridLayoutManager0 = recyclerView$LayoutManager0 instanceof GridLayoutManager ? ((GridLayoutManager)recyclerView$LayoutManager0) : null;
        if(gridLayoutManager0 == null) {
            return;
        }
        gridLayoutManager0.l4(this.W1());
        b pickerActivity$b1 = this.G;
        if(pickerActivity$b1 == null) {
            L.S("pickerSpanSizeLookUp");
        }
        else {
            pickerActivity$b0 = pickerActivity$b1;
        }
        pickerActivity$b0.m(this.W1());
    }

    @Override  // com.dcinside.app.base.d
    @SuppressLint({"NotifyDataSetChanged"})
    protected void onCreate(@m Bundle bundle0) {
        static final class com.dcinside.app.album.picker.PickerActivity.d extends N implements Function1 {
            final PickerActivity e;

            com.dcinside.app.album.picker.PickerActivity.d(PickerActivity pickerActivity0) {
                this.e = pickerActivity0;
                super(1);
            }

            public final void a(m0 m00) {
                L.m(m00);
                this.e.b2(m00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((m0)object0));
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.album.picker.PickerActivity$onCreate$1", f = "PickerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.album.picker.PickerActivity.e extends o implements A3.p {
            int k;
            final PickerActivity l;

            com.dcinside.app.album.picker.PickerActivity.e(PickerActivity pickerActivity0, kotlin.coroutines.d d0) {
                this.l = pickerActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.album.picker.PickerActivity.e(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.f2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.album.picker.PickerActivity$onCreate$2", f = "PickerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.album.picker.PickerActivity.f extends o implements A3.p {
            int k;
            final PickerActivity l;

            com.dcinside.app.album.picker.PickerActivity.f(PickerActivity pickerActivity0, kotlin.coroutines.d d0) {
                this.l = pickerActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.album.picker.PickerActivity.f(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.d2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.album.picker.PickerActivity$onCreate$3", f = "PickerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends o implements A3.p {
            int k;
            final PickerActivity l;

            g(PickerActivity pickerActivity0, kotlin.coroutines.d d0) {
                this.l = pickerActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new g(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.e2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.album.picker.PickerActivity$onCreate$4", f = "PickerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends o implements A3.p {
            int k;
            final PickerActivity l;

            h(PickerActivity pickerActivity0, kotlin.coroutines.d d0) {
                this.l = pickerActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new h(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                ImageSizeActivity.x.a(this.l);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.album.picker.PickerActivity$onCreate$5", f = "PickerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.album.picker.PickerActivity.i extends o implements A3.p {
            int k;
            final PickerActivity l;

            com.dcinside.app.album.picker.PickerActivity.i(PickerActivity pickerActivity0, kotlin.coroutines.d d0) {
                this.l = pickerActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.album.picker.PickerActivity.i(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.l2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.album.picker.PickerActivity$onCreate$6", f = "PickerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.album.picker.PickerActivity.j extends o implements A3.p {
            int k;
            final PickerActivity l;

            com.dcinside.app.album.picker.PickerActivity.j(PickerActivity pickerActivity0, kotlin.coroutines.d d0) {
                this.l = pickerActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.album.picker.PickerActivity.j(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.l2();
                return S0.a;
            }
        }


        static final class com.dcinside.app.album.picker.PickerActivity.k extends N implements Function1 {
            final PickerActivity e;

            com.dcinside.app.album.picker.PickerActivity.k(PickerActivity pickerActivity0) {
                this.e = pickerActivity0;
                super(1);
            }

            public final void a(x x0) {
                int v = x0.a();
                this.e.a2(v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((x)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.album.picker.PickerActivity.l extends N implements Function1 {
            final PickerActivity e;

            com.dcinside.app.album.picker.PickerActivity.l(PickerActivity pickerActivity0) {
                this.e = pickerActivity0;
                super(1);
            }

            public final void a(o0 o00) {
                L.m(o00);
                this.e.c2(o00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((o0)object0));
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        T t0 = T.c(this.getLayoutInflater());
        L.o(t0, "inflate(...)");
        this.u = t0;
        if(t0 == null) {
            L.S("binding");
            t0 = null;
        }
        this.setContentView(t0.b());
        T t1 = this.u;
        if(t1 == null) {
            L.S("binding");
            t1 = null;
        }
        this.S0(t1.n);
        kr.bhbfhfb.designcompat.a.d(this);
        Class class0 = Album.class;
        int v = 0;
        if(bundle0 == null) {
            this.x = (Album)IntentCompat.d(this.getIntent(), "album", class0);
            this.w = this.getIntent().getBooleanExtra("gif", false);
            this.v = this.getIntent().getBooleanExtra("extra_upload_image", false);
        }
        else {
            this.x = (Album)IntentCompat.d(this.getIntent(), "album", class0);
            this.y = bundle0.getString("savedPath");
            this.w = bundle0.getBoolean("gif");
            this.v = bundle0.getBoolean("extra_upload_image", false);
        }
        if(this.x == null) {
            this.finish();
            return;
        }
        f f0 = new f();
        GridLayoutManager gridLayoutManager0 = new GridLayoutManager(this, this.W1(), 1, false);
        b pickerActivity$b0 = new b(this.W1());
        this.G = pickerActivity$b0;
        gridLayoutManager0.m4(pickerActivity$b0);
        T t2 = this.u;
        if(t2 == null) {
            L.S("binding");
            t2 = null;
        }
        t2.m.setLayoutManager(gridLayoutManager0);
        T t3 = this.u;
        if(t3 == null) {
            L.S("binding");
            t3 = null;
        }
        t3.m.setAdapter(f0);
        Z.a a0 = new Z.a(f0);
        this.E = com.afollestad.dragselectrecyclerview.b.a.b(com.afollestad.dragselectrecyclerview.b.w, this, a0, null, 4, null);
        T t4 = this.u;
        if(t4 == null) {
            L.S("binding");
            t4 = null;
        }
        RecyclerView recyclerView0 = t4.m;
        com.afollestad.dragselectrecyclerview.b b0 = this.E;
        if(b0 == null) {
            L.S("touchListener");
            b0 = null;
        }
        recyclerView0.addOnItemTouchListener(b0);
        T t5 = this.u;
        if(t5 == null) {
            L.S("binding");
            t5 = null;
        }
        com.dcinside.app.view.f f1 = new com.dcinside.app.view.f();
        t5.d.setViewProvider(f1);
        T t6 = this.u;
        if(t6 == null) {
            L.S("binding");
            t6 = null;
        }
        FastScroller fastScroller0 = t6.d;
        T t7 = this.u;
        if(t7 == null) {
            L.S("binding");
            t7 = null;
        }
        fastScroller0.setRecyclerView(t7.m);
        T t8 = this.u;
        if(t8 == null) {
            L.S("binding");
            t8 = null;
        }
        L.o(t8.l, "photoPickerMakeGif");
        com.dcinside.app.album.picker.PickerActivity.e pickerActivity$e0 = new com.dcinside.app.album.picker.PickerActivity.e(this, null);
        r.M(t8.l, null, pickerActivity$e0, 1, null);
        T t9 = this.u;
        if(t9 == null) {
            L.S("binding");
            t9 = null;
        }
        L.o(t9.e, "photoPickerGifFilterImage");
        com.dcinside.app.album.picker.PickerActivity.f pickerActivity$f0 = new com.dcinside.app.album.picker.PickerActivity.f(this, null);
        r.M(t9.e, null, pickerActivity$f0, 1, null);
        T t10 = this.u;
        if(t10 == null) {
            L.S("binding");
            t10 = null;
        }
        L.o(t10.f, "photoPickerGifFilterVideo");
        g pickerActivity$g0 = new g(this, null);
        r.M(t10.f, null, pickerActivity$g0, 1, null);
        T t11 = this.u;
        if(t11 == null) {
            L.S("binding");
            t11 = null;
        }
        L.o(t11.j, "photoPickerImageSizeSetting");
        h pickerActivity$h0 = new h(this, null);
        r.M(t11.j, null, pickerActivity$h0, 1, null);
        T t12 = this.u;
        if(t12 == null) {
            L.S("binding");
            t12 = null;
        }
        L.o(t12.h, "photoPickerImageCopyright");
        com.dcinside.app.album.picker.PickerActivity.i pickerActivity$i0 = new com.dcinside.app.album.picker.PickerActivity.i(this, null);
        r.M(t12.h, null, pickerActivity$i0, 1, null);
        T t13 = this.u;
        if(t13 == null) {
            L.S("binding");
            t13 = null;
        }
        L.o(t13.k, "photoPickerImageWatermarkUseImage");
        com.dcinside.app.album.picker.PickerActivity.j pickerActivity$j0 = new com.dcinside.app.album.picker.PickerActivity.j(this, null);
        r.M(t13.k, null, pickerActivity$j0, 1, null);
        this.k2();
        if(this.v) {
            T t14 = this.u;
            if(t14 == null) {
                L.S("binding");
                t14 = null;
            }
            t14.i.setVisibility(8);
            T t15 = this.u;
            if(t15 == null) {
                L.S("binding");
                t15 = null;
            }
            t15.g.setVisibility(8);
            T t16 = this.u;
            if(t16 == null) {
                L.S("binding");
                t16 = null;
            }
            t16.l.setVisibility(8);
            T t17 = this.u;
            if(t17 == null) {
                L.S("binding");
                t17 = null;
            }
            L.o(t17.m, "photoPickerRecycler");
            t17.m.setPadding(0, 0, 0, 0);
            T t18 = this.u;
            if(t18 == null) {
                L.S("binding");
                t18 = null;
            }
            L.o(t18.d, "photoPickerFastscroll");
            r.g0(t18.d, null, 0, null, null, 13, null);
        }
        else if(this.w) {
            int v1 = dl.a.A0() == 1 ? 1 : 0;
            T t19 = this.u;
            if(t19 == null) {
                L.S("binding");
                t19 = null;
            }
            t19.g.setVisibility(0);
            T t20 = this.u;
            if(t20 == null) {
                L.S("binding");
                t20 = null;
            }
            t20.l.setVisibility(0);
            T t21 = this.u;
            if(t21 == null) {
                L.S("binding");
                t21 = null;
            }
            t21.i.setVisibility(8);
            T t22 = this.u;
            if(t22 == null) {
                L.S("binding");
                t22 = null;
            }
            t22.e.setSelected(((boolean)(v1 ^ 1)));
            T t23 = this.u;
            if(t23 == null) {
                L.S("binding");
                t23 = null;
            }
            t23.f.setSelected(((boolean)v1));
        }
        else {
            T t24 = this.u;
            if(t24 == null) {
                L.S("binding");
                t24 = null;
            }
            ConstraintLayout constraintLayout0 = t24.i;
            String s = this.getIntent().getAction();
            if(s != null) {
                switch(s) {
                    case "ACTION_EXECUTE_PROMPT_IMAGE": 
                    case "ACTION_SELECT_RESAMPLE_IMAGE": {
                        T t25 = this.u;
                        if(t25 == null) {
                            L.S("binding");
                            t25 = null;
                        }
                        L.o(t25.m, "photoPickerRecycler");
                        t25.m.setPadding(0, 0, 0, 0);
                        T t26 = this.u;
                        if(t26 == null) {
                            L.S("binding");
                            t26 = null;
                        }
                        L.o(t26.d, "photoPickerFastscroll");
                        r.g0(t26.d, null, 0, null, null, 13, null);
                        v = 8;
                    }
                }
            }
            constraintLayout0.setVisibility(v);
            this.s2();
        }
        PickerActivity.q2(this, null, 1, null);
        rx.o o0 = com.dcinside.app.rx.bus.c.c(this, x.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.album.picker.PickerActivity.k(this), "$tmp0");
            new com.dcinside.app.album.picker.PickerActivity.k(this).invoke(object0);
        });
        rx.subscriptions.b b1 = this.D;
        if(b1 != null) {
            b1.a(o0);
        }
        rx.o o1 = com.dcinside.app.rx.bus.c.c(this, o0.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.album.picker.PickerActivity.l(this), "$tmp0");
            new com.dcinside.app.album.picker.PickerActivity.l(this).invoke(object0);
        });
        rx.subscriptions.b b2 = this.D;
        if(b2 != null) {
            b2.a(o1);
        }
        rx.o o2 = com.dcinside.app.rx.bus.c.c(this, m0.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.album.picker.PickerActivity.d(this), "$tmp0");
            new com.dcinside.app.album.picker.PickerActivity.d(this).invoke(object0);
        });
        rx.subscriptions.b b3 = this.D;
        if(b3 != null) {
            b3.a(o2);
        }
        this.F = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(f0, "$adapter");
            L.p(activityResult0, "result");
            if(activityResult0.c() != -1) {
                return;
            }
            Intent intent0 = activityResult0.a();
            if(intent0 != null) {
                int[] arr_v = intent0.getIntArrayExtra("imageViewerSelectedPositions");
                if(arr_v != null) {
                    f0.y().clear();
                    for(int v = 0; v < arr_v.length; ++v) {
                        f0.y().add(((int)(arr_v[v] + 2)));
                        f0.F();
                    }
                    f0.notifyDataSetChanged();
                }
            }
        });
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@l Menu menu0) {
        L.p(menu0, "menu");
        this.getMenuInflater().inflate(0x7F100019, menu0);  // mipmap:ic_launcher28
        return true;
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        super.onDestroy();
        T t0 = this.u;
        if(t0 == null) {
            L.S("binding");
            t0 = null;
        }
        t0.e.setOnClickListener(null);
        T t1 = this.u;
        if(t1 == null) {
            L.S("binding");
            t1 = null;
        }
        t1.f.setOnClickListener(null);
        T t2 = this.u;
        if(t2 == null) {
            L.S("binding");
            t2 = null;
        }
        t2.l.setOnClickListener(null);
        T t3 = this.u;
        if(t3 == null) {
            L.S("binding");
            t3 = null;
        }
        RecyclerView recyclerView0 = t3.m;
        com.afollestad.dragselectrecyclerview.b b0 = this.E;
        if(b0 == null) {
            L.S("touchListener");
            b0 = null;
        }
        recyclerView0.removeOnItemTouchListener(b0);
        X x0 = this.B;
        if(x0 != null) {
            kotlinx.coroutines.I0.a.b(x0, null, 1, null);
        }
        this.B = null;
        I0 i00 = this.C;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.C = null;
        rx.subscriptions.b b1 = this.D;
        if(b1 != null) {
            b1.l();
        }
        j j0 = this.z;
        if(j0 != null) {
            j0.h();
        }
        this.y = null;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.getOnBackPressedDispatcher().p();
                return true;
            }
            case 0x7F0B0075: {  // id:action_write
                ArrayList arrayList0 = new ArrayList();
                T t0 = this.u;
                T t1 = null;
                if(t0 == null) {
                    L.S("binding");
                    t0 = null;
                }
                L.o(t0.m, "photoPickerRecycler");
                Adapter recyclerView$Adapter0 = t0.m.getAdapter();
                if(!(recyclerView$Adapter0 instanceof f)) {
                    recyclerView$Adapter0 = null;
                }
                if(((f)recyclerView$Adapter0) != null) {
                    for(Object object0: ((f)recyclerView$Adapter0).w(((f)recyclerView$Adapter0).y())) {
                        arrayList0.add(((PickerItem)object0).m());
                    }
                }
                if(!arrayList0.isEmpty()) {
                    String s = this.getIntent().getAction();
                    Intent intent0 = new Intent();
                    intent0.putStringArrayListExtra("intent_path", arrayList0);
                    intent0.setAction(s);
                    this.setResult(-1, intent0);
                    this.finish();
                    return true;
                }
                String s1 = this.v ? "동영상을 선택해주세요." : "";
                T t2 = this.u;
                if(t2 == null) {
                    L.S("binding");
                }
                else {
                    t1 = t2;
                }
                Snackbar.E0(t1.m, s1, -1).m0();
                return true;
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionDenied(@m PermissionDeniedResponse permissionDeniedResponse0) {
        String s = permissionDeniedResponse0 == null ? null : permissionDeniedResponse0.getPermissionName();
        Dl.D(Application.e.c(), cl.b(s));
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionGranted(@m PermissionGrantedResponse permissionGrantedResponse0) {
        String s = permissionGrantedResponse0 == null ? null : permissionGrantedResponse0.getPermissionName();
        Dl.D(Application.e.c(), cl.c(s));
        if(this.A == 0x75) {
            this.r2();
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionRationaleShouldBeShown(@l PermissionRequest permissionRequest0, @m PermissionToken permissionToken0) {
        L.p(permissionRequest0, "permission");
        if(permissionToken0 != null) {
            permissionToken0.continuePermissionRequest();
        }
    }

    @Override  // androidx.activity.ComponentActivity
    protected void onSaveInstanceState(@l Bundle bundle0) {
        L.p(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        bundle0.putParcelable("album", this.x);
        bundle0.putString("savedPath", this.y);
        bundle0.putBoolean("gif", this.w);
    }

    public final void p2(@l List list0) {
        V v0;
        L.p(list0, "selectedIndexes");
        T t0 = this.u;
        T t1 = null;
        if(t0 == null) {
            L.S("binding");
            t0 = null;
        }
        if(t0.e.isSelected()) {
            v0 = r0.a(Boolean.FALSE, Boolean.FALSE);
        }
        else {
            T t2 = this.u;
            if(t2 == null) {
                L.S("binding");
            }
            else {
                t1 = t2;
            }
            boolean z = true;
            if(t1.f.isSelected()) {
                v0 = r0.a(Boolean.TRUE, Boolean.TRUE);
            }
            else if(this.v) {
                v0 = r0.a(Boolean.TRUE, Boolean.TRUE);
            }
            else {
                if(U.a.b > 1) {
                    z = false;
                }
                v0 = r0.a(Boolean.valueOf(z), Boolean.FALSE);
            }
        }
        this.m2(((Boolean)v0.a()).booleanValue(), ((Boolean)v0.b()).booleanValue(), list0);
    }

    public static void q2(PickerActivity pickerActivity0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = u.H();
        }
        pickerActivity0.p2(list0);
    }

    public final void r2() {
        if(cl.a(this, this)) {
            this.A = 0x75;
            return;
        }
        try {
            T t0 = this.u;
            String s = null;
            if(t0 == null) {
                L.S("binding");
                t0 = null;
            }
            boolean z = t0.f.isSelected();
            boolean z1 = this.v || this.w && z;
            com.dcinside.app.album.l l0 = com.dcinside.app.album.l.a;
            Album album0 = this.x;
            if(album0 != null) {
                s = album0.e();
            }
            String s1 = l0.m(this, s, U.a.e, z1);
            if(s1 != null && s1.length() > 0) {
                this.y = s1;
                return;
            }
            Dl.D(this, 0x7F150341);  // string:file_capture_not_found "사진을 촬영할 수 없습니다."
        }
        catch(Exception unused_ex) {
            Dl.D(this, 0x7F150340);  // string:file_capture_eacces "이 경로에 사진을 저장할 수 없습니다.\n다른 경로를 지정해주세요."
        }
    }

    private final void s2() {
        T t0 = this.u;
        if(t0 == null) {
            L.S("binding");
            t0 = null;
        }
        String s = this.getString(0x7F1504E8, new Object[]{com.dcinside.app.write.d.a.h(this)});  // string:image_resize_setting "크기 설정 (%s)"
        t0.j.setText(s);
    }
}

