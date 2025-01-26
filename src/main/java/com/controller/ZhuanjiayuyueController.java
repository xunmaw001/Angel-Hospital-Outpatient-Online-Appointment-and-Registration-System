package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhuanjiayuyueEntity;
import com.entity.view.ZhuanjiayuyueView;

import com.service.ZhuanjiayuyueService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 专家预约
 * 后端接口
 * @author 
 * @email 
 * @date 2023-01-18 22:51:29
 */
@RestController
@RequestMapping("/zhuanjiayuyue")
public class ZhuanjiayuyueController {
    @Autowired
    private ZhuanjiayuyueService zhuanjiayuyueService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhuanjiayuyueEntity zhuanjiayuyue, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			zhuanjiayuyue.setYishenggonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("huanzhe")) {
			zhuanjiayuyue.setHuanzhezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhuanjiayuyueEntity> ew = new EntityWrapper<ZhuanjiayuyueEntity>();


		PageUtils page = zhuanjiayuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuanjiayuyue), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhuanjiayuyueEntity zhuanjiayuyue, 
		HttpServletRequest request){
        EntityWrapper<ZhuanjiayuyueEntity> ew = new EntityWrapper<ZhuanjiayuyueEntity>();

		PageUtils page = zhuanjiayuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuanjiayuyue), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhuanjiayuyueEntity zhuanjiayuyue){
       	EntityWrapper<ZhuanjiayuyueEntity> ew = new EntityWrapper<ZhuanjiayuyueEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhuanjiayuyue, "zhuanjiayuyue")); 
        return R.ok().put("data", zhuanjiayuyueService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhuanjiayuyueEntity zhuanjiayuyue){
        EntityWrapper< ZhuanjiayuyueEntity> ew = new EntityWrapper< ZhuanjiayuyueEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhuanjiayuyue, "zhuanjiayuyue")); 
		ZhuanjiayuyueView zhuanjiayuyueView =  zhuanjiayuyueService.selectView(ew);
		return R.ok("查询专家预约成功").put("data", zhuanjiayuyueView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhuanjiayuyueEntity zhuanjiayuyue = zhuanjiayuyueService.selectById(id);
        return R.ok().put("data", zhuanjiayuyue);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhuanjiayuyueEntity zhuanjiayuyue = zhuanjiayuyueService.selectById(id);
        return R.ok().put("data", zhuanjiayuyue);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhuanjiayuyueEntity zhuanjiayuyue, HttpServletRequest request){
    	zhuanjiayuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhuanjiayuyue);

        zhuanjiayuyueService.insert(zhuanjiayuyue);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhuanjiayuyueEntity zhuanjiayuyue, HttpServletRequest request){
    	zhuanjiayuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhuanjiayuyue);

        zhuanjiayuyueService.insert(zhuanjiayuyue);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhuanjiayuyueEntity zhuanjiayuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhuanjiayuyue);
        zhuanjiayuyueService.updateById(zhuanjiayuyue);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhuanjiayuyueService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhuanjiayuyueEntity> wrapper = new EntityWrapper<ZhuanjiayuyueEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			wrapper.eq("yishenggonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("huanzhe")) {
			wrapper.eq("huanzhezhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhuanjiayuyueService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	








}
