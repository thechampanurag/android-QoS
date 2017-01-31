package com.cortxt.app.utillib.Utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.TextView;

import com.cortxt.app.utillib.R;

import java.util.Hashtable;


public class FontsUtil {
	
	public  static void applyFontToTextView(String font,TextView textView,Context context){
		Typeface typeFace=getCustomFont(font, context);
		//Typeface typeFace=Typeface.createFromAsset(context.getAssets(), "fonts/"+fontface + font + ext);

		if (textView != null)
			textView.setTypeface(typeFace);
	}
	public  static void applyFontToButton(String font,Button button,Context context){
		Typeface typeFace=getCustomFont(font, context);
		if (button != null)
			button.setTypeface(typeFace);
	}

	private static Hashtable<String, Typeface> fontCache = new Hashtable<String, Typeface>();

	public static Typeface getCustomFont (String font, Context context){
		String customFont = (context.getResources().getString(R.string.CUSTOM_FONT));
		String fontface = "Roboto.ttf";
		if (customFont.length() > 1)
			fontface = customFont;
		String ext = fontface.substring(fontface.indexOf('.'));
		fontface = fontface.substring(0, fontface.indexOf('.'));

		String fontname = fontface + font;
		Typeface tf = fontCache.get(fontname);
		if(tf == null) {
			try {
				tf = Typeface.createFromAsset(context.getAssets(), "fonts/" + fontname + ext);
			}
			catch (Exception e) {
				return null;
			}
			fontCache.put(fontname, tf);
		}

		//Typeface typeFace=Typeface.createFromAsset(context.getAssets(), "fonts/"+fontface + font + ext);
		return tf;
		
	}
}
