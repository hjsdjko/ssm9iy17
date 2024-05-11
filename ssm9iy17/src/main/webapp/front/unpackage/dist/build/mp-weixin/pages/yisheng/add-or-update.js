(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/yisheng/add-or-update"],{6538:function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var r=i(t("a34a"));function i(e){return e&&e.__esModule?e:{default:e}}function a(e,n,t,r,i,a,u){try{var o=e[a](u),s=o.value}catch(c){return void t(c)}o.done?n(s):Promise.resolve(s).then(r,i)}function u(e){return function(){var n=this,t=arguments;return new Promise((function(r,i){var u=e.apply(n,t);function o(e){a(u,r,i,o,s,"next",e)}function s(e){a(u,r,i,o,s,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("d697"))}.bind(null,t)).catch(t.oe)},s={data:function(){return{cross:"",ruleForm:{gonghao:"",mima:"",yishengxingming:"",xingbie:"",nianling:"",shoujihaoma:"",zhiwu:"",xiangpian:""},xingbieOptions:[],xingbieIndex:0,zhiwuOptions:[],zhiwuIndex:0,user:{},ro:{gonghao:!1,mima:!1,yishengxingming:!1,xingbie:!1,nianling:!1,shoujihaoma:!1,zhiwu:!1,xiangpian:!1}}},components:{wPicker:o},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(n){var t=this;return u(r.default.mark((function i(){var a,u,o,s;return r.default.wrap((function(i){while(1)switch(i.prev=i.next){case 0:return a=e.getStorageSync("nowTable"),i.next=3,t.$api.session(a);case 3:if(u=i.sent,t.user=u.data,t.xingbieOptions="男,女".split(","),t.zhiwuOptions="专家,主任医师,副主任医师,主治医师".split(","),t.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(t.ruleForm.refid=n.refid,t.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){i.next=15;break}return t.ruleForm.id=n.id,i.next=13,t.$api.info("yisheng",t.ruleForm.id);case 13:u=i.sent,t.ruleForm=u.data;case 15:if(t.cross=n.cross,!n.cross){i.next=55;break}o=e.getStorageSync("crossObj"),i.t0=r.default.keys(o);case 19:if((i.t1=i.t0()).done){i.next=55;break}if(s=i.t1.value,"gonghao"!=s){i.next=25;break}return t.ruleForm.gonghao=o[s],t.ro.gonghao=!0,i.abrupt("continue",19);case 25:if("mima"!=s){i.next=29;break}return t.ruleForm.mima=o[s],t.ro.mima=!0,i.abrupt("continue",19);case 29:if("yishengxingming"!=s){i.next=33;break}return t.ruleForm.yishengxingming=o[s],t.ro.yishengxingming=!0,i.abrupt("continue",19);case 33:if("xingbie"!=s){i.next=37;break}return t.ruleForm.xingbie=o[s],t.ro.xingbie=!0,i.abrupt("continue",19);case 37:if("nianling"!=s){i.next=41;break}return t.ruleForm.nianling=o[s],t.ro.nianling=!0,i.abrupt("continue",19);case 41:if("shoujihaoma"!=s){i.next=45;break}return t.ruleForm.shoujihaoma=o[s],t.ro.shoujihaoma=!0,i.abrupt("continue",19);case 45:if("zhiwu"!=s){i.next=49;break}return t.ruleForm.zhiwu=o[s],t.ro.zhiwu=!0,i.abrupt("continue",19);case 49:if("xiangpian"!=s){i.next=53;break}return t.ruleForm.xiangpian=o[s],t.ro.xiangpian=!0,i.abrupt("continue",19);case 53:i.next=19;break;case 55:t.styleChange();case 56:case"end":return i.stop()}}),i)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},xingbieChange:function(e){this.xingbieIndex=e.target.value,this.ruleForm.xingbie=this.xingbieOptions[this.xingbieIndex]},zhiwuChange:function(e){this.zhiwuIndex=e.target.value,this.ruleForm.zhiwu=this.zhiwuOptions[this.zhiwuIndex]},xiangpianTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.xiangpian="upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return u(r.default.mark((function t(){var i,a,u,o,s,c,l,g,f,m;return r.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(n.ruleForm.gonghao){t.next=3;break}return n.$utils.msg("工号不能为空"),t.abrupt("return");case 3:if(n.ruleForm.mima){t.next=6;break}return n.$utils.msg("密码不能为空"),t.abrupt("return");case 6:if(n.ruleForm.yishengxingming){t.next=9;break}return n.$utils.msg("医生姓名不能为空"),t.abrupt("return");case 9:if(!n.ruleForm.nianling||n.$validate.isIntNumer(n.ruleForm.nianling)){t.next=12;break}return n.$utils.msg("年龄应输入整数"),t.abrupt("return");case 12:if(!n.ruleForm.shoujihaoma||n.$validate.isMobile(n.ruleForm.shoujihaoma)){t.next=15;break}return n.$utils.msg("手机号码应输入手机格式"),t.abrupt("return");case 15:if(!n.cross){t.next=31;break}if(o=e.getStorageSync("statusColumnName"),s=e.getStorageSync("statusColumnValue"),""==o){t.next=31;break}if(c=e.getStorageSync("crossObj"),o.startsWith("[")){t.next=27;break}for(l in c)l==o&&(c[l]=s);return g=e.getStorageSync("crossTable"),t.next=25,n.$api.update("".concat(g),c);case 25:t.next=31;break;case 27:i=Number(e.getStorageSync("userid")),a=c["id"],u=e.getStorageSync("statusColumnName"),u=u.replace(/\[/,"").replace(/\]/,"");case 31:if(!a||!i){t.next=53;break}return n.ruleForm.crossuserid=i,n.ruleForm.crossrefid=a,f={page:1,limit:10,crossuserid:i,crossrefid:a},t.next=37,n.$api.list("yisheng",f);case 37:if(m=t.sent,!(m.data.total>=u)){t.next=43;break}return n.$utils.msg(e.getStorageSync("tips")),t.abrupt("return",!1);case 43:if(!n.ruleForm.id){t.next=48;break}return t.next=46,n.$api.update("yisheng",n.ruleForm);case 46:t.next=50;break;case 48:return t.next=50,n.$api.add("yisheng",n.ruleForm);case 50:n.$utils.msgBack("提交成功");case 51:t.next=61;break;case 53:if(!n.ruleForm.id){t.next=58;break}return t.next=56,n.$api.update("yisheng",n.ruleForm);case 56:t.next=60;break;case 58:return t.next=60,n.$api.add("yisheng",n.ruleForm);case 60:n.$utils.msgBack("提交成功");case 61:case"end":return t.stop()}}),t)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,t=n.getFullYear(),r=n.getMonth()+1,i=n.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),r=r>9?r:"0"+r,i=i>9?i:"0"+i,"".concat(t,"-").concat(r,"-").concat(i)},toggleTab:function(e){this.$refs[e].show()}}};n.default=s}).call(this,t("543d")["default"])},"83ff":function(e,n,t){"use strict";(function(e){t("5ee9");r(t("66fd"));var n=r(t("e0e7"));function r(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])},9503:function(e,n,t){"use strict";var r=t("c82a"),i=t.n(r);i.a},"9a0d":function(e,n,t){"use strict";t.r(n);var r=t("6538"),i=t.n(r);for(var a in r)"default"!==a&&function(e){t.d(n,e,(function(){return r[e]}))}(a);n["default"]=i.a},c82a:function(e,n,t){},e0e7:function(e,n,t){"use strict";t.r(n);var r=t("fd73"),i=t("9a0d");for(var a in i)"default"!==a&&function(e){t.d(n,e,(function(){return i[e]}))}(a);t("9503");var u,o=t("f0c5"),s=Object(o["a"])(i["default"],r["b"],r["c"],!1,null,"6ea0c602",null,!1,r["a"],u);n["default"]=s.exports},fd73:function(e,n,t){"use strict";var r;t.d(n,"b",(function(){return i})),t.d(n,"c",(function(){return a})),t.d(n,"a",(function(){return r}));var i=function(){var e=this,n=e.$createElement;e._self._c},a=[]}},[["83ff","common/runtime","common/vendor"]]]);