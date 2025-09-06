package com.dcinside.app.post.fragments;

import A3.p;
import Y.r2;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.RelativeSizeSpan;
import android.util.SparseArray;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.core.widget.ImageViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.album.AlbumActivity;
import com.dcinside.app.base.i;
import com.dcinside.app.internal.t;
import com.dcinside.app.model.m0;
import com.dcinside.app.model.s;
import com.dcinside.app.post.c0;
import com.dcinside.app.read.H;
import com.dcinside.app.realm.B;
import com.dcinside.app.response.GalleryInfo;
import com.dcinside.app.response.PostHead;
import com.dcinside.app.rx.bus.Z;
import com.dcinside.app.settings.image.AutoImageData;
import com.dcinside.app.settings.image.model.AutoImage;
import com.dcinside.app.span.AlignSuperscriptSpan;
import com.dcinside.app.type.C;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.cl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.dccon.DcConPickerView;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import com.dcinside.app.view.tool.e;
import com.dcinside.app.write.O2;
import com.dcinside.app.write.c;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import io.realm.F0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.D;
import kotlin.E;
import kotlin.J;
import kotlin.V;
import kotlin.coroutines.jvm.internal.f;
import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.q0;
import kotlin.r0;
import kotlin.text.v;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.h0;
import kr.better.widget.BetterTextView;
import y4.l;

@s0({"SMAP\nPostListQuickWriteHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostListQuickWriteHelper.kt\ncom/dcinside/app/post/fragments/PostListQuickWriteHelper\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1530:1\n147#2:1531\n255#3:1532\n257#3,2:1533\n327#3,4:1535\n257#3,2:1539\n257#3,2:1542\n257#3,2:1544\n255#3:1546\n257#3,2:1547\n257#3,2:1549\n257#3,2:1551\n257#3,2:1553\n327#3,4:1555\n327#3,2:1559\n257#3,2:1561\n255#3:1563\n329#3,2:1564\n327#3,4:1566\n255#3:1570\n255#3:1571\n255#3:1572\n255#3:1573\n255#3:1574\n327#3,2:1575\n257#3,2:1577\n329#3,2:1579\n327#3,4:1581\n327#3,4:1585\n257#3,2:1589\n257#3,2:1591\n257#3,2:1593\n257#3,2:1595\n257#3,2:1597\n257#3,2:1599\n257#3,2:1601\n257#3,2:1603\n257#3,2:1605\n257#3,2:1607\n257#3,2:1609\n257#3,2:1611\n257#3,2:1613\n257#3,2:1615\n257#3,2:1676\n257#3,2:1685\n257#3,2:1687\n257#3,2:1689\n257#3,2:1691\n257#3,2:1693\n257#3,2:1695\n255#3,4:1697\n257#3,2:1701\n257#3,2:1703\n257#3,2:1709\n257#3,2:1711\n257#3,2:1713\n257#3,2:1715\n255#3:1719\n255#3:1720\n257#3,2:1721\n257#3,2:1723\n257#3,2:1725\n257#3,2:1727\n257#3,2:1729\n257#3,2:1731\n257#3,2:1733\n257#3,2:1735\n257#3,2:1737\n257#3,2:1739\n257#3,2:1741\n257#3,2:1743\n257#3,2:1745\n257#3,2:1747\n255#3:1749\n1#4:1541\n1#4:1674\n177#5,6:1617\n192#5,7:1623\n183#5,3:1630\n177#5,9:1633\n177#5,9:1642\n177#5,9:1651\n177#5,9:1660\n120#5,3:1671\n124#5:1675\n204#5,7:1678\n37#6,2:1669\n295#7,2:1705\n295#7,2:1707\n295#7,2:1717\n*S KotlinDebug\n*F\n+ 1 PostListQuickWriteHelper.kt\ncom/dcinside/app/post/fragments/PostListQuickWriteHelper\n*L\n113#1:1531\n257#1:1532\n347#1:1533,2\n348#1:1535,4\n351#1:1539,2\n393#1:1542,2\n397#1:1544,2\n509#1:1546\n527#1:1547,2\n528#1:1549,2\n531#1:1551,2\n532#1:1553,2\n533#1:1555,4\n571#1:1559,2\n578#1:1561,2\n583#1:1563\n571#1:1564,2\n588#1:1566,4\n609#1:1570\n615#1:1571\n616#1:1572\n626#1:1573\n639#1:1574\n641#1:1575,2\n650#1:1577,2\n641#1:1579,2\n663#1:1581,4\n681#1:1585,4\n793#1:1589,2\n802#1:1591,2\n806#1:1593,2\n830#1:1595,2\n831#1:1597,2\n832#1:1599,2\n835#1:1601,2\n836#1:1603,2\n837#1:1605,2\n840#1:1607,2\n841#1:1609,2\n842#1:1611,2\n845#1:1613,2\n846#1:1615,2\n1058#1:1676,2\n1111#1:1685,2\n1114#1:1687,2\n1117#1:1689,2\n1123#1:1691,2\n1126#1:1693,2\n1223#1:1695,2\n1240#1:1697,4\n1241#1:1701,2\n1293#1:1703,2\n1340#1:1709,2\n1345#1:1711,2\n1346#1:1713,2\n1352#1:1715,2\n1371#1:1719\n1374#1:1720\n1386#1:1721,2\n1392#1:1723,2\n1393#1:1725,2\n1394#1:1727,2\n1395#1:1729,2\n1398#1:1731,2\n1399#1:1733,2\n1409#1:1735,2\n1410#1:1737,2\n1421#1:1739,2\n1422#1:1741,2\n1423#1:1743,2\n1424#1:1745,2\n1431#1:1747,2\n1443#1:1749\n1047#1:1674\n855#1:1617,6\n856#1:1623,7\n855#1:1630,3\n883#1:1633,9\n885#1:1642,9\n889#1:1651,9\n890#1:1660,9\n1047#1:1671,3\n1047#1:1675\n1098#1:1678,7\n1016#1:1669,2\n1298#1:1705,2\n1338#1:1707,2\n1359#1:1717,2\n*E\n"})
public final class r1 extends GestureDetector.SimpleOnGestureListener implements i, PermissionListener {
    @s0({"SMAP\nPostListQuickWriteHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostListQuickWriteHelper.kt\ncom/dcinside/app/post/fragments/PostListQuickWriteHelper$EditViewTapAddonHider\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,1530:1\n147#2:1531\n147#2:1532\n*S KotlinDebug\n*F\n+ 1 PostListQuickWriteHelper.kt\ncom/dcinside/app/post/fragments/PostListQuickWriteHelper$EditViewTapAddonHider\n*L\n1517#1:1531\n1518#1:1532\n*E\n"})
    static final class m extends GestureDetector.SimpleOnGestureListener {
        @y4.m
        private final GestureDetector a;
        @l
        private final t b;
        @l
        private final t c;

        public m(@y4.m EditText editText0, @l r1 r10) {
            L.p(r10, "helper");
            super();
            this.a = editText0 == null ? null : new GestureDetector(editText0.getContext(), this);
            this.b = new t(editText0);
            this.c = new t(r10);
        }

        public final void a(@l MotionEvent motionEvent0) {
            L.p(motionEvent0, "event");
            GestureDetector gestureDetector0 = this.a;
            if(gestureDetector0 != null) {
                gestureDetector0.onTouchEvent(motionEvent0);
            }
        }

        @Override  // android.view.GestureDetector$SimpleOnGestureListener
        public boolean onSingleTapUp(@l MotionEvent motionEvent0) {
            L.p(motionEvent0, "e");
            r1 r10 = (r1)this.c.a();
            if(r10 != null) {
                EditText editText0 = (EditText)this.b.a();
                if(editText0 == null) {
                    return false;
                }
                r10.W0(editText0);
            }
            return false;
        }
    }

    public static enum n {
        HIDE_NONE,
        HIDE_GUEST,
        UNUSED_GUEST;

        private static final n[] d;
        private static final a e;

        static {
            n.d = arr_r1$n;
            L.p(arr_r1$n, "entries");
            n.e = new d(arr_r1$n);
        }

        private static final n[] a() [...] // Inlined contents

        @l
        public static a b() {
            return n.e;
        }
    }

    public final class o {
        public static final int[] a;

