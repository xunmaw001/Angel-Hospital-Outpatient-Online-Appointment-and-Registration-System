import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import keshiList from '../pages/keshi/list'
import keshiDetail from '../pages/keshi/detail'
import keshiAdd from '../pages/keshi/add'
import huanzheList from '../pages/huanzhe/list'
import huanzheDetail from '../pages/huanzhe/detail'
import huanzheAdd from '../pages/huanzhe/add'
import yishengList from '../pages/yisheng/list'
import yishengDetail from '../pages/yisheng/detail'
import yishengAdd from '../pages/yisheng/add'
import keshixinxiList from '../pages/keshixinxi/list'
import keshixinxiDetail from '../pages/keshixinxi/detail'
import keshixinxiAdd from '../pages/keshixinxi/add'
import keshiyuyueList from '../pages/keshiyuyue/list'
import keshiyuyueDetail from '../pages/keshiyuyue/detail'
import keshiyuyueAdd from '../pages/keshiyuyue/add'
import zhuanjiayuyueList from '../pages/zhuanjiayuyue/list'
import zhuanjiayuyueDetail from '../pages/zhuanjiayuyue/detail'
import zhuanjiayuyueAdd from '../pages/zhuanjiayuyue/add'
import zaixianzixunList from '../pages/zaixianzixun/list'
import zaixianzixunDetail from '../pages/zaixianzixun/detail'
import zaixianzixunAdd from '../pages/zaixianzixun/add'
import quxiaoyuyueList from '../pages/quxiaoyuyue/list'
import quxiaoyuyueDetail from '../pages/quxiaoyuyue/detail'
import quxiaoyuyueAdd from '../pages/quxiaoyuyue/add'
import binglidengjiList from '../pages/binglidengji/list'
import binglidengjiDetail from '../pages/binglidengji/detail'
import binglidengjiAdd from '../pages/binglidengji/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'keshi',
					component: keshiList
				},
				{
					path: 'keshiDetail',
					component: keshiDetail
				},
				{
					path: 'keshiAdd',
					component: keshiAdd
				},
				{
					path: 'huanzhe',
					component: huanzheList
				},
				{
					path: 'huanzheDetail',
					component: huanzheDetail
				},
				{
					path: 'huanzheAdd',
					component: huanzheAdd
				},
				{
					path: 'yisheng',
					component: yishengList
				},
				{
					path: 'yishengDetail',
					component: yishengDetail
				},
				{
					path: 'yishengAdd',
					component: yishengAdd
				},
				{
					path: 'keshixinxi',
					component: keshixinxiList
				},
				{
					path: 'keshixinxiDetail',
					component: keshixinxiDetail
				},
				{
					path: 'keshixinxiAdd',
					component: keshixinxiAdd
				},
				{
					path: 'keshiyuyue',
					component: keshiyuyueList
				},
				{
					path: 'keshiyuyueDetail',
					component: keshiyuyueDetail
				},
				{
					path: 'keshiyuyueAdd',
					component: keshiyuyueAdd
				},
				{
					path: 'zhuanjiayuyue',
					component: zhuanjiayuyueList
				},
				{
					path: 'zhuanjiayuyueDetail',
					component: zhuanjiayuyueDetail
				},
				{
					path: 'zhuanjiayuyueAdd',
					component: zhuanjiayuyueAdd
				},
				{
					path: 'zaixianzixun',
					component: zaixianzixunList
				},
				{
					path: 'zaixianzixunDetail',
					component: zaixianzixunDetail
				},
				{
					path: 'zaixianzixunAdd',
					component: zaixianzixunAdd
				},
				{
					path: 'quxiaoyuyue',
					component: quxiaoyuyueList
				},
				{
					path: 'quxiaoyuyueDetail',
					component: quxiaoyuyueDetail
				},
				{
					path: 'quxiaoyuyueAdd',
					component: quxiaoyuyueAdd
				},
				{
					path: 'binglidengji',
					component: binglidengjiList
				},
				{
					path: 'binglidengjiDetail',
					component: binglidengjiDetail
				},
				{
					path: 'binglidengjiAdd',
					component: binglidengjiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
