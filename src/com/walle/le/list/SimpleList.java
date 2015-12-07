/*
 * @(#) NormalList.java 2014. 11. 04.
 *
 * Copyright 2014 NHN Entertainment Corp. All rights Reserved.
 * NHN Entertainment PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.walle.le.list;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author hun
 */
public class SimpleList<T> implements Iterable<T> {
	//TODO: To prevent display 'empty' field in response json. (cause cached List from redis)
	@JsonIgnore private boolean empty;
	protected String _type = "";
	protected List<T> list = new ArrayList<>();

	public String get_type() {
		return _type;
	}

	public SimpleList() {
	}

	public SimpleList(List<T> list) {
		this.list = list;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}

	public int size() {
		return list.size();
	}

	public boolean contains(T element) {
		return list.contains(element);
	}

	public boolean add(T element) {
		return list.add(element);
	}

	public boolean remove(T element) {
		return list.remove(element);
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}
}
