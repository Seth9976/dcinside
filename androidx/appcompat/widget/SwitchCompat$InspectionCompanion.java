package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;

@RequiresApi(29)
@RestrictTo({Scope.a})
public final class SwitchCompat.InspectionCompanion implements InspectionCompanion {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;

    public SwitchCompat.InspectionCompanion() {
        this.a = false;
    }

    public void a(@NonNull SwitchCompat switchCompat0, @NonNull PropertyReader propertyReader0) {
        if(!this.a) {
            throw e.a();
        }
        propertyReader0.readObject(this.b, switchCompat0.getTextOff());
        propertyReader0.readObject(this.c, switchCompat0.getTextOn());
        propertyReader0.readObject(this.d, switchCompat0.getThumbDrawable());
        propertyReader0.readBoolean(this.e, switchCompat0.getShowText());
        propertyReader0.readBoolean(this.f, switchCompat0.getSplitTrack());
        propertyReader0.readInt(this.g, switchCompat0.getSwitchMinWidth());
        propertyReader0.readInt(this.h, switchCompat0.getSwitchPadding());
        propertyReader0.readInt(this.i, switchCompat0.getThumbTextPadding());
        propertyReader0.readObject(this.j, switchCompat0.getThumbTintList());
        propertyReader0.readObject(this.k, switchCompat0.getThumbTintMode());
        propertyReader0.readObject(this.l, switchCompat0.getTrackDrawable());
        propertyReader0.readObject(this.m, switchCompat0.getTrackTintList());
        propertyReader0.readObject(this.n, switchCompat0.getTrackTintMode());
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper0) {
        this.b = propertyMapper0.mapObject("textOff", 0x1010125);
        this.c = propertyMapper0.mapObject("textOn", 0x1010124);
        this.d = propertyMapper0.mapObject("thumb", 0x1010142);
        this.e = propertyMapper0.mapBoolean("showText", attr.showText);
        this.f = propertyMapper0.mapBoolean("splitTrack", attr.splitTrack);
        this.g = propertyMapper0.mapInt("switchMinWidth", attr.switchMinWidth);
        this.h = propertyMapper0.mapInt("switchPadding", attr.switchPadding);
        this.i = propertyMapper0.mapInt("thumbTextPadding", attr.thumbTextPadding);
        this.j = propertyMapper0.mapObject("thumbTint", attr.thumbTint);
        this.k = propertyMapper0.mapObject("thumbTintMode", attr.thumbTintMode);
        this.l = propertyMapper0.mapObject("track", attr.track);
        this.m = propertyMapper0.mapObject("trackTint", attr.trackTint);
        this.n = propertyMapper0.mapObject("trackTintMode", attr.trackTintMode);
        this.a = true;
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void readProperties(@NonNull Object object0, @NonNull PropertyReader propertyReader0) {
        this.a(((SwitchCompat)object0), propertyReader0);
    }
}

