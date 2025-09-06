package androidx.media3.ui;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.media3.common.Player;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters.Builder;
import androidx.media3.common.Tracks.Group;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.O2;
import com.google.common.collect.Q2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

@UnstableApi
public final class TrackSelectionDialogBuilder {
    public interface DialogCallback {
        void a(boolean arg1, Map arg2);
    }

    private final Context a;
    private final CharSequence b;
    private final List c;
    private final DialogCallback d;
    @StyleRes
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    @Nullable
    private TrackNameProvider i;
    private boolean j;
    private Q2 k;
    @Nullable
    private Comparator l;

    public TrackSelectionDialogBuilder(Context context0, CharSequence charSequence0, Player player0, int v) {
        this.a = context0;
        this.b = charSequence0;
        O2 o20 = (player0.v0(30) ? player0.r0() : Tracks.b).c();
        this.c = new ArrayList();
        for(int v1 = 0; v1 < o20.size(); ++v1) {
            Group tracks$Group0 = (Group)o20.get(v1);
            if(tracks$Group0.f() == v) {
                this.c.add(tracks$Group0);
            }
        }
        this.k = player0.A0().A;
        this.d = (boolean z, Map map0) -> {
            if(!player0.v0(29)) {
                return;
            }
            Builder trackSelectionParameters$Builder0 = player0.A0().F();
            trackSelectionParameters$Builder0.q0(v, z);
            trackSelectionParameters$Builder0.G(v);
            for(Object object0: map0.values()) {
                trackSelectionParameters$Builder0.C(((TrackSelectionOverride)object0));
            }
            player0.Z0(trackSelectionParameters$Builder0.D());
        };
    }

    public TrackSelectionDialogBuilder(Context context0, CharSequence charSequence0, List list0, DialogCallback trackSelectionDialogBuilder$DialogCallback0) {
        this.a = context0;
        this.b = charSequence0;
        this.c = O2.r(list0);
        this.d = trackSelectionDialogBuilder$DialogCallback0;
        this.k = Q2.u();
    }

    public Dialog c() {
        Dialog dialog0 = this.d();
        return dialog0 == null ? this.e() : dialog0;
    }

    @Nullable
    private Dialog d() {
        try {
            androidx.appcompat.app.AlertDialog.Builder alertDialog$Builder0 = new androidx.appcompat.app.AlertDialog.Builder(this.a, this.e);
            View view0 = LayoutInflater.from(alertDialog$Builder0.getContext()).inflate(layout.exo_track_selection_dialog, null);
            DialogInterface.OnClickListener dialogInterface$OnClickListener0 = this.q(view0);
            alertDialog$Builder0.setTitle(this.b);
            alertDialog$Builder0.setView(view0);
            alertDialog$Builder0.setPositiveButton(0x104000A, dialogInterface$OnClickListener0);
            alertDialog$Builder0.setNegativeButton(0x1040000, null);
            return alertDialog$Builder0.create();
        }
        catch(Exception exception0) {
            throw new IllegalStateException(exception0);
        }
    }

    private Dialog e() {
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(this.a, this.e);
        View view0 = LayoutInflater.from(alertDialog$Builder0.getContext()).inflate(layout.exo_track_selection_dialog, null);
        DialogInterface.OnClickListener dialogInterface$OnClickListener0 = this.q(view0);
        return alertDialog$Builder0.setTitle(this.b).setView(view0).setPositiveButton(0x104000A, dialogInterface$OnClickListener0).setNegativeButton(0x1040000, null).create();
    }

    // 检测为 Lambda 实现
    private static void f(Player player0, int v, boolean z, Map map0) [...]

    // 检测为 Lambda 实现
    private void g(TrackSelectionView trackSelectionView0, DialogInterface dialogInterface0, int v) [...]

    public TrackSelectionDialogBuilder h(boolean z) {
        this.f = z;
        return this;
    }

    public TrackSelectionDialogBuilder i(boolean z) {
        this.g = z;
        return this;
    }

    public TrackSelectionDialogBuilder j(boolean z) {
        this.j = z;
        return this;
    }

    public TrackSelectionDialogBuilder k(@Nullable TrackSelectionOverride trackSelectionOverride0) {
        return trackSelectionOverride0 == null ? this.l(Collections.emptyMap()) : this.l(Q2.w(trackSelectionOverride0.a, trackSelectionOverride0));
    }

    public TrackSelectionDialogBuilder l(Map map0) {
        this.k = Q2.g(map0);
        return this;
    }

    public TrackSelectionDialogBuilder m(boolean z) {
        this.h = z;
        return this;
    }

    public TrackSelectionDialogBuilder n(@StyleRes int v) {
        this.e = v;
        return this;
    }

    public void o(@Nullable Comparator comparator0) {
        this.l = comparator0;
    }

    public TrackSelectionDialogBuilder p(@Nullable TrackNameProvider trackNameProvider0) {
        this.i = trackNameProvider0;
        return this;
    }

    private DialogInterface.OnClickListener q(View view0) {
        TrackSelectionView trackSelectionView0 = (TrackSelectionView)view0.findViewById(id.exo_track_selection_view);
        trackSelectionView0.setAllowMultipleOverrides(this.g);
        trackSelectionView0.setAllowAdaptiveSelections(this.f);
        trackSelectionView0.setShowDisableOption(this.h);
        TrackNameProvider trackNameProvider0 = this.i;
        if(trackNameProvider0 != null) {
            trackSelectionView0.setTrackNameProvider(trackNameProvider0);
        }
        trackSelectionView0.d(this.c, this.j, this.k, this.l, null);
        return (DialogInterface dialogInterface0, int v) -> this.d.a(trackSelectionView0.getIsDisabled(), trackSelectionView0.getOverrides());
    }
}

