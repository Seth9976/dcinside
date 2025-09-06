package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.Tracks.Group;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.O2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@UnstableApi
public class TrackSelectionView extends LinearLayout {
    class ComponentListener implements View.OnClickListener {
        final TrackSelectionView a;

        private ComponentListener() {
        }

        ComponentListener(androidx.media3.ui.TrackSelectionView.1 trackSelectionView$10) {
        }

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            TrackSelectionView.this.onClick(view0);
        }
    }

    static final class TrackInfo {
        public final Group a;
        public final int b;

        public TrackInfo(Group tracks$Group0, int v) {
            this.a = tracks$Group0;
            this.b = v;
        }

        public Format a() {
            return this.a.d(this.b);
        }
    }

    public interface TrackSelectionListener {
        void a(boolean arg1, Map arg2);
    }

    private final int a;
    private final LayoutInflater b;
    private final CheckedTextView c;
    private final CheckedTextView d;
    private final ComponentListener e;
    private final List f;
    private final Map g;
    private boolean h;
    private boolean i;
    private TrackNameProvider j;
    private CheckedTextView[][] k;
    private boolean l;
    @Nullable
    private Comparator m;
    @Nullable
    private TrackSelectionListener n;

    public TrackSelectionView(Context context0) {
        this(context0, null);
    }

    public TrackSelectionView(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public TrackSelectionView(Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v) {
        super(context0, attributeSet0, v);
        this.setOrientation(1);
        this.setSaveFromParentEnabled(false);
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(new int[]{0x101030E});
        int v1 = typedArray0.getResourceId(0, 0);
        this.a = v1;
        typedArray0.recycle();
        LayoutInflater layoutInflater0 = LayoutInflater.from(context0);
        this.b = layoutInflater0;
        ComponentListener trackSelectionView$ComponentListener0 = (View view0) -> {
            if(view0 == TrackSelectionView.this.c) {
                TrackSelectionView.this.g();
            }
            else if(view0 == TrackSelectionView.this.d) {
                TrackSelectionView.this.f();
            }
            else {
                TrackSelectionView.this.h(view0);
            }
            TrackSelectionView.this.k();
            TrackSelectionListener trackSelectionView$TrackSelectionListener0 = TrackSelectionView.this.n;
            if(trackSelectionView$TrackSelectionListener0 != null) {
                trackSelectionView$TrackSelectionListener0.a(TrackSelectionView.this.getIsDisabled(), TrackSelectionView.this.getOverrides());
            }
        };
        this.e = trackSelectionView$ComponentListener0;
        this.j = new DefaultTrackNameProvider(this.getResources());
        this.f = new ArrayList();
        this.g = new HashMap();
        CheckedTextView checkedTextView0 = (CheckedTextView)layoutInflater0.inflate(0x109000F, this, false);
        this.c = checkedTextView0;
        checkedTextView0.setBackgroundResource(v1);
        checkedTextView0.setText(string.exo_track_selection_none);
        checkedTextView0.setEnabled(false);
        checkedTextView0.setFocusable(true);
        checkedTextView0.setOnClickListener(trackSelectionView$ComponentListener0);
        checkedTextView0.setVisibility(8);
        this.addView(checkedTextView0);
        this.addView(layoutInflater0.inflate(layout.exo_list_divider, this, false));
        CheckedTextView checkedTextView1 = (CheckedTextView)layoutInflater0.inflate(0x109000F, this, false);
        this.d = checkedTextView1;
        checkedTextView1.setBackgroundResource(v1);
        checkedTextView1.setText(string.exo_track_selection_auto);
        checkedTextView1.setEnabled(false);
        checkedTextView1.setFocusable(true);
        checkedTextView1.setOnClickListener(trackSelectionView$ComponentListener0);
        this.addView(checkedTextView1);
    }

    public static Map c(Map map0, List list0, boolean z) {
        Map map1 = new HashMap();
        for(int v = 0; v < list0.size(); ++v) {
            TrackSelectionOverride trackSelectionOverride0 = (TrackSelectionOverride)map0.get(((Group)list0.get(v)).c());
            if(trackSelectionOverride0 != null && (z || ((HashMap)map1).isEmpty())) {
                ((HashMap)map1).put(trackSelectionOverride0.a, trackSelectionOverride0);
            }
        }
        return map1;
    }

    public void d(List list0, boolean z, Map map0, @Nullable Comparator comparator0, @Nullable TrackSelectionListener trackSelectionView$TrackSelectionListener0) {
        this.l = z;
        this.m = comparator0 == null ? null : (TrackInfo trackSelectionView$TrackInfo0, TrackInfo trackSelectionView$TrackInfo1) -> comparator0.compare(trackSelectionView$TrackInfo0.a(), trackSelectionView$TrackInfo1.a());
        this.n = trackSelectionView$TrackSelectionListener0;
        this.f.clear();
        this.f.addAll(list0);
        this.g.clear();
        Map map1 = TrackSelectionView.c(map0, list0, this.i);
        this.g.putAll(map1);
        this.l();
    }

    // 检测为 Lambda 实现
    private static int e(Comparator comparator0, TrackInfo trackSelectionView$TrackInfo0, TrackInfo trackSelectionView$TrackInfo1) [...]

    private void f() {
        this.l = false;
        this.g.clear();
    }

    private void g() {
        this.l = true;
        this.g.clear();
    }

    public boolean getIsDisabled() {
        return this.l;
    }

    public Map getOverrides() {
        return this.g;
    }

    private void h(View view0) {
        boolean z = false;
        this.l = false;
        TrackInfo trackSelectionView$TrackInfo0 = (TrackInfo)Assertions.g(view0.getTag());
        TrackGroup trackGroup0 = trackSelectionView$TrackInfo0.a.c();
        int v = trackSelectionView$TrackInfo0.b;
        TrackSelectionOverride trackSelectionOverride0 = (TrackSelectionOverride)this.g.get(trackGroup0);
        if(trackSelectionOverride0 == null) {
            if(!this.i && this.g.size() > 0) {
                this.g.clear();
            }
            TrackSelectionOverride trackSelectionOverride1 = new TrackSelectionOverride(trackGroup0, O2.B(v));
            this.g.put(trackGroup0, trackSelectionOverride1);
            return;
        }
        ArrayList arrayList0 = new ArrayList(trackSelectionOverride0.b);
        boolean z1 = ((CheckedTextView)view0).isChecked();
        boolean z2 = this.i(trackSelectionView$TrackInfo0.a);
        if(z2 || this.j()) {
            z = true;
        }
        if(z1 && z) {
            arrayList0.remove(Integer.valueOf(v));
            if(arrayList0.isEmpty()) {
                this.g.remove(trackGroup0);
                return;
            }
            TrackSelectionOverride trackSelectionOverride2 = new TrackSelectionOverride(trackGroup0, arrayList0);
            this.g.put(trackGroup0, trackSelectionOverride2);
            return;
        }
        if(!z1) {
            if(z2) {
                arrayList0.add(v);
                TrackSelectionOverride trackSelectionOverride3 = new TrackSelectionOverride(trackGroup0, arrayList0);
                this.g.put(trackGroup0, trackSelectionOverride3);
                return;
            }
            TrackSelectionOverride trackSelectionOverride4 = new TrackSelectionOverride(trackGroup0, O2.B(v));
            this.g.put(trackGroup0, trackSelectionOverride4);
        }
    }

    // 去混淆评级： 低(20)
    private boolean i(Group tracks$Group0) {
        return this.h && tracks$Group0.g();
    }

    private boolean j() {
        return this.i && this.f.size() > 1;
    }

    private void k() {
        this.c.setChecked(this.l);
        this.d.setChecked(!this.l && this.g.size() == 0);
        for(int v = 0; v < this.k.length; ++v) {
            TrackGroup trackGroup0 = ((Group)this.f.get(v)).c();
            TrackSelectionOverride trackSelectionOverride0 = (TrackSelectionOverride)this.g.get(trackGroup0);
            for(int v1 = 0; true; ++v1) {
                CheckedTextView[] arr_checkedTextView = this.k[v];
                if(v1 >= arr_checkedTextView.length) {
                    break;
                }
                if(trackSelectionOverride0 == null) {
                    arr_checkedTextView[v1].setChecked(false);
                }
                else {
                    TrackInfo trackSelectionView$TrackInfo0 = (TrackInfo)Assertions.g(arr_checkedTextView[v1].getTag());
                    this.k[v][v1].setChecked(trackSelectionOverride0.b.contains(trackSelectionView$TrackInfo0.b));
                }
            }
        }
    }

    private void l() {
        for(int v = this.getChildCount() - 1; v >= 3; --v) {
            this.removeViewAt(v);
        }
        if(this.f.isEmpty()) {
            this.c.setEnabled(false);
            this.d.setEnabled(false);
            return;
        }
        this.c.setEnabled(true);
        this.d.setEnabled(true);
        this.k = new CheckedTextView[this.f.size()][];
        boolean z = this.j();
        for(int v1 = 0; v1 < this.f.size(); ++v1) {
            Group tracks$Group0 = (Group)this.f.get(v1);
            boolean z1 = this.i(tracks$Group0);
            int v2 = tracks$Group0.a;
            this.k[v1] = new CheckedTextView[v2];
            TrackInfo[] arr_trackSelectionView$TrackInfo = new TrackInfo[v2];
            for(int v3 = 0; v3 < tracks$Group0.a; ++v3) {
                arr_trackSelectionView$TrackInfo[v3] = new TrackInfo(tracks$Group0, v3);
            }
            Comparator comparator0 = this.m;
            if(comparator0 != null) {
                Arrays.sort(arr_trackSelectionView$TrackInfo, comparator0);
            }
            for(int v4 = 0; v4 < v2; ++v4) {
                if(v4 == 0) {
                    this.addView(this.b.inflate(layout.exo_list_divider, this, false));
                }
                CheckedTextView checkedTextView0 = (CheckedTextView)this.b.inflate((z1 || z ? 0x1090010 : 0x109000F), this, false);
                checkedTextView0.setBackgroundResource(this.a);
                checkedTextView0.setText(this.j.a(arr_trackSelectionView$TrackInfo[v4].a()));
                checkedTextView0.setTag(arr_trackSelectionView$TrackInfo[v4]);
                if(tracks$Group0.l(v4)) {
                    checkedTextView0.setFocusable(true);
                    checkedTextView0.setOnClickListener(this.e);
                }
                else {
                    checkedTextView0.setFocusable(false);
                    checkedTextView0.setEnabled(false);
                }
                this.k[v1][v4] = checkedTextView0;
                this.addView(checkedTextView0);
            }
        }
        this.k();
    }

    // 检测为 Lambda 实现
    private void onClick(View view0) [...]

    public void setAllowAdaptiveSelections(boolean z) {
        if(this.h != z) {
            this.h = z;
            this.l();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if(this.i != z) {
            this.i = z;
            if(!z && this.g.size() > 1) {
                Map map0 = TrackSelectionView.c(this.g, this.f, false);
                this.g.clear();
                this.g.putAll(map0);
            }
            this.l();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.c.setVisibility((z ? 0 : 8));
    }

    public void setTrackNameProvider(TrackNameProvider trackNameProvider0) {
        this.j = (TrackNameProvider)Assertions.g(trackNameProvider0);
        this.l();
    }

    class androidx.media3.ui.TrackSelectionView.1 {
    }

}

