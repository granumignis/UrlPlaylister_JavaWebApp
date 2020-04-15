package com.granumignis.model;

public class Item {

	private int itemId;
	private String itemTitle;
	private String itemUrl;
	private int itemDuration;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemTitle() {
		return itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}
	public String getItemUrl() {
		return itemUrl;
	}
	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}
	public int getItemDuration() {
		return itemDuration;
	}
	public void setItemDuration(int itemDuration) {
		this.itemDuration = itemDuration;
	}
	
	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemTitle=" + itemTitle + ", itemUrl=" + itemUrl + ", itemDuration="
				+ itemDuration + "]";
	}
	
	
}
