package org.odk.collect.android.sens;

import android.text.InputFilter;

import android.text.Spanned;


public class MaskFilter {

    public static InputFilter getFilter(){

        InputFilter filter = new InputFilter() {
            public CharSequence filter(CharSequence source, int start, int end,
                                       Spanned dest, int dstart, int dend) {
                for (int i = start; i < end; i++) {
                    Character c=source.charAt(i);
                    if (!isCharAllowed(c)) {
                        return "";
                    }
                }
                return "*";
            }
        };
        return filter;
    }

    private static boolean isCharAllowed(char c) {
        return Character.isLetterOrDigit(c) || Character.isSpaceChar(c);
    }
}
