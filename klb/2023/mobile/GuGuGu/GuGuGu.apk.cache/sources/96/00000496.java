package com.GuGuGu;

import com.e4a.runtime.AbstractC0025;
import com.e4a.runtime.C0022;
import com.e4a.runtime.C0023;
import com.e4a.runtime.C0029;
import com.e4a.runtime.C0031;
import com.e4a.runtime.C0032;
import com.e4a.runtime.C0035;
import com.e4a.runtime.Objects;
import com.e4a.runtime.annotations.SimpleDataElement;
import com.e4a.runtime.annotations.SimpleObject;
import com.e4a.runtime.components.InterfaceC0016;
import com.e4a.runtime.components.InterfaceC0020;
import com.e4a.runtime.components.impl.android.AbstractC0040Impl;
import com.e4a.runtime.components.impl.android.C0044Impl;
import com.e4a.runtime.components.impl.android.n1.Impl;
import com.e4a.runtime.components.impl.android.n1.InterfaceC0004;
import com.e4a.runtime.components.impl.android.n12.InterfaceC0005;
import com.e4a.runtime.components.impl.android.n2.InterfaceC0006;
import com.e4a.runtime.components.impl.android.n3.InterfaceC0007;
import com.e4a.runtime.events.EventDispatcher;
import com.e4a.runtime.parameters.BooleanReferenceParameter;
import com.e4a.runtime.variants.ByteVariant;
import com.e4a.runtime.variants.DoubleVariant;
import com.e4a.runtime.variants.IntegerVariant;
import com.e4a.runtime.variants.LongVariant;
import com.e4a.runtime.variants.ShortVariant;

/* compiled from: 主窗口.code */
@SimpleObject
/* renamed from: com.GuGuGu.主窗口 */
/* loaded from: classes.dex */
public class C0001 extends AbstractC0040Impl {
    @SimpleDataElement
    public static InterfaceC0016 oD60FCAD79BE9;
    @SimpleDataElement
    public int o649D1C1243;
    @SimpleDataElement
    public InterfaceC0004 oB04CBBC215;
    @SimpleDataElement
    public InterfaceC0004 oB04CBBC216;
    @SimpleDataElement
    public InterfaceC0004 oB04CBBC217;
    @SimpleDataElement
    public InterfaceC0007 oB112B9CE15;
    @SimpleDataElement
    public InterfaceC0007 oB112B9CE16;
    @SimpleDataElement
    public InterfaceC0007 oB112B9CE17;
    @SimpleDataElement
    public InterfaceC0006 oB118C2CA9BC124;
    @SimpleDataElement

    /* renamed from: oB53BC9B1 */
    public int score;
    @SimpleDataElement
    public int oBC1CC693;
    @SimpleDataElement
    public int oBC3ECAA9;
    @SimpleDataElement
    public InterfaceC0020 oC31ECE8210;
    @SimpleDataElement
    public InterfaceC0020 oC31ECE8211;
    @SimpleDataElement
    public InterfaceC0020 oC31ECE8212;
    @SimpleDataElement
    public InterfaceC0020 oC31ECE8213;
    @SimpleDataElement
    public InterfaceC0020 oC31ECE8215;
    @SimpleDataElement
    public InterfaceC0020 oC31ECE8216;
    @SimpleDataElement
    public InterfaceC0020 oC31ECE8217;
    @SimpleDataElement
    public int oC409A99495EC;
    @SimpleDataElement
    public int oC409C8C295EC;
    @SimpleDataElement
    public long oC60CC8C8EE82A978;
    @SimpleDataElement
    public InterfaceC0005 oCA49A8B415;
    @SimpleDataElement
    public InterfaceC0005 oCA49A8B416;
    @SimpleDataElement
    public InterfaceC0020 oCB56C7BB10;
    @SimpleDataElement
    public int oCB56C7BB10E4E62DA0;
    @SimpleDataElement
    public InterfaceC0020 oCB56C7BB11;
    @SimpleDataElement
    public int oCB56C7BB11E4E62DA0;
    @SimpleDataElement
    public InterfaceC0020 oCB56C7BB12;
    @SimpleDataElement
    public int oCB56C7BB12E4E62DA0;
    @SimpleDataElement
    public InterfaceC0020 oCB56C7BB15;
    @SimpleDataElement
    public int oCB56C7BB15E4E62DA0;
    @SimpleDataElement
    public InterfaceC0020 oCB56C7BB16;
    @SimpleDataElement
    public int oCB56C7BB16E4E62DA0;
    @SimpleDataElement
    public InterfaceC0020 oCB56C7BB17;
    @SimpleDataElement
    public int oCB56C7BB17E4E62DA0;
    @SimpleDataElement
    public InterfaceC0004 oCC00;
    @SimpleDataElement
    public String oBF52B4DB = "";
    @SimpleDataElement
    public String oBF52B4DB16 = "";
    @SimpleDataElement
    public String o63901B044F7579FD18 = "";
    @SimpleDataElement
    public String o63910E0F414150F21C = "";

    public C0001() {
        Objects.initializeProperties(this);
        $define();
    }

