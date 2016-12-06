package com.cont.nmgly.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;

public abstract class BaseActivity extends FragmentActivity implements OnClickListener{

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		Object initView = initView();
		if (initView instanceof View) {
			setContentView((View) initView);
		} else {
			setContentView((Integer) initView);
		}
		initData();
	}

	private void initData() {
		initfindviewByid();
		setOnclick();
	}

	abstract Object initView();

	abstract void initfindviewByid();

	abstract void setOnclick();
}
