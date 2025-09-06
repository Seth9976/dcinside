package com.dcinside.app.image.edit.text;

import Y.f2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.dcinside.app.image.edit.ImageEditActivity;
import com.dcinside.app.image.edit.a;
import com.dcinside.app.image.edit.b;
import com.dcinside.app.image.edit.d.e;
import com.dcinside.app.image.edit.d.g;
import com.dcinside.app.image.edit.h;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.wk;
import com.dcinside.app.view.ColorSeekBar;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import java.io.File;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nImageEditTextFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditTextFragment.kt\ncom/dcinside/app/image/edit/text/ImageEditTextFragment\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n25#2:196\n25#2:198\n25#2:199\n25#2:201\n25#2:202\n25#2:203\n255#3:197\n255#3:204\n257#3,2:205\n1#4:200\n*S KotlinDebug\n*F\n+ 1 ImageEditTextFragment.kt\ncom/dcinside/app/image/edit/text/ImageEditTextFragment\n*L\n85#1:196\n100#1:198\n113#1:199\n153#1:201\n158#1:202\n163#1:203\n97#1:197\n177#1:204\n178#1:205,2\n*E\n"})
public final class d extends a implements g, h, com.dcinside.app.image.edit.text.b.a, j, com.dcinside.app.rx.a {
    private final com.dcinside.app.rx.a b;
    @m
    private f2 c;
    @m
    private View d;
    private com.dcinside.app.image.edit.d e;

    public d() {
        this(null, 1, null);
    }

    public d(@l com.dcinside.app.rx.a a0) {
        L.p(a0, "scope");
        super();
        this.b = a0;
    }

    public d(com.dcinside.app.rx.a a0, int v, w w0) {
        if((v & 1) != 0) {
            a0 = new com.dcinside.app.rx.h(null, 1, null);
        }
        this(a0);
    }

    @Override  // com.dcinside.app.image.edit.h
    public void I(@m b b0) {
    }

    @Override  // com.dcinside.app.image.edit.h
    public void N(@m b b0, int v) {
        if(v == 0) {
            f2 f20 = this.o0();
            L.o(f20.e, "imageEditTextList");
            Adapter recyclerView$Adapter0 = f20.e.getAdapter();
            if(!(recyclerView$Adapter0 instanceof com.dcinside.app.image.edit.text.b)) {
                recyclerView$Adapter0 = null;
            }
            if(((com.dcinside.app.image.edit.text.b)recyclerView$Adapter0) != null) {
                ((com.dcinside.app.image.edit.text.b)recyclerView$Adapter0).C(false);
            }
            this.m0(null);
        }
    }

    @Override  // com.dcinside.app.image.edit.h
    public void P(@m b b0) {
    }

    @Override  // com.dcinside.app.image.edit.text.b$a
    public void S(int v) {
        String s;
        f2 f20 = this.o0();
        L.o(f20.f, "imageEditTextProgress");
        if(f20.f.getVisibility() == 0) {
            return;
        }
        int v1 = 0xFF000000;
        ViewGroup viewGroup0 = null;
        switch(v) {
            case 0: {
                f2 f22 = this.o0();
                L.o(f22.e, "imageEditTextList");
                Adapter recyclerView$Adapter1 = f22.e.getAdapter();
                if(!(recyclerView$Adapter1 instanceof com.dcinside.app.image.edit.text.b)) {
                    recyclerView$Adapter1 = null;
                }
                if(((com.dcinside.app.image.edit.text.b)recyclerView$Adapter1) != null) {
                    v1 = ((com.dcinside.app.image.edit.text.b)recyclerView$Adapter1).v();
                }
                com.dcinside.app.image.edit.d d0 = this.e;
                if(d0 == null) {
                    L.S("editor");
                    d0 = null;
                }
                d0.k("", v1);
                View view2 = this.getView();
                ViewGroup viewGroup1 = view2 instanceof ViewGroup ? ((ViewGroup)view2) : null;
                if(viewGroup1 == null) {
                    return;
                }
                this.m0(i.a.k(viewGroup1, null, this));
                return;
            }
            case 1: {
                TextView textView0 = this.d == null ? null : ((TextView)this.d.findViewById(0x7F0B0FEC));  // id:tvPhotoEditorText
                if(textView0 == null) {
                    s = null;
                }
                else {
                    CharSequence charSequence0 = textView0.getText();
                    s = charSequence0 == null ? null : charSequence0.toString();
                }
                View view1 = this.getView();
                if(view1 instanceof ViewGroup) {
                    viewGroup0 = (ViewGroup)view1;
                }
                if(viewGroup0 == null) {
                    return;
                }
                this.m0(i.a.k(viewGroup0, s, this));
                return;
            }
            case 2: {
                f2 f21 = this.o0();
                L.o(f21.e, "imageEditTextList");
                Adapter recyclerView$Adapter0 = f21.e.getAdapter();
                if(!(recyclerView$Adapter0 instanceof com.dcinside.app.image.edit.text.b)) {
                    recyclerView$Adapter0 = null;
                }
                if(((com.dcinside.app.image.edit.text.b)recyclerView$Adapter0) != null) {
                    v1 = ((com.dcinside.app.image.edit.text.b)recyclerView$Adapter0).v();
                }
                View view0 = this.getView();
                if(view0 instanceof ViewGroup) {
                    viewGroup0 = (ViewGroup)view0;
                }
                if(viewGroup0 == null) {
                    return;
                }
                this.m0(i.a.i(viewGroup0, v1, this));
                return;
            }
            case 3: {
                this.p0(0x800003);
                return;
            }
            case 4: {
                this.p0(1);
                return;
            }
            case 5: {
                this.p0(0x800005);
            }
        }
    }

