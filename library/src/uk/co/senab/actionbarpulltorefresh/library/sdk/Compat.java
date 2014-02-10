package uk.co.senab.actionbarpulltorefresh.library.sdk;

import android.os.Build;
import android.view.View;

public class Compat {

    public static void setAlpha(View view, float alpha) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            CompatV11.setAlpha(view, alpha);
        } else {
            CompatBase.setAlpha(view, alpha);
        }
    }

    public static void postOnAnimation(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            CompatV16.postOnAnimation(view, runnable);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            CompatV11.postOnAnimation(view, runnable);
        } else {
            CompatBase.postOnAnimation(view, runnable);
        }
    }

    public static boolean canScrollVertically(View view, int direction){
        if(Build.VERSION.SDK_INT < Build.VERSION_CODES.ICE_CREAM_SANDWICH){
            return CompatBase.canScrollVertically(view, direction);
        }else{
            return CompatV14.canScrollVertically(view, direction);
        }
    }

}
