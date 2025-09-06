package androidx.constraintlayout.core.dsl;

public class VGuideline extends Guideline {
    public VGuideline(String s) {
        super(s);
        this.b = new HelperType("vGuideline");
    }

    public VGuideline(String s, String s1) {
        super(s);
        this.c = s1;
        this.b = new HelperType("vGuideline");
        this.d = this.b();
    }
}

