package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ListFragment extends Fragment {
    private final Handler a;
    private final Runnable b;
    private final AdapterView.OnItemClickListener c;
    ListAdapter d;
    ListView e;
    View f;
    TextView g;
    View h;
    View i;
    CharSequence j;
    boolean k;
    static final int l = 0xFF0001;
    static final int m = 0xFF0002;
    static final int n = 0xFF0003;

    public ListFragment() {
        this.a = new Handler();
        this.b = new Runnable() {
            final ListFragment a;

            @Override
            public void run() {
                ListView listView0 = ListFragment.this.e;
                listView0.focusableViewAvailable(listView0);
            }
        };
        this.c = new AdapterView.OnItemClickListener() {
            final ListFragment a;

            @Override  // android.widget.AdapterView$OnItemClickListener
            public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
            }
        };
    }

    private void i0() {
        if(this.e != null) {
            return;
        }
        View view0 = this.getView();
        if(view0 == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if(view0 instanceof ListView) {
            this.e = (ListView)view0;
        }
        else {
            TextView textView0 = (TextView)view0.findViewById(0xFF0001);
            this.g = textView0;
            if(textView0 == null) {
                this.f = view0.findViewById(0x1020004);
            }
            else {
                textView0.setVisibility(8);
            }
            this.h = view0.findViewById(0xFF0002);
            this.i = view0.findViewById(0xFF0003);
            View view1 = view0.findViewById(0x102000A);
            if(!(view1 instanceof ListView)) {
                throw view1 == null ? new RuntimeException("Your content must have a ListView whose id attribute is \'android.R.id.list\'") : new RuntimeException("Content has view with id attribute \'android.R.id.list\' that is not a ListView class");
            }
            this.e = (ListView)view1;
            View view2 = this.f;
            if(view2 == null) {
                CharSequence charSequence0 = this.j;
                if(charSequence0 != null) {
                    this.g.setText(charSequence0);
                    this.e.setEmptyView(this.g);
                }
            }
            else {
                ((ListView)view1).setEmptyView(view2);
            }
        }
        this.k = true;
        this.e.setOnItemClickListener(this.c);
        ListAdapter listAdapter0 = this.d;
        if(listAdapter0 != null) {
            this.d = null;
            this.q0(listAdapter0);
        }
        else if(this.h != null) {
            this.s0(false, false);
        }
        this.a.post(this.b);
    }

    @Nullable
    public ListAdapter j0() {
        return this.d;
    }

    @NonNull
    public ListView k0() {
        this.i0();
        return this.e;
    }

    public long l0() {
        this.i0();
        return this.e.getSelectedItemId();
    }

    public int m0() {
        this.i0();
        return this.e.getSelectedItemPosition();
    }

    public void n0(@NonNull ListView listView0, @NonNull View view0, int v, long v1) {
    }

    @NonNull
    public final ListAdapter o0() {
        ListAdapter listAdapter0 = this.j0();
        if(listAdapter0 == null) {
            throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
        }
        return listAdapter0;
    }

    @Override  // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        Context context0 = this.requireContext();
        View view0 = new FrameLayout(context0);
        LinearLayout linearLayout0 = new LinearLayout(context0);
        linearLayout0.setId(0xFF0002);
        linearLayout0.setOrientation(1);
        linearLayout0.setVisibility(8);
        linearLayout0.setGravity(17);
        linearLayout0.addView(new ProgressBar(context0, null, 0x101007A), new FrameLayout.LayoutParams(-2, -2));
        ((ViewGroup)view0).addView(linearLayout0, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout0 = new FrameLayout(context0);
        frameLayout0.setId(0xFF0003);
        TextView textView0 = new TextView(context0);
        textView0.setId(0xFF0001);
        textView0.setGravity(17);
        frameLayout0.addView(textView0, new FrameLayout.LayoutParams(-1, -1));
        ListView listView0 = new ListView(context0);
        listView0.setId(0x102000A);
        listView0.setDrawSelectorOnTop(false);
        frameLayout0.addView(listView0, new FrameLayout.LayoutParams(-1, -1));
        ((ViewGroup)view0).addView(frameLayout0, new FrameLayout.LayoutParams(-1, -1));
        view0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.a.removeCallbacks(this.b);
        this.e = null;
        this.k = false;
        this.i = null;
        this.h = null;
        this.f = null;
        this.g = null;
        super.onDestroyView();
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view0, @Nullable Bundle bundle0) {
        super.onViewCreated(view0, bundle0);
        this.i0();
    }

    public void p0(@Nullable CharSequence charSequence0) {
        this.i0();
        TextView textView0 = this.g;
        if(textView0 == null) {
            throw new IllegalStateException("Can\'t be used with a custom content view");
        }
        textView0.setText(charSequence0);
        if(this.j == null) {
            this.e.setEmptyView(this.g);
        }
        this.j = charSequence0;
    }

    public void q0(@Nullable ListAdapter listAdapter0) {
        boolean z = false;
        boolean z1 = this.d != null;
        this.d = listAdapter0;
        ListView listView0 = this.e;
        if(listView0 != null) {
            listView0.setAdapter(listAdapter0);
            if(!this.k && !z1) {
                if(this.requireView().getWindowToken() != null) {
                    z = true;
                }
                this.s0(true, z);
            }
        }
    }

    public void r0(boolean z) {
        this.s0(z, true);
    }

    private void s0(boolean z, boolean z1) {
        this.i0();
        View view0 = this.h;
        if(view0 == null) {
            throw new IllegalStateException("Can\'t be used with a custom content view");
        }
        if(this.k == z) {
            return;
        }
        this.k = z;
        if(z) {
            if(z1) {
                view0.startAnimation(AnimationUtils.loadAnimation(this.getContext(), 0x10A0001));
                this.i.startAnimation(AnimationUtils.loadAnimation(this.getContext(), 0x10A0000));
            }
            else {
                view0.clearAnimation();
                this.i.clearAnimation();
            }
            this.h.setVisibility(8);
            this.i.setVisibility(0);
            return;
        }
        if(z1) {
            view0.startAnimation(AnimationUtils.loadAnimation(this.getContext(), 0x10A0000));
            this.i.startAnimation(AnimationUtils.loadAnimation(this.getContext(), 0x10A0001));
        }
        else {
            view0.clearAnimation();
            this.i.clearAnimation();
        }
        this.h.setVisibility(0);
        this.i.setVisibility(8);
    }

    public void t0(boolean z) {
        this.s0(z, false);
    }

    public void u0(int v) {
        this.i0();
        this.e.setSelection(v);
    }
}

