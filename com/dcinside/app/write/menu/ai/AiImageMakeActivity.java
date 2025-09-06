package com.dcinside.app.write.menu.ai;

import A3.p;
import Y.E;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter.LengthFilter;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.URLSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.IntentCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.album.AlbumActivity;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.c;
import com.dcinside.app.model.AiImageStatusResult;
import com.dcinside.app.model.AiPromptLoadItem;
import com.dcinside.app.model.f0;
import com.dcinside.app.model.j;
import com.dcinside.app.model.k;
import com.dcinside.app.realm.B;
import com.dcinside.app.rx.bus.C;
import com.dcinside.app.rx.bus.G;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Gk;
import com.dcinside.app.util.cl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.uk;
import com.dcinside.app.write.menu.ai.character.CharaPromptSearchActivity;
import com.dcinside.app.write.menu.ai.lora.f;
import com.dcinside.app.write.menu.ai.lora.h;
import com.dcinside.app.write.menu.ai.lora.i;
import com.dcinside.app.write.menu.ai.model.e;
import com.dcinside.app.write.menu.ai.sampling.d;
import com.dcinside.app.write.menu.ai.type.AiModelItem;
import com.dcinside.app.write.menu.ai.type.LoraModel;
import com.hjq.toast.s;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import io.realm.F0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.text.v;
import kotlinx.coroutines.O;
import rx.o;
import rx.subscriptions.b;
import y4.l;
import y4.m;

@s0({"SMAP\nAiImageMakeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiImageMakeActivity.kt\ncom/dcinside/app/write/menu/ai/AiImageMakeActivity\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 7 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1345:1\n177#2,9:1346\n177#2,9:1355\n177#2,9:1364\n177#2,9:1373\n177#2,9:1382\n177#2,9:1407\n177#2,9:1422\n192#2,7:1431\n192#2,7:1442\n177#2,9:1449\n192#2,7:1458\n177#2,9:1465\n192#2,7:1474\n177#2,9:1497\n177#2,9:1514\n192#2,7:1523\n177#2,6:1530\n192#2,7:1536\n183#2,3:1543\n1#3:1391\n774#4:1392\n865#4,2:1393\n1863#4,2:1438\n1863#4,2:1440\n257#5,2:1395\n257#5,2:1397\n257#5,2:1399\n257#5,2:1401\n257#5,2:1403\n257#5,2:1481\n257#5,2:1483\n257#5,2:1493\n257#5,2:1495\n257#5,2:1506\n257#5,2:1508\n257#5,2:1510\n257#5,2:1512\n60#6:1405\n60#6:1406\n37#7,2:1416\n37#7,2:1485\n37#7,2:1491\n13346#8,2:1418\n13346#8,2:1420\n13346#8,2:1487\n13346#8,2:1489\n*S KotlinDebug\n*F\n+ 1 AiImageMakeActivity.kt\ncom/dcinside/app/write/menu/ai/AiImageMakeActivity\n*L\n182#1:1346,9\n184#1:1355,9\n186#1:1364,9\n188#1:1373,9\n190#1:1382,9\n440#1:1407,9\n533#1:1422,9\n534#1:1431,7\n764#1:1442,7\n789#1:1449,9\n790#1:1458,7\n802#1:1465,9\n803#1:1474,7\n1046#1:1497,9\n1141#1:1514,9\n1142#1:1523,7\n1252#1:1530,6\n1253#1:1536,7\n1252#1:1543,3\n243#1:1392\n243#1:1393,2\n607#1:1438,2\n634#1:1440,2\n246#1:1395,2\n342#1:1397,2\n343#1:1399,2\n372#1:1401,2\n373#1:1403,2\n811#1:1481,2\n813#1:1483,2\n983#1:1493,2\n984#1:1495,2\n1058#1:1506,2\n1059#1:1508,2\n1060#1:1510,2\n1062#1:1512,2\n377#1:1405\n380#1:1406\n446#1:1416,2\n884#1:1485,2\n954#1:1491,2\n454#1:1418,2\n466#1:1420,2\n894#1:1487,2\n904#1:1489,2\n*E\n"})
public final class AiImageMakeActivity extends g implements com.dcinside.app.write.menu.ai.lora.g, h, a, d, PermissionListener {
    public static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.a {
        private com.dcinside.app.write.menu.ai.AiImageMakeActivity.a() {
        }

        public com.dcinside.app.write.menu.ai.AiImageMakeActivity.a(w w0) {
        }

        public final void a(@l AppCompatActivity appCompatActivity0, @m String s, @l AiImageStatusResult aiImageStatusResult0, long v, boolean z, @m ActivityResultLauncher activityResultLauncher0) {
            L.p(appCompatActivity0, "activity");
            L.p(aiImageStatusResult0, "statusResult");
            Intent intent0 = new Intent(appCompatActivity0, AiImageMakeActivity.class);
            intent0.putExtra("EXTRA_GALLERY_ID", s);
            intent0.putExtra("EXTRA_INFO", aiImageStatusResult0);
            intent0.putExtra("EXTRA_REMAIN_IMAGE_COUNT", v);
            intent0.putExtra("EXTRA_NEED_CHECK_GUEST", z);
            if(activityResultLauncher0 != null) {
                activityResultLauncher0.b(intent0);
            }
        }

        public final void b(@l AppCompatActivity appCompatActivity0, @l AiImageStatusResult aiImageStatusResult0, @m String s, @m ActivityResultLauncher activityResultLauncher0) {
            L.p(appCompatActivity0, "activity");
            L.p(aiImageStatusResult0, "statusResult");
            Intent intent0 = new Intent(appCompatActivity0, AiImageMakeActivity.class);
            intent0.putExtra("EXTRA_INFO", aiImageStatusResult0);
            intent0.putExtra("EXTRA_DEF_IMAGE", true);
            intent0.putExtra("EXTRA_DEF_AI_PROMPT", s);
            intent0.putExtra("EXTRA_REMAIN_IMAGE_COUNT", 2L);
            if(activityResultLauncher0 != null) {
                activityResultLauncher0.b(intent0);
            }
        }
    }

    @l
    private final com.dcinside.app.write.menu.ai.lora.a A;
    @l
    private final com.dcinside.app.write.menu.ai.model.a B;
    @l
    private final P C;
    @l
    private final P D;
    @m
    private com.dcinside.app.write.menu.ai.a E;
    private int F;
    @l
    private String G;
    @m
    private ActivityResultLauncher H;
    @m
    private o I;
    @m
    private o J;
    @m
    private b K;
    @m
    private o L;
    @m
    private i M;
    @l
    private com.dcinside.app.write.menu.ai.type.h M8;
    @m
    private f N;
    @m
    private String N8;
    @m
    private e O;
    @m
    private String O8;
    @m
    private n0 P;
    @l
    private final D P8;
    @l
    private Q Q;
    @m
    private String Q8;
    @m
    private ActivityResultLauncher R8;
    @m
    private ActivityResultLauncher S8;
    private boolean T8;
    private boolean U8;
    private boolean V8;
    @m
    private com.dcinside.app.post.fragments.g W8;
    @m
    private Long X;
    @l
    public static final com.dcinside.app.write.menu.ai.AiImageMakeActivity.a X8 = null;
    @m
    private String Y;
    @l
    public static final String Y8 = "ACTION_EXECUTE_PROMPT_IMAGE";
    @m
    private o Z;
    @l
    public static final String Z8 = "ACTION_SELECT_RESAMPLE_IMAGE";
    @l
    private static final String a9 = "EXTRA_NEED_CHECK_GUEST";
    @l
    private static final String b9 = "EXTRA_REMAIN_IMAGE_COUNT";
    @l
    public static final String c9 = "EXTRA_INFO";
    @l
    private static final String d9 = "EXTRA_GALLERY_ID";
    @l
    public static final String e9 = "EXTRA_AI_IMAGE_RESULT_DATA";
    @l
    public static final String f9 = "EXTRA_AI_IMAGE_RESAMPLE_IMAGE";
    @l
    public static final String g9 = "EXTRA_LOAD_ITEM_DATA";
    @l
    public static final String h9 = "EXTRA_PROMPT_RESULT_JSON";
    @l
    public static final String i9 = "EXTRA_MODIFY_PROMPT";
    @l
    private static final String j9 = "EXTRA_DEF_IMAGE";
    @l
    private static final String k9 = "EXTRA_DEF_AI_PROMPT";
    private static final float l9 = 2.0f;
    private static final float m9 = 0.1f;
    private static final float n9 = 1.0f;
    private static final int o9 = 2000;
    private E w;
    private AiImageStatusResult x;
    @l
    private final o0 y;
    @l
    private final com.dcinside.app.write.menu.ai.sampling.a z;

    static {
        AiImageMakeActivity.X8 = new com.dcinside.app.write.menu.ai.AiImageMakeActivity.a(null);
    }

    public AiImageMakeActivity() {
        public static final class D extends OnBackPressedCallback {
            final AiImageMakeActivity d;

            D(AiImageMakeActivity aiImageMakeActivity0) {
                this.d = aiImageMakeActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                if(this.d.U8 && this.d.Z2()) {
                    this.d.c3();
                    return;
                }
                this.d.finish();
            }
        }

        this.y = new o0(this);
        this.z = new com.dcinside.app.write.menu.ai.sampling.a(this);
        this.A = new com.dcinside.app.write.menu.ai.lora.a(this, false);
        this.B = new com.dcinside.app.write.menu.ai.model.a(false, this);
        this.C = new P(this);
        this.D = new P(this);
        this.G = "";
        this.Q = new Q(false, false, 3, null);
        this.M8 = com.dcinside.app.write.menu.ai.type.h.f;
        this.P8 = new D(this);
    }

    private final void A3() {
        boolean z = this.Q.e();
        E e0 = this.w;
        E e1 = null;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        L.o(e0.B.e, "aiLolaDesc");
        int v = 8;
        e0.B.e.setVisibility((z ? 8 : 0));
        E e2 = this.w;
        if(e2 == null) {
            L.S("binding");
            e2 = null;
        }
        L.o(e2.B.c, "aiLolaAll");
        e2.B.c.setVisibility((z ? 8 : 0));
        E e3 = this.w;
        if(e3 == null) {
            L.S("binding");
            e3 = null;
        }
        L.o(e3.B.f, "aiLolaList");
        e3.B.f.setVisibility((z ? 8 : 0));
        boolean z1 = this.Q.f();
        E e4 = this.w;
        if(e4 == null) {
            L.S("binding");
            e4 = null;
        }
        LinearLayout linearLayout0 = e4.B.k;
        L.o(linearLayout0, "aiNegativePromptInputWrap");
        if(!z1) {
            v = 0;
        }
        linearLayout0.setVisibility(v);
        E e5 = this.w;
        if(e5 == null) {
            L.S("binding");
            e5 = null;
        }
        float f = 0.0f;
        e5.B.l.setRotation((z1 ? 0.0f : 180.0f));
        E e6 = this.w;
        if(e6 == null) {
            L.S("binding");
        }
        else {
            e1 = e6;
        }
        ImageView imageView0 = e1.B.g;
        if(!z) {
            f = 180.0f;
        }
        imageView0.setRotation(f);
    }

