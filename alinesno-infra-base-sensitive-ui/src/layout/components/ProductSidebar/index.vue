<template>
  <div class="siderbar">
    <el-menu default-active="1" class="el-menu-vertical" :collapse="isCollapse" @open="handleOpen" @close="handleClose">
      <el-menu-item index="1" @click="jumpTo">
        <i class="fa-solid fa-desktop"></i>
      </el-menu-item>

      <el-tooltip effect="dark" :content="item.desc" v-for="item in menuItems" :key="item.id" placement="right">
          <el-menu-item :index="item.id" @click="openServiceList(item.link)">
            <i :class="item.icon"></i>
          </el-menu-item>
      </el-tooltip>

    </el-menu>
  
  </div>
</template>

<script setup>

const router = useRouter();

// 菜单列表
const menuItems = ref([
  {id:'2' , icon:'fa-brands fa-slack' , link:'/base/sensitive/application/index' , desc:'应用管理'},
  {id:'3' , icon:'fa-solid fa-list-check' , link:'/base/sensitive/word/index' , desc:'词库管理'},
  {id:'4' , icon:'fa-solid fa-at' , link:'/base/sensitive/config/index' , desc:'自定义敏感词'},
  {id:'9' , icon:'fa-solid fa-list-check' , link:'/base/sensitive/analyse/index' , desc:'统计分析'},
  {id:'7' , icon:'fa-solid fa-user-shield' , link:'/base/sensitive/filter/index' , desc:'过滤配置'},
  {id:'8' , icon:'fa-solid fa-file-word' , link:'/base/sensitive/record/index' , desc:'请求日志'}, 
]);

// 打开服务市场
function openServiceList(_path) {
  router.push({ path: _path });
}

// 打开首页
function jumpTo() {
  router.push({ path: "/index" });
}

// 打开智能客服
function openSmartService() {
  router.push({ path: "/dashboard/smartService" });
}

</script>

<style lang="scss" scoped>
.el-menu-vertical:not(.el-menu--collapse) {
  width: 65px;
}

.acp-suggest {
  bottom: 20px;
  position: absolute;
}

.siderbar {
  float: left;
  height: 100%;
  width: 64px;
  border-right: 1px solid #e6e6e6;
  padding-top: 40px;
  overflow: hidden;
  background-color: #fff;
  position: fixed;
}
</style>