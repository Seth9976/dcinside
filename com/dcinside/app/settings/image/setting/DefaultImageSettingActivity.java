package com.dcinside.app.settings.image.setting;

import A3.q;
import Y.m0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.dcinside.app.base.g;
import com.dcinside.app.http.p;
import com.dcinside.app.image.ImageViewerActivity;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import com.dcinside.app.model.AiImageStatusResult;
import com.dcinside.app.model.f0;
import com.dcinside.app.realm.B;
import com.dcinside.app.settings.image.auto.MyAutoImageActivity;
import com.dcinside.app.settings.image.c;
import com.dcinside.app.settings.image.model.AutoImage;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.O0;
import com.dcinside.app.write.menu.ai.AiImageMakeActivity;
import com.hjq.toast.s;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.W;
import io.realm.g1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.O;
import rx.o;
import rx.subscriptions.f;
import y4.l;
import y4.m;

@s0({"SMAP\nDefaultImageSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 5 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 9 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 10 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,603:1\n192#2,7:604\n257#3,2:611\n257#3,2:613\n257#3,2:660\n257#3,2:665\n257#3,2:667\n278#3,2:669\n257#3,2:671\n278#3,2:673\n257#3,2:675\n257#3,2:677\n257#3,2:679\n257#3,2:681\n257#3,2:689\n257#3,2:691\n257#3,2:693\n257#3,2:700\n257#3,2:702\n257#3,2:704\n257#3,2:706\n257#3,2:708\n257#3,2:710\n257#3,2:712\n257#3,2:714\n257#3,2:716\n257#3,2:728\n257#3,2:730\n25#4:615\n25#4:662\n25#4:699\n37#5:616\n37#5:727\n3193#6,10:617\n1611#6,9:627\n1863#6:636\n1864#6:638\n1620#6:639\n1611#6,9:640\n1863#6:649\n1864#6:651\n1620#6:652\n360#6,7:653\n1567#6:718\n1598#6,4:719\n1557#6:723\n1628#6,3:724\n1#7:637\n1#7:650\n1#7:664\n60#8:663\n11132#9:683\n11467#9,3:684\n11132#9:695\n11467#9,3:696\n37#10,2:687\n*S KotlinDebug\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity\n*L\n111#1:604,7\n118#1:611,2\n119#1:613,2\n178#1:660,2\n279#1:665,2\n280#1:667,2\n282#1:669,2\n283#1:671,2\n285#1:673,2\n286#1:675,2\n342#1:677,2\n357#1:679,2\n379#1:681,2\n418#1:689,2\n444#1:691,2\n456#1:693,2\n200#1:700,2\n328#1:702,2\n349#1:704,2\n369#1:706,2\n389#1:708,2\n409#1:710,2\n434#1:712,2\n449#1:714,2\n463#1:716,2\n518#1:728,2\n521#1:730,2\n124#1:615\n206#1:662\n481#1:699\n151#1:616\n503#1:727\n154#1:617,10\n155#1:627,9\n155#1:636\n155#1:638\n155#1:639\n156#1:640,9\n156#1:649\n156#1:651\n156#1:652\n157#1:653,7\n486#1:718\n486#1:719,4\n495#1:723\n495#1:724,3\n155#1:637\n156#1:650\n208#1:663\n399#1:683\n399#1:684,3\n457#1:695\n457#1:696,3\n399#1:687,2\n*E\n"})
public final class DefaultImageSettingActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0, @l String s, @l String s1, boolean z, @m ActivityResultLauncher activityResultLauncher0) {
            L.p(context0, "context");
            L.p(s, "galleryId");
            L.p(s1, "galleryName");
            Intent intent0 = new Intent(context0, DefaultImageSettingActivity.class);
            intent0.putExtra("com.dcinside.app.extra.GALLERY_ID", s);
            intent0.putExtra("com.dcinside.app.extra.GALLERY_NAME", s1);
            intent0.putExtra("DefaultImageSettingActivity_EXTRA_CAN_MAKE_AI_IMAGE", z);
            if(activityResultLauncher0 != null) {
                activityResultLauncher0.b(intent0);
                return;
            }
            context0.startActivity(intent0);
        }

        public static void b(a defaultImageSettingActivity$a0, Context context0, String s, String s1, boolean z, ActivityResultLauncher activityResultLauncher0, int v, Object object0) {
            if((v & 16) != 0) {
                activityResultLauncher0 = null;
            }
            defaultImageSettingActivity$a0.a(context0, s, s1, ((v & 8) == 0 ? z : true), activityResultLauncher0);
        }
    }

    @s0({"SMAP\nDefaultImageSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$ProgressHandler\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,603:1\n147#2:604\n255#3:605\n257#3,2:606\n257#3,2:608\n257#3,2:610\n*S KotlinDebug\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$ProgressHandler\n*L\n556#1:604\n567#1:605\n568#1:606,2\n569#1:608,2\n570#1:610,2\n*E\n"})
    static final class b extends Handler {
        @l
        private final t a;

        public b(@l DefaultImageSettingActivity defaultImageSettingActivity0) {
            L.p(defaultImageSettingActivity0, "activity");
            super(Looper.getMainLooper());
            this.a = new t(defaultImageSettingActivity0);
        }

        @Override  // android.os.Handler
        public void handleMessage(@l Message message0) {
            L.p(message0, "msg");
            DefaultImageSettingActivity defaultImageSettingActivity0 = (DefaultImageSettingActivity)this.a.a();
            if(defaultImageSettingActivity0 == null) {
                return;
            }
            int v = message0.arg1;
            m0 m00 = defaultImageSettingActivity0.w;
            m0 m01 = null;
            if(m00 == null) {
                L.S("binding");
                m00 = null;
            }
            LinearLayout linearLayout0 = m00.c;
            L.o(linearLayout0, "defImgProgressContainer");
            m0 m02 = defaultImageSettingActivity0.w;
            if(m02 == null) {
                L.S("binding");
                m02 = null;
            }
            ProgressBar progressBar0 = m02.e;
            L.o(progressBar0, "defImgProgressUpload");
            m0 m03 = defaultImageSettingActivity0.w;
            if(m03 == null) {
                L.S("binding");
            }
            else {
                m01 = m03;
            }
            TextView textView0 = m01.d;
            L.o(textView0, "defImgProgressText");
            if(v >= 1 && progressBar0.getMax() > v) {
                if(linearLayout0.getVisibility() != 0) {
                    linearLayout0.setVisibility(0);
                    progressBar0.setVisibility(0);
                    textView0.setVisibility(0);
                }
                textView0.setText(defaultImageSettingActivity0.getString(0x7F150124, new Object[]{((int)(v / 100))}));  // string:auto_image_upload_progress "이미지 등록 중 (%1$d%%)"
                return;
            }
            textView0.setText("이미지 썸네일 생성 중");
        }
    }

    @m
    private ActivityResultLauncher A;
    private ActivityResultLauncher B;
    private ActivityResultLauncher C;
    @m
    private o D;
    @m
    private AiImageStatusResult E;
    private o F;
    private o G;
    private o H;
    private o I;
    private o J;
    private o K;
    private o L;
    @m
    private rx.subscriptions.b M;
    @l
    private static final String M8 = "내 자짤 이미지";
    @m
    private c N;
    @l
    private b O;
    @m
    private p P;
    @l
    public static final a Q = null;
    @l
    private static final String X = "DefaultImageSettingActivity_EXTRA_CAN_MAKE_AI_IMAGE";
    @l
    public static final String Y = "DefaultImageSettingActivity_EXTRA_MY_IMAGE_CHANGED";
    @l
    private static final String Z = "auto_image";
    private m0 w;
    @m
    private String x;
    @m
    private String y;
    @l
    private final A3.a z;

    static {
        DefaultImageSettingActivity.Q = new a(null);
    }

    public DefaultImageSettingActivity() {
        final class com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.c extends H implements A3.a {
            com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.c(Object object0) {
                super(0, object0, DefaultImageSettingActivity.class, "saveLocal", "saveLocal()V", 0);
            }

            public final void e() {
                ((DefaultImageSettingActivity)this.receiver).n3();
            }

            @Override  // A3.a
            public Object invoke() {
                this.e();
                return S0.a;
            }
        }

        this.z = new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.c(this);
        this.F = f.e();
        this.G = f.e();
        this.H = f.e();
        this.I = f.e();
        this.J = f.e();
        this.K = f.e();
        this.L = f.e();
        this.O = new b(this);
    }

    // 检测为 Lambda 实现
    private static final void A3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void B3(DefaultImageSettingActivity defaultImageSettingActivity0, Throwable throwable0) [...]

    private final void G2(int[] arr_v) {
        @s0({"SMAP\nDefaultImageSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$addImages$2\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,603:1\n25#2:604\n257#3,2:605\n*S KotlinDebug\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$addImages$2\n*L\n401#1:604\n406#1:605,2\n*E\n"})
        static final class d extends N implements Function1 {
            final DefaultImageSettingActivity e;
            final int[] f;

            d(DefaultImageSettingActivity defaultImageSettingActivity0, int[] arr_v) {
                this.e = defaultImageSettingActivity0;
                this.f = arr_v;
                super(1);
            }

            public final void a(f0 f00) {
                m0 m00 = this.e.w;
                m0 m01 = null;
                if(m00 == null) {
                    L.S("binding");
                    m00 = null;
                }
                L.o(m00.n, "defImgSettingRecycler");
                Adapter recyclerView$Adapter0 = m00.n.getAdapter();
                if(!(recyclerView$Adapter0 instanceof K)) {
                    recyclerView$Adapter0 = null;
                }
                if(((K)recyclerView$Adapter0) == null) {
                    return;
                }
                if(!Arrays.equals(((K)recyclerView$Adapter0).C(), this.f)) {
                    this.e.q3(true);
                    return;
                }
                m0 m02 = this.e.w;
                if(m02 == null) {
                    L.S("binding");
                }
                else {
                    m01 = m02;
                }
                L.o(m01.b, "defImgProgress");
                m01.b.setVisibility(8);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        o o0 = this.K;
        if(o0 != null) {
            o0.l();
        }
        String s = this.x;
        ArrayList arrayList0 = new ArrayList(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            arrayList0.add(String.valueOf(arr_v[v]));
        }
        this.K = uk.PG(s, ((String[])arrayList0.toArray(new String[0]))).y5((Object object0) -> {
            L.p(new d(this, arr_v), "$tmp0");
            new d(this, arr_v).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            m0 m00 = this.w;
            if(m00 == null) {
                L.S("binding");
                m00 = null;
            }
            L.o(m00.b, "defImgProgress");
            m00.b.setVisibility(8);
            s.C(throwable0.getMessage());
        });
    }

    // 检测为 Lambda 实现
    private static final void H2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void I2(DefaultImageSettingActivity defaultImageSettingActivity0, Throwable throwable0) [...]

    private final void J2(int v, Integer integer0) {
        @s0({"SMAP\nDefaultImageSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$changeMainImage$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,603:1\n257#2,2:604\n25#3:606\n1#4:607\n*S KotlinDebug\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$changeMainImage$1\n*L\n345#1:604,2\n346#1:606\n*E\n"})
        static final class e extends N implements Function1 {
            final DefaultImageSettingActivity e;
            final Integer f;

            e(DefaultImageSettingActivity defaultImageSettingActivity0, Integer integer0) {
                this.e = defaultImageSettingActivity0;
                this.f = integer0;
                super(1);
            }

            public final void a(j0.b b0) {
                m0 m00 = this.e.w;
                Adapter recyclerView$Adapter0 = null;
                if(m00 == null) {
                    L.S("binding");
                    m00 = null;
                }
                L.o(m00.b, "defImgProgress");
                m00.b.setVisibility(8);
                m0 m01 = this.e.w;
                if(m01 == null) {
                    L.S("binding");
                    m01 = null;
                }
                L.o(m01.n, "defImgSettingRecycler");
                Adapter recyclerView$Adapter1 = m01.n.getAdapter();
                if(recyclerView$Adapter1 instanceof K) {
                    recyclerView$Adapter0 = recyclerView$Adapter1;
                }
                if(((K)recyclerView$Adapter0) == null) {
                    return;
                }
                Integer integer0 = this.f;
                if(integer0 != null) {
                    ((K)recyclerView$Adapter0).e0(integer0.intValue());
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((j0.b)object0));
                return S0.a;
            }
        }

        o o0 = this.J;
        if(o0 != null) {
            o0.l();
        }
        m0 m00 = this.w;
        if(m00 == null) {
            L.S("binding");
            m00 = null;
        }
        L.o(m00.b, "defImgProgress");
        m00.b.setVisibility(0);
        this.J = uk.Wj(this.x, String.valueOf(v)).y5((Object object0) -> {
            L.p(new e(this, integer0), "$tmp0");
            new e(this, integer0).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            m0 m00 = this.w;
            if(m00 == null) {
                L.S("binding");
                m00 = null;
            }
            L.o(m00.b, "defImgProgress");
            m00.b.setVisibility(8);
            s.C(throwable0.getMessage());
        });
    }

    // 检测为 Lambda 实现
    private static final void K2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void L2(DefaultImageSettingActivity defaultImageSettingActivity0, Throwable throwable0) [...]

    private final void M2(boolean z, boolean z1) {
        @s0({"SMAP\nDefaultImageSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$changeSetting$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,603:1\n257#2,2:604\n25#3:606\n*S KotlinDebug\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$changeSetting$1\n*L\n360#1:604,2\n362#1:606\n*E\n"})
        static final class com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.f extends N implements Function1 {
            final DefaultImageSettingActivity e;
            final boolean f;
            final boolean g;

            com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.f(DefaultImageSettingActivity defaultImageSettingActivity0, boolean z, boolean z1) {
                this.e = defaultImageSettingActivity0;
                this.f = z;
                this.g = z1;
                super(1);
            }

            public final void a(j0.b b0) {
                m0 m00 = this.e.w;
                Adapter recyclerView$Adapter0 = null;
                if(m00 == null) {
                    L.S("binding");
                    m00 = null;
                }
                L.o(m00.b, "defImgProgress");
                m00.b.setVisibility(8);
                if(this.f) {
                    m0 m01 = this.e.w;
                    if(m01 == null) {
                        L.S("binding");
                        m01 = null;
                    }
                    L.o(m01.n, "defImgSettingRecycler");
                    Adapter recyclerView$Adapter1 = m01.n.getAdapter();
                    if(recyclerView$Adapter1 instanceof K) {
                        recyclerView$Adapter0 = recyclerView$Adapter1;
                    }
                    if(((K)recyclerView$Adapter0) == null) {
                        return;
                    }
                    ((K)recyclerView$Adapter0).f0(this.g);
                    ((K)recyclerView$Adapter0).notifyItemRangeChanged(0, ((K)recyclerView$Adapter0).getItemCount());
                    return;
                }
                m0 m02 = this.e.w;
                if(m02 == null) {
                    L.S("binding");
                    m02 = null;
                }
                SwitchCompat switchCompat0 = m02.i;
                m0 m03 = this.e.w;
                if(m03 == null) {
                    L.S("binding");
                }
                else {
                    recyclerView$Adapter0 = m03;
                }
                switchCompat0.setChecked(!recyclerView$Adapter0.i.isChecked());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((j0.b)object0));
                return S0.a;
            }
        }

        o o0 = this.F;
        if(o0 != null) {
            o0.l();
        }
        m0 m00 = this.w;
        if(m00 == null) {
            L.S("binding");
            m00 = null;
        }
        L.o(m00.b, "defImgProgress");
        m00.b.setVisibility(0);
        this.F = uk.zG(this.x, z, z1).y5((Object object0) -> {
            L.p(new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.f(this, z, z1), "$tmp0");
            new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.f(this, z, z1).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            m0 m00 = this.w;
            if(m00 == null) {
                L.S("binding");
                m00 = null;
            }
            L.o(m00.b, "defImgProgress");
            m00.b.setVisibility(8);
            s.C(throwable0.getMessage());
        });
    }

    // 检测为 Lambda 实现
    private static final void N2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void O2(DefaultImageSettingActivity defaultImageSettingActivity0, Throwable throwable0) [...]

    private final void P2(int v) {
        static final class com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.g extends N implements Function1 {
            final DefaultImageSettingActivity e;

            com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.g(DefaultImageSettingActivity defaultImageSettingActivity0) {
                this.e = defaultImageSettingActivity0;
                super(1);
            }

            public final void a(f0 f00) {
                DefaultImageSettingActivity.r3(this.e, false, 1, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        o o0 = this.L;
        if(o0 != null) {
            o0.l();
        }
        m0 m00 = this.w;
        if(m00 == null) {
            L.S("binding");
            m00 = null;
        }
        L.o(m00.b, "defImgProgress");
        m00.b.setVisibility(0);
        this.L = uk.ik(this.x, u.k(String.valueOf(v))).y5((Object object0) -> {
            L.p(new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.g(this), "$tmp0");
            new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.g(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            m0 m00 = this.w;
            if(m00 == null) {
                L.S("binding");
                m00 = null;
            }
            L.o(m00.b, "defImgProgress");
            m00.b.setVisibility(8);
            s.C(throwable0.getMessage());
        });
    }

    // 检测为 Lambda 实现
    private static final void Q2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void R2(DefaultImageSettingActivity defaultImageSettingActivity0, Throwable throwable0) [...]

    private final void S2(int[] arr_v) {
        @s0({"SMAP\nDefaultImageSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$deleteAutoImages$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,603:1\n257#2,2:604\n25#3:606\n*S KotlinDebug\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$deleteAutoImages$2\n*L\n459#1:604,2\n460#1:606\n*E\n"})
        static final class h extends N implements Function1 {
            final DefaultImageSettingActivity e;

            h(DefaultImageSettingActivity defaultImageSettingActivity0) {
                this.e = defaultImageSettingActivity0;
                super(1);
            }

            public final void a(f0 f00) {
                m0 m00 = this.e.w;
                Adapter recyclerView$Adapter0 = null;
                if(m00 == null) {
                    L.S("binding");
                    m00 = null;
                }
                L.o(m00.b, "defImgProgress");
                m00.b.setVisibility(8);
                m0 m01 = this.e.w;
                if(m01 == null) {
                    L.S("binding");
                    m01 = null;
                }
                L.o(m01.n, "defImgSettingRecycler");
                Adapter recyclerView$Adapter1 = m01.n.getAdapter();
                if(recyclerView$Adapter1 instanceof K) {
                    recyclerView$Adapter0 = recyclerView$Adapter1;
                }
                if(((K)recyclerView$Adapter0) != null) {
                    ((K)recyclerView$Adapter0).S();
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        o o0 = this.L;
        if(o0 != null) {
            o0.l();
        }
        m0 m00 = this.w;
        if(m00 == null) {
            L.S("binding");
            m00 = null;
        }
        L.o(m00.b, "defImgProgress");
        m00.b.setVisibility(0);
        String s = this.x;
        ArrayList arrayList0 = new ArrayList(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            arrayList0.add(String.valueOf(arr_v[v]));
        }
        this.L = uk.ik(s, arrayList0).y5((Object object0) -> {
            L.p(new h(this), "$tmp0");
            new h(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            m0 m00 = this.w;
            if(m00 == null) {
                L.S("binding");
                m00 = null;
            }
            L.o(m00.b, "defImgProgress");
            m00.b.setVisibility(8);
            s.C(throwable0.getMessage());
        });
    }

    // 检测为 Lambda 实现
    private static final void T2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void U2(DefaultImageSettingActivity defaultImageSettingActivity0, Throwable throwable0) [...]

    private final void V2() {
        static final class i extends N implements Function1 {
            final DefaultImageSettingActivity e;

            i(DefaultImageSettingActivity defaultImageSettingActivity0) {
                this.e = defaultImageSettingActivity0;
                super(1);
            }

            public final void a(int v) {
                this.e.P2(v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Number)object0).intValue());
                return S0.a;
            }
        }


        static final class j extends N implements Function1 {
            final DefaultImageSettingActivity e;

            j(DefaultImageSettingActivity defaultImageSettingActivity0) {
                this.e = defaultImageSettingActivity0;
                super(1);
            }

            public final void a(@l int[] arr_v) {
                L.p(arr_v, "it");
                this.e.S2(arr_v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((int[])object0));
                return S0.a;
            }
        }


        static final class k extends N implements A3.o {
            final DefaultImageSettingActivity e;

            k(DefaultImageSettingActivity defaultImageSettingActivity0) {
                this.e = defaultImageSettingActivity0;
                super(2);
            }

            public final void a(@l String s, int v) {
                L.p(s, "path");
                this.e.z3(s, v);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((String)object0), ((Number)object1).intValue());
                return S0.a;
            }
        }


        static final class com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.l extends N implements A3.o {
            final DefaultImageSettingActivity e;

            com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.l(DefaultImageSettingActivity defaultImageSettingActivity0) {
                this.e = defaultImageSettingActivity0;
                super(2);
            }

            public final void a(int v, @m Integer integer0) {
                this.e.J2(v, integer0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((Number)object0).intValue(), ((Integer)object1));
                return S0.a;
            }
        }


        static final class com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.m extends N implements A3.a {
            final K e;
            final DefaultImageSettingActivity f;

            com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.m(K k0, DefaultImageSettingActivity defaultImageSettingActivity0) {
                this.e = k0;
                this.f = defaultImageSettingActivity0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                int[] arr_v = this.e.C();
                com.dcinside.app.settings.image.auto.MyAutoImageActivity.a myAutoImageActivity$a0 = MyAutoImageActivity.L;
                DefaultImageSettingActivity defaultImageSettingActivity0 = this.f;
                ActivityResultLauncher activityResultLauncher0 = defaultImageSettingActivity0.B;
                if(activityResultLauncher0 == null) {
                    L.S("activityResultAddImage");
                    activityResultLauncher0 = null;
                }
                myAutoImageActivity$a0.a(defaultImageSettingActivity0, true, arr_v, activityResultLauncher0);
            }
        }


        static final class n extends N implements Function1 {
            final DefaultImageSettingActivity e;

            n(DefaultImageSettingActivity defaultImageSettingActivity0) {
                this.e = defaultImageSettingActivity0;
                super(1);
            }

            public final void a(com.dcinside.app.rx.bus.m0 m00) {
                L.m(m00);
                this.e.g3(m00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.rx.bus.m0)object0));
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.image.setting.DefaultImageSettingActivity$initCallbacks$8", f = "DefaultImageSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nDefaultImageSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$initCallbacks$8\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,603:1\n257#2,2:604\n*S KotlinDebug\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$initCallbacks$8\n*L\n254#1:604,2\n*E\n"})
        static final class com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.o extends kotlin.coroutines.jvm.internal.o implements q {
            int k;
            boolean l;
            final DefaultImageSettingActivity m;

            com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.o(DefaultImageSettingActivity defaultImageSettingActivity0, kotlin.coroutines.d d0) {
                this.m = defaultImageSettingActivity0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m kotlin.coroutines.d d0) {
                com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.o defaultImageSettingActivity$o0 = new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.o(this.m, d0);
                defaultImageSettingActivity$o0.l = z;
                return defaultImageSettingActivity$o0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                kotlin.f0.n(object0);
                boolean z = this.l;
                m0 m00 = this.m.w;
                if(m00 == null) {
                    L.S("binding");
                    m00 = null;
                }
                L.o(m00.f, "defImgSettingGalleryDesc");
                m00.f.setVisibility((z ? 8 : 0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.p extends N implements Function1 {
            final DefaultImageSettingActivity e;

            com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.p(DefaultImageSettingActivity defaultImageSettingActivity0) {
                this.e = defaultImageSettingActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Boolean)object0).booleanValue());
                return S0.a;
            }

            public final void invoke(boolean z) {
                this.e.M2(true, z);
            }
        }

        m0 m00 = this.w;
        if(m00 == null) {
            L.S("binding");
            m00 = null;
        }
        L.o(m00.n, "defImgSettingRecycler");
        Adapter recyclerView$Adapter0 = m00.n.getAdapter();
        if(!(recyclerView$Adapter0 instanceof K)) {
            recyclerView$Adapter0 = null;
        }
        o o0 = com.dcinside.app.rx.bus.c.c(this, com.dcinside.app.rx.bus.m0.class).x5((Object object0) -> {
            L.p(new n(this), "$tmp0");
            new n(this).invoke(object0);
        });
        rx.subscriptions.b b0 = this.M;
        if(b0 != null) {
            b0.a(o0);
        }
        this.A = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            if(activityResult0.c() == -1) {
                Intent intent0 = activityResult0.a();
                if(intent0 != null) {
                    String s = intent0.getStringExtra("EXTRA_PROMPT_RESULT_JSON");
                    if(s != null) {
                        Intent intent1 = activityResult0.a();
                        boolean z = intent1 != null && intent1.getBooleanExtra("EXTRA_MODIFY_PROMPT", false);
                        if(this.w == null) {
                            L.S("binding");
                        }
                        if(((K)recyclerView$Adapter0) == null) {
                            return;
                        }
                        if(z) {
                            ((K)recyclerView$Adapter0).H(s);
                            return;
                        }
                        ((K)recyclerView$Adapter0).y(s);
                    }
                }
            }
        });
        this.B = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            int[] arr_v;
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            if(activityResult0.c() == -1) {
                Intent intent0 = activityResult0.a();
                if(intent0 == null) {
                    arr_v = new int[0];
                }
                else {
                    arr_v = intent0.getIntArrayExtra("com.dcinside.app.extra.EXTRA_SELECTED_IMAGE_INDEXES");
                    if(arr_v == null) {
                        arr_v = new int[0];
                    }
                }
                if(arr_v.length != 0) {
                    this.u3(arr_v);
                    return;
                }
                Intent intent1 = activityResult0.a();
                if(intent1 != null && intent1.getBooleanExtra("DefaultImageSettingActivity_EXTRA_MY_IMAGE_CHANGED", false)) {
                    DefaultImageSettingActivity.r3(this, false, 1, null);
                }
            }
        });
        this.C = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            if(activityResult0.c() == -1) {
                Intent intent0 = activityResult0.a();
                if(intent0 != null && intent0.getBooleanExtra("DefaultImageSettingActivity_EXTRA_MY_IMAGE_CHANGED", false)) {
                    DefaultImageSettingActivity.r3(this, false, 1, null);
                }
            }
        });
        m0 m01 = this.w;
        if(m01 == null) {
            L.S("binding");
            m01 = null;
        }
        com.dcinside.app.settings.image.setting.f f0 = (View view0) -> {
            L.p(this, "this$0");
            com.dcinside.app.settings.image.auto.MyAutoImageActivity.a myAutoImageActivity$a0 = MyAutoImageActivity.L;
            ActivityResultLauncher activityResultLauncher0 = this.C;
            if(activityResultLauncher0 == null) {
                L.S("activityResultMyImageChanged");
                activityResultLauncher0 = null;
            }
            com.dcinside.app.settings.image.auto.MyAutoImageActivity.a.b(myAutoImageActivity$a0, this, false, null, activityResultLauncher0, 6, null);
        };
        m01.k.setOnClickListener(f0);
        m0 m02 = this.w;
        if(m02 == null) {
            L.S("binding");
            m02 = null;
        }
        com.dcinside.app.settings.image.setting.g g0 = (View view0) -> {
            L.p(this, "this$0");
            m0 m00 = this.w;
            if(m00 == null) {
                L.S("binding");
                m00 = null;
            }
            this.M2(false, !m00.i.isChecked());
        };
        m02.j.setOnClickListener(g0);
        m0 m03 = this.w;
        if(m03 == null) {
            L.S("binding");
            m03 = null;
        }
        L.o(m03.i, "defImgSettingGallerySwitch");
        com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.o defaultImageSettingActivity$o0 = new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.o(this, null);
        r.J(m03.i, null, defaultImageSettingActivity$o0, 1, null);
        if(((K)recyclerView$Adapter0) != null) {
            ((K)recyclerView$Adapter0).d0(new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.p(this));
        }
        if(((K)recyclerView$Adapter0) != null) {
            ((K)recyclerView$Adapter0).c0(new i(this));
        }
        if(((K)recyclerView$Adapter0) != null) {
            ((K)recyclerView$Adapter0).b0(new j(this));
        }
        if(((K)recyclerView$Adapter0) != null) {
            ((K)recyclerView$Adapter0).a0(new k(this));
        }
        if(((K)recyclerView$Adapter0) != null) {
            ((K)recyclerView$Adapter0).Y(new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.l(this));
        }
        if(((K)recyclerView$Adapter0) != null) {
            ((K)recyclerView$Adapter0).Z(new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.m(((K)recyclerView$Adapter0), this));
        }
    }

    // 检测为 Lambda 实现
    private static final void W2(DefaultImageSettingActivity defaultImageSettingActivity0, ActivityResult activityResult0) [...]

    // 检测为 Lambda 实现
    private static final void X2(DefaultImageSettingActivity defaultImageSettingActivity0, ActivityResult activityResult0) [...]

    // 检测为 Lambda 实现
    private static final void Y2(DefaultImageSettingActivity defaultImageSettingActivity0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void Z2(DefaultImageSettingActivity defaultImageSettingActivity0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void a3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void b3(DefaultImageSettingActivity defaultImageSettingActivity0, K k0, ActivityResult activityResult0) [...]

    private final void c3() {
        @s0({"SMAP\nDefaultImageSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$initViews$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,603:1\n257#2,2:604\n257#2,2:606\n*S KotlinDebug\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$initViews$2\n*L\n196#1:604,2\n193#1:606,2\n*E\n"})
        static final class com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.q extends N implements Function1 {
            final boolean e;
            final DefaultImageSettingActivity f;
            final K g;
            final List h;
            final List i;
            final int j;

            com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.q(boolean z, DefaultImageSettingActivity defaultImageSettingActivity0, K k0, List list0, List list1, int v) {
                this.e = z;
                this.f = defaultImageSettingActivity0;
                this.g = k0;
                this.h = list0;
                this.i = list1;
                this.j = v;
                super(1);
            }

            public final void c(j0.a a0) {
                @s0({"SMAP\nDefaultImageSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$initViews$2$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,603:1\n257#2,2:604\n*S KotlinDebug\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$initViews$2$1\n*L\n191#1:604,2\n*E\n"})
                static final class com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.q.a extends N implements Function1 {
                    final DefaultImageSettingActivity e;

                    com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.q.a(DefaultImageSettingActivity defaultImageSettingActivity0) {
                        this.e = defaultImageSettingActivity0;
                        super(1);
                    }

                    public final void a(j0.b b0) {
                        m0 m00 = this.e.w;
                        if(m00 == null) {
                            L.S("binding");
                            m00 = null;
                        }
                        L.o(m00.b, "defImgProgress");
                        m00.b.setVisibility(8);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((j0.b)object0));
                        return S0.a;
                    }
                }

                boolean z = this.e;
                m0 m00 = this.f.w;
                m0 m01 = null;
                if(m00 == null) {
                    L.S("binding");
                    m00 = null;
                }
                boolean z1 = j0.a.k.a("1");
                m00.i.setChecked(z1);
                this.f.p3(false);
                this.g.X(a0.u(), this.h, this.i, z, a0.v(), this.j);
                if(!z) {
                    o o0 = this.f.F;
                    if(o0 != null) {
                        o0.l();
                    }
                    o o1 = uk.zG(this.f.x, true, false).y5((Object object0) -> {
                        L.p(new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.q.a(this.f), "$tmp0");
                        new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.q.a(this.f).invoke(object0);
                    }, (Throwable throwable0) -> {
                        L.p(this.f, "this$0");
                        m0 m00 = this.f.w;
                        if(m00 == null) {
                            L.S("binding");
                            m00 = null;
                        }
                        L.o(m00.b, "defImgProgress");
                        m00.b.setVisibility(8);
                    });
                    this.f.F = o1;
                    return;
                }
                m0 m02 = this.f.w;
                if(m02 == null) {
                    L.S("binding");
                }
                else {
                    m01 = m02;
                }
                L.o(m01.b, "defImgProgress");
                m01.b.setVisibility(8);
            }

            // 检测为 Lambda 实现
            private static final void d(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void e(DefaultImageSettingActivity defaultImageSettingActivity0, Throwable throwable0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.c(((j0.a)object0));
                return S0.a;
            }
        }

        int v4;
        int v3;
        int v1;
        V v0;
        g1 g10;
        this.x = this.getIntent().getStringExtra("com.dcinside.app.extra.GALLERY_ID");
        this.y = this.getIntent().getStringExtra("com.dcinside.app.extra.GALLERY_NAME");
        F0 f00 = this.F1();
        if(f00 == null) {
            g10 = null;
        }
        else {
            RealmQuery realmQuery0 = f00.C4(com.dcinside.app.realm.l.class);
            L.o(realmQuery0, "this.where(T::class.java)");
            if(realmQuery0 == null) {
                g10 = null;
            }
            else {
                RealmQuery realmQuery1 = realmQuery0.i0("galleryId", this.x);
                g10 = realmQuery1 == null ? null : realmQuery1.p0();
            }
        }
        if(g10 == null) {
            v0 = new V(u.H(), u.H());
        }
        else {
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: g10) {
                String s = ((com.dcinside.app.realm.l)object0).T5();
                if(s != null && s.length() != 0) {
                    arrayList1.add(object0);
                }
                else {
                    arrayList0.add(object0);
                }
            }
            v0 = new V(arrayList0, arrayList1);
        }
        List list0 = (List)v0.b();
        ArrayList arrayList2 = new ArrayList();
        for(Object object1: ((List)v0.a())) {
            String s1 = ((com.dcinside.app.realm.l)object1).V5();
            if(s1 != null) {
                arrayList2.add(s1);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator iterator2 = list0.iterator();
        while(true) {
            v1 = -1;
            if(!iterator2.hasNext()) {
                break;
            }
            Object object2 = iterator2.next();
            String s2 = ((com.dcinside.app.realm.l)object2).T5();
            if(s2 != null) {
                arrayList3.add(s2);
            }
        }
        if(g10 == null) {
            v3 = -1;
        }
        else {
            int v2 = 0;
            for(Object object3: g10) {
                com.dcinside.app.realm.l l0 = (com.dcinside.app.realm.l)object3;
                if(l0.U5()) {
                    String s3 = l0.T5();
                    if(s3 == null || s3.length() == 0) {
                        v1 = v2;
                        break;
                    }
                }
                ++v2;
            }
            v3 = v1;
        }
        if(g10 == null) {
            v4 = 0;
        }
        else {
            com.dcinside.app.realm.l l1 = (com.dcinside.app.realm.l)u.G2(g10);
            v4 = l1 == null || l1.W5() ? 0 : 1;
        }
        if(L.g("__DC_GLOBAL_DEF_IMAGE_ID", this.x)) {
            this.setTitle("기본 자동 짤방 이미지");
        }
        else {
            String s4 = this.y == null ? "" : this.y;
            this.setTitle("자동 짤방 이미지");
            String s5 = this.getString(0x7F15026B, new Object[]{s4});  // string:default_image_use "자동 짤방 사용 - %1$s"
            L.o(s5, "getString(...)");
            SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(s5);
            int v5 = vk.b(this, 0x7F04012E);  // attr:colorAccent
            int v6 = v.s3(s5, s4, 0, false, 6, null);
            spannableStringBuilder0.setSpan(new ForegroundColorSpan(v5), v6, s5.length(), 0);
            m0 m00 = this.w;
            if(m00 == null) {
                L.S("binding");
                m00 = null;
            }
            m00.j.setText(spannableStringBuilder0);
        }
        K k0 = new K(this.z);
        m0 m01 = this.w;
        if(m01 == null) {
            L.S("binding");
            m01 = null;
        }
        O0 o00 = new O0(0);
        m01.n.addItemDecoration(o00);
        m0 m02 = this.w;
        if(m02 == null) {
            L.S("binding");
            m02 = null;
        }
        m02.n.setItemAnimator(null);
        m0 m03 = this.w;
        if(m03 == null) {
            L.S("binding");
            m03 = null;
        }
        m03.n.setAdapter(k0);
        o o0 = this.G;
        if(o0 != null) {
            o0.l();
        }
        this.p3(true);
        m0 m04 = this.w;
        if(m04 == null) {
            L.S("binding");
            m04 = null;
        }
        L.o(m04.b, "defImgProgress");
        m04.b.setVisibility(0);
        m0 m05 = this.w;
        if(m05 == null) {
            L.S("binding");
            m05 = null;
        }
        m05.k.setText("내 자짤");
        this.G = uk.yk(this.x).y5((Object object0) -> {
            L.p(new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.q(((boolean)(v4 ^ 1)), this, k0, arrayList2, arrayList3, v3), "$tmp0");
            new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.q(((boolean)(v4 ^ 1)), this, k0, arrayList2, arrayList3, v3).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.p3(false);
            m0 m00 = this.w;
            if(m00 == null) {
                L.S("binding");
                m00 = null;
            }
            L.o(m00.b, "defImgProgress");
            m00.b.setVisibility(8);
            Dl.D(this, 0x7F150326);  // string:failed_notice_data "정보를 가져올 수 없습니다. 잠시 후 다시 시도해주세요."
        });
    }

    // 检测为 Lambda 实现
    private static final void d3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void e3(DefaultImageSettingActivity defaultImageSettingActivity0, Throwable throwable0) [...]

    public final void f3(@m String s) {
        static final class com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.r extends N implements A3.a {
            final DefaultImageSettingActivity e;
            final String f;

            com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.r(DefaultImageSettingActivity defaultImageSettingActivity0, String s) {
                this.e = defaultImageSettingActivity0;
                this.f = s;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.f3(this.f);
            }
        }

        AiImageStatusResult aiImageStatusResult0 = this.E;
        if(aiImageStatusResult0 == null) {
            this.h3(new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.r(this, s));
            return;
        }
        AiImageMakeActivity.X8.b(this, aiImageStatusResult0, s, this.A);
    }

    private final void g3(com.dcinside.app.rx.bus.m0 m00) {
        Intent intent0 = new Intent(this, ImageViewerActivity.class);
        intent0.putExtra("com.dcinside.app.extra.GALLERY_ID", "auto_image");
        intent0.putExtra("com.dcinside.app.extra.POST_NUMBER", m00.g());
        intent0.putExtra("com.dcinside.app.extra.POST_SUBJECT", "내 자짤 이미지");
        intent0.putExtra("com.dcinside.app.extra.IMAGE_SELECTED", m00.l());
        intent0.putExtra("com.dcinside.app.extra.SHOW_PATH_CHANGE", m00.j());
        intent0.putParcelableArrayListExtra("com.dcinside.app.extra.RESIZE_IMAGE_LIST", m00.h());
        intent0.putParcelableArrayListExtra("com.dcinside.app.extra.ORIGIN_IMAGE_LIST", m00.f());
        intent0.putExtra("com.dcinside.app.extra.EXTRA_SHOW_IMAGE_MODE", m00.e());
        intent0.putStringArrayListExtra("com.dcinside.app.extra.EXTRA_VIDEO_THUMBNAIL_LIST", m00.d());
        intent0.putExtra("com.dcinside.app.extra.EXTRA_CAN_BLOCK", m00.b());
        this.startActivity(intent0);
    }

    private final void h3(A3.a a0) {
        static final class com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.s extends N implements Function1 {
            final DefaultImageSettingActivity e;
            final A3.a f;

            com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.s(DefaultImageSettingActivity defaultImageSettingActivity0, A3.a a0) {
                this.e = defaultImageSettingActivity0;
                this.f = a0;
                super(1);
            }

            public final void a(AiImageStatusResult aiImageStatusResult0) {
                static final class com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.s.a extends N implements Function1 {
                    final DefaultImageSettingActivity e;

                    com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.s.a(DefaultImageSettingActivity defaultImageSettingActivity0) {
                        this.e = defaultImageSettingActivity0;
                        super(1);
                    }

                    @m
                    public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                        L.p(p$a0, "b");
                        return p$a0.n("잠시 후 다시 시도해주세요.");
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((com.dcinside.app.perform.p.a)object0));
                    }
                }

                if(L.g(aiImageStatusResult0.v(), Boolean.TRUE)) {
                    this.e.E = aiImageStatusResult0;
                    A3.a a0 = this.f;
                    if(a0 != null) {
                        a0.invoke();
                    }
                }
                else {
                    com.dcinside.app.perform.e.e.a(this.e).n(new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.s.a(this.e)).z(0x7F15034A).b().t5();  // string:filter_apply "확인"
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((AiImageStatusResult)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.t extends N implements Function1 {
            final DefaultImageSettingActivity e;

            com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.t(DefaultImageSettingActivity defaultImageSettingActivity0) {
                this.e = defaultImageSettingActivity0;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.n("잠시 후 다시 시도해주세요.");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }

        if(this.D != null && !this.D.j()) {
            return;
        }
        this.D = uk.wk(true).R1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                m0 m00 = this.w;
                if(m00 == null) {
                    L.S("binding");
                    m00 = null;
                }
                L.o(m00.b, "defImgProgress");
                m00.b.setVisibility(0);
            }
        }).T1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                m0 m00 = this.w;
                if(m00 == null) {
                    L.S("binding");
                    m00 = null;
                }
                L.o(m00.b, "defImgProgress");
                m00.b.setVisibility(8);
            }
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.s(this, a0), "$tmp0");
            new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.s(this, a0).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            com.dcinside.app.perform.e.e.a(this).n(new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.t(this)).z(0x7F15034A).b().t5();  // string:filter_apply "확인"
        });
    }

    static void i3(DefaultImageSettingActivity defaultImageSettingActivity0, A3.a a0, int v, Object object0) {
        if((v & 1) != 0) {
            a0 = null;
        }
        defaultImageSettingActivity0.h3(a0);
    }

    // 检测为 Lambda 实现
    private static final void j3(DefaultImageSettingActivity defaultImageSettingActivity0) [...]

    // 检测为 Lambda 实现
    private static final void k3(DefaultImageSettingActivity defaultImageSettingActivity0) [...]

    // 检测为 Lambda 实现
    private static final void l3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void m3(DefaultImageSettingActivity defaultImageSettingActivity0, Throwable throwable0) [...]

    private final void n3() {
        try {
            m0 m00 = this.w;
            Adapter recyclerView$Adapter0 = null;
            if(m00 == null) {
                L.S("binding");
                m00 = null;
            }
            L.o(m00.n, "defImgSettingRecycler");
            Adapter recyclerView$Adapter1 = m00.n.getAdapter();
            if(recyclerView$Adapter1 instanceof K) {
                recyclerView$Adapter0 = recyclerView$Adapter1;
            }
            if(((K)recyclerView$Adapter0) == null) {
                return;
            }
            F0 f00 = this.F1();
            if(f00 != null) {
                f00.Y3((F0 f00) -> {
                    L.p(((K)recyclerView$Adapter0), "$adapter");
                    L.p(this, "this$0");
                    Integer integer0 = ((K)recyclerView$Adapter0).B();
                    ArrayList arrayList0 = new ArrayList();
                    Iterable iterable0 = ((K)recyclerView$Adapter0).A();
                    ArrayList arrayList1 = new ArrayList(u.b0(iterable0, 10));
                    Iterator iterator0 = iterable0.iterator();
                    for(int v = 0; true; ++v) {
                        String s = null;
                        boolean z = true;
                        if(!iterator0.hasNext()) {
                            break;
                        }
                        Object object0 = iterator0.next();
                        if(v < 0) {
                            u.Z();
                        }
                        com.dcinside.app.realm.l l0 = new com.dcinside.app.realm.l();
                        l0.X5(this.x);
                        l0.Y5(this.y);
                        if(((String)object0).length() > 0) {
                            s = (String)object0;
                        }
                        l0.b6(s);
                        if(integer0 == null || v != integer0.intValue()) {
                            z = false;
                        }
                        l0.a6(z);
                        arrayList1.add(l0);
                    }
                    arrayList0.addAll(arrayList1);
                    Iterable iterable1 = ((K)recyclerView$Adapter0).E();
                    ArrayList arrayList2 = new ArrayList(u.b0(iterable1, 10));
                    for(Object object1: iterable1) {
                        String s1 = (String)object1;
                        com.dcinside.app.realm.l l1 = new com.dcinside.app.realm.l();
                        l1.X5(this.x);
                        l1.Y5(this.y);
                        if(s1.length() <= 0) {
                            s1 = null;
                        }
                        l1.Z5(s1);
                        l1.a6(false);
                        arrayList2.add(l1);
                    }
                    arrayList0.addAll(arrayList2);
                    L.m(f00);
                    RealmQuery realmQuery0 = f00.C4(com.dcinside.app.realm.l.class);
                    L.o(realmQuery0, "this.where(T::class.java)");
                    realmQuery0.i0("galleryId", this.x).p0().L0();
                    f00.A2(arrayList0, new W[0]);
                });
            }
        }
        catch(Exception exception0) {
            Dl.G(this, exception0.getMessage());
        }
    }

    // 检测为 Lambda 实现
    private static final void o3(K k0, DefaultImageSettingActivity defaultImageSettingActivity0, F0 f00) [...]

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        m0 m00 = m0.c(this.getLayoutInflater());
        L.o(m00, "inflate(...)");
        this.w = m00;
        if(m00 == null) {
            L.S("binding");
            m00 = null;
        }
        this.setContentView(m00.b());
        m0 m01 = this.w;
        if(m01 == null) {
            L.S("binding");
            m01 = null;
        }
        this.S0(m01.o);
        kr.bhbfhfb.designcompat.a.d(this);
        F0 f00 = this.F1();
        if(f00 == null) {
            this.finish();
            return;
        }
        com.dcinside.app.settings.image.i.d();
        dl dl0 = dl.a;
        if(!dl0.J2()) {
            dl0.r3(true);
            c c0 = this.N;
            if(c0 != null) {
                c0.dismissAllowingStateLoss();
            }
            FragmentManager fragmentManager0 = this.getSupportFragmentManager();
            L.o(fragmentManager0, "getSupportFragmentManager(...)");
            FragmentFactory fragmentFactory0 = fragmentManager0.G0();
            ClassLoader classLoader0 = c.class.getClassLoader();
            L.m(classLoader0);
            Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.settings.image.c");
            if(fragment0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.settings.image.AboutAutoImageDialog");
            }
            ((c)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(new V[0], 0))));
            ((c)fragment0).show(fragmentManager0, "com.dcinside.app.settings.image.c");
            this.N = (c)fragment0;
        }
        B b0 = B.E.V(f00);
        if(b0 == null) {
            m0 m04 = this.w;
            if(m04 == null) {
                L.S("binding");
                m04 = null;
            }
            L.o(m04.m, "defImgSettingProfileName");
            m04.m.setVisibility(8);
            m0 m05 = this.w;
            if(m05 == null) {
                L.S("binding");
                m05 = null;
            }
            L.o(m05.l, "defImgSettingProfileIcon");
            m05.l.setVisibility(8);
        }
        else {
            com.dcinside.app.main.login.g g0 = com.dcinside.app.main.login.g.a;
            m0 m02 = this.w;
            if(m02 == null) {
                L.S("binding");
                m02 = null;
            }
            TextView textView0 = m02.m;
            L.o(textView0, "defImgSettingProfileName");
            m0 m03 = this.w;
            if(m03 == null) {
                L.S("binding");
                m03 = null;
            }
            L.o(m03.l, "defImgSettingProfileIcon");
            g0.u(textView0, m03.l, b0);
        }
        this.c3();
        this.V2();
        if(this.getIntent().getBooleanExtra("DefaultImageSettingActivity_EXTRA_CAN_MAKE_AI_IMAGE", false)) {
            m0 m06 = this.w;
            if(m06 == null) {
                L.S("binding");
                m06 = null;
            }
            L.o(m06.n, "defImgSettingRecycler");
            Adapter recyclerView$Adapter0 = m06.n.getAdapter();
            if(!(recyclerView$Adapter0 instanceof K)) {
                recyclerView$Adapter0 = null;
            }
            if(L.g((((K)recyclerView$Adapter0) == null ? null : Boolean.valueOf(((K)recyclerView$Adapter0).F())), Boolean.TRUE)) {
                DefaultImageSettingActivity.i3(this, null, 1, null);
            }
        }
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        this.N = null;
        m0 m00 = this.w;
        if(m00 == null) {
            L.S("binding");
            m00 = null;
        }
        m00.n.setAdapter(null);
        p p0 = this.P;
        if(p0 != null) {
            p0.e();
        }
        this.P = null;
        o o0 = this.D;
        if(o0 != null) {
            o0.l();
        }
        this.F.l();
        this.G.l();
        this.H.l();
        this.I.l();
        this.J.l();
        this.K.l();
        this.L.l();
        rx.subscriptions.b b0 = this.M;
        if(b0 != null) {
            b0.c();
        }
        this.M = null;
        super.onDestroy();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    private final void p3(boolean z) {
        int v = 8;
        m0 m00 = null;
        if(L.g(this.x, "__DC_GLOBAL_DEF_IMAGE_ID")) {
            m0 m01 = this.w;
            if(m01 == null) {
                L.S("binding");
                m01 = null;
            }
            L.o(m01.h, "defImgSettingGalleryGroup");
            m01.h.setVisibility(8);
            m0 m02 = this.w;
            if(m02 == null) {
                L.S("binding");
            }
            else {
                m00 = m02;
            }
            L.o(m00.f, "defImgSettingGalleryDesc");
            m00.f.setVisibility(8);
            return;
        }
        if(z) {
            m0 m03 = this.w;
            if(m03 == null) {
                L.S("binding");
                m03 = null;
            }
            L.o(m03.h, "defImgSettingGalleryGroup");
            m03.h.setVisibility(4);
            m0 m04 = this.w;
            if(m04 == null) {
                L.S("binding");
            }
            else {
                m00 = m04;
            }
            L.o(m00.f, "defImgSettingGalleryDesc");
            m00.f.setVisibility(8);
            return;
        }
        m0 m05 = this.w;
        if(m05 == null) {
            L.S("binding");
            m05 = null;
        }
        L.o(m05.h, "defImgSettingGalleryGroup");
        m05.h.setVisibility(0);
        m0 m06 = this.w;
        if(m06 == null) {
            L.S("binding");
            m06 = null;
        }
        TextView textView0 = m06.f;
        L.o(textView0, "defImgSettingGalleryDesc");
        m0 m07 = this.w;
        if(m07 == null) {
            L.S("binding");
        }
        else {
            m00 = m07;
        }
        if(!m00.i.isChecked()) {
            v = 0;
        }
        textView0.setVisibility(v);
    }

    private final void q3(boolean z) {
        @s0({"SMAP\nDefaultImageSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$updateAutoImages$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,603:1\n257#2,2:604\n25#3:606\n*S KotlinDebug\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$updateAutoImages$1\n*L\n382#1:604,2\n383#1:606\n*E\n"})
        static final class com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.u extends N implements Function1 {
            final DefaultImageSettingActivity e;
            final boolean f;

            com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.u(DefaultImageSettingActivity defaultImageSettingActivity0, boolean z) {
                this.e = defaultImageSettingActivity0;
                this.f = z;
                super(1);
            }

            public final void a(j0.a a0) {
                m0 m00 = this.e.w;
                Adapter recyclerView$Adapter0 = null;
                if(m00 == null) {
                    L.S("binding");
                    m00 = null;
                }
                L.o(m00.b, "defImgProgress");
                m00.b.setVisibility(8);
                m0 m01 = this.e.w;
                if(m01 == null) {
                    L.S("binding");
                    m01 = null;
                }
                L.o(m01.n, "defImgSettingRecycler");
                Adapter recyclerView$Adapter1 = m01.n.getAdapter();
                if(recyclerView$Adapter1 instanceof K) {
                    recyclerView$Adapter0 = recyclerView$Adapter1;
                }
                if(((K)recyclerView$Adapter0) == null) {
                    return;
                }
                ((K)recyclerView$Adapter0).g0(a0.u(), a0.v());
                if(this.f) {
                    ((K)recyclerView$Adapter0).W();
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((j0.a)object0));
                return S0.a;
            }
        }

        o o0 = this.G;
        if(o0 != null) {
            o0.l();
        }
        m0 m00 = this.w;
        if(m00 == null) {
            L.S("binding");
            m00 = null;
        }
        L.o(m00.b, "defImgProgress");
        m00.b.setVisibility(0);
        this.G = uk.yk(this.x).y5((Object object0) -> {
            L.p(new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.u(this, z), "$tmp0");
            new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.u(this, z).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            m0 m00 = this.w;
            if(m00 == null) {
                L.S("binding");
                m00 = null;
            }
            L.o(m00.b, "defImgProgress");
            m00.b.setVisibility(8);
            s.C(throwable0.getMessage());
        });
    }

    static void r3(DefaultImageSettingActivity defaultImageSettingActivity0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        defaultImageSettingActivity0.q3(z);
    }

    // 检测为 Lambda 实现
    private static final void s3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void t3(DefaultImageSettingActivity defaultImageSettingActivity0, Throwable throwable0) [...]

    private final void u3(int[] arr_v) {
        static final class com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.v extends N implements Function1 {
            public static final com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.v e;

            static {
                com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.v.e = new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.v();
            }

            com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.v() {
                super(1);
            }

            public final List a(j0.a a0) {
                return a0.u();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((j0.a)object0));
            }
        }


        @s0({"SMAP\nDefaultImageSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$uploadImages$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,603:1\n1557#2:604\n1628#2,3:605\n*S KotlinDebug\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$uploadImages$2\n*L\n427#1:604\n427#1:605,3\n*E\n"})
        static final class com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.w extends N implements Function1 {
            final DefaultImageSettingActivity e;

            com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.w(DefaultImageSettingActivity defaultImageSettingActivity0) {
                this.e = defaultImageSettingActivity0;
                super(1);
            }

            public final rx.g b(List list0) {
                static final class com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.w.a extends N implements Function1 {
                    public static final com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.w.a e;

                    static {
                        com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.w.a.e = new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.w.a();
                    }

                    com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.w.a() {
                        super(1);
                    }

                    public final Boolean a(f0 f00) {
                        return true;
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((f0)object0));
                    }
                }

                if(list0.isEmpty()) {
                    return rx.g.Q2(Boolean.FALSE);
                }
                L.m(list0);
                ArrayList arrayList0 = new ArrayList(u.b0(list0, 10));
                for(Object object0: list0) {
                    arrayList0.add(String.valueOf(((AutoImage)object0).l()));
                }
                return uk.ik(this.e.x, arrayList0).g3((Object object0) -> {
                    L.p(com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.w.a.e, "$tmp0");
                    return (Boolean)com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.w.a.e.invoke(object0);
                });
            }

            // 检测为 Lambda 实现
            private static final Boolean c(Function1 function10, Object object0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((List)object0));
            }
        }


        static final class x extends N implements Function1 {
            final DefaultImageSettingActivity e;
            final int[] f;

            x(DefaultImageSettingActivity defaultImageSettingActivity0, int[] arr_v) {
                this.e = defaultImageSettingActivity0;
                this.f = arr_v;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.G2(this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        m0 m00 = this.w;
        if(m00 == null) {
            L.S("binding");
            m00 = null;
        }
        L.o(m00.b, "defImgProgress");
        m00.b.setVisibility(0);
        o o0 = this.L;
        if(o0 != null) {
            o0.l();
        }
        this.L = uk.yk(this.x).g3((Object object0) -> {
            L.p(com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.v.e, "$tmp0");
            return (List)com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.v.e.invoke(object0);
        }).f2((Object object0) -> {
            L.p(new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.w(this), "$tmp0");
            return (rx.g)new com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.w(this).invoke(object0);
        }).y5((Object object0) -> {
            L.p(new x(this, arr_v), "$tmp0");
            new x(this, arr_v).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            m0 m00 = this.w;
            if(m00 == null) {
                L.S("binding");
                m00 = null;
            }
            L.o(m00.b, "defImgProgress");
            m00.b.setVisibility(8);
            s.C(throwable0.getMessage());
        });
    }

    // 检测为 Lambda 实现
    private static final List v3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final rx.g w3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void x3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void y3(DefaultImageSettingActivity defaultImageSettingActivity0, Throwable throwable0) [...]

    private final void z3(String s, int v) {
        @s0({"SMAP\nDefaultImageSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$uploadLocalImage$1\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,603:1\n25#2:604\n257#3,2:605\n*S KotlinDebug\n*F\n+ 1 DefaultImageSettingActivity.kt\ncom/dcinside/app/settings/image/setting/DefaultImageSettingActivity$uploadLocalImage$1\n*L\n314#1:604\n316#1:605,2\n*E\n"})
        static final class y extends N implements Function1 {
            final DefaultImageSettingActivity e;
            final String f;
            final int g;

            y(DefaultImageSettingActivity defaultImageSettingActivity0, String s, int v) {
                this.e = defaultImageSettingActivity0;
                this.f = s;
                this.g = v;
                super(1);
            }

            public final void a(j0.e e0) {
                int[] arr_v;
                m0 m00 = this.e.w;
                Integer integer0 = null;
                if(m00 == null) {
                    L.S("binding");
                    m00 = null;
                }
                L.o(m00.n, "defImgSettingRecycler");
                Adapter recyclerView$Adapter0 = m00.n.getAdapter();
                if(!(recyclerView$Adapter0 instanceof K)) {
                    recyclerView$Adapter0 = null;
                }
                if(((K)recyclerView$Adapter0) != null) {
                    ((K)recyclerView$Adapter0).T(this.f, this.g);
                }
                m0 m01 = this.e.w;
                if(m01 == null) {
                    L.S("binding");
                    m01 = null;
                }
                L.o(m01.c, "defImgProgressContainer");
                m01.c.setVisibility(8);
                AutoImage autoImage0 = (AutoImage)u.G2(e0.l());
                if(autoImage0 != null) {
                    integer0 = autoImage0.l();
                }
                if(integer0 == null) {
                    s.A(0x7F15030E);  // string:failed_apply_notice "저장에 실패했습니다. 잠시 후 다시 시도해주세요."
                    if(((K)recyclerView$Adapter0) != null) {
                        ((K)recyclerView$Adapter0).notifyDataSetChanged();
                    }
                    return;
                }
                if(((K)recyclerView$Adapter0) == null) {
                    arr_v = new int[0];
                }
                else {
                    arr_v = ((K)recyclerView$Adapter0).C();
                    if(arr_v == null) {
                        arr_v = new int[0];
                    }
                }
                int[] arr_v1 = kotlin.collections.l.q3(arr_v, ((int)integer0));
                this.e.u3(arr_v1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((j0.e)object0));
                return S0.a;
            }
        }


        static final class z extends N implements Function1 {
            final Throwable e;

            z(Throwable throwable0) {
                this.e = throwable0;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.n(this.e.getMessage());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }

        o o0 = this.H;
        if(o0 != null) {
            o0.l();
        }
        p p0 = new p(1, this.O);
        this.P = p0;
        this.H = uk.QG(new String[]{s}, p0).y5((Object object0) -> {
            L.p(new y(this, s, v), "$tmp0");
            new y(this, s, v).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            m0 m00 = this.w;
            if(m00 == null) {
                L.S("binding");
                m00 = null;
            }
            L.o(m00.c, "defImgProgressContainer");
            m00.c.setVisibility(8);
            com.dcinside.app.perform.e.e.a(this).n(new z(throwable0)).z(0x7F15034A).b().t5();  // string:filter_apply "확인"
        });
    }
}

