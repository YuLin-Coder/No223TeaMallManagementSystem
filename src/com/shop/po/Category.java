package com.shop.po;

import java.util.List;

public class Category {
    private Integer cid;

    private String cname;
//    关联二级目录
    private List<Categorysecond> csList;
    
    public List<Categorysecond> getCsList() {
		return csList;
	}

	public void setCsList(List<Categorysecond> csList) {
		this.csList = csList;
	}

	public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }
}