package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@InternalComposeApi
@StabilityInferred(parameters = 0)
public final class MovableContentStateReference {
    @l
    private final MovableContent a;
    @m
    private final Object b;
    @l
    private final ControlledComposition c;
    @l
    private final SlotTable d;
    @l
    private final Anchor e;
    @l
    private final List f;
    @l
    private final PersistentMap g;
    public static final int h = 8;

    static {
    }

    public MovableContentStateReference(@l MovableContent movableContent0, @m Object object0, @l ControlledComposition controlledComposition0, @l SlotTable slotTable0, @l Anchor anchor0, @l List list0, @l PersistentMap persistentMap0) {
        L.p(movableContent0, "content");
        L.p(controlledComposition0, "composition");
        L.p(slotTable0, "slotTable");
        L.p(anchor0, "anchor");
        L.p(list0, "invalidations");
        L.p(persistentMap0, "locals");
        super();
        this.a = movableContent0;
        this.b = object0;
        this.c = controlledComposition0;
        this.d = slotTable0;
        this.e = anchor0;
        this.f = list0;
        this.g = persistentMap0;
    }

    @l
    public final Anchor a() {
        return this.e;
    }

    @l
    public final ControlledComposition b() {
        return this.c;
    }

    @l
    public final MovableContent c() {
        return this.a;
    }

    @l
    public final List d() {
        return this.f;
    }

    @l
    public final PersistentMap e() {
        return this.g;
    }

    @m
    public final Object f() {
        return this.b;
    }

    @l
    public final SlotTable g() {
        return this.d;
    }
}

