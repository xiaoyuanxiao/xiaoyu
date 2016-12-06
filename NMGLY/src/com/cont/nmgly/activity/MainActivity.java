package com.cont.nmgly.activity;

import android.view.View;
import android.widget.RadioButton;

import com.cont.nmgly.R;
import com.cont.nmgly.activity.presenter.MainPersenter;
import com.cont.nmgly.activity.viewinterface.MainVinterfase;

public class MainActivity extends BaseActivity implements MainVinterfase {
	private RadioButton rb_demand, rb_forestry, rb_release, rb_personal;
	MainPersenter mPers;

	@Override
	Object initView() {
		return R.layout.activity_main;
	}

	@Override
	void initfindviewByid() {
		rb_demand = (RadioButton) findViewById(R.id.rb_demand);
		rb_forestry = (RadioButton) findViewById(R.id.rb_forestry);
		rb_release = (RadioButton) findViewById(R.id.rb_release);
		rb_personal = (RadioButton) findViewById(R.id.rb_personal);
		mPers = new MainPersenter(this);
	}

	@Override
	void setOnclick() {
		rb_demand.setOnClickListener(this);
		rb_forestry.setOnClickListener(this);
		rb_release.setOnClickListener(this);
		rb_personal.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.rb_demand:
			mPers.selectDemand();
			break;
		case R.id.rb_forestry:
			mPers.selectForestry();
			break;
		case R.id.rb_release:
			mPers.selectRelease();
			break;
		case R.id.rb_personal:
			mPers.selectPersonal();
			break;

		default:
			break;
		}
	}

	@Override
	public void selectDemand() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectForestry() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectRelease() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectPersonal() {
	}

}