    @Override  // com.dcinside.app.image.edit.text.j
    public void V(@l String s) {
        L.p(s, "text");
        View view0 = this.d;
        if(view0 == null) {
            return;
        }
        TextView textView0 = (TextView)view0.findViewById(0x7F0B0FEC);  // id:tvPhotoEditorText
        com.dcinside.app.image.edit.d d0 = this.e;
        if(d0 == null) {
            L.S("editor");
            d0 = null;
        }
        d0.t(view0, s, textView0.getTextColors().getDefaultColor());
    }

    @Override  // com.dcinside.app.image.edit.h
    public void f(@m View view0, @m String s, int v) {
        Adapter recyclerView$Adapter0 = null;
        TextView textView0 = view0 == null ? null : ((TextView)view0.findViewById(0x7F0B0FEC));  // id:tvPhotoEditorText
        if(textView0 == null) {
            return;
        }
        this.d = view0;
        FrameLayout frameLayout0 = this.o0().b;
        L.o(frameLayout0, "imageEditTextAdditional");
        EditText editText0 = (EditText)frameLayout0.findViewById(0x7F0B05A4);  // id:image_edit_enter
        if(editText0 != null) {
            editText0.setText(textView0.getText().toString());
        }
        ColorSeekBar colorSeekBar0 = (ColorSeekBar)frameLayout0.findViewById(0x7F0B05CC);  // id:image_edit_text_color
        if(colorSeekBar0 != null) {
            colorSeekBar0.setAlphaBarPosition(0xFF - Color.alpha(v));
        }
        if(colorSeekBar0 != null) {
            colorSeekBar0.setColor(v);
        }
        f2 f20 = this.o0();
        L.o(f20.e, "imageEditTextList");
        Adapter recyclerView$Adapter1 = f20.e.getAdapter();
        if(recyclerView$Adapter1 instanceof com.dcinside.app.image.edit.text.b) {
            recyclerView$Adapter0 = recyclerView$Adapter1;
        }
        if(((com.dcinside.app.image.edit.text.b)recyclerView$Adapter0) != null) {
            ((com.dcinside.app.image.edit.text.b)recyclerView$Adapter0).B(v);
        }
    }

    @Override  // kotlinx.coroutines.O
    @l
    public kotlin.coroutines.g getCoroutineContext() {
        return this.b.getCoroutineContext();
    }

