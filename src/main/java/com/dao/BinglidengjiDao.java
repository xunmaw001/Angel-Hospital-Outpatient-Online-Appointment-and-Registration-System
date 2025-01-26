package com.dao;

import com.entity.BinglidengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BinglidengjiVO;
import com.entity.view.BinglidengjiView;


/**
 * 病历登记
 * 
 * @author 
 * @email 
 * @date 2023-01-18 22:51:29
 */
public interface BinglidengjiDao extends BaseMapper<BinglidengjiEntity> {
	
	List<BinglidengjiVO> selectListVO(@Param("ew") Wrapper<BinglidengjiEntity> wrapper);
	
	BinglidengjiVO selectVO(@Param("ew") Wrapper<BinglidengjiEntity> wrapper);
	
	List<BinglidengjiView> selectListView(@Param("ew") Wrapper<BinglidengjiEntity> wrapper);

	List<BinglidengjiView> selectListView(Pagination page,@Param("ew") Wrapper<BinglidengjiEntity> wrapper);
	
	BinglidengjiView selectView(@Param("ew") Wrapper<BinglidengjiEntity> wrapper);
	

}
