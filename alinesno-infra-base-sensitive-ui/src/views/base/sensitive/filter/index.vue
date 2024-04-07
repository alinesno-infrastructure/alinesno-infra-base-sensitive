<template>
   <div class="app-container">
     <div class="label-title">
       <div class="tip">敏感词过滤系统配置</div>
       <div class="sub-tip">根据需求自定义敏感词过滤系统设置</div>
     </div>
     <div class="form-container">
       <el-form
         :model="form"
         :rules="rules"
         v-loading="loading"
         ref="form"
         label-width="180px"
         class="demo-form"
       >
 
         <el-form-item label="词对应的标签">
           <el-input v-model="form.wordTag"></el-input>
         </el-form-item>
 
         <el-form-item label="忽略的字符">
           <el-input v-model="form.charIgnore"></el-input>
         </el-form-item>
 
         <el-form-item label="忽略大小写">
           <el-switch v-model="form.ignoreCase"></el-switch>
         </el-form-item>
 
         <el-form-item label="忽略半角圆角">
           <el-switch v-model="form.ignoreWidth"></el-switch>
         </el-form-item>
 
         <el-form-item label="忽略数字的写法">
           <el-switch v-model="form.ignoreNumStyle"></el-switch>
         </el-form-item>
 
         <el-form-item label="忽略中文的书写格式">
           <el-switch v-model="form.ignoreChineseStyle"></el-switch>
         </el-form-item>
 
         <el-form-item label="忽略英文的书写格式">
           <el-switch v-model="form.ignoreEnglishStyle"></el-switch>
         </el-form-item>
 
         <el-form-item label="忽略重复词">
           <el-switch v-model="form.ignoreRepeat"></el-switch>
         </el-form-item>
 
         <el-form-item label="是否启用数字检测">
           <el-switch v-model="form.enableNumCheck"></el-switch>
         </el-form-item>
 
         <el-form-item label="是否启用邮箱检测">
           <el-switch v-model="form.enableEmailCheck"></el-switch>
         </el-form-item>
 
         <el-form-item label="是否启用链接检测">
           <el-switch v-model="form.enableUrlCheck"></el-switch>
         </el-form-item>
 
         <el-form-item label="是否启用敏感单词检测">
           <el-switch v-model="form.enableWordCheck"></el-switch>
         </el-form-item>
 
         <el-form-item label="数字检测，自定义指定长度">
           <el-input-number v-model="form.numCheckLen"></el-input-number>
         </el-form-item>
 
         <el-form-item label="针对匹配的敏感词额外加工">
           <el-switch v-model="form.wordResultCondition"></el-switch>
         </el-form-item>
 
         <el-form-item>
           <el-button type="primary" @click="submitForm('form')">保存</el-button>
           <el-button @click="resetForm">重置</el-button>
         </el-form-item>
       </el-form>
     </div>
   </div>
 </template>
 
 <script>
 export default {
   data() {
     return {
       form: {
         ignoreCase: true,
         ignoreWidth: true,
         ignoreNumStyle: true,
         ignoreChineseStyle: true,
         ignoreEnglishStyle: true,
         ignoreRepeat: false,
         enableNumCheck: true,
         enableEmailCheck: true,
         enableUrlCheck: true,
         enableWordCheck: true,
         numCheckLen: 8,
         wordTag: "none",
         charIgnore: "none",
         wordResultCondition: true
       },
       rules: {
         // 表单验证规则，根据需要添加
       },
       loading: false
     };
   },
   methods: {
     submitForm(formName) {
       this.$refs[formName].validate((valid) => {
         if (valid) {
           // 提交表单逻辑
         }
       });
     },
     resetForm() {
       this.$refs["form"].resetFields();
     }
   }
 };
 </script>
 
 <style scoped>
 .app-container {
   max-width: 960px;
   margin: 20px auto;
 }
 
 .label-title {
   text-align: center;
   margin: 10px auto;
 }
 
 .tip {
   font-size: 26px;
   font-weight: bold;
 }
 
 .sub-tip {
   font-size: 13px;
   text-align: center;
   padding: 10px;
 }
 
 .form-container {
   margin-top: 20px;
 }
 
 .demo-form {
   /* 自定义表单样式 */
 }
 </style>
 