    @Override  // com.dcinside.app.image.edit.h
    public void j(@m b b0, int v) {
        f2 f20 = this.o0();
        L.o(f20.e, "imageEditTextList");
        Adapter recyclerView$Adapter0 = f20.e.getAdapter();
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.image.edit.text.b)) {
            recyclerView$Adapter0 = null;
        }
        if(((com.dcinside.app.image.edit.text.b)recyclerView$Adapter0) != null) {
            ((com.dcinside.app.image.edit.text.b)recyclerView$Adapter0).C(true);
        }
    }

    @Override  // com.dcinside.app.image.edit.a
    public void j0() {
        ProgressBar progressBar0 = this.o0().f;
        L.o(progressBar0, "imageEditTextProgress");
        File file0 = wk.c.c();
        if(file0 == null) {
            return;
        }
        if(progressBar0.getVisibility() == 0) {
            return;
        }
        progressBar0.setVisibility(0);
        File file1 = new File(file0, System.nanoTime() + ".fix");
        com.dcinside.app.image.edit.j j0 = new com.dcinside.app.image.edit.j.a().e();
        com.dcinside.app.image.edit.d d0 = this.e;
        if(d0 == null) {
            L.S("editor");
            d0 = null;
        }
        d0.I(this, file1.getPath(), j0, this);
    }

    private final void m0(View view0) {
        FrameLayout.LayoutParams frameLayout$LayoutParams0;
        FrameLayout frameLayout0 = this.o0().b;
        boolean z = view0 != null;
        frameLayout0.setClickable(z);
        if(z) {
            frameLayout0.removeAllViews();
            if(view0 == null) {
                frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
            }
            else {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                frameLayout$LayoutParams0 = viewGroup$LayoutParams0 == null ? new FrameLayout.LayoutParams(-2, -2) : new FrameLayout.LayoutParams(viewGroup$LayoutParams0);
            }
            frameLayout$LayoutParams0.gravity = 17;
            frameLayout0.addView(view0, frameLayout$LayoutParams0);
        }
        frameLayout0.animate().cancel();
        frameLayout0.animate().alpha((z ? 1.0f : 0.0f)).withEndAction(() -> {
            L.p(frameLayout0, "$it");
            if(!z) {
                frameLayout0.removeAllViews();
            }
        }).start();
    }

    // 检测为 Lambda 实现
    private static final void n0(boolean z, FrameLayout frameLayout0) [...]

    private final f2 o0() {
        f2 f20 = this.c;
        L.m(f20);
        return f20;
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.c = f2.d(layoutInflater0, viewGroup0, false);
        View view0 = this.o0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.t();
        this.c = null;
    }

    @Override  // com.dcinside.app.image.edit.d$g
    public void onFailure(@l Exception exception0) {
        L.p(exception0, "exception");
        timber.log.b.a.y(exception0);
        Context context0 = this.getContext();
        if(context0 == null) {
            return;
        }
        Dl.G(context0, exception0.getMessage());
        FragmentActivity fragmentActivity0 = this.getActivity();
        ImageEditActivity imageEditActivity0 = fragmentActivity0 instanceof ImageEditActivity ? ((ImageEditActivity)fragmentActivity0) : null;
        if(imageEditActivity0 != null) {
            imageEditActivity0.X1(null);
        }
    }

    @Override  // com.dcinside.app.image.edit.d$g
    public void onSuccess(@l String s) {
        L.p(s, "path");
        FragmentActivity fragmentActivity0 = this.getActivity();
        ImageEditActivity imageEditActivity0 = fragmentActivity0 instanceof ImageEditActivity ? ((ImageEditActivity)fragmentActivity0) : null;
        if(imageEditActivity0 != null) {
            imageEditActivity0.X1(s);
        }
    }

    @Override  // com.dcinside.app.image.edit.a
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        f2 f20 = this.o0();
        L.o(f20.d, "imageEditTextImg");
        Bitmap bitmap0 = BitmapFactory.decodeFile(this.i0());
        f20.d.getSource().setImageBitmap(bitmap0);
        f20.d.setVisibility(0);
        r.h(f20.d);
        com.dcinside.app.image.edit.d d0 = new e(view0.getContext(), f20.d).m(true).i();
        L.o(d0, "build(...)");
        this.e = d0;
        if(d0 == null) {
            L.S("editor");
            d0 = null;
        }
        d0.O(this);
        f2 f21 = this.o0();
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager(0, false);
        f21.e.setLayoutManager(nonPredictiveLayoutManager0);
        com.dcinside.app.image.edit.text.b b0 = new com.dcinside.app.image.edit.text.b(this, this.i0());
        f21.e.setAdapter(b0);
    }

    private final void p0(int v) {
        View view0 = this.d;
        if(view0 == null) {
            return;
        }
        ((TextView)view0.findViewById(0x7F0B0FEC)).setGravity(v);  // id:tvPhotoEditorText
    }

    @Override  // com.dcinside.app.image.edit.text.j
    public void s(int v) {
        View view0 = this.d;
        if(view0 == null) {
            return;
        }
        f2 f20 = this.o0();
        L.o(f20.e, "imageEditTextList");
        Adapter recyclerView$Adapter0 = f20.e.getAdapter();
        com.dcinside.app.image.edit.d d0 = null;
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.image.edit.text.b)) {
            recyclerView$Adapter0 = null;
        }
        if(((com.dcinside.app.image.edit.text.b)recyclerView$Adapter0) != null) {
            ((com.dcinside.app.image.edit.text.b)recyclerView$Adapter0).B(v);
        }
        TextView textView0 = (TextView)view0.findViewById(0x7F0B0FEC);  // id:tvPhotoEditorText
        com.dcinside.app.image.edit.d d1 = this.e;
        if(d1 == null) {
            L.S("editor");
        }
        else {
            d0 = d1;
        }
        d0.t(this.d, textView0.getText().toString(), v);
    }

    @Override  // com.dcinside.app.rx.a
    public void t() {
        this.b.t();
    }
}

