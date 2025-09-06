package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent.DispatcherState;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.string;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.view.ViewCompat;
import androidx.cursoradapter.widget.CursorAdapter;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements CollapsibleActionView {
    @RequiresApi(29)
    static class Api29Impl {
        @DoNotInline
        static void a(AutoCompleteTextView autoCompleteTextView0) {
            autoCompleteTextView0.refreshAutoCompleteResults();
        }

        @DoNotInline
        static void b(SearchAutoComplete searchView$SearchAutoComplete0, int v) {
            searchView$SearchAutoComplete0.setInputMethodMode(v);
        }
    }

    public interface OnCloseListener {
        boolean a();
    }

    public interface OnQueryTextListener {
        boolean a(String arg1);

        boolean b(String arg1);
    }

    public interface OnSuggestionListener {
        boolean a(int arg1);

        boolean b(int arg1);
    }

    static class PreQAutoCompleteTextViewReflector {
        private Method a;
        private Method b;
        private Method c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        PreQAutoCompleteTextViewReflector() {
            Class class0 = AutoCompleteTextView.class;
            super();
            this.a = null;
            this.b = null;
            this.c = null;
            PreQAutoCompleteTextViewReflector.d();
            try {
                Method method0 = class0.getDeclaredMethod("doBeforeTextChanged", null);
                this.a = method0;
                method0.setAccessible(true);
            }
            catch(NoSuchMethodException unused_ex) {
            }
            try {
                Method method1 = class0.getDeclaredMethod("doAfterTextChanged", null);
                this.b = method1;
                method1.setAccessible(true);
            }
            catch(NoSuchMethodException unused_ex) {
            }
            try {
                Method method2 = class0.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c = method2;
                method2.setAccessible(true);
            }
            catch(NoSuchMethodException unused_ex) {
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView0) {
            PreQAutoCompleteTextViewReflector.d();
            Method method0 = this.b;
            if(method0 != null) {
                try {
                    method0.invoke(autoCompleteTextView0, null);
                }
                catch(Exception unused_ex) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView0) {
            PreQAutoCompleteTextViewReflector.d();
            Method method0 = this.a;
            if(method0 != null) {
                try {
                    method0.invoke(autoCompleteTextView0, null);
                }
                catch(Exception unused_ex) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView0) {
            PreQAutoCompleteTextViewReflector.d();
            Method method0 = this.c;
            if(method0 != null) {
                try {
                    method0.invoke(autoCompleteTextView0, Boolean.TRUE);
                }
                catch(Exception unused_ex) {
                }
            }
        }

        private static void d() {
            if(Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        boolean c;

        static {
            SavedState.CREATOR = new Parcelable.ClassLoaderCreator() {
                public SavedState a(Parcel parcel0) {
                    return new SavedState(parcel0, null);
                }

                public SavedState b(Parcel parcel0, ClassLoader classLoader0) {
                    return new SavedState(parcel0, classLoader0);
                }

                public SavedState[] c(int v) {
                    return new SavedState[v];
                }

                @Override  // android.os.Parcelable$Creator
                public Object createFromParcel(Parcel parcel0) {
                    return this.a(parcel0);
                }

                @Override  // android.os.Parcelable$ClassLoaderCreator
                public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
                    return this.b(parcel0, classLoader0);
                }

                @Override  // android.os.Parcelable$Creator
                public Object[] newArray(int v) {
                    return this.c(v);
                }
            };
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.c = ((Boolean)parcel0.readValue(null)).booleanValue();
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override
        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.c + "}";
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeValue(Boolean.valueOf(this.c));
        }
    }

    @RestrictTo({Scope.c})
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        private int e;
        private SearchView f;
        private boolean g;
        final Runnable h;

        public SearchAutoComplete(Context context0) {
            this(context0, null);
        }

        public SearchAutoComplete(Context context0, AttributeSet attributeSet0) {
            this(context0, attributeSet0, attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context0, AttributeSet attributeSet0, int v) {
            super(context0, attributeSet0, v);
            this.h = () -> if(SearchAutoComplete.this.g) {
                ((InputMethodManager)SearchAutoComplete.this.getContext().getSystemService("input_method")).showSoftInput(SearchAutoComplete.this, 0);
                SearchAutoComplete.this.g = false;
            };
            this.e = this.getThreshold();
        }

        void c() {
            if(Build.VERSION.SDK_INT >= 29) {
                Api29Impl.b(this, 1);
                if(this.enoughToFilter()) {
                    this.showDropDown();
                }
            }
            else {
                SearchView.x9.c(this);
            }
        }

        boolean d() {
            return TextUtils.getTrimmedLength(this.getText()) == 0;
        }

        // 检测为 Lambda 实现
        void e() [...]

        @Override  // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.e <= 0 || super.enoughToFilter();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration0 = this.getResources().getConfiguration();
            int v = configuration0.screenWidthDp;
            int v1 = configuration0.screenHeightDp;
            if(v >= 960 && v1 >= 720 && configuration0.orientation == 2) {
                return 0x100;
            }
            return v >= 600 || v >= 640 && v1 >= 480 ? 0xC0 : 0xA0;
        }

        @Override  // androidx.appcompat.widget.AppCompatAutoCompleteTextView
        public InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
            InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
            if(this.g) {
                this.removeCallbacks(this.h);
                this.post(this.h);
            }
            return inputConnection0;
        }

        @Override  // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
            this.setMinWidth(((int)TypedValue.applyDimension(1, ((float)this.getSearchViewTextMinWidthDp()), displayMetrics0)));
        }

        @Override  // android.widget.AutoCompleteTextView
        protected void onFocusChanged(boolean z, int v, Rect rect0) {
            super.onFocusChanged(z, v, rect0);
            this.f.g0();
        }

        @Override  // android.widget.AutoCompleteTextView
        public boolean onKeyPreIme(int v, KeyEvent keyEvent0) {
            if(v == 4) {
                if(keyEvent0.getAction() == 0 && keyEvent0.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyEvent$DispatcherState0 = this.getKeyDispatcherState();
                    if(keyEvent$DispatcherState0 != null) {
                        keyEvent$DispatcherState0.startTracking(keyEvent0, this);
                    }
                    return true;
                }
                if(keyEvent0.getAction() == 1) {
                    KeyEvent.DispatcherState keyEvent$DispatcherState1 = this.getKeyDispatcherState();
                    if(keyEvent$DispatcherState1 != null) {
                        keyEvent$DispatcherState1.handleUpEvent(keyEvent0);
                    }
                    if(keyEvent0.isTracking() && !keyEvent0.isCanceled()) {
                        this.f.clearFocus();
                        this.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(v, keyEvent0);
        }

        @Override  // android.widget.AutoCompleteTextView
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if(z && this.f.hasFocus() && this.getVisibility() == 0) {
                this.g = true;
                if(SearchView.R(this.getContext())) {
                    this.c();
                }
            }
        }

        @Override  // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override  // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence0) {
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager0 = (InputMethodManager)this.getContext().getSystemService("input_method");
            if(!z) {
                this.g = false;
                this.removeCallbacks(this.h);
                inputMethodManager0.hideSoftInputFromWindow(this.getWindowToken(), 0);
                return;
            }
            if(inputMethodManager0.isActive(this)) {
                this.g = false;
                this.removeCallbacks(this.h);
                inputMethodManager0.showSoftInput(this, 0);
                return;
            }
            this.g = true;
        }

        void setSearchView(SearchView searchView0) {
            this.f = searchView0;
        }

        @Override  // android.widget.AutoCompleteTextView
        public void setThreshold(int v) {
            super.setThreshold(v);
            this.e = v;
        }

        class androidx.appcompat.widget.SearchView.SearchAutoComplete.1 implements Runnable {
            final SearchAutoComplete a;

            @Override
            public void run() {
                SearchAutoComplete.this.e();
            }
        }

    }

    static class UpdatableTouchDelegate extends TouchDelegate {
        private final View a;
        private final Rect b;
        private final Rect c;
        private final Rect d;
        private final int e;
        private boolean f;

        public UpdatableTouchDelegate(Rect rect0, Rect rect1, View view0) {
            super(rect0, view0);
            this.e = ViewConfiguration.get(view0.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.d = new Rect();
            this.c = new Rect();
            this.a(rect0, rect1);
            this.a = view0;
        }

        public void a(Rect rect0, Rect rect1) {
            this.b.set(rect0);
            this.d.set(rect0);
            this.d.inset(-this.e, -this.e);
            this.c.set(rect1);
        }

        @Override  // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent0) {
            boolean z2;
            boolean z1;
            int v = (int)motionEvent0.getX();
            int v1 = (int)motionEvent0.getY();
            int v2 = motionEvent0.getAction();
            boolean z = true;
            switch(v2) {
                case 0: {
                    if(this.b.contains(v, v1)) {
                        this.f = true;
                        z2 = true;
                    }
                    else {
                        z2 = true;
                        z = false;
                    }
                    break;
                }
                case 1: 
                case 2: {
                    z1 = this.f;
                    if(!z1 || this.d.contains(v, v1)) {
                        z = z1;
                        z2 = true;
                    }
                    else {
                        z2 = false;
                    }
                    break;
                }
                default: {
                    if(v2 == 3) {
                        z1 = this.f;
                        this.f = false;
                        z = z1;
                        z2 = true;
                    }
                    else {
                        z2 = true;
                        z = false;
                    }
                }
            }
            if(z) {
                if(z2 && !this.c.contains(v, v1)) {
                    motionEvent0.setLocation(((float)(this.a.getWidth() / 2)), ((float)(this.a.getHeight() / 2)));
                    return this.a.dispatchTouchEvent(motionEvent0);
                }
                motionEvent0.setLocation(((float)(v - this.c.left)), ((float)(v1 - this.c.top)));
                return this.a.dispatchTouchEvent(motionEvent0);
            }
            return false;
        }
    }

    final SearchAutoComplete B;
    private final View C;
    private final View D;
    private final View E;
    final ImageView F;
    final ImageView G;
    final ImageView H;
    final ImageView I;
    private final View J;
    private UpdatableTouchDelegate K;
    private Rect L;
    private Rect M;
    private final int M8;
    private int[] N;
    private final int N8;
    private int[] O;
    private final Intent O8;
    private final ImageView P;
    private final Intent P8;
    private final Drawable Q;
    private final CharSequence Q8;
    private OnQueryTextListener R8;
    private OnCloseListener S8;
    View.OnFocusChangeListener T8;
    private OnSuggestionListener U8;
    private View.OnClickListener V8;
    private boolean W8;
    private boolean X8;
    CursorAdapter Y8;
    private boolean Z8;
    private CharSequence a9;
    private boolean b9;
    private boolean c9;
    private int d9;
    private boolean e9;
    private CharSequence f9;
    private CharSequence g9;
    private boolean h9;
    private int i9;
    SearchableInfo j9;
    private Bundle k9;
    private final Runnable l9;
    private Runnable m9;
    private final WeakHashMap n9;
    private final View.OnClickListener o9;
    View.OnKeyListener p9;
    private final TextView.OnEditorActionListener q9;
    private final AdapterView.OnItemClickListener r9;
    private final AdapterView.OnItemSelectedListener s9;
    private TextWatcher t9;
    static final boolean u9 = false;
    static final String v9 = "SearchView";
    private static final String w9 = "nm";
    static final PreQAutoCompleteTextViewReflector x9;

    static {
        SearchView.x9 = Build.VERSION.SDK_INT >= 29 ? null : new PreQAutoCompleteTextViewReflector();
    }

    public SearchView(@NonNull Context context0) {
        this(context0, null);
    }

    public SearchView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.searchViewStyle);
    }

    public SearchView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.L = new Rect();
        this.M = new Rect();
        this.N = new int[2];
        this.O = new int[2];
        this.l9 = () -> {
            int[] arr_v = SearchView.this.B.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
            Drawable drawable0 = SearchView.this.D.getBackground();
            if(drawable0 != null) {
                drawable0.setState(arr_v);
            }
            Drawable drawable1 = SearchView.this.E.getBackground();
            if(drawable1 != null) {
                drawable1.setState(arr_v);
            }
            SearchView.this.invalidate();
        };
        this.m9 = new Runnable() {
            final SearchView a;

            @Override
            public void run() {
                CursorAdapter cursorAdapter0 = SearchView.this.Y8;
                if(cursorAdapter0 instanceof SuggestionsAdapter) {
                    cursorAdapter0.b(null);
                }
            }
        };
        this.n9 = new WeakHashMap();
        androidx.appcompat.widget.SearchView.5 searchView$50 = new View.OnClickListener() {
            final SearchView a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                SearchView searchView0 = SearchView.this;
                if(view0 == searchView0.F) {
                    searchView0.c0();
                    return;
                }
                if(view0 == searchView0.H) {
                    searchView0.Y();
                    return;
                }
                if(view0 == searchView0.G) {
                    searchView0.d0();
                    return;
                }
                if(view0 == searchView0.I) {
                    searchView0.h0();
                    return;
                }
                if(view0 == searchView0.B) {
                    searchView0.L();
                }
            }
        };
        this.o9 = searchView$50;
        this.p9 = new View.OnKeyListener() {
            final SearchView a;

            @Override  // android.view.View$OnKeyListener
            public boolean onKey(View view0, int v, KeyEvent keyEvent0) {
                SearchView searchView0 = SearchView.this;
                if(searchView0.j9 == null) {
                    return false;
                }
                if(searchView0.B.isPopupShowing() && SearchView.this.B.getListSelection() != -1) {
                    return SearchView.this.e0(view0, v, keyEvent0);
                }
                if(!SearchView.this.B.d() && keyEvent0.hasNoModifiers() && keyEvent0.getAction() == 1 && v == 66) {
                    view0.cancelLongPress();
                    String s = SearchView.this.B.getText().toString();
                    SearchView.this.W(0, null, s);
                    return true;
                }
                return false;
            }
        };
        androidx.appcompat.widget.SearchView.7 searchView$70 = new TextView.OnEditorActionListener() {
            final SearchView a;

            @Override  // android.widget.TextView$OnEditorActionListener
            public boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
                SearchView.this.d0();
                return true;
            }
        };
        this.q9 = searchView$70;
        androidx.appcompat.widget.SearchView.8 searchView$80 = (/* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, int v, /* 缺少LAMBDA参数 */) -> {
            if(SearchView.this.U8 != null && SearchView.this.U8.b(v)) {
                return false;
            }
            SearchView.this.X(v, 0, null);
            SearchView.this.B.setImeVisibility(false);
            SearchView.this.K();
            return true;
        };
        this.r9 = searchView$80;
        androidx.appcompat.widget.SearchView.9 searchView$90 = new AdapterView.OnItemSelectedListener() {
            final SearchView a;

            @Override  // android.widget.AdapterView$OnItemSelectedListener
            public void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
                SearchView.this.a0(v);
            }

            @Override  // android.widget.AdapterView$OnItemSelectedListener
            public void onNothingSelected(AdapterView adapterView0) {
            }
        };
        this.s9 = searchView$90;
        this.t9 = new TextWatcher() {
            final SearchView a;

            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
                SearchView.this.f0(charSequence0);
            }
        };
        TintTypedArray tintTypedArray0 = TintTypedArray.G(context0, attributeSet0, styleable.SearchView, v, 0);
        ViewCompat.H1(this, context0, styleable.SearchView, attributeSet0, tintTypedArray0.B(), v, 0);
        LayoutInflater.from(context0).inflate(tintTypedArray0.u(styleable.SearchView_layout, layout.abc_search_view), this, true);
        SearchAutoComplete searchView$SearchAutoComplete0 = (SearchAutoComplete)this.findViewById(id.search_src_text);
        this.B = searchView$SearchAutoComplete0;
        searchView$SearchAutoComplete0.setSearchView(this);
        this.C = this.findViewById(id.search_edit_frame);
        View view0 = this.findViewById(id.search_plate);
        this.D = view0;
        View view1 = this.findViewById(id.submit_area);
        this.E = view1;
        ImageView imageView0 = (ImageView)this.findViewById(id.search_button);
        this.F = imageView0;
        ImageView imageView1 = (ImageView)this.findViewById(id.search_go_btn);
        this.G = imageView1;
        ImageView imageView2 = (ImageView)this.findViewById(id.search_close_btn);
        this.H = imageView2;
        ImageView imageView3 = (ImageView)this.findViewById(id.search_voice_btn);
        this.I = imageView3;
        ImageView imageView4 = (ImageView)this.findViewById(id.search_mag_icon);
        this.P = imageView4;
        ViewCompat.R1(view0, tintTypedArray0.h(styleable.SearchView_queryBackground));
        ViewCompat.R1(view1, tintTypedArray0.h(styleable.SearchView_submitBackground));
        imageView0.setImageDrawable(tintTypedArray0.h(styleable.SearchView_searchIcon));
        imageView1.setImageDrawable(tintTypedArray0.h(styleable.SearchView_goIcon));
        imageView2.setImageDrawable(tintTypedArray0.h(styleable.SearchView_closeIcon));
        imageView3.setImageDrawable(tintTypedArray0.h(styleable.SearchView_voiceIcon));
        imageView4.setImageDrawable(tintTypedArray0.h(styleable.SearchView_searchIcon));
        this.Q = tintTypedArray0.h(styleable.SearchView_searchHintIcon);
        TooltipCompat.a(imageView0, this.getResources().getString(string.abc_searchview_description_search));
        this.M8 = tintTypedArray0.u(styleable.SearchView_suggestionRowLayout, layout.abc_search_dropdown_item_icons_2line);
        this.N8 = tintTypedArray0.u(styleable.SearchView_commitIcon, 0);
        imageView0.setOnClickListener(searchView$50);
        imageView2.setOnClickListener(searchView$50);
        imageView1.setOnClickListener(searchView$50);
        imageView3.setOnClickListener(searchView$50);
        searchView$SearchAutoComplete0.setOnClickListener(searchView$50);
        searchView$SearchAutoComplete0.addTextChangedListener(this.t9);
        searchView$SearchAutoComplete0.setOnEditorActionListener(searchView$70);
        searchView$SearchAutoComplete0.setOnItemClickListener(searchView$80);
        searchView$SearchAutoComplete0.setOnItemSelectedListener(searchView$90);
        searchView$SearchAutoComplete0.setOnKeyListener(this.p9);
        searchView$SearchAutoComplete0.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            final SearchView a;

            @Override  // android.view.View$OnFocusChangeListener
            public void onFocusChange(View view0, boolean z) {
                SearchView searchView0 = SearchView.this;
                View.OnFocusChangeListener view$OnFocusChangeListener0 = searchView0.T8;
                if(view$OnFocusChangeListener0 != null) {
                    view$OnFocusChangeListener0.onFocusChange(searchView0, z);
                }
            }
        });
        this.setIconifiedByDefault(tintTypedArray0.a(styleable.SearchView_iconifiedByDefault, true));
        int v1 = tintTypedArray0.g(styleable.SearchView_android_maxWidth, -1);
        if(v1 != -1) {
            this.setMaxWidth(v1);
        }
        this.Q8 = tintTypedArray0.x(styleable.SearchView_defaultQueryHint);
        this.a9 = tintTypedArray0.x(styleable.SearchView_queryHint);
        int v2 = tintTypedArray0.o(styleable.SearchView_android_imeOptions, -1);
        if(v2 != -1) {
            this.setImeOptions(v2);
        }
        int v3 = tintTypedArray0.o(styleable.SearchView_android_inputType, -1);
        if(v3 != -1) {
            this.setInputType(v3);
        }
        this.setFocusable(tintTypedArray0.a(styleable.SearchView_android_focusable, true));
        tintTypedArray0.I();
        Intent intent0 = new Intent("android.speech.action.WEB_SEARCH");
        this.O8 = intent0;
        intent0.addFlags(0x10000000);
        intent0.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent1 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.P8 = intent1;
        intent1.addFlags(0x10000000);
        View view2 = this.findViewById(searchView$SearchAutoComplete0.getDropDownAnchor());
        this.J = view2;
        if(view2 != null) {
            view2.addOnLayoutChangeListener((/* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */) -> if(SearchView.this.J.getWidth() > 1) {
                Resources resources0 = SearchView.this.getContext().getResources();
                int v = SearchView.this.D.getPaddingLeft();
                Rect rect0 = new Rect();
                boolean z = ViewUtils.b(SearchView.this);
                int v1 = SearchView.this.W8 ? resources0.getDimensionPixelSize(dimen.abc_dropdownitem_icon_width) + resources0.getDimensionPixelSize(dimen.abc_dropdownitem_text_padding_left) : 0;
                SearchView.this.B.getDropDownBackground().getPadding(rect0);
                SearchView.this.B.setDropDownHorizontalOffset((z ? -rect0.left : v - (rect0.left + v1)));
                int v2 = SearchView.this.J.getWidth();
                SearchView.this.B.setDropDownWidth(v2 + rect0.left + rect0.right + v1 - v);
            });
        }
        this.r0(this.W8);
        this.n0();

        class androidx.appcompat.widget.SearchView.4 implements View.OnLayoutChangeListener {
            final SearchView a;

            @Override  // android.view.View$OnLayoutChangeListener
            public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                SearchView.this.F();
            }
        }

    }

    // 检测为 Lambda 实现
    void F() [...]

    private Intent G(String s, Uri uri0, String s1, String s2, int v, String s3) {
        Intent intent0 = new Intent(s);
        intent0.addFlags(0x10000000);
        if(uri0 != null) {
            intent0.setData(uri0);
        }
        intent0.putExtra("user_query", this.g9);
        if(s2 != null) {
            intent0.putExtra("query", s2);
        }
        if(s1 != null) {
            intent0.putExtra("intent_extra_data_key", s1);
        }
        Bundle bundle0 = this.k9;
        if(bundle0 != null) {
            intent0.putExtra("app_data", bundle0);
        }
        if(v != 0) {
            intent0.putExtra("action_key", v);
            intent0.putExtra("action_msg", s3);
        }
        intent0.setComponent(this.j9.getSearchActivity());
        return intent0;
    }

    private Intent H(Cursor cursor0, int v, String s) {
        int v1;
        try {
            String s1 = SuggestionsAdapter.u(cursor0, "suggest_intent_action");
            if(s1 == null) {
                s1 = this.j9.getSuggestIntentAction();
            }
            if(s1 == null) {
                s1 = "android.intent.action.SEARCH";
            }
            String s2 = SuggestionsAdapter.u(cursor0, "suggest_intent_data");
            if(s2 == null) {
                s2 = this.j9.getSuggestIntentData();
            }
            if(s2 != null) {
                String s3 = SuggestionsAdapter.u(cursor0, "suggest_intent_data_id");
                if(s3 != null) {
                    s2 = s2 + "/" + Uri.encode(s3);
                }
            }
            Uri uri0 = s2 == null ? null : Uri.parse(s2);
            String s4 = SuggestionsAdapter.u(cursor0, "suggest_intent_query");
            return this.G(s1, uri0, SuggestionsAdapter.u(cursor0, "suggest_intent_extra_data"), s4, v, s);
        }
        catch(RuntimeException runtimeException0) {
        }
        try {
            v1 = -1;
            v1 = cursor0.getPosition();
        }
        catch(RuntimeException unused_ex) {
        }
        Log.w("SearchView", "Search suggestions cursor at row " + v1 + " returned exception.", runtimeException0);
        return null;
    }

    private Intent I(Intent intent0, SearchableInfo searchableInfo0) {
        ComponentName componentName0 = searchableInfo0.getSearchActivity();
        Intent intent1 = new Intent("android.intent.action.SEARCH");
        intent1.setComponent(componentName0);
        PendingIntent pendingIntent0 = PendingIntent.getActivity(this.getContext(), 0, intent1, 0x42000000);
        Bundle bundle0 = new Bundle();
        Bundle bundle1 = this.k9;
        if(bundle1 != null) {
            bundle0.putParcelable("app_data", bundle1);
        }
        Intent intent2 = new Intent(intent0);
        Resources resources0 = this.getResources();
        String s = searchableInfo0.getVoiceLanguageModeId() == 0 ? "free_form" : resources0.getString(searchableInfo0.getVoiceLanguageModeId());
        String s1 = null;
        String s2 = searchableInfo0.getVoicePromptTextId() == 0 ? null : resources0.getString(searchableInfo0.getVoicePromptTextId());
        String s3 = searchableInfo0.getVoiceLanguageId() == 0 ? null : resources0.getString(searchableInfo0.getVoiceLanguageId());
        int v = searchableInfo0.getVoiceMaxResults() == 0 ? 1 : searchableInfo0.getVoiceMaxResults();
        intent2.putExtra("android.speech.extra.LANGUAGE_MODEL", s);
        intent2.putExtra("android.speech.extra.PROMPT", s2);
        intent2.putExtra("android.speech.extra.LANGUAGE", s3);
        intent2.putExtra("android.speech.extra.MAX_RESULTS", v);
        if(componentName0 != null) {
            s1 = componentName0.flattenToShortString();
        }
        intent2.putExtra("calling_package", s1);
        intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", pendingIntent0);
        intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle0);
        return intent2;
    }

    private Intent J(Intent intent0, SearchableInfo searchableInfo0) {
        Intent intent1 = new Intent(intent0);
        ComponentName componentName0 = searchableInfo0.getSearchActivity();
        intent1.putExtra("calling_package", (componentName0 == null ? null : componentName0.flattenToShortString()));
        return intent1;
    }

    private void K() {
        this.B.dismissDropDown();
    }

    void L() {
        if(Build.VERSION.SDK_INT >= 29) {
            Api29Impl.a(this.B);
            return;
        }
        SearchView.x9.b(this.B);
        SearchView.x9.a(this.B);
    }

    private void M(View view0, Rect rect0) {
        view0.getLocationInWindow(this.N);
        this.getLocationInWindow(this.O);
        int[] arr_v = this.N;
        int[] arr_v1 = this.O;
        int v = arr_v[1] - arr_v1[1];
        int v1 = arr_v[0] - arr_v1[0];
        rect0.set(v1, v, view0.getWidth() + v1, view0.getHeight() + v);
    }

    private CharSequence N(CharSequence charSequence0) {
        if(this.W8 && this.Q != null) {
            int v = (int)(((double)this.B.getTextSize()) * 1.25);
            this.Q.setBounds(0, 0, v, v);
            CharSequence charSequence1 = new SpannableStringBuilder("   ");
            ((SpannableStringBuilder)charSequence1).setSpan(new ImageSpan(this.Q), 1, 2, 33);
            ((SpannableStringBuilder)charSequence1).append(charSequence0);
            return charSequence1;
        }
        return charSequence0;
    }

    private boolean O() {
        if(this.j9 != null && this.j9.getVoiceSearchEnabled()) {
            if(this.j9.getVoiceSearchLaunchWebSearch()) {
                return this.O8 != null && this.getContext().getPackageManager().resolveActivity(this.O8, 0x10000) != null;
            }
            Intent intent0 = this.j9.getVoiceSearchLaunchRecognizer() ? this.P8 : null;
            return intent0 != null && this.getContext().getPackageManager().resolveActivity(intent0, 0x10000) != null;
        }
        return false;
    }

    public boolean P() {
        return this.W8;
    }

    public boolean Q() {
        return this.X8;
    }

    static boolean R(Context context0) {
        return context0.getResources().getConfiguration().orientation == 2;
    }

    public boolean S() {
        return this.b9;
    }

    // 去混淆评级： 低(30)
    private boolean T() {
        return (this.Z8 || this.e9) && !this.Q();
    }

    public boolean U() {
        return this.Z8;
    }

    private void V(Intent intent0) {
        if(intent0 == null) {
            return;
        }
        try {
            this.getContext().startActivity(intent0);
        }
        catch(RuntimeException runtimeException0) {
            Log.e("SearchView", "Failed launch activity: " + intent0, runtimeException0);
        }
    }

    void W(int v, String s, String s1) {
        Intent intent0 = this.G("android.intent.action.SEARCH", null, null, s1, v, s);
        this.getContext().startActivity(intent0);
    }

    private boolean X(int v, int v1, String s) {
        Cursor cursor0 = this.Y8.c();
        if(cursor0 != null && cursor0.moveToPosition(v)) {
            this.V(this.H(cursor0, v1, s));
            return true;
        }
        return false;
    }

    void Y() {
        if(!TextUtils.isEmpty(this.B.getText())) {
            this.B.setText("");
            this.B.requestFocus();
            this.B.setImeVisibility(true);
        }
        else if(this.W8 && (this.S8 == null || !this.S8.a())) {
            this.clearFocus();
            this.r0(true);
        }
    }

    // 检测为 Lambda 实现
    boolean Z(int v, int v1, String s) [...]

    boolean a0(int v) {
        if(this.U8 != null && this.U8.a(v)) {
            return false;
        }
        this.j0(v);
        return true;
    }

    @Override  // androidx.appcompat.view.CollapsibleActionView
    public void b() {
        this.k0("", false);
        this.clearFocus();
        this.r0(true);
        this.B.setImeOptions(this.i9);
        this.h9 = false;
    }

    protected void b0(@Nullable CharSequence charSequence0) {
        this.setQuery(charSequence0);
    }

    @Override  // androidx.appcompat.view.CollapsibleActionView
    public void c() {
        if(this.h9) {
            return;
        }
        this.h9 = true;
        int v = this.B.getImeOptions();
        this.i9 = v;
        this.B.setImeOptions(v | 0x2000000);
        this.B.setText("");
        this.setIconified(false);
    }

    void c0() {
        this.r0(false);
        this.B.requestFocus();
        this.B.setImeVisibility(true);
        View.OnClickListener view$OnClickListener0 = this.V8;
        if(view$OnClickListener0 != null) {
            view$OnClickListener0.onClick(this);
        }
    }

    @Override  // android.view.ViewGroup
    public void clearFocus() {
        this.c9 = true;
        super.clearFocus();
        this.B.clearFocus();
        this.B.setImeVisibility(false);
        this.c9 = false;
    }

    void d0() {
        Editable editable0 = this.B.getText();
        if(editable0 != null && TextUtils.getTrimmedLength(editable0) > 0 && (this.R8 == null || !this.R8.b(editable0.toString()))) {
            if(this.j9 != null) {
                this.W(0, null, editable0.toString());
            }
            this.B.setImeVisibility(false);
            this.K();
        }
    }

    boolean e0(View view0, int v, KeyEvent keyEvent0) {
        if(this.j9 == null) {
            return false;
        }
        if(this.Y8 == null) {
            return false;
        }
        if(keyEvent0.getAction() == 0 && keyEvent0.hasNoModifiers()) {
            switch(v) {
                case 19: {
                    this.B.getListSelection();
                    return false;
                }
                case 21: 
                case 22: {
                    int v1 = v == 21 ? 0 : this.B.length();
                    this.B.setSelection(v1);
                    this.B.setListSelection(0);
                    this.B.clearListSelection();
                    this.B.c();
                    return true;
                }
                case 61: 
                case 66: 
                case 84: {
                    return this.Z(this.B.getListSelection(), 0, null);
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    void f0(CharSequence charSequence0) {
        Editable editable0 = this.B.getText();
        this.g9 = editable0;
        boolean z = TextUtils.isEmpty(editable0);
        this.q0(!z);
        this.s0(z);
        this.l0();
        this.p0();
        if(this.R8 != null && !TextUtils.equals(charSequence0, this.f9)) {
            this.R8.a(charSequence0.toString());
        }
        this.f9 = charSequence0.toString();
    }

    void g0() {
        this.r0(this.Q());
        this.i0();
        if(this.B.hasFocus()) {
            this.L();
        }
    }

    public int getImeOptions() {
        return this.B.getImeOptions();
    }

    public int getInputType() {
        return this.B.getInputType();
    }

    public int getMaxWidth() {
        return this.d9;
    }

    private int getPreferredHeight() {
        return this.getContext().getResources().getDimensionPixelSize(dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return this.getContext().getResources().getDimensionPixelSize(dimen.abc_search_view_preferred_width);
    }

    public CharSequence getQuery() {
        return this.B.getText();
    }

    @Nullable
    public CharSequence getQueryHint() {
        CharSequence charSequence0 = this.a9;
        if(charSequence0 == null) {
            return this.j9 == null || this.j9.getHintId() == 0 ? this.Q8 : this.getContext().getText(this.j9.getHintId());
        }
        return charSequence0;
    }

    int getSuggestionCommitIconResId() {
        return this.N8;
    }

    int getSuggestionRowLayout() {
        return this.M8;
    }

    public CursorAdapter getSuggestionsAdapter() {
        return this.Y8;
    }

    void h0() {
        try {
            SearchableInfo searchableInfo0 = this.j9;
            if(searchableInfo0 == null) {
                return;
            }
            if(searchableInfo0.getVoiceSearchLaunchWebSearch()) {
                Intent intent0 = this.J(this.O8, searchableInfo0);
                this.getContext().startActivity(intent0);
                return;
            }
            if(searchableInfo0.getVoiceSearchLaunchRecognizer()) {
                Intent intent1 = this.I(this.P8, searchableInfo0);
                this.getContext().startActivity(intent1);
            }
        }
        catch(ActivityNotFoundException unused_ex) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    private void i0() {
        this.post(this.l9);
    }

    private void j0(int v) {
        Editable editable0 = this.B.getText();
        Cursor cursor0 = this.Y8.c();
        if(cursor0 == null) {
            return;
        }
        if(cursor0.moveToPosition(v)) {
            CharSequence charSequence0 = this.Y8.a(cursor0);
            if(charSequence0 != null) {
                this.setQuery(charSequence0);
                return;
            }
            this.setQuery(editable0);
            return;
        }
        this.setQuery(editable0);
    }

    public void k0(CharSequence charSequence0, boolean z) {
        this.B.setText(charSequence0);
        if(charSequence0 != null) {
            int v = this.B.length();
            this.B.setSelection(v);
            this.g9 = charSequence0;
        }
        if(z && !TextUtils.isEmpty(charSequence0)) {
            this.d0();
        }
    }

    private void l0() {
        boolean z = TextUtils.isEmpty(this.B.getText());
        int v = 0;
        ImageView imageView0 = this.H;
        if(z && (!this.W8 || this.h9)) {
            v = 8;
        }
        imageView0.setVisibility(v);
        Drawable drawable0 = this.H.getDrawable();
        if(drawable0 != null) {
            drawable0.setState((z ? ViewGroup.EMPTY_STATE_SET : ViewGroup.ENABLED_STATE_SET));
        }
    }

    // 检测为 Lambda 实现
    void m0() [...]

    private void n0() {
        CharSequence charSequence0 = this.getQueryHint();
        SearchAutoComplete searchView$SearchAutoComplete0 = this.B;
        if(charSequence0 == null) {
            charSequence0 = "";
        }
        searchView$SearchAutoComplete0.setHint(this.N(charSequence0));
    }

    private void o0() {
        int v = this.j9.getSuggestThreshold();
        this.B.setThreshold(v);
        int v1 = this.j9.getImeOptions();
        this.B.setImeOptions(v1);
        int v2 = this.j9.getInputType();
        int v3 = 1;
        if((v2 & 15) == 1) {
            v2 &= 0xFFFEFFFF;
            if(this.j9.getSuggestAuthority() != null) {
                v2 |= 0x90000;
            }
        }
        this.B.setInputType(v2);
        CursorAdapter cursorAdapter0 = this.Y8;
        if(cursorAdapter0 != null) {
            cursorAdapter0.b(null);
        }
        if(this.j9.getSuggestAuthority() != null) {
            SuggestionsAdapter suggestionsAdapter0 = new SuggestionsAdapter(this.getContext(), this, this.j9, this.n9);
            this.Y8 = suggestionsAdapter0;
            this.B.setAdapter(suggestionsAdapter0);
            SuggestionsAdapter suggestionsAdapter1 = (SuggestionsAdapter)this.Y8;
            if(this.b9) {
                v3 = 2;
            }
            suggestionsAdapter1.E(v3);
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.l9);
        this.post(this.m9);
        super.onDetachedFromWindow();
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(z) {
            this.M(this.B, this.L);
            this.M.set(this.L.left, 0, this.L.right, v3 - v1);
            UpdatableTouchDelegate searchView$UpdatableTouchDelegate0 = this.K;
            if(searchView$UpdatableTouchDelegate0 == null) {
                UpdatableTouchDelegate searchView$UpdatableTouchDelegate1 = new UpdatableTouchDelegate(this.M, this.L, this.B);
                this.K = searchView$UpdatableTouchDelegate1;
                this.setTouchDelegate(searchView$UpdatableTouchDelegate1);
                return;
            }
            searchView$UpdatableTouchDelegate0.a(this.M, this.L);
        }
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    protected void onMeasure(int v, int v1) {
        if(this.Q()) {
            super.onMeasure(v, v1);
            return;
        }
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getSize(v);
        switch(v2) {
            case 0x80000000: {
                int v4 = this.d9;
                v3 = v4 <= 0 ? Math.min(this.getPreferredWidth(), v3) : Math.min(v4, v3);
                break;
            }
            case 0: {
                v3 = this.d9;
                if(v3 <= 0) {
                    v3 = this.getPreferredWidth();
                }
                break;
            }
            case 0x40000000: {
                int v5 = this.d9;
                if(v5 > 0) {
                    v3 = Math.min(v5, v3);
                }
            }
        }
        int v6 = View.MeasureSpec.getMode(v1);
        int v7 = View.MeasureSpec.getSize(v1);
        switch(v6) {
            case 0x80000000: {
                v7 = Math.min(this.getPreferredHeight(), v7);
                break;
            }
            case 0: {
                v7 = this.getPreferredHeight();
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(v3, 0x40000000), View.MeasureSpec.makeMeasureSpec(v7, 0x40000000));
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        this.r0(((SavedState)parcelable0).c);
        this.requestLayout();
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        parcelable0.c = this.Q();
        return parcelable0;
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.i0();
    }

    private void p0() {
        int v = !this.T() || this.G.getVisibility() != 0 && this.I.getVisibility() != 0 ? 8 : 0;
        this.E.setVisibility(v);
    }

    private void q0(boolean z) {
        int v = !this.Z8 || !this.T() || !this.hasFocus() || !z && this.e9 ? 8 : 0;
        this.G.setVisibility(v);
    }

    private void r0(boolean z) {
        this.X8 = z;
        int v = 8;
        boolean z1 = TextUtils.isEmpty(this.B.getText());
        this.F.setVisibility((z ? 0 : 8));
        this.q0(!z1);
        this.C.setVisibility((z ? 8 : 0));
        if(this.P.getDrawable() != null && !this.W8) {
            v = 0;
        }
        this.P.setVisibility(v);
        this.l0();
        this.s0(z1);
        this.p0();
    }

    @Override  // android.view.ViewGroup
    public boolean requestFocus(int v, Rect rect0) {
        if(this.c9) {
            return false;
        }
        if(!this.isFocusable()) {
            return false;
        }
        if(!this.Q()) {
            boolean z = this.B.requestFocus(v, rect0);
            if(z) {
                this.r0(false);
            }
            return z;
        }
        return super.requestFocus(v, rect0);
    }

    private void s0(boolean z) {
        int v = 8;
        if(this.e9 && !this.Q() && z) {
            this.G.setVisibility(8);
            v = 0;
        }
        this.I.setVisibility(v);
    }

    @RestrictTo({Scope.c})
    public void setAppSearchData(Bundle bundle0) {
        this.k9 = bundle0;
    }

    public void setIconified(boolean z) {
        if(z) {
            this.Y();
            return;
        }
        this.c0();
    }

    public void setIconifiedByDefault(boolean z) {
        if(this.W8 == z) {
            return;
        }
        this.W8 = z;
        this.r0(z);
        this.n0();
    }

    public void setImeOptions(int v) {
        this.B.setImeOptions(v);
    }

    public void setInputType(int v) {
        this.B.setInputType(v);
    }

    public void setMaxWidth(int v) {
        this.d9 = v;
        this.requestLayout();
    }

    public void setOnCloseListener(OnCloseListener searchView$OnCloseListener0) {
        this.S8 = searchView$OnCloseListener0;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener view$OnFocusChangeListener0) {
        this.T8 = view$OnFocusChangeListener0;
    }

    public void setOnQueryTextListener(OnQueryTextListener searchView$OnQueryTextListener0) {
        this.R8 = searchView$OnQueryTextListener0;
    }

    public void setOnSearchClickListener(View.OnClickListener view$OnClickListener0) {
        this.V8 = view$OnClickListener0;
    }

    public void setOnSuggestionListener(OnSuggestionListener searchView$OnSuggestionListener0) {
        this.U8 = searchView$OnSuggestionListener0;
    }

    private void setQuery(CharSequence charSequence0) {
        this.B.setText(charSequence0);
        int v = TextUtils.isEmpty(charSequence0) ? 0 : charSequence0.length();
        this.B.setSelection(v);
    }

    public void setQueryHint(@Nullable CharSequence charSequence0) {
        this.a9 = charSequence0;
        this.n0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.b9 = z;
        CursorAdapter cursorAdapter0 = this.Y8;
        if(cursorAdapter0 instanceof SuggestionsAdapter) {
            ((SuggestionsAdapter)cursorAdapter0).E((z ? 2 : 1));
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo0) {
        this.j9 = searchableInfo0;
        if(searchableInfo0 != null) {
            this.o0();
            this.n0();
        }
        boolean z = this.O();
        this.e9 = z;
        if(z) {
            this.B.setPrivateImeOptions("nm");
        }
        this.r0(this.Q());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.Z8 = z;
        this.r0(this.Q());
    }

    public void setSuggestionsAdapter(CursorAdapter cursorAdapter0) {
        this.Y8 = cursorAdapter0;
        this.B.setAdapter(cursorAdapter0);
    }

    class androidx.appcompat.widget.SearchView.1 implements Runnable {
        final SearchView a;

        @Override
        public void run() {
            SearchView.this.m0();
        }
    }


    class androidx.appcompat.widget.SearchView.8 implements AdapterView.OnItemClickListener {
        final SearchView a;

        @Override  // android.widget.AdapterView$OnItemClickListener
        public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
            SearchView.this.Z(v, 0, null);
        }
    }

}

