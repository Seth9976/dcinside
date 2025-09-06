package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabContentFactory;
import android.widget.TabHost.TabSpec;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    static class DummyTabFactory implements TabHost.TabContentFactory {
        private final Context a;

        public DummyTabFactory(Context context0) {
            this.a = context0;
        }

        @Override  // android.widget.TabHost$TabContentFactory
        public View createTabContent(String s) {
            View view0 = new View(this.a);
            view0.setMinimumWidth(0);
            view0.setMinimumHeight(0);
            return view0;
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR;
        String a;

        static {
            SavedState.CREATOR = new Parcelable.Creator() {
                public SavedState a(Parcel parcel0) {
                    return new SavedState(parcel0);
                }

                public SavedState[] b(int v) {
                    return new SavedState[v];
                }

                @Override  // android.os.Parcelable$Creator
                public Object createFromParcel(Parcel parcel0) {
                    return this.a(parcel0);
                }

                @Override  // android.os.Parcelable$Creator
                public Object[] newArray(int v) {
                    return this.b(v);
                }
            };
        }

        SavedState(Parcel parcel0) {
            super(parcel0);
            this.a = parcel0.readString();
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override
        @NonNull
        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.a + "}";
        }

        @Override  // android.view.View$BaseSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeString(this.a);
        }
    }

    static final class TabInfo {
        @NonNull
        final String a;
        @NonNull
        final Class b;
        @Nullable
        final Bundle c;
        Fragment d;

        TabInfo(@NonNull String s, @NonNull Class class0, @Nullable Bundle bundle0) {
            this.a = s;
            this.b = class0;
            this.c = bundle0;
        }
    }

    private final ArrayList a;
    private FrameLayout b;
    private Context c;
    private FragmentManager d;
    private int e;
    private TabHost.OnTabChangeListener f;
    private TabInfo g;
    private boolean h;

    @Deprecated
    public FragmentTabHost(@NonNull Context context0) {
        super(context0, null);
        this.a = new ArrayList();
        this.f(context0, null);
    }

    @Deprecated
    public FragmentTabHost(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new ArrayList();
        this.f(context0, attributeSet0);
    }

    @Deprecated
    public void a(@NonNull TabHost.TabSpec tabHost$TabSpec0, @NonNull Class class0, @Nullable Bundle bundle0) {
        tabHost$TabSpec0.setContent(new DummyTabFactory(this.c));
        String s = tabHost$TabSpec0.getTag();
        TabInfo fragmentTabHost$TabInfo0 = new TabInfo(s, class0, bundle0);
        if(this.h) {
            Fragment fragment0 = this.d.s0(s);
            fragmentTabHost$TabInfo0.d = fragment0;
            if(fragment0 != null && !fragment0.isDetached()) {
                FragmentTransaction fragmentTransaction0 = this.d.u();
                fragmentTransaction0.v(fragmentTabHost$TabInfo0.d);
                fragmentTransaction0.q();
            }
        }
        this.a.add(fragmentTabHost$TabInfo0);
        this.addTab(tabHost$TabSpec0);
    }

    @Nullable
    private FragmentTransaction b(@Nullable String s, @Nullable FragmentTransaction fragmentTransaction0) {
        TabInfo fragmentTabHost$TabInfo0 = this.e(s);
        if(this.g != fragmentTabHost$TabInfo0) {
            if(fragmentTransaction0 == null) {
                fragmentTransaction0 = this.d.u();
            }
            TabInfo fragmentTabHost$TabInfo1 = this.g;
            if(fragmentTabHost$TabInfo1 != null) {
                Fragment fragment0 = fragmentTabHost$TabInfo1.d;
                if(fragment0 != null) {
                    fragmentTransaction0.v(fragment0);
                }
            }
            if(fragmentTabHost$TabInfo0 != null) {
                Fragment fragment1 = fragmentTabHost$TabInfo0.d;
                if(fragment1 == null) {
                    Fragment fragment2 = this.d.G0().a(this.c.getClassLoader(), fragmentTabHost$TabInfo0.b.getName());
                    fragmentTabHost$TabInfo0.d = fragment2;
                    fragment2.setArguments(fragmentTabHost$TabInfo0.c);
                    fragmentTransaction0.g(this.e, fragmentTabHost$TabInfo0.d, fragmentTabHost$TabInfo0.a);
                }
                else {
                    fragmentTransaction0.p(fragment1);
                }
            }
            this.g = fragmentTabHost$TabInfo0;
        }
        return fragmentTransaction0;
    }

    private void c() {
        if(this.b == null) {
            FrameLayout frameLayout0 = (FrameLayout)this.findViewById(this.e);
            this.b = frameLayout0;
            if(frameLayout0 == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.e);
            }
        }
    }

    private void d(Context context0) {
        if(this.findViewById(0x1020013) == null) {
            LinearLayout linearLayout0 = new LinearLayout(context0);
            linearLayout0.setOrientation(1);
            this.addView(linearLayout0, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget0 = new TabWidget(context0);
            tabWidget0.setId(0x1020013);
            tabWidget0.setOrientation(0);
            linearLayout0.addView(tabWidget0, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout0 = new FrameLayout(context0);
            frameLayout0.setId(0x1020011);
            linearLayout0.addView(frameLayout0, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout1 = new FrameLayout(context0);
            this.b = frameLayout1;
            frameLayout1.setId(this.e);
            linearLayout0.addView(frameLayout1, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @Nullable
    private TabInfo e(String s) {
        int v = this.a.size();
        for(int v1 = 0; v1 < v; ++v1) {
            TabInfo fragmentTabHost$TabInfo0 = (TabInfo)this.a.get(v1);
            if(fragmentTabHost$TabInfo0.a.equals(s)) {
                return fragmentTabHost$TabInfo0;
            }
        }
        return null;
    }

    private void f(Context context0, AttributeSet attributeSet0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, new int[]{0x10100F3}, 0, 0);
        this.e = typedArray0.getResourceId(0, 0);
        typedArray0.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void g(@NonNull Context context0, @NonNull FragmentManager fragmentManager0) {
        this.d(context0);
        super.setup();
        this.c = context0;
        this.d = fragmentManager0;
        this.c();
    }

    @Deprecated
    public void h(@NonNull Context context0, @NonNull FragmentManager fragmentManager0, int v) {
        this.d(context0);
        super.setup();
        this.c = context0;
        this.d = fragmentManager0;
        this.e = v;
        this.c();
        this.b.setId(v);
        if(this.getId() == -1) {
            this.setId(0x1020012);
        }
    }

    @Override  // android.view.ViewGroup
    @Deprecated
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String s = this.getCurrentTabTag();
        int v = this.a.size();
        FragmentTransaction fragmentTransaction0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            TabInfo fragmentTabHost$TabInfo0 = (TabInfo)this.a.get(v1);
            Fragment fragment0 = this.d.s0(fragmentTabHost$TabInfo0.a);
            fragmentTabHost$TabInfo0.d = fragment0;
            if(fragment0 != null && !fragment0.isDetached()) {
                if(fragmentTabHost$TabInfo0.a.equals(s)) {
                    this.g = fragmentTabHost$TabInfo0;
                }
                else {
                    if(fragmentTransaction0 == null) {
                        fragmentTransaction0 = this.d.u();
                    }
                    fragmentTransaction0.v(fragmentTabHost$TabInfo0.d);
                }
            }
        }
        this.h = true;
        FragmentTransaction fragmentTransaction1 = this.b(s, fragmentTransaction0);
        if(fragmentTransaction1 != null) {
            fragmentTransaction1.q();
            this.d.n0();
        }
    }

    @Override  // android.view.ViewGroup
    @Deprecated
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h = false;
    }

    @Override  // android.view.View
    @Deprecated
    protected void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).getSuperState());
        this.setCurrentTabByTag(((SavedState)parcelable0).a);
    }

    @Override  // android.view.View
    @NonNull
    @Deprecated
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        parcelable0.a = this.getCurrentTabTag();
        return parcelable0;
    }

    @Override  // android.widget.TabHost$OnTabChangeListener
    @Deprecated
    public void onTabChanged(@Nullable String s) {
        if(this.h) {
            FragmentTransaction fragmentTransaction0 = this.b(s, null);
            if(fragmentTransaction0 != null) {
                fragmentTransaction0.q();
            }
        }
        TabHost.OnTabChangeListener tabHost$OnTabChangeListener0 = this.f;
        if(tabHost$OnTabChangeListener0 != null) {
            tabHost$OnTabChangeListener0.onTabChanged(s);
        }
    }

    @Override  // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@Nullable TabHost.OnTabChangeListener tabHost$OnTabChangeListener0) {
        this.f = tabHost$OnTabChangeListener0;
    }

    @Override  // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}

