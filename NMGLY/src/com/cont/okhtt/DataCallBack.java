package com.cont.okhtt;

import java.lang.reflect.Type;

import com.google.gson.reflect.TypeToken;

public abstract class DataCallBack<T> {
	TypeToken<T> typeToken;

	public DataCallBack(TypeToken<T> typeToken) {
		this.typeToken = typeToken;
	}

	public abstract void onSuccess(T data);

	public abstract void onFailure(int code);

	public Type getType() {
		return typeToken.getType();
	}
}
