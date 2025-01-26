<template>
<div :style='{"width":"90%","padding":"30px 0px 40px","margin":"10px auto","position":"relative","background":"rgba(255,255,255,.0)"}'>
    <el-form
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="120px"
    >
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="科室编号" prop="keshibianhao">
            <el-input v-model="ruleForm.keshibianhao" 
                placeholder="科室编号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}'  label="科室" prop="keshi">
            <el-select v-model="ruleForm.keshi" placeholder="请选择科室" >
              <el-option
                  v-for="(item,index) in keshiOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="科室封面" prop="keshifengmian">
            <file-upload
            tip="点击上传科室封面"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.keshifengmian?ruleForm.keshifengmian:''"
            @change="keshifengmianUploadChange"
            ></file-upload>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="医生工号" prop="yishenggonghao">
            <el-select  @change="yishenggonghaoChange" v-model="ruleForm.yishenggonghao" placeholder="请选择医生工号">
              <el-option
                  v-for="(item,index) in yishenggonghaoOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="医生姓名" prop="yishengxingming">
            <el-input v-model="ruleForm.yishengxingming" 
                placeholder="医生姓名" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="服务时间" prop="fuwushijian">
            <el-input v-model="ruleForm.fuwushijian" 
                placeholder="服务时间" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="挂号费" prop="guahaofei">
            <el-input v-model="ruleForm.guahaofei" 
                placeholder="挂号费" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="科室简介" prop="keshijianjie">
            <editor 
                :style='{"border":"1px solid #d2e5fd","minHeight":"300px","padding":"0","margin":"0","backgroundColor":"#fff","borderRadius":"0","width":"100%","height":"auto"}'
                v-model="ruleForm.keshijianjie" 
                class="editor" 
                action="file/upload">
            </editor>
          </el-form-item>

      <el-form-item :style='{"padding":"0","textAlign":"center","margin":"0"}'>
        <el-button :style='{"border":"5px outset #6eb9ff","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"#333","borderRadius":"4px","background":"#fff","width":"128px","lineHeight":"40px","fontSize":"14px","height":"46px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"5px outset #d1d1d1","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#333","borderRadius":"4px","background":"rgba(255, 255, 255, 1)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"46px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
      return {
        id: '',
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          keshibianhao: '',
          keshi: '',
          keshifengmian: '',
          yishenggonghao: '',
          yishengxingming: '',
          fuwushijian: '',
          guahaofei: '',
          keshijianjie: '',
        },
        keshiOptions: [],
        yishenggonghaoOptions: [],
        rules: {
          keshibianhao: [
            { required: true, message: '科室编号不能为空', trigger: 'blur' },
          ],
          keshi: [
            { required: true, message: '科室不能为空', trigger: 'blur' },
          ],
          keshifengmian: [
          ],
          yishenggonghao: [
          ],
          yishengxingming: [
          ],
          fuwushijian: [
          ],
          guahaofei: [
            { required: true, message: '挂号费不能为空', trigger: 'blur' },
          ],
          keshijianjie: [
          ],
        },
      };
    },
    computed: {



    },
    created() {
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='keshibianhao'){
              this.ruleForm.keshibianhao = obj[o];
              continue;
            }
            if(o=='keshi'){
              this.ruleForm.keshi = obj[o];
              continue;
            }
            if(o=='keshifengmian'){
              this.ruleForm.keshifengmian = obj[o].split(",")[0];
              continue;
            }
            if(o=='yishenggonghao'){
              this.ruleForm.yishenggonghao = obj[o];
              continue;
            }
            if(o=='yishengxingming'){
              this.ruleForm.yishengxingming = obj[o];
              continue;
            }
            if(o=='fuwushijian'){
              this.ruleForm.fuwushijian = obj[o];
              continue;
            }
            if(o=='guahaofei'){
              this.ruleForm.guahaofei = obj[o];
              continue;
            }
            if(o=='keshijianjie'){
              this.ruleForm.keshijianjie = obj[o];
              continue;
            }
          }
        }
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
          }
        });
        this.$http.get('option/keshi/keshi', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.keshiOptions = res.data.data;
          }
        });
        this.$http.get('option/yisheng/yishenggonghao', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.yishenggonghaoOptions = res.data.data;
          }
        });
      },
      // 下二随
      yishenggonghaoChange () {
        this.$http.get('follow/yisheng/yishenggonghao?columnValue=' + this.ruleForm.yishenggonghao, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            if(res.data.data.yishengxingming){
              this.ruleForm.yishengxingming = res.data.data.yishengxingming
            }
          }
        });
      },

    // 多级联动参数
      // 多级联动参数
      info(id) {
        this.$http.get('keshixinxi/detail/${id}', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

        //更新跨表属性
        var crossuserid;
        var crossrefid;
        var crossoptnum;
        this.$refs["ruleForm"].validate(valid => {
          if(valid) {
            if(this.type=='cross'){
                 var statusColumnName = localStorage.getItem('statusColumnName');
                 var statusColumnValue = localStorage.getItem('statusColumnValue');
                 if(statusColumnName && statusColumnName!='') {
                     var obj = JSON.parse(localStorage.getItem('crossObj'));
                     if(!statusColumnName.startsWith("[")) {
                         for (var o in obj){
                             if(o==statusColumnName){
                                 obj[o] = statusColumnValue;
                             }
                         }
                         var table = localStorage.getItem('crossTable');
                         this.$http.post(table+'/update', obj).then(res => {});
                     } else {
                            crossuserid=Number(localStorage.getItem('userid'));
                            crossrefid=obj['id'];
                            crossoptnum=localStorage.getItem('statusColumnName');
                            crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                     }
                 }
            }
            if(crossrefid && crossuserid) {
                 this.ruleForm.crossuserid=crossuserid;
                 this.ruleForm.crossrefid=crossrefid;
                 var params = {
                     page: 1,
                     limit: 10,
                     crossuserid:crossuserid,
                     crossrefid:crossrefid,
                 }
                 this.$http.get('keshixinxi/list', {
                  params: params
                 }).then(res => {
                     if(res.data.data.total>=crossoptnum) {
                         this.$message({
                          message: localStorage.getItem('tips'),
                          type: 'success',
                          duration: 1500,
                         });
                          return false;
                     } else {
                         // 跨表计算


                          this.$http.post('keshixinxi/add', this.ruleForm).then(res => {
                              if (res.data.code == 0) {
                                  this.$message({
                                      message: '操作成功',
                                      type: 'success',
                                      duration: 1500,
                                      onClose: () => {
                                          this.$router.go(-1);
                                      }
                                  });
                              } else {
                                  this.$message({
                                      message: res.data.msg,
                                      type: 'error',
                                      duration: 1500
                                  });
                              }
                          });
                     }
                 });
             } else {


                  this.$http.post('keshixinxi/add', this.ruleForm).then(res => {
                     if (res.data.code == 0) {
                          this.$message({
                              message: '操作成功',
                              type: 'success',
                              duration: 1500,
                              onClose: () => {
                                  this.$router.go(-1);
                              }
                          });
                      } else {
                          this.$message({
                              message: res.data.msg,
                              type: 'error',
                              duration: 1500
                          });
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
        this.$router.go(-1);
      },
      keshifengmianUploadChange(fileUrls) {
          this.ruleForm.keshifengmian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #3d74c0;
	  font-weight: 500;
	  width: 120px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 120px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 1px solid #d2e5fd;
	  border-radius: 4px;
	  padding: 0 12px;
	  outline: none;
	  color: #333;
	  width: 400px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 1px solid #d2e5fd;
	  border-radius: 4px;
	  padding: 0 10px;
	  outline: none;
	  color: #333;
	  width: 200px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border: 1px solid #d2e5fd;
	  border-radius: 4px;
	  padding: 0 10px 0 30px;
	  outline: none;
	  color: #333;
	  width: 200px;
	  font-size: 14px;
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
	  border: 1px solid #d2e5fd;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #ddd;
	  background: #fff;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  border: 1px solid #d2e5fd;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #ddd;
	  background: #fff;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  border: 1px solid #d2e5fd;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #ddd;
	  background: #fff;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #d2e5fd;
	  border-radius: 4px;
	  padding: 12px;
	  outline: none;
	  color: #333;
	  width: 400px;
	  font-size: 14px;
	  height: 120px;
	}
</style>
