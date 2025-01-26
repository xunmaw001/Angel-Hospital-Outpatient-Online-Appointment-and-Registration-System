package com.dao;

import com.entity.ZhuanjiayuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanjiayuyueVO;
import com.entity.view.ZhuanjiayuyueView;


/**
 * 专家预约
 * 
 * @author 
 * @email 
 * @date 2023-01-18 22:51:29
 */
public interface ZhuanjiayuyueDao extends BaseMapper<ZhuanjiayuyueEntity> {
	
	List<ZhuanjiayuyueVO> selectListVO(@Param("ew") Wrapper<ZhuanjiayuyueEntity> wrapper);
	
	ZhuanjiayuyueVO selectVO(@Param("ew") Wrapper<ZhuanjiayuyueEntity> wrapper);
	
	List<ZhuanjiayuyueView> selectListView(@Param("ew") Wrapper<ZhuanjiayuyueEntity> wrapper);

	List<ZhuanjiayuyueView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanjiayuyueEntity> wrapper);
	
	ZhuanjiayuyueView selectView(@Param("ew") Wrapper<ZhuanjiayuyueEntity> wrapper);
	

}
