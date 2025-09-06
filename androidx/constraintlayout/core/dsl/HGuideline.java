package androidx.constraintlayout.core.dsl;

class HGuideline extends Guideline {
    public HGuideline(String s) {
        super(s);
        this.b = new HelperType("hGuideline");
    }

    public HGuideline(String s, String s1) {
        super(s);
        this.c = s1;
        this.b = new HelperType("hGuideline");
        this.d = this.b();
    }
}

