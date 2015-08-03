package com.vanco.abplayer.util;

import android.app.Activity;
import android.util.Log;
import cn.waps.AppConnect;
import cn.waps.AppListener;

public class AdPublic {
	Activity a;
	public static int time = 9000;
	public static void addAd (Activity a) { 
		

		
		AppConnect.getInstance(a).initPopAd(a);
		// 设置插屏广告无数据时的回调监听（该方法必须在showPopAd之前调用）
		AppConnect.getInstance(a).setPopAdNoDataListener(new AppListener() {

			@Override
			public void onPopNoData() {
				Log.i("debug", "插屏广告暂无可用数据");
			}

		});
		// 显示插屏广告
		AppConnect.getInstance(a).showPopAd(a);

	
	}
}
