package com.dao;

import com.entity.KeshiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KeshiyuyueVO;
import com.entity.view.KeshiyuyueView;


/**
 * 科室预约
 * 
 * @author 
 * @email 
 * @date 2023-01-18 22:51:29
 */
public interface KeshiyuyueDao extends BaseMapper<KeshiyuyueEntity> {
	
	List<KeshiyuyueVO> selectListVO(@Param("ew") Wrapper<KeshiyuyueEntity> wrapper);
	
	KeshiyuyueVO selectVO(@Param("ew") Wrapper<KeshiyuyueEntity> wrapper);
	
	List<KeshiyuyueView> selectListView(@Param("ew") Wrapper<KeshiyuyueEntity> wrapper);

	List<KeshiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<KeshiyuyueEntity> wrapper);
	
	KeshiyuyueView selectView(@Param("ew") Wrapper<KeshiyuyueEntity> wrapper);
	

}
