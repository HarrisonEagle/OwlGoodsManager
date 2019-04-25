/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owlgoodsmanager;

/**
 *
 * @author harris_hawk
 */
public class GoodsInf {
    private String goodsnum;
    private String goodsname;
    private String goodsprice;
    
    GoodsInf(){
        
        
    }
    
    
    GoodsInf(String goodsnum,String goodsname,String goodsprice){
        goodsnum=this.goodsnum;
        goodsname=this.goodsname;
        goodsprice=this.goodsprice;
    }
    
    
    public String getGoodsnum() {
		return goodsnum;
	}



	public void setGoodsnum(String goodsnum) {
		this.goodsnum = goodsnum;
	}



	public String getGoodsname() {
		return goodsname;
	}



	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}



	public String getGoodsprice() {
		return goodsprice;
	}



	public void setGoodsprice(String goodsprice) {
		this.goodsprice = goodsprice;
	}

        @Override
	public String toString() {
		return "[商品番号:" + goodsnum + "商品名：" + goodsname + "商品価格：" + goodsprice + "]\n";
	}
    
    
}
