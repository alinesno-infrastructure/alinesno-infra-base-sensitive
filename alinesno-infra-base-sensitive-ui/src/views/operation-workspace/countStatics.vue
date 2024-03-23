<template>
    <div>
        <el-row class="acp-dashboard-panel" :gutter="20">

            <el-col class="panel-col" :span="19">
                <div class="grid-content">
                    <div class="panel-header">
                        <div class="header-title"><i class="fa-solid fa-link"></i> 最新运行统计</div>
                    </div>
                    <div class="panel-body acp-height-auto">

                        <div class="count-box">
                            <ul>
                                <li class="count-box-item aip-item-count" style="width:calc(20% - 15px)" v-for="item in 5" :key="item">
                                    <div class="count-box-item-title">运行中</div>
                                    <div class="count-box-item-number">280</div>
                                </li>
                            </ul>
                        </div>

                    </div>
                </div>
            </el-col>
            <el-col class="panel-col" :span="5">
                <div class="grid-content">
                    <div class="panel-header">
                        <div class="header-title"><i class="fa-solid fa-link"></i> 最新运行统计</div>
                    </div>
                    <div class="panel-body acp-height-auto">

                        <div class="count-box">
                            <ul>
                                <li class="count-box-item aip-item-count" style="width:calc(50% - 15px)" v-for="item in 2" :key="item">
                                    <div class="count-box-item-title">运行中</div>
                                    <div class="count-box-item-number">280</div>
                                </li>
                            </ul>
                        </div>

                    </div>
                </div>
            </el-col>


        </el-row>

    </div>
</template>