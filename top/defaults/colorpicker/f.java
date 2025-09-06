package top.defaults.colorpicker;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.Locale;

public class f {
    public static class d {
        private Context a;
        private int b;
        private boolean c;
        private boolean d;
        private String e;
        private String f;
        private boolean g;
        private boolean h;
        private boolean i;

        public d(Context context0) {
            this.b = 0xFFFF00FF;
            this.c = true;
            this.d = false;
            this.e = "OK";
            this.f = "Cancel";
            this.g = true;
            this.h = true;
            this.i = false;
            this.a = context0;
        }

        public f j() {
            return new f(this, null);
        }

        public d k(String s) {
            this.f = s;
            return this;
        }

        public d l(boolean z) {
            this.d = z;
            return this;
        }

        public d m(boolean z) {
            this.c = z;
            return this;
        }

        public d n(int v) {
            this.b = v;
            return this;
        }

        public d o(String s) {
            this.e = s;
            return this;
        }

        public d p(boolean z) {
            this.i = z;
            return this;
        }

        public d q(boolean z) {
            this.g = z;
            return this;
        }

        public d r(boolean z) {
            this.h = z;
            return this;
        }
    }

    public static abstract class e implements top.defaults.colorpicker.e {
        public abstract void a(int arg1);

        @Override  // top.defaults.colorpicker.e
        public final void e(int v, boolean z, boolean z1) {
        }
    }

    private Context a;
    private PopupWindow b;
    private int c;
    private boolean d;
    private boolean e;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private boolean j;

    private f(d f$d0) {
        this.a = f$d0.a;
        this.c = f$d0.b;
        this.d = f$d0.c;
        this.e = f$d0.d;
        this.f = f$d0.e;
        this.g = f$d0.f;
        this.h = f$d0.g;
        this.i = f$d0.h;
        this.j = f$d0.i;
    }

    f(d f$d0, g g0) {
        this(f$d0);
    }

    private String e(int v) {
        int v1 = Color.alpha(v);
        int v2 = Color.red(v);
        int v3 = Color.green(v);
        int v4 = Color.blue(v);
        return String.format(Locale.getDefault(), "0x%02X%02X%02X%02X", v1, v2, v3, v4);
    }

    public void f() {
        PopupWindow popupWindow0 = this.b;
        if(popupWindow0 != null) {
            popupWindow0.dismiss();
        }
    }

    public void g(View view0, e f$e0) {
        class a implements View.OnClickListener {
            final f a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                f.this.b.dismiss();
            }
        }


        class b implements View.OnClickListener {
            final e a;
            final ColorPickerView b;
            final f c;

            b(e f$e0, ColorPickerView colorPickerView0) {
                this.a = f$e0;
                this.b = colorPickerView0;
                super();
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                f.this.b.dismiss();
                e f$e0 = this.a;
                if(f$e0 != null) {
                    f$e0.a(this.b.getColor());
                }
            }
        }


        class c implements top.defaults.colorpicker.e {
            final View a;
            final TextView b;
            final f c;

            c(View view0, TextView textView0) {
                this.a = view0;
                this.b = textView0;
                super();
            }

            @Override  // top.defaults.colorpicker.e
            public void e(int v, boolean z, boolean z1) {
                if(f.this.h) {
                    this.a.setBackgroundColor(v);
                }
                if(f.this.i) {
                    String s = f.this.e(v);
                    this.b.setText(s);
                }
            }
        }

        LayoutInflater layoutInflater0 = (LayoutInflater)this.a.getSystemService("layout_inflater");
        if(layoutInflater0 == null) {
            return;
        }
        View view1 = layoutInflater0.inflate(layout.top_defaults_view_color_picker_popup, null);
        ColorPickerView colorPickerView0 = (ColorPickerView)view1.findViewById(id.colorPickerView);
        PopupWindow popupWindow0 = new PopupWindow(view1, -2, -2);
        this.b = popupWindow0;
        popupWindow0.setBackgroundDrawable(new ColorDrawable(-1));
        this.b.setOutsideTouchable(true);
        colorPickerView0.setInitialColor(this.c);
        colorPickerView0.setEnabledBrightness(this.d);
        colorPickerView0.setEnabledAlpha(this.e);
        colorPickerView0.setOnlyUpdateOnTouchEventUp(this.j);
        colorPickerView0.m(f$e0);
        TextView textView0 = (TextView)view1.findViewById(id.cancel);
        textView0.setText(this.g);
        textView0.setOnClickListener(new a(this));
        TextView textView1 = (TextView)view1.findViewById(id.ok);
        textView1.setText(this.f);
        textView1.setOnClickListener(new b(this, f$e0, colorPickerView0));
        View view2 = view1.findViewById(id.colorIndicator);
        TextView textView2 = (TextView)view1.findViewById(id.colorHex);
        int v = 8;
        view2.setVisibility((this.h ? 0 : 8));
        if(this.i) {
            v = 0;
        }
        textView2.setVisibility(v);
        if(this.h) {
            view2.setBackgroundColor(this.c);
        }
        if(this.i) {
            textView2.setText(this.e(this.c));
        }
        colorPickerView0.m(new c(this, view2, textView2));
        this.b.setElevation(10.0f);
        this.b.setAnimationStyle(style.TopDefaultsViewColorPickerPopupAnimation);
        if(view0 == null) {
            view0 = view1;
        }
        this.b.showAtLocation(view0, 17, 0, 0);
    }

    public void h(e f$e0) {
        this.g(null, f$e0);
    }
}

