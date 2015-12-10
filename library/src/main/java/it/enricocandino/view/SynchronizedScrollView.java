package it.enricocandino.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/**
 * Copyright (c) 2015 Enrico Candino
 * <p>
 * Distributed under the MIT License.
 */
public class SynchronizedScrollView extends ScrollView implements Synchronizer.Synchronizable {

    public SynchronizedScrollView(Context context) {
        super(context);
        init();
    }

    public SynchronizedScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SynchronizedScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        getViewTreeObserver().addOnGlobalLayoutListener(new SynchRegisterer());
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();

        Synchronizer.getInstance().unregister(this);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);

        // listen for his scrolls and notify the Synchronizer
        Synchronizer.getInstance().update(this, getScrollY());
    }

    @Override
    public void onUpdate(int update) {

        // listen for scrolls from your siblings
        setScrollY(update);
    }

    /*
     * Used to register and update the ScrollView when ready
     *
     */
    private class SynchRegisterer implements ViewTreeObserver.OnGlobalLayoutListener {

        @Override
        public void onGlobalLayout() {
            if (Build.Version.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                SynchronizedScrollView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }else{
                SynchronizedScrollView.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
            Synchronizer.getInstance().register(SynchronizedScrollView.this);
        }
    }
}
