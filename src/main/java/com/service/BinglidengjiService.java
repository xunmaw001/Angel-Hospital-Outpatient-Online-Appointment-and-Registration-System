package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BinglidengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BinglidengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BinglidengjiView;


/**
 * 病历登记
 *
 * @author 
 * @email 
 * @date 2023-01-18 22:51:29
 */
public interface BinglidengjiService extends IService<BinglidengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BinglidengjiVO> selectListVO(Wrapper<BinglidengjiEntity> wrapper);
   	
   	BinglidengjiVO selectVO(@Param("ew") Wrapper<BinglidengjiEntity> wrapper);
   	
   	List<BinglidengjiView> selectListView(Wrapper<BinglidengjiEntity> wrapper);
   	
   	BinglidengjiView selectView(@Param("ew") Wrapper<BinglidengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BinglidengjiEntity> wrapper);
   	

}

