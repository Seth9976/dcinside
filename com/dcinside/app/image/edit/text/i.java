package com.dcinside.app.image.edit.text;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.dcinside.app.image.edit.d;
import com.dcinside.app.image.edit.resize.e;
import com.dcinside.app.image.view.DrawStateView;
import com.dcinside.app.image.view.SeekBarWithChart;
import com.dcinside.app.internal.t;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.ol;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.ColorSeekBar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.S0;
import kotlin.collections.T;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nImageEditViewFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditViewFactory.kt\ncom/dcinside/app/image/edit/text/ImageEditViewFactory\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n147#2:210\n147#2:211\n147#2:212\n55#3,12:213\n84#3,3:225\n1628#4,2:228\n1630#4:231\n1#5:230\n*S KotlinDebug\n*F\n+ 1 ImageEditViewFactory.kt\ncom/dcinside/app/image/edit/text/ImageEditViewFactory\n*L\n76#1:210\n120#1:211\n138#1:212\n148#1:213,12\n148#1:225,3\n192#1:228,2\n192#1:231\n*E\n"})
public final class i {
    static class a implements TextWatcher {
        @Override  // android.text.TextWatcher
        public void afterTextChanged(@m Editable editable0) {
        }

        @Override  // android.text.TextWatcher
        public void beforeTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
        }

