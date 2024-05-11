import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import zhenduanxinxi from '@/views/modules/zhenduanxinxi/list'
    import chufangdingdan from '@/views/modules/chufangdingdan/list'
    import huanzhe from '@/views/modules/huanzhe/list'
    import guahaoxinxi from '@/views/modules/guahaoxinxi/list'
    import jiuzhenxinxi from '@/views/modules/jiuzhenxinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import yisheng from '@/views/modules/yisheng/list'
    import dingdanpaidui from '@/views/modules/dingdanpaidui/list'
    import config from '@/views/modules/config/list'
    import keshixinxi from '@/views/modules/keshixinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/zhenduanxinxi',
        name: '诊断信息',
        component: zhenduanxinxi
      }
      ,{
	path: '/chufangdingdan',
        name: '处方订单',
        component: chufangdingdan
      }
      ,{
	path: '/huanzhe',
        name: '患者',
        component: huanzhe
      }
      ,{
	path: '/guahaoxinxi',
        name: '挂号信息',
        component: guahaoxinxi
      }
      ,{
	path: '/jiuzhenxinxi',
        name: '就诊信息',
        component: jiuzhenxinxi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/yisheng',
        name: '医生',
        component: yisheng
      }
      ,{
	path: '/dingdanpaidui',
        name: '订单排队',
        component: dingdanpaidui
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/keshixinxi',
        name: '科室信息',
        component: keshixinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
