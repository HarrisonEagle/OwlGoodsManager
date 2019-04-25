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
public class cart {
    private String goodsnum;
    private String goodsname;
    private String goodsprice;
    private int num;
    
    cart(){
        
        
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

        
        public int getNum(){
            return this.num;
        }
        
        public void setNum(int num){
            this.num=num;
        }
        
        @Override
	public String toString() {
		return "[商品番号:" + goodsnum + "商品名：" + goodsname + "商品価格：" + goodsprice + "商品数："+num+"]\n";
	}
}
