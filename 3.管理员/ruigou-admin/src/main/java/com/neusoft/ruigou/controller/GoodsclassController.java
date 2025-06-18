package com.neusoft.ruigou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ruigou.po.Goodsclass;
import com.neusoft.ruigou.service.IGoodsclassService;



@RestController
@RequestMapping("/class")
public class GoodsclassController {

	@Autowired
	private IGoodsclassService goodsclassService;
	
	@RequestMapping("/listAllGoods")
	public List<Goodsclass> listAllGoods(){
		return goodsclassService.listAllGoods();
	} 
	@RequestMapping("/search")
	public List<Goodsclass> searchGoodsclass(@RequestBody Goodsclass goodsclass){
		return goodsclassService.searchGoodsclass(goodsclass.getGoodsClass(),goodsclass.getClassId());
	} 
	 @RequestMapping("/insert")
		public Integer insertGoodsclass(@RequestBody Goodsclass goodsclass)
	    {return goodsclassService.insertGoodsclass(goodsclass.getGoodsClass(),goodsclass.getClassId());}
	 @DeleteMapping("/delete/{classId}")
		public ResponseEntity<Void> deleteGoodsclass(@PathVariable Integer classId) {
		 goodsclassService.deleteGoodsclass(classId); 
		return ResponseEntity.noContent().build(); 
		}
	 @RequestMapping("/update")
		public int updateGoodsclass(@RequestBody Goodsclass goodsclass) {
	    	return goodsclassService.updateGoodsclass(goodsclass);
	    }
	 
	 
	 
}
