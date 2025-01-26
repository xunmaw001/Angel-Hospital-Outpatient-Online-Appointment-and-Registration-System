package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BinglidengjiDao;
import com.entity.BinglidengjiEntity;
import com.service.BinglidengjiService;
import com.entity.vo.BinglidengjiVO;
import com.entity.view.BinglidengjiView;

@Service("binglidengjiService")
public class BinglidengjiServiceImpl extends ServiceImpl<BinglidengjiDao, BinglidengjiEntity> implements BinglidengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BinglidengjiEntity> page = this.selectPage(
                new Query<BinglidengjiEntity>(params).getPage(),
                new EntityWrapper<BinglidengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BinglidengjiEntity> wrapper) {
		  Page<BinglidengjiView> page =new Query<BinglidengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BinglidengjiVO> selectListVO(Wrapper<BinglidengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BinglidengjiVO selectVO(Wrapper<BinglidengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BinglidengjiView> selectListView(Wrapper<BinglidengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BinglidengjiView selectView(Wrapper<BinglidengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