    private final void B3() {
        int v = this.A.x();
        E e0 = this.w;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        String s = this.getString(0x7F15058B, new Object[]{v, 2});  // string:make_ai_image_count "(%1$d/%2$d)"
        e0.B.d.setText(s);
    }

    private final void C3() {
        List list0;
        AiModelItem aiModelItem0 = this.B.w();
        E e0 = this.w;
        AiImageStatusResult aiImageStatusResult0 = null;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        String s = this.getString(aiModelItem0.c().d());
        e0.z.h.setText(s);
        E e1 = this.w;
        if(e1 == null) {
            L.S("binding");
            e1 = null;
        }
        e1.z.f.setText(aiModelItem0.a());
        if(this.B.x()) {
            AiImageStatusResult aiImageStatusResult1 = this.x;
            if(aiImageStatusResult1 == null) {
                L.S("info");
            }
            else {
                aiImageStatusResult0 = aiImageStatusResult1;
            }
            list0 = aiImageStatusResult0.w().g();
        }
        else {
            AiImageStatusResult aiImageStatusResult2 = this.x;
            if(aiImageStatusResult2 == null) {
                L.S("info");
            }
            else {
                aiImageStatusResult0 = aiImageStatusResult2;
            }
            list0 = aiImageStatusResult0.w().f();
        }
        this.z.A(list0);
        this.K(this.z.x());
    }

    private final void D3(G g0) {
        this.B.y(g0.a());
        this.C3();
    }

    private final void E3(C c0) {
        LoraModel loraModel0 = c0.a();
        if(LoraModel.j.b(loraModel0)) {
            this.C.A(loraModel0);
        }
        else {
            this.D.A(loraModel0);
        }
        this.A.v(c0.a());
        this.B3();
    }

    private final void F3(AiPromptLoadItem aiPromptLoadItem0) {
        this.X = aiPromptLoadItem0.i();
        this.Y = aiPromptLoadItem0.q();
        String s = aiPromptLoadItem0.q();
        String s1 = aiPromptLoadItem0.o();
        String s2 = "";
        if(s1 == null) {
            s1 = "";
        }
        String s3 = aiPromptLoadItem0.m();
        if(s3 != null) {
            s2 = s3;
        }
        AiImageStatusResult aiImageStatusResult0 = this.x;
        E e0 = null;
        if(aiImageStatusResult0 == null) {
            L.S("info");
            aiImageStatusResult0 = null;
        }
        LoraModel[] arr_loraModel = (LoraModel[])aiImageStatusResult0.o().toArray(new LoraModel[0]);
        com.dcinside.app.write.menu.ai.lora.d d0 = com.dcinside.app.write.menu.ai.lora.d.c.a(s1, arr_loraModel);
        com.dcinside.app.write.menu.ai.lora.d d1 = com.dcinside.app.write.menu.ai.lora.d.c.a(s2, arr_loraModel);
        E e1 = this.w;
        if(e1 == null) {
            L.S("binding");
            e1 = null;
        }
        e1.B.q.setText(null);
        E e2 = this.w;
        if(e2 == null) {
            L.S("binding");
            e2 = null;
        }
        e2.B.i.setText(null);
        ArrayList arrayList0 = new ArrayList();
        if(d0 != null) {
            ArrayList arrayList1 = new ArrayList();
            LoraModel[] arr_loraModel1 = d0.a();
            for(int v = 0; v < arr_loraModel1.length; ++v) {
                LoraModel loraModel0 = arr_loraModel1[v];
                if(arrayList0.size() < 2) {
                    arrayList0.add(loraModel0);
                    arrayList1.add(loraModel0);
                }
            }
            this.C.C(arrayList1);
            E e3 = this.w;
            if(e3 == null) {
                L.S("binding");
                e3 = null;
            }
            e3.B.q.setText(d0.b());
        }
        if(d1 != null) {
            ArrayList arrayList2 = new ArrayList();
            LoraModel[] arr_loraModel2 = d1.a();
            for(int v1 = 0; v1 < arr_loraModel2.length; ++v1) {
                LoraModel loraModel1 = arr_loraModel2[v1];
                if(arrayList0.size() < 2) {
                    arrayList0.add(loraModel1);
                    arrayList2.add(loraModel1);
                }
            }
            this.D.C(arrayList2);
            E e4 = this.w;
            if(e4 == null) {
                L.S("binding");
                e4 = null;
            }
            e4.B.i.setText(d1.b());
        }
        this.A.F(arrayList0);
        if(s == null || s.length() == 0) {
            E e6 = this.w;
            if(e6 == null) {
                L.S("binding");
                e6 = null;
            }
            e6.r.setText(null);
        }
        else {
            E e5 = this.w;
            if(e5 == null) {
                L.S("binding");
            }
            else {
                e0 = e5;
            }
            String s4 = this.getString(0x7F1505FD, new Object[]{s});  // string:make_ai_save_loaded_title "저장명: %s"
            e0.r.setText(s4);
            this.i4(s);
        }
        this.B3();
    }