        @Override  // android.text.TextWatcher
        public void onTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
        }
    }

    @l
    public static final i a;

    static {
        i.a = new i();
    }

    @l
    public final View e(@l ViewGroup viewGroup0, @m d d0) {
        static final class b extends N implements Function1 {
            final WeakReference e;

            b(WeakReference weakReference0) {
                this.e = weakReference0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Boolean)object0).booleanValue());
                return S0.a;
            }

            public final void invoke(boolean z) {
                if(z) {
                    d d0 = (d)this.e.get();
                    if(d0 != null) {
                        d0.m();
                    }
                }
                else {
                    d d1 = (d)this.e.get();
                    if(d1 != null) {
                        d1.K(true);
                    }
                }
            }
        }


        static final class c extends N implements Function1 {
            final WeakReference e;
            final DrawStateView f;

            c(WeakReference weakReference0, DrawStateView drawStateView0) {
                this.e = weakReference0;
                this.f = drawStateView0;
                super(1);
            }

            public final void a(int v) {
                d d0 = (d)this.e.get();
                if(d0 != null) {
                    d0.N(((float)v));
                }
                this.f.setErase(false);
                this.f.setDrawStateSize(((float)v));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Number)object0).intValue());
                return S0.a;
            }
        }

        L.p(viewGroup0, "root");
        WeakReference weakReference0 = new WeakReference(d0);
        Context context0 = viewGroup0.getContext();
        View view0 = LayoutInflater.from(context0).inflate(0x7F0E01E3, viewGroup0, false);  // layout:view_image_edit_draw_options
        view0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View view1 = view0.findViewById(0x7F0B0597);  // id:image_edit_draw_color
        L.o(view1, "findViewById(...)");
        View view2 = view0.findViewById(0x7F0B059E);  // id:image_edit_draw_size
        L.o(view2, "findViewById(...)");
        View view3 = view0.findViewById(0x7F0B0599);  // id:image_edit_draw_erase
        L.o(view3, "findViewById(...)");
        L.m(context0);
        ((DrawStateView)view3).setDrawStateBackgroundColor(vk.b(context0, 0x7F0406F6));  // attr:windowBackgroundInverse
        ((DrawStateView)view3).setOnEraseChange(new b(weakReference0));
        ((ColorSeekBar)view1).setOnColorChangeListener((int v, int v1, int v2) -> {
            L.p(weakReference0, "$refEditor");
            L.p(((DrawStateView)view3), "$state");
            d d0 = (d)weakReference0.get();
            if(d0 != null) {
                d0.J(v2);
                d0.P(((int)(((float)(0xFF - v1)) / 255.0f * 100.0f)));
            }
            ((DrawStateView)view3).setErase(false);
            ((DrawStateView)view3).setDrawStateColor(v2);
        });
        ((SeekBarWithChart)view2).setOnSelectedEntriesSizeChanged(new c(weakReference0, ((DrawStateView)view3)));
        d d1 = (d)weakReference0.get();
        if(d1 != null) {
            d1.J(((ColorSeekBar)view1).getColor());
        }
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = s.W1(0, 100).iterator();
        while(iterator0.hasNext()) {
            float f = (float)((T)iterator0).b();
            arrayList0.add(new com.dcinside.app.image.view.a(f, f));
        }
        ((SeekBarWithChart)view2).setEntries(arrayList0);
        ((SeekBarWithChart)view2).setRange(30);
        L.m(view0);
        return view0;
    }

    // 检测为 Lambda 实现
    private static final void f(WeakReference weakReference0, DrawStateView drawStateView0, int v, int v1, int v2) [...]

    @l
    public final View g(@l ViewGroup viewGroup0, int v, int v1, @l e e0) {
        public static final class com.dcinside.app.image.edit.text.i.d extends a {
            final int a;
            final int b;
            final EditText c;
            final EditText d;
            final t e;

            com.dcinside.app.image.edit.text.i.d(int v, int v1, EditText editText0, EditText editText1, t t0) {
                this.a = v;
                this.b = v1;
                this.c = editText0;
                this.d = editText1;
                this.e = t0;
                super();
            }

            @Override  // com.dcinside.app.image.edit.text.i$a
            public void onTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
                ol ol0 = i.a.h(charSequence0, false, this.a, this.b, this.c, this.d);
                e e0 = (e)this.e.a();
                if(e0 != null) {
                    e0.K(ol0);
                }
            }
        }


        public static final class com.dcinside.app.image.edit.text.i.e extends a {
            final int a;
            final int b;
            final EditText c;
            final EditText d;
            final t e;

            com.dcinside.app.image.edit.text.i.e(int v, int v1, EditText editText0, EditText editText1, t t0) {
                this.a = v;
                this.b = v1;
                this.c = editText0;
                this.d = editText1;
                this.e = t0;
                super();
            }

            @Override  // com.dcinside.app.image.edit.text.i$a
            public void onTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
                ol ol0 = i.a.h(charSequence0, true, this.a, this.b, this.c, this.d);
                e e0 = (e)this.e.a();
                if(e0 != null) {
                    e0.K(ol0);
                }
            }
        }

        L.p(viewGroup0, "root");
        L.p(e0, "callback");
        t t0 = new t(e0);
        Context context0 = viewGroup0.getContext();
        View view0 = LayoutInflater.from(context0).inflate(0x7F0E01E7, viewGroup0, false);  // layout:view_image_edit_resize
        view0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        View view1 = view0.findViewById(0x7F0B05C0);  // id:image_edit_resize_now_value
        L.o(view1, "findViewById(...)");
        View view2 = view0.findViewById(0x7F0B05BD);  // id:image_edit_resize_new_width
        L.o(view2, "findViewById(...)");
        View view3 = view0.findViewById(0x7F0B05BB);  // id:image_edit_resize_new_height
        L.o(view3, "findViewById(...)");
        ((TextView)view1).setText(context0.getString(0x7F1504BC, new Object[]{v, v1}));  // string:image_edit_resize_now_value "%1$d X %2$d"
        ((EditText)view2).setText(String.valueOf(v));
        ((EditText)view3).setText(String.valueOf(v1));
        com.dcinside.app.image.edit.text.i.e i$e0 = new com.dcinside.app.image.edit.text.i.e(v, v1, ((EditText)view2), ((EditText)view3), t0);
        com.dcinside.app.image.edit.text.i.d i$d0 = new com.dcinside.app.image.edit.text.i.d(v, v1, ((EditText)view2), ((EditText)view3), t0);
        ((EditText)view2).addTextChangedListener(i$e0);
        ((EditText)view2).setTag(0x7F0B0D7F, i$e0);  // id:resize_watcher
        ((EditText)view3).addTextChangedListener(i$d0);
        ((EditText)view3).setTag(0x7F0B0D7F, i$d0);  // id:resize_watcher
        L.m(view0);
        return view0;
    }

    private final ol h(CharSequence charSequence0, boolean z, int v, int v1, EditText editText0, EditText editText1) {
        Integer integer0;
        a i$a0 = null;
        if(charSequence0 == null) {
            integer0 = null;
        }
        else {
            String s = charSequence0.toString();
            integer0 = s == null ? null : v.b1(s);
        }
        Object object0 = editText0.getTag(0x7F0B0D7F);  // id:resize_watcher
        a i$a1 = object0 instanceof a ? ((a)object0) : null;
        Object object1 = editText1.getTag(0x7F0B0D7F);  // id:resize_watcher
        if(object1 instanceof a) {
            i$a0 = (a)object1;
        }
        if(integer0 != null && i$a1 != null && i$a0 != null) {
            ol ol0 = z ? ol.e.k(v, v1, ((int)integer0), 4000) : ol.e.h(v, v1, ((int)integer0), 4000);
            if(!z || ol0.h()) {
                editText0.removeTextChangedListener(i$a1);
                editText0.setText(String.valueOf(ol0.j()));
                editText0.addTextChangedListener(i$a1);
            }
            if(z || ol0.h()) {
                editText1.removeTextChangedListener(i$a0);
                editText1.setText(String.valueOf(ol0.g()));
                editText1.addTextChangedListener(i$a0);
            }
            if(ol0.h()) {
                if(z) {
                    editText0.setSelection(editText0.getText().length());
                    return ol0;
                }
                editText1.setSelection(editText1.getText().length());
                return ol0;
            }
            return ol0;
        }
        return new ol(0, 0, false, false);
    }

    @l
    public final View i(@l ViewGroup viewGroup0, int v, @l j j0) {
        L.p(viewGroup0, "root");
        L.p(j0, "callback");
        t t0 = new t(j0);
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01EA, viewGroup0, false);  // layout:view_image_edit_text_options_color
        view0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View view1 = view0.findViewById(0x7F0B05CC);  // id:image_edit_text_color
        L.o(view1, "findViewById(...)");
        ((ColorSeekBar)view1).setAlphaBarPosition(0xFF - Color.alpha(v));
        ((ColorSeekBar)view1).setColor(v);
        ((ColorSeekBar)view1).setOnColorChangeListener((int v, int v1, int v2) -> {
            L.p(t0, "$weakCallback");
            j j0 = (j)t0.a();
            if(j0 != null) {
                j0.s(v2);
            }
        });
        L.m(view0);
        return view0;
    }

    // 检测为 Lambda 实现
    private static final void j(t t0, int v, int v1, int v2) [...]

    @l
    public final View k(@l ViewGroup viewGroup0, @m String s, @l j j0) {
        @s0({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 ImageEditViewFactory.kt\ncom/dcinside/app/image/edit/text/ImageEditViewFactory\n*L\n1#1,82:1\n63#2:83\n59#3:84\n149#4,2:85\n*E\n"})
        public static final class f implements TextWatcher {
            final t a;

            public f(t t0) {
                this.a = t0;
                super();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
                String s;
                j j0 = (j)this.a.a();
                if(j0 != null) {
                    if(charSequence0 == null) {
                        s = "";
                    }
                    else {
                        s = charSequence0.toString();
                        if(s == null) {
                            s = "";
                        }
                    }
                    j0.V(s);
                }
            }
        }

        L.p(viewGroup0, "root");
        L.p(j0, "callback");
        t t0 = new t(j0);
        int v = 0;
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01EB, viewGroup0, false);  // layout:view_image_edit_text_options_enter
        view0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View view1 = view0.findViewById(0x7F0B05A4);  // id:image_edit_enter
        L.o(view1, "findViewById(...)");
        ((EditText)view1).setText(s);
        if(s != null) {
            v = s.length();
        }
        ((EditText)view1).setSelection(v);
        ((EditText)view1).setSelected(true);
        ((EditText)view1).addTextChangedListener(new f(t0));
        ((EditText)view1).post(() -> {
            L.p(((EditText)view1), "$edt");
            Nk.a.f(((EditText)view1));
        });
        L.m(view0);
        return view0;
    }

    // 检测为 Lambda 实现
    private static final void l(EditText editText0) [...]
}

