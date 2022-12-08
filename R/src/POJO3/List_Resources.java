package POJO3;

import java.util.List;

import POJO2.Data;
import POJO2.Support;

public class List_Resources {
	private int page;
	 private int per_page;
	 private int total;
	 private int total_pages;
	 private List<Data> data;
	 private Support support;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	public List<Data> getData() {
		return data;
	
	}
	public Support getSupport() {
		return support;
	}
}
