package com.usian.controller;

import com.jiyun.utils.PageResult;
import com.jiyun.utils.Result;
import com.usian.pojo.TbItem;
import com.usian.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("service/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("selectItemInfo")
    public TbItem selectItemInfo(Long itemId){
        return itemService.selectItemInfo(itemId);

    }

    @RequestMapping("selectTbItemAllByPage")
    public PageResult selectTbItemAllByPage(Integer page,Integer rows){
        return itemService.selectTbItemAllByPage(page,rows);
    }
    @RequestMapping("/insertTbItem")
    public Integer insertTbItem(@RequestBody TbItem tbItem,String desc, String itemParams){
        return itemService.insertTbItem(tbItem,desc,itemParams);
    }

    @RequestMapping("deleteItemById")
    public Integer deleteItemById(Long itemId){
        return itemService.deleteItemById(itemId);
    }

    @RequestMapping("preUpdateItem")
    public Map<String, Object> preUpdateItem(Long itemId){
        return itemService.preUpdateItem(itemId);
    }






}
