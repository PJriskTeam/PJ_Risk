package com.hh.repository;


import com.hh.bean.PreventListForm;

public interface PreventRepository {
	PreventListForm getPreventList(PreventListForm preventListForm);
}
