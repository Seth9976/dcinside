package com.google.android.gms.internal.clearcut;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public class zzfl extends Enum {
    public static final enum zzfl zzqc;
    public static final enum zzfl zzqd;
    public static final enum zzfl zzqe;
    public static final enum zzfl zzqf;
    public static final enum zzfl zzqg;
    public static final enum zzfl zzqh;
    public static final enum zzfl zzqi;
    public static final enum zzfl zzqj;
    public static final enum zzfl zzqk;
    public static final enum zzfl zzql;
    public static final enum zzfl zzqm;
    public static final enum zzfl zzqn;
    public static final enum zzfl zzqo;
    public static final enum zzfl zzqp;
    public static final enum zzfl zzqq;
    public static final enum zzfl zzqr;
    public static final enum zzfl zzqs;
    public static final enum zzfl zzqt;
    private final zzfq zzqu;
    private final int zzqv;
    private static final zzfl[] zzqw;

    static {
        zzfl.zzqc = new zzfl("DOUBLE", 0, zzfq.zzra, 1);
        zzfl.zzqd = new zzfl("FLOAT", 1, zzfq.zzqz, 5);
        zzfl.zzqe = new zzfl("INT64", 2, zzfq.zzqy, 0);
        zzfl.zzqf = new zzfl("UINT64", 3, zzfq.zzqy, 0);
        zzfl.zzqg = new zzfl("INT32", 4, zzfq.zzqx, 0);
        zzfl.zzqh = new zzfl("FIXED64", 5, zzfq.zzqy, 1);
        zzfl.zzqi = new zzfl("FIXED32", 6, zzfq.zzqx, 5);
        zzfl.zzqj = new zzfl("BOOL", 7, zzfq.zzrb, 0);
        com.google.android.gms.internal.clearcut.zzfl.zzfm zzfm0 = new zzfl("STRING", zzfq.zzrc) {
        };
        zzfl.zzqk = zzfm0;
        com.google.android.gms.internal.clearcut.zzfl.zzfn zzfn0 = new zzfl("GROUP", zzfq.zzrf) {
        };
        zzfl.zzql = zzfn0;
        com.google.android.gms.internal.clearcut.zzfl.zzfo zzfo0 = new zzfl("MESSAGE", zzfq.zzrf) {
        };
        zzfl.zzqm = zzfo0;
        com.google.android.gms.internal.clearcut.zzfl.zzfp zzfp0 = new zzfl("BYTES", zzfq.zzrd) {
        };
        zzfl.zzqn = zzfp0;
        zzfl.zzqo = new zzfl("UINT32", 12, zzfq.zzqx, 0);
        zzfl.zzqp = new zzfl("ENUM", 13, zzfq.zzre, 0);
        zzfl.zzqq = new zzfl("SFIXED32", 14, zzfq.zzqx, 5);
        zzfl.zzqr = new zzfl("SFIXED64", 15, zzfq.zzqy, 1);
        zzfl.zzqs = new zzfl("SINT32", 16, zzfq.zzqx, 0);
        zzfl.zzqt = new zzfl("SINT64", 17, zzfq.zzqy, 0);
        zzfl.zzqw = new zzfl[]{zzfl.zzqc, zzfl.zzqd, zzfl.zzqe, zzfl.zzqf, zzfl.zzqg, zzfl.zzqh, zzfl.zzqi, zzfl.zzqj, zzfm0, zzfn0, zzfo0, zzfp0, zzfl.zzqo, zzfl.zzqp, zzfl.zzqq, zzfl.zzqr, zzfl.zzqs, zzfl.zzqt};
    }

    private zzfl(String s, int v, zzfq zzfq0, int v1) {
        super(s, v);
        this.zzqu = zzfq0;
        this.zzqv = v1;
    }

    zzfl(String s, int v, zzfq zzfq0, int v1, zzfk zzfk0) {
        this(s, v, zzfq0, v1);
    }

    public static zzfl[] values() {
        return (zzfl[])zzfl.zzqw.clone();
    }

    public final zzfq zzek() {
        return this.zzqu;
    }

    public final int zzel() {
        return this.zzqv;
    }
}

