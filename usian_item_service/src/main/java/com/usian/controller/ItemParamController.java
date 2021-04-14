package com.usian.controller;

import com.jiyun.utils.PageResult;
import com.jiyun.utils.Result;
import com.usian.pojo.TbItemParam;
import com.usian.service.ItemParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("service/itemParam")
public class ItemParamController {

    @Autowired
    private ItemParamService itemParamService;

    @RequestMapping("selectItemParamByItemCatId/{itemCatId}")
    public TbItemParam selectItemParamByItemCatId(@PathVariable Long itemCatId){
         return itemParamService.selectItemParamByItemCatId(itemCatId);

    }

    @RequestMapping("selectItemParamAll")
    public PageResult selectItemParamAll(Integer page, Integer rows){
        return itemParamService.selectItemParamAll(page,rows);
    }
    @RequestMapping("insertItemParam")
    public Integer insertItemParam(Long itemCatId, String paramData){
        return itemParamService.insertItemParam(itemCatId,paramData);
    }

    @RequestMapping("deleteItemParamById")
    public Integer deleteItemParamById(Long id){
        return itemParamService.deleteItemParamById(id);
    }

}
