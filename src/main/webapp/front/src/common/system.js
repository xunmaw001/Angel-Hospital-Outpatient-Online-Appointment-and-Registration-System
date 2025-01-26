export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看","修改","删除"],"menu":"科室","menuJump":"列表","tableName":"keshi"}],"menu":"科室管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["新增","查看","修改","删除"],"menu":"患者","menuJump":"列表","tableName":"huanzhe"}],"menu":"患者管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除"],"menu":"医生","menuJump":"列表","tableName":"yisheng"}],"menu":"医生管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["新增","查看","修改","删除","查看评论"],"menu":"科室信息","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","修改","删除"],"menu":"科室预约","menuJump":"列表","tableName":"keshiyuyue"}],"menu":"科室预约管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","修改","删除"],"menu":"专家预约","menuJump":"列表","tableName":"zhuanjiayuyue"}],"menu":"专家预约管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","修改","删除"],"menu":"在线咨询","menuJump":"列表","tableName":"zaixianzixun"}],"menu":"在线咨询管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","修改","删除"],"menu":"取消预约","menuJump":"列表","tableName":"quxiaoyuyue"}],"menu":"取消预约管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","修改","删除"],"menu":"病历登记","menuJump":"列表","tableName":"binglidengji"}],"menu":"病历登记管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"医院公告","tableName":"news"},{"appFrontIcon":"cuIcon-clothes","buttons":["查看","修改"],"menu":"关于我们","tableName":"aboutus"},{"appFrontIcon":"cuIcon-time","buttons":["查看","修改"],"menu":"系统简介","tableName":"systemintro"},{"appFrontIcon":"cuIcon-clothes","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","挂号","在线咨询"],"menu":"医生列表","menuJump":"列表","tableName":"yisheng"}],"menu":"医生模块"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看","查看评论","预约"],"menu":"科室信息列表","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","支付","取消预约"],"menu":"科室预约","menuJump":"列表","tableName":"keshiyuyue"}],"menu":"科室预约管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","支付","取消预约"],"menu":"专家预约","menuJump":"列表","tableName":"zhuanjiayuyue"}],"menu":"专家预约管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","删除"],"menu":"在线咨询","menuJump":"列表","tableName":"zaixianzixun"}],"menu":"在线咨询管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","修改","删除"],"menu":"取消预约","menuJump":"列表","tableName":"quxiaoyuyue"}],"menu":"取消预约管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看"],"menu":"病历登记","menuJump":"列表","tableName":"binglidengji"}],"menu":"病历登记管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","挂号","在线咨询"],"menu":"医生列表","menuJump":"列表","tableName":"yisheng"}],"menu":"医生模块"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看","查看评论","预约"],"menu":"科室信息列表","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"患者","tableName":"huanzhe"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","病历"],"menu":"科室预约","menuJump":"列表","tableName":"keshiyuyue"}],"menu":"科室预约管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","病历"],"menu":"专家预约","menuJump":"列表","tableName":"zhuanjiayuyue"}],"menu":"专家预约管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","删除","审核"],"menu":"在线咨询","menuJump":"列表","tableName":"zaixianzixun"}],"menu":"在线咨询管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看"],"menu":"取消预约","menuJump":"列表","tableName":"quxiaoyuyue"}],"menu":"取消预约管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","修改","删除"],"menu":"病历登记","menuJump":"列表","tableName":"binglidengji"}],"menu":"病历登记管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","挂号","在线咨询"],"menu":"医生列表","menuJump":"列表","tableName":"yisheng"}],"menu":"医生模块"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看","查看评论","预约"],"menu":"科室信息列表","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"医生","tableName":"yisheng"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}