    private final void G3(String s) {
        String s1;
        E e0 = this.w;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        EditText editText0 = e0.B.q;
        L.o(editText0, "aiPromptInput");
        Editable editable0 = editText0.getText();
        if(editable0 == null) {
            s1 = "";
        }
        else {
            s1 = editable0.toString();
            if(s1 == null) {
                s1 = "";
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(s1.length() > 0) {
            if(editText0.length() + s.length() > 2000) {
                s.C(this.getString(0x7F1502B2, new Object[]{2000}));  // string:error_prompt_max_length "%1$d자 제한을 초과하여 입력할 수 없습니다."
                return;
            }
            if(v.N1(s1, ",", false, 2, null)) {
                stringBuilder0.append(" \n");
            }
            else if(v.N1(s1, ", ", false, 2, null)) {
                stringBuilder0.append("\n");
            }
            else {
                stringBuilder0.append(", \n");
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", ");
        editText0.append(stringBuilder0.toString());
    }

    public final void H3(@l LoraModel loraModel0) {
        L.p(loraModel0, "model");
        this.A.D(loraModel0);
        this.C.v(loraModel0);
        this.D.v(loraModel0);
        this.B3();
    }

    @Override  // com.dcinside.app.write.menu.ai.lora.g
    public void I(@l LoraModel loraModel0) {
        L.p(loraModel0, "model");
        this.A.D(loraModel0);
        this.B3();
    }

    private final void I3() {
        int v = 0;
        boolean z = this.N8 == null || this.N8.length() == 0;
        E e0 = this.w;
        E e1 = null;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        L.o(e0.b.q, "aiControlResampleImageImport");
        e0.b.q.setVisibility((z ? 0 : 8));
        E e2 = this.w;
        if(e2 == null) {
            L.S("binding");
            e2 = null;
        }
        ConstraintLayout constraintLayout0 = e2.b.r;
        L.o(constraintLayout0, "aiControlResampleImageWrap");
        if(z) {
            v = 8;
        }
        constraintLayout0.setVisibility(v);
        String s = this.N8;
        if(s != null) {
            if(s.length() <= 0) {
                s = null;
            }
            if(s != null) {
                E e3 = this.w;
                if(e3 == null) {
                    L.S("binding");
                }
                else {
                    e1 = e3;
                }
                L.o(e1.b.o, "aiControlResampleImage");
                com.dcinside.app.glide.a.l(e1.b.o).t0(s).q1(e1.b.o);
            }
        }
    }

    private final void J3() {
        if(this.M8 == com.dcinside.app.write.menu.ai.type.h.f) {
            this.M8 = com.dcinside.app.write.menu.ai.type.h.d;
        }
        E e0 = this.w;
        E e1 = null;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        e0.b.i.setText(this.M8.c());
        E e2 = this.w;
        if(e2 == null) {
            L.S("binding");
            e2 = null;
        }
        boolean z = false;
        e2.b.g.setSelected(this.M8 == com.dcinside.app.write.menu.ai.type.h.c);
        E e3 = this.w;
        if(e3 == null) {
            L.S("binding");
            e3 = null;
        }
        e3.b.k.setSelected(this.M8 == com.dcinside.app.write.menu.ai.type.h.d);
        E e4 = this.w;
        if(e4 == null) {
            L.S("binding");
        }
        else {
            e1 = e4;
        }
        TextView textView0 = e1.b.h;
        if(this.M8 == com.dcinside.app.write.menu.ai.type.h.e) {
            z = true;
        }
        textView0.setSelected(z);
    }

    @Override  // com.dcinside.app.write.menu.ai.sampling.d
    public void K(@m com.dcinside.app.write.menu.ai.type.e e0) {
        E e1 = null;
        Integer integer0 = e0 == null ? null : this.z.w(e0);
        if(integer0 != null && ((int)integer0) >= 0) {
            String s = this.getString(e0.d());
            L.o(s, "getString(...)");
            E e2 = this.w;
            if(e2 == null) {
                L.S("binding");
                e2 = null;
            }
            TextView textView0 = e2.A.d;
            if(((int)integer0) == 0) {
                s = this.getString(0x7F1505B2, new Object[]{s});  // string:make_ai_image_sampling_default "%1$s (기본)"
            }
            textView0.setText(s);
            E e3 = this.w;
            if(e3 == null) {
                L.S("binding");
            }
            else {
                e1 = e3;
            }
            e1.A.b.scrollToPosition(((int)integer0));
            return;
        }
        E e4 = this.w;
        if(e4 == null) {
            L.S("binding");
        }
        else {
            e1 = e4;
        }
        e1.A.d.setText("");
    }

    private final void K3(View view0) {
        com.dcinside.app.write.menu.ai.type.h h0;
        switch(view0.getId()) {
            case 0x7F0B00B2: {  // id:ai_control_mode_balance
                h0 = com.dcinside.app.write.menu.ai.type.h.c;
                break;
            }
            case 0x7F0B00B3: {  // id:ai_control_mode_control
                h0 = com.dcinside.app.write.menu.ai.type.h.e;
                break;
            }
            case 0x7F0B00B6: {  // id:ai_control_mode_prompt
                h0 = com.dcinside.app.write.menu.ai.type.h.d;
                break;
            }
            default: {
                h0 = com.dcinside.app.write.menu.ai.type.h.d;
            }
        }
        this.M8 = h0;
        this.J3();
    }

    public final void L3(@l AiPromptLoadItem aiPromptLoadItem0) {
        L.p(aiPromptLoadItem0, "item");
        this.Y = aiPromptLoadItem0.q();
        Long long0 = aiPromptLoadItem0.i();
        E e0 = null;
        if(long0.longValue() <= 0L) {
            long0 = null;
        }
        this.X = long0;
        String s = this.Y;
        if(s != null) {
            E e1 = this.w;
            if(e1 == null) {
                L.S("binding");
            }
            else {
                e0 = e1;
            }
            String s1 = this.getString(0x7F1505FD, new Object[]{s});  // string:make_ai_save_loaded_title "저장명: %s"
            e0.r.setText(s1);
        }
    }

    private final void M3(boolean z) {
        Float float0;
        E e0 = null;
        try {
            E e1 = this.w;
            if(e1 == null) {
                L.S("binding");
                e1 = null;
            }
            float0 = v.N0(e1.b.v.getText().toString());
        }
        catch(Exception unused_ex) {
            float0 = null;
        }
        float f = float0 == null ? 1.0f : ((float)float0);
        float f1 = z ? Math.min(f + 0.1f, 2.0f) : Math.max(f - 0.1f, 0.1f);
        E e2 = this.w;
        if(e2 == null) {
            L.S("binding");
        }
        else {
            e0 = e2;
        }
        L.o("%.1f", "getString(...)");
        String s = String.format("%.1f", Arrays.copyOf(new Object[]{f1}, 1));
        L.o(s, "format(...)");
        e0.b.v.setText(s);
    }

    private final void N3() {
        boolean z;
        if(this.A.x() <= 0) {
            E e0 = this.w;
            E e1 = null;
            if(e0 == null) {
                L.S("binding");
                e0 = null;
            }
            Editable editable0 = e0.B.q.getText();
            if(editable0 == null) {
            label_12:
                E e2 = this.w;
                if(e2 == null) {
                    L.S("binding");
                }
                else {
                    e1 = e2;
                }
                Editable editable1 = e1.B.i.getText();
                if(editable1 == null) {
                    z = false;
                }
                else {
                    String s1 = editable1.toString();
                    z = s1 != null && s1.length() > 0;
                }
            }
            else {
                String s = editable0.toString();
                if(s != null && s.length() > 0) {
                    z = true;
                    AiImageHistoryActivity.C.a(this, this.R8, z);
                    return;
                }
                goto label_12;
            }
        }
        else {
            z = true;
        }
        AiImageHistoryActivity.C.a(this, this.R8, z);
    }

    private final void O3(String s, boolean z) {
        if(z) {
            com.dcinside.app.main.a.i(this, s);
            return;
        }
        com.dcinside.app.main.a.k(this, s, true);
    }

    private final void P3() {
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.E extends N implements Function1 {
            final AiImageMakeActivity e;
            final com.dcinside.app.model.f f;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.E(AiImageMakeActivity aiImageMakeActivity0, com.dcinside.app.model.f f0) {
                this.e = aiImageMakeActivity0;
                this.f = f0;
                super(1);
            }

            public final void a(com.dcinside.app.model.g g0) {
                if(L.g(g0.k(), Boolean.TRUE)) {
                    Intent intent0 = new Intent();
                    intent0.putExtra("EXTRA_AI_IMAGE_RESULT_DATA", g0.h());
                    intent0.putExtra("EXTRA_AI_IMAGE_RESAMPLE_IMAGE", g0.j());
                    this.e.a4(this.f);
                    this.e.b4();
                    this.e.setResult(-1, intent0);
                    this.e.finish();
                    return;
                }
                this.e.f4((g0.i() == null ? "" : g0.i()));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.g)object0));
                return S0.a;
            }
        }

        com.dcinside.app.model.f f0 = new com.dcinside.app.model.f();
        f0.l(this.B.w().c().e());
        f0.k(this.Q8);
        E e0 = null;
        if(this.N8 != null && this.N8.length() > 0) {
            f0.q(this.M8);
            f0.o(this.O8);
            f0.p((this.N8 == null ? null : v.s5(this.N8, '.', "")));
            E e1 = this.w;
            if(e1 == null) {
                L.S("binding");
                e1 = null;
            }
            Float float0 = v.N0(e1.b.v.getText().toString());
            f0.r(((float)(float0 == null ? 1.0f : ((float)float0))));
        }
        f0.n(this.m3());
        f0.m(this.l3());
        com.dcinside.app.write.menu.ai.type.e e2 = this.z.x();
        f0.s((e2 == null ? null : e2.e()));
        E e3 = this.w;
        if(e3 == null) {
            L.S("binding");
        }
        else {
            e0 = e3;
        }
        f0.t(e0.A.e.isChecked());
        this.J = uk.vG(f0, false).R1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                this.R2(true, false);
            }
        }).T1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                this.R2(false, false);
            }
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.write.menu.ai.AiImageMakeActivity.E(this, f0), "$tmp0");
            new com.dcinside.app.write.menu.ai.AiImageMakeActivity.E(this, f0).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.o("잠시 후 다시 시도해주세요.", "getString(...)");
            this.f4("잠시 후 다시 시도해주세요.");
        });
    }

    private final void Q2() {
        o o0 = this.I;
        if(o0 != null) {
            o0.l();
        }
    }

    // 检测为 Lambda 实现
    private static final void Q3(AiImageMakeActivity aiImageMakeActivity0) [...]

    private final void R2(boolean z, boolean z1) {
        int v = 8;
        E e0 = null;
        if(z1) {
            E e1 = this.w;
            if(e1 == null) {
                L.S("binding");
            }
            else {
                e0 = e1;
            }
            ConstraintLayout constraintLayout0 = e0.n;
            L.o(constraintLayout0, "makeAiImagePromptProgressWrap");
            if(z) {
                v = 0;
            }
            constraintLayout0.setVisibility(v);
            return;
        }
        E e2 = this.w;
        if(e2 == null) {
            L.S("binding");
        }
        else {
            e0 = e2;
        }
        ConstraintLayout constraintLayout1 = e0.m;
        L.o(constraintLayout1, "makeAiImageProgressWrap");
        if(z) {
            v = 0;
        }
        constraintLayout1.setVisibility(v);
    }

    // 检测为 Lambda 实现
    private static final void R3(AiImageMakeActivity aiImageMakeActivity0) [...]

    private final void S2(A3.a a0) {
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.b extends N implements Function1 {
            final AiImageMakeActivity e;
            final A3.a f;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.b(AiImageMakeActivity aiImageMakeActivity0, A3.a a0) {
                this.e = aiImageMakeActivity0;
                this.f = a0;
                super(1);
            }

            public final void a(f0 f00) {
                if(f00.f()) {
                    this.e.V8 = true;
                    this.f.invoke();
                    return;
                }
                this.e.h4(f00.a());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        boolean z = false;
        boolean z1 = this.getIntent().getBooleanExtra("EXTRA_NEED_CHECK_GUEST", false);
        String s = this.Q8;
        if(B.E.k0() != null) {
            z = true;
        }
        if(z1 && !this.V8 && !z) {
            this.L = uk.Qj(s).R1(() -> {
                L.p(this, "this$0");
                if(this.q1()) {
                    this.R2(true, false);
                }
            }).T1(() -> {
                L.p(this, "this$0");
                if(this.q1()) {
                    this.R2(false, false);
                }
            }).y5((Object object0) -> {
                L.p(new com.dcinside.app.write.menu.ai.AiImageMakeActivity.b(this, a0), "$tmp0");
                new com.dcinside.app.write.menu.ai.AiImageMakeActivity.b(this, a0).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                com.dcinside.app.perform.e e0 = com.dcinside.app.perform.e.e.a(this);
                L.m(throwable0);
                e0.q(throwable0);
            });
            return;
        }
        this.V8 = true;
        a0.invoke();
    }

    // 检测为 Lambda 实现
    private static final void S3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void T2(AiImageMakeActivity aiImageMakeActivity0) [...]

    // 检测为 Lambda 实现
    private static final void T3(AiImageMakeActivity aiImageMakeActivity0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void U2(AiImageMakeActivity aiImageMakeActivity0) [...]

    private final void U3(Collection collection0) {
        static final class F extends N implements Function1 {
            final AiImageMakeActivity e;
            final String f;

            F(AiImageMakeActivity aiImageMakeActivity0, String s) {
                this.e = aiImageMakeActivity0;
                this.f = s;
                super(1);
            }

            public final void a(k k0) {
                if(L.g(k0.h(), Boolean.TRUE)) {
                    this.e.O8 = k0.g();
                    this.e.N8 = this.f;
                    this.e.J3();
                    this.e.I3();
                    return;
                }
                c.w(this.e, (k0.f() == null ? "" : k0.f()));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((k)object0));
                return S0.a;
            }
        }

        String s = (String)u.E2(collection0);
        if(s == null) {
            return;
        }
        if(this.b3(s)) {
            return;
        }
        if(this.T8) {
            this.N8 = s;
            this.J3();
            this.I3();
            return;
        }
        this.Z = uk.xG(s, this.Q8).R1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                this.R2(true, false);
            }
        }).T1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                this.R2(false, false);
            }
        }).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new F(this, s), "$tmp0");
            new F(this, s).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            com.dcinside.app.perform.e e0 = com.dcinside.app.perform.e.e.a(this);
            L.m(throwable0);
            e0.q(throwable0);
        });
    }

    // 检测为 Lambda 实现
    private static final void V2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void V3(AiImageMakeActivity aiImageMakeActivity0) [...]

    // 检测为 Lambda 实现
    private static final void W2(AiImageMakeActivity aiImageMakeActivity0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void W3(AiImageMakeActivity aiImageMakeActivity0) [...]

    private final void X2() {
        String s = B.E.k0();
        int v = 0;
        boolean z = s != null && s.length() > 0;
        E e0 = this.w;
        E e1 = null;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        L.o(e0.B.t, "aiPromptLoad");
        e0.B.t.setVisibility((z ? 0 : 8));
        E e2 = this.w;
        if(e2 == null) {
            L.S("binding");
        }
        else {
            e1 = e2;
        }
        TextView textView0 = e1.B.v;
        L.o(textView0, "aiPromptSave");
        if(!z) {
            v = 8;
        }
        textView0.setVisibility(v);
    }

    // 检测为 Lambda 实现
    private static final void X3(Function1 function10, Object object0) [...]

    private final boolean Y2() {
        if(this.m3().length() == 0) {
            L.o("프롬프트를 입력해 주세요.", "getString(...)");
            this.f4("프롬프트를 입력해 주세요.");
            return false;
        }
        if(this.n3() > 4) {
            String s = this.getString(0x7F1505DC, new Object[]{2});  // string:make_ai_lora_limit "로라는 %d개까지 등록 가능합니다."
            L.o(s, "getString(...)");
            this.f4(s);
            return false;
        }
        return true;
    }

    // 检测为 Lambda 实现
    private static final void Y3(AiImageMakeActivity aiImageMakeActivity0, Throwable throwable0) [...]

    @Override  // com.dcinside.app.write.menu.ai.lora.h
    public void Z(@l LoraModel loraModel0) {
        L.p(loraModel0, "model");
        this.B3();
        this.C.v(loraModel0);
        this.D.v(loraModel0);
    }

    private final boolean Z2() {
        String s = this.getIntent().getStringExtra("EXTRA_DEF_AI_PROMPT");
        com.dcinside.app.model.f f0 = new com.dcinside.app.model.f();
        f0.l(this.B.w().c().e());
        f0.k(this.Q8);
        E e0 = null;
        if(this.N8 != null && this.N8.length() > 0) {
            f0.q(this.M8);
            f0.o(this.N8);
            f0.p((this.N8 == null ? null : v.s5(this.N8, '.', "")));
            E e1 = this.w;
            if(e1 == null) {
                L.S("binding");
                e1 = null;
            }
            Float float0 = v.N0(e1.b.v.getText().toString());
            f0.r(((float)(float0 == null ? 1.0f : ((float)float0))));
        }
        f0.n(this.m3());
        f0.m(this.l3());
        com.dcinside.app.write.menu.ai.type.e e2 = this.z.x();
        f0.s((e2 == null ? null : e2.e()));
        E e3 = this.w;
        if(e3 == null) {
            L.S("binding");
        }
        else {
            e0 = e3;
        }
        f0.t(e0.A.e.isChecked());
        return !L.g(s, uk.a.D(f0));
    }

    private final void Z3() {
        String s = this.m3();
        if(s.length() == 0) {
            L.o("프롬프트를 입력해 주세요.", "getString(...)");
            this.f4("프롬프트를 입력해 주세요.");
            return;
        }
        n0 n00 = this.P;
        if(n00 != null) {
            try {
                n00.dismissAllowingStateLoss();
            }
            catch(Exception unused_ex) {
            }
        }
        V[] arr_v = {r0.a("EXTRA_POSITIVE_PROMPTS", s), r0.a("EXTRA_NEGATIVE_PROMPTS", this.l3()), r0.a("EXTRA_EDITED_ITEM_INDEX", this.X), r0.a("EXTRA_EDITED_ITEM_TITLE", this.Y)};
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = n0.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.write.menu.ai.n0");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.write.menu.ai.AiPromptSaveDialog");
        }
        ((n0)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 4))));
        ((n0)fragment0).show(fragmentManager0, "com.dcinside.app.write.menu.ai.n0");
        this.P = (n0)fragment0;
    }

    private final void a3() {
        E e6;
        com.dcinside.app.model.f f0;
        if(!this.T8) {
            return;
        }
        String s = this.getIntent().getStringExtra("EXTRA_DEF_AI_PROMPT");
        if(s == null) {
            return;
        }
        try {
            f0 = null;
            f0 = (com.dcinside.app.model.f)uk.a.r(s, com.dcinside.app.model.f.class);
        }
        catch(Exception unused_ex) {
        }
        if(f0 == null) {
            return;
        }
        this.U8 = true;
        String s1 = f0.d();
        String s2 = "";
        if(s1 == null) {
            s1 = "";
        }
        String s3 = f0.c();
        if(s3 != null) {
            s2 = s3;
        }
        String s4 = f0.i();
        String s5 = f0.b();
        AiImageStatusResult aiImageStatusResult0 = this.x;
        if(aiImageStatusResult0 == null) {
            L.S("info");
            aiImageStatusResult0 = null;
        }
        LoraModel[] arr_loraModel = (LoraModel[])aiImageStatusResult0.o().toArray(new LoraModel[0]);
        E e0 = this.w;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        e0.B.q.setText(null);
        E e1 = this.w;
        if(e1 == null) {
            L.S("binding");
            e1 = null;
        }
        e1.B.i.setText(null);
        ArrayList arrayList0 = new ArrayList();
        com.dcinside.app.write.menu.ai.lora.d d0 = com.dcinside.app.write.menu.ai.lora.d.c.a(s1, arr_loraModel);
        if(d0 != null) {
            ArrayList arrayList1 = new ArrayList();
            LoraModel[] arr_loraModel1 = d0.a();
            for(int v = 0; v < arr_loraModel1.length; ++v) {
                LoraModel loraModel0 = arr_loraModel1[v];
                if(arrayList0.size() < 2) {
                    arrayList0.add(loraModel0);
                    arrayList1.add(loraModel0);
                }
            }
            this.C.C(arrayList1);
            E e2 = this.w;
            if(e2 == null) {
                L.S("binding");
                e2 = null;
            }
            e2.B.q.setText(d0.b());
        }
        com.dcinside.app.write.menu.ai.lora.d d1 = com.dcinside.app.write.menu.ai.lora.d.c.a(s2, arr_loraModel);
        if(d1 != null) {
            ArrayList arrayList2 = new ArrayList();
            LoraModel[] arr_loraModel2 = d1.a();
            for(int v1 = 0; v1 < arr_loraModel2.length; ++v1) {
                LoraModel loraModel1 = arr_loraModel2[v1];
                if(arrayList0.size() < 2) {
                    arrayList0.add(loraModel1);
                    arrayList2.add(loraModel1);
                }
            }
            this.D.C(arrayList2);
            E e3 = this.w;
            if(e3 == null) {
                L.S("binding");
                e3 = null;
            }
            e3.B.i.setText(d1.b());
        }
        this.A.F(arrayList0);
        this.B3();
        com.dcinside.app.write.menu.ai.type.e e4 = com.dcinside.app.write.menu.ai.type.e.d.a(s4);
        this.z.B(e4);
        this.K(this.z.x());
        com.dcinside.app.write.menu.ai.type.a a0 = com.dcinside.app.write.menu.ai.type.a.d.a(s5);
        if(a0 != null) {
            this.B.z(a0);
            this.z3();
            this.C3();
        }
        this.N8 = f0.e();
        this.M8 = f0.g() == null ? com.dcinside.app.write.menu.ai.type.h.f : f0.g();
        Float float0 = f0.h();
        if(float0 != null) {
            E e5 = this.w;
            if(e5 == null) {
                L.S("binding");
                e6 = null;
            }
            else {
                e6 = e5;
            }
            L.o("%.1f", "getString(...)");
            String s6 = String.format("%.1f", Arrays.copyOf(new Object[]{float0}, 1));
            L.o(s6, "format(...)");
            e6.b.v.setText(s6);
        }
        if(this.N8 != null) {
            this.I3();
            this.J3();
        }
    }

    private final void a4(com.dcinside.app.model.f f0) {
        F0 f00 = this.F1();
        if(f00 != null) {
            com.dcinside.app.realm.b.m.d(f00, f0);
        }
    }

    private final boolean b3(String s) {
        File file0 = new File(s);
        if(!file0.canRead()) {
            file0 = null;
        }
        if(file0 != null) {
            long v = file0.length();
            long v1 = jl.a.E();
            if(v > v1) {
                String s1 = this.getString(0x7F150597, new Object[]{Gk.b(v1)});  // string:make_ai_image_limit_over "%s 이하 이미지만 업로드 가능합니다."
                L.o(s1, "getString(...)");
                c.w(this, s1);
                return true;
            }
            return false;
        }
        return false;
    }

    private final void b4() {
        dl.a.e3(this.Q.f());
        dl.a.d3(this.Q.e());
        int v = this.B.v();
        dl.a.h3(v);
    }

    private final void c3() {
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.c extends N implements Function1 {
            public static final com.dcinside.app.write.menu.ai.AiImageMakeActivity.c e;

            static {
                com.dcinside.app.write.menu.ai.AiImageMakeActivity.c.e = new com.dcinside.app.write.menu.ai.AiImageMakeActivity.c();
            }

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.c() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F15067C);  // string:modify_ai_image_confirm_message "수정 중인 AI 이미지 설정은 저장되지 않습니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.d extends N implements Function1 {
            public static final com.dcinside.app.write.menu.ai.AiImageMakeActivity.d e;

            static {
                com.dcinside.app.write.menu.ai.AiImageMakeActivity.d.e = new com.dcinside.app.write.menu.ai.AiImageMakeActivity.d();
            }

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.d() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.e extends N implements Function1 {
            final AiImageMakeActivity e;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.e(AiImageMakeActivity aiImageMakeActivity0) {
                this.e = aiImageMakeActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.finish();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        com.dcinside.app.perform.e.e.a(this).n(com.dcinside.app.write.menu.ai.AiImageMakeActivity.c.e).z(0x7F15034A).x(0x7F1501C1).b().Z1((Object object0) -> {
            L.p(com.dcinside.app.write.menu.ai.AiImageMakeActivity.d.e, "$tmp0");
            return (Boolean)com.dcinside.app.write.menu.ai.AiImageMakeActivity.d.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.write.menu.ai.AiImageMakeActivity.e(this), "$tmp0");
            new com.dcinside.app.write.menu.ai.AiImageMakeActivity.e(this).invoke(object0);
        });
    }

    private final void c4() {
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.G extends N implements A3.a {
            final AiImageMakeActivity e;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.G(AiImageMakeActivity aiImageMakeActivity0) {
                this.e = aiImageMakeActivity0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.j4("ACTION_SELECT_RESAMPLE_IMAGE");
            }
        }

        if(this.getIntent().getLongExtra("EXTRA_REMAIN_IMAGE_COUNT", 0L) < 2L) {
            L.o("첨부 가능한 이미지 개수가 초과되어 업로드가 불가능합니다.", "getString(...)");
            c.w(this, "첨부 가능한 이미지 개수가 초과되어 업로드가 불가능합니다.");
            return;
        }
        this.S2(new com.dcinside.app.write.menu.ai.AiImageMakeActivity.G(this));
    }

    // 检测为 Lambda 实现
    private static final Boolean d3(Function1 function10, Object object0) [...]

    private final void d4() {
        try {
            f f0 = this.N;
            if(f0 != null) {
                f0.dismissAllowingStateLoss();
            }
        }
        catch(Exception unused_ex) {
        }
        AiImageStatusResult aiImageStatusResult0 = this.x;
        if(aiImageStatusResult0 == null) {
            L.S("info");
            aiImageStatusResult0 = null;
        }
        V[] arr_v = {r0.a("EXTRA_INFO", aiImageStatusResult0), r0.a("EXTRA_PROMPT_SELECTED_LORA_LIST", this.A.y())};
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = f.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.write.menu.ai.lora.f");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.write.menu.ai.lora.LoraAllDialog");
        }
        ((f)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 2))));
        ((f)fragment0).show(fragmentManager0, "com.dcinside.app.write.menu.ai.lora.f");
        this.N = (f)fragment0;
    }

    // 检测为 Lambda 实现
    private static final void e3(Function1 function10, Object object0) [...]

    private final void e4() {
        try {
            e e0 = this.O;
            if(e0 != null) {
                e0.dismissAllowingStateLoss();
            }
        }
        catch(Exception unused_ex) {
        }
        AiImageStatusResult aiImageStatusResult0 = this.x;
        if(aiImageStatusResult0 == null) {
            L.S("info");
            aiImageStatusResult0 = null;
        }
        V[] arr_v = {r0.a("EXTRA_INFO", aiImageStatusResult0), r0.a("EXTRA_PROMPT_SELECTED_MODEL", this.B.w())};
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = e.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.write.menu.ai.model.e");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.write.menu.ai.model.ModelAllDialog");
        }
        ((e)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 2))));
        ((e)fragment0).show(fragmentManager0, "com.dcinside.app.write.menu.ai.model.e");
        this.O = (e)fragment0;
    }

    private final void f3() {
        this.N8 = null;
        this.O8 = null;
        this.I3();
    }

    private final void f4(String s) {
        static final class H extends N implements Function1 {
            final String e;

            H(String s) {
                this.e = s;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.n(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }

        com.dcinside.app.perform.e.e.a(this).n(new H(s)).z(0x7F15034A).b().t5();  // string:filter_apply "확인"
    }

    private final void g3(Collection collection0) {
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.f extends N implements Function1 {
            final AiImageMakeActivity e;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.f(AiImageMakeActivity aiImageMakeActivity0) {
                this.e = aiImageMakeActivity0;
                super(1);
            }

            public final void a(j j0) {
                if(L.g(j0.h(), Boolean.TRUE)) {
                    String s = j0.f();
                    if(s != null) {
                        this.e.G3(s);
                    }
                }
                else {
                    this.e.f4((j0.g() == null ? "" : j0.g()));
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((j)object0));
                return S0.a;
            }
        }

        String s = (String)u.E2(collection0);
        if(s == null) {
            return;
        }
        this.I = uk.nk(s).R1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                this.R2(true, true);
            }
        }).T1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                this.R2(false, true);
            }
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.write.menu.ai.AiImageMakeActivity.f(this), "$tmp0");
            new com.dcinside.app.write.menu.ai.AiImageMakeActivity.f(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.o("잠시 후 다시 시도해주세요.", "getString(...)");
            this.f4("잠시 후 다시 시도해주세요.");
        });
    }

    private final void g4() {
        com.dcinside.app.write.menu.ai.a a0 = this.E;
        if(a0 != null) {
            a0.dismissAllowingStateLoss();
        }
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = com.dcinside.app.write.menu.ai.a.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.write.menu.ai.a");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.write.menu.ai.AboutAiImageGuideDialog");
        }
        ((com.dcinside.app.write.menu.ai.a)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(new V[0], 0))));
        ((com.dcinside.app.write.menu.ai.a)fragment0).show(fragmentManager0, "com.dcinside.app.write.menu.ai.a");
        this.E = (com.dcinside.app.write.menu.ai.a)fragment0;
    }

    // 检测为 Lambda 实现
    private static final void h3(AiImageMakeActivity aiImageMakeActivity0) [...]

    private final void h4(String s) {
        com.dcinside.app.post.fragments.g g1;
        com.dcinside.app.post.fragments.g g0 = this.W8;
        if(g0 != null) {
            g0.dismissAllowingStateLoss();
        }
        if(this.isDestroyed() || this.isFinishing() || this.getSupportFragmentManager().d1()) {
            return;
        }
        try {
            String s1 = this.Q8;
            V[] arr_v = {r0.a("vpnBanMessage", s), r0.a("vpnBanGalleryId", s1)};
            FragmentManager fragmentManager0 = this.getSupportFragmentManager();
            L.o(fragmentManager0, "getSupportFragmentManager(...)");
            FragmentFactory fragmentFactory0 = fragmentManager0.G0();
            ClassLoader classLoader0 = com.dcinside.app.post.fragments.g.class.getClassLoader();
            L.m(classLoader0);
            Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.post.fragments.g");
            if(fragment0 == null) {
                g1 = null;
            }
            else {
                g1 = (com.dcinside.app.post.fragments.g)fragment0;
                g1.setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 2))));
                g1.show(fragmentManager0, "com.dcinside.app.post.fragments.g");
            }
        }
        catch(Exception unused_ex) {
            g1 = null;
            this.W8 = g1;
            return;
        }
        this.W8 = g1;
    }

    @Override  // com.dcinside.app.write.menu.ai.lora.h
    public void i(@l LoraModel loraModel0, boolean z) {
        L.p(loraModel0, "model");
        if(this.A.x() >= 2 && !z) {
            String s = this.getString(0x7F1505DC, new Object[]{2});  // string:make_ai_lora_limit "로라는 %d개까지 등록 가능합니다."
            L.o(s, "getString(...)");
            this.f4(s);
            return;
        }
        i i0 = this.M;
        if(i0 != null) {
            try {
                i0.dismissAllowingStateLoss();
            }
            catch(Exception unused_ex) {
            }
        }
        V[] arr_v = {r0.a("EXTRA_SELECTED_TYPE", loraModel0)};
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = i.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.write.menu.ai.lora.i");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.write.menu.ai.lora.LoraSettingDialog");
        }
        ((i)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 1))));
        ((i)fragment0).show(fragmentManager0, "com.dcinside.app.write.menu.ai.lora.i");
        this.M = (i)fragment0;
    }

    // 检测为 Lambda 实现
    private static final void i3(AiImageMakeActivity aiImageMakeActivity0) [...]

    private final void i4(String s) {
        public static final class I extends AnimatorListenerAdapter {
            final TextView a;

            I(TextView textView0) {
                this.a = textView0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(@l Animator animator0) {
                public static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.I.a extends AnimatorListenerAdapter {
                    final TextView a;

                    com.dcinside.app.write.menu.ai.AiImageMakeActivity.I.a(TextView textView0) {
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
                this.a.animate().setStartDelay(2000L).setListener(new com.dcinside.app.write.menu.ai.AiImageMakeActivity.I.a(this.a)).alpha(0.0f).setDuration(800L);
            }
        }

        E e0 = this.w;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        TextView textView0 = e0.z.c;
        L.o(textView0, "aiLoadToastMessage");
        textView0.setText(this.getString(0x7F1505FE, new Object[]{s}));  // string:make_ai_save_loaded_toast "\'%s\' 프롬프트 불러오기가 완료되었습니다."
        ViewPropertyAnimator viewPropertyAnimator0 = textView0.animate();
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.cancel();
        }
        textView0.setAlpha(0.0f);
        textView0.setVisibility(0);
        textView0.animate().setStartDelay(0L).alpha(1.0f).setDuration(800L).setListener(new I(textView0));
    }

    // 检测为 Lambda 实现
    private static final void j3(Function1 function10, Object object0) [...]

    private final void j4(String s) {
        if(cl.i(this, this)) {
            this.F = 103;
            this.G = s;
            return;
        }
        Intent intent0 = new Intent(this, AlbumActivity.class);
        intent0.setAction(s);
        U.a.b = 1;
        ActivityResultLauncher activityResultLauncher0 = this.H;
        if(activityResultLauncher0 != null) {
            activityResultLauncher0.b(intent0);
        }
    }

    // 检测为 Lambda 实现
    private static final void k3(AiImageMakeActivity aiImageMakeActivity0, Throwable throwable0) [...]

    private final String l3() {
        String s;
        E e0 = this.w;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        Editable editable0 = e0.B.i.getText();
        if(editable0 == null) {
            s = "";
        }
        else {
            s = editable0.toString();
            if(s == null) {
                s = "";
            }
        }
        List list0 = this.D.x();
        StringBuilder stringBuilder0 = new StringBuilder(s);
        if(stringBuilder0.length() > 0) {
            if(v.c3(stringBuilder0, ",", false, 2, null)) {
                stringBuilder0.append(" ");
            }
            else if(!v.c3(stringBuilder0, ", ", false, 2, null)) {
                stringBuilder0.append(", ");
            }
        }
        for(Object object0: list0) {
            stringBuilder0.append(LoraModel.j.a(this, ((LoraModel)object0)));
            if(stringBuilder0.length() > 0) {
                stringBuilder0.append(",");
            }
        }
        String s1 = stringBuilder0.toString();
        L.o(s1, "toString(...)");
        return v.G5(v.l2(s1, "\n", ",", false, 4, null)).toString();
    }

    @Override  // com.dcinside.app.write.menu.ai.o0$a
    public void m(@l String s) {
        String s1;
        L.p(s, "word");
        E e0 = this.w;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        EditText editText0 = e0.B.q;
        L.o(editText0, "aiPromptInput");
        Editable editable0 = editText0.getText();
        if(editable0 == null) {
            s1 = "";
        }
        else {
            s1 = editable0.toString();
            if(s1 == null) {
                s1 = "";
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(s1.length() > 0) {
            if(editText0.length() + s.length() > 2000) {
                s.C(this.getString(0x7F1502B2, new Object[]{2000}));  // string:error_prompt_max_length "%1$d자 제한을 초과하여 입력할 수 없습니다."
                return;
            }
            if(v.N1(s1, ",", false, 2, null)) {
                stringBuilder0.append(" ");
            }
            else if(!v.N1(s1, ", ", false, 2, null)) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", ");
        editText0.append(stringBuilder0.toString());
    }

    private final String m3() {
        String s;
        E e0 = this.w;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        Editable editable0 = e0.B.q.getText();
        if(editable0 == null) {
            s = "";
        }
        else {
            s = editable0.toString();
            if(s == null) {
                s = "";
            }
        }
        List list0 = this.C.x();
        StringBuilder stringBuilder0 = new StringBuilder(s);
        if(stringBuilder0.length() > 0) {
            if(v.c3(stringBuilder0, ",", false, 2, null)) {
                stringBuilder0.append(" ");
            }
            else if(!v.c3(stringBuilder0, ", ", false, 2, null)) {
                stringBuilder0.append(", ");
            }
        }
        for(Object object0: list0) {
            stringBuilder0.append(LoraModel.j.a(this, ((LoraModel)object0)));
            if(stringBuilder0.length() > 0) {
                stringBuilder0.append(",");
            }
        }
        String s1 = stringBuilder0.toString();
        L.o(s1, "toString(...)");
        return v.G5(s1).toString();
    }

    private final int n3() {
        int v2;
        String s1;
        AiImageStatusResult aiImageStatusResult0 = this.x;
        E e0 = null;
        if(aiImageStatusResult0 == null) {
            L.S("info");
            aiImageStatusResult0 = null;
        }
        int v = 0;
        LoraModel[] arr_loraModel = (LoraModel[])aiImageStatusResult0.o().toArray(new LoraModel[0]);
        int v1 = this.A.x();
        E e1 = this.w;
        if(e1 == null) {
            L.S("binding");
            e1 = null;
        }
        Editable editable0 = e1.B.q.getText();
        String s = "";
        if(editable0 == null) {
            s1 = "";
        }
        else {
            s1 = editable0.toString();
            if(s1 == null) {
                s1 = "";
            }
        }
        E e2 = this.w;
        if(e2 == null) {
            L.S("binding");
        }
        else {
            e0 = e2;
        }
        Editable editable1 = e0.B.i.getText();
        if(editable1 != null) {
            String s2 = editable1.toString();
            if(s2 != null) {
                s = s2;
            }
        }
        com.dcinside.app.write.menu.ai.lora.d d0 = com.dcinside.app.write.menu.ai.lora.d.c.a(s1, arr_loraModel);
        com.dcinside.app.write.menu.ai.lora.d d1 = com.dcinside.app.write.menu.ai.lora.d.c.a(s, arr_loraModel);
        if(d0 == null) {
            v2 = 0;
        }
        else {
            LoraModel[] arr_loraModel1 = d0.a();
            v2 = arr_loraModel1 == null ? 0 : arr_loraModel1.length;
        }
        if(d1 != null) {
            LoraModel[] arr_loraModel2 = d1.a();
            if(arr_loraModel2 != null) {
                v = arr_loraModel2.length;
            }
        }
        return v1 + v2 + v;
    }

    private final void o3() {
        CharaPromptSearchActivity.A.a(this, this.S8);
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        E e0 = E.c(this.getLayoutInflater());
        L.o(e0, "inflate(...)");
        this.w = e0;
        E e1 = null;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        this.setContentView(e0.b());
        E e2 = this.w;
        if(e2 == null) {
            L.S("binding");
        }
        else {
            e1 = e2;
        }
        this.S0(e1.u);
        this.getOnBackPressedDispatcher().h(this.P8);
        this.Q8 = this.getIntent().getStringExtra("EXTRA_GALLERY_ID");
        AiImageStatusResult aiImageStatusResult0 = (AiImageStatusResult)IntentCompat.d(this.getIntent(), "EXTRA_INFO", AiImageStatusResult.class);
        if(aiImageStatusResult0 == null) {
            return;
        }
        this.x = aiImageStatusResult0;
        kr.bhbfhfb.designcompat.a.d(this);
        this.setTitle("");
        this.T8 = this.getIntent().getBooleanExtra("EXTRA_DEF_IMAGE", false);
        this.v3();
        this.p3();
        this.a3();
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        try {
            e e0 = this.O;
            if(e0 != null) {
                e0.dismissAllowingStateLoss();
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            this.O = null;
            i i0 = this.M;
            if(i0 != null) {
                i0.dismissAllowingStateLoss();
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            this.M = null;
            f f0 = this.N;
            if(f0 != null) {
                f0.dismissAllowingStateLoss();
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            this.N = null;
            n0 n00 = this.P;
            if(n00 != null) {
                n00.dismissAllowingStateLoss();
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            this.P = null;
            com.dcinside.app.write.menu.ai.a a0 = this.E;
            if(a0 != null) {
                a0.dismissAllowingStateLoss();
            }
        }
        catch(Exception unused_ex) {
        }
        this.E = null;
        o o0 = this.I;
        if(o0 != null) {
            o0.l();
        }
        this.I = null;
        o o1 = this.J;
        if(o1 != null) {
            o1.l();
        }
        this.J = null;
        o o2 = this.L;
        if(o2 != null) {
            o2.l();
        }
        this.L = null;
        b b0 = this.K;
        if(b0 != null) {
            b0.l();
        }
        this.K = null;
        o o3 = this.Z;
        if(o3 != null) {
            o3.l();
        }
        this.Z = null;
        super.onDestroy();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.getOnBackPressedDispatcher().p();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionDenied(@m PermissionDeniedResponse permissionDeniedResponse0) {
        Dl.D(this, cl.b((permissionDeniedResponse0 == null ? null : permissionDeniedResponse0.getPermissionName())));
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionGranted(@m PermissionGrantedResponse permissionGrantedResponse0) {
        Dl.D(this, cl.c((permissionGrantedResponse0 == null ? null : permissionGrantedResponse0.getPermissionName())));
        if(this.F == 103) {
            this.j4(this.G);
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionRationaleShouldBeShown(@l PermissionRequest permissionRequest0, @m PermissionToken permissionToken0) {
        L.p(permissionRequest0, "permission");
        if(permissionToken0 != null) {
            permissionToken0.continuePermissionRequest();
        }
    }

    private final void p3() {
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.g extends N implements Function1 {
            final AiImageMakeActivity e;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.g(AiImageMakeActivity aiImageMakeActivity0) {
                this.e = aiImageMakeActivity0;
                super(1);
            }

            public final void a(C c0) {
                L.m(c0);
                this.e.E3(c0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((C)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.h extends N implements Function1 {
            final AiImageMakeActivity e;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.h(AiImageMakeActivity aiImageMakeActivity0) {
                this.e = aiImageMakeActivity0;
                super(1);
            }

            public final void a(G g0) {
                L.m(g0);
                this.e.D3(g0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((G)object0));
                return S0.a;
            }
        }

        o o0 = com.dcinside.app.rx.bus.c.c(this, C.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.write.menu.ai.AiImageMakeActivity.g(this), "$tmp0");
            new com.dcinside.app.write.menu.ai.AiImageMakeActivity.g(this).invoke(object0);
        });
        b b0 = this.K;
        if(b0 != null) {
            b0.a(o0);
        }
        o o1 = com.dcinside.app.rx.bus.c.c(this, G.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.write.menu.ai.AiImageMakeActivity.h(this), "$tmp0");
            new com.dcinside.app.write.menu.ai.AiImageMakeActivity.h(this).invoke(object0);
        });
        b b1 = this.K;
        if(b1 != null) {
            b1.a(o1);
        }
        this.H = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            if(activityResult0.c() == -1) {
                Intent intent0 = activityResult0.a();
                if(intent0 == null) {
                    return;
                }
                Set set0 = intent0.getBooleanExtra("extra_take_image_from_android", false) ? Gk.t(intent0) : intent0.getStringArrayListExtra("intent_path");
                if(set0 == null) {
                    return;
                }
                String s = intent0.getAction();
                if(s != null) {
                    switch(s) {
                        case "ACTION_EXECUTE_PROMPT_IMAGE": {
                            this.g3(set0);
                            return;
                        }
                        case "ACTION_SELECT_RESAMPLE_IMAGE": {
                            this.U3(set0);
                            break;
                        }
                    }
                }
            }
        });
        this.R8 = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            if(activityResult0.c() == -1) {
                Intent intent0 = activityResult0.a();
                if(intent0 == null) {
                    return;
                }
                AiPromptLoadItem aiPromptLoadItem0 = (AiPromptLoadItem)IntentCompat.d(intent0, "EXTRA_LOAD_ITEM_DATA", AiPromptLoadItem.class);
                if(aiPromptLoadItem0 == null) {
                    return;
                }
                this.F3(aiPromptLoadItem0);
            }
        });
        this.S8 = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            if(activityResult0.c() == -1) {
                Intent intent0 = activityResult0.a();
                if(intent0 == null) {
                    return;
                }
                String s = intent0.getStringExtra("app.write.menu.ai.chara.EXTRA_SELECTED_PROMPT");
                if(s == null) {
                    s = "";
                }
                E e0 = this.w;
                E e1 = null;
                if(e0 == null) {
                    L.S("binding");
                    e0 = null;
                }
                Editable editable0 = e0.B.q.getText();
                E e2 = this.w;
                if(e2 == null) {
                    L.S("binding");
                    e2 = null;
                }
                e2.B.q.requestFocus();
                L.m(editable0);
                if(editable0.length() == 0) {
                    E e3 = this.w;
                    if(e3 == null) {
                        L.S("binding");
                        e3 = null;
                    }
                    e3.B.q.setText(s);
                    E e4 = this.w;
                    if(e4 == null) {
                        L.S("binding");
                    }
                    else {
                        e1 = e4;
                    }
                    String s1 = this.getString(0x7F1501DB, new Object[]{s});  // string:chara_prompt_result_origin_empty "%1$s,"
                    e1.B.q.setText(s1);
                    return;
                }
                E e5 = this.w;
                if(e5 == null) {
                    L.S("binding");
                    e5 = null;
                }
                if(e5.B.q.length() + s.length() > 2000) {
                    s.C(this.getString(0x7F1502B2, new Object[]{2000}));  // string:error_prompt_max_length "%1$d자 제한을 초과하여 입력할 수 없습니다."
                    return;
                }
                E e6 = this.w;
                if(e6 == null) {
                    L.S("binding");
                    e6 = null;
                }
                String s2 = this.getString(0x7F1501DA, new Object[]{s, editable0});  // string:chara_prompt_result "%1$s,\n%2$s"
                e6.B.q.setText(s2);
                E e7 = this.w;
                if(e7 == null) {
                    L.S("binding");
                }
                else {
                    e1 = e7;
                }
                e1.B.q.setSelection(s.length() + 1);
            }
        });
    }

    // 检测为 Lambda 实现
    private static final void q3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void r3(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void s3(AiImageMakeActivity aiImageMakeActivity0, ActivityResult activityResult0) [...]

    // 检测为 Lambda 实现
    private static final void t3(AiImageMakeActivity aiImageMakeActivity0, ActivityResult activityResult0) [...]

    // 检测为 Lambda 实现
    private static final void u3(AiImageMakeActivity aiImageMakeActivity0, ActivityResult activityResult0) [...]

    @SuppressLint({"ClickableViewAccessibility"})
    public final void v3() {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$28", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class A extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final AiImageMakeActivity m;

            A(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.m = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                A aiImageMakeActivity$A0 = new A(this.m, d0);
                aiImageMakeActivity$A0.l = view0;
                return aiImageMakeActivity$A0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.m.K3(((View)this.l));
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$29", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.B extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final AiImageMakeActivity m;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.B(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.m = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.write.menu.ai.AiImageMakeActivity.B aiImageMakeActivity$B0 = new com.dcinside.app.write.menu.ai.AiImageMakeActivity.B(this.m, d0);
                aiImageMakeActivity$B0.l = view0;
                return aiImageMakeActivity$B0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.m.K3(((View)this.l));
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$9", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.C extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageMakeActivity l;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.C(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.ai.AiImageMakeActivity.C(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.Q.g(!this.l.Q.e());
                this.l.A3();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$10", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.i extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageMakeActivity l;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.i(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.ai.AiImageMakeActivity.i(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.Q.h(!this.l.Q.f());
                this.l.A3();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$11", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.j extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageMakeActivity l;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.j(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.ai.AiImageMakeActivity.j(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                if(this.l.Y2()) {
                    if(this.l.T8) {
                        this.l.y3();
                        return S0.a;
                    }
                    if(this.l.Y2()) {
                        this.l.P3();
                    }
                }
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$12", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.k extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageMakeActivity l;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.k(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.ai.AiImageMakeActivity.k(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.d4();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$13", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.l extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageMakeActivity l;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.l(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.ai.AiImageMakeActivity.l(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.Q2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$14", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.m extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageMakeActivity l;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.m(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.ai.AiImageMakeActivity.m(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.g4();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$15", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class n extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageMakeActivity l;

            n(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new n(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                L.o("https://civitai.com/", "getString(...)");
                this.l.O3("https://civitai.com/", true);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$16", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.o extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageMakeActivity l;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.o(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.ai.AiImageMakeActivity.o(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.j4("ACTION_EXECUTE_PROMPT_IMAGE");
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$17", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.p extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageMakeActivity l;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.p(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.ai.AiImageMakeActivity.p(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.j4("ACTION_EXECUTE_PROMPT_IMAGE");
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$18", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class q extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageMakeActivity l;

            q(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new q(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.o3();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$19", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class r extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageMakeActivity l;

            r(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new r(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.o3();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$20", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.s extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageMakeActivity l;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.s(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.ai.AiImageMakeActivity.s(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.N3();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$21", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class t extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageMakeActivity l;

            t(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new t(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.x3();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$22", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.u extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageMakeActivity l;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.u(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.ai.AiImageMakeActivity.u(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.Z3();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$23", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.v extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageMakeActivity l;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.v(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.ai.AiImageMakeActivity.v(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.c4();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$24", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.ai.AiImageMakeActivity.w extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageMakeActivity l;

            com.dcinside.app.write.menu.ai.AiImageMakeActivity.w(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.ai.AiImageMakeActivity.w(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.f3();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$25", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class x extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageMakeActivity l;

            x(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new x(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.M3(false);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$26", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class y extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final AiImageMakeActivity l;

            y(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.l = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new y(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.M3(true);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.ai.AiImageMakeActivity$initView$27", f = "AiImageMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class z extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final AiImageMakeActivity m;

            z(AiImageMakeActivity aiImageMakeActivity0, kotlin.coroutines.d d0) {
                this.m = aiImageMakeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                z aiImageMakeActivity$z0 = new z(this.m, d0);
                aiImageMakeActivity$z0.l = view0;
                return aiImageMakeActivity$z0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.m.K3(((View)this.l));
                return S0.a;
            }
        }

        E e43;
        List list0;
        E e0 = this.w;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(e0.h.getText());
        L.o("AUTOMATIC1111/stable-diffusion-webui", "getString(...)");
        L.o("CreativeML Open RAIL++-M Addendum", "getString(...)");
        int v = v.s3(spannableStringBuilder0, "AUTOMATIC1111/stable-diffusion-webui", 0, false, 6, null);
        V v1 = r0.a(v, ((int)(v + 36)));
        L.o("https://github.com/AUTOMATIC1111/stable-diffusion-webui/blob/master/LICENSE.txt", "getString(...)");
        int v2 = v.s3(spannableStringBuilder0, "CreativeML Open RAIL++-M Addendum", 0, false, 6, null);
        V v3 = r0.a(v2, ((int)(v2 + 33)));
        L.o("https://github.com/Stability-AI/generative-models/blob/main/model_licenses/LICENSE-SDXL1.0", "getString(...)");
        spannableStringBuilder0.setSpan(new URLSpan("https://github.com/AUTOMATIC1111/stable-diffusion-webui/blob/master/LICENSE.txt"), ((Number)v1.e()).intValue(), ((Number)v1.f()).intValue(), 33);
        spannableStringBuilder0.setSpan(new URLSpan("https://github.com/Stability-AI/generative-models/blob/main/model_licenses/LICENSE-SDXL1.0"), ((Number)v3.e()).intValue(), ((Number)v3.f()).intValue(), 33);
        e0.h.setText(spannableStringBuilder0);
        MovementMethod movementMethod0 = LinkMovementMethod.getInstance();
        e0.h.setMovementMethod(movementMethod0);
        E e1 = this.w;
        if(e1 == null) {
            L.S("binding");
            e1 = null;
        }
        TextView textView0 = e1.o;
        AiImageStatusResult aiImageStatusResult0 = this.x;
        if(aiImageStatusResult0 == null) {
            L.S("info");
            aiImageStatusResult0 = null;
        }
        int v4 = aiImageStatusResult0.y();
        AiImageStatusResult aiImageStatusResult1 = this.x;
        if(aiImageStatusResult1 == null) {
            L.S("info");
            aiImageStatusResult1 = null;
        }
        SpannableStringBuilder spannableStringBuilder1 = new SpannableStringBuilder();
        spannableStringBuilder1.append("생성 횟수");
        spannableStringBuilder1.append(' ');
        spannableStringBuilder1.append(this.getString(0x7F15058B, new Object[]{((int)(v4 - aiImageStatusResult1.u())), v4}));  // string:make_ai_image_count "(%1$d/%2$d)"
        textView0.setText(spannableStringBuilder1);
        E e2 = this.w;
        if(e2 == null) {
            L.S("binding");
            e2 = null;
        }
        RecyclerView recyclerView0 = e2.B.y;
        recyclerView0.setLayoutManager(new LinearLayoutManager(this, 0, false));
        AiImageStatusResult aiImageStatusResult2 = this.x;
        if(aiImageStatusResult2 == null) {
            L.S("info");
            aiImageStatusResult2 = null;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: aiImageStatusResult2.t()) {
            if(((String)object0).length() > 0) {
                arrayList0.add(object0);
            }
        }
        this.y.y(arrayList0);
        recyclerView0.setAdapter(this.y);
        AiImageStatusResult aiImageStatusResult3 = this.x;
        if(aiImageStatusResult3 == null) {
            L.S("info");
            aiImageStatusResult3 = null;
        }
        int v5 = 8;
        if(aiImageStatusResult3.t().isEmpty()) {
            E e3 = this.w;
            if(e3 == null) {
                L.S("binding");
                e3 = null;
            }
            L.o(e3.B.A, "aiRecommendWrap");
            e3.B.A.setVisibility(8);
        }
        E e4 = this.w;
        if(e4 == null) {
            L.S("binding");
            e4 = null;
        }
        RecyclerView recyclerView1 = e4.B.f;
        recyclerView1.setItemAnimator(null);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, 0, false));
        com.dcinside.app.write.menu.ai.lora.a a0 = this.A;
        AiImageStatusResult aiImageStatusResult4 = this.x;
        if(aiImageStatusResult4 == null) {
            L.S("info");
            aiImageStatusResult4 = null;
        }
        a0.E(aiImageStatusResult4.o());
        recyclerView1.setAdapter(this.A);
        E e5 = this.w;
        if(e5 == null) {
            L.S("binding");
            e5 = null;
        }
        RecyclerView recyclerView2 = e5.z.e;
        recyclerView2.setItemAnimator(null);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, 0, false));
        com.dcinside.app.write.menu.ai.model.a a1 = this.B;
        AiImageStatusResult aiImageStatusResult5 = this.x;
        if(aiImageStatusResult5 == null) {
            L.S("info");
            aiImageStatusResult5 = null;
        }
        a1.A(aiImageStatusResult5.r());
        recyclerView2.setAdapter(this.B);
        this.C3();
        this.z3();
        E e6 = this.w;
        if(e6 == null) {
            L.S("binding");
            e6 = null;
        }
        RecyclerView recyclerView3 = e6.A.b;
        recyclerView3.setItemAnimator(null);
        recyclerView3.setLayoutManager(new LinearLayoutManager(this, 0, false));
        if(this.B.x()) {
            AiImageStatusResult aiImageStatusResult6 = this.x;
            if(aiImageStatusResult6 == null) {
                L.S("info");
                aiImageStatusResult6 = null;
            }
            list0 = aiImageStatusResult6.w().g();
        }
        else {
            AiImageStatusResult aiImageStatusResult7 = this.x;
            if(aiImageStatusResult7 == null) {
                L.S("info");
                aiImageStatusResult7 = null;
            }
            list0 = aiImageStatusResult7.w().f();
        }
        this.z.A(list0);
        recyclerView3.setAdapter(this.z);
        this.K(this.z.x());
        E e7 = this.w;
        if(e7 == null) {
            L.S("binding");
            e7 = null;
        }
        e7.B.r.setItemAnimator(null);
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(this, 1, false);
        e7.B.r.setLayoutManager(linearLayoutManager0);
        e7.B.r.setAdapter(this.C);
        E e8 = this.w;
        if(e8 == null) {
            L.S("binding");
            e8 = null;
        }
        e8.B.j.setItemAnimator(null);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this, 1, false);
        e8.B.j.setLayoutManager(linearLayoutManager1);
        e8.B.j.setAdapter(this.D);
        this.B3();
        this.A3();
        E e9 = this.w;
        if(e9 == null) {
            L.S("binding");
            e9 = null;
        }
        L.o(e9.B.g, "aiLolaOpen");
        com.dcinside.app.write.menu.ai.AiImageMakeActivity.C aiImageMakeActivity$C0 = new com.dcinside.app.write.menu.ai.AiImageMakeActivity.C(this, null);
        com.dcinside.app.internal.r.M(e9.B.g, null, aiImageMakeActivity$C0, 1, null);
        E e10 = this.w;
        if(e10 == null) {
            L.S("binding");
            e10 = null;
        }
        L.o(e10.B.l, "aiNegativePromptOpen");
        com.dcinside.app.write.menu.ai.AiImageMakeActivity.i aiImageMakeActivity$i0 = new com.dcinside.app.write.menu.ai.AiImageMakeActivity.i(this, null);
        com.dcinside.app.internal.r.M(e10.B.l, null, aiImageMakeActivity$i0, 1, null);
        E e11 = this.w;
        if(e11 == null) {
            L.S("binding");
            e11 = null;
        }
        L.o(e11.c, "makeAiImageConfirm");
        com.dcinside.app.write.menu.ai.AiImageMakeActivity.j aiImageMakeActivity$j0 = new com.dcinside.app.write.menu.ai.AiImageMakeActivity.j(this, null);
        com.dcinside.app.internal.r.M(e11.c, null, aiImageMakeActivity$j0, 1, null);
        E e12 = this.w;
        if(e12 == null) {
            L.S("binding");
            e12 = null;
        }
        L.o(e12.B.c, "aiLolaAll");
        com.dcinside.app.write.menu.ai.AiImageMakeActivity.k aiImageMakeActivity$k0 = new com.dcinside.app.write.menu.ai.AiImageMakeActivity.k(this, null);
        com.dcinside.app.internal.r.M(e12.B.c, null, aiImageMakeActivity$k0, 1, null);
        E e13 = this.w;
        if(e13 == null) {
            L.S("binding");
            e13 = null;
        }
        L.o(e13.j, "makeAiImageProgressCancel");
        com.dcinside.app.write.menu.ai.AiImageMakeActivity.l aiImageMakeActivity$l0 = new com.dcinside.app.write.menu.ai.AiImageMakeActivity.l(this, null);
        com.dcinside.app.internal.r.M(e13.j, null, aiImageMakeActivity$l0, 1, null);
        E e14 = this.w;
        if(e14 == null) {
            L.S("binding");
            e14 = null;
        }
        L.o(e14.e, "makeAiImageGuide");
        com.dcinside.app.write.menu.ai.AiImageMakeActivity.m aiImageMakeActivity$m0 = new com.dcinside.app.write.menu.ai.AiImageMakeActivity.m(this, null);
        com.dcinside.app.internal.r.M(e14.e, null, aiImageMakeActivity$m0, 1, null);
        E e15 = this.w;
        if(e15 == null) {
            L.S("binding");
            e15 = null;
        }
        L.o(e15.B.p, "aiPromptExample");
        n aiImageMakeActivity$n0 = new n(this, null);
        com.dcinside.app.internal.r.M(e15.B.p, null, aiImageMakeActivity$n0, 1, null);
        E e16 = this.w;
        if(e16 == null) {
            L.S("binding");
            e16 = null;
        }
        L.o(e16.B.F, "makeAiPromptUploadImageText");
        com.dcinside.app.write.menu.ai.AiImageMakeActivity.o aiImageMakeActivity$o0 = new com.dcinside.app.write.menu.ai.AiImageMakeActivity.o(this, null);
        com.dcinside.app.internal.r.M(e16.B.F, null, aiImageMakeActivity$o0, 1, null);
        E e17 = this.w;
        if(e17 == null) {
            L.S("binding");
            e17 = null;
        }
        L.o(e17.B.E, "makeAiPromptUploadImage");
        com.dcinside.app.write.menu.ai.AiImageMakeActivity.p aiImageMakeActivity$p0 = new com.dcinside.app.write.menu.ai.AiImageMakeActivity.p(this, null);
        com.dcinside.app.internal.r.M(e17.B.E, null, aiImageMakeActivity$p0, 1, null);
        E e18 = this.w;
        if(e18 == null) {
            L.S("binding");
            e18 = null;
        }
        L.o(e18.B.D, "makeAiPromptUploadCharText");
        q aiImageMakeActivity$q0 = new q(this, null);
        com.dcinside.app.internal.r.M(e18.B.D, null, aiImageMakeActivity$q0, 1, null);
        E e19 = this.w;
        if(e19 == null) {
            L.S("binding");
            e19 = null;
        }
        L.o(e19.B.C, "makeAiPromptUploadChar");
        r aiImageMakeActivity$r0 = new r(this, null);
        com.dcinside.app.internal.r.M(e19.B.C, null, aiImageMakeActivity$r0, 1, null);
        InputFilter.LengthFilter inputFilter$LengthFilter0 = new InputFilter.LengthFilter(2000);
        com.dcinside.app.write.menu.ai.F f0 = (CharSequence charSequence0, int v, int v1, Spanned spanned0, int v2, int v3) -> {
            L.p(new kotlin.text.r("[ㄱ-ㅎㅏ-ㅣ가-힣]"), "$regex");
            L.m(charSequence0);
            return new kotlin.text.r("[ㄱ-ㅎㅏ-ㅣ가-힣]").m(charSequence0, "");
        };
        E e20 = this.w;
        if(e20 == null) {
            L.S("binding");
            e20 = null;
        }
        e20.B.q.setFilters(new InputFilter[]{inputFilter$LengthFilter0, f0});
        E e21 = this.w;
        if(e21 == null) {
            L.S("binding");
            e21 = null;
        }
        e21.B.i.setFilters(new InputFilter[]{inputFilter$LengthFilter0, f0});
        E e22 = this.w;
        if(e22 == null) {
            L.S("binding");
            e22 = null;
        }
        L.o(e22.B.u, "aiPromptRecent");
        com.dcinside.app.write.menu.ai.AiImageMakeActivity.s aiImageMakeActivity$s0 = new com.dcinside.app.write.menu.ai.AiImageMakeActivity.s(this, null);
        com.dcinside.app.internal.r.M(e22.B.u, null, aiImageMakeActivity$s0, 1, null);
        E e23 = this.w;
        if(e23 == null) {
            L.S("binding");
            e23 = null;
        }
        L.o(e23.B.t, "aiPromptLoad");
        t aiImageMakeActivity$t0 = new t(this, null);
        com.dcinside.app.internal.r.M(e23.B.t, null, aiImageMakeActivity$t0, 1, null);
        E e24 = this.w;
        if(e24 == null) {
            L.S("binding");
            e24 = null;
        }
        L.o(e24.B.v, "aiPromptSave");
        com.dcinside.app.write.menu.ai.AiImageMakeActivity.u aiImageMakeActivity$u0 = new com.dcinside.app.write.menu.ai.AiImageMakeActivity.u(this, null);
        com.dcinside.app.internal.r.M(e24.B.v, null, aiImageMakeActivity$u0, 1, null);
        this.X2();
        E e25 = this.w;
        if(e25 == null) {
            L.S("binding");
            e25 = null;
        }
        L.o(e25.q, "makeAiImageRemainWrap");
        e25.q.setVisibility((this.T8 ? 8 : 0));
        E e26 = this.w;
        if(e26 == null) {
            L.S("binding");
            e26 = null;
        }
        View view0 = e26.p;
        L.o(view0, "makeAiImageRemainMargin");
        if(this.T8) {
            v5 = 0;
        }
        view0.setVisibility(v5);
        E e27 = this.w;
        if(e27 == null) {
            L.S("binding");
            e27 = null;
        }
        L.o(e27.b.d, "aiControlImageAdd");
        com.dcinside.app.write.menu.ai.AiImageMakeActivity.v aiImageMakeActivity$v0 = new com.dcinside.app.write.menu.ai.AiImageMakeActivity.v(this, null);
        com.dcinside.app.internal.r.M(e27.b.d, null, aiImageMakeActivity$v0, 1, null);
        E e28 = this.w;
        if(e28 == null) {
            L.S("binding");
            e28 = null;
        }
        L.o(e28.b.p, "aiControlResampleImageDelete");
        com.dcinside.app.write.menu.ai.AiImageMakeActivity.w aiImageMakeActivity$w0 = new com.dcinside.app.write.menu.ai.AiImageMakeActivity.w(this, null);
        com.dcinside.app.internal.r.M(e28.b.p, null, aiImageMakeActivity$w0, 1, null);
        E e29 = this.w;
        if(e29 == null) {
            L.S("binding");
            e29 = null;
        }
        L.o(e29.b.t, "aiControlResampleValueDecrease");
        x aiImageMakeActivity$x0 = new x(this, null);
        com.dcinside.app.internal.r.M(e29.b.t, null, aiImageMakeActivity$x0, 1, null);
        E e30 = this.w;
        if(e30 == null) {
            L.S("binding");
            e30 = null;
        }
        L.o(e30.b.u, "aiControlResampleValueIncrease");
        y aiImageMakeActivity$y0 = new y(this, null);
        com.dcinside.app.internal.r.M(e30.b.u, null, aiImageMakeActivity$y0, 1, null);
        E e31 = this.w;
        if(e31 == null) {
            L.S("binding");
            e31 = null;
        }
        L.o(e31.b.g, "aiControlModeBalance");
        z aiImageMakeActivity$z0 = new z(this, null);
        com.dcinside.app.internal.r.M(e31.b.g, null, aiImageMakeActivity$z0, 1, null);
        E e32 = this.w;
        if(e32 == null) {
            L.S("binding");
            e32 = null;
        }
        L.o(e32.b.k, "aiControlModePrompt");
        A aiImageMakeActivity$A0 = new A(this, null);
        com.dcinside.app.internal.r.M(e32.b.k, null, aiImageMakeActivity$A0, 1, null);
        E e33 = this.w;
        if(e33 == null) {
            L.S("binding");
            e33 = null;
        }
        L.o(e33.b.h, "aiControlModeControl");
        com.dcinside.app.write.menu.ai.AiImageMakeActivity.B aiImageMakeActivity$B0 = new com.dcinside.app.write.menu.ai.AiImageMakeActivity.B(this, null);
        com.dcinside.app.internal.r.M(e33.b.h, null, aiImageMakeActivity$B0, 1, null);
        E e34 = this.w;
        if(e34 == null) {
            L.S("binding");
            e34 = null;
        }
        L.o("%.1f", "getString(...)");
        L.o("1.0", "format(...)");
        e34.b.v.setText("1.0");
        if(Build.VERSION.SDK_INT >= 28) {
            E e35 = this.w;
            if(e35 == null) {
                L.S("binding");
                e35 = null;
            }
            int v6 = Color.parseColor("#00000000");
            e35.z.b().setOutlineAmbientShadowColor(v6);
            E e36 = this.w;
            if(e36 == null) {
                L.S("binding");
                e36 = null;
            }
            int v7 = Color.parseColor("#66000000");
            e36.z.b().setOutlineSpotShadowColor(v7);
            E e37 = this.w;
            if(e37 == null) {
                L.S("binding");
                e37 = null;
            }
            int v8 = Color.parseColor("#00000000");
            e37.B.b().setOutlineAmbientShadowColor(v8);
            E e38 = this.w;
            if(e38 == null) {
                L.S("binding");
                e38 = null;
            }
            int v9 = Color.parseColor("#66000000");
            e38.B.b().setOutlineSpotShadowColor(v9);
            E e39 = this.w;
            if(e39 == null) {
                L.S("binding");
                e39 = null;
            }
            int v10 = Color.parseColor("#00000000");
            e39.b.b().setOutlineAmbientShadowColor(v10);
            E e40 = this.w;
            if(e40 == null) {
                L.S("binding");
                e40 = null;
            }
            int v11 = Color.parseColor("#66000000");
            e40.b.b().setOutlineSpotShadowColor(v11);
            E e41 = this.w;
            if(e41 == null) {
                L.S("binding");
                e41 = null;
            }
            int v12 = Color.parseColor("#00000000");
            e41.A.b().setOutlineAmbientShadowColor(v12);
            E e42 = this.w;
            if(e42 == null) {
                L.S("binding");
                e43 = null;
            }
            else {
                e43 = e42;
            }
            int v13 = Color.parseColor("#66000000");
            e43.A.b().setOutlineSpotShadowColor(v13);
        }
    }

    // 检测为 Lambda 实现
    private static final CharSequence w3(kotlin.text.r r0, CharSequence charSequence0, int v, int v1, Spanned spanned0, int v2, int v3) [...]

    private final void x3() {
        boolean z;
        if(this.A.x() <= 0) {
            E e0 = this.w;
            E e1 = null;
            if(e0 == null) {
                L.S("binding");
                e0 = null;
            }
            Editable editable0 = e0.B.q.getText();
            if(editable0 == null) {
            label_12:
                E e2 = this.w;
                if(e2 == null) {
                    L.S("binding");
                }
                else {
                    e1 = e2;
                }
                Editable editable1 = e1.B.i.getText();
                if(editable1 == null) {
                    z = false;
                }
                else {
                    String s1 = editable1.toString();
                    z = s1 != null && s1.length() > 0;
                }
            }
            else {
                String s = editable0.toString();
                if(s != null && s.length() > 0) {
                    z = true;
                    AiPromptLoadActivity.y.a(this, this.R8, z);
                    return;
                }
                goto label_12;
            }
        }
        else {
            z = true;
        }
        AiPromptLoadActivity.y.a(this, this.R8, z);
    }

    private final void y3() {
        com.dcinside.app.model.f f0 = new com.dcinside.app.model.f();
        f0.l(this.B.w().c().e());
        f0.k(this.Q8);
        f0.n(this.m3());
        f0.m(this.l3());
        com.dcinside.app.write.menu.ai.type.e e0 = this.z.x();
        E e1 = null;
        f0.s((e0 == null ? null : e0.e()));
        E e2 = this.w;
        if(e2 == null) {
            L.S("binding");
            e2 = null;
        }
        f0.t(e2.A.e.isChecked());
        if(this.N8 != null && this.N8.length() > 0) {
            f0.q(this.M8);
            f0.o(this.N8);
            f0.p((this.N8 == null ? null : v.s5(this.N8, '.', "")));
            E e3 = this.w;
            if(e3 == null) {
                L.S("binding");
            }
            else {
                e1 = e3;
            }
            Float float0 = v.N0(e1.b.v.getText().toString());
            f0.r(((float)(float0 == null ? 1.0f : ((float)float0))));
        }
        Intent intent0 = new Intent();
        intent0.putExtra("EXTRA_PROMPT_RESULT_JSON", uk.a.D(f0));
        intent0.putExtra("EXTRA_MODIFY_PROMPT", this.U8);
        this.setResult(-1, intent0);
        this.finish();
    }

    private final void z3() {
        int v = this.B.v();
        E e0 = this.w;
        LinearLayoutManager linearLayoutManager0 = null;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        LayoutManager recyclerView$LayoutManager0 = e0.z.e.getLayoutManager();
        if(recyclerView$LayoutManager0 instanceof LinearLayoutManager) {
            linearLayoutManager0 = (LinearLayoutManager)recyclerView$LayoutManager0;
        }
        if(linearLayoutManager0 == null) {
            return;
        }
        linearLayoutManager0.q3(v, 0);
    }
}