        static {
            int[] arr_v = new int[n.values().length];
            try {
                arr_v[n.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[n.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[n.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            o.a = arr_v;
        }
    }

    @l
    private final ImageView A;
    @l
    private final View B;
    @l
    private final ConstraintLayout C;
    @l
    private final AppCompatTextView D;
    @l
    private final TextView E;
    @l
    private final TextView F;
    @l
    private final ConstraintLayout G;
    @l
    private final BetterTextView H;
    @l
    private final TextView I;
    @l
    private final ConstraintLayout J;
    @l
    private final ImageView K;
    @l
    private final TextView L;
    @l
    private n M;
    @y4.m
    private rx.o M8;
    private boolean N;
    @y4.m
    private I0 N8;
    @y4.m
    private ActivityResultLauncher O;
    @y4.m
    private I0 O8;
    @y4.m
    private e P;
    @y4.m
    private I0 P8;
    @y4.m
    private rx.o Q;
    private boolean Q8;
    private boolean R8;
    private boolean S8;
    private float T8;
    @l
    private TextWatcher U8;
    @l
    private TextWatcher V8;
    private boolean W8;
    @y4.m
    private rx.o X;
    @y4.m
    private String X8;
    @y4.m
    private D4 Y;
    @y4.m
    private Integer Y8;
    @y4.m
    private g Z;
    @y4.m
    private s Z8;
    @l
    private t a;
    @y4.m
    private String a9;
    @l
    private H b;
    @y4.m
    private Integer b9;
    @l
    private final ConstraintLayout c;
    private boolean c9;
    @l
    private final EditText d;
    @y4.m
    private GalleryInfo d9;
    @l
    private final ImageView e;
    private boolean e9;
    @l
    private final ImageView f;
    @y4.m
    private PostHead f9;
    @l
    private final ConstraintLayout g;
    @l
    private final D g9;
    @l
    private final ConstraintLayout h;
    @l
    private final D h9;
    @l
    private final LinearLayout i;
    @l
    private final D i9;
    @l
    private final ClearableEditText j;
    @l
    private final D j9;
    @l
    private final ImageView k;
    @y4.m
    private GestureDetector k9;
    @l
    private final ImageView l;
    private final int l9;
    @l
    private final ConstraintLayout m;
    private boolean m9;
    @l
    private final View n;
    @y4.m
    private c n9;
    @l
    private final FrameLayout o;
    @l
    private final FrameLayout p;
    @l
    private final ClearableEditText q;
    @l
    private final ClearableEditText r;
    @l
    private final TextView s;
    @l
    private final ConstraintLayout t;
    @l
    private final TextView u;
    @l
    private final ImageView v;
    @l
    private final LinearLayout w;
    @l
    private final DcConPickerView x;
    @l
    private final RecyclerView y;
    @l
    private final View z;

    public r1(@l S0 s00) {
        public static final class G implements TextWatcher {
            final r1 a;

            G(r1 r10) {
                this.a = r10;
                super();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(@y4.m Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(@y4.m CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(@y4.m CharSequence charSequence0, int v, int v1, int v2) {
                this.a.e1();
            }
        }


        @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper$10", f = "PostListQuickWriteHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.r1.a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final r1 l;

            com.dcinside.app.post.fragments.r1.a(r1 r10, kotlin.coroutines.d d0) {
                this.l = r10;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.r1.a(this.l, d0).invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.C1();
                return kotlin.S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper$11", f = "PostListQuickWriteHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final r1 l;

            b(r1 r10, kotlin.coroutines.d d0) {
                this.l = r10;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m kotlin.coroutines.d d0) {
                return new b(this.l, d0).invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.K1();
                return kotlin.S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper$12", f = "PostListQuickWriteHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.r1.c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final r1 l;

            com.dcinside.app.post.fragments.r1.c(r1 r10, kotlin.coroutines.d d0) {
                this.l = r10;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.r1.c(this.l, d0).invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.G1();
                return kotlin.S0.a;
            }
        }


        static final class com.dcinside.app.post.fragments.r1.d extends N implements Function1 {
            public static final com.dcinside.app.post.fragments.r1.d e;

            static {
                com.dcinside.app.post.fragments.r1.d.e = new com.dcinside.app.post.fragments.r1.d();
            }

            com.dcinside.app.post.fragments.r1.d() {
                super(1);
            }

            public final void a(int v) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return kotlin.S0.a;
            }
        }


        static final class com.dcinside.app.post.fragments.r1.e extends N implements Function1 {
            final r1 e;

            com.dcinside.app.post.fragments.r1.e(r1 r10) {
                this.e = r10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Boolean)object0).booleanValue());
                return kotlin.S0.a;
            }

            public final void invoke(boolean z) {
                boolean z1 = false;
                if(!z && !this.e.S8 && !this.e.R8 && !this.e.Z0()) {
                    this.e.x0(false);
                }
                r1 r10 = this.e;
                if(z) {
                    z1 = r10.c1();
                }
                r10.m9 = z1;
                if(z) {
                    this.e.W0(null);
                }
                S0 s00 = (S0)this.e.a.a();
                if(s00 != null) {
                    s00.p3();
                }
            }
        }


        @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper$3$1", f = "PostListQuickWriteHelper.kt", i = {}, l = {298}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.r1.f extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final r1 l;

            com.dcinside.app.post.fragments.r1.f(r1 r10, kotlin.coroutines.d d0) {
                this.l = r10;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@y4.m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.r1.f(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.post.fragments.r1.f)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return this.l.M0(this) == object1 ? object1 : kotlin.S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return kotlin.S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }


        @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper$4", f = "PostListQuickWriteHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostListQuickWriteHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostListQuickWriteHelper.kt\ncom/dcinside/app/post/fragments/PostListQuickWriteHelper$4\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1530:1\n257#2,2:1531\n*S KotlinDebug\n*F\n+ 1 PostListQuickWriteHelper.kt\ncom/dcinside/app/post/fragments/PostListQuickWriteHelper$4\n*L\n304#1:1531,2\n*E\n"})
        static final class com.dcinside.app.post.fragments.r1.g extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;

            com.dcinside.app.post.fragments.r1.g(kotlin.coroutines.d d0) {
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m kotlin.coroutines.d d0) {
                com.dcinside.app.post.fragments.r1.g r1$g0 = new com.dcinside.app.post.fragments.r1.g(d0);
                r1$g0.l = view0;
                return r1$g0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                ((View)this.l).setVisibility(8);
                return kotlin.S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper$5", f = "PostListQuickWriteHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final r1 l;

            h(r1 r10, kotlin.coroutines.d d0) {
                this.l = r10;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m kotlin.coroutines.d d0) {
                return new h(this.l, d0).invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.L0();
                return kotlin.S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper$6", f = "PostListQuickWriteHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.r1.i extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final r1 l;

            com.dcinside.app.post.fragments.r1.i(r1 r10, kotlin.coroutines.d d0) {
                this.l = r10;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.r1.i(this.l, d0).invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                static final class com.dcinside.app.post.fragments.r1.i.a extends N implements A3.a {
                    final r1 e;

                    com.dcinside.app.post.fragments.r1.i.a(r1 r10) {
                        this.e = r10;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return kotlin.S0.a;
                    }

                    public final void invoke() {
                        this.e.w1();
                    }
                }

                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                if(this.l.X8 == null && this.l.Z8 == null) {
                    com.dcinside.app.post.fragments.r1.i.a r1$i$a0 = new com.dcinside.app.post.fragments.r1.i.a(this.l);
                    this.l.F0(r1$i$a0);
                    return kotlin.S0.a;
                }
                this.l.w1();
                return kotlin.S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper$7", f = "PostListQuickWriteHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class j extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final r1 l;

            j(r1 r10, kotlin.coroutines.d d0) {
                this.l = r10;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m kotlin.coroutines.d d0) {
                return new j(this.l, d0).invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.v0();
                return kotlin.S0.a;
            }
        }


        static final class k extends N implements Function1 {
            final r1 e;

            k(r1 r10) {
                this.e = r10;
                super(1);
            }

            public final void b(@l rx.g g0) {
                static final class com.dcinside.app.post.fragments.r1.k.a extends N implements Function1 {
                    public static final com.dcinside.app.post.fragments.r1.k.a e;

                    static {
                        com.dcinside.app.post.fragments.r1.k.a.e = new com.dcinside.app.post.fragments.r1.k.a();
                    }

                    com.dcinside.app.post.fragments.r1.k.a() {
                        super(1);
                    }

                    public final s a(V v0) {
                        return (s)v0.e();
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((V)object0));
                    }
                }

                L.p(g0, "ob");
                rx.g g1 = g0.g3((Object object0) -> {
                    L.p(com.dcinside.app.post.fragments.r1.k.a.e, "$tmp0");
                    return (s)com.dcinside.app.post.fragments.r1.k.a.e.invoke(object0);
                });
                L.o(g1, "map(...)");
                this.e.f1(g1);
            }

            // 检测为 Lambda 实现
            private static final s c(Function1 function10, Object object0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((rx.g)object0));
                return kotlin.S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper$9", f = "PostListQuickWriteHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.r1.l extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final r1 l;

            com.dcinside.app.post.fragments.r1.l(r1 r10, kotlin.coroutines.d d0) {
                this.l = r10;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.r1.l(this.l, d0).invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.E1();
                return kotlin.S0.a;
            }
        }


        static final class q extends N implements A3.a {
            final r1 e;

            q(r1 r10) {
                this.e = r10;
                super(0);
            }

            @l
            public final m b() {
                return new m(this.e.j, this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class r extends N implements A3.a {
            final r1 e;

            r(r1 r10) {
                this.e = r10;
                super(0);
            }

            @l
            public final m b() {
                return new m(this.e.q, this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class com.dcinside.app.post.fragments.r1.s extends N implements A3.a {
            final r1 e;

            com.dcinside.app.post.fragments.r1.s(r1 r10) {
                this.e = r10;
                super(0);
            }

            @l
            public final m b() {
                return new m(this.e.r, this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class com.dcinside.app.post.fragments.r1.t extends N implements A3.a {
            final r1 e;

            com.dcinside.app.post.fragments.r1.t(r1 r10) {
                this.e = r10;
                super(0);
            }

            @l
            public final m b() {
                return new m(this.e.d, this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        public static final class z implements TextWatcher {
            final r1 a;

            z(r1 r10) {
                this.a = r10;
                super();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(@y4.m Editable editable0) {
                this.a.A0();
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(@y4.m CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(@y4.m CharSequence charSequence0, int v, int v1, int v2) {
            }
        }

        L.p(s00, "fragment");
        super();
        this.a = new t(s00);
        r2 r20 = s00.d3();
        L.o(r20.P.d, "postListQuickWriteWrap");
        this.c = r20.P.d;
        EditText editText0 = s00.d3().P.D;
        L.o(editText0, "postQuickWriteInputMemo");
        this.d = editText0;
        ImageView imageView0 = s00.d3().P.l;
        L.o(imageView0, "postQuickWriteConfirm");
        this.e = imageView0;
        ImageView imageView1 = s00.d3().P.B;
        L.o(imageView1, "postQuickWriteInputImage");
        this.f = imageView1;
        r2 r21 = s00.d3();
        L.o(r21.P.v, "postQuickWriteGuestWrap");
        this.g = r21.P.v;
        r2 r22 = s00.d3();
        L.o(r22.P.t, "postQuickWriteGuest");
        this.h = r22.P.t;
        LinearLayout linearLayout0 = s00.d3().P.h;
        L.o(linearLayout0, "postQuickWriteCode");
        this.i = linearLayout0;
        ClearableEditText clearableEditText0 = s00.d3().P.j;
        L.o(clearableEditText0, "postQuickWriteCodeInput");
        this.j = clearableEditText0;
        ImageView imageView2 = s00.d3().P.i;
        L.o(imageView2, "postQuickWriteCodeImage");
        this.k = imageView2;
        ImageView imageView3 = s00.d3().P.k;
        L.o(imageView3, "postQuickWriteCodeRefresh");
        this.l = imageView3;
        r2 r23 = s00.d3();
        L.o(r23.P.E, "postQuickWriteInputWrap");
        this.m = r23.P.E;
        r2 r24 = s00.d3();
        L.o(r24.P.s, "postQuickWriteDivider");
        this.n = r24.P.s;
        FrameLayout frameLayout0 = s00.d3().P.J;
        L.o(frameLayout0, "postQuickWriteProgress");
        this.o = frameLayout0;
        r2 r25 = s00.d3();
        L.o(r25.P.C, "postQuickWriteInputImageDelete");
        this.p = r25.P.C;
        r2 r26 = s00.d3();
        L.o(r26.P.H, "postQuickWriteNick");
        this.q = r26.P.H;
        r2 r27 = s00.d3();
        L.o(r27.P.I, "postQuickWritePassword");
        this.r = r27.P.I;
        r2 r28 = s00.d3();
        L.o(r28.P.u, "postQuickWriteGuestAnonymous");
        this.s = r28.P.u;
        ConstraintLayout constraintLayout0 = s00.d3().P.b;
        L.o(constraintLayout0, "postListQuickWriteViewGuide");
        this.t = constraintLayout0;
        r2 r29 = s00.d3();
        L.o(r29.P.c, "postListQuickWriteViewGuideText");
        this.u = r29.P.c;
        ImageView imageView4 = s00.d3().P.F;
        L.o(imageView4, "postQuickWriteMore");
        this.v = imageView4;
        r2 r210 = s00.d3();
        L.o(r210.P.f, "postQuickWriteAddonWrap");
        this.w = r210.P.f;
        DcConPickerView dcConPickerView0 = s00.d3().P.m;
        L.o(dcConPickerView0, "postQuickWriteDcconPicker");
        this.x = dcConPickerView0;
        r2 r211 = s00.d3();
        L.o(r211.P.y, "postQuickWriteHeadList");
        this.y = r211.P.y;
        r2 r212 = s00.d3();
        L.o(r212.P.x, "postQuickWriteHeadDivider");
        this.z = r212.P.x;
        r2 r213 = s00.d3();
        L.o(r213.P.e, "postQuickWriteAddonArrow");
        this.A = r213.P.e;
        r2 r214 = s00.d3();
        L.o(r214.P.w, "postQuickWriteHeadChangedIcon");
        this.B = r214.P.w;
        r2 r215 = s00.d3();
        L.o(r215.P.L, "postQuickWriteWarning");
        this.C = r215.P.L;
        r2 r216 = s00.d3();
        L.o(r216.P.N, "postQuickWriteWarningShort");
        this.D = r216.P.N;
        TextView textView0 = s00.d3().P.M;
        L.o(textView0, "postQuickWriteWarningDetail");
        this.E = textView0;
        r2 r217 = s00.d3();
        L.o(r217.P.z, "postQuickWriteIgnoreHeadToast");
        this.F = r217.P.z;
        r2 r218 = s00.d3();
        L.o(r218.P.p, "postQuickWriteDefNickGuide");
        this.G = r218.P.p;
        r2 r219 = s00.d3();
        L.o(r219.P.q, "postQuickWriteDefNickGuideTitle");
        this.H = r219.P.q;
        r2 r220 = s00.d3();
        L.o(r220.P.n, "postQuickWriteDefGuestNick");
        this.I = r220.P.n;
        r2 r221 = s00.d3();
        L.o(r221.P.o, "postQuickWriteDefGuestWrap");
        this.J = r221.P.o;
        r2 r222 = s00.d3();
        L.o(r222.P.r, "postQuickWriteDeleteDefNick");
        this.K = r222.P.r;
        TextView textView1 = s00.d3().P.K;
        L.o(textView1, "postQuickWriteUseDefNick");
        this.L = textView1;
        String s = B.E.k0();
        this.M = s == null || s.length() <= 0 ? n.a : n.c;
        this.N = true;
        this.U8 = new G(this);
        this.V8 = new z(this);
        this.W8 = true;
        this.c9 = true;
        this.g9 = E.a(new r(this));
        this.h9 = E.a(new com.dcinside.app.post.fragments.r1.s(this));
        this.i9 = E.a(new q(this));
        this.j9 = E.a(new com.dcinside.app.post.fragments.r1.t(this));
        this.l9 = 0;
        com.dcinside.app.post.fragments.r1.e r1$e0 = new com.dcinside.app.post.fragments.r1.e(this);
        this.b = new H(s00.getView(), com.dcinside.app.post.fragments.r1.d.e, r1$e0);
        this.h0();
        this.O = s00.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            Intent intent0 = activityResult0.a();
            if(activityResult0.c() == -1 && intent0 != null) {
                this.j1(intent0);
                return;
            }
            LifecycleCoroutineScope lifecycleCoroutineScope0 = this.U0();
            this.O8 = lifecycleCoroutineScope0 == null ? null : kotlinx.coroutines.k.f(lifecycleCoroutineScope0, h0.c(), null, new com.dcinside.app.post.fragments.r1.f(this, null), 2, null);
        });
        this.n9 = new c();
        this.r0();
        com.dcinside.app.internal.r.M(constraintLayout0, null, new com.dcinside.app.post.fragments.r1.g(null), 1, null);
        com.dcinside.app.internal.r.M(imageView0, null, new h(this, null), 1, null);
        com.dcinside.app.internal.r.M(imageView1, null, new com.dcinside.app.post.fragments.r1.i(this, null), 1, null);
        this.P = new e(linearLayout0, clearableEditText0, imageView2, null, imageView3);
        this.z0();
        editText0.addTextChangedListener(this.U8);
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder().append("퀵쓰기");
        int v = spannableStringBuilder0.length();
        spannableStringBuilder0.append("(줄바꿈 시 제목, 내용 구분)");
        int v1 = spannableStringBuilder0.length();
        spannableStringBuilder0.setSpan(new AlignSuperscriptSpan(0.9f, 0.5f), v, v1, 33);
        editText0.setHint(spannableStringBuilder0);
        int v2 = dl.a.q2().m() ? 0 : 0xFF;
        frameLayout0.setBackgroundColor(Color.argb(120, v2, v2, v2));
        com.dcinside.app.internal.r.M(imageView4, null, new j(this, null), 1, null);
        dcConPickerView0.setOnSelectedListener(new k(this));
        com.dcinside.app.internal.r.M(textView0, null, new com.dcinside.app.post.fragments.r1.l(this, null), 1, null);
        r26.P.H.addTextChangedListener(this.V8);
        com.dcinside.app.internal.r.M(r220.P.n, null, new com.dcinside.app.post.fragments.r1.a(this, null), 1, null);
        com.dcinside.app.internal.r.M(textView1, null, new b(this, null), 1, null);
        com.dcinside.app.internal.r.M(r222.P.r, null, new com.dcinside.app.post.fragments.r1.c(this, null), 1, null);
    }

    private final void A0() {
        CharSequence charSequence0 = this.I.getText();
        int v = 8;
        if(charSequence0 != null && charSequence0.length() != 0) {
            Editable editable0 = this.q.getText();
            String s = editable0 == null ? null : editable0.toString();
            boolean z = s == null || s.length() == 0;
            if(this.W8 && z) {
                this.J.setVisibility(0);
                this.K.setVisibility(8);
                this.I.setVisibility(0);
                this.L.setVisibility(8);
                return;
            }
            this.W8 = false;
            this.J.setVisibility(8);
            TextView textView0 = this.L;
            if(z) {
                v = 0;
            }
            textView0.setVisibility(v);
            return;
        }
        this.J.setVisibility(8);
    }

    private final void A1(int v) {
        S0 s00 = (S0)this.a.a();
        AppCompatActivity appCompatActivity0 = null;
        FragmentActivity fragmentActivity0 = s00 == null ? null : s00.getActivity();
        if(fragmentActivity0 instanceof AppCompatActivity) {
            appCompatActivity0 = (AppCompatActivity)fragmentActivity0;
        }
        if(appCompatActivity0 == null) {
            return;
        }
        com.dcinside.app.internal.c.v(appCompatActivity0, v);
    }

    private final void B0() {
        if(this.h.getVisibility() == 0) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.h.getLayoutParams();
            int v = 0;
            int v1 = Dk.m((viewGroup$LayoutParams0 == null ? 0 : viewGroup$LayoutParams0.height));
            ConstraintLayout constraintLayout0 = this.h;
            ViewGroup.LayoutParams viewGroup$LayoutParams1 = constraintLayout0.getLayoutParams();
            if(viewGroup$LayoutParams1 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            int v2 = v1 >= 10 ? this.l9 : 0;
            ((LayoutParams)viewGroup$LayoutParams1).height = v2;
            if(v2 < 0 || v2 >= 10) {
                this.h.setVisibility(0);
                this.n.setVisibility(0);
            }
            else {
                this.h.setVisibility(8);
                View view0 = this.n;
                if(!this.N) {
                    v = 8;
                }
                view0.setVisibility(v);
            }
            constraintLayout0.setLayoutParams(((LayoutParams)viewGroup$LayoutParams1));
        }
    }

    private final void B1(String s) {
        S0 s00 = (S0)this.a.a();
        AppCompatActivity appCompatActivity0 = null;
        FragmentActivity fragmentActivity0 = s00 == null ? null : s00.getActivity();
        if(fragmentActivity0 instanceof AppCompatActivity) {
            appCompatActivity0 = (AppCompatActivity)fragmentActivity0;
        }
        if(appCompatActivity0 == null) {
            return;
        }
        if(s == null) {
            s = "";
        }
        com.dcinside.app.internal.c.w(appCompatActivity0, s);
    }

    private final void C0() {
        S0 s00 = (S0)this.a.a();
        if(s00 != null && s00.getContext() != null) {
            switch(this.M) {
                case 2: {
                    dl dl0 = dl.a;
                    if(dl0.Y2()) {
                        if(!dl0.z1()) {
                            this.u.setText("상단바를 잡고 위로 올리면\n닉네임을 확인할 수 있습니다.");
                            this.t.setVisibility(0);
                            dl0.p5(true);
                            return;
                        }
                        this.t.setVisibility(8);
                        return;
                    }
                    this.t.setVisibility(8);
                    return;
                }
                case 1: 
                case 3: {
                    dl dl1 = dl.a;
                    if(!dl1.A1()) {
                        this.u.setText("상단바를 잡고 아래로 내리면 닫을 수 있습니다.");
                        this.t.setVisibility(0);
                        dl1.q5(true);
                        return;
                    }
                    this.t.setVisibility(8);
                    break;
                }
            }
        }
    }

    private final void C1() {
        this.K.setVisibility(0);
    }

    private final void D0() {
        String s1;
        S0 s00 = (S0)this.a.a();
        if(s00 != null) {
            r2 r20 = s00.d3();
            if(r20 != null) {
                Context context0 = r20.b().getContext();
                dl dl0 = dl.a;
                if(dl0.f0()) {
                    return;
                }
                if(this.h.getVisibility() == 0) {
                    CharSequence charSequence0 = this.I.getText();
                    if(charSequence0 != null && charSequence0.length() != 0) {
                        String s = B.E.k0();
                        if(s != null && s.length() > 0) {
                            return;
                        }
                        if(this.s.getVisibility() == 0) {
                            return;
                        }
                        CharSequence charSequence1 = this.I.getText();
                        if(charSequence1 == null) {
                            s1 = "";
                        }
                        else {
                            s1 = charSequence1.toString();
                            if(s1 == null) {
                                s1 = "";
                            }
                        }
                        L.m(context0);
                        O2.c(O2.a, context0, s1, this.G, this.H, null, 16, null);
                        dl0.X3(true);
                    }
                }
            }
        }
    }

    private final void D1(String s) {
        g g0 = this.Z;
        if(g0 != null) {
            g0.dismissAllowingStateLoss();
        }
        S0 s00 = (S0)this.a.a();
        g g1 = null;
        FragmentActivity fragmentActivity0 = s00 == null ? null : s00.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        if(appCompatActivity0.isDestroyed() || appCompatActivity0.isFinishing() || appCompatActivity0.getSupportFragmentManager().d1()) {
            return;
        }
        String s1 = this.d9 == null ? null : this.d9.r();
        try {
            V[] arr_v = {r0.a("vpnBanMessage", s), r0.a("vpnBanGalleryId", s1)};
            FragmentManager fragmentManager0 = appCompatActivity0.getSupportFragmentManager();
            L.o(fragmentManager0, "getSupportFragmentManager(...)");
            FragmentFactory fragmentFactory0 = fragmentManager0.G0();
            ClassLoader classLoader0 = g.class.getClassLoader();
            L.m(classLoader0);
            Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.post.fragments.g");
            if(fragment0 != null) {
                ((g)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 2))));
                ((g)fragment0).show(fragmentManager0, "com.dcinside.app.post.fragments.g");
                g1 = (g)fragment0;
            }
        }
        catch(Exception unused_ex) {
        }
        this.Z = g1;
    }

    public final void E0() {
        if(this.c9) {
            this.y1();
            return;
        }
        if(this.X8 == null) {
            this.s0();
        }
    }

    private final void E1() {
        GalleryInfo galleryInfo0 = this.d9;
        if(galleryInfo0 != null) {
            String s = galleryInfo0.r();
            if(s != null) {
                for(Object object0: jl.a.Q0()) {
                    List list0 = ((m0)object0).a();
                    if(list0 == null || !list0.contains(s)) {
                        continue;
                    }
                    goto label_11;
                }
                object0 = null;
            label_11:
                if(((m0)object0) == null) {
                    return;
                }
                String s1 = ((m0)object0).c();
                if(s1 != null && s1.length() != 0) {
                    S0 s00 = (S0)this.a.a();
                    FragmentActivity fragmentActivity0 = s00 == null ? null : s00.getActivity();
                    c0 c00 = fragmentActivity0 instanceof c0 ? ((c0)fragmentActivity0) : null;
                    if(c00 == null) {
                        return;
                    }
                    c00.C5(s1, 0, null);
                }
            }
        }
    }

    private final void F0(A3.a a0) {
        static final class u extends N implements Function1 {
            final r1 e;
            final A3.a f;

            u(r1 r10, A3.a a0) {
                this.e = r10;
                this.f = a0;
                super(1);
            }

            public final void a(com.dcinside.app.model.f0 f00) {
                if(f00.f()) {
                    this.e.e9 = true;
                    this.f.invoke();
                    this.e.w0(false);
                    return;
                }
                this.e.D1(f00.a());
                this.e.w0(false);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.f0)object0));
                return kotlin.S0.a;
            }
        }

        S0 s00 = (S0)this.a.a();
        AppCompatActivity appCompatActivity0 = null;
        FragmentActivity fragmentActivity0 = s00 == null ? null : s00.getActivity();
        if(fragmentActivity0 instanceof AppCompatActivity) {
            appCompatActivity0 = (AppCompatActivity)fragmentActivity0;
        }
        if(appCompatActivity0 == null) {
            return;
        }
        GalleryInfo galleryInfo0 = this.d9;
        if(galleryInfo0 != null && galleryInfo0.q() != com.dcinside.app.type.m.g) {
            if(B.E.k0() != null) {
                a0.invoke();
                return;
            }
            if(this.e9) {
                a0.invoke();
                return;
            }
            this.w0(true);
            this.Q = uk.Qj(galleryInfo0.r()).y5((Object object0) -> {
                L.p(new u(this, a0), "$tmp0");
                new u(this, a0).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(appCompatActivity0, "$activity");
                L.p(this, "this$0");
                com.dcinside.app.perform.e e0 = com.dcinside.app.perform.e.e.a(appCompatActivity0);
                L.m(throwable0);
                e0.q(throwable0);
                this.w0(false);
            });
            return;
        }
        a0.invoke();
    }

    private final void F1(String s) {
        public static final class com.dcinside.app.post.fragments.r1.H extends AnimatorListenerAdapter {
            final TextView a;

            com.dcinside.app.post.fragments.r1.H(TextView textView0) {
                this.a = textView0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(@l Animator animator0) {
                public static final class com.dcinside.app.post.fragments.r1.H.a extends AnimatorListenerAdapter {
                    final TextView a;

                    com.dcinside.app.post.fragments.r1.H.a(TextView textView0) {
                        this.a = textView0;
                        super();
                    }

                    @Override  // android.animation.AnimatorListenerAdapter
                    public void onAnimationEnd(@l Animator animator0) {
                        L.p(animator0, "animation");
                        this.a.setVisibility(8);
                    }
                }

                L.p(animator0, "animation");
                this.a.animate().setStartDelay(2000L).setListener(new com.dcinside.app.post.fragments.r1.H.a(this.a)).alpha(0.0f).setDuration(800L);
            }
        }

        TextView textView0 = this.F;
        ViewPropertyAnimator viewPropertyAnimator0 = textView0.animate();
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.cancel();
        }
        textView0.setText(s);
        textView0.setAlpha(0.0f);
        textView0.setVisibility(0);
        textView0.animate().setStartDelay(0L).alpha(1.0f).setDuration(800L).setListener(new com.dcinside.app.post.fragments.r1.H(textView0));
    }

    // 检测为 Lambda 实现
    private static final void G0(Function1 function10, Object object0) [...]

    private final void G1() {
        this.q.setEnabled(true);
        this.J.setVisibility(8);
        this.L.setVisibility(0);
    }

    // 检测为 Lambda 实现
    private static final void H0(AppCompatActivity appCompatActivity0, r1 r10, Throwable throwable0) [...]

    private final void H1(GalleryInfo galleryInfo0) {
        SpannableStringBuilder spannableStringBuilder0;
        S0 s00 = (S0)this.a.a();
        if(s00 == null) {
            spannableStringBuilder0 = null;
        }
        else {
            Context context0 = s00.getContext();
            if(context0 == null) {
                spannableStringBuilder0 = null;
            }
            else {
                String s = context0.getString(0x7F150836, new Object[]{galleryInfo0.l()});  // string:quick_write_code_guide "코드 %1$d자리 입력"
                L.o(s, "getString(...)");
                L.o("(숫자 0은 없음)", "getString(...)");
                spannableStringBuilder0 = new SpannableStringBuilder();
                spannableStringBuilder0.append(s);
                spannableStringBuilder0.append(' ');
                int v = spannableStringBuilder0.length();
                spannableStringBuilder0.append("(숫자 0은 없음)");
                spannableStringBuilder0.setSpan(new RelativeSizeSpan(0.7f), v, spannableStringBuilder0.length(), 33);
            }
        }
        e e0 = this.P;
        if(e0 != null) {
            e0.d(galleryInfo0, spannableStringBuilder0);
        }
    }

    private final void I0() {
        GalleryInfo galleryInfo0 = this.d9;
        if(galleryInfo0 != null) {
            String s = galleryInfo0.r();
            if(s != null) {
                for(Object object0: jl.a.Q0()) {
                    List list0 = ((m0)object0).a();
                    if(list0 == null || !list0.contains(s)) {
                        continue;
                    }
                    goto label_11;
                }
                object0 = null;
            label_11:
                if(((m0)object0) == null) {
                    this.C.setVisibility(8);
                    return;
                }
                String s1 = ((m0)object0).d();
                String s2 = ((m0)object0).c();
                if(s1 != null && s1.length() > 0 && s2 != null && s2.length() > 0) {
                    this.C.setVisibility(0);
                    this.E.setVisibility(0);
                    Spanned spanned0 = Dl.c(((m0)object0).d());
                    this.D.setText(spanned0);
                    this.E.setText("자세히");
                    return;
                }
                this.C.setVisibility(8);
            }
        }
    }

    private final void I1(float f) {
        ConstraintLayout constraintLayout0 = this.h;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = constraintLayout0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        int v = (int)(((float)((LayoutParams)viewGroup$LayoutParams0).height) + f);
        if(v >= 0 && v < this.l9) {
            ((LayoutParams)viewGroup$LayoutParams0).height = v;
        }
        int v1 = 0;
        if(v < 0 || v >= 10) {
            this.h.setVisibility(0);
            this.n.setVisibility(0);
        }
        else {
            this.h.setVisibility(8);
            View view0 = this.n;
            if(!this.N) {
                v1 = 8;
            }
            view0.setVisibility(v1);
        }
        this.M = this.h.getVisibility() == 0 ? n.a : n.b;
        constraintLayout0.setLayoutParams(((LayoutParams)viewGroup$LayoutParams0));
    }

    public final void J0() {
        if(dl.a.C1() == C.b.c()) {
            this.R8 = false;
            return;
        }
        if(this.R8 && !this.Z0()) {
            S0 s00 = (S0)this.a.a();
            if(s00 != null) {
                s00.J4(false);
            }
            this.x0(true);
            this.R8 = false;
        }
    }

    private final void J1(float f) {
        ConstraintLayout constraintLayout0 = this.m;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = constraintLayout0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        int v = (int)(((float)((LayoutParams)viewGroup$LayoutParams0).height) + f);
        if(v >= 0 && v < this.T0()) {
            ((LayoutParams)viewGroup$LayoutParams0).height = v;
        }
        int v1 = ((LayoutParams)viewGroup$LayoutParams0).height;
        if(v1 < 0 || v1 >= 20) {
            this.m.setVisibility(0);
        }
        else {
            this.m.setVisibility(8);
        }
        constraintLayout0.setLayoutParams(((LayoutParams)viewGroup$LayoutParams0));
    }

    // 去混淆评级： 低(20)
    private final boolean K0(MotionEvent motionEvent0) {
        return this.k9 != null && this.k9.onTouchEvent(motionEvent0) ? true : this.q1(motionEvent0);
    }

    private final void K1() {
        if(this.q.hasFocus()) {
            this.d.requestFocus();
        }
        this.q.setEnabled(false);
        this.J.setVisibility(0);
        this.I.setVisibility(0);
        this.K.setVisibility(8);
        this.L.setVisibility(8);
    }

    private final void L0() {
        String s12;
        File file0;
        String s3;
        boolean z = false;
        if(this.M8 != null && !this.M8.j()) {
            return;
        }
        S0 s00 = (S0)this.a.a();
        if(s00 != null) {
            Context context0 = s00.getContext();
            if(context0 != null) {
                q0 q00 = this.S0();
                String s = (String)q00.a();
                String s1 = (String)q00.b();
                int v = ((Number)q00.c()).intValue();
                if(s.length() == 0) {
                    this.A1(0x7F1507F6);  // string:post_write_content_confirm "내용을 입력해 주세요."
                    return;
                }
                jl jl0 = jl.a;
                if(v < jl0.z0()) {
                    this.B1(context0.getString(0x7F1507F7, new Object[]{jl0.z0()}));  // string:post_write_content_confirm_min "내용을 %1$d자 이상 입력해 주세요."
                    return;
                }
                boolean z1 = this.M != n.c;
                List list0 = null;
                if(z1) {
                    Editable editable0 = this.q.getText();
                    if(editable0 == null) {
                        s3 = null;
                    }
                    else {
                        String s2 = editable0.toString();
                        s3 = s2 == null ? null : v.G5(s2).toString();
                    }
                    if(this.L1()) {
                        CharSequence charSequence0 = this.I.getText();
                        if(charSequence0 == null) {
                            s3 = null;
                        }
                        else {
                            String s4 = charSequence0.toString();
                            s3 = s4 == null ? null : v.G5(s4).toString();
                        }
                    }
                    Editable editable1 = this.r.getText();
                    String s5 = editable1 == null ? null : editable1.toString();
                    m0.a.a a$a0 = m0.a.a;
                    if(a$a0.i(s3)) {
                        this.A1(0x7F150802);  // string:post_write_nick_confirm "닉네임을 입력해 주세요."
                        return;
                    }
                    if((s3 == null ? 0 : s3.length()) < 2) {
                        this.B1(context0.getString(0x7F150803, new Object[]{2}));  // string:post_write_nick_more "닉네임은 최소 %1$d자 이상 입력해 주세요."
                        return;
                    }
                    if(a$a0.i(s5)) {
                        this.A1(0x7F150807);  // string:post_write_pw_confirm "비밀번호를 입력해 주세요."
                        return;
                    }
                    if((s5 == null ? 0 : s5.length()) < 4) {
                        this.B1(context0.getString(0x7F150808, new Object[]{4}));  // string:post_write_pw_more "비밀번호는 최소 %1$d자리 이상 입력해 주세요.\n\n쉬운 비밀번호는 타인이 수정 또는 삭제하기 
                                                                                   // 쉬우니 어려운 비밀번호를 입력해 주세요."
                        return;
                    }
                    e e0 = this.P;
                    if(e0 != null && e0.l() && !e0.h()) {
                        this.A1(0x7F15078D);  // string:please_code_input "코드를 입력해 주세요."
                        return;
                    }
                }
                ArrayList arrayList0 = new ArrayList();
                PostHead postHead0 = this.f9 == null ? this.R0() : this.f9;
                if(this.c9) {
                    file0 = null;
                }
                else {
                    String s6 = this.X8;
                    file0 = s6 == null ? null : new File(s6);
                }
                V v1 = com.dcinside.app.realm.o.h.k((this.d9 == null ? null : this.d9.r()));
                String s7 = (String)v1.a();
                String s8 = (String)v1.b();
                kotlin.jvm.internal.l0.h l0$h0 = new kotlin.jvm.internal.l0.h();
                if(s7.length() > 0) {
                    arrayList0.add(s7);
                }
                if(file0 != null) {
                    arrayList0.add("Dc_App_Img_0");
                }
                else if(this.c9) {
                    Integer integer0 = this.Y8;
                    if(integer0 != null) {
                        String s9 = String.format(Locale.ENGLISH, "Dc_App_zzal_%d", Arrays.copyOf(new Object[]{integer0}, 1));
                        L.o(s9, "format(...)");
                        arrayList0.add(s9);
                        goto label_94;
                    }
                    goto label_85;
                }
                else {
                label_85:
                    if(this.Z8 != null) {
                        Integer integer1 = this.b9;
                        if(integer1 != null) {
                            SparseArray sparseArray0 = new SparseArray();
                            sparseArray0.append(arrayList0.size(), r0.a(integer1.intValue(), null));
                            l0$h0.a = sparseArray0;
                        }
                        String s10 = this.a9;
                        if(s10 != null) {
                            arrayList0.add(s10);
                        }
                    }
                }
            label_94:
                if(s1.length() == 0) {
                    arrayList0.add(" ");
                }
                else {
                    arrayList0.add(s1);
                }
                if(s8.length() > 0) {
                    arrayList0.add(s8);
                }
                int v2 = 0;
                for(Object object0: arrayList0) {
                    v2 += ((String)object0).length();
                }
                if(v2 > 50000) {
                    this.A1(0x7F1507FF);  // string:post_write_length_confirm "글자 수는 50,000자 이하여야 합니다."
                    return;
                }
                com.dcinside.app.model.V v3 = new com.dcinside.app.model.V();
                v3.O(true);
                v3.E((this.d9 == null ? null : this.d9.r()));
                if(z1) {
                    Editable editable2 = this.q.getText();
                    if(editable2 == null) {
                        s12 = null;
                    }
                    else {
                        String s11 = editable2.toString();
                        s12 = s11 == null ? null : v.G5(s11).toString();
                    }
                    if(this.L1()) {
                        CharSequence charSequence1 = this.I.getText();
                        if(charSequence1 == null) {
                            s12 = null;
                        }
                        else {
                            String s13 = charSequence1.toString();
                            s12 = s13 == null ? null : v.G5(s13).toString();
                        }
                    }
                    Editable editable3 = this.r.getText();
                    v3.K((s12 == null ? null : v.G5(s12).toString()));
                    v3.N((editable3 == null ? null : editable3.toString()));
                    e e1 = this.P;
                    String s14 = e1 == null ? null : e1.i();
                    if(!m0.a.a.i(s14)) {
                        v3.z((e1 == null ? null : e1.j()));
                        v3.y(s14);
                    }
                }
                v3.F(postHead0);
                v3.Q(s);
                v3.I(((String[])arrayList0.toArray(new String[0])));
                if(file0 != null) {
                    list0 = kotlin.collections.u.k(file0);
                }
                v3.G(list0);
                v3.B(((SparseArray)l0$h0.a));
                if(this.u0() && this.L1()) {
                    z = true;
                }
                v3.D(z);
                this.r1(v3);
            }
        }
    }

    private final boolean L1() {
        return this.u0() && this.J.getVisibility() == 0;
    }

    private final Object M0(kotlin.coroutines.d d0) {
        @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper", f = "PostListQuickWriteHelper.kt", i = {0}, l = {818, 820}, m = "delayInputExpand", n = {"this"}, s = {"L$0"})
        static final class com.dcinside.app.post.fragments.r1.v extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            final r1 m;
            int n;

            com.dcinside.app.post.fragments.r1.v(r1 r10, kotlin.coroutines.d d0) {
                this.m = r10;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.n |= 0x80000000;
                return this.m.M0(this);
            }
        }


        @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper$delayInputExpand$2", f = "PostListQuickWriteHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class w extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final r1 l;

            w(r1 r10, kotlin.coroutines.d d0) {
                this.l = r10;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@y4.m Object object0, @l kotlin.coroutines.d d0) {
                return new w(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m kotlin.coroutines.d d0) {
                return ((w)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                if(this.l.c1()) {
                    Nk.a.f(this.l.d);
                }
                return kotlin.S0.a;
            }
        }

        r1 r10;
        com.dcinside.app.post.fragments.r1.v r1$v0;
        if(d0 instanceof com.dcinside.app.post.fragments.r1.v) {
            r1$v0 = (com.dcinside.app.post.fragments.r1.v)d0;
            int v = r1$v0.n;
            if((v & 0x80000000) == 0) {
                r1$v0 = new com.dcinside.app.post.fragments.r1.v(this, d0);
            }
            else {
                r1$v0.n = v ^ 0x80000000;
            }
        }
        else {
            r1$v0 = new com.dcinside.app.post.fragments.r1.v(this, d0);
        }
        Object object0 = r1$v0.l;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(r1$v0.n) {
            case 0: {
                f0.n(object0);
                r1$v0.k = this;
                r1$v0.n = 1;
                if(a0.b((Build.VERSION.SDK_INT > 28 ? 100L : 350L), r1$v0) == object1) {
                    return object1;
                }
                r10 = this;
                break;
            }
            case 1: {
                r10 = (r1)r1$v0.k;
                f0.n(object0);
                break;
            }
            case 2: {
                f0.n(object0);
                return kotlin.S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        r10.S8 = false;
        w r1$w0 = new w(r10, null);
        r1$v0.k = null;
        r1$v0.n = 2;
        return kotlinx.coroutines.i.h(h0.e(), r1$w0, r1$v0) == object1 ? object1 : kotlin.S0.a;
    }

    private final m N0() {
        return (m)this.i9.getValue();
    }

    private final m O0() {
        return (m)this.g9.getValue();
    }

    private final m P0() {
        return (m)this.h9.getValue();
    }

    private final m Q0() {
        return (m)this.j9.getValue();
    }

    private final PostHead R0() {
        GalleryInfo galleryInfo0 = this.d9;
        if(galleryInfo0 != null) {
            List list0 = galleryInfo0.w();
            if(list0 != null) {
                Object object0 = null;
                for(Object object1: list0) {
                    if(((PostHead)object1).o()) {
                        object0 = object1;
                        break;
                    }
                }
                if(((PostHead)object0) != null) {
                    return (PostHead)object0;
                }
            }
        }
        GalleryInfo galleryInfo1 = this.d9;
        if(galleryInfo1 != null) {
            List list1 = galleryInfo1.w();
            if(list1 != null) {
                for(Object object2: list1) {
                    if(((PostHead)object2).i() == 0) {
                        return object2;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    private final q0 S0() {
        String s8;
        String s7;
        String s5;
        String s2;
        Editable editable0 = this.d.getText();
        String s = null;
        if(editable0 == null) {
            s2 = null;
        }
        else {
            String s1 = editable0.toString();
            s2 = s1 == null ? null : v.G5(s1).toString();
        }
        String s3 = "";
        if(s2 != null && s2.length() != 0) {
            int v = v.r3(s2, '\n', 0, false, 6, null);
            if(v >= 0 && v < 41) {
                try {
                    String s4 = s2.substring(0, v);
                    L.o(s4, "substring(...)");
                    s5 = null;
                    s5 = v.G5(s4).toString();
                }
                catch(Exception unused_ex) {
                }
                if(s5 == null) {
                    s5 = "";
                }
                if(s5.length() > 0) {
                    try {
                        String s6 = s2.substring(v);
                        L.o(s6, "substring(...)");
                        s = v.G5(s6).toString();
                    }
                    catch(Exception unused_ex) {
                    }
                    if(s != null) {
                        s3 = s;
                    }
                    return new q0(s5, s3, ((int)(s5.length() + s3.length())));
                }
            }
            try {
                s7 = s2.substring(0, Math.min(40, s2.length()));
                L.o(s7, "substring(...)");
            }
            catch(Exception unused_ex) {
                s7 = null;
            }
            if(s7 == null) {
                s8 = "";
            }
            else {
                s8 = v.G5(s7).toString();
                if(s8 == null) {
                    s8 = "";
                }
            }
            if(s8.length() >= 40) {
                try {
                    String s9 = s2.substring(s8.length(), s2.length());
                    L.o(s9, "substring(...)");
                    s = v.G5(s9).toString();
                }
                catch(Exception unused_ex) {
                }
                if(s != null) {
                    s3 = s;
                }
            }
            return new q0(s8, s3, ((int)(s8.length() + s3.length())));
        }
        return new q0("", "", 0);
    }

    // 去混淆评级： 中等(70)
    private final int T0() {
        return 0;
    }

    private final LifecycleCoroutineScope U0() {
        S0 s00 = (S0)this.a.a();
        if(s00 != null) {
            LifecycleOwner lifecycleOwner0 = s00.getViewLifecycleOwner();
            return lifecycleOwner0 == null ? null : LifecycleOwnerKt.a(lifecycleOwner0);
        }
        return null;
    }

    private final String V0() {
        String s1;
        F0 f00 = F0.g4();
        try {
            L.m(f00);
            B b0 = B.E.V(f00);
            if(b0 == null) {
                Editable editable0 = this.q.getText();
                if(editable0 == null) {
                    s1 = null;
                }
                else {
                    String s = editable0.toString();
                    s1 = s == null ? null : v.G5(s).toString();
                }
            }
            else {
                s1 = b0.m6();
            }
            goto label_21;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            kotlin.io.c.a(f00, throwable0);
            throw throwable1;
        }
    label_21:
        kotlin.io.c.a(f00, null);
        return s1;
    }

    private final void W0(EditText editText0) {
        @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper$hideAddonView$1", f = "PostListQuickWriteHelper.kt", i = {}, l = {0x4CB, 0x4CC}, m = "invokeSuspend", n = {}, s = {})
        static final class x extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final EditText l;
            final r1 m;

            x(EditText editText0, r1 r10, kotlin.coroutines.d d0) {
                this.l = editText0;
                this.m = r10;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@y4.m Object object0, @l kotlin.coroutines.d d0) {
                return new x(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m kotlin.coroutines.d d0) {
                return ((x)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper$hideAddonView$1$1", f = "PostListQuickWriteHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.post.fragments.r1.x.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final EditText l;
                    final r1 m;

                    com.dcinside.app.post.fragments.r1.x.a(EditText editText0, r1 r10, kotlin.coroutines.d d0) {
                        this.l = editText0;
                        this.m = r10;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@y4.m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.post.fragments.r1.x.a(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @y4.m
                    public final Object invoke(@l O o0, @y4.m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.post.fragments.r1.x.a)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @y4.m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        Nk.a.f(this.l);
                        this.m.d1();
                        return kotlin.S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        if(a0.b(100L, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return kotlin.S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                com.dcinside.app.post.fragments.r1.x.a r1$x$a0 = new com.dcinside.app.post.fragments.r1.x.a(this.l, this.m, null);
                this.k = 2;
                return kotlinx.coroutines.i.h(h0.e(), r1$x$a0, this) == object1 ? object1 : kotlin.S0.a;
            }
        }

        this.x1(false);
        this.w.setVisibility(8);
        if(editText0 != null) {
            I0 i00 = this.P8;
            I0 i01 = null;
            if(i00 != null) {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
            LifecycleCoroutineScope lifecycleCoroutineScope0 = this.U0();
            if(lifecycleCoroutineScope0 != null) {
                i01 = kotlinx.coroutines.k.f(lifecycleCoroutineScope0, h0.c(), null, new x(editText0, this, null), 2, null);
            }
            this.P8 = i01;
            return;
        }
        this.d1();
    }

    public final void X0() {
        this.W0(this.d);
    }

    private final void Y0(GalleryInfo galleryInfo0, PostHead postHead0) {
        static final class y extends N implements A3.o {
            final r1 e;

            y(r1 r10) {
                this.e = r10;
                super(2);
            }

            public final void a(@l PostHead postHead0, boolean z) {
                L.p(postHead0, "h");
                this.e.m1(postHead0, z);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PostHead)object0), ((Boolean)object1).booleanValue());
                return kotlin.S0.a;
            }
        }

        RecyclerView recyclerView0 = this.y;
        List list0 = com.dcinside.app.realm.q.o.c((galleryInfo0 == null ? null : galleryInfo0.r()));
        S0 s00 = (S0)this.a.a();
        if(s00 != null) {
            Context context0 = s00.getContext();
            if(context0 != null) {
                L.m(context0);
                com.dcinside.app.head.a a0 = com.dcinside.app.head.f.h.b(context0, galleryInfo0);
                a0.F(list0);
                a0.E(new y(this));
                if(postHead0 != null && !a0.I(postHead0)) {
                    this.f9 = null;
                }
                int v = a0.y();
                int v1 = 0;
                NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager(0, false);
                nonPredictiveLayoutManager0.I3(true);
                recyclerView0.setLayoutManager(nonPredictiveLayoutManager0);
                recyclerView0.setAdapter(a0);
                recyclerView0.setVisibility((a0.A() ? 0 : 8));
                if(v >= 0) {
                    recyclerView0.smoothScrollToPosition(v);
                }
                View view0 = this.z;
                if(a0.getItemCount() <= 0) {
                    v1 = 8;
                }
                view0.setVisibility(v1);
            }
        }
    }

    public final boolean Z0() {
        return this.Q8;
    }

    private final boolean a1() {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.m.getLayoutParams();
        return (viewGroup$LayoutParams0 == null ? 0 : viewGroup$LayoutParams0.height) >= this.T0();
    }

    // 去混淆评级： 低(20)
    public final boolean b1() {
        return this.c1() || this.m9;
    }

    public final boolean c1() {
        return this.c.getVisibility() == 0;
    }

    private final void d1() {
        this.v.setActivated(this.Q8);
        int v = 0;
        this.A.setVisibility((this.w.getVisibility() == 0 ? 8 : 0));
        View view0 = this.B;
        if(this.Q8 || (this.f9 == null || L.g(this.f9, this.R0()))) {
            v = 8;
        }
        view0.setVisibility(v);
    }

    private final void e1() {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.m.getLayoutParams();
        boolean z = false;
        if((viewGroup$LayoutParams0 == null ? 0 : viewGroup$LayoutParams0.height) != -2) {
            ConstraintLayout constraintLayout0 = this.m;
            ViewGroup.LayoutParams viewGroup$LayoutParams1 = constraintLayout0.getLayoutParams();
            if(viewGroup$LayoutParams1 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ((LayoutParams)viewGroup$LayoutParams1).height = this.T0();
            constraintLayout0.setLayoutParams(((LayoutParams)viewGroup$LayoutParams1));
        }
        ImageView imageView0 = this.e;
        if(((Number)this.S0().h()).intValue() >= jl.a.z0()) {
            z = true;
        }
        imageView0.setSelected(z);
    }

    private final void f1(rx.g g0) {
        static final class A extends N implements Function1 {
            final r1 e;

            A(r1 r10) {
                this.e = r10;
                super(1);
            }

            public final void a(s s0) {
                String s1 = null;
                this.e.X8 = null;
                this.e.Y8 = null;
                this.e.c9 = false;
                this.e.a9 = null;
                this.e.Z8 = s0;
                this.e.b9 = s0.a();
                dl dl0 = dl.a;
                String s2 = B.E.c0();
                if(s2 == null) {
                    s2 = "";
                }
                long v = dl0.J(s2);
                if(!dl0.K2() || v <= System.currentTimeMillis()) {
                    s1 = s0.c();
                }
                else {
                    String s3 = s0.c();
                    if(s3 != null) {
                        org.jsoup.nodes.f f0 = Dl.A(s3);
                        if(f0 != null) {
                            org.jsoup.select.e e0 = f0.I1("img");
                            if(e0 != null) {
                                org.jsoup.nodes.o o0 = e0.u();
                                if(o0 != null) {
                                    L.m(o0);
                                    o0.z0("bigdccon");
                                    s1 = o0.S();
                                }
                            }
                        }
                    }
                }
                this.e.a9 = s1;
                this.e.s0();
                this.e.v0();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((s)object0));
                return kotlin.S0.a;
            }
        }

        rx.o o0 = this.X;
        if(o0 != null) {
            o0.l();
        }
        this.X = g0.y5((Object object0) -> {
            L.p(new A(this), "$tmp0");
            new A(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            S0 s00 = (S0)this.a.a();
            if(s00 != null) {
                Context context0 = s00.getContext();
                if(context0 != null) {
                    Dl.G(context0, throwable0.getMessage());
                }
            }
        });
    }

    // 检测为 Lambda 实现
    private static final void g1(Function1 function10, Object object0) [...]

    @SuppressLint({"ClickableViewAccessibility"})
    private final void h0() {
        @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper$addTouchEvent$1", f = "PostListQuickWriteHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.r1.p extends kotlin.coroutines.jvm.internal.o implements p {
            int k;

            com.dcinside.app.post.fragments.r1.p(kotlin.coroutines.d d0) {
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.r1.p(d0).invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return kotlin.S0.a;
            }
        }

        S0 s00 = (S0)this.a.a();
        if(s00 != null) {
            Context context0 = s00.getContext();
            if(context0 != null) {
                com.dcinside.app.post.fragments.r1.p r1$p0 = new com.dcinside.app.post.fragments.r1.p(null);
                com.dcinside.app.internal.r.M(this.c, null, r1$p0, 1, null);
                this.k9 = new GestureDetector(context0, this);
                this.c.setClickable(true);
                q1 q10 = (View view0, MotionEvent motionEvent0) -> {
                    L.p(this, "this$0");
                    L.m(motionEvent0);
                    return this.K0(motionEvent0);
                };
                this.c.setOnTouchListener(q10);
                this.d.setClickable(true);
                this.e.setClickable(true);
                this.f.setClickable(true);
                this.j.setClickable(true);
                this.k.setClickable(true);
                this.q.setClickable(true);
                this.r.setClickable(true);
                b1 b10 = (View view0, MotionEvent motionEvent0) -> {
                    L.p(this, "this$0");
                    m r1$m0 = this.Q0();
                    L.m(motionEvent0);
                    r1$m0.a(motionEvent0);
                    return this.K0(motionEvent0);
                };
                this.d.setOnTouchListener(b10);
                c1 c10 = (View view0, MotionEvent motionEvent0) -> {
                    L.p(this, "this$0");
                    L.m(motionEvent0);
                    return this.K0(motionEvent0);
                };
                this.e.setOnTouchListener(c10);
                d1 d10 = (View view0, MotionEvent motionEvent0) -> {
                    L.p(this, "this$0");
                    L.m(motionEvent0);
                    return this.K0(motionEvent0);
                };
                this.f.setOnTouchListener(d10);
                e1 e10 = (View view0, MotionEvent motionEvent0) -> {
                    L.p(this, "this$0");
                    m r1$m0 = this.N0();
                    L.m(motionEvent0);
                    r1$m0.a(motionEvent0);
                    return this.K0(motionEvent0);
                };
                this.j.setOnTouchListener(e10);
                f1 f10 = (View view0, MotionEvent motionEvent0) -> {
                    L.p(this, "this$0");
                    L.m(motionEvent0);
                    return this.K0(motionEvent0);
                };
                this.k.setOnTouchListener(f10);
                g1 g10 = (View view0, MotionEvent motionEvent0) -> {
                    L.p(this, "this$0");
                    m r1$m0 = this.O0();
                    L.m(motionEvent0);
                    r1$m0.a(motionEvent0);
                    return this.K0(motionEvent0);
                };
                this.q.setOnTouchListener(g10);
                h1 h10 = (View view0, MotionEvent motionEvent0) -> {
                    L.p(this, "this$0");
                    m r1$m0 = this.P0();
                    L.m(motionEvent0);
                    r1$m0.a(motionEvent0);
                    return this.K0(motionEvent0);
                };
                this.r.setOnTouchListener(h10);
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void h1(r1 r10, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final boolean i0(r1 r10, View view0, MotionEvent motionEvent0) [...]

    public final void i1(@l GalleryInfo galleryInfo0) {
        L.p(galleryInfo0, "info");
        this.N = galleryInfo0.g();
        this.H1(galleryInfo0);
        String s = galleryInfo0.c();
        if(s == null || s.length() == 0) {
            this.q.setEnabled(true);
            this.q.setText(null);
            this.s.setVisibility(8);
            this.r0();
        }
        else {
            this.q.setEnabled(false);
            this.q.setText(galleryInfo0.c());
            this.s.setVisibility(0);
        }
        this.t0();
        if(!L.g(this.d9, galleryInfo0)) {
            this.d9 = galleryInfo0;
            this.Y0(galleryInfo0, this.f9);
        }
        this.E0();
        this.I0();
        this.q0();
    }

    // 检测为 Lambda 实现
    private static final boolean j0(r1 r10, View view0, MotionEvent motionEvent0) [...]

    private final void j1(Intent intent0) {
        @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper$onImageSelected$1", f = "PostListQuickWriteHelper.kt", i = {}, l = {0x2F9, 0x2FA}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.r1.B extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final Context l;
            final String m;
            final String n;
            final long o;
            final r1 p;

            com.dcinside.app.post.fragments.r1.B(Context context0, String s, String s1, long v, r1 r10, kotlin.coroutines.d d0) {
                this.l = context0;
                this.m = s;
                this.n = s1;
                this.o = v;
                this.p = r10;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@y4.m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.r1.B(this.l, this.m, this.n, this.o, this.p, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.post.fragments.r1.B)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper$onImageSelected$1$1", f = "PostListQuickWriteHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.post.fragments.r1.B.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final r1 l;
                    final String m;

                    com.dcinside.app.post.fragments.r1.B.a(r1 r10, String s, kotlin.coroutines.d d0) {
                        this.l = r10;
                        this.m = s;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@y4.m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.post.fragments.r1.B.a(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @y4.m
                    public final Object invoke(@l O o0, @y4.m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.post.fragments.r1.B.a)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @y4.m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.X8 = this.m;
                        this.l.c9 = false;
                        this.l.s0();
                        return kotlin.S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        L.o(this.m, "$path");
                        this.k = 1;
                        object0 = com.dcinside.app.write.d.a.b(this.l, this.m, true, this.n, this.o, this.p.o, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return kotlin.S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(((String)object0) == null) {
                    return kotlin.S0.a;
                }
                com.dcinside.app.post.fragments.r1.B.a r1$B$a0 = new com.dcinside.app.post.fragments.r1.B.a(this.p, ((String)object0), null);
                this.k = 2;
                return kotlinx.coroutines.i.h(h0.e(), r1$B$a0, this) == object1 ? object1 : kotlin.S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper$onImageSelected$2", f = "PostListQuickWriteHelper.kt", i = {}, l = {0x301}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.r1.C extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final r1 l;

            com.dcinside.app.post.fragments.r1.C(r1 r10, kotlin.coroutines.d d0) {
                this.l = r10;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@y4.m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.r1.C(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.post.fragments.r1.C)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return this.l.M0(this) == object1 ? object1 : kotlin.S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return kotlin.S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        S0 s00 = (S0)this.a.a();
        if(s00 != null) {
            Context context0 = s00.getContext();
            if(context0 != null) {
                ArrayList arrayList0 = intent0.getStringArrayListExtra("intent_path");
                if(arrayList0 == null) {
                    return;
                }
                if(arrayList0.size() > 0) {
                    Object object0 = arrayList0.get(0);
                    if(((String)object0) != null && ((String)object0).length() != 0) {
                        String s = this.V0();
                        if(s == null) {
                            s = "";
                        }
                        long v = this.d9 == null ? 0L : this.d9.D();
                        LifecycleCoroutineScope lifecycleCoroutineScope0 = this.U0();
                        I0 i00 = null;
                        this.N8 = lifecycleCoroutineScope0 == null ? null : kotlinx.coroutines.k.f(lifecycleCoroutineScope0, h0.c(), null, new com.dcinside.app.post.fragments.r1.B(context0, ((String)object0), s, v, this, null), 2, null);
                        LifecycleCoroutineScope lifecycleCoroutineScope1 = this.U0();
                        if(lifecycleCoroutineScope1 != null) {
                            i00 = kotlinx.coroutines.k.f(lifecycleCoroutineScope1, h0.c(), null, new com.dcinside.app.post.fragments.r1.C(this, null), 2, null);
                        }
                        this.O8 = i00;
                        return;
                    }
                    Dl.D(context0, 0x7F1504CE);  // string:image_load_fail "이미지를 불러올 수 없습니다."
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static final boolean k0(r1 r10, View view0, MotionEvent motionEvent0) [...]

    public final void k1() {
        String s = B.E.k0();
        if(s == null || s.length() <= 0) {
            this.M = n.a;
            this.z0();
        }
        else {
            this.M = n.c;
        }
        this.t0();
        if(this.M != n.c && this.N) {
            e e0 = this.P;
            if(e0 != null) {
                e0.n(true);
            }
        }
        GalleryInfo galleryInfo0 = this.d9;
        if(galleryInfo0 != null) {
            this.H1(galleryInfo0);
        }
        this.x.l0();
        this.Y0(this.d9, this.f9);
    }

    // 检测为 Lambda 实现
    private static final boolean l0(r1 r10, View view0, MotionEvent motionEvent0) [...]

    public final void l1() {
        if(this.c1()) {
            this.R8 = true;
        }
    }

    // 检测为 Lambda 实现
    private static final boolean m0(r1 r10, View view0, MotionEvent motionEvent0) [...]

    private final void m1(PostHead postHead0, boolean z) {
        this.f9 = postHead0;
        this.v0();
        if(z) {
            S0 s00 = (S0)this.a.a();
            if(s00 != null) {
                Context context0 = s00.getContext();
                if(context0 != null) {
                    String s = postHead0.m();
                    if(s == null) {
                        return;
                    }
                    String s1 = context0.getString(0x7F1507B8, new Object[]{s});  // string:post_head_ignore_name "[%s] 말머리는 비노출 설정 상태로 글 등록 후 목록에서는 확인할 수 없습니다."
                    L.o(s1, "getString(...)");
                    this.F1(s1);
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static final boolean n0(r1 r10, View view0, MotionEvent motionEvent0) [...]

    private final void n1(int v, String s, boolean z) {
        String s2;
        dl dl0 = dl.a;
        if(dl0.y1() == com.dcinside.app.type.B.c.c()) {
            S0 s00 = (S0)this.a.a();
            if(s00 != null) {
                s00.k4(v, s, z);
            }
        }
        if(dl0.C1() == C.b.c()) {
            this.x0(false);
        }
        D4 d40 = null;
        if(this.M != n.c) {
            Editable editable0 = this.q.getText();
            if(editable0 == null) {
                s2 = null;
            }
            else {
                String s1 = editable0.toString();
                s2 = s1 == null ? null : v.G5(s1).toString();
            }
            Editable editable1 = this.r.getText();
            String s3 = editable1 == null ? null : editable1.toString();
            GalleryInfo galleryInfo0 = this.d9;
            if(galleryInfo0 == null) {
            label_26:
                if(this.L1()) {
                    s2 = null;
                }
            }
            else {
                String s4 = galleryInfo0.c();
                if(s4 != null && s4.length() > 0) {
                    s2 = null;
                    goto label_28;
                }
                goto label_26;
            }
        label_28:
            com.dcinside.app.realm.t.i.c(s2, s3);
            if(this.u0()) {
                dl0.m6(this.L1());
            }
            this.W8 = true;
        }
        this.d.setText(null);
        this.Z8 = null;
        this.f9 = null;
        this.c9 = true;
        this.y1();
        e e0 = this.P;
        if(e0 != null) {
            e0.n(true);
        }
        dl0.p6(true);
        this.r0();
        this.z0();
        this.d1();
        if(dl0.B1()) {
            S0 s01 = (S0)this.a.a();
            if(s01 != null) {
                Context context0 = s01.getContext();
                if(context0 != null) {
                    Dl.D(context0, 0x7F15082F);  // string:quick_post_write_success "글 등록 완료"
                }
            }
            return;
        }
        D4 d41 = this.Y;
        if(d41 != null) {
            d41.dismissAllowingStateLoss();
        }
        S0 s02 = (S0)this.a.a();
        if(s02 != null) {
            V[] arr_v = {r0.a("com.dcinside.app.post.QuickWriteSettingDialogFragment.EXTRA_IS_MANAGER_HEAD", Boolean.valueOf(z))};
            FragmentManager fragmentManager0 = s02.getChildFragmentManager();
            L.o(fragmentManager0, "getChildFragmentManager(...)");
            FragmentFactory fragmentFactory0 = fragmentManager0.G0();
            ClassLoader classLoader0 = D4.class.getClassLoader();
            L.m(classLoader0);
            Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.post.fragments.D4");
            if(fragment0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.post.fragments.QuickWriteSettingDialogFragment");
            }
            d40 = (D4)fragment0;
            d40.setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 1))));
            d40.show(fragmentManager0, "com.dcinside.app.post.fragments.D4");
        }
        this.Y = d40;
        dl0.r5(true);
    }

    // 检测为 Lambda 实现
    private static final boolean o0(r1 r10, View view0, MotionEvent motionEvent0) [...]

    private final void o1(float f) {
        switch(this.M) {
            case 1: 
            case 2: {
                if(this.M == n.a) {
                    this.I1(f);
                    return;
                }
                if(this.a1() && f > 0.0f) {
                    this.I1(f);
                    return;
                }
                this.J1(f);
                return;
            }
            case 3: {
                this.J1(f);
            }
        }
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public boolean onFling(@y4.m MotionEvent motionEvent0, @l MotionEvent motionEvent1, float f, float f1) {
        L.p(motionEvent1, "e2");
        float f2 = Math.abs(f1);
        switch(this.M) {
            case 1: {
                if(f1 > 0.0f && f2 >= ((float)this.l9)) {
                    this.x0(false);
                    return true;
                }
                break;
            }
            case 2: 
            case 3: {
                break;
            }
            default: {
                throw new J();
            }
        }
        return false;
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionDenied(@y4.m PermissionDeniedResponse permissionDeniedResponse0) {
        S0 s00 = (S0)this.a.a();
        if(s00 != null) {
            Context context0 = s00.getContext();
            if(context0 != null) {
                Dl.D(context0, cl.b((permissionDeniedResponse0 == null ? null : permissionDeniedResponse0.getPermissionName())));
            }
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionGranted(@y4.m PermissionGrantedResponse permissionGrantedResponse0) {
        this.w1();
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionRationaleShouldBeShown(@l PermissionRequest permissionRequest0, @y4.m PermissionToken permissionToken0) {
        L.p(permissionRequest0, "permission");
        if(permissionToken0 != null) {
            permissionToken0.continuePermissionRequest();
        }
    }

    // 检测为 Lambda 实现
    private static final boolean p0(r1 r10, View view0, MotionEvent motionEvent0) [...]

    private final void p1() {
        n r1$n0;
        switch(this.M) {
            case 1: {
                this.B0();
                this.M = this.h.getVisibility() == 0 ? n.a : n.b;
                return;
            }
            case 2: {
                this.B0();
                this.y0();
                if(this.h.getVisibility() == 0) {
                    r1$n0 = n.a;
                }
                else {
                    if(this.m.getVisibility() != 0) {
                        this.x0(false);
                    }
                    r1$n0 = n.b;
                }
                this.M = r1$n0;
                return;
            }
            case 3: {
                this.B0();
                this.y0();
                if(this.m.getVisibility() == 0) {
                    return;
                }
                this.x0(false);
            }
        }
    }

    private final void q0() {
        this.I.setText((this.d9 == null ? null : this.d9.t()));
    }

    private final boolean q1(MotionEvent motionEvent0) {
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                this.T8 = motionEvent0.getRawY();
                return false;
            }
            case 2: {
                float f = this.T8;
                float f1 = motionEvent0.getRawY();
                this.T8 = motionEvent0.getRawY();
                this.o1(f - f1);
                return false;
            }
            case 1: 
            case 3: {
                this.p1();
                return false;
            }
            default: {
                return false;
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void r(r1 r10, ActivityResult activityResult0) [...]

    public final void r0() {
        com.dcinside.app.realm.t t0 = com.dcinside.app.realm.t.i.a();
        if(t0.R5()) {
            String s = t0.S5();
            this.q.setText(s);
            String s1 = t0.T5();
            this.r.setText(s1);
            this.q.setEnabled(false);
            this.r.setEnabled(false);
        }
        else {
            if(this.s.getVisibility() != 0) {
                if(!dl.a.A2() || !this.u0()) {
                    String s2 = t0.U5();
                    this.q.setText(s2);
                    this.q.setEnabled(true);
                }
                else {
                    this.q.setText(null);
                }
            }
            String s3 = t0.V5();
            this.r.setText(s3);
        }
        e e0 = this.P;
        if(e0 != null) {
            e0.n(true);
        }
    }

    private final void r1(com.dcinside.app.model.V v0) {
        @s0({"SMAP\nPostListQuickWriteHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostListQuickWriteHelper.kt\ncom/dcinside/app/post/fragments/PostListQuickWriteHelper$requestQuickWrite$3\n+ 2 ModelExtension.kt\ncom/dcinside/app/internal/ModelExtensionKt\n*L\n1#1,1530:1\n9#2:1531\n*S KotlinDebug\n*F\n+ 1 PostListQuickWriteHelper.kt\ncom/dcinside/app/post/fragments/PostListQuickWriteHelper$requestQuickWrite$3\n*L\n1034#1:1531\n*E\n"})
        static final class com.dcinside.app.post.fragments.r1.D extends N implements Function1 {
            final com.dcinside.app.model.V e;
            final r1 f;

            com.dcinside.app.post.fragments.r1.D(com.dcinside.app.model.V v0, r1 r10) {
                this.e = v0;
                this.f = r10;
                super(1);
            }

            public final void a(com.dcinside.app.model.f0 f00) {
                static final class com.dcinside.app.post.fragments.r1.D.a extends N implements Function1 {
                    public static final com.dcinside.app.post.fragments.r1.D.a e;

                    static {
                        com.dcinside.app.post.fragments.r1.D.a.e = new com.dcinside.app.post.fragments.r1.D.a();
                    }

                    com.dcinside.app.post.fragments.r1.D.a() {
                        super(1);
                    }

                    public final void a(@l com.dcinside.app.realm.f0 f00) {
                        L.p(f00, "it");
                        f00.z6(true);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((com.dcinside.app.realm.f0)object0));
                        return kotlin.S0.a;
                    }
                }

                int v;
                String s = f00.a();
                boolean z = false;
                if(s == null) {
                    v = 0;
                }
                else {
                    Integer integer0 = v.b1(s);
                    v = integer0 == null ? 0 : ((int)integer0);
                }
                String s1 = this.e.h();
                if(s1 == null) {
                    s1 = "";
                }
                PostHead postHead0 = this.e.i();
                if(postHead0 != null && postHead0.i() == 999 && postHead0.l() == 9) {
                    z = true;
                }
                com.dcinside.app.realm.helper.a.a.s(s1, v, com.dcinside.app.post.fragments.r1.D.a.e);
                this.f.n1(v, s1, z);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.f0)object0));
                return kotlin.S0.a;
            }
        }

        this.M8 = uk.mG(v0).R1(() -> {
            L.p(this, "this$0");
            this.w0(true);
        }).T1(() -> {
            L.p(this, "this$0");
            this.w0(false);
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.post.fragments.r1.D(v0, this), "$tmp0");
            new com.dcinside.app.post.fragments.r1.D(v0, this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            if(throwable0 instanceof com.dcinside.app.http.q) {
                this.D1(throwable0.getMessage());
                return;
            }
            this.B1(throwable0.getMessage());
        });
    }

    @Override  // com.dcinside.app.base.i
    public void release() {
        this.a = new t(null, 1, null);
        this.d.removeTextChangedListener(this.U8);
        this.y.clearOnScrollListeners();
        this.q.removeTextChangedListener(this.V8);
        D4 d40 = this.Y;
        if(d40 != null) {
            d40.dismissAllowingStateLoss();
        }
        this.Y = null;
        rx.o o0 = this.Q;
        if(o0 != null) {
            o0.l();
        }
        this.Q = null;
        ActivityResultLauncher activityResultLauncher0 = this.O;
        if(activityResultLauncher0 != null) {
            activityResultLauncher0.d();
        }
        this.b.n();
        I0 i00 = this.N8;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.N8 = null;
        I0 i01 = this.O8;
        if(i01 != null) {
            kotlinx.coroutines.I0.a.b(i01, null, 1, null);
        }
        this.O8 = null;
        rx.o o1 = this.X;
        if(o1 != null) {
            o1.l();
        }
        this.X = null;
        I0 i02 = this.P8;
        if(i02 != null) {
            kotlinx.coroutines.I0.a.b(i02, null, 1, null);
        }
        this.P8 = null;
        c c0 = this.n9;
        if(c0 != null) {
            c0.b();
        }
        this.n9 = null;
    }

    private final void s0() {
        ImageView imageView0 = this.f;
        if(this.X8 != null) {
            com.dcinside.app.glide.d d0 = com.dcinside.app.glide.a.l(imageView0);
            L.o(d0, "with(...)");
            com.bumptech.glide.load.h h0 = new com.bumptech.glide.load.h(new com.bumptech.glide.load.n[]{new com.bumptech.glide.load.resource.bitmap.n(), new com.bumptech.glide.load.resource.bitmap.L(0)});
            if(this.X8 == null || !v.N1(this.X8, ".webp", false, 2, null)) {
                d0.t0(this.X8).V2(h0).q1(imageView0);
            }
            else {
                com.dcinside.app.glide.c c0 = d0.t0(this.X8).V2(h0);
                com.bumptech.glide.integration.webp.decoder.o o0 = new com.bumptech.glide.integration.webp.decoder.o(h0);
                c0.F2(com.bumptech.glide.integration.webp.decoder.l.class, o0).q1(imageView0);
            }
            ImageViewCompat.c(imageView0, null);
            this.p.setVisibility(0);
            return;
        }
        if(this.Z8 != null) {
            com.dcinside.app.glide.d d1 = com.dcinside.app.glide.a.l(imageView0);
            L.o(d1, "with(...)");
            com.bumptech.glide.load.h h1 = new com.bumptech.glide.load.h(new com.bumptech.glide.load.n[]{new com.bumptech.glide.load.resource.bitmap.n(), new com.bumptech.glide.load.resource.bitmap.L(0)});
            s s0 = this.Z8;
            L.m(s0);
            d1.t0(s0.d()).V2(h1).q1(imageView0);
            ImageViewCompat.c(imageView0, null);
            this.p.setVisibility(0);
            return;
        }
        imageView0.setImageResource(0x7F080348);  // drawable:ico_quick_write_image
        this.p.setVisibility(8);
        Context context0 = imageView0.getContext();
        L.o(context0, "getContext(...)");
        ImageViewCompat.c(imageView0, vk.c(context0, 0x7F04032A));  // attr:icTintNormal
    }

    // 检测为 Lambda 实现
    private static final void s1(r1 r10) [...]

    private final void t0() {
        int v = 8;
        switch(this.M) {
            case 1: {
                this.h.setVisibility(0);
                this.n.setVisibility(0);
                this.i.setVisibility(0);
                break;
            }
            case 2: {
                this.h.setVisibility(8);
                this.n.setVisibility((this.N ? 0 : 8));
                this.i.setVisibility(0);
                break;
            }
            case 3: {
                this.h.setVisibility(8);
                this.n.setVisibility(8);
                this.i.setVisibility(8);
            }
        }
        this.g.setVisibility((this.M == n.c ? 0 : 8));
        LinearLayout linearLayout0 = this.i;
        if(this.N && this.M != n.c) {
            v = 0;
        }
        linearLayout0.setVisibility(v);
    }

    // 检测为 Lambda 实现
    private static final void t1(r1 r10) [...]

    private final boolean u0() {
        CharSequence charSequence0 = this.I.getText();
        L.o(charSequence0, "getText(...)");
        return charSequence0.length() > 0;
    }

    // 检测为 Lambda 实现
    private static final void u1(Function1 function10, Object object0) [...]

    private final void v0() {
        if(!this.c1()) {
            return;
        }
        if(this.Q8) {
            this.X0();
            return;
        }
        this.z1();
    }

    // 检测为 Lambda 实现
    private static final void v1(r1 r10, Throwable throwable0) [...]

    private final void w0(boolean z) {
        this.o.setVisibility((z ? 0 : 8));
    }

    private final void w1() {
        AppCompatActivity appCompatActivity0 = null;
        if(this.X8 == null && this.Z8 == null) {
            S0 s00 = (S0)this.a.a();
            FragmentActivity fragmentActivity0 = s00 == null ? null : s00.getActivity();
            if(fragmentActivity0 instanceof AppCompatActivity) {
                appCompatActivity0 = (AppCompatActivity)fragmentActivity0;
            }
            if(appCompatActivity0 == null) {
                return;
            }
            if(cl.i(appCompatActivity0, this)) {
                return;
            }
            com.dcinside.app.album.h.c(appCompatActivity0).f(1).e("이미지를 선택해주세요.").c(1010);
            Intent intent0 = new Intent(appCompatActivity0, AlbumActivity.class);
            intent0.putExtra("extra_user_nickname", this.V0());
            this.S8 = true;
            ActivityResultLauncher activityResultLauncher0 = this.O;
            if(activityResultLauncher0 != null) {
                activityResultLauncher0.b(intent0);
            }
            return;
        }
        this.X8 = null;
        this.Y8 = null;
        this.Z8 = null;
        this.b9 = null;
        this.s0();
        this.c9 = true;
    }

    public final void x0(boolean z) {
        this.c.setVisibility((z ? 0 : 8));
        ConstraintLayout constraintLayout0 = this.m;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = constraintLayout0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ((LayoutParams)viewGroup$LayoutParams0).height = this.T0();
        constraintLayout0.setLayoutParams(((LayoutParams)viewGroup$LayoutParams0));
        this.m.setVisibility(0);
        S0 s00 = (S0)this.a.a();
        if(s00 == null) {
            return;
        }
        if(z) {
            Nk.a.f(this.d);
            this.C0();
            s00.W2(false);
            this.D0();
        }
        else {
            Nk.a.d(s00);
            Context context0 = s00.getContext();
            if(context0 != null) {
                com.dcinside.app.rx.bus.c.a(context0, new com.dcinside.app.rx.bus.B(true));
            }
            if(!this.b.j()) {
                s00.W2(true);
            }
            this.W0(null);
        }
        S0 s01 = (S0)this.a.a();
        if(s01 != null) {
            s01.p3();
        }
    }

    private final void x1(boolean z) {
        if(this.Q8 != z) {
            this.Q8 = z;
            S0 s00 = (S0)this.a.a();
            Context context0 = s00 == null ? null : s00.getContext();
            if(context0 != null) {
                com.dcinside.app.rx.bus.c.a(context0, new Z());
            }
        }
    }

    private final void y0() {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.m.getLayoutParams();
        int v = viewGroup$LayoutParams0 == null ? 0 : viewGroup$LayoutParams0.height;
        ConstraintLayout constraintLayout0 = this.m;
        ViewGroup.LayoutParams viewGroup$LayoutParams1 = constraintLayout0.getLayoutParams();
        if(viewGroup$LayoutParams1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        int v1 = (int)(((float)this.T0()) * 0.7f);
        int v2 = v == -2 || v >= v1 ? this.T0() : 0;
        ((LayoutParams)viewGroup$LayoutParams1).height = v2;
        if(v2 < 0 || v2 >= v1) {
            this.m.setVisibility(0);
        }
        else {
            this.m.setVisibility(8);
        }
        constraintLayout0.setLayoutParams(((LayoutParams)viewGroup$LayoutParams1));
    }

    private final void y1() {
        @s0({"SMAP\nPostListQuickWriteHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostListQuickWriteHelper.kt\ncom/dcinside/app/post/fragments/PostListQuickWriteHelper$setDefaultImages$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1530:1\n1#2:1531\n*E\n"})
        static final class com.dcinside.app.post.fragments.r1.E extends N implements Function1 {
            final r1 e;

            com.dcinside.app.post.fragments.r1.E(r1 r10) {
                this.e = r10;
                super(1);
            }

            public final void a(@y4.m AutoImageData autoImageData0) {
                AutoImage autoImage0;
                Object object0 = null;
                if(autoImageData0 != null && autoImageData0.v()) {
                    if(autoImageData0.w()) {
                        this.e.X8 = null;
                        this.e.Y8 = null;
                        autoImage0 = (AutoImage)kotlin.collections.u.M4(autoImageData0.o(), kotlin.random.f.a);
                    }
                    else {
                        for(Object object1: autoImageData0.o()) {
                            if(((AutoImage)object1).l() == autoImageData0.t()) {
                                object0 = object1;
                                break;
                            }
                            if(false) {
                                break;
                            }
                        }
                        autoImage0 = ((AutoImage)object0) == null ? ((AutoImage)kotlin.collections.u.G2(autoImageData0.o())) : ((AutoImage)object0);
                    }
                    if(autoImage0 != null && this.e.X8 == null) {
                        this.e.X8 = "";
                        this.e.Y8 = autoImage0.l();
                    }
                    this.e.s0();
                    return;
                }
                this.e.s0();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((AutoImageData)object0));
                return kotlin.S0.a;
            }
        }

        String s;
        S0 s00 = (S0)this.a.a();
        c0 c00 = null;
        FragmentActivity fragmentActivity0 = s00 == null ? null : s00.getActivity();
        if(fragmentActivity0 instanceof c0) {
            c00 = (c0)fragmentActivity0;
        }
        if(c00 == null) {
            return;
        }
        GalleryInfo galleryInfo0 = this.d9;
        if(galleryInfo0 == null) {
            s = "";
        }
        else {
            s = galleryInfo0.r();
            if(s == null) {
                s = "";
            }
        }
        c0.j5(c00, s, null, new com.dcinside.app.post.fragments.r1.E(this), 2, null);
    }

    public final void z0() {
        Editable editable0 = this.q.getText();
        String s = null;
        String s1 = editable0 == null ? null : editable0.toString();
        Editable editable1 = this.r.getText();
        if(editable1 != null) {
            s = editable1.toString();
        }
        int v = 0;
        if(this.M != n.c) {
            if(s1 != null && s1.length() > 0 && s != null && s.length() > 0) {
                this.h.setVisibility(8);
                View view0 = this.n;
                if(!this.N) {
                    v = 8;
                }
                view0.setVisibility(v);
                this.M = n.b;
                return;
            }
            this.h.setVisibility(0);
            this.n.setVisibility(0);
            ConstraintLayout constraintLayout0 = this.h;
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = constraintLayout0.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ((LayoutParams)viewGroup$LayoutParams0).height = this.l9;
            constraintLayout0.setLayoutParams(((LayoutParams)viewGroup$LayoutParams0));
            this.M = n.a;
        }
    }

    private final void z1() {
        @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper$showAddonView$2", f = "PostListQuickWriteHelper.kt", i = {}, l = {0x4AF, 1200}, m = "invokeSuspend", n = {}, s = {})
        static final class F extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final r1 l;

            F(r1 r10, kotlin.coroutines.d d0) {
                this.l = r10;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@y4.m Object object0, @l kotlin.coroutines.d d0) {
                return new F(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m kotlin.coroutines.d d0) {
                return ((F)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.post.fragments.PostListQuickWriteHelper$showAddonView$2$1", f = "PostListQuickWriteHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nPostListQuickWriteHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostListQuickWriteHelper.kt\ncom/dcinside/app/post/fragments/PostListQuickWriteHelper$showAddonView$2$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1530:1\n257#2,2:1531\n25#3:1533\n1#4:1534\n*S KotlinDebug\n*F\n+ 1 PostListQuickWriteHelper.kt\ncom/dcinside/app/post/fragments/PostListQuickWriteHelper$showAddonView$2$1\n*L\n1201#1:1531,2\n1207#1:1533\n*E\n"})
                static final class com.dcinside.app.post.fragments.r1.F.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final r1 l;

                    com.dcinside.app.post.fragments.r1.F.a(r1 r10, kotlin.coroutines.d d0) {
                        this.l = r10;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@y4.m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.post.fragments.r1.F.a(this.l, d0);
                    }

                    // 检测为 Lambda 实现
                    private static final void f(r1 r10, int v) [...]

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @y4.m
                    public final Object invoke(@l O o0, @y4.m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.post.fragments.r1.F.a)this.create(o0, d0)).invokeSuspend(kotlin.S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @y4.m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.w.setVisibility(0);
                        this.l.d1();
                        c c0 = this.l.n9;
                        if(c0 != null) {
                            c0.b();
                        }
                        if(dl.a.c2()) {
                            return kotlin.S0.a;
                        }
                        Adapter recyclerView$Adapter0 = this.l.y.getAdapter();
                        Integer integer0 = null;
                        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.head.a)) {
                            recyclerView$Adapter0 = null;
                        }
                        if(((com.dcinside.app.head.a)recyclerView$Adapter0) == null) {
                            return kotlin.S0.a;
                        }
                        Integer integer1 = kotlin.coroutines.jvm.internal.b.f(((com.dcinside.app.head.a)recyclerView$Adapter0).y());
                        if(integer1.intValue() > -1) {
                            integer0 = integer1;
                        }
                        if(integer0 != null) {
                            t1 t10 = () -> {
                                ViewHolder recyclerView$ViewHolder0 = this.l.y.findViewHolderForAdapterPosition(((int)integer0));
                                com.dcinside.app.head.c c0 = recyclerView$ViewHolder0 instanceof com.dcinside.app.head.c ? ((com.dcinside.app.head.c)recyclerView$ViewHolder0) : null;
                                if(c0 == null) {
                                    return;
                                }
                                c c1 = this.l.n9;
                                if(c1 != null) {
                                    c1.d(c0, this.l.c);
                                }
                            };
                            this.l.y.post(t10);
                            return kotlin.S0.a;
                        }
                        return kotlin.S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        if(a0.b(100L, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return kotlin.S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                com.dcinside.app.post.fragments.r1.F.a r1$F$a0 = new com.dcinside.app.post.fragments.r1.F.a(this.l, null);
                this.k = 2;
                return kotlinx.coroutines.i.h(h0.e(), r1$F$a0, this) == object1 ? object1 : kotlin.S0.a;
            }
        }

        this.x1(true);
        S0 s00 = (S0)this.a.a();
        if(s00 != null) {
            Nk.a.d(s00);
            FragmentActivity fragmentActivity0 = s00.getActivity();
            if(fragmentActivity0 != null) {
                View view0 = fragmentActivity0.getCurrentFocus();
                if(view0 != null) {
                    view0.clearFocus();
                }
            }
        }
        I0 i00 = this.P8;
        I0 i01 = null;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        LifecycleCoroutineScope lifecycleCoroutineScope0 = this.U0();
        if(lifecycleCoroutineScope0 != null) {
            i01 = kotlinx.coroutines.k.f(lifecycleCoroutineScope0, h0.c(), null, new F(this, null), 2, null);
        }
        this.P8 = i01;
    }
}

