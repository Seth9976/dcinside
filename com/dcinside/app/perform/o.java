package com.dcinside.app.perform;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AbsListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.R.styleable;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.LinearLayoutCompat.LayoutParams;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView.OnScrollChangeListener;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

class o {
    class a implements View.OnClickListener {
        final o a;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            Message message1;
            o o0 = o.this;
            if(view0 == o0.o) {
                Message message0 = o0.q;
                if(message0 != null) {
                    message1 = Message.obtain(message0);
                    goto label_19;
                }
                goto label_6;
            }
            else {
            label_6:
                if(view0 == o0.s) {
                    Message message2 = o0.u;
                    if(message2 != null) {
                        message1 = Message.obtain(message2);
                        goto label_19;
                    }
                    goto label_11;
                }
                else {
                label_11:
                    if(view0 == o0.w) {
                        Message message3 = o0.y;
                        message1 = message3 == null ? null : Message.obtain(message3);
                    }
                    else {
                        message1 = null;
                    }
                }
            }
        label_19:
            if(message1 != null) {
                message1.sendToTarget();
            }
            o.this.R.obtainMessage(1, o.this.b).sendToTarget();
        }
    }

    public static class f {
        public interface e {
            void a(ListView arg1);
        }

        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public int I;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public boolean N;
        public AdapterView.OnItemSelectedListener O;
        public e P;
        public boolean Q;
        public final Context a;
        public final LayoutInflater b;
        public int c;
        public Drawable d;
        public int e;
        public CharSequence f;
        public View g;
        public CharSequence h;
        public CharSequence i;
        public Drawable j;
        public DialogInterface.OnClickListener k;
        public CharSequence l;
        public Drawable m;
        public DialogInterface.OnClickListener n;
        public CharSequence o;
        public Drawable p;
        public DialogInterface.OnClickListener q;
        public boolean r;
        public DialogInterface.OnCancelListener s;
        public DialogInterface.OnDismissListener t;
        public DialogInterface.OnKeyListener u;
        public CharSequence[] v;
        public ListAdapter w;
        public DialogInterface.OnClickListener x;
        public int y;
        public View z;

        public f(Context context0) {
            this.c = 0;
            this.e = 0;
            this.E = false;
            this.I = -1;
            this.Q = true;
            this.a = context0;
            this.r = true;
            this.b = (LayoutInflater)context0.getSystemService("layout_inflater");
        }

        public void a(o o0) {
            View view0 = this.g;
            if(view0 == null) {
                CharSequence charSequence0 = this.f;
                if(charSequence0 != null) {
                    o0.s(charSequence0);
                }
                Drawable drawable0 = this.d;
                if(drawable0 != null) {
                    o0.p(drawable0);
                }
                int v = this.c;
                if(v != 0) {
                    o0.o(v);
                }
                int v1 = this.e;
                if(v1 != 0) {
                    o0.o(o0.d(v1));
                }
            }
            else {
                o0.n(view0);
            }
            CharSequence charSequence1 = this.h;
            if(charSequence1 != null) {
                o0.q(charSequence1);
            }
            CharSequence charSequence2 = this.i;
            if(charSequence2 != null || this.j != null) {
                o0.l(-1, charSequence2, this.k, null, this.j);
            }
            CharSequence charSequence3 = this.l;
            if(charSequence3 != null || this.m != null) {
                o0.l(-2, charSequence3, this.n, null, this.m);
            }
            CharSequence charSequence4 = this.o;
            if(charSequence4 != null || this.p != null) {
                o0.l(-3, charSequence4, this.q, null, this.p);
            }
            if(this.v != null || this.K != null || this.w != null) {
                this.b(o0);
            }
            View view1 = this.z;
            if(view1 != null) {
                if(this.E) {
                    o0.v(view1, this.A, this.B, this.C, this.D);
                    return;
                }
                o0.u(view1);
                return;
            }
            int v2 = this.y;
            if(v2 != 0) {
                o0.t(v2);
            }
        }

        private void b(o o0) {
            class com.dcinside.app.perform.o.f.a extends ArrayAdapter {
                final ListView a;
                final f b;

                com.dcinside.app.perform.o.f.a(Context context0, int v, int v1, CharSequence[] arr_charSequence, ListView listView0) {
                    this.a = listView0;
                    super(context0, v, v1, arr_charSequence);
                }

                @Override  // android.widget.ArrayAdapter
                public View getView(int v, View view0, ViewGroup viewGroup0) {
                    View view1 = super.getView(v, view0, viewGroup0);
                    boolean[] arr_z = f.this.F;
                    if(arr_z != null && arr_z[v]) {
                        this.a.setItemChecked(v, true);
                    }
                    return view1;
                }
            }


            class b extends CursorAdapter {
                private final int a;
                private final int b;
                final ListView c;
                final o d;
                final f e;

                b(Context context0, Cursor cursor0, boolean z, ListView listView0, o o0) {
                    this.c = listView0;
                    this.d = o0;
                    super(context0, cursor0, z);
                    Cursor cursor1 = this.getCursor();
                    this.a = cursor1.getColumnIndexOrThrow(o$f0.L);
                    this.b = cursor1.getColumnIndexOrThrow(o$f0.M);
                }

                @Override  // android.widget.CursorAdapter
                public void bindView(View view0, Context context0, Cursor cursor0) {
                    ((CheckedTextView)view0.findViewById(0x1020014)).setText(cursor0.getString(this.a));
                    int v = cursor0.getPosition();
                    boolean z = cursor0.getInt(this.b) == 1;
                    this.c.setItemChecked(v, z);
                }

                @Override  // android.widget.CursorAdapter
                public View newView(Context context0, Cursor cursor0, ViewGroup viewGroup0) {
                    return f.this.b.inflate(this.d.M, viewGroup0, false);
                }
            }


            class c implements AdapterView.OnItemClickListener {
                final o a;
                final f b;

                c(o o0) {
                    this.a = o0;
                    super();
                }

                @Override  // android.widget.AdapterView$OnItemClickListener
                public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
                    f.this.x.onClick(this.a.b, v);
                    if(!f.this.H) {
                        this.a.b.dismiss();
                    }
                }
            }


            class d implements AdapterView.OnItemClickListener {
                final ListView a;
                final o b;
                final f c;

                d(ListView listView0, o o0) {
                    this.a = listView0;
                    this.b = o0;
                    super();
                }

                @Override  // android.widget.AdapterView$OnItemClickListener
                public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
                    boolean[] arr_z = f.this.F;
                    if(arr_z != null) {
                        arr_z[v] = this.a.isItemChecked(v);
                    }
                    DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0 = f.this.J;
                    boolean z = this.a.isItemChecked(v);
                    dialogInterface$OnMultiChoiceClickListener0.onClick(this.b.b, v, z);
                }
            }

            ListAdapter listAdapter0;
            ListView listView0 = (ListView)this.b.inflate(o0.L, null);
            if(!this.G) {
                int v = this.H ? o0.N : o0.O;
                if(this.K == null) {
                    listAdapter0 = this.w;
                    if(listAdapter0 == null) {
                        listAdapter0 = new h(this.a, v, 0x1020014, this.v);
                    }
                }
                else {
                    listAdapter0 = new SimpleCursorAdapter(this.a, v, this.K, new String[]{this.L}, new int[]{0x1020014});
                }
            }
            else if(this.K == null) {
                listAdapter0 = new com.dcinside.app.perform.o.f.a(this, this.a, o0.M, 0x1020014, this.v, listView0);
            }
            else {
                listAdapter0 = new b(this, this.a, this.K, false, listView0, o0);
            }
            e o$f$e0 = this.P;
            if(o$f$e0 != null) {
                o$f$e0.a(listView0);
            }
            o0.H = listAdapter0;
            o0.I = this.I;
            if(this.x != null) {
                listView0.setOnItemClickListener(new c(this, o0));
            }
            else if(this.J != null) {
                listView0.setOnItemClickListener(new d(this, listView0, o0));
            }
            AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0 = this.O;
            if(adapterView$OnItemSelectedListener0 != null) {
                listView0.setOnItemSelectedListener(adapterView$OnItemSelectedListener0);
            }
            if(this.H) {
                listView0.setChoiceMode(1);
            }
            else if(this.G) {
                listView0.setChoiceMode(2);
            }
            o0.g = listView0;
        }
    }

    static final class g extends Handler {
        private WeakReference a;
        private static final int b = 1;

        public g(DialogInterface dialogInterface0) {
            this.a = new WeakReference(dialogInterface0);
        }

        @Override  // android.os.Handler
        public void handleMessage(Message message0) {
            switch(message0.what) {
                case -3: 
                case -2: 
                case -1: {
                    ((DialogInterface.OnClickListener)message0.obj).onClick(((DialogInterface)this.a.get()), message0.what);
                    return;
                }
                case 1: {
                    ((DialogInterface)message0.obj).dismiss();
                }
            }
        }
    }

    static class h extends ArrayAdapter {
        public h(Context context0, int v, int v1, CharSequence[] arr_charSequence) {
            super(context0, v, v1, arr_charSequence);
        }

        @Override  // android.widget.ArrayAdapter
        public long getItemId(int v) {
            return (long)v;
        }

        @Override  // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    NestedScrollView A;
    private int B;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    int I;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    private int Q;
    Handler R;
    private final View.OnClickListener S;
    private final Context a;
    final AppCompatDialog b;
    private final Window c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    ListView g;
    private View h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    Button o;
    private CharSequence p;
    Message q;
    private Drawable r;
    Button s;
    private CharSequence t;
    Message u;
    private Drawable v;
    Button w;
    private CharSequence x;
    Message y;
    private Drawable z;

    public o(Context context0, AppCompatDialog appCompatDialog0, Window window0) {
        this.n = false;
        this.B = 0;
        this.I = -1;
        this.Q = 0;
        this.S = new a(this);
        this.a = context0;
        this.b = appCompatDialog0;
        this.c = window0;
        this.R = new g(appCompatDialog0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, styleable.AlertDialog, 0x7F04003E, 0);  // attr:alertDialogStyle
        this.J = typedArray0.getResourceId(0, 0);
        this.K = typedArray0.getResourceId(2, 0);
        this.L = typedArray0.getResourceId(4, 0);
        this.M = typedArray0.getResourceId(5, 0);
        this.N = typedArray0.getResourceId(7, 0);
        this.O = typedArray0.getResourceId(3, 0);
        this.P = typedArray0.getBoolean(6, true);
        this.d = typedArray0.getDimensionPixelSize(1, 0);
        typedArray0.recycle();
        appCompatDialog0.k(1);
    }

    private void A() {
        View view0 = this.c.findViewById(0x7F0B099D);  // id:parentPanel
        View view1 = view0.findViewById(0x7F0B0F9B);  // id:topPanel
        View view2 = view0.findViewById(0x7F0B02F5);  // id:contentPanel
        View view3 = view0.findViewById(0x7F0B026A);  // id:buttonPanel
        ViewGroup viewGroup0 = (ViewGroup)view0.findViewById(0x7F0B0325);  // id:customPanel
        this.y(viewGroup0);
        View view4 = viewGroup0.findViewById(0x7F0B0F9B);  // id:topPanel
        View view5 = viewGroup0.findViewById(0x7F0B02F5);  // id:contentPanel
        View view6 = viewGroup0.findViewById(0x7F0B026A);  // id:buttonPanel
        ViewGroup viewGroup1 = this.j(view4, view1);
        ViewGroup viewGroup2 = this.j(view5, view2);
        ViewGroup viewGroup3 = this.j(view6, view3);
        this.x(viewGroup2);
        this.w(viewGroup3);
        this.z(viewGroup1);
        int v = 0;
        boolean z = viewGroup0.getVisibility() != 8;
        int v1 = viewGroup1 == null || viewGroup1.getVisibility() == 8 ? 0 : 1;
        boolean z1 = viewGroup3 != null && viewGroup3.getVisibility() != 8;
        if(!z1 && viewGroup2 != null) {
            View view7 = viewGroup2.findViewById(0x7F0B0F79);  // id:textSpacerNoButtons
            if(view7 != null) {
                view7.setVisibility(0);
            }
        }
        if(v1 != 0) {
            NestedScrollView nestedScrollView0 = this.A;
            if(nestedScrollView0 != null) {
                nestedScrollView0.setClipToPadding(true);
            }
            View view8 = this.f != null || this.g != null ? viewGroup1.findViewById(0x7F0B0F8F) : null;  // id:titleDividerNoCustom
            if(view8 != null) {
                view8.setVisibility(0);
            }
        }
        else if(viewGroup2 != null) {
            View view9 = viewGroup2.findViewById(0x7F0B0F7A);  // id:textSpacerNoTitle
            if(view9 != null) {
                view9.setVisibility(0);
            }
        }
        ListView listView0 = this.g;
        if(listView0 != null && (!z1 || v1 == 0)) {
            int v2 = listView0.getPaddingLeft();
            int v3 = v1 == 0 ? 0 : this.g.getPaddingTop();
            int v4 = this.g.getPaddingRight();
            int v5 = z1 ? this.g.getPaddingBottom() : 0;
            this.g.setPadding(v2, v3, v4, v5);
        }
        if(!z) {
            ListView listView1 = this.g;
            if(listView1 == null) {
                listView1 = this.A;
            }
            if(listView1 != null) {
                if(z1) {
                    v = 2;
                }
                this.r(viewGroup2, listView1, v1 | v, 3);
            }
        }
        ListView listView2 = this.g;
        if(listView2 != null) {
            ListAdapter listAdapter0 = this.H;
            if(listAdapter0 != null) {
                listView2.setAdapter(listAdapter0);
                int v6 = this.I;
                if(v6 > -1) {
                    listView2.setItemChecked(v6, true);
                    listView2.setSelection(v6);
                }
            }
        }
    }

    private static boolean B(Context context0) {
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(0x7F04003D, typedValue0, true);  // attr:alertDialogCenterButtons
        return typedValue0.data != 0;
    }

    static boolean a(View view0) {
        if(view0.onCheckIsTextEditor()) {
            return true;
        }
        if(!(view0 instanceof ViewGroup)) {
            return false;
        }
        int v = ((ViewGroup)view0).getChildCount();
        while(v > 0) {
            --v;
            if(o.a(((ViewGroup)view0).getChildAt(v))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    private void b(Button button0) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)button0.getLayoutParams();
        linearLayout$LayoutParams0.gravity = 1;
        linearLayout$LayoutParams0.weight = 0.5f;
        button0.setLayoutParams(linearLayout$LayoutParams0);
    }

    public Button c(int v) {
        switch(v) {
            case -3: {
                return this.w;
            }
            case -2: {
                return this.s;
            }
            case -1: {
                return this.o;
            }
            default: {
                return null;
            }
        }
    }

    public int d(int v) {
        TypedValue typedValue0 = new TypedValue();
        this.a.getTheme().resolveAttribute(v, typedValue0, true);
        return typedValue0.resourceId;
    }

    public ListView e() {
        return this.g;
    }

    public void f() {
        int v = this.k();
        this.b.setContentView(v);
        this.A();
    }

    static void g(View view0, View view1, View view2) {
        int v = 4;
        if(view1 != null) {
            view1.setVisibility((view0.canScrollVertically(-1) ? 0 : 4));
        }
        if(view2 != null) {
            if(view0.canScrollVertically(1)) {
                v = 0;
            }
            view2.setVisibility(v);
        }
    }

    public boolean h(int v, KeyEvent keyEvent0) {
        return this.A != null && this.A.o(keyEvent0);
    }

    public boolean i(int v, KeyEvent keyEvent0) {
        return this.A != null && this.A.o(keyEvent0);
    }

    @Nullable
    private ViewGroup j(@Nullable View view0, @Nullable View view1) {
        if(view0 == null) {
            if(view1 instanceof ViewStub) {
                view1 = ((ViewStub)view1).inflate();
            }
            return (ViewGroup)view1;
        }
        if(view1 != null) {
            ViewParent viewParent0 = view1.getParent();
            if(viewParent0 instanceof ViewGroup) {
                ((ViewGroup)viewParent0).removeView(view1);
            }
        }
        if(view0 instanceof ViewStub) {
            view0 = ((ViewStub)view0).inflate();
        }
        return (ViewGroup)view0;
    }

    private int k() {
        int v = this.K;
        if(v == 0) {
            return this.J;
        }
        return this.Q == 1 ? v : this.J;
    }

    public void l(int v, CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0, Message message0, Drawable drawable0) {
        if(message0 == null && dialogInterface$OnClickListener0 != null) {
            message0 = this.R.obtainMessage(v, dialogInterface$OnClickListener0);
        }
        switch(v) {
            case -3: {
                this.x = charSequence0;
                this.y = message0;
                this.z = drawable0;
                return;
            }
            case -2: {
                this.t = charSequence0;
                this.u = message0;
                this.v = drawable0;
                return;
            }
            case -1: {
                this.p = charSequence0;
                this.q = message0;
                this.r = drawable0;
                return;
            }
            default: {
                throw new IllegalArgumentException("Button does not exist");
            }
        }
    }

    public void m(int v) {
        this.Q = v;
    }

    public void n(View view0) {
        this.G = view0;
    }

    public void o(int v) {
        this.C = null;
        this.B = v;
        ImageView imageView0 = this.D;
        if(imageView0 != null) {
            if(v != 0) {
                imageView0.setVisibility(0);
                this.D.setImageResource(this.B);
                return;
            }
            imageView0.setVisibility(8);
        }
    }

    public void p(Drawable drawable0) {
        this.C = drawable0;
        this.B = 0;
        ImageView imageView0 = this.D;
        if(imageView0 != null) {
            if(drawable0 != null) {
                imageView0.setVisibility(0);
                this.D.setImageDrawable(drawable0);
                return;
            }
            imageView0.setVisibility(8);
        }
    }

    public void q(CharSequence charSequence0) {
        this.f = charSequence0;
        TextView textView0 = this.F;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
    }

    private void r(ViewGroup viewGroup0, View view0, int v, int v1) {
        class com.dcinside.app.perform.o.b implements OnScrollChangeListener {
            final View a;
            final View b;

            com.dcinside.app.perform.o.b(View view0, View view1) {
                this.a = view0;
                this.b = view1;
                super();
            }

            @Override  // androidx.core.widget.NestedScrollView$OnScrollChangeListener
            public void a(NestedScrollView nestedScrollView0, int v, int v1, int v2, int v3) {
                o.g(nestedScrollView0, this.a, this.b);
            }
        }


        class com.dcinside.app.perform.o.c implements Runnable {
            final View a;
            final View b;
            final o c;

            com.dcinside.app.perform.o.c(View view0, View view1) {
                this.a = view0;
                this.b = view1;
                super();
            }

            @Override
            public void run() {
                o.g(o.this.A, this.a, this.b);
            }
        }


        class com.dcinside.app.perform.o.d implements AbsListView.OnScrollListener {
            final View a;
            final View b;

            com.dcinside.app.perform.o.d(View view0, View view1) {
                this.a = view0;
                this.b = view1;
                super();
            }

            @Override  // android.widget.AbsListView$OnScrollListener
            public void onScroll(AbsListView absListView0, int v, int v1, int v2) {
                o.g(absListView0, this.a, this.b);
            }

            @Override  // android.widget.AbsListView$OnScrollListener
            public void onScrollStateChanged(AbsListView absListView0, int v) {
            }
        }


        class com.dcinside.app.perform.o.e implements Runnable {
            final View a;
            final View b;
            final o c;

            com.dcinside.app.perform.o.e(View view0, View view1) {
                this.a = view0;
                this.b = view1;
                super();
            }

            @Override
            public void run() {
                o.g(o.this.g, this.a, this.b);
            }
        }

        View view1 = this.c.findViewById(0x7F0B0DC3);  // id:scrollIndicatorUp
        View view2 = this.c.findViewById(0x7F0B0DC2);  // id:scrollIndicatorDown
        if(Build.VERSION.SDK_INT >= 23) {
            ViewCompat.B2(view0, v, v1);
            if(view1 != null) {
                viewGroup0.removeView(view1);
            }
            if(view2 != null) {
                viewGroup0.removeView(view2);
            }
        }
        else {
            if(view1 != null && (v & 1) == 0) {
                viewGroup0.removeView(view1);
                view1 = null;
            }
            if(view2 != null && (v & 2) == 0) {
                viewGroup0.removeView(view2);
                view2 = null;
            }
            if(view1 != null || view2 != null) {
                if(this.f != null) {
                    this.A.setOnScrollChangeListener(new com.dcinside.app.perform.o.b(this, view1, view2));
                    this.A.post(new com.dcinside.app.perform.o.c(this, view1, view2));
                    return;
                }
                ListView listView0 = this.g;
                if(listView0 != null) {
                    listView0.setOnScrollListener(new com.dcinside.app.perform.o.d(this, view1, view2));
                    this.g.post(new com.dcinside.app.perform.o.e(this, view1, view2));
                    return;
                }
                if(view1 != null) {
                    viewGroup0.removeView(view1);
                }
                if(view2 != null) {
                    viewGroup0.removeView(view2);
                }
            }
        }
    }

    public void s(CharSequence charSequence0) {
        this.e = charSequence0;
        TextView textView0 = this.E;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
    }

    public void t(int v) {
        this.h = null;
        this.i = v;
        this.n = false;
    }

    public void u(View view0) {
        this.h = view0;
        this.i = 0;
        this.n = false;
    }

    public void v(View view0, int v, int v1, int v2, int v3) {
        this.h = view0;
        this.i = 0;
        this.n = true;
        this.j = v;
        this.k = v1;
        this.l = v2;
        this.m = v3;
    }

    private void w(ViewGroup viewGroup0) {
        int v;
        Button button0 = (Button)viewGroup0.findViewById(0x1020019);
        this.o = button0;
        button0.setOnClickListener(this.S);
        if(!TextUtils.isEmpty(this.p) || this.r != null) {
            this.o.setText(this.p);
            Drawable drawable0 = this.r;
            if(drawable0 != null) {
                drawable0.setBounds(0, 0, this.d, this.d);
                this.o.setCompoundDrawables(this.r, null, null, null);
            }
            this.o.setVisibility(0);
            v = 1;
        }
        else {
            this.o.setVisibility(8);
            v = 0;
        }
        Button button1 = (Button)viewGroup0.findViewById(0x102001A);
        this.s = button1;
        button1.setOnClickListener(this.S);
        if(!TextUtils.isEmpty(this.t) || this.v != null) {
            this.s.setText(this.t);
            Drawable drawable1 = this.v;
            if(drawable1 != null) {
                drawable1.setBounds(0, 0, this.d, this.d);
                this.s.setCompoundDrawables(this.v, null, null, null);
            }
            this.s.setVisibility(0);
            v |= 2;
        }
        else {
            this.s.setVisibility(8);
        }
        Button button2 = (Button)viewGroup0.findViewById(0x102001B);
        this.w = button2;
        button2.setOnClickListener(this.S);
        if(!TextUtils.isEmpty(this.x) || this.z != null) {
            this.w.setText(this.x);
            Drawable drawable2 = this.z;
            if(drawable2 != null) {
                drawable2.setBounds(0, 0, this.d, this.d);
                this.w.setCompoundDrawables(this.z, null, null, null);
            }
            this.w.setVisibility(0);
            v |= 4;
        }
        else {
            this.w.setVisibility(8);
        }
        if(o.B(this.a)) {
            if(v == 1) {
                this.b(this.o);
            }
            else {
                switch(v) {
                    case 2: {
                        this.b(this.s);
                        break;
                    }
                    case 4: {
                        this.b(this.w);
                    }
                }
            }
        }
        if(v == 0) {
            viewGroup0.setVisibility(8);
        }
    }

    private void x(ViewGroup viewGroup0) {
        NestedScrollView nestedScrollView0 = (NestedScrollView)this.c.findViewById(0x7F0B0DC4);  // id:scrollView
        this.A = nestedScrollView0;
        nestedScrollView0.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView0 = (TextView)viewGroup0.findViewById(0x102000B);
        this.F = textView0;
        if(textView0 == null) {
            return;
        }
        CharSequence charSequence0 = this.f;
        if(charSequence0 != null) {
            textView0.setText(charSequence0);
            return;
        }
        textView0.setVisibility(8);
        this.A.removeView(this.F);
        if(this.g != null) {
            ViewGroup viewGroup1 = (ViewGroup)this.A.getParent();
            int v = viewGroup1.indexOfChild(this.A);
            viewGroup1.removeViewAt(v);
            viewGroup1.addView(this.g, v, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup0.setVisibility(8);
    }

    private void y(ViewGroup viewGroup0) {
        View view0 = this.h;
        boolean z = false;
        if(view0 == null) {
            view0 = this.i == 0 ? null : LayoutInflater.from(this.a).inflate(this.i, viewGroup0, false);
        }
        if(view0 == null) {
            this.c.setFlags(0x20000, 0x20000);
        }
        else {
            z = true;
            if(!o.a(view0)) {
                this.c.setFlags(0x20000, 0x20000);
            }
        }
        if(z) {
            FrameLayout frameLayout0 = (FrameLayout)this.c.findViewById(0x7F0B0322);  // id:custom
            frameLayout0.addView(view0, new ViewGroup.LayoutParams(-1, -1));
            if(this.n) {
                frameLayout0.setPadding(this.j, this.k, this.l, this.m);
            }
            if(this.g != null) {
                ((LayoutParams)viewGroup0.getLayoutParams()).weight = 0.0f;
            }
        }
        else {
            viewGroup0.setVisibility(8);
        }
    }

    private void z(ViewGroup viewGroup0) {
        if(this.G != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -2);
            viewGroup0.addView(this.G, 0, viewGroup$LayoutParams0);
            this.c.findViewById(0x7F0B0F90).setVisibility(8);  // id:title_template
            return;
        }
        this.D = (ImageView)this.c.findViewById(0x1020006);
        if(!TextUtils.isEmpty(this.e) && this.P) {
            TextView textView0 = (TextView)this.c.findViewById(0x7F0B010B);  // id:alertTitle
            this.E = textView0;
            textView0.setText(this.e);
            int v = this.B;
            if(v != 0) {
                this.D.setImageResource(v);
                return;
            }
            Drawable drawable0 = this.C;
            if(drawable0 != null) {
                this.D.setImageDrawable(drawable0);
                return;
            }
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
            return;
        }
        this.c.findViewById(0x7F0B0F90).setVisibility(8);  // id:title_template
        this.D.setVisibility(8);
        viewGroup0.setVisibility(8);
    }
}

