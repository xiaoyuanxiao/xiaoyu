package com.cont.nmgly.activity.presenter;

import com.cont.nmgly.activity.viewinterface.MainVinterfase;

public class MainPersenter {

	MainVinterfase mvf;

	public MainPersenter(MainVinterfase mvf) {
		this.mvf = mvf;
	}

	public void selectDemand() {
		mvf.selectDemand();
	}

	public void selectForestry() {
		mvf.selectForestry();
	}

	public void selectPersonal() {
		mvf.selectPersonal();
	}

	public void selectRelease() {
		mvf.selectRelease();
	}
}
