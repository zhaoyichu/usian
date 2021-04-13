package com.usian.service;

import com.jiyun.utils.Result;
import com.usian.mapper.TbItemCatMapper;
import com.usian.mapper.TbItemParamItemMapper;
import com.usian.pojo.TbItemCat;
import com.usian.pojo.TbItemCatExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ItemCategoryService {

    @Autowired
    private TbItemCatMapper tbItemCatMapper;


    public List<TbItemCat> selectItemCategoryByParentId(Long id) {
        TbItemCatExample tbItemCatExample = new TbItemCatExample();
        TbItemCatExample.Criteria criteria=tbItemCatExample.createCriteria();
        criteria.andParentIdEqualTo(id);
       criteria.andStatusEqualTo(1);
        return tbItemCatMapper.selectByExample(tbItemCatExample);
    }
}