    public void $define() {
        oD60FCAD79BE9 = this;
        oD60FCAD79BE9.mo305("E4A");
        oD60FCAD79BE9.mo130(-1);
        oD60FCAD79BE9.m334(IntegerVariant.getIntegerVariant(4));
        oD60FCAD79BE9.mo303(1);
        oD60FCAD79BE9.mo291(false);
        Impl impl = new Impl(oD60FCAD79BE9);
        Objects.initializeProperties(impl);
        this.oCC00 = impl;
        this.oCC00.mo115((int) C0031.m486(ByteVariant.getByteVariant((byte) 0).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oCC00.mo137((int) C0031.m486(ByteVariant.getByteVariant((byte) 0).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oCC00.mo113((int) C0031.m486(ByteVariant.getByteVariant((byte) 1).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oCC00.mo139((int) C0031.m486(ByteVariant.getByteVariant((byte) 1).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oCC00.mo94("");
        this.oCC00.mo88(-16777216);
        this.oCC00.mo95(false);
        this.oCC00.mo91(false);
        this.oCC00.mo90(7);
        this.oCC00.mo86(9.0f);
        this.oCC00.mo142("");
        this.oCC00.mo150("");
        this.oCC00.mo146("");
        this.oCC00.mo107(true);
        this.oCC00.mo98(0);
        this.oCC00.mo109(true);
        C0044Impl c0044Impl = new C0044Impl(oD60FCAD79BE9);
        Objects.initializeProperties(c0044Impl);
        this.oC31ECE8215 = c0044Impl;
        this.oC31ECE8215.mo327(IntegerVariant.getIntegerVariant(4));
        this.oC31ECE8215.mo115((int) C0031.m486(ByteVariant.getByteVariant((byte) 0).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oC31ECE8215.mo137((int) C0031.m486(DoubleVariant.getDoubleVariant(0.9d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oC31ECE8215.mo113((int) C0031.m486(ByteVariant.getByteVariant((byte) 1).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oC31ECE8215.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.1d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oC31ECE8215.mo130(-16742145);
        this.oC31ECE8215.mo315("d3.png");
        this.oC31ECE8215.mo109(true);
        C0044Impl c0044Impl2 = new C0044Impl(oD60FCAD79BE9);
        Objects.initializeProperties(c0044Impl2);
        this.oC31ECE8216 = c0044Impl2;
        this.oC31ECE8216.mo327(IntegerVariant.getIntegerVariant(4));
        this.oC31ECE8216.mo115((int) C0031.m486(ByteVariant.getByteVariant((byte) 0).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oC31ECE8216.mo137((int) C0031.m486(ByteVariant.getByteVariant((byte) 0).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oC31ECE8216.mo113((int) C0031.m486(ByteVariant.getByteVariant((byte) 1).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oC31ECE8216.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.9d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oC31ECE8216.mo130(-16742145);
        this.oC31ECE8216.mo315("BT.png");
        this.oC31ECE8216.mo109(true);
        Impl impl2 = new Impl(oD60FCAD79BE9);
        Objects.initializeProperties(impl2);
        this.oB04CBBC215 = impl2;
        this.oB04CBBC215.mo115((int) C0031.m486(DoubleVariant.getDoubleVariant(0.079d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oB04CBBC215.mo137((int) C0031.m486(DoubleVariant.getDoubleVariant(0.75d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oB04CBBC215.mo113((int) C0031.m486(DoubleVariant.getDoubleVariant(0.367d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oB04CBBC215.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.15d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oB04CBBC215.mo94("");
        this.oB04CBBC215.mo88(-16777216);
        this.oB04CBBC215.mo95(false);
        this.oB04CBBC215.mo91(false);
        this.oB04CBBC215.mo90(7);
        this.oB04CBBC215.mo86(9.0f);
        this.oB04CBBC215.mo142("kaishianniu.png");
        this.oB04CBBC215.mo150("");
        this.oB04CBBC215.mo146("");
        this.oB04CBBC215.mo107(true);
        this.oB04CBBC215.mo98(255);
        this.oB04CBBC215.mo109(true);
        Impl impl3 = new Impl(oD60FCAD79BE9);
        Objects.initializeProperties(impl3);
        this.oB04CBBC216 = impl3;
        this.oB04CBBC216.mo115((int) C0031.m486(DoubleVariant.getDoubleVariant(0.546d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oB04CBBC216.mo137((int) C0031.m486(DoubleVariant.getDoubleVariant(0.75d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oB04CBBC216.mo113((int) C0031.m486(DoubleVariant.getDoubleVariant(0.367d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oB04CBBC216.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.15d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oB04CBBC216.mo94("");
        this.oB04CBBC216.mo88(-16777216);
        this.oB04CBBC216.mo95(false);
        this.oB04CBBC216.mo91(false);
        this.oB04CBBC216.mo90(7);
        this.oB04CBBC216.mo86(9.0f);
        this.oB04CBBC216.mo142("paiming.png");
        this.oB04CBBC216.mo150("");
        this.oB04CBBC216.mo146("");
        this.oB04CBBC216.mo107(true);
        this.oB04CBBC216.mo98(255);
        this.oB04CBBC216.mo109(true);
        Impl impl4 = new Impl(oD60FCAD79BE9);
        Objects.initializeProperties(impl4);
        this.oB04CBBC217 = impl4;
        this.oB04CBBC217.mo115((int) C0031.m486(DoubleVariant.getDoubleVariant(0.388d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oB04CBBC217.mo137((int) C0031.m486(DoubleVariant.getDoubleVariant(0.516d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oB04CBBC217.mo113((int) C0031.m486(DoubleVariant.getDoubleVariant(0.217d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oB04CBBC217.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.091d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oB04CBBC217.mo94("GuGuGu");
        this.oB04CBBC217.mo88(-16777216);
        this.oB04CBBC217.mo95(false);
        this.oB04CBBC217.mo91(false);
        this.oB04CBBC217.mo90(7);
        this.oB04CBBC217.mo86(9.0f);
        this.oB04CBBC217.mo142("xianshi.png");
        this.oB04CBBC217.mo150("");
        this.oB04CBBC217.mo146("");
        this.oB04CBBC217.mo107(true);
        this.oB04CBBC217.mo98(255);
        this.oB04CBBC217.mo109(true);
        com.e4a.runtime.components.impl.android.n12.Impl impl5 = new com.e4a.runtime.components.impl.android.n12.Impl(oD60FCAD79BE9);
        Objects.initializeProperties(impl5);
        this.oCA49A8B415 = impl5;
        this.oCA49A8B415.mo166(200);
        C0044Impl c0044Impl3 = new C0044Impl(oD60FCAD79BE9);
        Objects.initializeProperties(c0044Impl3);
        this.oC31ECE8210 = c0044Impl3;
        this.oC31ECE8210.mo327(IntegerVariant.getIntegerVariant(4));
        this.oC31ECE8210.mo115((int) C0031.m486(DoubleVariant.getDoubleVariant(0.438d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oC31ECE8210.mo137((int) C0031.m486(DoubleVariant.getDoubleVariant(0.406d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oC31ECE8210.mo113((int) C0031.m486(DoubleVariant.getDoubleVariant(0.088d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oC31ECE8210.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.041d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oC31ECE8210.mo130(-11616053);
        this.oC31ECE8210.mo315("niao1.png");
        this.oC31ECE8210.mo109(true);
        C0044Impl c0044Impl4 = new C0044Impl(oD60FCAD79BE9);
        Objects.initializeProperties(c0044Impl4);
        this.oC31ECE8211 = c0044Impl4;
        this.oC31ECE8211.mo327(IntegerVariant.getIntegerVariant(4));
        this.oC31ECE8211.mo115((int) C0031.m486(DoubleVariant.getDoubleVariant(0.333d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oC31ECE8211.mo137((int) C0031.m486(DoubleVariant.getDoubleVariant(0.403d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oC31ECE8211.mo113((int) C0031.m486(DoubleVariant.getDoubleVariant(0.3d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oC31ECE8211.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.175d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oC31ECE8211.mo130(-11616053);
        this.oC31ECE8211.mo315("kaishi.png");
        this.oC31ECE8211.mo109(false);
        C0044Impl c0044Impl5 = new C0044Impl(oD60FCAD79BE9);
        Objects.initializeProperties(c0044Impl5);
        this.oCB56C7BB15 = c0044Impl5;
        this.oCB56C7BB15.mo327(IntegerVariant.getIntegerVariant(4));
        this.oCB56C7BB15.mo115((int) C0031.m486(ByteVariant.getByteVariant((byte) 1).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oCB56C7BB15.mo137((int) C0031.m486(ByteVariant.getByteVariant((byte) 0).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oCB56C7BB15.mo113((int) C0031.m486(DoubleVariant.getDoubleVariant(0.167d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oCB56C7BB15.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.225d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oCB56C7BB15.mo130(-16742145);
        this.oCB56C7BB15.mo315("shuiguanshang.png");
        this.oCB56C7BB15.mo109(false);
        C0044Impl c0044Impl6 = new C0044Impl(oD60FCAD79BE9);
        Objects.initializeProperties(c0044Impl6);
        this.oCB56C7BB16 = c0044Impl6;
        this.oCB56C7BB16.mo327(IntegerVariant.getIntegerVariant(4));
        this.oCB56C7BB16.mo115((int) C0031.m486(ByteVariant.getByteVariant((byte) 1).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oCB56C7BB16.mo137((int) C0031.m486(DoubleVariant.getDoubleVariant(0.425d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oCB56C7BB16.mo113((int) C0031.m486(DoubleVariant.getDoubleVariant(0.167d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oCB56C7BB16.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.475d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oCB56C7BB16.mo130(-16742145);
        this.oCB56C7BB16.mo315("shuiguanxia.png");
        this.oCB56C7BB16.mo109(false);
        C0044Impl c0044Impl7 = new C0044Impl(oD60FCAD79BE9);
        Objects.initializeProperties(c0044Impl7);
        this.oCB56C7BB17 = c0044Impl7;
        this.oCB56C7BB17.mo327(IntegerVariant.getIntegerVariant(4));
        this.oCB56C7BB17.mo115((int) C0031.m486(DoubleVariant.getDoubleVariant(1.633d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oCB56C7BB17.mo137((int) C0031.m486(ByteVariant.getByteVariant((byte) 0).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oCB56C7BB17.mo113((int) C0031.m486(DoubleVariant.getDoubleVariant(0.167d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oCB56C7BB17.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.425d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oCB56C7BB17.mo130(-16742145);
        this.oCB56C7BB17.mo315("shuiguanshang.png");
        this.oCB56C7BB17.mo109(false);
        C0044Impl c0044Impl8 = new C0044Impl(oD60FCAD79BE9);
        Objects.initializeProperties(c0044Impl8);
        this.oCB56C7BB10 = c0044Impl8;
        this.oCB56C7BB10.mo327(IntegerVariant.getIntegerVariant(4));
        this.oCB56C7BB10.mo115((int) C0031.m486(DoubleVariant.getDoubleVariant(1.633d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oCB56C7BB10.mo137((int) C0031.m486(DoubleVariant.getDoubleVariant(0.625d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oCB56C7BB10.mo113((int) C0031.m486(DoubleVariant.getDoubleVariant(0.167d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oCB56C7BB10.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.275d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oCB56C7BB10.mo130(-16742145);
        this.oCB56C7BB10.mo315("shuiguanxia.png");
        this.oCB56C7BB10.mo109(false);
        com.e4a.runtime.components.impl.android.n12.Impl impl6 = new com.e4a.runtime.components.impl.android.n12.Impl(oD60FCAD79BE9);
        Objects.initializeProperties(impl6);
        this.oCA49A8B416 = impl6;
        this.oCA49A8B416.mo166(0);
        com.e4a.runtime.components.impl.android.n3.Impl impl7 = new com.e4a.runtime.components.impl.android.n3.Impl(oD60FCAD79BE9);
        Objects.initializeProperties(impl7);
        this.oB112B9CE15 = impl7;
        this.oB112B9CE15.mo115((int) C0031.m486(DoubleVariant.getDoubleVariant(0.429d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oB112B9CE15.mo137((int) C0031.m486(DoubleVariant.getDoubleVariant(0.944d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oB112B9CE15.mo113((int) C0031.m486(DoubleVariant.getDoubleVariant(0.133d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oB112B9CE15.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.05d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oB112B9CE15.mo94("");
        this.oB112B9CE15.mo130(-2238316);
        this.oB112B9CE15.mo88(-1);
        this.oB112B9CE15.mo95(false);
        this.oB112B9CE15.mo91(false);
        this.oB112B9CE15.mo90(7);
        this.oB112B9CE15.mo86(15.0f);
        this.oB112B9CE15.mo98(255);
        this.oB112B9CE15.mo109(false);
        C0044Impl c0044Impl9 = new C0044Impl(oD60FCAD79BE9);
        Objects.initializeProperties(c0044Impl9);
        this.oCB56C7BB12 = c0044Impl9;
        this.oCB56C7BB12.mo327(IntegerVariant.getIntegerVariant(4));
        this.oCB56C7BB12.mo115((int) C0031.m486(DoubleVariant.getDoubleVariant(2.267d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oCB56C7BB12.mo137((int) C0031.m486(DoubleVariant.getDoubleVariant(0.675d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oCB56C7BB12.mo113((int) C0031.m486(DoubleVariant.getDoubleVariant(0.167d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oCB56C7BB12.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.225d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oCB56C7BB12.mo130(-16742145);
        this.oCB56C7BB12.mo315("shuiguanxia.png");
        this.oCB56C7BB12.mo109(true);
        C0044Impl c0044Impl10 = new C0044Impl(oD60FCAD79BE9);
        Objects.initializeProperties(c0044Impl10);
        this.oCB56C7BB11 = c0044Impl10;
        this.oCB56C7BB11.mo327(IntegerVariant.getIntegerVariant(4));
        this.oCB56C7BB11.mo115((int) C0031.m486(DoubleVariant.getDoubleVariant(2.267d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oCB56C7BB11.mo137((int) C0031.m486(ByteVariant.getByteVariant((byte) 0).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oCB56C7BB11.mo113((int) C0031.m486(DoubleVariant.getDoubleVariant(0.167d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oCB56C7BB11.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.45d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oCB56C7BB11.mo130(-16742145);
        this.oCB56C7BB11.mo315("shuiguanshang.png");
        this.oCB56C7BB11.mo109(true);
        C0044Impl c0044Impl11 = new C0044Impl(oD60FCAD79BE9);
        Objects.initializeProperties(c0044Impl11);
        this.oC31ECE8213 = c0044Impl11;
        this.oC31ECE8213.mo327(IntegerVariant.getIntegerVariant(4));
        this.oC31ECE8213.mo115((int) C0031.m486(DoubleVariant.getDoubleVariant(0.263d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oC31ECE8213.mo137((int) C0031.m486(DoubleVariant.getDoubleVariant(0.444d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oC31ECE8213.mo113((int) C0031.m486(DoubleVariant.getDoubleVariant(0.088d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oC31ECE8213.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.041d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oC31ECE8213.mo130(-11616053);
        this.oC31ECE8213.mo315("niao1.png");
        this.oC31ECE8213.mo109(false);
        C0044Impl c0044Impl12 = new C0044Impl(oD60FCAD79BE9);
        Objects.initializeProperties(c0044Impl12);
        this.oC31ECE8212 = c0044Impl12;
        this.oC31ECE8212.mo327(IntegerVariant.getIntegerVariant(4));
        this.oC31ECE8212.mo115((int) C0031.m486(DoubleVariant.getDoubleVariant(0.1d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oC31ECE8212.mo137((int) C0031.m486(DoubleVariant.getDoubleVariant(0.375d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oC31ECE8212.mo113((int) C0031.m486(DoubleVariant.getDoubleVariant(0.8d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oC31ECE8212.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.3d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oC31ECE8212.mo130(-16742145);
        this.oC31ECE8212.mo315("jifenban.png");
        this.oC31ECE8212.mo109(false);
        C0044Impl c0044Impl13 = new C0044Impl(oD60FCAD79BE9);
        Objects.initializeProperties(c0044Impl13);
        this.oC31ECE8217 = c0044Impl13;
        this.oC31ECE8217.mo327(IntegerVariant.getIntegerVariant(4));
        this.oC31ECE8217.mo115((int) C0031.m486(DoubleVariant.getDoubleVariant(0.171d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oC31ECE8217.mo137((int) C0031.m486(DoubleVariant.getDoubleVariant(0.184d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oC31ECE8217.mo113((int) C0031.m486(DoubleVariant.getDoubleVariant(0.692d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oC31ECE8217.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.125d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oC31ECE8217.mo130(-16742145);
        this.oC31ECE8217.mo315("biaoti.png");
        this.oC31ECE8217.mo109(true);
        com.e4a.runtime.components.impl.android.n3.Impl impl8 = new com.e4a.runtime.components.impl.android.n3.Impl(oD60FCAD79BE9);
        Objects.initializeProperties(impl8);
        this.oB112B9CE16 = impl8;
        this.oB112B9CE16.mo115((int) C0031.m486(DoubleVariant.getDoubleVariant(0.667d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oB112B9CE16.mo137((int) C0031.m486(DoubleVariant.getDoubleVariant(0.6d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oB112B9CE16.mo113((int) C0031.m486(DoubleVariant.getDoubleVariant(0.2d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oB112B9CE16.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.075d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oB112B9CE16.mo94("");
        this.oB112B9CE16.mo130(-2237547);
        this.oB112B9CE16.mo88(-1);
        this.oB112B9CE16.mo95(false);
        this.oB112B9CE16.mo91(false);
        this.oB112B9CE16.mo90(7);
        this.oB112B9CE16.mo86(8.0f);
        this.oB112B9CE16.mo98(255);
        this.oB112B9CE16.mo109(false);
        com.e4a.runtime.components.impl.android.n3.Impl impl9 = new com.e4a.runtime.components.impl.android.n3.Impl(oD60FCAD79BE9);
        Objects.initializeProperties(impl9);
        this.oB112B9CE17 = impl9;
        this.oB112B9CE17.mo115((int) C0031.m486(DoubleVariant.getDoubleVariant(0.667d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oB112B9CE17.mo137((int) C0031.m486(DoubleVariant.getDoubleVariant(0.5d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oB112B9CE17.mo113((int) C0031.m486(DoubleVariant.getDoubleVariant(0.2d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oB112B9CE17.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.05d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oB112B9CE17.mo94("");
        this.oB112B9CE17.mo130(-2237547);
        this.oB112B9CE17.mo88(-1);
        this.oB112B9CE17.mo95(false);
        this.oB112B9CE17.mo91(false);
        this.oB112B9CE17.mo90(7);
        this.oB112B9CE17.mo86(9.0f);
        this.oB112B9CE17.mo98(255);
        this.oB112B9CE17.mo109(false);
        com.e4a.runtime.components.impl.android.n2.Impl impl10 = new com.e4a.runtime.components.impl.android.n2.Impl(oD60FCAD79BE9);
        Objects.initializeProperties(impl10);
        this.oB118C2CA9BC124 = impl10;
        this.oB118C2CA9BC124.mo115((int) C0031.m486(DoubleVariant.getDoubleVariant(0.1d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oB118C2CA9BC124.mo137((int) C0031.m486(DoubleVariant.getDoubleVariant(0.075d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oB118C2CA9BC124.mo113((int) C0031.m486(DoubleVariant.getDoubleVariant(0.833d).mul(IntegerVariant.getIntegerVariant(C0032.m514()))));
        this.oB118C2CA9BC124.mo139((int) C0031.m486(DoubleVariant.getDoubleVariant(0.125d).mul(IntegerVariant.getIntegerVariant(C0032.m517_()))));
        this.oB118C2CA9BC124.mo84("");
        this.oB118C2CA9BC124.mo88(-16742145);
        this.oB118C2CA9BC124.mo95(false);
        this.oB118C2CA9BC124.mo91(false);
        this.oB118C2CA9BC124.mo86(9.0f);
        this.oB118C2CA9BC124.mo107(false);
        this.oB118C2CA9BC124.mo197(4);
        this.oB118C2CA9BC124.mo90(7);
        this.oB118C2CA9BC124.mo105(true);
        this.oB118C2CA9BC124.mo191("BG.png");
        this.oB118C2CA9BC124.mo98(168);
        this.oB118C2CA9BC124.mo109(false);
        EventDispatcher.registerEvent(this, "oC31ECE8217", "创建完毕");
        EventDispatcher.registerEvent(this, "oCC00", "被单击");
        EventDispatcher.registerEvent(this, "oB04CBBC215", "被单击");
        EventDispatcher.registerEvent(this, "oB04CBBC216", "被按下");
        EventDispatcher.registerEvent(this, "oB04CBBC216", "被单击");
        EventDispatcher.registerEvent(this, "oCA49A8B415", "周期事件");
        EventDispatcher.registerEvent(this, "oC31ECE8212", "创建完毕");
        EventDispatcher.registerEvent(this, "oB112B9CE16", "被单击");
        EventDispatcher.registerEvent(this, "oB04CBBC217", "被单击");
        EventDispatcher.registerEvent(this, "oCA49A8B416", "周期事件");
        EventDispatcher.registerEvent(this, "oD60FCAD79BE9", "按下某键");
        EventDispatcher.registerEvent(this, "oD60FCAD79BE9", "创建完毕");
        oD60FCAD79BE9.mo82();
        this.oCC00.mo82();
        this.oC31ECE8215.mo82();
        this.oC31ECE8216.mo82();
        this.oB04CBBC215.mo82();
        this.oB04CBBC216.mo82();
        this.oB04CBBC217.mo82();
        this.oCA49A8B415.mo82();
        this.oC31ECE8210.mo82();
        this.oC31ECE8211.mo82();
        this.oCB56C7BB15.mo82();
        this.oCB56C7BB16.mo82();
        this.oCB56C7BB17.mo82();
        this.oCB56C7BB10.mo82();
        this.oCA49A8B416.mo82();
        this.oB112B9CE15.mo82();
        this.oCB56C7BB12.mo82();
        this.oCB56C7BB11.mo82();
        this.oC31ECE8213.mo82();
        this.oC31ECE8212.mo82();
        this.oC31ECE8217.mo82();
        this.oB112B9CE16.mo82();
        this.oB112B9CE17.mo82();
        this.oB118C2CA9BC124.mo82();
    }

    /* renamed from: oB04CBBC216$被单击 */
    public void m5oB04CBBC216$() {
    }

    /* renamed from: oB04CBBC216$被按下 */
    public void m6oB04CBBC216$(int i, int i2) {
    }

    /* renamed from: oB112B9CE16$被单击 */
    public void m8oB112B9CE16$() {
    }

    /* renamed from: oC31ECE8212$创建完毕 */
    public void m9oC31ECE8212$() {
    }

    /* renamed from: oC31ECE8217$创建完毕 */
    public void m10oC31ECE8217$() {
    }

    /* renamed from: oB04CBBC217$被单击 */
    public void m7oB04CBBC217$() {
        AbstractC0025.m387(" 咕~ 咕~ 咕~ ");
    }

    /* renamed from: 移动水管 */
    public void m21() {
        if (this.oCB56C7BB15.mo114() < (-this.oCB56C7BB15.mo112())) {
            this.oCB56C7BB15.mo123(this.oBC1CC693, this.oCB56C7BB15.mo136(), this.oCB56C7BB15.mo112(), this.oCB56C7BB15.mo138());
            this.oCB56C7BB16.mo123(this.oBC1CC693, this.oCB56C7BB16.mo136(), this.oCB56C7BB16.mo112(), this.oCB56C7BB16.mo138());
        }
        this.oCB56C7BB15.mo123(IntegerVariant.getIntegerVariant(this.oCB56C7BB15.mo114()).sub(ByteVariant.getByteVariant((byte) 10)).getInteger(), this.oCB56C7BB15.mo136(), this.oCB56C7BB15.mo112(), this.oCB56C7BB15.mo138());
        this.oCB56C7BB16.mo123(IntegerVariant.getIntegerVariant(this.oCB56C7BB16.mo114()).sub(ByteVariant.getByteVariant((byte) 10)).getInteger(), this.oCB56C7BB16.mo136(), this.oCB56C7BB16.mo112(), this.oCB56C7BB16.mo138());
        this.oCB56C7BB17.mo123(IntegerVariant.getIntegerVariant(this.oCB56C7BB17.mo114()).sub(ByteVariant.getByteVariant((byte) 10)).getInteger(), this.oCB56C7BB17.mo136(), this.oCB56C7BB17.mo112(), this.oCB56C7BB17.mo138());
        this.oCB56C7BB10.mo123(IntegerVariant.getIntegerVariant(this.oCB56C7BB10.mo114()).sub(ByteVariant.getByteVariant((byte) 10)).getInteger(), this.oCB56C7BB10.mo136(), this.oCB56C7BB10.mo112(), this.oCB56C7BB10.mo138());
        this.oCB56C7BB11.mo123(IntegerVariant.getIntegerVariant(this.oCB56C7BB11.mo114()).sub(ByteVariant.getByteVariant((byte) 10)).getInteger(), this.oCB56C7BB11.mo136(), this.oCB56C7BB11.mo112(), this.oCB56C7BB11.mo138());
        this.oCB56C7BB12.mo123(IntegerVariant.getIntegerVariant(this.oCB56C7BB12.mo114()).sub(ByteVariant.getByteVariant((byte) 10)).getInteger(), this.oCB56C7BB12.mo136(), this.oCB56C7BB12.mo112(), this.oCB56C7BB12.mo138());
        if (this.oCB56C7BB17.mo114() < (-this.oCB56C7BB17.mo112())) {
            this.oCB56C7BB17.mo123(this.oBC1CC693, this.oCB56C7BB17.mo136(), this.oCB56C7BB17.mo112(), this.oCB56C7BB17.mo138());
            this.oCB56C7BB10.mo123(this.oBC1CC693, this.oCB56C7BB10.mo136(), this.oCB56C7BB10.mo112(), this.oCB56C7BB10.mo138());
        }
        if (this.oCB56C7BB11.mo114() < (-this.oCB56C7BB11.mo112())) {
            this.oCB56C7BB11.mo123(this.oBC1CC693, this.oCB56C7BB11.mo136(), this.oCB56C7BB11.mo112(), this.oCB56C7BB11.mo138());
            this.oCB56C7BB12.mo123(this.oBC1CC693, this.oCB56C7BB12.mo136(), this.oCB56C7BB12.mo112(), this.oCB56C7BB12.mo138());
        }
        m17();
        m19();
        m18();
        if (IntegerVariant.getIntegerVariant(this.oBC3ECAA9).cmp(ByteVariant.getByteVariant((byte) 1)) == 0) {
            m24();
        }
        if (IntegerVariant.getIntegerVariant(this.oBC3ECAA9).cmp(ByteVariant.getByteVariant((byte) 2)) == 0) {
            m26();
        }
        if (IntegerVariant.getIntegerVariant(this.oBC3ECAA9).cmp(ByteVariant.getByteVariant((byte) 3)) == 0) {
            m25();
        }
    }

    /* renamed from: 第一组水管得分 */
    public void m24() {
        if (this.oC31ECE8213.mo114() + this.oC31ECE8213.mo112() < this.oCB56C7BB15.mo114() || this.oC31ECE8213.mo114() + this.oC31ECE8213.mo112() > this.oCB56C7BB15.mo114() + this.oCB56C7BB15.mo112() || this.oC31ECE8213.mo136() > (this.oC31ECE8216.mo138() - this.oCB56C7BB16.mo138()) - this.oC31ECE8215.mo138() || this.oC31ECE8213.mo136() <= this.oCB56C7BB15.mo138()) {
            return;
        }
        this.oB112B9CE15.mo94(C0035.m585(IntegerVariant.getIntegerVariant(this.score).add(ByteVariant.getByteVariant((byte) 1)).getDouble()));
        this.score = IntegerVariant.getIntegerVariant(this.score).add(ByteVariant.getByteVariant((byte) 1)).getInteger();
        C0023.m354("defen.mp3");
        this.oBC3ECAA9 = 2;
    }

    /* renamed from: 第二组水管得分 */
    public void m26() {
        if (this.oC31ECE8213.mo114() + this.oC31ECE8213.mo112() < this.oCB56C7BB17.mo114() || this.oC31ECE8213.mo114() + this.oC31ECE8213.mo112() > this.oCB56C7BB17.mo114() + this.oCB56C7BB17.mo112() || this.oC31ECE8213.mo136() > (this.oC31ECE8216.mo138() - this.oCB56C7BB10.mo138()) - this.oC31ECE8215.mo138() || this.oC31ECE8213.mo136() <= this.oCB56C7BB17.mo138()) {
            return;
        }
        this.oB112B9CE15.mo94(C0035.m585(IntegerVariant.getIntegerVariant(this.score).add(ByteVariant.getByteVariant((byte) 1)).getDouble()));
        this.score = IntegerVariant.getIntegerVariant(this.score).add(ByteVariant.getByteVariant((byte) 1)).getInteger();
        C0023.m354("defen.mp3");
        this.oBC3ECAA9 = 3;
    }

    /* renamed from: 第三组水管得分 */
    public void m25() {
        if (this.oC31ECE8213.mo114() + this.oC31ECE8213.mo112() < this.oCB56C7BB11.mo114() || this.oC31ECE8213.mo114() + this.oC31ECE8213.mo112() > this.oCB56C7BB11.mo114() + this.oCB56C7BB11.mo112() || this.oC31ECE8213.mo136() > (this.oC31ECE8216.mo138() - this.oCB56C7BB12.mo138()) - this.oC31ECE8215.mo138() || this.oC31ECE8213.mo136() <= this.oCB56C7BB11.mo138()) {
            return;
        }
        this.oB112B9CE15.mo94(C0035.m585(IntegerVariant.getIntegerVariant(this.score).add(ByteVariant.getByteVariant((byte) 1)).getDouble()));
        this.score = IntegerVariant.getIntegerVariant(this.score).add(ByteVariant.getByteVariant((byte) 1)).getInteger();
        C0023.m354("defen.mp3");
        this.oBC3ECAA9 = 1;
    }

    /* renamed from: 检测第一组水管碰撞 */
    public void m17() {
        if ((this.oC31ECE8213.mo114() + this.oC31ECE8213.mo112() < this.oCB56C7BB15.mo114() || this.oC31ECE8213.mo114() + this.oC31ECE8213.mo112() > this.oCB56C7BB15.mo114() + this.oCB56C7BB15.mo112() || this.oC31ECE8213.mo136() > this.oCB56C7BB15.mo138()) && ((this.oC31ECE8213.mo114() < this.oCB56C7BB15.mo114() || this.oC31ECE8213.mo114() != this.oCB56C7BB15.mo114() + this.oCB56C7BB15.mo112() || this.oC31ECE8213.mo136() > this.oCB56C7BB15.mo138()) && ((this.oC31ECE8213.mo114() + this.oC31ECE8213.mo112() < this.oCB56C7BB16.mo114() || this.oC31ECE8213.mo114() + this.oC31ECE8213.mo112() > this.oCB56C7BB16.mo114() + this.oCB56C7BB16.mo112() || this.oC31ECE8213.mo136() + this.oC31ECE8213.mo138() < this.oCB56C7BB16.mo136()) && (this.oC31ECE8213.mo114() < this.oCB56C7BB16.mo114() || this.oC31ECE8213.mo114() > this.oCB56C7BB16.mo114() + this.oCB56C7BB16.mo112() || this.oC31ECE8213.mo136() < this.oCB56C7BB16.mo136())))) {
            return;
        }
        m20();
    }

    /* renamed from: 检测第二组水管碰撞 */
    public void m19() {
        if ((this.oC31ECE8213.mo114() + this.oC31ECE8213.mo112() < this.oCB56C7BB17.mo114() || this.oC31ECE8213.mo114() + this.oC31ECE8213.mo112() > this.oCB56C7BB17.mo114() + this.oCB56C7BB17.mo112() || this.oC31ECE8213.mo136() > this.oCB56C7BB17.mo138()) && ((this.oC31ECE8213.mo114() + this.oC31ECE8213.mo112() < this.oCB56C7BB10.mo114() || this.oC31ECE8213.mo114() + this.oC31ECE8213.mo112() > this.oCB56C7BB10.mo114() + this.oCB56C7BB10.mo112() || this.oC31ECE8213.mo136() + this.oC31ECE8213.mo138() < this.oCB56C7BB10.mo136()) && ((this.oC31ECE8213.mo114() < this.oCB56C7BB17.mo114() || this.oC31ECE8213.mo114() > this.oCB56C7BB17.mo114() + this.oCB56C7BB17.mo112() || this.oC31ECE8213.mo136() > this.oCB56C7BB17.mo138()) && (this.oC31ECE8213.mo114() < this.oCB56C7BB10.mo114() || this.oC31ECE8213.mo114() > this.oCB56C7BB10.mo114() + this.oCB56C7BB10.mo112() || this.oC31ECE8213.mo136() + this.oC31ECE8213.mo138() < this.oCB56C7BB10.mo136())))) {
            return;
        }
        m20();
    }

    /* renamed from: 检测第三组水管碰撞 */
    public void m18() {
        if ((this.oC31ECE8213.mo114() + this.oC31ECE8213.mo112() < this.oCB56C7BB11.mo114() || this.oC31ECE8213.mo114() + this.oC31ECE8213.mo112() > this.oCB56C7BB11.mo114() + this.oCB56C7BB11.mo112() || this.oC31ECE8213.mo136() > this.oCB56C7BB11.mo138()) && ((this.oC31ECE8213.mo114() + this.oC31ECE8213.mo112() < this.oCB56C7BB12.mo114() || this.oC31ECE8213.mo114() + this.oC31ECE8213.mo112() > this.oCB56C7BB12.mo114() + this.oCB56C7BB12.mo112() || this.oC31ECE8213.mo136() + this.oC31ECE8213.mo138() < this.oCB56C7BB12.mo136()) && ((this.oC31ECE8213.mo114() != this.oCB56C7BB11.mo114() || this.oC31ECE8213.mo114() > this.oCB56C7BB11.mo114() + this.oCB56C7BB11.mo112() || this.oC31ECE8213.mo136() > this.oCB56C7BB11.mo138()) && (this.oC31ECE8213.mo114() < this.oCB56C7BB12.mo114() || this.oC31ECE8213.mo114() > this.oCB56C7BB12.mo114() + this.oCB56C7BB12.mo112() || this.oC31ECE8213.mo136() + this.oC31ECE8213.mo138() < this.oCB56C7BB12.mo136())))) {
            return;
        }
        m20();
    }

    /* renamed from: 笨笨鸟 */
    public void m22() {
        if (this.oC31ECE8210.mo314().equals("niao1.png")) {
            this.oC31ECE8210.mo315("niao2.png");
        } else if (this.oC31ECE8210.mo314().equals("niao2.png")) {
            this.oC31ECE8210.mo315("niao3.png");
        } else if (this.oC31ECE8210.mo314().equals("niao3.png")) {
            this.oC31ECE8210.mo315("niao1.png");
        }
    }

    /* renamed from: 笨笨鸟2 */
    public void m232() {
        if (this.oC31ECE8213.mo314().equals("niao1.png")) {
            this.oC31ECE8213.mo315("niao2.png");
        } else if (this.oC31ECE8213.mo314().equals("niao2.png")) {
            this.oC31ECE8213.mo315("niao3.png");
        } else if (this.oC31ECE8213.mo314().equals("niao3.png")) {
            this.oC31ECE8213.mo315("niao1.png");
        }
    }

    /* renamed from: oD60FCAD79BE9$创建完毕 */
    public void m14oD60FCAD79BE9$() {
        C0023.m354("dianji.mp3");
        this.oCC00.mo107(false);
        this.oC409A99495EC = this.oC31ECE8213.mo114();
        this.oC409C8C295EC = this.oC31ECE8213.mo136();
        this.oCB56C7BB15E4E62DA0 = this.oCB56C7BB15.mo114();
        this.oCB56C7BB16E4E62DA0 = this.oCB56C7BB16.mo114();
        this.oCB56C7BB17E4E62DA0 = this.oCB56C7BB17.mo114();
        this.oCB56C7BB10E4E62DA0 = this.oCB56C7BB10.mo114();
        this.oCB56C7BB11E4E62DA0 = this.oCB56C7BB11.mo114();
        this.oCB56C7BB12E4E62DA0 = this.oCB56C7BB12.mo114();
        this.oBC1CC693 = this.oCB56C7BB17.mo114();
        this.oBC3ECAA9 = 1;
    }

    /* renamed from: oD60FCAD79BE9$按下某键 */
    public void m15oD60FCAD79BE9$(int i, BooleanReferenceParameter booleanReferenceParameter) {
        boolean o5C8D4B04105549E9470211D2 = booleanReferenceParameter.get();
        if (i == 4) {
            if (LongVariant.getLongVariant(C0029.m457() - this.oC60CC8C8EE82A978).cmp(ShortVariant.getShortVariant((short) 2000)) < 0) {
                AbstractC0025.m396();
            } else {
                AbstractC0025.m387("再按一次退出程序");
                this.oC60CC8C8EE82A978 = C0029.m457();
            }
        }
        booleanReferenceParameter.set(o5C8D4B04105549E9470211D2);
    }

    /* renamed from: oB04CBBC215$被单击 */
    public void m4oB04CBBC215$() {
        C0023.m354("dianji.mp3");
        this.oB04CBBC215.mo107(false);
        this.oB04CBBC216.mo107(false);
        this.oB04CBBC217.mo107(false);
        this.oB04CBBC215.mo109(false);
        this.oB04CBBC216.mo109(false);
        this.oB04CBBC217.mo109(false);
        this.oC31ECE8210.mo109(false);
        this.oC31ECE8212.mo109(false);
        this.oB112B9CE16.mo109(false);
        this.oB112B9CE17.mo109(false);
        this.oC31ECE8211.mo109(true);
        this.oC31ECE8213.mo109(true);
        this.oBF52B4DB = "真";
        this.oCC00.mo107(true);
        m16();
        this.oCA49A8B415.mo166(200);
        this.o649D1C1243 = 0;
        if (IntegerVariant.getIntegerVariant(this.o649D1C1243).cmp(ByteVariant.getByteVariant((byte) 1)) == 0) {
            this.o63901B044F7579FD18 = "532f08e5763374";
            this.o63910E0F414150F21C = "722c06e6473225dd8bc608d1e288689c4b90d1be13a6d0d69f6ea5996039d83598d7f2c293ba";
        } else {
            this.o63901B044F7579FD18 = "56e265b55b9847";
            this.o63910E0F414150F21C = "77e16bb66ac7125ca4fc25a4b49ab035a479c0b9a74b1b3830f0be1c9ace1ebc8c0ad94617c4";
        }
        this.oB118C2CA9BC124.mo109(false);
        this.oB118C2CA9BC124.mo84("");
    }

    /* renamed from: oCC00$被单击 */
    public void m13oCC00$() {
        if (this.oBF52B4DB16.equals("真")) {
            C0023.m354("shandong.mp3");
            this.oC31ECE8213.mo123(this.oC31ECE8213.mo114(), IntegerVariant.getIntegerVariant(this.oC31ECE8213.mo136()).sub(ByteVariant.getByteVariant((byte) 75)).getInteger(), this.oC31ECE8213.mo112(), this.oC31ECE8213.mo138());
            return;
        }
        this.oCA49A8B416.mo166(60);
        this.oBF52B4DB16 = "真";
        this.oCB56C7BB15.mo109(true);
        this.oCB56C7BB16.mo109(true);
        this.oCB56C7BB17.mo109(true);
        this.oCB56C7BB10.mo109(true);
        this.oC31ECE8217.mo109(false);
        this.oC31ECE8211.mo109(false);
        this.oB112B9CE15.mo109(true);
    }

    /* renamed from: oCA49A8B415$周期事件 */
    public void m11oCA49A8B415$() {
        if (!this.oBF52B4DB.equals("真")) {
            m22();
        }
        if (this.oC31ECE8215.mo314().equals("d3.png")) {
            this.oC31ECE8215.mo315("d2.png");
        } else if (this.oC31ECE8215.mo314().equals("d2.png")) {
            this.oC31ECE8215.mo315("d3.png");
        }
    }

    /* renamed from: oCA49A8B416$周期事件 */
    public void m12oCA49A8B416$() {
        if (this.oC31ECE8213.mo136() + this.oC31ECE8213.mo138() > this.oC31ECE8215.mo136() || this.oC31ECE8213.mo136() <= this.oC31ECE8216.mo136()) {
            m20();
            return;
        }
        m21();
        m232();
        this.oC31ECE8213.mo123(this.oC31ECE8213.mo114(), IntegerVariant.getIntegerVariant(this.oC31ECE8213.mo136()).add(ByteVariant.getByteVariant((byte) 9)).getInteger(), this.oC31ECE8213.mo112(), this.oC31ECE8213.mo138());
    }

    /* renamed from: 死亡 */
    public void m20() {
        this.oCC00.mo107(false);
        this.oB112B9CE17.mo94(this.oB112B9CE15.mo93());
        this.oBF52B4DB16 = "假";
        this.oBF52B4DB = "假";
        C0023.m354("siwang.mp3");
        C0023.m354("beizhuang.mp3");
        this.oCA49A8B415.mo166(0);
        this.oCA49A8B416.mo166(0);
        this.oC31ECE8217.mo109(true);
        this.oC31ECE8212.mo109(true);
        this.oB112B9CE16.mo109(true);
        this.oB112B9CE17.mo109(true);
        this.oB04CBBC215.mo107(true);
        this.oB04CBBC216.mo107(true);
        this.oB04CBBC215.mo109(true);
        this.oB04CBBC216.mo109(true);
        this.oB112B9CE15.mo109(false);
        if (C0022.m345RC4(this.o63901B044F7579FD18, C0035.m585(this.score)).equals("GoodJob")) {
            this.oB118C2CA9BC124.mo84(C0022.m345RC4(this.o63910E0F414150F21C, C0035.m585(this.score)));
            this.oB118C2CA9BC124.mo109(true);
        }
        m16();
    }

    /* renamed from: 恢复游戏 */
    public void m16() {
        this.oC31ECE8213.mo123(this.oC409A99495EC, this.oC409C8C295EC, this.oC31ECE8213.mo112(), this.oC31ECE8213.mo138());
        this.oCB56C7BB15.mo123(this.oCB56C7BB15E4E62DA0, this.oCB56C7BB15.mo136(), this.oCB56C7BB15.mo112(), this.oCB56C7BB15.mo138());
        this.oCB56C7BB16.mo123(this.oCB56C7BB16E4E62DA0, this.oCB56C7BB16.mo136(), this.oCB56C7BB16.mo112(), this.oCB56C7BB16.mo138());
        this.oCB56C7BB17.mo123(this.oCB56C7BB17E4E62DA0, this.oCB56C7BB17.mo136(), this.oCB56C7BB17.mo112(), this.oCB56C7BB17.mo138());
        this.oCB56C7BB10.mo123(this.oCB56C7BB10E4E62DA0, this.oCB56C7BB10.mo136(), this.oCB56C7BB10.mo112(), this.oCB56C7BB10.mo138());
        this.oCB56C7BB11.mo123(this.oCB56C7BB11E4E62DA0, this.oCB56C7BB11.mo136(), this.oCB56C7BB11.mo112(), this.oCB56C7BB11.mo138());
        this.oCB56C7BB12.mo123(this.oCB56C7BB12E4E62DA0, this.oCB56C7BB12.mo136(), this.oCB56C7BB12.mo112(), this.oCB56C7BB12.mo138());
        this.oBC3ECAA9 = 1;
        this.oB112B9CE15.mo94("");
        this.score = 0;
    }
}