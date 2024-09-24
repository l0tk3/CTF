package com.e4a.runtime.variants;

import com.e4a.runtime.helpers.ConvHelpers;
import com.e4a.runtime.helpers.ExprHelpers;

/* loaded from: classes.dex */
public final class IntegerVariant extends Variant {
    private int o7699121241;

    public static final IntegerVariant getIntegerVariant(int value) {
        return new IntegerVariant(value);
    }

    private IntegerVariant(int value) {
        super((byte) 4);
        this.o7699121241 = value;
    }

    @Override // com.e4a.runtime.variants.Variant
    public boolean getBoolean() {
        return ConvHelpers.integer2boolean(this.o7699121241);
    }

    @Override // com.e4a.runtime.variants.Variant
    public byte getByte() {
        return ConvHelpers.integer2byte(this.o7699121241);
    }

    @Override // com.e4a.runtime.variants.Variant
    public short getShort() {
        return ConvHelpers.integer2short(this.o7699121241);
    }

    @Override // com.e4a.runtime.variants.Variant
    public int getInteger() {
        return this.o7699121241;
    }

    @Override // com.e4a.runtime.variants.Variant
    public long getLong() {
        return this.o7699121241;
    }

    @Override // com.e4a.runtime.variants.Variant
    public float getSingle() {
        return this.o7699121241;
    }

    @Override // com.e4a.runtime.variants.Variant
    public double getDouble() {
        return this.o7699121241;
    }

    @Override // com.e4a.runtime.variants.Variant
    public String getString() {
        return Integer.toString(this.o7699121241);
    }

    @Override // com.e4a.runtime.variants.Variant
    public Variant add(Variant rightOp) {
        switch (rightOp.getKind()) {
            case 1:
            case 2:
            case 3:
            case 4:
                return getIntegerVariant(getInteger() + rightOp.getInteger());
            default:
                return rightOp.add(this);
        }
    }

    @Override // com.e4a.runtime.variants.Variant
    public Variant sub(Variant rightOp) {
        switch (rightOp.getKind()) {
            case 1:
            case 2:
            case 3:
            case 4:
                return getIntegerVariant(getInteger() - rightOp.getInteger());
            case 5:
                return LongVariant.getLongVariant(getLong() - rightOp.getLong());
            case 6:
                return SingleVariant.getSingleVariant(getSingle() - rightOp.getSingle());
            case 7:
            case 8:
                return DoubleVariant.getDoubleVariant(getDouble() - rightOp.getDouble());
            default:
                return super.sub(rightOp);
        }
    }

    @Override // com.e4a.runtime.variants.Variant
    public Variant mul(Variant rightOp) {
        switch (rightOp.getKind()) {
            case 1:
            case 2:
            case 3:
            case 4:
                return getIntegerVariant(getInteger() * rightOp.getInteger());
            default:
                return rightOp.mul(this);
        }
    }

    @Override // com.e4a.runtime.variants.Variant
    public Variant div(Variant rightOp) {
        return DoubleVariant.getDoubleVariant(getDouble()).div(rightOp);
    }

    @Override // com.e4a.runtime.variants.Variant
    public Variant idiv(Variant rightOp) {
        switch (rightOp.getKind()) {
            case 1:
            case 2:
            case 3:
            case 4:
                return getIntegerVariant(getInteger() / rightOp.getInteger());
            case 5:
                return LongVariant.getLongVariant(getLong() / rightOp.getLong());
            case 6:
                return SingleVariant.getSingleVariant(ExprHelpers.idiv(getSingle(), rightOp.getSingle()));
            case 7:
            case 8:
                return DoubleVariant.getDoubleVariant(ExprHelpers.idiv(getDouble(), rightOp.getDouble()));
            default:
                return super.idiv(rightOp);
        }
    }

    @Override // com.e4a.runtime.variants.Variant
    public Variant mod(Variant rightOp) {
        switch (rightOp.getKind()) {
            case 1:
            case 2:
            case 3:
            case 4:
                return getIntegerVariant(getInteger() % rightOp.getInteger());
            case 5:
                return LongVariant.getLongVariant(getLong() % rightOp.getLong());
            case 6:
                return SingleVariant.getSingleVariant(getSingle() % rightOp.getSingle());
            case 7:
            case 8:
                return DoubleVariant.getDoubleVariant(getDouble() % rightOp.getDouble());
            default:
                return super.mod(rightOp);
        }
    }

    @Override // com.e4a.runtime.variants.Variant
    public Variant pow(Variant rightOp) {
        return DoubleVariant.getDoubleVariant(getDouble()).pow(rightOp);
    }

    @Override // com.e4a.runtime.variants.Variant
    public Variant neg() {
        return getIntegerVariant(-this.o7699121241);
    }

    @Override // com.e4a.runtime.variants.Variant
    public Variant shl(Variant rightOp) {
        switch (rightOp.getKind()) {
            case 1:
            case 2:
            case 3:
            case 4:
                return getIntegerVariant(getInteger() << rightOp.getInteger());
            case 5:
            case 8:
                return LongVariant.getLongVariant(getLong() << ((int) rightOp.getLong()));
            case 6:
            case 7:
            default:
                return super.and(rightOp);
        }
    }

    @Override // com.e4a.runtime.variants.Variant
    public Variant shr(Variant rightOp) {
        switch (rightOp.getKind()) {
            case 1:
            case 2:
            case 3:
            case 4:
                return getIntegerVariant(getInteger() >> rightOp.getInteger());
            case 5:
            case 8:
                return LongVariant.getLongVariant(getLong() >> ((int) rightOp.getLong()));
            case 6:
            case 7:
            default:
                return super.and(rightOp);
        }
    }

    @Override // com.e4a.runtime.variants.Variant
    public int cmp(Variant rightOp) {
        switch (rightOp.getKind()) {
            case 1:
            case 2:
            case 3:
            case 4:
                return this.o7699121241 - rightOp.getInteger();
            default:
                return -rightOp.cmp(this);
        }
    }

    @Override // com.e4a.runtime.variants.Variant
    public Variant not() {
        return getIntegerVariant(this.o7699121241 ^ (-1));
    }

    @Override // com.e4a.runtime.variants.Variant
    public Variant and(Variant rightOp) {
        switch (rightOp.getKind()) {
            case 1:
            case 2:
            case 3:
            case 4:
                return getIntegerVariant(getInteger() & rightOp.getInteger());
            case 5:
            case 8:
                return LongVariant.getLongVariant(getLong() & rightOp.getLong());
            case 6:
            case 7:
            default:
                return super.and(rightOp);
        }
    }

    @Override // com.e4a.runtime.variants.Variant
    public Variant or(Variant rightOp) {
        switch (rightOp.getKind()) {
            case 1:
            case 2:
            case 3:
            case 4:
                return getIntegerVariant(getInteger() | rightOp.getInteger());
            case 5:
            case 8:
                return LongVariant.getLongVariant(getLong() | rightOp.getLong());
            case 6:
            case 7:
            default:
                return super.or(rightOp);
        }
    }

    @Override // com.e4a.runtime.variants.Variant
    public Variant xor(Variant rightOp) {
        switch (rightOp.getKind()) {
            case 1:
            case 2:
            case 3:
            case 4:
                return getIntegerVariant(getInteger() ^ rightOp.getInteger());
            case 5:
            case 8:
                return LongVariant.getLongVariant(getLong() ^ rightOp.getLong());
            case 6:
            case 7:
            default:
                return super.xor(rightOp);
        }
    }
}