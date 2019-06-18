package com.vo;

import java.util.Date;

public class Order {
    private Long orderno;

    private Integer buyerno;

    private Integer sellerno;

    private Integer dishno;

    private Date ordertime;

    private Integer ordercategory;

    private Date overtime;

    private Integer dishmount;

    private Double totalmount;

    private String dishmingzi;
    
    private Dish dish;
    
    private Dishphoto dishphoto2;
    
    
	public Dishphoto getDishphoto2() {
		return dishphoto2;
	}

	public void setDishphoto2(Dishphoto dishphoto2) {
		this.dishphoto2 = dishphoto2;
	}

	public Dish getDish() {
		return dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	public Long getOrderno() {
        return orderno;
    }

    public void setOrderno(Long orderno) {
        this.orderno = orderno;
    }

    public Integer getBuyerno() {
        return buyerno;
    }

    public void setBuyerno(Integer buyerno) {
        this.buyerno = buyerno;
    }

    public Integer getSellerno() {
        return sellerno;
    }

    public void setSellerno(Integer sellerno) {
        this.sellerno = sellerno;
    }

    public Integer getDishno() {
        return dishno;
    }

    public void setDishno(Integer dishno) {
        this.dishno = dishno;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Integer getOrdercategory() {
        return ordercategory;
    }

    public void setOrdercategory(Integer ordercategory) {
        this.ordercategory = ordercategory;
    }

    public Date getOvertime() {
        return overtime;
    }

    public void setOvertime(Date overtime) {
        this.overtime = overtime;
    }

    public Integer getDishmount() {
        return dishmount;
    }

    public void setDishmount(Integer dishmount) {
        this.dishmount = dishmount;
    }

  

    public Double getTotalmount() {
		return totalmount;
	}

	public void setTotalmount(Double totalmount) {
		this.totalmount = totalmount;
	}

	public String getDishmingzi() {
        return dishmingzi;
    }

    public void setDishmingzi(String dishmingzi) {
        this.dishmingzi = dishmingzi == null ? null : dishmingzi.trim();
    }
}