package com.vo;

import java.util.List;

public class Dish {
    private Integer dishid;

    private Integer shopid;

    private String dishname;

    private String dishphoto;

    private Double dishprice;

    private String dishintroduction;

    private String dishcategory;

    private Integer dishlevel;

    private Integer dishsales;
    private List<Dishphoto> dishphotos;
    public Dishphoto dphoto2;
    public Dishphoto getDphoto() {
		return dphoto2;
	}

	public void setDphoto(Dishphoto dphoto2) {
		this.dphoto2 = dphoto2;
	}

	public List<Dishphoto> getDishphotos() {
		return dishphotos;
	}

	public void setDishphotos(List<Dishphoto> dishphotos) {
		this.dishphotos = dishphotos;
	}

	public Dish getDish() {
		return dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	private Integer dishstock;
    
    private Dish dish;
    
    public Integer getDishid() {
        return dishid;
    }

    public void setDishid(Integer dishid) {
        this.dishid = dishid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getDishname() {
        return dishname;
    }

    public void setDishname(String dishname) {
        this.dishname = dishname == null ? null : dishname.trim();
    }

    public String getDishphoto() {
        return dishphoto;
    }

    public void setDishphoto(String dishphoto) {
        this.dishphoto = dishphoto == null ? null : dishphoto.trim();
    }

    public Double getDishprice() {
        return dishprice;
    }

    public void setDishprice(Double dishprice) {
        this.dishprice = dishprice;
    }

    public String getDishintroduction() {
        return dishintroduction;
    }

    public void setDishintroduction(String dishintroduction) {
        this.dishintroduction = dishintroduction == null ? null : dishintroduction.trim();
    }

    public String getDishcategory() {
        return dishcategory;
    }

    public void setDishcategory(String dishcategory) {
        this.dishcategory = dishcategory == null ? null : dishcategory.trim();
    }

    public Integer getDishlevel() {
        return dishlevel;
    }

    public void setDishlevel(Integer dishlevel) {
        this.dishlevel = dishlevel;
    }

    public Integer getDishsales() {
        return dishsales;
    }

    public void setDishsales(Integer dishsales) {
        this.dishsales = dishsales;
    }

    public Integer getDishstock() {
        return dishstock;
    }

    public void setDishstock(Integer dishstock) {
        this.dishstock = dishstock;
    }
}