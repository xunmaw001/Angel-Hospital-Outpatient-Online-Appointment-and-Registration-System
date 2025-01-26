<template>
	<div class="addEdit-block" style="width: 100%;">
		<el-form
			:style='{"padding":"30px 15px","boxShadow":"0 0px 0px #999","borderRadius":"0px","flexWrap":"wrap","background":"none","display":"flex","justifyContent":"space-between"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="120px"
		>
			<template >
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-if="type!='info'" label="病历编号" prop="binglibianhao">
					<el-input v-model="ruleForm.binglibianhao" placeholder="病历编号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-else-if="ruleForm.binglibianhao" label="病历编号" prop="binglibianhao">
					<el-input v-model="ruleForm.binglibianhao" placeholder="病历编号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="患者账号" prop="huanzhezhanghao">
					<el-input v-model="ruleForm.huanzhezhanghao" placeholder="患者账号" clearable  :readonly="ro.huanzhezhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else class="input" label="患者账号" prop="huanzhezhanghao">
					<el-input v-model="ruleForm.huanzhezhanghao" placeholder="患者账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="患者姓名" prop="huanzhexingming">
					<el-input v-model="ruleForm.huanzhexingming" placeholder="患者姓名" clearable  :readonly="ro.huanzhexingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else class="input" label="患者姓名" prop="huanzhexingming">
					<el-input v-model="ruleForm.huanzhexingming" placeholder="患者姓名" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="科室" prop="keshi">
					<el-input v-model="ruleForm.keshi" placeholder="科室" clearable  :readonly="ro.keshi"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else class="input" label="科室" prop="keshi">
					<el-input v-model="ruleForm.keshi" placeholder="科室" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="主诉" prop="zhusu">
					<el-input v-model="ruleForm.zhusu" placeholder="主诉" clearable  :readonly="ro.zhusu"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else class="input" label="主诉" prop="zhusu">
					<el-input v-model="ruleForm.zhusu" placeholder="主诉" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="现病史" prop="xianbingshi">
					<el-input v-model="ruleForm.xianbingshi" placeholder="现病史" clearable  :readonly="ro.xianbingshi"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else class="input" label="现病史" prop="xianbingshi">
					<el-input v-model="ruleForm.xianbingshi" placeholder="现病史" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="既往史" prop="jiwangshi">
					<el-input v-model="ruleForm.jiwangshi" placeholder="既往史" clearable  :readonly="ro.jiwangshi"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else class="input" label="既往史" prop="jiwangshi">
					<el-input v-model="ruleForm.jiwangshi" placeholder="既往史" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="药敏史" prop="yaominshi">
					<el-input v-model="ruleForm.yaominshi" placeholder="药敏史" clearable  :readonly="ro.yaominshi"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else class="input" label="药敏史" prop="yaominshi">
					<el-input v-model="ruleForm.yaominshi" placeholder="药敏史" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="医生工号" prop="yishenggonghao">
					<el-input v-model="ruleForm.yishenggonghao" placeholder="医生工号" clearable  :readonly="ro.yishenggonghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else class="input" label="医生工号" prop="yishenggonghao">
					<el-input v-model="ruleForm.yishenggonghao" placeholder="医生工号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="医生姓名" prop="yishengxingming">
					<el-input v-model="ruleForm.yishengxingming" placeholder="医生姓名" clearable  :readonly="ro.yishengxingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else class="input" label="医生姓名" prop="yishengxingming">
					<el-input v-model="ruleForm.yishengxingming" placeholder="医生姓名" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="date" v-if="type!='info'" label="登记时间" prop="dengjishijian">
					<el-date-picker
						value-format="yyyy-MM-dd HH:mm:ss"
						v-model="ruleForm.dengjishijian" 
						type="datetime"
						:readonly="ro.dengjishijian"
						placeholder="登记时间"
					></el-date-picker>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-else-if="ruleForm.dengjishijian" label="登记时间" prop="dengjishijian">
					<el-input v-model="ruleForm.dengjishijian" placeholder="登记时间" readonly></el-input>
				</el-form-item>
			</template>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="textarea" v-if="type!='info'" label="诊断" prop="zhenduan">
					<el-input
					  style="min-width: 200px; max-width: 600px;"
					  type="textarea"
					  :rows="8"
					  placeholder="诊断"
					  v-model="ruleForm.zhenduan" >
					</el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else-if="ruleForm.zhenduan" label="诊断" prop="zhenduan">
					<span :style='{"fontSize":"14px","lineHeight":"40px","color":"#333","fontWeight":"500","display":"inline-block"}'>{{ruleForm.zhenduan}}</span>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="textarea" v-if="type!='info'" label="治疗方案" prop="zhiliaofangan">
					<el-input
					  style="min-width: 200px; max-width: 600px;"
					  type="textarea"
					  :rows="8"
					  placeholder="治疗方案"
					  v-model="ruleForm.zhiliaofangan" >
					</el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else-if="ruleForm.zhiliaofangan" label="治疗方案" prop="zhiliaofangan">
					<span :style='{"fontSize":"14px","lineHeight":"40px","color":"#333","fontWeight":"500","display":"inline-block"}'>{{ruleForm.zhiliaofangan}}</span>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="textarea" v-if="type!='info'" label="医嘱" prop="yizhu">
					<el-input
					  style="min-width: 200px; max-width: 600px;"
					  type="textarea"
					  :rows="8"
					  placeholder="医嘱"
					  v-model="ruleForm.yizhu" >
					</el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else-if="ruleForm.yizhu" label="医嘱" prop="yizhu">
					<span :style='{"fontSize":"14px","lineHeight":"40px","color":"#333","fontWeight":"500","display":"inline-block"}'>{{ruleForm.yizhu}}</span>
				</el-form-item>
			<el-form-item :style='{"padding":"0","margin":"20px 0 0"}' class="btn">
				<el-button :style='{"cursor":"pointer","padding":"0 30px","margin":"0 20px 0 0","borderColor":"#1fbfae","color":"#1fbfae","outline":"none","borderRadius":"0px","background":"#e9faf8","borderWidth":"4px","width":"auto","lineHeight":"40px","fontSize":"14px","borderStyle":"solid double solid double","height":"44px"}'  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
				<el-button :style='{"cursor":"pointer","padding":"0 24px","margin":"0","borderColor":"#dc333b","color":"#dc333b","outline":"none","borderRadius":"0px","background":"#fbeced","borderWidth":"4px","width":"auto","lineHeight":"40px","fontSize":"14px","borderStyle":"solid double solid double","height":"44px"}' v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
				<el-button :style='{"cursor":"pointer","padding":"0 24px","margin":"0","borderColor":"#dc333b","color":"#dc333b","outline":"none","borderRadius":"0px","background":"#fbeced","borderWidth":"4px","width":"auto","lineHeight":"40px","fontSize":"14px","borderStyle":"solid double solid double","height":"44px"}' v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
	data() {
		let self = this
		var validateIdCard = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!checkIdCard(value)) {
				callback(new Error("请输入正确的身份证号码"));
			} else {
				callback();
			}
		};
		var validateUrl = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isURL(value)) {
				callback(new Error("请输入正确的URL地址"));
			} else {
				callback();
			}
		};
		var validateMobile = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isMobile(value)) {
				callback(new Error("请输入正确的手机号码"));
			} else {
				callback();
			}
		};
		var validatePhone = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isPhone(value)) {
				callback(new Error("请输入正确的电话号码"));
			} else {
				callback();
			}
		};
		var validateEmail = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isEmail(value)) {
				callback(new Error("请输入正确的邮箱地址"));
			} else {
				callback();
			}
		};
		var validateNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isNumber(value)) {
				callback(new Error("请输入数字"));
			} else {
				callback();
			}
		};
		var validateIntNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isIntNumer(value)) {
				callback(new Error("请输入整数"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				binglibianhao : false,
				huanzhezhanghao : false,
				huanzhexingming : false,
				keshi : false,
				zhusu : false,
				xianbingshi : false,
				jiwangshi : false,
				yaominshi : false,
				zhenduan : false,
				zhiliaofangan : false,
				yizhu : false,
				yishenggonghao : false,
				yishengxingming : false,
				dengjishijian : false,
			},
			
			
			ruleForm: {
				binglibianhao: this.getUUID(),
				huanzhezhanghao: '',
				huanzhexingming: '',
				keshi: '',
				zhusu: '',
				xianbingshi: '',
				jiwangshi: '',
				yaominshi: '',
				zhenduan: '',
				zhiliaofangan: '',
				yizhu: '',
				yishenggonghao: '',
				yishengxingming: '',
				dengjishijian: '',
			},
		
			
			rules: {
				binglibianhao: [
				],
				huanzhezhanghao: [
				],
				huanzhexingming: [
				],
				keshi: [
				],
				zhusu: [
				],
				xianbingshi: [
				],
				jiwangshi: [
				],
				yaominshi: [
				],
				zhenduan: [
				],
				zhiliaofangan: [
				],
				yizhu: [
				],
				yishenggonghao: [
				],
				yishengxingming: [
				],
				dengjishijian: [
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
	created() {
		this.ruleForm.dengjishijian = this.getCurDateTime()
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
				for (var o in obj){
						if(o=='binglibianhao'){
							this.ruleForm.binglibianhao = obj[o];
							this.ro.binglibianhao = true;
							continue;
						}
						if(o=='huanzhezhanghao'){
							this.ruleForm.huanzhezhanghao = obj[o];
							this.ro.huanzhezhanghao = true;
							continue;
						}
						if(o=='huanzhexingming'){
							this.ruleForm.huanzhexingming = obj[o];
							this.ro.huanzhexingming = true;
							continue;
						}
						if(o=='keshi'){
							this.ruleForm.keshi = obj[o];
							this.ro.keshi = true;
							continue;
						}
						if(o=='zhusu'){
							this.ruleForm.zhusu = obj[o];
							this.ro.zhusu = true;
							continue;
						}
						if(o=='xianbingshi'){
							this.ruleForm.xianbingshi = obj[o];
							this.ro.xianbingshi = true;
							continue;
						}
						if(o=='jiwangshi'){
							this.ruleForm.jiwangshi = obj[o];
							this.ro.jiwangshi = true;
							continue;
						}
						if(o=='yaominshi'){
							this.ruleForm.yaominshi = obj[o];
							this.ro.yaominshi = true;
							continue;
						}
						if(o=='zhenduan'){
							this.ruleForm.zhenduan = obj[o];
							this.ro.zhenduan = true;
							continue;
						}
						if(o=='zhiliaofangan'){
							this.ruleForm.zhiliaofangan = obj[o];
							this.ro.zhiliaofangan = true;
							continue;
						}
						if(o=='yizhu'){
							this.ruleForm.yizhu = obj[o];
							this.ro.yizhu = true;
							continue;
						}
						if(o=='yishenggonghao'){
							this.ruleForm.yishenggonghao = obj[o];
							this.ro.yishenggonghao = true;
							continue;
						}
						if(o=='yishengxingming'){
							this.ruleForm.yishengxingming = obj[o];
							this.ro.yishengxingming = true;
							continue;
						}
						if(o=='dengjishijian'){
							this.ruleForm.dengjishijian = obj[o];
							this.ro.dengjishijian = true;
							continue;
						}
				}
				














			}
			
			
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					
					var json = data.data;
					if(json.keshi!=''&&json.keshi && this.$storage.get("role")!="管理员"){
						this.ruleForm.keshi = json.keshi
						this.ro.keshi = true;
					}
					if(json.yishenggonghao!=''&&json.yishenggonghao && this.$storage.get("role")!="管理员"){
						this.ruleForm.yishenggonghao = json.yishenggonghao
						this.ro.yishenggonghao = true;
					}
					if(json.yishengxingming!=''&&json.yishengxingming && this.$storage.get("role")!="管理员"){
						this.ruleForm.yishengxingming = json.yishengxingming
						this.ro.yishengxingming = true;
					}
				} else {
					this.$message.error(data.msg);
				}
			});
			
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `binglidengji/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {





























var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "binglidengji/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `binglidengji/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.binglidengjiCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `binglidengji/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.binglidengjiCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.binglidengjiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  text-shadow: 0 1px 10px #fff;
	  	  color: #666;
	  	  background: none;
	  	  font-weight: 500;
	  	  display: block;
	  	  width: 120px;
	  	  font-size: 14px;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 120px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border-radius: 0px;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px #4b681d;
	  	  outline: none;
	  	  color: #666;
	  	  background: #fff;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  border-color: #2adbcb;
	  	  border-width: 4px;
	  	  border-style: solid double solid double;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border-radius: 0px;
	  	  padding: 0 10px;
	  	  box-shadow: 0 0 0px #4b681d;
	  	  outline: none;
	  	  color: #666;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  border-color: #2adbcb;
	  	  border-width: 4px;
	  	  border-style: solid double solid double;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 0px solid #333;
	  	  border-radius: 0px;
	  	  padding: 0 10px 0 30px;
	  	  box-shadow: 0 0 0px #4b681d;
	  	  outline: none;
	  	  color: #666;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  border-color: #2adbcb;
	  	  border-width: 4px;
	  	  border-style: solid double solid double;
	  	  height: 40px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  	  border: 2px solid #ddd;
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: #2adbcb;
	  	  width: 200px;
	  	  font-size: 32px;
	  	  border-color: #2adbcb;
	  	  border-width: 4px;
	  	  line-height: 90px;
	  	  border-style: solid double solid double;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 2px solid #ddd;
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: #2adbcb;
	  	  width: 200px;
	  	  font-size: 32px;
	  	  border-color: #2adbcb;
	  	  border-width: 4px;
	  	  line-height: 90px;
	  	  border-style: solid double solid double;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 2px solid #ddd;
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: #2adbcb;
	  	  width: 200px;
	  	  font-size: 32px;
	  	  border-color: #2adbcb;
	  	  border-width: 4px;
	  	  line-height: 90px;
	  	  border-style: solid double solid double;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border-radius: 0px;
	  	  padding: 12px;
	  	  box-shadow: 0 0 0px #4b681d;
	  	  outline: none;
	  	  color: #666;
	  	  width: 500px;
	  	  font-size: 14px;
	  	  min-height: 120px;
	  	  border-color: #2adbcb;
	  	  border-width: 4px;
	  	  border-style: solid double solid double;
	  	  height: auto;
	  	}
</style>
