package ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oOOo0OOOOoooOoOO0oo00oOOO0ooOoO0o.ooOooOOo0OOOOoooOoOO0oo00oOOO0oo0oo0oo0oOo0OOOOO0O0oOO0oOOoO0oOOoO0OOooOOo00ooooOOOoOoo0oo0;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oOOo0OOooO0oOo0O0oo0OoOOoO0oOoO0o.ooOoo00o00oO0oooOooO0oooOoOOOo0o0oOo0oO0O0oOOOo0Ooo0O0ooOOooooO0O0oOOoo00o0OOo0oOOO0oooOoOOOoOOOoOooo0OOoOOooooOo0OO0ooOOo0Oooo;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.oOo0oo0oooOOOOo0OOOo0OooO;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.oo0ooOOo0OOo0oooo0oO0oOoO.ooOOoO0o00ooooooOoOoooO0oo0oooooOoo0oo0oOo0OO0O0o;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooOooo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOo0oOOOoOoOO0Oo0oO0o00oOO;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOoOo0o00o00O0oo0oO0oo0OoOOooooOoo0o;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOooo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOo0ooOooOoOOoOOoo0Oo0OOOooOOOO0ooOo0OOooO0oo0Oo0OOoOOoo;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.relatedio;

/* compiled from: ViewComponent.java */
/* loaded from: classes.dex */
public abstract class ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo extends ooOooo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOo0oOOOoOoOO0Oo0oO0o00oOO implements ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo, View.OnFocusChangeListener {
    private int o62991D0C43417AE9115361D9955133;
    private int o638D0C157C;
    private int o638D0C157D;
    private int o63971212495D;
    private int o689D17004C47;
    private int o6C990D137C;
    private int o6C990D137D;
    private int o6C9D1813;
    private int o729709;
    private int o74970E;
    private final View o76911B10;
    private int o77911A134C;
    private int oCC20AEC0F2EBAD28BB94E80B;
    private int oCC20AEC0F2EBAD28CBF9E84B;

    protected abstract View createView();

    public View getView() {
        return this.o76911B10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo(ooOooo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOo0ooOooOoOOoOOoo0Oo0OOOooOOOO0ooOo0OOooO0oo0Oo0OOoOOoo container) {
        super(container);
        this.oCC20AEC0F2EBAD28BB94E80B = -1;
        this.oCC20AEC0F2EBAD28CBF9E84B = -1;
        this.o63971212495D = -1;
        this.o729709 = -1;
        this.o76911B10 = createView();
        if (this.o76911B10 != null) {
            ooO0o0oo00OOoO0oOooooOoOooOoOoOoOOOOOoO0oOOOO0oo0oooooooOOooOoOoOo0Oo0ooOOoOOoooOOoooooOOO0OoOOooo0OOo0Oooooooo0oOoO0oOO0o0Oooo().addComponent(this);
            this.o76911B10.setOnFocusChangeListener(this);
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View previouslyFocused, boolean gainFocus) {
        if (gainFocus) {
            oOoOOoOO0oo00Oo0OoOOoooOoo00o00o0OOooOooO0oo0oOO0();
        } else {
            oOo0OoooOOOO0OoOoO0Oo0ooOo00o00o0OOooOooO0oo0oOO0();
        }
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOoOOoOO0oo00Oo0OoOOoooOoo00o00o0OOooOooO0oo0oOO0() {
        ooOooOOo0OOOOoooOoOO0oo00oOOO0oo0oo0oo0oOo0OOOOO0O0oOO0oOOoO0oOOoO0OOooOOo00ooooOOOoOoo0oo0.ooO0oOoo00oooO0oOOooooo0ooOooOOoOoo0oo0ooO0OO0oOooo0OoooOoooooOoo0oOOoo0Oo0OOOo(this, "获得焦点", new Object[0]);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOo0OoooOOOO0OoOoO0Oo0ooOo00o00o0OOooOooO0oo0oOO0() {
        ooOooOOo0OOOOoooOoOO0oo00oOOO0oo0oo0oo0oOo0OOOOO0O0oOO0oOOoO0oOOoO0OOooOOo00ooooOOOoOoo0oo0.ooO0oOoo00oooO0oOOooooo0ooOooOOoOoo0oo0ooO0OO0oOooo0OoooOoooooOoo0oOOoo0Oo0OOOo(this, "失去焦点", new Object[0]);
    }

    public int oOo0oooooOo0O() {
        return this.o63971212495D;
    }

    public void oOo0oooooOo0O(int newColumn) {
        if (this.o63971212495D != -1) {
            throw new ooOoo00o00oO0oooOooO0oooOoOOOo0o0oOo0oO0O0oOOOo0Ooo0O0ooOOooooO0O0oOOoo00o0OOo0oOOO0oooOoOOOoOOOoOooo0OOoOOooooOo0OO0ooOOo0Oooo();
        }
        this.o63971212495D = newColumn;
        if (this.o729709 != -1) {
            ooOoOo0o00o00O0oo0oO0oo0OoOOooooOoo0o o6C9907085147 = ooO0o0oo00OOoO0oOooooOoOooOoOoOoOOOOOoO0oOOOO0oo0oooooooOOooOoOoOo0Oo0ooOOoOOoooOOoooooOOO0OoOOooo0OOo0Oooooooo0oOoO0oOO0o0Oooo().getLayout();
            if (o6C9907085147 instanceof oOoOoooooooOOOo0oO0o00oO0o00oO0o0OOO0OooOoOoOoOoooo0oO0oOOOoooOOooOOOoOoo) {
                ((oOoOoooooooOOOo0oO0o00oO0o00oO0o0OOO0OooOoOoOoOoooo0oO0oOOOoooOOooOOOoOoo) o6C9907085147).oo0oO0oo00oOooooOO0O0ooOooOooooo0oO0oo0oOooOO0oooO0oOO0oOOo0OoOoOo0OOooo0o00o0ooOoOoo(this);
            }
        }
    }

    public int oOOoO0oooOo0O() {
        return this.o729709;
    }

    public void oOOoO0oooOo0O(int newRow) {
        if (this.o729709 != -1) {
            throw new ooOoo00o00oO0oooOooO0oooOoOOOo0o0oOo0oO0O0oOOOo0Ooo0O0ooOOooooO0O0oOOoo00o0OOo0oOOO0oooOoOOOoOOOoOooo0OOoOOooooOo0OO0ooOOo0Oooo();
        }
        this.o729709 = newRow;
        if (this.o63971212495D != -1) {
            ooOoOo0o00o00O0oo0oO0oo0OoOOooooOoo0o o6C9907085147 = ooO0o0oo00OOoO0oOooooOoOooOoOoOoOOOOOoO0oOOOO0oo0oooooooOOooOoOoOo0Oo0ooOOoOOoooOOoooooOOO0OoOOooo0OOo0Oooooooo0oOoO0oOO0o0Oooo().getLayout();
            if (o6C9907085147 instanceof oOoOoooooooOOOo0oO0o00oO0o00oO0o0OOO0OooOoOoOoOoooo0oO0oOOOoooOOooOOOoOoo) {
                ((oOoOoooooooOOOo0oO0o00oO0o00oO0o0OOO0OooOoOoOoOoooo0oO0oOOOoooOOooOOOoOoo) o6C9907085147).oo0oO0oo00oOooooOO0O0ooOooOooooo0oO0oo0oOooOO0oooO0oOO0oOOo0OoOoOo0OOooo0o00o0ooOoOoo(this);
            }
        }
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public int oOoOOO0ooooOOOo0o0OOooOO0() {
        return this.o77911A134C;
    }

    public void oOoOOO0ooooOOOo0o0OOooOO0(int newWidth) {
        this.o77911A134C = newWidth;
        ooOoOo0o00o00O0oo0oO0oo0OoOOooooOoo0o o6C9907085147 = ooO0o0oo00OOoO0oOooooOoOooOoOoOoOOOOOoO0oOOOO0oo0oooooooOOooOoOoOo0Oo0ooOOoOOoooOOoooooOOO0OoOOooo0OOo0Oooooooo0oOoO0oOO0o0Oooo().getLayout();
        if (o6C9907085147 instanceof oOoOOOOO0oO0oOo0o0OOoOoo0o00oO0o0OOO0OooOoOoOoOoooo0oO0oOOOoooOOooOOOoOoo) {
            ((oOoOOOOO0oO0oOo0o0OOoOoo0o00oO0o0OOO0OooOoOoOoOoooo0oO0oOOOoooOOooOOOoOoo) o6C9907085147).oo0oO0oo00oOooooOO0O0ooOooOooooo0oO0oo0oOooOO0oooO0oOO0oOOo0OoOoOo0OOooo0o00o0ooOoOoo(this);
        } else {
            ooOOoO0o00ooooooOoOoooO0oo0oooooOoo0oo0oOo0OO0O0o.setWidth(getView(), newWidth);
        }
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public int oOoOo0OooOo0oOo0o0OOooOO0() {
        return this.o689D17004C47;
    }

    public void oOoOo0OooOo0oOo0o0OOooOO0(int newHeight) {
        this.o689D17004C47 = newHeight;
        ooOoOo0o00o00O0oo0oO0oo0OoOOooooOoo0o o6C9907085147 = ooO0o0oo00OOoO0oOooooOoOooOoOoOoOOOOOoO0oOOOO0oo0oooooooOOooOoOoOo0Oo0ooOOoOOoooOOoooooOOO0OoOOooo0OOo0Oooooooo0oOoO0oOO0o0Oooo().getLayout();
        if (o6C9907085147 instanceof oOoOOOOO0oO0oOo0o0OOoOoo0o00oO0o0OOO0OooOoOoOoOoooo0oO0oOOOoooOOooOOOoOoo) {
            ((oOoOOOOO0oO0oOo0o0OOoOoo0o00oO0o0OOO0OooOoOoOoOoooo0oO0oOOOoooOOooOOOoOoo) o6C9907085147).oo0oO0oo00oOooooOO0O0ooOooOooooo0oO0oo0oOooOO0oooO0oOO0oOOo0OoOoOo0OOooo0o00o0ooOoOoo(this);
        } else {
            ooOOoO0o00ooooooOoOoooO0oo0oooooOoo0oo0oOo0OO0O0o.setHeight(getView(), newHeight);
        }
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public int oOOoo0oO0oOoOOo0OO0OoOo0O() {
        return this.o6C9D1813;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOOoo0oO0oOoOOo0OO0OoOo0O(int newLeft) {
        this.o6C9D1813 = newLeft;
        ooOoOo0o00o00O0oo0oO0oo0OoOOooooOoo0o o6C9907085147 = ooO0o0oo00OOoO0oOooooOoOooOoOoOoOOOOOoO0oOOOO0oo0oooooooOOooOoOoOo0Oo0ooOOoOOoooOOoooooOOO0OoOOooo0OOo0Oooooooo0oOoO0oOO0o0Oooo().getLayout();
        if (o6C9907085147 instanceof oOoOOOOO0oO0oOo0o0OOoOoo0o00oO0o0OOO0OooOoOoOoOoooo0oO0oOOOoooOOooOOOoOoo) {
            ((oOoOOOOO0oO0oOo0o0OOoOoo0o00oO0o0OOO0OooOoOoOoOoooo0oO0oOOOoooOOooOOOoOoo) o6C9907085147).oo0oO0oo00oOooooOO0O0ooOooOooooo0oO0oo0oOooOO0oooO0oOO0oOOo0OoOoOo0OOooo0o00o0ooOoOoo(this);
        }
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public int oOoOoO0oOOOOoOo0OO0OoOo0O() {
        return this.o74970E;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOoOoO0oOOOOoOo0OO0OoOo0O(int newTop) {
        this.o74970E = newTop;
        ooOoOo0o00o00O0oo0oO0oo0OoOOooooOoo0o o6C9907085147 = ooO0o0oo00OOoO0oOooooOoOooOoOoOoOOOOOoO0oOOOO0oo0oooooooOOooOoOoOo0Oo0ooOOoOOoooOOoooooOOO0OoOOooo0OOo0Oooooooo0oOoO0oOO0o0Oooo().getLayout();
        if (o6C9907085147 instanceof oOoOOOOO0oO0oOo0o0OOoOoo0o00oO0o0OOO0OooOoOoOoOoooo0oO0oOOOoooOOooOOOoOoo) {
            ((oOoOOOOO0oO0oOo0o0OOoOoo0o00oO0o0OOO0OooOoOoOoOoooo0oO0oOOOoooOOooOOOoOoo) o6C9907085147).oo0oO0oo00oOooooOO0O0ooOooOooooo0oO0oo0oOooOO0oooO0oOO0oOOo0OoOoOo0OOooo0o00o0ooOoOoo(this);
        }
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOOoooOoo0OOOOo0o0OOo0o0O(int newLeft, int newTop, int newWidth, int newHeight) {
        this.o6C9D1813 = newLeft;
        this.o74970E = newTop;
        this.o77911A134C = newWidth;
        this.o689D17004C47 = newHeight;
        ooOoOo0o00o00O0oo0oO0oo0OoOOooooOoo0o o6C9907085147 = ooO0o0oo00OOoO0oOooooOoOooOoOoOoOOOOOoO0oOOOO0oo0oooooooOOooOoOoOo0Oo0ooOOoOOoooOOoooooOOO0OoOOooo0OOo0Oooooooo0oOoO0oOO0o0Oooo().getLayout();
        if (o6C9907085147 instanceof oOoOOOOO0oO0oOo0o0OOoOoo0o00oO0o0OOO0OooOoOoOoOoooo0oO0oOOOoooOOooOOOoOoo) {
            ((oOoOOOOO0oO0oOo0o0OOoOoo0o00oO0o0OOO0OooOoOoOoOoooo0oO0oOOOoooOOooOOOoOoo) o6C9907085147).oo0oO0oo00oOooooOO0O0ooOooOooooo0oO0oo0oOooOO0oooO0oOO0oOOo0OoOoOo0OOooo0o00o0ooOoOoo(this);
        }
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOoOoOOoOooOOOo0o0OOo0ooOo00oO0OOoO0o() {
        View o76 = getView();
        o76.bringToFront();
        if (o76.getVisibility() == 0) {
            o76.setVisibility(4);
            o76.setVisibility(0);
            return;
        }
        o76.setVisibility(0);
        o76.setVisibility(4);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public int oOo0o0OoOOo00Oo0oooo0OOooo00ooOOO0OoO() {
        View o76911B10 = getView();
        int o77911A134C6065F91C = View.MeasureSpec.makeMeasureSpec(0, 0);
        int o689D17004C4746EC1A54 = View.MeasureSpec.makeMeasureSpec(0, 0);
        o76911B10.measure(o77911A134C6065F91C, o689D17004C4746EC1A54);
        int o77911A134C = o76911B10.getMeasuredWidth();
        return o77911A134C;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public int oOo0o0OoOOo00Oo0oO0OoOo0Oo00ooOOO0OoO() {
        View o76911B10 = getView();
        int o77911A134C6065F91C = View.MeasureSpec.makeMeasureSpec(0, 0);
        int o689D17004C4746EC1A54 = View.MeasureSpec.makeMeasureSpec(0, 0);
        o76911B10.measure(o77911A134C6065F91C, o689D17004C4746EC1A54);
        int o689D17004C47 = o76911B10.getMeasuredHeight();
        return o689D17004C47;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOo0OoOoOOOooOooOOOOoooOO() {
        getView().invalidate();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public View oOo0OO0O0oooOOo0oOOOoOOOO() {
        View o76911B10 = getView();
        if (o76911B10.getParent() != null) {
            ViewGroup o678A111254 = (ViewGroup) getView().getParent();
            o678A111254.removeView(o76911B10);
        }
        return o76911B10;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOoOOO0oOOooOOoOo0Oo00oo0OOOo0OOOOOoOOo0oOOoo0OoO(int type, int time, boolean keep) {
        switch (type) {
            case 1:
                AnimationSet o72970A0650564AFD115E4FD78D572EA0B2BB3F1E = new AnimationSet(true);
                RotateAnimation o72970A0650564AFD115E4FD78D572EA0 = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                o72970A0650564AFD115E4FD78D572EA0B2BB3F1E.addAnimation(o72970A0650564AFD115E4FD78D572EA0);
                o72970A0650564AFD115E4FD78D572EA0.setDuration(time);
                o72970A0650564AFD115E4FD78D572EA0B2BB3F1E.setFillAfter(keep);
                if (this.oCC20AEC0F2EBAD28BB94E80B > -1) {
                    o72970A0650564AFD115E4FD78D572EA0.setRepeatMode(this.oCC20AEC0F2EBAD28BB94E80B);
                }
                if (this.oCC20AEC0F2EBAD28CBF9E84B > -1) {
                    o72970A0650564AFD115E4FD78D572EA0.setRepeatCount(this.oCC20AEC0F2EBAD28CBF9E84B);
                }
                o72970A0650564AFD115E4FD78D572EA0.setAnimationListener(new Animation.AnimationListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo.this.oOoOOO0oOOooOOoOo0Oo00oo0OOOo0OOOOOoOOo0oOOoo0OoOOoOooOOOoOOoo00oo0o0oo00();
                    }
                });
                getView().startAnimation(o72970A0650564AFD115E4FD78D572EA0B2BB3F1E);
                return;
            case 2:
                AnimationSet o739B1F0B416C74F2165A43C290512F919EAD2E = new AnimationSet(true);
                ScaleAnimation o739B1F0B416C74F2165A43C290512F = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                o739B1F0B416C74F2165A43C290512F919EAD2E.addAnimation(o739B1F0B416C74F2165A43C290512F);
                o739B1F0B416C74F2165A43C290512F.setDuration(time);
                o739B1F0B416C74F2165A43C290512F919EAD2E.setFillAfter(keep);
                if (this.oCC20AEC0F2EBAD28BB94E80B > -1) {
                    o739B1F0B416C74F2165A43C290512F.setRepeatMode(this.oCC20AEC0F2EBAD28BB94E80B);
                }
                if (this.oCC20AEC0F2EBAD28CBF9E84B > -1) {
                    o739B1F0B416C74F2165A43C290512F.setRepeatCount(this.oCC20AEC0F2EBAD28CBF9E84B);
                }
                o739B1F0B416C74F2165A43C290512F.setAnimationListener(new Animation.AnimationListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo.2
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo.this.oOoOOO0oOOooOOoOo0Oo00oo0OOOo0OOOOOoOOo0oOOoo0OoOOoOooOOOoOOoo00oo0o0oo00();
                    }
                });
                getView().startAnimation(o739B1F0B416C74F2165A43C290512F919EAD2E);
                return;
            case 3:
                AnimationSet o61940E0F456C74F2165A43C290512F919EAD2E = new AnimationSet(true);
                AlphaAnimation o61940E0F456C74F2165A43C290512F = new AlphaAnimation(1.0f, 0.0f);
                o61940E0F456C74F2165A43C290512F919EAD2E.addAnimation(o61940E0F456C74F2165A43C290512F);
                o61940E0F456C74F2165A43C290512F.setDuration(time);
                o61940E0F456C74F2165A43C290512F919EAD2E.setFillAfter(keep);
                if (this.oCC20AEC0F2EBAD28BB94E80B > -1) {
                    o61940E0F456C74F2165A43C290512F.setRepeatMode(this.oCC20AEC0F2EBAD28BB94E80B);
                }
                if (this.oCC20AEC0F2EBAD28CBF9E84B > -1) {
                    o61940E0F456C74F2165A43C290512F.setRepeatCount(this.oCC20AEC0F2EBAD28CBF9E84B);
                }
                o61940E0F456C74F2165A43C290512F.setAnimationListener(new Animation.AnimationListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo.this.oOoOOO0oOOooOOoOo0Oo00oo0OOOo0OOOOOoOOo0oOOoo0OoOOoOooOOOoOOoo00oo0o0oo00();
                    }
                });
                getView().startAnimation(o61940E0F456C74F2165A43C290512F919EAD2E);
                return;
            case 4:
                AnimationSet o72970A0650564AFD115E4FD78D572EA0B2BB3F1EC1 = new AnimationSet(true);
                RotateAnimation o72970A0650564AFD115E4FD78D572EA0DF = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                o72970A0650564AFD115E4FD78D572EA0B2BB3F1EC1.addAnimation(o72970A0650564AFD115E4FD78D572EA0DF);
                o72970A0650564AFD115E4FD78D572EA0DF.setDuration(time);
                o72970A0650564AFD115E4FD78D572EA0B2BB3F1EC1.setFillAfter(keep);
                if (this.oCC20AEC0F2EBAD28BB94E80B > -1) {
                    o72970A0650564AFD115E4FD78D572EA0DF.setRepeatMode(this.oCC20AEC0F2EBAD28BB94E80B);
                }
                if (this.oCC20AEC0F2EBAD28CBF9E84B > -1) {
                    o72970A0650564AFD115E4FD78D572EA0DF.setRepeatCount(this.oCC20AEC0F2EBAD28CBF9E84B);
                }
                o72970A0650564AFD115E4FD78D572EA0DF.setAnimationListener(new Animation.AnimationListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo.4
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo.this.oOoOOO0oOOooOOoOo0Oo00oo0OOOo0OOOOOoOOo0oOOoo0OoOOoOooOOOoOOoo00oo0o0oo00();
                    }
                });
                getView().startAnimation(o72970A0650564AFD115E4FD78D572EA0B2BB3F1EC1);
                return;
            case 5:
                AnimationSet o739B1F0B416C74F2165A43C290512F919EAD2E58 = new AnimationSet(true);
                ScaleAnimation o739B1F0B416C74F2165A43C290512FFC = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                o739B1F0B416C74F2165A43C290512F919EAD2E58.addAnimation(o739B1F0B416C74F2165A43C290512FFC);
                o739B1F0B416C74F2165A43C290512FFC.setDuration(time);
                o739B1F0B416C74F2165A43C290512F919EAD2E58.setFillAfter(keep);
                if (this.oCC20AEC0F2EBAD28BB94E80B > -1) {
                    o739B1F0B416C74F2165A43C290512FFC.setRepeatMode(this.oCC20AEC0F2EBAD28BB94E80B);
                }
                if (this.oCC20AEC0F2EBAD28CBF9E84B > -1) {
                    o739B1F0B416C74F2165A43C290512FFC.setRepeatCount(this.oCC20AEC0F2EBAD28CBF9E84B);
                }
                o739B1F0B416C74F2165A43C290512FFC.setAnimationListener(new Animation.AnimationListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo.5
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo.this.oOoOOO0oOOooOOoOo0Oo00oo0OOOo0OOOOOoOOo0oOOoo0OoOOoOooOOOoOOoo00oo0o0oo00();
                    }
                });
                getView().startAnimation(o739B1F0B416C74F2165A43C290512F919EAD2E58);
                return;
            case 6:
                AnimationSet o61940E0F456C74F2165A43C290512F919EAD2E58 = new AnimationSet(true);
                AlphaAnimation o61940E0F456C74F2165A43C290512FFC = new AlphaAnimation(0.0f, 1.0f);
                o61940E0F456C74F2165A43C290512F919EAD2E58.addAnimation(o61940E0F456C74F2165A43C290512FFC);
                o61940E0F456C74F2165A43C290512FFC.setDuration(time);
                o61940E0F456C74F2165A43C290512F919EAD2E58.setFillAfter(keep);
                if (this.oCC20AEC0F2EBAD28BB94E80B > -1) {
                    o61940E0F456C74F2165A43C290512FFC.setRepeatMode(this.oCC20AEC0F2EBAD28BB94E80B);
                }
                if (this.oCC20AEC0F2EBAD28CBF9E84B > -1) {
                    o61940E0F456C74F2165A43C290512FFC.setRepeatCount(this.oCC20AEC0F2EBAD28CBF9E84B);
                }
                o61940E0F456C74F2165A43C290512FFC.setAnimationListener(new Animation.AnimationListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo.6
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo.this.oOoOOO0oOOooOOoOo0Oo00oo0OOOo0OOOOOoOOo0oOOoo0OoOOoOooOOOoOOoo00oo0o0oo00();
                    }
                });
                getView().startAnimation(o61940E0F456C74F2165A43C290512F919EAD2E58);
                return;
            default:
                return;
        }
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOoOOO0oOOooOOoOo0Oo00oo0OOOo0OOOOOoOOo0oOOoo0OoOOoOooOOOoOOoo00oo0o0oo00() {
        ooOooOOo0OOOOoooOoOO0oo00oOOO0oo0oo0oo0oOo0OOOOO0O0oOO0oOOoO0oOOoO0OOooOOo00ooooOOOoOoo0oo0.ooO0oOoo00oooO0oOOooooo0ooOooOOoOoo0oo0ooO0OO0oOooo0OoooOoooooOoo0oOOoo0Oo0OOOo(this, "开启特效完毕", new Object[0]);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOOoO0oO0ooOOOooo00Oo0OOoOOOo0OOOOOoOOo0oOOoo0OoO(float fromDegrees, float toDegrees, int time, boolean keep) {
        AnimationSet o72970A0650564AFD115E4FD78D572EA0B2BB3F1E = new AnimationSet(true);
        RotateAnimation o72970A0650564AFD115E4FD78D572EA0 = new RotateAnimation(fromDegrees, toDegrees, 1, 0.5f, 1, 0.5f);
        o72970A0650564AFD115E4FD78D572EA0B2BB3F1E.addAnimation(o72970A0650564AFD115E4FD78D572EA0);
        o72970A0650564AFD115E4FD78D572EA0.setDuration(time);
        o72970A0650564AFD115E4FD78D572EA0B2BB3F1E.setFillAfter(keep);
        if (this.oCC20AEC0F2EBAD28BB94E80B > -1) {
            o72970A0650564AFD115E4FD78D572EA0.setRepeatMode(this.oCC20AEC0F2EBAD28BB94E80B);
        }
        if (this.oCC20AEC0F2EBAD28CBF9E84B > -1) {
            o72970A0650564AFD115E4FD78D572EA0.setRepeatCount(this.oCC20AEC0F2EBAD28CBF9E84B);
        }
        o72970A0650564AFD115E4FD78D572EA0.setAnimationListener(new Animation.AnimationListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo.7
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo.this.oOoOOO0oOOooOOoOo0Oo00oo0OOOo0OOOOOoOOo0oOOoo0OoOOoOooOOOoOOoo00oo0o0oo00();
            }
        });
        getView().startAnimation(o72970A0650564AFD115E4FD78D572EA0B2BB3F1E);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOOoooOoo0OOOOo0o0OOo0o0OOOOo0OOOOOoOOo0oOOoo0OoO(int xfrom, int xto, int yfrom, int yto, int time, boolean keep) {
        AnimationSet o748A1F09575F74E81A6843D8905320BA84A7343580E535 = new AnimationSet(true);
        TranslateAnimation o748A1F09575F74E81A6843D8905320BA84A734 = new TranslateAnimation(xfrom, xto, yfrom, yto);
        o748A1F09575F74E81A6843D8905320BA84A7343580E535.addAnimation(o748A1F09575F74E81A6843D8905320BA84A734);
        o748A1F09575F74E81A6843D8905320BA84A734.setDuration(time);
        o748A1F09575F74E81A6843D8905320BA84A7343580E535.setFillAfter(keep);
        if (this.oCC20AEC0F2EBAD28BB94E80B > -1) {
            o748A1F09575F74E81A6843D8905320BA84A734.setRepeatMode(this.oCC20AEC0F2EBAD28BB94E80B);
        }
        if (this.oCC20AEC0F2EBAD28CBF9E84B > -1) {
            o748A1F09575F74E81A6843D8905320BA84A734.setRepeatCount(this.oCC20AEC0F2EBAD28CBF9E84B);
        }
        o748A1F09575F74E81A6843D8905320BA84A734.setAnimationListener(new Animation.AnimationListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo.8
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo.this.oOOoooOoo0OOOOo0o0OOo0o0OOOOo0OOOOOoOOo0oOOoo0OoOOoOooOOOoOOoo00oo0o0oo00();
            }
        });
        getView().startAnimation(o748A1F09575F74E81A6843D8905320BA84A7343580E535);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOOoooOoo0OOOOo0o0OOo0o0OOOOo0OOOOOoOOo0oOOoo0OoOOoOooOOOoOOoo00oo0o0oo00() {
        ooOooOOo0OOOOoooOoOO0oo00oOOO0oo0oo0oo0oOo0OOOOO0O0oOO0oOOoO0oOOoO0OOooOOo00ooooOOOoOoo0oo0.ooO0oOoo00oooO0oOOooooo0ooOooOOoOoo0oo0ooO0OO0oOooo0OoooOoooooOoo0oOOoo0Oo0OOOo(this, "移动特效完毕", new Object[0]);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOOooO0oo0OoOOoOooOOoOOO0OO0oOoo00oOoOo0oo0oOooOoOo0o0oo0Ooo0OOOoO0ooooOOoo0oo0o0Ooo0(int repeatMode, int repeatCount) {
        this.oCC20AEC0F2EBAD28BB94E80B = repeatMode;
        this.oCC20AEC0F2EBAD28CBF9E84B = repeatCount;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOoOoOOoooOO0OoOoOoOoOoOoo00OO0Oo0o00OooOo0oOooOoOo0OOOOOOooOOOOOOOoO0OOOooOo00o00o00() {
        getView().startAnimation(new ooOOoOoOooOOOoo0oooO0oooooOoooOo0oooOo0oOoOOO0oOOoooooOoOOoO0oOOoO0OOoOO0o00oO0oOOO0o());
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOoOOoOO0oo00OoOoO0Oo0oO0o00o00o0OOooOooO0oo0oOO0() {
        getView().requestFocus();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOo0o0ooooOOoOo0OOoo00Oooo00o00o0OOooOooO0oo0oOO0() {
        getView().clearFocus();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public boolean oOoOOO0oo0oooOoOoo0Oo0oOoOOOoOOOo0o0oOooo0OooOoOOOo0OooOOooOo() {
        return getView().isFocusable();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOoOOO0oo0oooOoOoo0Oo0oOoOOOoOOOo0o0oOooo0OooOoOOOo0OooOOooOo(boolean focusable) {
        getView().setFocusable(focusable);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public boolean oOoOOO0oo0oooOooOOoOoooOo() {
        return getView().isEnabled();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOoOOO0oo0oooOooOOoOoooOo(boolean enabled) {
        getView().setEnabled(enabled);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOoOOO0oo0oooOoOoOoOoOoOo(boolean visiable) {
        View o76911B10 = getView();
        if (visiable) {
            o76911B10.setVisibility(0);
        } else {
            o76911B10.setVisibility(4);
        }
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public boolean oOoOOO0oo0oooOoOoOoOoOoOo() {
        View o76911B10 = getView();
        return o76911B10.getVisibility() == 0;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public int oOoOooooOoOoOOo0O0oOOoo0oOO0oOOOOOoO0OOoOo0oo0o0o() {
        return this.o62991D0C43417AE9115361D9955133;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOoOooooOoOoOOo0O0oOOoo0oOO0oOOOOOoO0OOoOo0oo0o0o(int argb) {
        this.o62991D0C43417AE9115361D9955133 = argb;
        getView().setBackgroundColor(argb);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOoOO0oO0oOoOOo0o0OOo0OO0o00oooo00Oo0OoooO0oO0OooOo0OOoOO0Oo0o00o0oooooo0() {
        relatedio.oOOoo0ooOOOooOo0Oo0o0OoO0o00oooo00Oo0OoooO0oO0OooOo0OOoOO0Oo0o00o0oooooo0(getView());
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOoOOo0oooo0OOoOooOo00Oooo00OO0OOooOOOo0oo0oOOOoo() {
        final View o76911B10 = getView();
        ViewTreeObserver o768C11 = o76911B10.getViewTreeObserver();
        o768C11.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo.9
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                o76911B10.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo.this.oOoOOoOoooOOOOooo0OOoooooOOOo00OOoo00OoooOooOOoo0(o76911B10.getWidth(), o76911B10.getHeight());
            }
        });
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOoOOoOoooOOOOooo0OOoooooOOOo00OOoo00OoooOooOOoo0(int i, int i2) {
        ooOooOOo0OOOOoooOoOO0oo00oOOO0oo0oo0oo0oOo0OOOOO0O0oOO0oOOoO0oOOoO0OOooOOo00ooooOOOoOoo0oo0.ooO0oOoo00oooO0oOOooooo0ooOooOOoOoo0oo0ooO0OO0oOooo0OoooOoooooOoo0oOOoo0Oo0OOOo(this, "绘制完毕", Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoO0o00oooO0oOOoO0oOOOoOooO0oOOOO0o0oO0oOOoOO0oooO0ooOOOoooOOooOOOoo00o00o0ooOOOoOooOOO0OoOOoo
    public void oOoOo0OoOoO0oOooo00o0OOOOo00o0OOo0OOo(oOo0oo0oooOOOOo0OOOo0OooO ooo0oo0oooooooo0oooo0oooo) {
        oOo0oo0oooOOOOo0OOOo0OooOoO0OOooOOOOOoO0oOOOO0O0o o6C971D06486F60A5480110EA8C0876F98B81371A9F = (oOo0oo0oooOOOOo0OOOo0OooOoO0OOooOOOOOoO0oOOOO0O0o) ooo0oo0oooooooo0oooo0oooo;
        if (getView().getParent() != null) {
            ViewGroup o6C971D0648657CF9087050D98C4E70 = (ViewGroup) getView().getParent();
            View o6C971D0648657CF90806 = getView();
            o6C971D0648657CF9087050D98C4E70.removeView(o6C971D0648657CF90806);
        }
        ViewGroup o6C971D0648657CF9087050D98C4E73 = ((ooOoOo0o00o00O0oo0oO0oo0OoOOooooOoo0ooOOOo0OO0oooO0oOO0oOOOoO) o6C971D06486F60A5480110EA8C0876F98B81371A9F.getLayout()).getLayoutManager();
        View o6C971D0648657CF90805 = getView();
        ViewGroup.LayoutParams o6C971D06487F74E5104256E6984C20A39E = new ViewGroup.LayoutParams(-1, -1);
        o6C971D0648657CF9087050D98C4E73.addView(o6C971D0648657CF90805, o6C971D06487F74E5104256E6984C20A39E);
    }
}